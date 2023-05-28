/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package emdash.SpaceTraders.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarketTradeGood {
    /**
     * The price at which this good can be purchased from the market.
     */
    @JsonProperty("purchasePrice")
    public Long purchasePrice;

    public MarketTradeGood withPurchasePrice(Long purchasePrice) {
        this.purchasePrice = purchasePrice;
        return this;
    }
    
    /**
     * The price at which this good can be sold to the market.
     */
    @JsonProperty("sellPrice")
    public Long sellPrice;

    public MarketTradeGood withSellPrice(Long sellPrice) {
        this.sellPrice = sellPrice;
        return this;
    }
    
    /**
     * A rough estimate of the total supply of this good in the marketplace.
     */
    @JsonProperty("supply")
    public MarketTradeGoodSupply supply;

    public MarketTradeGood withSupply(MarketTradeGoodSupply supply) {
        this.supply = supply;
        return this;
    }
    
    /**
     * The symbol of the trade good.
     */
    @JsonProperty("symbol")
    public String symbol;

    public MarketTradeGood withSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }
    
    /**
     * The typical volume flowing through the market for this type of good. The larger the trade volume, the more stable prices will be.
     */
    @JsonProperty("tradeVolume")
    public Long tradeVolume;

    public MarketTradeGood withTradeVolume(Long tradeVolume) {
        this.tradeVolume = tradeVolume;
        return this;
    }
    
    public MarketTradeGood(@JsonProperty("purchasePrice") Long purchasePrice, @JsonProperty("sellPrice") Long sellPrice, @JsonProperty("supply") MarketTradeGoodSupply supply, @JsonProperty("symbol") String symbol, @JsonProperty("tradeVolume") Long tradeVolume) {
        this.purchasePrice = purchasePrice;
        this.sellPrice = sellPrice;
        this.supply = supply;
        this.symbol = symbol;
        this.tradeVolume = tradeVolume;
  }
}
