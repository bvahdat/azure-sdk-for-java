// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.fluent.models.RecommendedElasticPoolInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents the response to a list recommended elastic pool request. */
@Fluent
public final class RecommendedElasticPoolListResult {
    /*
     * The list of recommended elastic pools hosted in the server.
     */
    @JsonProperty(value = "value", required = true)
    private List<RecommendedElasticPoolInner> value;

    /**
     * Get the value property: The list of recommended elastic pools hosted in the server.
     *
     * @return the value value.
     */
    public List<RecommendedElasticPoolInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of recommended elastic pools hosted in the server.
     *
     * @param value the value value to set.
     * @return the RecommendedElasticPoolListResult object itself.
     */
    public RecommendedElasticPoolListResult withValue(List<RecommendedElasticPoolInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model RecommendedElasticPoolListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RecommendedElasticPoolListResult.class);
}
