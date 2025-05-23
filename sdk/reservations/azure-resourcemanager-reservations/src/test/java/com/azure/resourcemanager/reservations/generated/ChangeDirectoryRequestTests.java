// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.reservations.models.ChangeDirectoryRequest;
import org.junit.jupiter.api.Assertions;

public final class ChangeDirectoryRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ChangeDirectoryRequest model
            = BinaryData.fromString("{\"destinationTenantId\":\"piexpbtgiw\"}").toObject(ChangeDirectoryRequest.class);
        Assertions.assertEquals("piexpbtgiw", model.destinationTenantId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ChangeDirectoryRequest model = new ChangeDirectoryRequest().withDestinationTenantId("piexpbtgiw");
        model = BinaryData.fromObject(model).toObject(ChangeDirectoryRequest.class);
        Assertions.assertEquals("piexpbtgiw", model.destinationTenantId());
    }
}
