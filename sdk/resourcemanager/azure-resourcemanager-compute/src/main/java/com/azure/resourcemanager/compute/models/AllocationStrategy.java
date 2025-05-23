// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Specifies the allocation strategy for the virtual machine scale set based on which the VMs will be allocated.
 */
public final class AllocationStrategy extends ExpandableStringEnum<AllocationStrategy> {
    /**
     * Static value LowestPrice for AllocationStrategy.
     */
    public static final AllocationStrategy LOWEST_PRICE = fromString("LowestPrice");

    /**
     * Static value CapacityOptimized for AllocationStrategy.
     */
    public static final AllocationStrategy CAPACITY_OPTIMIZED = fromString("CapacityOptimized");

    /**
     * Static value Prioritized for AllocationStrategy.
     */
    public static final AllocationStrategy PRIORITIZED = fromString("Prioritized");

    /**
     * Creates a new instance of AllocationStrategy value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AllocationStrategy() {
    }

    /**
     * Creates or finds a AllocationStrategy from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AllocationStrategy.
     */
    public static AllocationStrategy fromString(String name) {
        return fromString(name, AllocationStrategy.class);
    }

    /**
     * Gets known AllocationStrategy values.
     * 
     * @return known AllocationStrategy values.
     */
    public static Collection<AllocationStrategy> values() {
        return values(AllocationStrategy.class);
    }
}
