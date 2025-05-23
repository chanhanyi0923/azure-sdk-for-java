// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.generated;

/**
 * Samples for Pools Delete.
 */
public final class PoolsDeleteSamples {
    /*
     * x-ms-original-file: 2025-01-21/DeletePool.json
     */
    /**
     * Sample code: Pools_Delete.
     * 
     * @param manager Entry point to DevOpsInfrastructureManager.
     */
    public static void poolsDelete(com.azure.resourcemanager.devopsinfrastructure.DevOpsInfrastructureManager manager) {
        manager.pools().delete("rg", "pool", com.azure.core.util.Context.NONE);
    }
}
