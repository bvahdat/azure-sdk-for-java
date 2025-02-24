// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservices.fluent.PrivateLinkResourcesOperationsClient;
import com.azure.resourcemanager.recoveryservices.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.recoveryservices.models.PrivateLinkResource;
import com.azure.resourcemanager.recoveryservices.models.PrivateLinkResourcesOperations;

public final class PrivateLinkResourcesOperationsImpl implements PrivateLinkResourcesOperations {
    private static final ClientLogger LOGGER = new ClientLogger(PrivateLinkResourcesOperationsImpl.class);

    private final PrivateLinkResourcesOperationsClient innerClient;

    private final com.azure.resourcemanager.recoveryservices.RecoveryServicesManager serviceManager;

    public PrivateLinkResourcesOperationsImpl(
        PrivateLinkResourcesOperationsClient innerClient,
        com.azure.resourcemanager.recoveryservices.RecoveryServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PrivateLinkResource> list(String resourceGroupName, String vaultName) {
        PagedIterable<PrivateLinkResourceInner> inner = this.serviceClient().list(resourceGroupName, vaultName);
        return Utils.mapPage(inner, inner1 -> new PrivateLinkResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateLinkResource> list(String resourceGroupName, String vaultName, Context context) {
        PagedIterable<PrivateLinkResourceInner> inner =
            this.serviceClient().list(resourceGroupName, vaultName, context);
        return Utils.mapPage(inner, inner1 -> new PrivateLinkResourceImpl(inner1, this.manager()));
    }

    public PrivateLinkResource get(String resourceGroupName, String vaultName, String privateLinkResourceName) {
        PrivateLinkResourceInner inner =
            this.serviceClient().get(resourceGroupName, vaultName, privateLinkResourceName);
        if (inner != null) {
            return new PrivateLinkResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateLinkResource> getWithResponse(
        String resourceGroupName, String vaultName, String privateLinkResourceName, Context context) {
        Response<PrivateLinkResourceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, vaultName, privateLinkResourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateLinkResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private PrivateLinkResourcesOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager() {
        return this.serviceManager;
    }
}
