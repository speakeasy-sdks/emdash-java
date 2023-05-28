/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package emdash.SpaceTraders.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetSystemWaypointsResponse {
    
    public String contentType;

    public GetSystemWaypointsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public GetSystemWaypointsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetSystemWaypointsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public GetSystemWaypoints200ApplicationJSON getSystemWaypoints200ApplicationJSONObject;

    public GetSystemWaypointsResponse withGetSystemWaypoints200ApplicationJSONObject(GetSystemWaypoints200ApplicationJSON getSystemWaypoints200ApplicationJSONObject) {
        this.getSystemWaypoints200ApplicationJSONObject = getSystemWaypoints200ApplicationJSONObject;
        return this;
    }
    
    public GetSystemWaypointsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
