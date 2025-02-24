// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Properties for MaterializedViewsBuilderServiceResource. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "serviceType")
@JsonTypeName("MaterializedViewsBuilder")
@Fluent
public final class MaterializedViewsBuilderServiceResourceProperties extends ServiceResourceProperties {
    /*
     * An array that contains all of the locations for the service.
     */
    @JsonProperty(value = "locations", access = JsonProperty.Access.WRITE_ONLY)
    private List<MaterializedViewsBuilderRegionalServiceResource> locations;

    /**
     * Get the locations property: An array that contains all of the locations for the service.
     *
     * @return the locations value.
     */
    public List<MaterializedViewsBuilderRegionalServiceResource> locations() {
        return this.locations;
    }

    /** {@inheritDoc} */
    @Override
    public MaterializedViewsBuilderServiceResourceProperties withInstanceSize(ServiceSize instanceSize) {
        super.withInstanceSize(instanceSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MaterializedViewsBuilderServiceResourceProperties withInstanceCount(Integer instanceCount) {
        super.withInstanceCount(instanceCount);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (locations() != null) {
            locations().forEach(e -> e.validate());
        }
    }
}
