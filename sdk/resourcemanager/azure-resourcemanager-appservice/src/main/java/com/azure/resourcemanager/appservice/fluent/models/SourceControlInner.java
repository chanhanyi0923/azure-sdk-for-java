// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * The source control OAuth token.
 */
@Fluent
public final class SourceControlInner extends ProxyOnlyResource {
    /*
     * SourceControl resource specific properties
     */
    private SourceControlProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of SourceControlInner class.
     */
    public SourceControlInner() {
    }

    /**
     * Get the innerProperties property: SourceControl resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private SourceControlProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SourceControlInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the token property: OAuth access token.
     * 
     * @return the token value.
     */
    public String token() {
        return this.innerProperties() == null ? null : this.innerProperties().token();
    }

    /**
     * Set the token property: OAuth access token.
     * 
     * @param token the token value to set.
     * @return the SourceControlInner object itself.
     */
    public SourceControlInner withToken(String token) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SourceControlProperties();
        }
        this.innerProperties().withToken(token);
        return this;
    }

    /**
     * Get the tokenSecret property: OAuth access token secret.
     * 
     * @return the tokenSecret value.
     */
    public String tokenSecret() {
        return this.innerProperties() == null ? null : this.innerProperties().tokenSecret();
    }

    /**
     * Set the tokenSecret property: OAuth access token secret.
     * 
     * @param tokenSecret the tokenSecret value to set.
     * @return the SourceControlInner object itself.
     */
    public SourceControlInner withTokenSecret(String tokenSecret) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SourceControlProperties();
        }
        this.innerProperties().withTokenSecret(tokenSecret);
        return this;
    }

    /**
     * Get the refreshToken property: OAuth refresh token.
     * 
     * @return the refreshToken value.
     */
    public String refreshToken() {
        return this.innerProperties() == null ? null : this.innerProperties().refreshToken();
    }

    /**
     * Set the refreshToken property: OAuth refresh token.
     * 
     * @param refreshToken the refreshToken value to set.
     * @return the SourceControlInner object itself.
     */
    public SourceControlInner withRefreshToken(String refreshToken) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SourceControlProperties();
        }
        this.innerProperties().withRefreshToken(refreshToken);
        return this;
    }

    /**
     * Get the expirationTime property: OAuth token expiration.
     * 
     * @return the expirationTime value.
     */
    public OffsetDateTime expirationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().expirationTime();
    }

    /**
     * Set the expirationTime property: OAuth token expiration.
     * 
     * @param expirationTime the expirationTime value to set.
     * @return the SourceControlInner object itself.
     */
    public SourceControlInner withExpirationTime(OffsetDateTime expirationTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SourceControlProperties();
        }
        this.innerProperties().withExpirationTime(expirationTime);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", kind());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SourceControlInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SourceControlInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SourceControlInner.
     */
    public static SourceControlInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SourceControlInner deserializedSourceControlInner = new SourceControlInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSourceControlInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedSourceControlInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedSourceControlInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedSourceControlInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedSourceControlInner.innerProperties = SourceControlProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSourceControlInner;
        });
    }
}
