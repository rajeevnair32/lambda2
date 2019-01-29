/**
 * null
 */
package com.daylight.website.js.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kmfa1837gg-2018-04-02T00:05:06Z/GetTesting" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTestingRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private String param1;

    private String param2;

    /**
     * @param param1
     */

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    /**
     * @return
     */

    public String getParam1() {
        return this.param1;
    }

    /**
     * @param param1
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestingRequest param1(String param1) {
        setParam1(param1);
        return this;
    }

    /**
     * @param param2
     */

    public void setParam2(String param2) {
        this.param2 = param2;
    }

    /**
     * @return
     */

    public String getParam2() {
        return this.param2;
    }

    /**
     * @param param2
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestingRequest param2(String param2) {
        setParam2(param2);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getParam1() != null)
            sb.append("Param1: ").append(getParam1()).append(",");
        if (getParam2() != null)
            sb.append("Param2: ").append(getParam2());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTestingRequest == false)
            return false;
        GetTestingRequest other = (GetTestingRequest) obj;
        if (other.getParam1() == null ^ this.getParam1() == null)
            return false;
        if (other.getParam1() != null && other.getParam1().equals(this.getParam1()) == false)
            return false;
        if (other.getParam2() == null ^ this.getParam2() == null)
            return false;
        if (other.getParam2() != null && other.getParam2().equals(this.getParam2()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParam1() == null) ? 0 : getParam1().hashCode());
        hashCode = prime * hashCode + ((getParam2() == null) ? 0 : getParam2().hashCode());
        return hashCode;
    }

    @Override
    public GetTestingRequest clone() {
        return (GetTestingRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public GetTestingRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
