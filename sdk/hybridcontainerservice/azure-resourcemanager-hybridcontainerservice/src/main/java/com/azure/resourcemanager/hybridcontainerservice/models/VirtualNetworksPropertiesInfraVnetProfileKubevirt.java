// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Infra network profile for KubeVirt platform. */
@Fluent
public final class VirtualNetworksPropertiesInfraVnetProfileKubevirt {
    /*
     * Name of the network in KubeVirt
     */
    @JsonProperty(value = "vnetName")
    private String vnetName;

    /** Creates an instance of VirtualNetworksPropertiesInfraVnetProfileKubevirt class. */
    public VirtualNetworksPropertiesInfraVnetProfileKubevirt() {
    }

    /**
     * Get the vnetName property: Name of the network in KubeVirt.
     *
     * @return the vnetName value.
     */
    public String vnetName() {
        return this.vnetName;
    }

    /**
     * Set the vnetName property: Name of the network in KubeVirt.
     *
     * @param vnetName the vnetName value to set.
     * @return the VirtualNetworksPropertiesInfraVnetProfileKubevirt object itself.
     */
    public VirtualNetworksPropertiesInfraVnetProfileKubevirt withVnetName(String vnetName) {
        this.vnetName = vnetName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
