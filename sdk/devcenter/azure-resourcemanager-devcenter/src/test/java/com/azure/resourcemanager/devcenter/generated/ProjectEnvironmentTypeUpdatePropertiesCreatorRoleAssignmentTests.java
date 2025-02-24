// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.EnvironmentRole;
import com.azure.resourcemanager.devcenter.models.ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public final class ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignmentTests {
    @Test
    public void testDeserialize() {
        ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment model =
            BinaryData
                .fromString(
                    "{\"roles\":{\"ybsrfbjfdtwss\":{\"roleName\":\"rruvwbhsq\",\"description\":\"ubcgjbirxb\"},\"qtaruoujmkcjhwq\":{\"roleName\":\"ftpvjzbexil\",\"description\":\"nfqqnvwp\"}}}")
                .toObject(ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment.class);
    }

    @Test
    public void testSerialize() {
        ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment model =
            new ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment()
                .withRoles(mapOf("ybsrfbjfdtwss", new EnvironmentRole(), "qtaruoujmkcjhwq", new EnvironmentRole()));
        model =
            BinaryData.fromObject(model).toObject(ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment.class);
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
