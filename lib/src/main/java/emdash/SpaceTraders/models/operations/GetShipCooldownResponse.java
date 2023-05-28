/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package emdash.SpaceTraders.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetShipCooldownResponse {
    
    public String contentType;

    public GetShipCooldownResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public GetShipCooldownResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetShipCooldownResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public GetShipCooldown200ApplicationJSON getShipCooldown200ApplicationJSONObject;

    public GetShipCooldownResponse withGetShipCooldown200ApplicationJSONObject(GetShipCooldown200ApplicationJSON getShipCooldown200ApplicationJSONObject) {
        this.getShipCooldown200ApplicationJSONObject = getShipCooldown200ApplicationJSONObject;
        return this;
    }
    
    public GetShipCooldownResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
