package io.quarkiverse.cxf;

import java.util.List;
import java.util.Optional;

import io.quarkus.runtime.annotations.ConfigGroup;
import io.quarkus.runtime.annotations.ConfigItem;

/**
 * A class that provides configurable options of a CXF client.
 */
@ConfigGroup
public class CxfClientConfig {

    /**
     * The WSDL path
     */
    @ConfigItem(name = "wsdl")
    public Optional<String> wsdlPath;

    /**
     * The URL of the SOAP Binding, should be one of four values:
     * {@code "http://schemas.xmlsoap.org/wsdl/soap/http"} for SOAP11HTTP_BINDING<br/>
     * {@code "http://schemas.xmlsoap.org/wsdl/soap/http?mtom=true"} for SOAP11HTTP_MTOM_BINDING<br/>
     * {@code "http://www.w3.org/2003/05/soap/bindings/HTTP/"} for SOAP12HTTP_BINDING<br/>
     * {@code "http://www.w3.org/2003/05/soap/bindings/HTTP/?mtom=true"} for SOAP12HTTP_MTOM_BINDING<br/>
     */
    @ConfigItem
    public Optional<String> soapBinding;

    /**
     * The client endpoint URL
     */
    @ConfigItem
    public Optional<String> clientEndpointUrl;

    /**
     * The client interface
     */
    @ConfigItem
    public Optional<String> serviceInterface;

    /**
     * The client endpoint namespace
     */
    @ConfigItem
    public Optional<String> endpointNamespace;

    /**
     * The client endpoint name
     */
    @ConfigItem
    public Optional<String> endpointName;

    /**
     * The username for HTTP Basic auth
     */
    @ConfigItem
    public Optional<String> username;

    /**
     * The password for HTTP Basic auth
     */
    @ConfigItem
    public Optional<String> password;

    /**
     * The comma-separated list of Feature classes
     */
    @ConfigItem
    public Optional<List<String>> features;

    /**
     * The comma-separated list of Handler classes
     */
    @ConfigItem
    public Optional<List<String>> handlers;

    /**
     * The comma-separated list of InInterceptor classes
     */
    @ConfigItem
    public Optional<List<String>> inInterceptors;

    /**
     * The comma-separated list of OutInterceptor classes
     */
    @ConfigItem
    public Optional<List<String>> outInterceptors;

    /**
     * The comma-separated list of OutFaultInterceptor classes
     */
    @ConfigItem
    public Optional<List<String>> outFaultInterceptors;

    /**
     * The comma-separated list of InFaultInterceptor classes
     */
    @ConfigItem
    public Optional<List<String>> inFaultInterceptors;

    /**
     * Indicates whether this is an alternative proxy client configuration. If
     * true, then this configuration is ignored when configuring a client without
     * annotation `@CXFClient`.
     */
    @ConfigItem
    public boolean alternative = false;
}