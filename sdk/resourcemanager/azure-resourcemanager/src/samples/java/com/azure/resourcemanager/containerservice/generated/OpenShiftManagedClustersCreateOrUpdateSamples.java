// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

import com.azure.resourcemanager.containerservice.fluent.models.OpenShiftManagedClusterInner;
import com.azure.resourcemanager.containerservice.models.NetworkProfile;
import com.azure.resourcemanager.containerservice.models.OSType;
import com.azure.resourcemanager.containerservice.models.OpenShiftAgentPoolProfileRole;
import com.azure.resourcemanager.containerservice.models.OpenShiftContainerServiceVMSize;
import com.azure.resourcemanager.containerservice.models.OpenShiftManagedClusterAadIdentityProvider;
import com.azure.resourcemanager.containerservice.models.OpenShiftManagedClusterAgentPoolProfile;
import com.azure.resourcemanager.containerservice.models.OpenShiftManagedClusterAuthProfile;
import com.azure.resourcemanager.containerservice.models.OpenShiftManagedClusterIdentityProvider;
import com.azure.resourcemanager.containerservice.models.OpenShiftManagedClusterMasterPoolProfile;
import com.azure.resourcemanager.containerservice.models.OpenShiftRouterProfile;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for OpenShiftManagedClusters CreateOrUpdate.
 */
public final class OpenShiftManagedClustersCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2019-04-30/examples/
     * OpenShiftManagedClustersCreate_Update.json
     */
    /**
     * Sample code: Create/Update OpenShift Managed Cluster.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createUpdateOpenShiftManagedCluster(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters()
            .manager()
            .serviceClient()
            .getOpenShiftManagedClusters()
            .createOrUpdate("rg1", "clustername1",
                new OpenShiftManagedClusterInner().withLocation("location1")
                    .withTags(mapOf("archv2", "", "tier", "production"))
                    .withOpenShiftVersion("v3.11")
                    .withNetworkProfile(new NetworkProfile().withVnetCidr("10.0.0.0/8"))
                    .withRouterProfiles(Arrays.asList(new OpenShiftRouterProfile().withName("default")))
                    .withMasterPoolProfile(new OpenShiftManagedClusterMasterPoolProfile().withName("master")
                        .withCount(3)
                        .withVmSize(OpenShiftContainerServiceVMSize.STANDARD_D4S_V3)
                        .withSubnetCidr("10.0.0.0/24")
                        .withOsType(OSType.LINUX))
                    .withAgentPoolProfiles(Arrays.asList(
                        new OpenShiftManagedClusterAgentPoolProfile().withName("infra")
                            .withCount(2)
                            .withVmSize(OpenShiftContainerServiceVMSize.STANDARD_D4S_V3)
                            .withSubnetCidr("10.0.0.0/24")
                            .withOsType(OSType.LINUX)
                            .withRole(OpenShiftAgentPoolProfileRole.INFRA),
                        new OpenShiftManagedClusterAgentPoolProfile().withName("compute")
                            .withCount(4)
                            .withVmSize(OpenShiftContainerServiceVMSize.STANDARD_D4S_V3)
                            .withSubnetCidr("10.0.0.0/24")
                            .withOsType(OSType.LINUX)
                            .withRole(OpenShiftAgentPoolProfileRole.COMPUTE)))
                    .withAuthProfile(new OpenShiftManagedClusterAuthProfile().withIdentityProviders(
                        Arrays.asList(new OpenShiftManagedClusterIdentityProvider().withName("Azure AD")
                            .withProvider(new OpenShiftManagedClusterAadIdentityProvider().withClientId("clientId")
                                .withSecret("fakeTokenPlaceholder")
                                .withTenantId("tenantId")
                                .withCustomerAdminGroupId("customerAdminGroupId"))))),
                com.azure.core.util.Context.NONE);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
