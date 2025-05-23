// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The state of forwarding rule.
 */
public final class ForwardingRuleState extends ExpandableStringEnum<ForwardingRuleState> {
    /**
     * Static value Enabled for ForwardingRuleState.
     */
    public static final ForwardingRuleState ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for ForwardingRuleState.
     */
    public static final ForwardingRuleState DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of ForwardingRuleState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ForwardingRuleState() {
    }

    /**
     * Creates or finds a ForwardingRuleState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ForwardingRuleState.
     */
    public static ForwardingRuleState fromString(String name) {
        return fromString(name, ForwardingRuleState.class);
    }

    /**
     * Gets known ForwardingRuleState values.
     * 
     * @return known ForwardingRuleState values.
     */
    public static Collection<ForwardingRuleState> values() {
        return values(ForwardingRuleState.class);
    }
}
