// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Property overrides on a subnet of a virtual network.
 */
@Fluent
public final class SubnetOverride implements JsonSerializable<SubnetOverride> {
    /*
     * The resource ID of the subnet.
     */
    private String resourceId;

    /*
     * The name given to the subnet within the lab.
     */
    private String labSubnetName;

    /*
     * Indicates whether this subnet can be used during virtual machine creation (i.e. Allow, Deny).
     */
    private UsagePermissionType useInVmCreationPermission;

    /*
     * Indicates whether public IP addresses can be assigned to virtual machines on this subnet (i.e. Allow, Deny).
     */
    private UsagePermissionType usePublicIpAddressPermission;

    /*
     * Properties that virtual machines on this subnet will share.
     */
    private SubnetSharedPublicIpAddressConfiguration sharedPublicIpAddressConfiguration;

    /*
     * The virtual network pool associated with this subnet.
     */
    private String virtualNetworkPoolName;

    /**
     * Creates an instance of SubnetOverride class.
     */
    public SubnetOverride() {
    }

    /**
     * Get the resourceId property: The resource ID of the subnet.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The resource ID of the subnet.
     * 
     * @param resourceId the resourceId value to set.
     * @return the SubnetOverride object itself.
     */
    public SubnetOverride withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the labSubnetName property: The name given to the subnet within the lab.
     * 
     * @return the labSubnetName value.
     */
    public String labSubnetName() {
        return this.labSubnetName;
    }

    /**
     * Set the labSubnetName property: The name given to the subnet within the lab.
     * 
     * @param labSubnetName the labSubnetName value to set.
     * @return the SubnetOverride object itself.
     */
    public SubnetOverride withLabSubnetName(String labSubnetName) {
        this.labSubnetName = labSubnetName;
        return this;
    }

    /**
     * Get the useInVmCreationPermission property: Indicates whether this subnet can be used during virtual machine
     * creation (i.e. Allow, Deny).
     * 
     * @return the useInVmCreationPermission value.
     */
    public UsagePermissionType useInVmCreationPermission() {
        return this.useInVmCreationPermission;
    }

    /**
     * Set the useInVmCreationPermission property: Indicates whether this subnet can be used during virtual machine
     * creation (i.e. Allow, Deny).
     * 
     * @param useInVmCreationPermission the useInVmCreationPermission value to set.
     * @return the SubnetOverride object itself.
     */
    public SubnetOverride withUseInVmCreationPermission(UsagePermissionType useInVmCreationPermission) {
        this.useInVmCreationPermission = useInVmCreationPermission;
        return this;
    }

    /**
     * Get the usePublicIpAddressPermission property: Indicates whether public IP addresses can be assigned to virtual
     * machines on this subnet (i.e. Allow, Deny).
     * 
     * @return the usePublicIpAddressPermission value.
     */
    public UsagePermissionType usePublicIpAddressPermission() {
        return this.usePublicIpAddressPermission;
    }

    /**
     * Set the usePublicIpAddressPermission property: Indicates whether public IP addresses can be assigned to virtual
     * machines on this subnet (i.e. Allow, Deny).
     * 
     * @param usePublicIpAddressPermission the usePublicIpAddressPermission value to set.
     * @return the SubnetOverride object itself.
     */
    public SubnetOverride withUsePublicIpAddressPermission(UsagePermissionType usePublicIpAddressPermission) {
        this.usePublicIpAddressPermission = usePublicIpAddressPermission;
        return this;
    }

    /**
     * Get the sharedPublicIpAddressConfiguration property: Properties that virtual machines on this subnet will share.
     * 
     * @return the sharedPublicIpAddressConfiguration value.
     */
    public SubnetSharedPublicIpAddressConfiguration sharedPublicIpAddressConfiguration() {
        return this.sharedPublicIpAddressConfiguration;
    }

    /**
     * Set the sharedPublicIpAddressConfiguration property: Properties that virtual machines on this subnet will share.
     * 
     * @param sharedPublicIpAddressConfiguration the sharedPublicIpAddressConfiguration value to set.
     * @return the SubnetOverride object itself.
     */
    public SubnetOverride withSharedPublicIpAddressConfiguration(
        SubnetSharedPublicIpAddressConfiguration sharedPublicIpAddressConfiguration) {
        this.sharedPublicIpAddressConfiguration = sharedPublicIpAddressConfiguration;
        return this;
    }

    /**
     * Get the virtualNetworkPoolName property: The virtual network pool associated with this subnet.
     * 
     * @return the virtualNetworkPoolName value.
     */
    public String virtualNetworkPoolName() {
        return this.virtualNetworkPoolName;
    }

    /**
     * Set the virtualNetworkPoolName property: The virtual network pool associated with this subnet.
     * 
     * @param virtualNetworkPoolName the virtualNetworkPoolName value to set.
     * @return the SubnetOverride object itself.
     */
    public SubnetOverride withVirtualNetworkPoolName(String virtualNetworkPoolName) {
        this.virtualNetworkPoolName = virtualNetworkPoolName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sharedPublicIpAddressConfiguration() != null) {
            sharedPublicIpAddressConfiguration().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("resourceId", this.resourceId);
        jsonWriter.writeStringField("labSubnetName", this.labSubnetName);
        jsonWriter.writeStringField("useInVmCreationPermission",
            this.useInVmCreationPermission == null ? null : this.useInVmCreationPermission.toString());
        jsonWriter.writeStringField("usePublicIpAddressPermission",
            this.usePublicIpAddressPermission == null ? null : this.usePublicIpAddressPermission.toString());
        jsonWriter.writeJsonField("sharedPublicIpAddressConfiguration", this.sharedPublicIpAddressConfiguration);
        jsonWriter.writeStringField("virtualNetworkPoolName", this.virtualNetworkPoolName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SubnetOverride from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SubnetOverride if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SubnetOverride.
     */
    public static SubnetOverride fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SubnetOverride deserializedSubnetOverride = new SubnetOverride();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resourceId".equals(fieldName)) {
                    deserializedSubnetOverride.resourceId = reader.getString();
                } else if ("labSubnetName".equals(fieldName)) {
                    deserializedSubnetOverride.labSubnetName = reader.getString();
                } else if ("useInVmCreationPermission".equals(fieldName)) {
                    deserializedSubnetOverride.useInVmCreationPermission
                        = UsagePermissionType.fromString(reader.getString());
                } else if ("usePublicIpAddressPermission".equals(fieldName)) {
                    deserializedSubnetOverride.usePublicIpAddressPermission
                        = UsagePermissionType.fromString(reader.getString());
                } else if ("sharedPublicIpAddressConfiguration".equals(fieldName)) {
                    deserializedSubnetOverride.sharedPublicIpAddressConfiguration
                        = SubnetSharedPublicIpAddressConfiguration.fromJson(reader);
                } else if ("virtualNetworkPoolName".equals(fieldName)) {
                    deserializedSubnetOverride.virtualNetworkPoolName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSubnetOverride;
        });
    }
}
