// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DataFlowFolder;
import com.azure.resourcemanager.datafactory.models.PowerQuerySource;
import com.azure.resourcemanager.datafactory.models.WranglingDataFlow;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class WranglingDataFlowTests {
    @Test
    public void testDeserialize() {
        WranglingDataFlow model =
            BinaryData
                .fromString(
                    "{\"type\":\"WranglingDataFlow\",\"typeProperties\":{\"sources\":[{\"script\":\"y\",\"name\":\"uxakjsqzhzbezk\",\"description\":\"msidxasicddyvv\"},{\"script\":\"mocwa\",\"name\":\"qgatjeaahhvjhhn\",\"description\":\"zybbj\"}],\"script\":\"syxkyxvxevblb\",\"documentLocale\":\"dnlj\"},\"description\":\"geuaulx\",\"annotations\":[],\"folder\":{\"name\":\"bn\"}}")
                .toObject(WranglingDataFlow.class);
        Assertions.assertEquals("geuaulx", model.description());
        Assertions.assertEquals("bn", model.folder().name());
        Assertions.assertEquals("uxakjsqzhzbezk", model.sources().get(0).name());
        Assertions.assertEquals("msidxasicddyvv", model.sources().get(0).description());
        Assertions.assertEquals("y", model.sources().get(0).script());
        Assertions.assertEquals("syxkyxvxevblb", model.script());
        Assertions.assertEquals("dnlj", model.documentLocale());
    }

    @Test
    public void testSerialize() {
        WranglingDataFlow model =
            new WranglingDataFlow()
                .withDescription("geuaulx")
                .withAnnotations(Arrays.asList())
                .withFolder(new DataFlowFolder().withName("bn"))
                .withSources(
                    Arrays
                        .asList(
                            new PowerQuerySource()
                                .withName("uxakjsqzhzbezk")
                                .withDescription("msidxasicddyvv")
                                .withScript("y"),
                            new PowerQuerySource()
                                .withName("qgatjeaahhvjhhn")
                                .withDescription("zybbj")
                                .withScript("mocwa")))
                .withScript("syxkyxvxevblb")
                .withDocumentLocale("dnlj");
        model = BinaryData.fromObject(model).toObject(WranglingDataFlow.class);
        Assertions.assertEquals("geuaulx", model.description());
        Assertions.assertEquals("bn", model.folder().name());
        Assertions.assertEquals("uxakjsqzhzbezk", model.sources().get(0).name());
        Assertions.assertEquals("msidxasicddyvv", model.sources().get(0).description());
        Assertions.assertEquals("y", model.sources().get(0).script());
        Assertions.assertEquals("syxkyxvxevblb", model.script());
        Assertions.assertEquals("dnlj", model.documentLocale());
    }
}
