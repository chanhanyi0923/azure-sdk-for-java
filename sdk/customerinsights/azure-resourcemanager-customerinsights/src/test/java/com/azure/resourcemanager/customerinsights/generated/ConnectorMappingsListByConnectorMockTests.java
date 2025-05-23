// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.customerinsights.CustomerInsightsManager;
import com.azure.resourcemanager.customerinsights.models.CompletionOperationTypes;
import com.azure.resourcemanager.customerinsights.models.ConnectorMappingResourceFormat;
import com.azure.resourcemanager.customerinsights.models.ConnectorTypes;
import com.azure.resourcemanager.customerinsights.models.EntityTypes;
import com.azure.resourcemanager.customerinsights.models.ErrorManagementTypes;
import com.azure.resourcemanager.customerinsights.models.FrequencyTypes;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ConnectorMappingsListByConnectorMockTests {
    @Test
    public void testListByConnector() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"connectorName\":\"byx\",\"connectorType\":\"ExchangeOnline\",\"created\":\"2021-11-23T05:51:05Z\",\"lastModified\":\"2021-05-15T04:18:30Z\",\"entityType\":\"Relationship\",\"entityTypeName\":\"pffmnoii\",\"connectorMappingName\":\"udyhbrj\",\"displayName\":\"a\",\"description\":\"rdsjrho\",\"dataFormatId\":\"qwgusxxhdo\",\"mappingProperties\":{\"folderPath\":\"jwyblvtbdmvsb\",\"fileFilter\":\"daelqpv\",\"hasHeader\":true,\"errorManagement\":{\"errorManagementType\":\"StopImport\",\"errorLimit\":772953368},\"format\":{\"columnDelimiter\":\"botlog\",\"acceptLanguage\":\"usxursuiv\",\"quoteCharacter\":\"cjkcoqwczsyiqri\",\"quoteEscapeCharacter\":\"wihvaangqtnh\",\"arraySeparator\":\"fdmfdvbbaexxjfwt\"},\"availability\":{\"frequency\":\"Minute\",\"interval\":1215585734},\"structure\":[{\"propertyName\":\"auigvmuaf\",\"columnName\":\"czfedyuep\",\"customFormatSpecifier\":\"pl\",\"isEncrypted\":false},{\"propertyName\":\"ajjvywe\",\"columnName\":\"cfkumcfjxo\",\"customFormatSpecifier\":\"elsy\",\"isEncrypted\":true}],\"completeOperation\":{\"completionOperationType\":\"DoNothing\",\"destinationFolder\":\"w\"}},\"nextRunTime\":\"2021-09-03T16:15:16Z\",\"runId\":\"jekrknfd\",\"state\":\"Ready\",\"tenantId\":\"qyckgtxkrdtu\"},\"id\":\"crcjdklotcsubmz\",\"name\":\"onsvobchkxfpwhd\",\"type\":\"sl\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        CustomerInsightsManager manager = CustomerInsightsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ConnectorMappingResourceFormat> response = manager.connectorMappings()
            .listByConnector("bjmbnvynfaooeac", "edcgl", "kakddidahzllrqm", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(ConnectorTypes.EXCHANGE_ONLINE, response.iterator().next().connectorType());
        Assertions.assertEquals(EntityTypes.RELATIONSHIP, response.iterator().next().entityType());
        Assertions.assertEquals("pffmnoii", response.iterator().next().entityTypeName());
        Assertions.assertEquals("a", response.iterator().next().displayName());
        Assertions.assertEquals("rdsjrho", response.iterator().next().description());
        Assertions.assertEquals("jwyblvtbdmvsb", response.iterator().next().mappingProperties().folderPath());
        Assertions.assertEquals("daelqpv", response.iterator().next().mappingProperties().fileFilter());
        Assertions.assertEquals(true, response.iterator().next().mappingProperties().hasHeader());
        Assertions.assertEquals(ErrorManagementTypes.STOP_IMPORT,
            response.iterator().next().mappingProperties().errorManagement().errorManagementType());
        Assertions.assertEquals(772953368,
            response.iterator().next().mappingProperties().errorManagement().errorLimit());
        Assertions.assertEquals("botlog", response.iterator().next().mappingProperties().format().columnDelimiter());
        Assertions.assertEquals("usxursuiv", response.iterator().next().mappingProperties().format().acceptLanguage());
        Assertions.assertEquals("cjkcoqwczsyiqri",
            response.iterator().next().mappingProperties().format().quoteCharacter());
        Assertions.assertEquals("wihvaangqtnh",
            response.iterator().next().mappingProperties().format().quoteEscapeCharacter());
        Assertions.assertEquals("fdmfdvbbaexxjfwt",
            response.iterator().next().mappingProperties().format().arraySeparator());
        Assertions.assertEquals(FrequencyTypes.MINUTE,
            response.iterator().next().mappingProperties().availability().frequency());
        Assertions.assertEquals(1215585734, response.iterator().next().mappingProperties().availability().interval());
        Assertions.assertEquals("auigvmuaf",
            response.iterator().next().mappingProperties().structure().get(0).propertyName());
        Assertions.assertEquals("czfedyuep",
            response.iterator().next().mappingProperties().structure().get(0).columnName());
        Assertions.assertEquals("pl",
            response.iterator().next().mappingProperties().structure().get(0).customFormatSpecifier());
        Assertions.assertEquals(false, response.iterator().next().mappingProperties().structure().get(0).isEncrypted());
        Assertions.assertEquals(CompletionOperationTypes.DO_NOTHING,
            response.iterator().next().mappingProperties().completeOperation().completionOperationType());
        Assertions.assertEquals("w",
            response.iterator().next().mappingProperties().completeOperation().destinationFolder());
    }
}
