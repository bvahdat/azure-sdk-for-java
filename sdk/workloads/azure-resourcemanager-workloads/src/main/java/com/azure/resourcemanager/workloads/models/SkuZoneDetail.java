// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The SKU zone details. */
@Fluent
public final class SkuZoneDetail {
    /*
     * The physical zones.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * The capabilities.
     */
    @JsonProperty(value = "capabilities")
    private List<SkuCapability> capabilities;

    /**
     * Get the zones property: The physical zones.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: The physical zones.
     *
     * @param zones the zones value to set.
     * @return the SkuZoneDetail object itself.
     */
    public SkuZoneDetail withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the capabilities property: The capabilities.
     *
     * @return the capabilities value.
     */
    public List<SkuCapability> capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities property: The capabilities.
     *
     * @param capabilities the capabilities value to set.
     * @return the SkuZoneDetail object itself.
     */
    public SkuZoneDetail withCapabilities(List<SkuCapability> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (capabilities() != null) {
            capabilities().forEach(e -> e.validate());
        }
    }
}
