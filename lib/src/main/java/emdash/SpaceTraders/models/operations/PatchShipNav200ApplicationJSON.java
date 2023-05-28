/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package emdash.SpaceTraders.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PatchShipNav200ApplicationJSON - The updated nav status of the ship.
 */
public class PatchShipNav200ApplicationJSON {
    /**
     * The navigation information of the ship.
     */
    @JsonProperty("data")
    public emdash.SpaceTraders.models.shared.ShipNav data;

    public PatchShipNav200ApplicationJSON withData(emdash.SpaceTraders.models.shared.ShipNav data) {
        this.data = data;
        return this;
    }
    
    public PatchShipNav200ApplicationJSON(@JsonProperty("data") emdash.SpaceTraders.models.shared.ShipNav data) {
        this.data = data;
  }
}
