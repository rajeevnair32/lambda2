/**
 * null
 */
package com.daylight.website.js;

import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.opensdk.protect.client.SdkSyncClientBuilder;
import com.amazonaws.opensdk.internal.config.ApiGatewayClientConfigurationFactory;
import com.amazonaws.util.RuntimeHttpUtils;
import com.amazonaws.Protocol;

import java.net.URI;
import javax.annotation.Generated;

/**
 * Fluent builder for {@link com.daylight.website.js.Client}.
 * 
 * @see com.daylight.website.js.Client#builder
 **/
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class ClientClientBuilder extends SdkSyncClientBuilder<ClientClientBuilder, Client> {

    private static final URI DEFAULT_ENDPOINT = RuntimeHttpUtils.toUri("kmfa1837gg.execute-api.us-east-2.amazonaws.com", Protocol.HTTPS);
    private static final String DEFAULT_REGION = "us-east-2";

    /**
     * Package private constructor - builder should be created via {@link Client#builder()}
     */
    ClientClientBuilder() {
        super(new ApiGatewayClientConfigurationFactory());
    }

    /**
     * Construct a synchronous implementation of Client using the current builder configuration.
     *
     * @param params
     *        Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of Client.
     */
    @Override
    protected Client build(AwsSyncClientParams params) {
        return new ClientClient(params);
    }

    @Override
    protected URI defaultEndpoint() {
        return DEFAULT_ENDPOINT;
    }

    @Override
    protected String defaultRegion() {
        return DEFAULT_REGION;
    }

}
