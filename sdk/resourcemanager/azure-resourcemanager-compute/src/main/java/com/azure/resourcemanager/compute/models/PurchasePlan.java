// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Used for establishing the purchase context of any 3rd Party artifact through MarketPlace. */
@Fluent
public final class PurchasePlan {
    /*
     * The publisher ID.
     */
    @JsonProperty(value = "publisher", required = true)
    private String publisher;

    /*
     * The plan ID.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Specifies the product of the image from the marketplace. This is the same value as Offer under the
     * imageReference element.
     */
    @JsonProperty(value = "product", required = true)
    private String product;

    /**
     * Get the publisher property: The publisher ID.
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: The publisher ID.
     *
     * @param publisher the publisher value to set.
     * @return the PurchasePlan object itself.
     */
    public PurchasePlan withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the name property: The plan ID.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The plan ID.
     *
     * @param name the name value to set.
     * @return the PurchasePlan object itself.
     */
    public PurchasePlan withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the product property: Specifies the product of the image from the marketplace. This is the same value as
     * Offer under the imageReference element.
     *
     * @return the product value.
     */
    public String product() {
        return this.product;
    }

    /**
     * Set the product property: Specifies the product of the image from the marketplace. This is the same value as
     * Offer under the imageReference element.
     *
     * @param product the product value to set.
     * @return the PurchasePlan object itself.
     */
    public PurchasePlan withProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (publisher() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property publisher in model PurchasePlan"));
        }
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model PurchasePlan"));
        }
        if (product() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property product in model PurchasePlan"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PurchasePlan.class);
}
