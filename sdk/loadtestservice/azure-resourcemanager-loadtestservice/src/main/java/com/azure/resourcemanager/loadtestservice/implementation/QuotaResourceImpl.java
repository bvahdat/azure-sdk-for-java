// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loadtestservice.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.loadtestservice.fluent.models.QuotaResourceInner;
import com.azure.resourcemanager.loadtestservice.models.QuotaResource;
import com.azure.resourcemanager.loadtestservice.models.ResourceState;

public final class QuotaResourceImpl implements QuotaResource {
    private QuotaResourceInner innerObject;

    private final com.azure.resourcemanager.loadtestservice.LoadTestManager serviceManager;

    QuotaResourceImpl(
        QuotaResourceInner innerObject, com.azure.resourcemanager.loadtestservice.LoadTestManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Integer limit() {
        return this.innerModel().limit();
    }

    public Integer usage() {
        return this.innerModel().usage();
    }

    public ResourceState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public QuotaResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.loadtestservice.LoadTestManager manager() {
        return this.serviceManager;
    }
}
