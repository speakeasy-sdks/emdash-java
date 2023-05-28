/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package emdash.SpaceTraders.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class CreateShipSystemScanResponse {
    
    public String contentType;

    public CreateShipSystemScanResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public CreateShipSystemScanResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public CreateShipSystemScanResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Created
     */
    
    public CreateShipSystemScan201ApplicationJSON createShipSystemScan201ApplicationJSONObject;

    public CreateShipSystemScanResponse withCreateShipSystemScan201ApplicationJSONObject(CreateShipSystemScan201ApplicationJSON createShipSystemScan201ApplicationJSONObject) {
        this.createShipSystemScan201ApplicationJSONObject = createShipSystemScan201ApplicationJSONObject;
        return this;
    }
    
    public CreateShipSystemScanResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
