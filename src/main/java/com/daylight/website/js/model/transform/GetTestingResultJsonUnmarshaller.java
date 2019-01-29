/**
 * null
 */
package com.daylight.website.js.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.daylight.website.js.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetTestingResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTestingResultJsonUnmarshaller implements Unmarshaller<GetTestingResult, JsonUnmarshallerContext> {

    public GetTestingResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetTestingResult getTestingResult = new GetTestingResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getTestingResult;
        }

        while (true) {
            if (token == null)
                break;

            getTestingResult.setEmpty(EmptyJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return getTestingResult;
    }

    private static GetTestingResultJsonUnmarshaller instance;

    public static GetTestingResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetTestingResultJsonUnmarshaller();
        return instance;
    }
}
