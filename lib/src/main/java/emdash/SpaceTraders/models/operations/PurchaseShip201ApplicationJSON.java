/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package emdash.SpaceTraders.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PurchaseShip201ApplicationJSON - Created
 */
public class PurchaseShip201ApplicationJSON {
    @JsonProperty("data")
    public PurchaseShip201ApplicationJSONData data;

    public PurchaseShip201ApplicationJSON withData(PurchaseShip201ApplicationJSONData data) {
        this.data = data;
        return this;
    }
    
    public PurchaseShip201ApplicationJSON(@JsonProperty("data") PurchaseShip201ApplicationJSONData data) {
        this.data = data;
  }
}
