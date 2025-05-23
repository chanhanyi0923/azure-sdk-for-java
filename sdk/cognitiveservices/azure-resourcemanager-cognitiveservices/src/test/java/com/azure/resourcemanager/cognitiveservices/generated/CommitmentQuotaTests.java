// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentQuota;
import org.junit.jupiter.api.Assertions;

public final class CommitmentQuotaTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CommitmentQuota model = BinaryData.fromString("{\"quantity\":193130563963832642,\"unit\":\"nxipeil\"}")
            .toObject(CommitmentQuota.class);
        Assertions.assertEquals(193130563963832642L, model.quantity());
        Assertions.assertEquals("nxipeil", model.unit());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CommitmentQuota model = new CommitmentQuota().withQuantity(193130563963832642L).withUnit("nxipeil");
        model = BinaryData.fromObject(model).toObject(CommitmentQuota.class);
        Assertions.assertEquals(193130563963832642L, model.quantity());
        Assertions.assertEquals("nxipeil", model.unit());
    }
}
