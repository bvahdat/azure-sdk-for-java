// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Represents the currency entity resolution model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resolutionKind")
@JsonTypeName("CurrencyResolution")
@Fluent
public final class CurrencyResolution extends BaseResolution {
    /*
     * The alphabetic code based on another ISO standard, ISO 3166, which lists the codes for country names. The first
     * two letters of the ISO 4217 three-letter code are the same as the code for the country name, and, where
     * possible, the third letter corresponds to the first letter of the currency name.
     */
    @JsonProperty(value = "ISO4217")
    private String iSO4217;

    /*
     * The unit of the amount captured in the extracted entity
     */
    @JsonProperty(value = "unit", required = true)
    private String unit;

    /*
     * The numeric value that the extracted text denotes.
     */
    @JsonProperty(value = "value", required = true)
    private double value;

    /**
     * Get the iSO4217 property: The alphabetic code based on another ISO standard, ISO 3166, which lists the codes for
     * country names. The first two letters of the ISO 4217 three-letter code are the same as the code for the country
     * name, and, where possible, the third letter corresponds to the first letter of the currency name.
     *
     * @return the iSO4217 value.
     */
    public String getISO4217() {
        return this.iSO4217;
    }

    /**
     * Set the iSO4217 property: The alphabetic code based on another ISO standard, ISO 3166, which lists the codes for
     * country names. The first two letters of the ISO 4217 three-letter code are the same as the code for the country
     * name, and, where possible, the third letter corresponds to the first letter of the currency name.
     *
     * @param iSO4217 the iSO4217 value to set.
     * @return the CurrencyResolution object itself.
     */
    public CurrencyResolution setISO4217(String iSO4217) {
        this.iSO4217 = iSO4217;
        return this;
    }

    /**
     * Get the unit property: The unit of the amount captured in the extracted entity.
     *
     * @return the unit value.
     */
    public String getUnit() {
        return this.unit;
    }

    /**
     * Set the unit property: The unit of the amount captured in the extracted entity.
     *
     * @param unit the unit value to set.
     * @return the CurrencyResolution object itself.
     */
    public CurrencyResolution setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the value property: The numeric value that the extracted text denotes.
     *
     * @return the value value.
     */
    public double getValue() {
        return this.value;
    }

    /**
     * Set the value property: The numeric value that the extracted text denotes.
     *
     * @param value the value value to set.
     * @return the CurrencyResolution object itself.
     */
    public CurrencyResolution setValue(double value) {
        this.value = value;
        return this;
    }
}
