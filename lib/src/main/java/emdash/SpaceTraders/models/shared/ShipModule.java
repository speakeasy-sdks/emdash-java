/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package emdash.SpaceTraders.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ShipModule - A module can be installed in a ship and provides a set of capabilities such as storage space or quarters for crew. Module installations are permanent.
 */
public class ShipModule {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("capacity")
    public Long capacity;

    public ShipModule withCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public ShipModule withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonProperty("name")
    public String name;

    public ShipModule withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("range")
    public Long range;

    public ShipModule withRange(Long range) {
        this.range = range;
        return this;
    }
    
    /**
     * The requirements for installation on a ship
     */
    @JsonProperty("requirements")
    public ShipRequirements requirements;

    public ShipModule withRequirements(ShipRequirements requirements) {
        this.requirements = requirements;
        return this;
    }
    
    @JsonProperty("symbol")
    public ShipModuleSymbol symbol;

    public ShipModule withSymbol(ShipModuleSymbol symbol) {
        this.symbol = symbol;
        return this;
    }
    
    public ShipModule(@JsonProperty("name") String name, @JsonProperty("requirements") ShipRequirements requirements, @JsonProperty("symbol") ShipModuleSymbol symbol) {
        this.name = name;
        this.requirements = requirements;
        this.symbol = symbol;
  }
}
