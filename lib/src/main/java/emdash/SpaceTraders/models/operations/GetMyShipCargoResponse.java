/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package emdash.SpaceTraders.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetMyShipCargoResponse {
    
    public String contentType;

    public GetMyShipCargoResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public GetMyShipCargoResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetMyShipCargoResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public GetMyShipCargo200ApplicationJSON getMyShipCargo200ApplicationJSONObject;

    public GetMyShipCargoResponse withGetMyShipCargo200ApplicationJSONObject(GetMyShipCargo200ApplicationJSON getMyShipCargo200ApplicationJSONObject) {
        this.getMyShipCargo200ApplicationJSONObject = getMyShipCargo200ApplicationJSONObject;
        return this;
    }
    
    public GetMyShipCargoResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
