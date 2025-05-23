// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.sphere.AzureSphereManager;
import com.azure.resourcemanager.sphere.models.Device;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class CatalogsListDevicesMockTests {
    @Test
    public void testListDevices() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"deviceId\":\"joya\",\"chipSku\":\"slyjpkiid\",\"lastAvailableOsVersion\":\"exznelixhnr\",\"lastInstalledOsVersion\":\"folhbnxknal\",\"lastOsUpdateUtc\":\"2021-06-16T03:28:56Z\",\"lastUpdateRequestUtc\":\"2021-05-05T13:18:41Z\",\"provisioningState\":\"Deleting\"},\"id\":\"tpnapnyiropuhpig\",\"name\":\"pgylg\",\"type\":\"git\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AzureSphereManager manager = AzureSphereManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Device> response = manager.catalogs()
            .listDevices("touwaboekqv", "elnsmvbxw", "jsflhhcaalnjix", 923639125, 1143509001, 589324262,
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("joya", response.iterator().next().properties().deviceId());
    }
}
