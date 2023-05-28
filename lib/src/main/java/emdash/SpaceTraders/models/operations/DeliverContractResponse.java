/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package emdash.SpaceTraders.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class DeliverContractResponse {
    
    public String contentType;

    public DeliverContractResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public DeliverContractResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public DeliverContractResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public DeliverContract200ApplicationJSON deliverContract200ApplicationJSONObject;

    public DeliverContractResponse withDeliverContract200ApplicationJSONObject(DeliverContract200ApplicationJSON deliverContract200ApplicationJSONObject) {
        this.deliverContract200ApplicationJSONObject = deliverContract200ApplicationJSONObject;
        return this;
    }
    
    public DeliverContractResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
