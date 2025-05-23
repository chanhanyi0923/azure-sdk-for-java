// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * option A properties object.
 */
@Fluent
public final class ExternalNetworkPropertiesOptionAProperties extends Layer3IpPrefixProperties {
    /*
     * MTU to use for option A peering.
     */
    private Integer mtu;

    /*
     * Vlan identifier. Example : 501
     */
    private Integer vlanId;

    /*
     * Fabric ASN number. Example 65001
     */
    private Long fabricAsn;

    /*
     * Peer ASN number.Example : 28
     */
    private Long peerAsn;

    /*
     * BFD configuration properties
     */
    private BfdConfiguration bfdConfiguration;

    /*
     * Ingress Acl. ARM resource ID of Access Control Lists.
     */
    private String ingressAclId;

    /*
     * Egress Acl. ARM resource ID of Access Control Lists.
     */
    private String egressAclId;

    /**
     * Creates an instance of ExternalNetworkPropertiesOptionAProperties class.
     */
    public ExternalNetworkPropertiesOptionAProperties() {
    }

    /**
     * Get the mtu property: MTU to use for option A peering.
     * 
     * @return the mtu value.
     */
    public Integer mtu() {
        return this.mtu;
    }

    /**
     * Set the mtu property: MTU to use for option A peering.
     * 
     * @param mtu the mtu value to set.
     * @return the ExternalNetworkPropertiesOptionAProperties object itself.
     */
    public ExternalNetworkPropertiesOptionAProperties withMtu(Integer mtu) {
        this.mtu = mtu;
        return this;
    }

    /**
     * Get the vlanId property: Vlan identifier. Example : 501.
     * 
     * @return the vlanId value.
     */
    public Integer vlanId() {
        return this.vlanId;
    }

    /**
     * Set the vlanId property: Vlan identifier. Example : 501.
     * 
     * @param vlanId the vlanId value to set.
     * @return the ExternalNetworkPropertiesOptionAProperties object itself.
     */
    public ExternalNetworkPropertiesOptionAProperties withVlanId(Integer vlanId) {
        this.vlanId = vlanId;
        return this;
    }

    /**
     * Get the fabricAsn property: Fabric ASN number. Example 65001.
     * 
     * @return the fabricAsn value.
     */
    public Long fabricAsn() {
        return this.fabricAsn;
    }

    /**
     * Get the peerAsn property: Peer ASN number.Example : 28.
     * 
     * @return the peerAsn value.
     */
    public Long peerAsn() {
        return this.peerAsn;
    }

    /**
     * Set the peerAsn property: Peer ASN number.Example : 28.
     * 
     * @param peerAsn the peerAsn value to set.
     * @return the ExternalNetworkPropertiesOptionAProperties object itself.
     */
    public ExternalNetworkPropertiesOptionAProperties withPeerAsn(Long peerAsn) {
        this.peerAsn = peerAsn;
        return this;
    }

    /**
     * Get the bfdConfiguration property: BFD configuration properties.
     * 
     * @return the bfdConfiguration value.
     */
    public BfdConfiguration bfdConfiguration() {
        return this.bfdConfiguration;
    }

    /**
     * Set the bfdConfiguration property: BFD configuration properties.
     * 
     * @param bfdConfiguration the bfdConfiguration value to set.
     * @return the ExternalNetworkPropertiesOptionAProperties object itself.
     */
    public ExternalNetworkPropertiesOptionAProperties withBfdConfiguration(BfdConfiguration bfdConfiguration) {
        this.bfdConfiguration = bfdConfiguration;
        return this;
    }

    /**
     * Get the ingressAclId property: Ingress Acl. ARM resource ID of Access Control Lists.
     * 
     * @return the ingressAclId value.
     */
    public String ingressAclId() {
        return this.ingressAclId;
    }

    /**
     * Set the ingressAclId property: Ingress Acl. ARM resource ID of Access Control Lists.
     * 
     * @param ingressAclId the ingressAclId value to set.
     * @return the ExternalNetworkPropertiesOptionAProperties object itself.
     */
    public ExternalNetworkPropertiesOptionAProperties withIngressAclId(String ingressAclId) {
        this.ingressAclId = ingressAclId;
        return this;
    }

    /**
     * Get the egressAclId property: Egress Acl. ARM resource ID of Access Control Lists.
     * 
     * @return the egressAclId value.
     */
    public String egressAclId() {
        return this.egressAclId;
    }

