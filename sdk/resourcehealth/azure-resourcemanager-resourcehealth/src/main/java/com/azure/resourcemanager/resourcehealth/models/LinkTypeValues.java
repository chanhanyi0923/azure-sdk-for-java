// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Type of link.
 */
public final class LinkTypeValues extends ExpandableStringEnum<LinkTypeValues> {
    /**
     * Static value Button for LinkTypeValues.
     */
    public static final LinkTypeValues BUTTON = fromString("Button");

    /**
     * Static value Hyperlink for LinkTypeValues.
     */
    public static final LinkTypeValues HYPERLINK = fromString("Hyperlink");

    /**
     * Creates a new instance of LinkTypeValues value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LinkTypeValues() {
    }

    /**
     * Creates or finds a LinkTypeValues from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LinkTypeValues.
     */
    public static LinkTypeValues fromString(String name) {
        return fromString(name, LinkTypeValues.class);
    }

    /**
     * Gets known LinkTypeValues values.
     * 
     * @return known LinkTypeValues values.
     */
    public static Collection<LinkTypeValues> values() {
        return values(LinkTypeValues.class);
    }
}
