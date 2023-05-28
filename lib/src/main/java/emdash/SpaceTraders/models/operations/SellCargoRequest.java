/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package emdash.SpaceTraders.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import emdash.SpaceTraders.utils.SpeakeasyMetadata;

public class SellCargoRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public SellCargoSellCargoRequest requestBody;

    public SellCargoRequest withRequestBody(SellCargoSellCargoRequest requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=shipSymbol")
    public String shipSymbol;

    public SellCargoRequest withShipSymbol(String shipSymbol) {
        this.shipSymbol = shipSymbol;
        return this;
    }
    
    public SellCargoRequest(@JsonProperty("shipSymbol") String shipSymbol) {
        this.shipSymbol = shipSymbol;
  }
}
