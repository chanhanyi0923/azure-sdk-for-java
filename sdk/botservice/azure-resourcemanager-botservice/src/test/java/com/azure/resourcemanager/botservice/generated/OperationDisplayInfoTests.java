// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.botservice.models.OperationDisplayInfo;
import org.junit.jupiter.api.Assertions;

public final class OperationDisplayInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationDisplayInfo model = BinaryData.fromString(
            "{\"description\":\"chcbonqvpkvlrxnj\",\"operation\":\"seiphe\",\"provider\":\"lokeyy\",\"resource\":\"nj\"}")
            .toObject(OperationDisplayInfo.class);
        Assertions.assertEquals("chcbonqvpkvlrxnj", model.description());
        Assertions.assertEquals("seiphe", model.operation());
        Assertions.assertEquals("lokeyy", model.provider());
        Assertions.assertEquals("nj", model.resource());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationDisplayInfo model = new OperationDisplayInfo().withDescription("chcbonqvpkvlrxnj")
            .withOperation("seiphe")
            .withProvider("lokeyy")
            .withResource("nj");
        model = BinaryData.fromObject(model).toObject(OperationDisplayInfo.class);
        Assertions.assertEquals("chcbonqvpkvlrxnj", model.description());
        Assertions.assertEquals("seiphe", model.operation());
        Assertions.assertEquals("lokeyy", model.provider());
        Assertions.assertEquals("nj", model.resource());
    }
}
