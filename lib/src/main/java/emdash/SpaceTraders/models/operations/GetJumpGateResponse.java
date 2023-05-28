/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package emdash.SpaceTraders.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetJumpGateResponse {
    
    public String contentType;

    public GetJumpGateResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public GetJumpGateResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetJumpGateResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public GetJumpGate200ApplicationJSON getJumpGate200ApplicationJSONObject;

    public GetJumpGateResponse withGetJumpGate200ApplicationJSONObject(GetJumpGate200ApplicationJSON getJumpGate200ApplicationJSONObject) {
        this.getJumpGate200ApplicationJSONObject = getJumpGate200ApplicationJSONObject;
        return this;
    }
    
    public GetJumpGateResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
