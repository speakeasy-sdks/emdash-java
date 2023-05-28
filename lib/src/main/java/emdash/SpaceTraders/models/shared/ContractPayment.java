/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package emdash.SpaceTraders.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContractPayment {
    /**
     * The amount of credits received up front for accepting the contract.
     */
    @JsonProperty("onAccepted")
    public Long onAccepted;

    public ContractPayment withOnAccepted(Long onAccepted) {
        this.onAccepted = onAccepted;
        return this;
    }
    
    /**
     * The amount of credits received when the contract is fulfilled.
     */
    @JsonProperty("onFulfilled")
    public Long onFulfilled;

    public ContractPayment withOnFulfilled(Long onFulfilled) {
        this.onFulfilled = onFulfilled;
        return this;
    }
    
    public ContractPayment(@JsonProperty("onAccepted") Long onAccepted, @JsonProperty("onFulfilled") Long onFulfilled) {
        this.onAccepted = onAccepted;
        this.onFulfilled = onFulfilled;
  }
}
