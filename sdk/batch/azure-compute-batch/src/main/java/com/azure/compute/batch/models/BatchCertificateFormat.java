// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * BatchCertificateFormat enums.
 */
public final class BatchCertificateFormat extends ExpandableStringEnum<BatchCertificateFormat> {

    /**
     * The Certificate is a PFX (PKCS#12) formatted Certificate or Certificate chain.
     */
    @Generated
    public static final BatchCertificateFormat PFX = fromString("pfx");

    /**
     * The Certificate is a base64-encoded X.509 Certificate.
     */
    @Generated
    public static final BatchCertificateFormat CER = fromString("cer");

    /**
     * Creates a new instance of BatchCertificateFormat value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public BatchCertificateFormat() {
    }

    /**
     * Creates or finds a BatchCertificateFormat from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BatchCertificateFormat.
     */
    @Generated
    public static BatchCertificateFormat fromString(String name) {
        return fromString(name, BatchCertificateFormat.class);
    }

    /**
     * Gets known BatchCertificateFormat values.
     *
     * @return known BatchCertificateFormat values.
     */
    @Generated
    public static Collection<BatchCertificateFormat> values() {
        return values(BatchCertificateFormat.class);
    }
}
