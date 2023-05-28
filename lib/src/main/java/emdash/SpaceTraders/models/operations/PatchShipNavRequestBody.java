/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package emdash.SpaceTraders.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PatchShipNavRequestBody {
    /**
     * The ship's set speed when traveling between waypoints or systems.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("flightMode")
    public emdash.SpaceTraders.models.shared.ShipNavFlightMode flightMode;

    public PatchShipNavRequestBody withFlightMode(emdash.SpaceTraders.models.shared.ShipNavFlightMode flightMode) {
        this.flightMode = flightMode;
        return this;
    }
    
    public PatchShipNavRequestBody(){}
}
