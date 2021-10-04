package org.acme;

import io.quarkus.runtime.annotations.RegisterForReflection;

import java.util.List;

@RegisterForReflection
public class VarCalculationResponse {

    private String correlationId;
    private Boolean allAccounts;
    private String entityType;
    private String entityId;
    private Double confidence;
    private List<ValueAtRiskResult> results;

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public Boolean getAllAccounts() {
        return allAccounts;
    }

    public void setAllAccounts(Boolean allAccounts) {
        this.allAccounts = allAccounts;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public Double getConfidence() {
        return confidence;
    }

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public List<ValueAtRiskResult> getResults() {
        return results;
    }

    public void setResults(List<ValueAtRiskResult> results) {
        this.results = results;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((allAccounts == null) ? 0 : allAccounts.hashCode());
        result = prime * result + ((confidence == null) ? 0 : confidence.hashCode());
        result = prime * result + ((correlationId == null) ? 0 : correlationId.hashCode());
        result = prime * result + ((entityId == null) ? 0 : entityId.hashCode());
        result = prime * result + ((entityType == null) ? 0 : entityType.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        VarCalculationResponse other = (VarCalculationResponse) obj;
        if (allAccounts == null) {
            if (other.allAccounts != null)
                return false;
        } else if (!allAccounts.equals(other.allAccounts))
            return false;
        if (confidence == null) {
            if (other.confidence != null)
                return false;
        } else if (!confidence.equals(other.confidence))
            return false;
        if (correlationId == null) {
            if (other.correlationId != null)
                return false;
        } else if (!correlationId.equals(other.correlationId))
            return false;
        if (entityId == null) {
            if (other.entityId != null)
                return false;
        } else if (!entityId.equals(other.entityId))
            return false;
        if (entityType == null) {
            if (other.entityType != null)
                return false;
        } else if (!entityType.equals(other.entityType))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "VarCalculationResponse [correlationId=" + correlationId + ", allAccounts=" + allAccounts
                + ", entityType=" + entityType + ", entityId=" + entityId + ", confidence=" + confidence + ", results="
                + results + "]";
    }

}
