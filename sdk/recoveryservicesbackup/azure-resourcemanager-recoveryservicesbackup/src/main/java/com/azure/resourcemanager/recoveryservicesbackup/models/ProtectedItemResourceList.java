// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ProtectedItemResourceInner;
import java.io.IOException;
import java.util.List;

/**
 * List of ProtectedItem resources.
 */
@Fluent
public final class ProtectedItemResourceList extends ResourceList {
    /*
     * List of resources.
     */
    private List<ProtectedItemResourceInner> value;

    /**
     * Creates an instance of ProtectedItemResourceList class.
     */
    public ProtectedItemResourceList() {
    }

    /**
     * Get the value property: List of resources.
     * 
     * @return the value value.
     */
    public List<ProtectedItemResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of resources.
     * 
     * @param value the value value to set.
     * @return the ProtectedItemResourceList object itself.
     */
    public ProtectedItemResourceList withValue(List<ProtectedItemResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProtectedItemResourceList withNextLink(String nextLink) {
        super.withNextLink(nextLink);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("nextLink", nextLink());
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProtectedItemResourceList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProtectedItemResourceList if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ProtectedItemResourceList.
     */
    public static ProtectedItemResourceList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProtectedItemResourceList deserializedProtectedItemResourceList = new ProtectedItemResourceList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("nextLink".equals(fieldName)) {
                    deserializedProtectedItemResourceList.withNextLink(reader.getString());
                } else if ("value".equals(fieldName)) {
                    List<ProtectedItemResourceInner> value
                        = reader.readArray(reader1 -> ProtectedItemResourceInner.fromJson(reader1));
                    deserializedProtectedItemResourceList.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProtectedItemResourceList;
        });
    }
}
