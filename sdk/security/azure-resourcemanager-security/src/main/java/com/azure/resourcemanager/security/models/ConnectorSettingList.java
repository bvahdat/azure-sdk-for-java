// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.security.fluent.models.ConnectorSettingInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** For a subscription, list of all cloud account connectors and their settings. */
@Fluent
public final class ConnectorSettingList {
    /*
     * List of all the cloud account connector settings
     */
    @JsonProperty(value = "value")
    private List<ConnectorSettingInner> value;

    /*
     * The URI to fetch the next page.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: List of all the cloud account connector settings.
     *
     * @return the value value.
     */
    public List<ConnectorSettingInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of all the cloud account connector settings.
     *
     * @param value the value value to set.
     * @return the ConnectorSettingList object itself.
     */
    public ConnectorSettingList withValue(List<ConnectorSettingInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
