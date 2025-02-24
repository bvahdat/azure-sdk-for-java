// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** Blob info from a Filter Blobs API call. */
@JacksonXmlRootElement(localName = "Blob")
@Fluent
public final class FilterBlobItem {
    /*
     * The Name property.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /*
     * The ContainerName property.
     */
    @JsonProperty(value = "ContainerName", required = true)
    private String containerName;

    /*
     * Blob tags
     */
    @JsonProperty(value = "Tags")
    private BlobTags tags;

    /** Creates an instance of FilterBlobItem class. */
    public FilterBlobItem() {}

    /**
     * Get the name property: The Name property.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The Name property.
     *
     * @param name the name value to set.
     * @return the FilterBlobItem object itself.
     */
    public FilterBlobItem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the containerName property: The ContainerName property.
     *
     * @return the containerName value.
     */
    public String getContainerName() {
        return this.containerName;
    }

    /**
     * Set the containerName property: The ContainerName property.
     *
     * @param containerName the containerName value to set.
     * @return the FilterBlobItem object itself.
     */
    public FilterBlobItem setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get the tags property: Blob tags.
     *
     * @return the tags value.
     */
    public BlobTags getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: Blob tags.
     *
     * @param tags the tags value to set.
     * @return the FilterBlobItem object itself.
     */
    public FilterBlobItem setTags(BlobTags tags) {
        this.tags = tags;
        return this;
    }
}
