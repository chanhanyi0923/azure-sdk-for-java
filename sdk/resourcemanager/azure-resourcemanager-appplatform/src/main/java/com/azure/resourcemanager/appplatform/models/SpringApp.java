// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appplatform.fluent.models.AppResourceInner;
import com.azure.resourcemanager.resources.fluentcore.arm.models.ExternalChildResource;
import com.azure.resourcemanager.resources.fluentcore.model.Appliable;
import com.azure.resourcemanager.resources.fluentcore.model.Creatable;
import com.azure.resourcemanager.resources.fluentcore.model.HasInnerModel;
import com.azure.resourcemanager.resources.fluentcore.model.Updatable;
import reactor.core.publisher.Mono;

/** An immutable client-side representation of an Azure Spring App. */
@Fluent
public interface SpringApp extends ExternalChildResource<SpringApp, SpringService>, HasInnerModel<AppResourceInner>,
    Updatable<SpringApp.Update> {
    /**
     * Check whether the app exposes public endpoint.
     *
     * @return whether the app exposes public endpoint
     */
    boolean isPublic();

    /**
     * Check whether only HTTPS is allowed for the app.
     *
     * @return whether only HTTPS is allowed for the app
     */
    boolean isHttpsOnly();

    /**
     * Gets the URL of the app.
     *
     * @return the URL of the app
     */
    String url();

    /**
     * Gets the fully qualified domain name (FQDN) of the app.
     *
     * @return the fully qualified domain name (FQDN) of the app
     */
    String fqdn();

    /**
     * Gets the temporary disk of the app.
     *
     * @return the temporary disk of the app
     */
    TemporaryDisk temporaryDisk();

    /**
     * Gets the persistent disk of the app.
     *
     * @return the persistent disk of the app
     */
    PersistentDisk persistentDisk();

    /**
     * Gets the identity property of the app.
     *
     * @return the identity property of the app
     */
    ManagedIdentityProperties identity();

    /**
     * Gets the active deployment name.
     *
     * @return the active deployment name
     */
    String activeDeploymentName();

    /**
     * Gets the active deployment.
     *
     * @return the active deployment
     */
    SpringAppDeployment getActiveDeployment();

    /**
     * Gets the active deployment.
     *
     * @return the active deployment
     */
    Mono<SpringAppDeployment> getActiveDeploymentAsync();

    /**
     * Gets the entry point of the spring app deployment.
     * @param <T> derived type of {@link SpringAppDeployment.DefinitionStages.WithCreate}
     * @return the entry point of the spring app deployment
     */
    <T extends SpringAppDeployment.DefinitionStages.WithCreate<T>> SpringAppDeployments<T> deployments();

    /**
     * Gets the entry point of the spring app service binding.
     *
     * @return the entry point of the spring app service binding
     */
    SpringAppServiceBindings serviceBindings();

    /**
     * Gets the entry point of the spring app custom domain.
     *
     * @return the entry point of the spring app custom domain
     */
    SpringAppDomains customDomains();

    /**
     * Gets the blob url to upload deployment
     *
     * @return the blob url to upload deployment
     */
    Mono<ResourceUploadDefinition> getResourceUploadUrlAsync();

    /**
     * Gets the blob url to upload deployment
     *
     * @return the blob url to upload deployment.
     */
    ResourceUploadDefinition getResourceUploadUrl();

    /**
     * Check whether this app has binding to the default Configuration Service.
     * (Enterprise Tier Only)
     * @return whether this app has binding to the default Configuration Service
     */
    boolean hasConfigurationServiceBinding();

    /**
     * Check whether this app has binding to the default Service Registry.
     * (Enterprise Tier Only)
     * @return whether this app has binding to the default Service Registry
     */
    boolean hasServiceRegistryBinding();

    /** Container interface for all the definitions that need to be implemented. */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithCreate {
    }

    /** Grouping of all the spring app definition stages. */
    interface DefinitionStages {
        /** The first stage of the spring app definition. */
        interface Blank extends WithDeployment {
        }

        /**
         * The stage of a spring app definition allowing to specify an active deployment.
         */
        interface WithDeployment {
            /**
             * Deploys a default package for the spring app with default scale.
             * @return the next stage of spring app definition
             */
            WithCreate withDefaultActiveDeployment();

            /**
             * Starts the definition of the active deployment for the spring app.
             * @param name the name of the deployment
             * @param <T> derived type of {@link SpringAppDeployment.DefinitionStages.WithAttach}
             * @return the first stage of spring app deployment definition
             */
            <T extends SpringAppDeployment.DefinitionStages.WithAttach<? extends SpringApp.DefinitionStages.WithCreate, T>>
                SpringAppDeployment.DefinitionStages.Blank<T> defineActiveDeployment(String name);
        }

        /** The stage of a spring app definition allowing to specify the endpoint. */
        interface WithEndpoint {
            /**
             * Enables the default public endpoint for the spring app.
             * @return the next stage of spring app definition
             */
            WithCreate withDefaultPublicEndpoint();

            /**
             * Specifies the custom domain for the spring app.
             * @param domain the domain name
             * @return the next stage of spring app definition
             */
            WithCreate withCustomDomain(String domain);

            /**
             * Specifies the custom domain for the spring app.
             * @param domain the domain name
             * @param certThumbprint the thumbprint of certificate for https
             * @return the next stage of spring app update
             */
            WithCreate withCustomDomain(String domain, String certThumbprint);

            /**
             * Enables https only for the spring app.
             * @return the next stage of spring app definition
             */
            WithCreate withHttpsOnly();
        }

        /** The stage of a spring app definition allowing to specify the disk. */
        interface WithDisk {
            /**
             * Specifies the temporary disk for the spring app.
             * @param sizeInGB the size of the disk
             * @param mountPath the mount path of the disk
             * @return the next stage of spring app definition
             */
            WithCreate withTemporaryDisk(int sizeInGB, String mountPath);

            /**
             * Specifies the persistent disk for the spring app.
             * @param sizeInGB the size of the disk
             * @param mountPath the mount path of the disk
             * @return the next stage of spring app definition
             */
            WithCreate withPersistentDisk(int sizeInGB, String mountPath);
        }

        /** The stage of a spring app definition allowing to specify the service binding. */
        interface WithServiceBinding {
            /**
             * Specifies a service binding for the spring app.
             * @param name the service binding name
             * @param bindingProperties the property for the service binding
             * @return the next stage of spring app definition
             */
            WithCreate withServiceBinding(String name, BindingResourceProperties bindingProperties);

            /**
             * Removes a service binding for the spring app.
             * @param name the service binding name
             * @return the next stage of spring app definition
             */
            WithCreate withoutServiceBinding(String name);
        }

        /**
         * (Enterprise Tier Only)
         * The stage of spring app definition allowing to bind it to default configuration service.
         */
        interface WithConfigurationServiceBinding {
            /**
             * Specifies a binding to the default configuration service.
             * To use the centralized configurations, you must bind the app to Application Configuration Service for Tanzu.
             * When you change the bind/unbind status, you must restart or redeploy the app to for the binding to take effect.
             * @return the next stage of spring app definition
             */
            WithCreate withConfigurationServiceBinding();

            /**
             * Removes a binding to the default configuration service.
             * When you change the bind/unbind status, you must restart or redeploy the app to for the binding to take effect.
             * @return the next stage of spring app definition
             */
            WithCreate withoutConfigurationServiceBinding();
        }

        /**
         * (Enterprise Tier Only)
         * The stage of spring app definition allowing to bind it to service registry.
         */
        interface WithServiceRegistryBinding {
            /**
             * Specifies a binding to the default service registry.
             * When you change the bind/unbind status, you must restart or redeploy the app to for the binding to take effect.
             * @return the next stage of spring app definition
             */
            WithCreate withServiceRegistryBinding();

            /**
             * Removes a binding to the default service registry.
             * When you change the bind/unbind status, you must restart or redeploy the app to for the binding to take effect.
             * @return the next stage of spring app definition
             */
            WithCreate withoutServiceRegistryBinding();
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for the resource to be created,
         * but also allows for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<SpringApp>, DefinitionStages.WithEndpoint, DefinitionStages.WithDisk,
            DefinitionStages.WithDeployment, DefinitionStages.WithServiceBinding,
            DefinitionStages.WithConfigurationServiceBinding, DefinitionStages.WithServiceRegistryBinding {
        }
    }

    /** The template for an update operation, containing all the settings that can be modified. */
    interface Update extends Appliable<SpringApp>, UpdateStages.WithEndpoint, UpdateStages.WithDisk,
        UpdateStages.WithDeployment, UpdateStages.WithServiceBinding, UpdateStages.WithConfigurationServiceBinding,
        UpdateStages.WithServiceRegistryBinding {
    }

    /** Grouping of spring app update stages. */
    interface UpdateStages {
        /** The stage of a spring app update allowing to specify the endpoint. */
        interface WithEndpoint {
            /**
             * Enables the default public endpoint for the spring app.
             * @return the next stage of spring app update
             */
            Update withDefaultPublicEndpoint();

            /**
             * Disables the default public endpoint for the spring app.
             * @return the next stage of spring app update
             */
            Update withoutDefaultPublicEndpoint();

            /**
             * Specifies the custom domain for the spring app.
             * @param domain the domain name
             * @return the next stage of spring app update
             */
            Update withCustomDomain(String domain);

            /**
             * Specifies the custom domain for the spring app.
             * @param domain the domain name
             * @param certThumbprint the thumbprint of certificate for https
             * @return the next stage of spring app update
             */
            Update withCustomDomain(String domain, String certThumbprint);

            /**
             * Removes the custom domain for the spring app.
             * @param domain the domain name
             * @return the next stage of spring app update
             */
            Update withoutCustomDomain(String domain);

            /**
             * Enables https only for the spring app.
             * @return the next stage of spring app update
             */
            Update withHttpsOnly();

            /**
             * Disables https only for the spring app.
             * @return the next stage of spring app update
             */
            Update withoutHttpsOnly();
        }

        /** The stage of a spring app update allowing to specify the disk. */
        interface WithDisk {
            /**
             * Specifies the temporary disk for the spring app.
             * @param sizeInGB the size of the disk
             * @param mountPath the mount path of the disk
             * @return the next stage of spring app update
             */
            Update withTemporaryDisk(int sizeInGB, String mountPath);

            /**
             * Specifies the persistent disk for the spring app.
             * @param sizeInGB the size of the disk
             * @param mountPath the mount path of the disk
             * @return the next stage of spring app update
             */
            Update withPersistentDisk(int sizeInGB, String mountPath);
        }

        /**
         * The stage of a spring app update allowing to specify an simple active deployment.
         * for more operations, use {@link #deployments()}
         */
        interface WithDeployment {
            /**
             * Specifies active deployment for the spring app.
             * @param name the name of the deployment
             * @return the next stage of spring app update
             */
            Update withActiveDeployment(String name);
        }

        /** The stage of a spring app update allowing to specify the service binding. */
        interface WithServiceBinding {
            /**
             * Specifies a service binding for the spring app.
             * @param name the service binding name
             * @param bindingProperties the property for the service binding
             * @return the next stage of spring app update
             */
            Update withServiceBinding(String name, BindingResourceProperties bindingProperties);

            /**
             * Removes a service binding for the spring app.
             * @param name the service binding name
             * @return the next stage of spring app update
             */
            Update withoutServiceBinding(String name);
        }

        /**
         * (Enterprise Tier Only)
         * The stage of a spring app update allowing to bind it to the default configuration service.
         */
        interface WithConfigurationServiceBinding {
            /**
             * Specifies a binding to the default configuration service.
             * To use the centralized configurations, you must bind the app to Application Configuration Service for Tanzu.
             * When you change the bind/unbind status, you must restart or redeploy the app to for the binding to take effect.
             * @return the next stage of spring app update
             */
            Update withConfigurationServiceBinding();

            /**
             * Removes a binding to the default configuration service.
             * When you change the bind/unbind status, you must restart or redeploy the app to for the binding to take effect.
             * @return the next stage of spring app update
             */
            Update withoutConfigurationServiceBinding();
        }

        /**
         * (Enterprise Tier)
         * The stage of spring app update allowing to bind it to service registry.
         */
        interface WithServiceRegistryBinding {
            /**
             * Specifies a binding to the default service registry.
             * When you change the bind/unbind status, you must restart or redeploy the app to for the binding to take effect.
             * @return the next stage of spring app update
             */
            Update withServiceRegistryBinding();

            /**
             * Removes a binding to the default service registry.
             * When you change the bind/unbind status, you must restart or redeploy the app to for the binding to take effect.
             * @return the next stage of spring app update
             */
            Update withoutServiceRegistryBinding();
        }
    }
}
