// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Details of an inquired protectable item.
 */
@Fluent
public final class WorkloadInquiryDetails implements JsonSerializable<WorkloadInquiryDetails> {
    /*
     * Type of the Workload such as SQL, Oracle etc.
     */
    private String type;

    /*
     * Contains the protectable item Count inside this Container.
     */
    private Long itemCount;

    /*
     * Inquiry validation such as permissions and other backup validations.
     */
    private InquiryValidation inquiryValidation;

    /**
     * Creates an instance of WorkloadInquiryDetails class.
     */
    public WorkloadInquiryDetails() {
    }

    /**
     * Get the type property: Type of the Workload such as SQL, Oracle etc.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the Workload such as SQL, Oracle etc.
     * 
     * @param type the type value to set.
     * @return the WorkloadInquiryDetails object itself.
     */
    public WorkloadInquiryDetails withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the itemCount property: Contains the protectable item Count inside this Container.
     * 
     * @return the itemCount value.
     */
    public Long itemCount() {
        return this.itemCount;
    }

    /**
     * Set the itemCount property: Contains the protectable item Count inside this Container.
     * 
     * @param itemCount the itemCount value to set.
     * @return the WorkloadInquiryDetails object itself.
     */
    public WorkloadInquiryDetails withItemCount(Long itemCount) {
        this.itemCount = itemCount;
        return this;
    }

    /**
     * Get the inquiryValidation property: Inquiry validation such as permissions and other backup validations.
     * 
     * @return the inquiryValidation value.
     */
    public InquiryValidation inquiryValidation() {
        return this.inquiryValidation;
    }

    /**
     * Set the inquiryValidation property: Inquiry validation such as permissions and other backup validations.
     * 
     * @param inquiryValidation the inquiryValidation value to set.
     * @return the WorkloadInquiryDetails object itself.
     */
    public WorkloadInquiryDetails withInquiryValidation(InquiryValidation inquiryValidation) {
        this.inquiryValidation = inquiryValidation;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (inquiryValidation() != null) {
            inquiryValidation().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeNumberField("itemCount", this.itemCount);
        jsonWriter.writeJsonField("inquiryValidation", this.inquiryValidation);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WorkloadInquiryDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkloadInquiryDetails if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the WorkloadInquiryDetails.
     */
    public static WorkloadInquiryDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkloadInquiryDetails deserializedWorkloadInquiryDetails = new WorkloadInquiryDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedWorkloadInquiryDetails.type = reader.getString();
                } else if ("itemCount".equals(fieldName)) {
                    deserializedWorkloadInquiryDetails.itemCount = reader.getNullable(JsonReader::getLong);
                } else if ("inquiryValidation".equals(fieldName)) {
                    deserializedWorkloadInquiryDetails.inquiryValidation = InquiryValidation.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkloadInquiryDetails;
        });
    }
}
