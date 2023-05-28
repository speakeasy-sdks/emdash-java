/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package emdash.SpaceTraders.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class FulfillContractResponse {
    
    public String contentType;

    public FulfillContractResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public FulfillContractResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public FulfillContractResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public FulfillContract200ApplicationJSON fulfillContract200ApplicationJSONObject;

    public FulfillContractResponse withFulfillContract200ApplicationJSONObject(FulfillContract200ApplicationJSON fulfillContract200ApplicationJSONObject) {
        this.fulfillContract200ApplicationJSONObject = fulfillContract200ApplicationJSONObject;
        return this;
    }
    
    public FulfillContractResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
