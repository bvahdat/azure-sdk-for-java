// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalRole;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalType;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A class representing database principal entity. */
@Fluent
public final class DatabasePrincipalInner {
    /*
     * Database principal role.
     */
    @JsonProperty(value = "role", required = true)
    private DatabasePrincipalRole role;

    /*
     * Database principal name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Database principal type.
     */
    @JsonProperty(value = "type", required = true)
    private DatabasePrincipalType type;

    /*
     * Database principal fully qualified name.
     */
    @JsonProperty(value = "fqn")
    private String fqn;

    /*
     * Database principal email if exists.
     */
    @JsonProperty(value = "email")
    private String email;

    /*
     * Application id - relevant only for application principal type.
     */
    @JsonProperty(value = "appId")
    private String appId;

    /*
     * The tenant name of the principal
     */
    @JsonProperty(value = "tenantName", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantName;

    /**
     * Get the role property: Database principal role.
     *
     * @return the role value.
     */
    public DatabasePrincipalRole role() {
        return this.role;
    }

    /**
     * Set the role property: Database principal role.
     *
     * @param role the role value to set.
     * @return the DatabasePrincipalInner object itself.
     */
    public DatabasePrincipalInner withRole(DatabasePrincipalRole role) {
        this.role = role;
        return this;
    }

    /**
     * Get the name property: Database principal name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Database principal name.
     *
     * @param name the name value to set.
     * @return the DatabasePrincipalInner object itself.
     */
    public DatabasePrincipalInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Database principal type.
     *
     * @return the type value.
     */
    public DatabasePrincipalType type() {
        return this.type;
    }

    /**
     * Set the type property: Database principal type.
     *
     * @param type the type value to set.
     * @return the DatabasePrincipalInner object itself.
     */
    public DatabasePrincipalInner withType(DatabasePrincipalType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the fqn property: Database principal fully qualified name.
     *
     * @return the fqn value.
     */
    public String fqn() {
        return this.fqn;
    }

    /**
     * Set the fqn property: Database principal fully qualified name.
     *
     * @param fqn the fqn value to set.
     * @return the DatabasePrincipalInner object itself.
     */
    public DatabasePrincipalInner withFqn(String fqn) {
        this.fqn = fqn;
        return this;
    }

    /**
     * Get the email property: Database principal email if exists.
     *
     * @return the email value.
     */
    public String email() {
        return this.email;
    }

    /**
     * Set the email property: Database principal email if exists.
     *
     * @param email the email value to set.
     * @return the DatabasePrincipalInner object itself.
     */
    public DatabasePrincipalInner withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get the appId property: Application id - relevant only for application principal type.
     *
     * @return the appId value.
     */
    public String appId() {
        return this.appId;
    }

    /**
     * Set the appId property: Application id - relevant only for application principal type.
     *
     * @param appId the appId value to set.
     * @return the DatabasePrincipalInner object itself.
     */
    public DatabasePrincipalInner withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Get the tenantName property: The tenant name of the principal.
     *
     * @return the tenantName value.
     */
    public String tenantName() {
        return this.tenantName;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (role() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property role in model DatabasePrincipalInner"));
        }
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model DatabasePrincipalInner"));
        }
        if (type() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model DatabasePrincipalInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DatabasePrincipalInner.class);
}
