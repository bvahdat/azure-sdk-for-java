// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs;

import com.azure.core.amqp.implementation.MessageSerializer;
import com.azure.core.util.BinaryData;
import org.apache.qpid.proton.Proton;
import org.apache.qpid.proton.amqp.Binary;
import org.apache.qpid.proton.amqp.Symbol;
import org.apache.qpid.proton.amqp.messaging.ApplicationProperties;
import org.apache.qpid.proton.amqp.messaging.Data;
import org.apache.qpid.proton.amqp.messaging.MessageAnnotations;
import org.apache.qpid.proton.message.Message;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static com.azure.core.amqp.AmqpMessageConstant.ENQUEUED_TIME_UTC_ANNOTATION_NAME;
import static com.azure.core.amqp.AmqpMessageConstant.OFFSET_ANNOTATION_NAME;
import static com.azure.core.amqp.AmqpMessageConstant.PARTITION_KEY_ANNOTATION_NAME;
import static com.azure.core.amqp.AmqpMessageConstant.SEQUENCE_NUMBER_ANNOTATION_NAME;
import static com.azure.messaging.eventhubs.TestUtils.ENQUEUED_TIME;
import static com.azure.messaging.eventhubs.TestUtils.OFFSET;
import static com.azure.messaging.eventhubs.TestUtils.PARTITION_KEY;
import static java.nio.charset.StandardCharsets.UTF_8;
import static org.apache.qpid.proton.amqp.Symbol.getSymbol;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EventDataTest {
    // Create a giant payload with 10000 characters that are "a".
    private static final String PAYLOAD = new String(new char[10000]).replace("\0", "a");
    private static final byte[] PAYLOAD_BYTES = PAYLOAD.getBytes(UTF_8);
    private static final MessageSerializer MESSAGE_SERIALIZER = new EventHubMessageSerializer();

    @Test
    public void byteArrayNotNull() {
        assertThrows(NullPointerException.class, () -> new EventData((byte[]) null));
    }

    @Test
    public void byteBufferNotNull() {
        assertThrows(NullPointerException.class, () -> new EventData((ByteBuffer) null));
    }

    @Test
    public void eventPropertiesShouldNotBeNull() {
        // Act
        final EventData eventData = new EventData("Test".getBytes());

        // Assert
        Assertions.assertNotNull(eventData.getSystemProperties());
        Assertions.assertNotNull(eventData.getBody());
        Assertions.assertNotNull(eventData.getProperties());
    }

    /**
     * Verify that we can create an EventData with an empty byte array.
     */
    @Test
    public void canCreateWithEmptyArray() {
        // Arrange
        byte[] byteArray = new byte[0];

        // Act
        final EventData eventData = new EventData(byteArray);

        // Assert
        final byte[] actual = eventData.getBody();
        Assertions.assertNotNull(actual);
        Assertions.assertEquals(0, actual.length);
    }

    /**
     * Verify that we can create an EventData with the correct body contents.
     */
    @Test
    public void canCreateWithPayload() {
        // Act
        final EventData eventData = new EventData(PAYLOAD_BYTES);

        // Assert
        Assertions.assertNotNull(eventData.getBody());
        Assertions.assertEquals(PAYLOAD, new String(eventData.getBody(), UTF_8));

        // These ones are never set.
        Assertions.assertNull(eventData.getContentType());
        Assertions.assertNull(eventData.getCorrelationId());
        Assertions.assertNull(eventData.getMessageId());
    }

    /**
     * Tests that the system properties are properly populated. In addition, partition key is removed because it is not
     * a system property.
     */
    @Test
    public void testSystemProperties() {
        // Act
        final long sequenceNumber = 5L;
        final HashMap<Symbol, Object> properties = new HashMap<>();
        properties.put(getSymbol(SEQUENCE_NUMBER_ANNOTATION_NAME.getValue()), sequenceNumber);
        properties.put(getSymbol(OFFSET_ANNOTATION_NAME.getValue()), String.valueOf(OFFSET));
        properties.put(getSymbol(PARTITION_KEY_ANNOTATION_NAME.getValue()), PARTITION_KEY);
        properties.put(getSymbol(ENQUEUED_TIME_UTC_ANNOTATION_NAME.getValue()), Date.from(ENQUEUED_TIME));

        final Map<String, Object> myCustomProperties = new HashMap<>();

        // Primitive types
        myCustomProperties.put("boolean", true);
        myCustomProperties.put("byte", 127);
        myCustomProperties.put("short", 91);
        myCustomProperties.put("int", 456345324);
        myCustomProperties.put("long", 342342314l);
        myCustomProperties.put("float", 113453452343287674564352342342340.5434f);
        myCustomProperties.put("double", 1549089082349898749835634535352346575671.0567d);
        myCustomProperties.put("char", 'Q');

        // Array
        myCustomProperties.put("boolean[]", new boolean[]{true, false, false, true, true});
        myCustomProperties.put("byte[]", new byte[]{34, 11, 90});
        myCustomProperties.put("short[]", new short[]{Short.MIN_VALUE, Short.MAX_VALUE});
        myCustomProperties.put("int[]", new int[]{5, 213453453, 90, 11});
        myCustomProperties.put("long[]", new long[]{234234l, 87675l, 12312312l});
        myCustomProperties.put("float[]", new float[]{4324.82f, 7554.12f, 110.5434f});
        myCustomProperties.put("double[]", new double[]{34.56d, 91.45d, 11.0567d});
        myCustomProperties.put("char[]", new char[]{'T', 'x', 'Q', 'p'});

        // ByteBuffer
        myCustomProperties.put("ByteBuffer", ByteBuffer.wrap(new byte[]{4, 7, 1}));

        // List
        myCustomProperties.put("List", Arrays.asList("XzY", 34, new Object()));

        // Long
        myCustomProperties.put("Long", Long.valueOf(435342l));

        // Map
        myCustomProperties.put("Map", Collections.EMPTY_MAP);

        // Null
        myCustomProperties.put("Null", null);

        // Date
        myCustomProperties.put("Date", new Date());

        final ApplicationProperties applicationProperties = new ApplicationProperties(myCustomProperties);

        final byte[] contents = "boo".getBytes(UTF_8);
        final Message message = Proton.message();
        message.setMessageAnnotations(new MessageAnnotations(properties));
        message.setBody(new Data(new Binary(contents)));
        message.setApplicationProperties(applicationProperties);

        // Act
        final EventData eventData = MESSAGE_SERIALIZER.deserialize(message, EventData.class);

        // Assert
        final Map<String, Object> systemProperties = eventData.getSystemProperties();

        Assertions.assertEquals(properties.size(), systemProperties.size());
        Assertions.assertEquals(OFFSET, systemProperties.get(OFFSET_ANNOTATION_NAME.getValue()));
        Assertions.assertEquals(sequenceNumber, systemProperties.get(SEQUENCE_NUMBER_ANNOTATION_NAME.getValue()));
        Assertions.assertEquals(ENQUEUED_TIME, systemProperties.get(ENQUEUED_TIME_UTC_ANNOTATION_NAME.getValue()));

        Assertions.assertEquals(PARTITION_KEY, eventData.getPartitionKey());
        Assertions.assertEquals(OFFSET, eventData.getOffset());
        Assertions.assertEquals(sequenceNumber, eventData.getSequenceNumber());
        Assertions.assertEquals(ENQUEUED_TIME, eventData.getEnqueuedTime());

        final Map<String, Object> eventDataProperties = eventData.getProperties();
        Assertions.assertNotNull(eventDataProperties);
        Assertions.assertEquals(myCustomProperties.size(), eventDataProperties.size());
        Assertions.assertEquals(myCustomProperties, eventDataProperties);

        // Now other way around, serialize instead of deserializing (as above) and assert for the very same expectations
        final Message message2 = MESSAGE_SERIALIZER.serialize(eventData);
        Assertions.assertEquals(myCustomProperties.size(), message2.getApplicationProperties().getValue().size());
        Assertions.assertEquals(myCustomProperties, message2.getApplicationProperties().getValue());
    }

    /**
     * Tests that the properties are set. In addition, checks the raw AMQP message to see that it has been added there.
     */
    @Test
    public void setAmqpProperties() {
        // Arrange
        final BinaryData binaryData = BinaryData.fromBytes(PAYLOAD_BYTES);
        final String messageId = "a-message-id";
        final String contentType = "content-type=json";
        final String correlationId = "my-correlation";

        // Act
        final EventData eventData = new EventData(binaryData)
            .setContentType(contentType)
            .setCorrelationId(correlationId)
            .setMessageId(messageId);

        // Assert
        Assertions.assertNotNull(eventData.getBody());
        Assertions.assertEquals(PAYLOAD, new String(eventData.getBody(), UTF_8));

        final BinaryData actualBinary = eventData.getBodyAsBinaryData();
        Assertions.assertNotNull(actualBinary);
        Assertions.assertArrayEquals(PAYLOAD_BYTES, actualBinary.toBytes());
    }
}
