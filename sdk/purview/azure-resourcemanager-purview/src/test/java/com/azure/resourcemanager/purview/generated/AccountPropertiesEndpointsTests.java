// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.purview.models.AccountPropertiesEndpoints;

public final class AccountPropertiesEndpointsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AccountPropertiesEndpoints model
            = BinaryData.fromString("{\"catalog\":\"ftadehxnltyfs\",\"guardian\":\"pusuesn\",\"scan\":\"dejbavo\"}")
                .toObject(AccountPropertiesEndpoints.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AccountPropertiesEndpoints model = new AccountPropertiesEndpoints();
        model = BinaryData.fromObject(model).toObject(AccountPropertiesEndpoints.class);
    }
}
