// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.EnvironmentContainerInner;
import com.azure.resourcemanager.machinelearning.models.EnvironmentContainerProperties;
import com.azure.resourcemanager.machinelearning.models.EnvironmentContainerResourceArmPaginatedResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class EnvironmentContainerResourceArmPaginatedResultTests {
    @Test
    public void testDeserialize() {
        EnvironmentContainerResourceArmPaginatedResult model =
            BinaryData
                .fromString(
                    "{\"nextLink\":\"buffkmrqemvvhm\",\"value\":[{\"properties\":{\"isArchived\":true,\"latestVersion\":\"utacoe\",\"nextVersion\":\"vewzcj\",\"description\":\"m\",\"properties\":{},\"tags\":{}},\"id\":\"guaadraufactkahz\",\"name\":\"v\",\"type\":\"jjziuxxpsh\"}]}")
                .toObject(EnvironmentContainerResourceArmPaginatedResult.class);
        Assertions.assertEquals("buffkmrqemvvhm", model.nextLink());
        Assertions.assertEquals("m", model.value().get(0).properties().description());
        Assertions.assertEquals(true, model.value().get(0).properties().isArchived());
    }

    @Test
    public void testSerialize() {
        EnvironmentContainerResourceArmPaginatedResult model =
            new EnvironmentContainerResourceArmPaginatedResult()
                .withNextLink("buffkmrqemvvhm")
                .withValue(
                    Arrays
                        .asList(
                            new EnvironmentContainerInner()
                                .withProperties(
                                    new EnvironmentContainerProperties()
                                        .withDescription("m")
                                        .withProperties(mapOf())
                                        .withTags(mapOf())
                                        .withIsArchived(true))));
        model = BinaryData.fromObject(model).toObject(EnvironmentContainerResourceArmPaginatedResult.class);
        Assertions.assertEquals("buffkmrqemvvhm", model.nextLink());
        Assertions.assertEquals("m", model.value().get(0).properties().description());
        Assertions.assertEquals(true, model.value().get(0).properties().isArchived());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
