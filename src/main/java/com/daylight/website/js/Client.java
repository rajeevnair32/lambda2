/**
 * null
 */
package com.daylight.website.js;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.regions.*;

import com.daylight.website.js.model.*;

/**
 * Interface for accessing Client.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface Client {

    /**
     * @param getTestingRequest
     * @return Result of the GetTesting operation returned by the service.
     * @sample Client.GetTesting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kmfa1837gg-2018-04-02T00:05:06Z/GetTesting"
     *      target="_top">AWS API Documentation</a>
     */
    GetTestingResult getTesting(GetTestingRequest getTestingRequest);

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static ClientClientBuilder builder() {
        return new ClientClientBuilder();
    }

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

}
