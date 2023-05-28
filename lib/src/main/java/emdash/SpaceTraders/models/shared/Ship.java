/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package emdash.SpaceTraders.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Ship - A ship
 */
public class Ship {
    @JsonProperty("cargo")
    public ShipCargo cargo;

    public Ship withCargo(ShipCargo cargo) {
        this.cargo = cargo;
        return this;
    }
    
    /**
     * The ship's crew service and maintain the ship's systems and equipment.
     */
    @JsonProperty("crew")
    public ShipCrew crew;

    public Ship withCrew(ShipCrew crew) {
        this.crew = crew;
        return this;
    }
    
    /**
     * The engine determines how quickly a ship travels between waypoints.
     */
    @JsonProperty("engine")
    public ShipEngine engine;

    public Ship withEngine(ShipEngine engine) {
        this.engine = engine;
        return this;
    }
    
    /**
     * The frame of the ship. The frame determines the number of modules and mounting points of the ship, as well as base fuel capacity. As the condition of the frame takes more wear, the ship will become more sluggish and less maneuverable.
     */
    @JsonProperty("frame")
    public ShipFrame frame;

    public Ship withFrame(ShipFrame frame) {
        this.frame = frame;
        return this;
    }
    
    /**
     * Details of the ship's fuel tanks including how much fuel was consumed during the last transit or action.
     */
    @JsonProperty("fuel")
    public ShipFuel fuel;

    public Ship withFuel(ShipFuel fuel) {
        this.fuel = fuel;
        return this;
    }
    
    @JsonProperty("modules")
    public ShipModule[] modules;

    public Ship withModules(ShipModule[] modules) {
        this.modules = modules;
        return this;
    }
    
    @JsonProperty("mounts")
    public ShipMount[] mounts;

    public Ship withMounts(ShipMount[] mounts) {
        this.mounts = mounts;
        return this;
    }
    
    /**
     * The navigation information of the ship.
     */
    @JsonProperty("nav")
    public ShipNav nav;

    public Ship withNav(ShipNav nav) {
        this.nav = nav;
        return this;
    }
    
    /**
     * The reactor of the ship. The reactor is responsible for powering the ship's systems and weapons.
     */
    @JsonProperty("reactor")
    public ShipReactor reactor;

    public Ship withReactor(ShipReactor reactor) {
        this.reactor = reactor;
        return this;
    }
    
    /**
     * The public registration information of the ship
     */
    @JsonProperty("registration")
    public ShipRegistration registration;

    public Ship withRegistration(ShipRegistration registration) {
        this.registration = registration;
        return this;
    }
    
    /**
     * The globally unique identifier of the ship in the following format: `[AGENT_SYMBOL]_[HEX_ID]`
     */
    @JsonProperty("symbol")
    public String symbol;

    public Ship withSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }
    
    public Ship(@JsonProperty("cargo") ShipCargo cargo, @JsonProperty("crew") ShipCrew crew, @JsonProperty("engine") ShipEngine engine, @JsonProperty("frame") ShipFrame frame, @JsonProperty("fuel") ShipFuel fuel, @JsonProperty("modules") ShipModule[] modules, @JsonProperty("mounts") ShipMount[] mounts, @JsonProperty("nav") ShipNav nav, @JsonProperty("reactor") ShipReactor reactor, @JsonProperty("registration") ShipRegistration registration, @JsonProperty("symbol") String symbol) {
        this.cargo = cargo;
        this.crew = crew;
        this.engine = engine;
        this.frame = frame;
        this.fuel = fuel;
        this.modules = modules;
        this.mounts = mounts;
        this.nav = nav;
        this.reactor = reactor;
        this.registration = registration;
        this.symbol = symbol;
  }
}
