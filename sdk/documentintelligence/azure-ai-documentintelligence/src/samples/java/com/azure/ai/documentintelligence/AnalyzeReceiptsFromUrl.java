// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.documentintelligence;

import com.azure.ai.documentintelligence.models.AnalyzeDocumentOptions;
import com.azure.ai.documentintelligence.models.AnalyzeResult;
import com.azure.ai.documentintelligence.models.AnalyzeOperationDetails;
import com.azure.ai.documentintelligence.models.AnalyzedDocument;
import com.azure.ai.documentintelligence.models.DocumentField;
import com.azure.ai.documentintelligence.models.DocumentFieldType;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.util.polling.SyncPoller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 * Sample for analyzing commonly found receipt fields from a file source URL.
 * See fields found on a receipt <a href="https://aka.ms/formrecognizer/receiptfields">here</a>.
 *
 */
public class AnalyzeReceiptsFromUrl {

    /**
     * Main method to invoke this demo.
     *
     * @param args Unused. Arguments to the program.
     */
    public static void main(final String[] args) {
        // Instantiate a client that will be used to call the service.
        DocumentIntelligenceClient client = new DocumentIntelligenceClientBuilder()
            .credential(new AzureKeyCredential("{key}"))
            .endpoint("https://{endpoint}.cognitiveservices.azure.com/")
            .buildClient();

        String receiptUrl =
            "https://raw.githubusercontent.com/Azure/azure-sdk-for-java/main/sdk/documentintelligence"
                + "/azure-ai-documentintelligence/src/samples/resources/sample-forms/receipts/contoso-allinone.jpg";

        SyncPoller<AnalyzeOperationDetails, AnalyzeResult> analyzeReceiptPoller =
            client.beginAnalyzeDocument("prebuilt-receipt",
                new AnalyzeDocumentOptions(receiptUrl));

        AnalyzeResult receiptResults = analyzeReceiptPoller.getFinalResult();

        for (int i = 0; i < receiptResults.getDocuments().size(); i++) {
            AnalyzedDocument analyzedReceipt = receiptResults.getDocuments().get(i);
            Map<String, DocumentField> receiptFields = analyzedReceipt.getFields();
            System.out.printf("----------- Analyzing receipt info %d -----------%n", i);
            DocumentField merchantNameField = receiptFields.get("MerchantName");
            if (merchantNameField != null) {
                if (DocumentFieldType.STRING == merchantNameField.getType()) {
                    String merchantName = merchantNameField.getValueString();
                    System.out.printf("Merchant Name: %s, confidence: %.2f%n",
                        merchantName, merchantNameField.getConfidence());
                }
            }

            DocumentField merchantPhoneNumberField = receiptFields.get("MerchantPhoneNumber");
            if (merchantPhoneNumberField != null) {
                if (DocumentFieldType.PHONE_NUMBER == merchantPhoneNumberField.getType()) {
                    String merchantAddress = merchantPhoneNumberField.getValuePhoneNumber();
                    System.out.printf("Merchant Phone number: %s, confidence: %.2f%n",
                        merchantAddress, merchantPhoneNumberField.getConfidence());
                }
            }

            DocumentField merchantAddressField = receiptFields.get("MerchantAddress");
            if (merchantAddressField != null) {
                if (DocumentFieldType.STRING == merchantAddressField.getType()) {
                    String merchantAddress = merchantAddressField.getValueString();
                    System.out.printf("Merchant Address: %s, confidence: %.2f%n",
                        merchantAddress, merchantAddressField.getConfidence());
                }
            }

            DocumentField transactionDateField = receiptFields.get("TransactionDate");
            if (transactionDateField != null) {
                if (DocumentFieldType.DATE == transactionDateField.getType()) {
                    LocalDate transactionDate = transactionDateField.getValueDate();
                    System.out.printf("Transaction Date: %s, confidence: %.2f%n",
                        transactionDate, transactionDateField.getConfidence());
                }
            }

            DocumentField receiptItemsField = receiptFields.get("Items");
            if (receiptItemsField != null) {
                System.out.printf("Receipt Items: %n");
                if (DocumentFieldType.ARRAY == receiptItemsField.getType()) {
                    List<DocumentField> receiptItems = receiptItemsField.getValueList();
                    receiptItems.stream()
                        .filter(receiptItem -> DocumentFieldType.OBJECT == receiptItem.getType())
                        .map(documentField -> documentField.getValueMap())
                        .forEach(documentFieldMap -> documentFieldMap.forEach((key, documentField) -> {
                            if ("Name".equals(key)) {
                                if (DocumentFieldType.STRING == documentField.getType()) {
                                    String name = documentField.getValueString();
                                    System.out.printf("Name: %s, confidence: %.2fs%n",
                                        name, documentField.getConfidence());
                                }
                            }
                            if ("Quantity".equals(key)) {
                                if (DocumentFieldType.NUMBER == documentField.getType()) {
                                    Double quantity = documentField.getValueNumber();
                                    System.out.printf("Quantity: %f, confidence: %.2f%n",
                                        quantity, documentField.getConfidence());
                                }
                            }
                            if ("Price".equals(key)) {
                                if (DocumentFieldType.NUMBER == documentField.getType()) {
                                    Double price = documentField.getValueNumber();
                                    System.out.printf("Price: %f, confidence: %.2f%n",
                                        price, documentField.getConfidence());
                                }
                            }
                            if ("TotalPrice".equals(key)) {
                                if (DocumentFieldType.NUMBER == documentField.getType()) {
                                    Double totalPrice = documentField.getValueNumber();
                                    System.out.printf("Total Price: %f, confidence: %.2f%n",
                                        totalPrice, documentField.getConfidence());
                                }
                            }
                        }));
                }
            }
        }
    }
}
