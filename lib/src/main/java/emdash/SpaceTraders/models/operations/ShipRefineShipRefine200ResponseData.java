/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package emdash.SpaceTraders.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShipRefineShipRefine200ResponseData {
    @JsonProperty("cargo")
    public emdash.SpaceTraders.models.shared.ShipCargo cargo;

    public ShipRefineShipRefine200ResponseData withCargo(emdash.SpaceTraders.models.shared.ShipCargo cargo) {
        this.cargo = cargo;
        return this;
    }
    
    @JsonProperty("consumed")
    public ShipRefineShipRefine200ResponseDataConsumed[] consumed;

    public ShipRefineShipRefine200ResponseData withConsumed(ShipRefineShipRefine200ResponseDataConsumed[] consumed) {
        this.consumed = consumed;
        return this;
    }
    
    /**
     * A cooldown is a period of time in which a ship cannot perform certain actions.
     */
    @JsonProperty("cooldown")
    public emdash.SpaceTraders.models.shared.Cooldown cooldown;

    public ShipRefineShipRefine200ResponseData withCooldown(emdash.SpaceTraders.models.shared.Cooldown cooldown) {
        this.cooldown = cooldown;
        return this;
    }
    
    @JsonProperty("produced")
    public ShipRefineShipRefine200ResponseDataProduced[] produced;

    public ShipRefineShipRefine200ResponseData withProduced(ShipRefineShipRefine200ResponseDataProduced[] produced) {
        this.produced = produced;
        return this;
    }
    
    public ShipRefineShipRefine200ResponseData(@JsonProperty("cargo") emdash.SpaceTraders.models.shared.ShipCargo cargo, @JsonProperty("consumed") ShipRefineShipRefine200ResponseDataConsumed[] consumed, @JsonProperty("cooldown") emdash.SpaceTraders.models.shared.Cooldown cooldown, @JsonProperty("produced") ShipRefineShipRefine200ResponseDataProduced[] produced) {
        this.cargo = cargo;
        this.consumed = consumed;
        this.cooldown = cooldown;
        this.produced = produced;
  }
}
