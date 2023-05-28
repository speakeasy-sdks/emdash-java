/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package emdash.SpaceTraders.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ShipCrewRotation - The rotation of crew shifts. A stricter shift improves the ship's performance. A more relaxed shift improves the crew's morale.
 */
public enum ShipCrewRotation {
    STRICT("STRICT"),
    RELAXED("RELAXED");

    @JsonValue
    public final String value;

    private ShipCrewRotation(String value) {
        this.value = value;
    }
}
