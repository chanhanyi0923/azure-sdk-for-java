// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.metricsadvisor;

import com.azure.ai.metricsadvisor.models.AnomalyIncident;
import com.azure.ai.metricsadvisor.models.ListIncidentsAlertedOptions;
import com.azure.core.http.HttpClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.azure.ai.metricsadvisor.AlertTestBase.ALERT_CONFIG_ID;

public abstract class IncidentForAlertTestBase extends MetricsAdvisorClientTestBase {
    @Test
    @Disabled("https://github.com/Azure/azure-sdk-for-java/issues/33586")
    public abstract void listIncidentsForAlert(HttpClient httpClient, MetricsAdvisorServiceVersion serviceVersion);

    // Pre-configured test resource.
    protected static class ListIncidentsForAlertInput {
        static final ListIncidentsForAlertInput INSTANCE = new ListIncidentsForAlertInput();
        final ListIncidentsAlertedOptions options = new ListIncidentsAlertedOptions().setMaxPageSize(10);
        final String alertConfigurationId = ALERT_CONFIG_ID;
        final String alertId = "17f9f794800";
    }

    protected static class ListIncidentsForAlertOutput {
        static final ListIncidentsForAlertOutput INSTANCE = new ListIncidentsForAlertOutput();
        final int expectedIncidents = 1;
    }

    protected void assertListIncidentsForAlertOutput(AnomalyIncident incident) {
        Assertions.assertNotNull(incident);
        Assertions.assertNotNull(incident.getId());
        Assertions.assertNotNull(incident.getMetricId());
        // currently, returned as null?
        // Assertions.assertNotNull(incident.getSeverity());
        Assertions.assertNotNull(incident.getStatus());
        Assertions.assertNotNull(incident.getLastTime());
        Assertions.assertNotNull(incident.getDetectionConfigurationId());
        Assertions.assertNotNull(incident.getRootDimensionKey());
        Assertions.assertFalse(incident.getRootDimensionKey().asMap().isEmpty());
    }
}
