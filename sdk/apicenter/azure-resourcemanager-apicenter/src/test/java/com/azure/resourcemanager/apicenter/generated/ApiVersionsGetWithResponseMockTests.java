// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.apicenter.ApiCenterManager;
import com.azure.resourcemanager.apicenter.models.ApiVersion;
import com.azure.resourcemanager.apicenter.models.LifecycleStage;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ApiVersionsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"title\":\"feo\",\"lifecycleStage\":\"development\"},\"id\":\"qwkyhkobop\",\"name\":\"xedk\",\"type\":\"wep\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ApiCenterManager manager = ApiCenterManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ApiVersion response = manager.apiVersions()
            .getWithResponse("wygzlvdnkfxusem", "wzrmuh", "pfcqdp", "qxqvpsvuoymgc", "elvezrypq",
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("feo", response.properties().title());
        Assertions.assertEquals(LifecycleStage.DEVELOPMENT, response.properties().lifecycleStage());
    }
}
