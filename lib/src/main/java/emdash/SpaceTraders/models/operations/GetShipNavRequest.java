/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package emdash.SpaceTraders.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import emdash.SpaceTraders.utils.SpeakeasyMetadata;

public class GetShipNavRequest {
    /**
     * The ship symbol
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=shipSymbol")
    public String shipSymbol;

    public GetShipNavRequest withShipSymbol(String shipSymbol) {
        this.shipSymbol = shipSymbol;
        return this;
    }
    
    public GetShipNavRequest(@JsonProperty("shipSymbol") String shipSymbol) {
        this.shipSymbol = shipSymbol;
  }
}
