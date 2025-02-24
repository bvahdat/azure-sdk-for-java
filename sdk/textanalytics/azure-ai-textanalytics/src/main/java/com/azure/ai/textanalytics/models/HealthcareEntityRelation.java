// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.models;

import com.azure.ai.textanalytics.implementation.HealthcareEntityRelationPropertiesHelper;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.IterableStream;

/**
 * The {@link HealthcareEntityRelation}
 * Every relation is an entity graph of a certain relationType, where all entities are connected and have specific roles
 * within the relation context.
 */
@Immutable
public final class HealthcareEntityRelation {
    /*
     * Type of relation. Examples include: `DosageOfMedication` or
     * 'FrequencyOfMedication', etc.
     */
    private HealthcareEntityRelationType relationType;

    /*
     * The entities in the relation.
     */
    private IterableStream<HealthcareEntityRelationRole> roles;

    /*
     * Confidence score between 0 and 1 of the extracted relation.
     */
    private Double confidenceScore;

    static {
        HealthcareEntityRelationPropertiesHelper.setAccessor(
            new HealthcareEntityRelationPropertiesHelper.HealthcareEntityRelationAccessor() {
                @Override
                public void setRelationType(HealthcareEntityRelation healthcareEntityRelation,
                    HealthcareEntityRelationType relationType) {
                    healthcareEntityRelation.setRelationType(relationType);
                }

                @Override
                public void setRoles(HealthcareEntityRelation healthcareEntityRelation,
                    IterableStream<HealthcareEntityRelationRole> roles) {
                    healthcareEntityRelation.setRoles(roles);
                }

                @Override
                public void setConfidenceScore(HealthcareEntityRelation healthcareEntityRelation,
                    Double confidenceScore) {
                    healthcareEntityRelation.setConfidenceScore(confidenceScore);
                }
            });
    }

    /**
     * Gets the relationType property: Type of relation. Examples include: `DosageOfMedication` or
     * 'FrequencyOfMedication', etc.
     *
     * @return The relationType value.
     */
    public HealthcareEntityRelationType getRelationType() {
        return this.relationType;
    }

    /**
     * Gets the entities property: The entities in the relation.
     *
     * @return The entities value.
     */
    public IterableStream<HealthcareEntityRelationRole> getRoles() {
        return this.roles;
    }

    /**
     * Get the confidenceScore property: Confidence score between 0 and 1 of the extracted relation.
     *
     * @return the confidenceScore value.
     */
    public Double getConfidenceScore() {
        return this.confidenceScore;
    }

    private void setRelationType(HealthcareEntityRelationType relationType) {
        this.relationType = relationType;
    }

    private void setRoles(IterableStream<HealthcareEntityRelationRole> roles) {
        this.roles = roles;
    }

    private void setConfidenceScore(Double confidenceScore) {
        this.confidenceScore = confidenceScore;
    }
}
