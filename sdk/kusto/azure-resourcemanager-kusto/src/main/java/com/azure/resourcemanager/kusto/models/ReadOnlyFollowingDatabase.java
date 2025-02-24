// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.kusto.fluent.models.DatabaseInner;
import com.azure.resourcemanager.kusto.fluent.models.ReadOnlyFollowingDatabaseProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Duration;

/** Class representing a read only following database. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("ReadOnlyFollowing")
@Fluent
public final class ReadOnlyFollowingDatabase extends DatabaseInner {
    /*
     * The database properties.
     */
    @JsonProperty(value = "properties")
    private ReadOnlyFollowingDatabaseProperties innerProperties;

    /**
     * Get the innerProperties property: The database properties.
     *
     * @return the innerProperties value.
     */
    private ReadOnlyFollowingDatabaseProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ReadOnlyFollowingDatabase withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the softDeletePeriod property: The time the data should be kept before it stops being accessible to queries
     * in TimeSpan.
     *
     * @return the softDeletePeriod value.
     */
    public Duration softDeletePeriod() {
        return this.innerProperties() == null ? null : this.innerProperties().softDeletePeriod();
    }

    /**
     * Get the hotCachePeriod property: The time the data should be kept in cache for fast queries in TimeSpan.
     *
     * @return the hotCachePeriod value.
     */
    public Duration hotCachePeriod() {
        return this.innerProperties() == null ? null : this.innerProperties().hotCachePeriod();
    }

    /**
     * Set the hotCachePeriod property: The time the data should be kept in cache for fast queries in TimeSpan.
     *
     * @param hotCachePeriod the hotCachePeriod value to set.
     * @return the ReadOnlyFollowingDatabase object itself.
     */
    public ReadOnlyFollowingDatabase withHotCachePeriod(Duration hotCachePeriod) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReadOnlyFollowingDatabaseProperties();
        }
        this.innerProperties().withHotCachePeriod(hotCachePeriod);
        return this;
    }

    /**
     * Get the statistics property: The statistics of the database.
     *
     * @return the statistics value.
     */
    public DatabaseStatistics statistics() {
        return this.innerProperties() == null ? null : this.innerProperties().statistics();
    }

    /**
     * Get the leaderClusterResourceId property: The name of the leader cluster.
     *
     * @return the leaderClusterResourceId value.
     */
    public String leaderClusterResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().leaderClusterResourceId();
    }

    /**
     * Get the attachedDatabaseConfigurationName property: The name of the attached database configuration cluster.
     *
     * @return the attachedDatabaseConfigurationName value.
     */
    public String attachedDatabaseConfigurationName() {
        return this.innerProperties() == null ? null : this.innerProperties().attachedDatabaseConfigurationName();
    }

    /**
     * Get the principalsModificationKind property: The principals modification kind of the database.
     *
     * @return the principalsModificationKind value.
     */
    public PrincipalsModificationKind principalsModificationKind() {
        return this.innerProperties() == null ? null : this.innerProperties().principalsModificationKind();
    }

    /**
     * Get the tableLevelSharingProperties property: Table level sharing specifications.
     *
     * @return the tableLevelSharingProperties value.
     */
    public TableLevelSharingProperties tableLevelSharingProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().tableLevelSharingProperties();
    }

    /**
     * Get the originalDatabaseName property: The original database name, before databaseNameOverride or
     * databaseNamePrefix where applied.
     *
     * @return the originalDatabaseName value.
     */
    public String originalDatabaseName() {
        return this.innerProperties() == null ? null : this.innerProperties().originalDatabaseName();
    }

    /**
     * Get the databaseShareOrigin property: The origin of the following setup.
     *
     * @return the databaseShareOrigin value.
     */
    public DatabaseShareOrigin databaseShareOrigin() {
        return this.innerProperties() == null ? null : this.innerProperties().databaseShareOrigin();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
