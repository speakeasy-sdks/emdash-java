/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package emdash.SpaceTraders.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PurchaseShip201ApplicationJSONData {
    @JsonProperty("agent")
    public emdash.SpaceTraders.models.shared.Agent agent;

    public PurchaseShip201ApplicationJSONData withAgent(emdash.SpaceTraders.models.shared.Agent agent) {
        this.agent = agent;
        return this;
    }
    
    /**
     * A ship
     */
    @JsonProperty("ship")
    public emdash.SpaceTraders.models.shared.Ship ship;

    public PurchaseShip201ApplicationJSONData withShip(emdash.SpaceTraders.models.shared.Ship ship) {
        this.ship = ship;
        return this;
    }
    
    @JsonProperty("transaction")
    public emdash.SpaceTraders.models.shared.ShipyardTransaction transaction;

    public PurchaseShip201ApplicationJSONData withTransaction(emdash.SpaceTraders.models.shared.ShipyardTransaction transaction) {
        this.transaction = transaction;
        return this;
    }
    
    public PurchaseShip201ApplicationJSONData(@JsonProperty("agent") emdash.SpaceTraders.models.shared.Agent agent, @JsonProperty("ship") emdash.SpaceTraders.models.shared.Ship ship, @JsonProperty("transaction") emdash.SpaceTraders.models.shared.ShipyardTransaction transaction) {
        this.agent = agent;
        this.ship = ship;
        this.transaction = transaction;
  }
}