    /**
     * Set the egressAclId property: Egress Acl. ARM resource ID of Access Control Lists.
     * 
     * @param egressAclId the egressAclId value to set.
     * @return the ExternalNetworkPropertiesOptionAProperties object itself.
     */
    public ExternalNetworkPropertiesOptionAProperties withEgressAclId(String egressAclId) {
        this.egressAclId = egressAclId;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalNetworkPropertiesOptionAProperties withPrimaryIpv4Prefix(String primaryIpv4Prefix) {
        super.withPrimaryIpv4Prefix(primaryIpv4Prefix);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalNetworkPropertiesOptionAProperties withPrimaryIpv6Prefix(String primaryIpv6Prefix) {
        super.withPrimaryIpv6Prefix(primaryIpv6Prefix);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalNetworkPropertiesOptionAProperties withSecondaryIpv4Prefix(String secondaryIpv4Prefix) {
        super.withSecondaryIpv4Prefix(secondaryIpv4Prefix);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalNetworkPropertiesOptionAProperties withSecondaryIpv6Prefix(String secondaryIpv6Prefix) {
        super.withSecondaryIpv6Prefix(secondaryIpv6Prefix);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (bfdConfiguration() != null) {
            bfdConfiguration().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("primaryIpv4Prefix", primaryIpv4Prefix());
        jsonWriter.writeStringField("primaryIpv6Prefix", primaryIpv6Prefix());
        jsonWriter.writeStringField("secondaryIpv4Prefix", secondaryIpv4Prefix());
        jsonWriter.writeStringField("secondaryIpv6Prefix", secondaryIpv6Prefix());
        jsonWriter.writeNumberField("mtu", this.mtu);
        jsonWriter.writeNumberField("vlanId", this.vlanId);
        jsonWriter.writeNumberField("peerASN", this.peerAsn);
        jsonWriter.writeJsonField("bfdConfiguration", this.bfdConfiguration);
        jsonWriter.writeStringField("ingressAclId", this.ingressAclId);
        jsonWriter.writeStringField("egressAclId", this.egressAclId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExternalNetworkPropertiesOptionAProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExternalNetworkPropertiesOptionAProperties if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExternalNetworkPropertiesOptionAProperties.
     */
    public static ExternalNetworkPropertiesOptionAProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExternalNetworkPropertiesOptionAProperties deserializedExternalNetworkPropertiesOptionAProperties
                = new ExternalNetworkPropertiesOptionAProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("primaryIpv4Prefix".equals(fieldName)) {
                    deserializedExternalNetworkPropertiesOptionAProperties.withPrimaryIpv4Prefix(reader.getString());
                } else if ("primaryIpv6Prefix".equals(fieldName)) {
                    deserializedExternalNetworkPropertiesOptionAProperties.withPrimaryIpv6Prefix(reader.getString());
                } else if ("secondaryIpv4Prefix".equals(fieldName)) {
                    deserializedExternalNetworkPropertiesOptionAProperties.withSecondaryIpv4Prefix(reader.getString());
                } else if ("secondaryIpv6Prefix".equals(fieldName)) {
                    deserializedExternalNetworkPropertiesOptionAProperties.withSecondaryIpv6Prefix(reader.getString());
                } else if ("mtu".equals(fieldName)) {
                    deserializedExternalNetworkPropertiesOptionAProperties.mtu = reader.getNullable(JsonReader::getInt);
                } else if ("vlanId".equals(fieldName)) {
                    deserializedExternalNetworkPropertiesOptionAProperties.vlanId
                        = reader.getNullable(JsonReader::getInt);
                } else if ("fabricASN".equals(fieldName)) {
                    deserializedExternalNetworkPropertiesOptionAProperties.fabricAsn
                        = reader.getNullable(JsonReader::getLong);
                } else if ("peerASN".equals(fieldName)) {
                    deserializedExternalNetworkPropertiesOptionAProperties.peerAsn
                        = reader.getNullable(JsonReader::getLong);
                } else if ("bfdConfiguration".equals(fieldName)) {
                    deserializedExternalNetworkPropertiesOptionAProperties.bfdConfiguration
                        = BfdConfiguration.fromJson(reader);
                } else if ("ingressAclId".equals(fieldName)) {
                    deserializedExternalNetworkPropertiesOptionAProperties.ingressAclId = reader.getString();
                } else if ("egressAclId".equals(fieldName)) {
                    deserializedExternalNetworkPropertiesOptionAProperties.egressAclId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExternalNetworkPropertiesOptionAProperties;
        });
    }
}
