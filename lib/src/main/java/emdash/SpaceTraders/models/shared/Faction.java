/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package emdash.SpaceTraders.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Faction {
    @JsonProperty("description")
    public String description;

    public Faction withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonProperty("headquarters")
    public String headquarters;

    public Faction withHeadquarters(String headquarters) {
        this.headquarters = headquarters;
        return this;
    }
    
    /**
     * Whether or not the faction is currently recruiting new agents.
     */
    @JsonProperty("isRecruiting")
    public Boolean isRecruiting;

    public Faction withIsRecruiting(Boolean isRecruiting) {
        this.isRecruiting = isRecruiting;
        return this;
    }
    
    @JsonProperty("name")
    public String name;

    public Faction withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("symbol")
    public String symbol;

    public Faction withSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }
    
    @JsonProperty("traits")
    public FactionTrait[] traits;

    public Faction withTraits(FactionTrait[] traits) {
        this.traits = traits;
        return this;
    }
    
    public Faction(@JsonProperty("description") String description, @JsonProperty("headquarters") String headquarters, @JsonProperty("isRecruiting") Boolean isRecruiting, @JsonProperty("name") String name, @JsonProperty("symbol") String symbol, @JsonProperty("traits") FactionTrait[] traits) {
        this.description = description;
        this.headquarters = headquarters;
        this.isRecruiting = isRecruiting;
        this.name = name;
        this.symbol = symbol;
        this.traits = traits;
  }
}
