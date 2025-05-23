// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import java.util.List;

/** An immutable client-side representation of an Azure RegistryTaskStep registry task. */
@Fluent()
public interface RegistryTaskStep {
    /**
     * Gets the base image dependencies.
     *
     * @return the base image dependencies of this RegistryTaskStep
     */
    List<BaseImageDependency> baseImageDependencies();

    /**
     * Gets the context path.
     *
     * @return the context path of this RegistryTaskStep
     */
    String contextPath();
}
