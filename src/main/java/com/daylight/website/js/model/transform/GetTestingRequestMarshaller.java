/**
 * null
 */
package com.daylight.website.js.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.daylight.website.js.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetTestingRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetTestingRequestMarshaller {

    private static final MarshallingInfo<String> PARAM1_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("param1").build();
    private static final MarshallingInfo<String> PARAM2_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("param2").build();

    private static final GetTestingRequestMarshaller instance = new GetTestingRequestMarshaller();

    public static GetTestingRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetTestingRequest getTestingRequest, ProtocolMarshaller protocolMarshaller) {

        if (getTestingRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getTestingRequest.getParam1(), PARAM1_BINDING);
            protocolMarshaller.marshall(getTestingRequest.getParam2(), PARAM2_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
