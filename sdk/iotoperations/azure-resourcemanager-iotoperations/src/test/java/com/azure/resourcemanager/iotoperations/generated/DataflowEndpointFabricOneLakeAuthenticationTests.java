// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotoperations.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iotoperations.models.DataflowEndpointAuthenticationSystemAssignedManagedIdentity;
import com.azure.resourcemanager.iotoperations.models.DataflowEndpointAuthenticationUserAssignedManagedIdentity;
import com.azure.resourcemanager.iotoperations.models.DataflowEndpointFabricOneLakeAuthentication;
import com.azure.resourcemanager.iotoperations.models.FabricOneLakeAuthMethod;
import org.junit.jupiter.api.Assertions;

public final class DataflowEndpointFabricOneLakeAuthenticationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataflowEndpointFabricOneLakeAuthentication model = BinaryData.fromString(
            "{\"method\":\"SystemAssignedManagedIdentity\",\"systemAssignedManagedIdentitySettings\":{\"audience\":\"iekkezz\"},\"userAssignedManagedIdentitySettings\":{\"clientId\":\"hlyfjhdgqgg\",\"scope\":\"dunyg\",\"tenantId\":\"eqidbqfatpx\"}}")
            .toObject(DataflowEndpointFabricOneLakeAuthentication.class);
        Assertions.assertEquals(FabricOneLakeAuthMethod.SYSTEM_ASSIGNED_MANAGED_IDENTITY, model.method());
        Assertions.assertEquals("iekkezz", model.systemAssignedManagedIdentitySettings().audience());
        Assertions.assertEquals("hlyfjhdgqgg", model.userAssignedManagedIdentitySettings().clientId());
        Assertions.assertEquals("dunyg", model.userAssignedManagedIdentitySettings().scope());
        Assertions.assertEquals("eqidbqfatpx", model.userAssignedManagedIdentitySettings().tenantId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataflowEndpointFabricOneLakeAuthentication model = new DataflowEndpointFabricOneLakeAuthentication()
            .withMethod(FabricOneLakeAuthMethod.SYSTEM_ASSIGNED_MANAGED_IDENTITY)
            .withSystemAssignedManagedIdentitySettings(
                new DataflowEndpointAuthenticationSystemAssignedManagedIdentity().withAudience("iekkezz"))
            .withUserAssignedManagedIdentitySettings(
                new DataflowEndpointAuthenticationUserAssignedManagedIdentity().withClientId("hlyfjhdgqgg")
                    .withScope("dunyg")
                    .withTenantId("eqidbqfatpx"));
        model = BinaryData.fromObject(model).toObject(DataflowEndpointFabricOneLakeAuthentication.class);
        Assertions.assertEquals(FabricOneLakeAuthMethod.SYSTEM_ASSIGNED_MANAGED_IDENTITY, model.method());
        Assertions.assertEquals("iekkezz", model.systemAssignedManagedIdentitySettings().audience());
        Assertions.assertEquals("hlyfjhdgqgg", model.userAssignedManagedIdentitySettings().clientId());
        Assertions.assertEquals("dunyg", model.userAssignedManagedIdentitySettings().scope());
        Assertions.assertEquals("eqidbqfatpx", model.userAssignedManagedIdentitySettings().tenantId());
    }
}
