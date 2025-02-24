// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.resourcemanager.devcenter.fluent.models.OperationStatusInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of OperationStatus. */
public interface OperationStatus {
    /**
     * Gets the id property: Fully qualified ID for the operation status.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The operation id name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the status property: Provisioning state of the resource.
     *
     * @return the status value.
     */
    String status();

    /**
     * Gets the resourceId property: The id of the resource.
     *
     * @return the resourceId value.
     */
    String resourceId();

    /**
     * Gets the startTime property: The start time of the operation.
     *
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the endTime property: The end time of the operation.
     *
     * @return the endTime value.
     */
    OffsetDateTime endTime();

    /**
     * Gets the percentComplete property: Percent of the operation that is complete.
     *
     * @return the percentComplete value.
     */
    Float percentComplete();

    /**
     * Gets the properties property: Custom operation properties, populated only for a successful operation.
     *
     * @return the properties value.
     */
    Object properties();

    /**
     * Gets the error property: Operation Error message.
     *
     * @return the error value.
     */
    OperationStatusError error();

    /**
     * Gets the inner com.azure.resourcemanager.devcenter.fluent.models.OperationStatusInner object.
     *
     * @return the inner object.
     */
    OperationStatusInner innerModel();
}
