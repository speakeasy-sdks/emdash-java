/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package emdash.SpaceTraders.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetShipCooldown200ApplicationJSON - OK
 */
public class GetShipCooldown200ApplicationJSON {
    /**
     * A cooldown is a period of time in which a ship cannot perform certain actions.
     */
    @JsonProperty("data")
    public emdash.SpaceTraders.models.shared.Cooldown data;

    public GetShipCooldown200ApplicationJSON withData(emdash.SpaceTraders.models.shared.Cooldown data) {
        this.data = data;
        return this;
    }
    
    public GetShipCooldown200ApplicationJSON(@JsonProperty("data") emdash.SpaceTraders.models.shared.Cooldown data) {
        this.data = data;
  }
}
