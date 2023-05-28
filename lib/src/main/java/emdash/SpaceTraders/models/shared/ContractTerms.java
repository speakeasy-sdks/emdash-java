/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package emdash.SpaceTraders.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import emdash.SpaceTraders.utils.DateTimeDeserializer;
import emdash.SpaceTraders.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

public class ContractTerms {
    /**
     * The deadline for the contract.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("deadline")
    public OffsetDateTime deadline;

    public ContractTerms withDeadline(OffsetDateTime deadline) {
        this.deadline = deadline;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deliver")
    public ContractDeliverGood[] deliver;

    public ContractTerms withDeliver(ContractDeliverGood[] deliver) {
        this.deliver = deliver;
        return this;
    }
    
    @JsonProperty("payment")
    public ContractPayment payment;

    public ContractTerms withPayment(ContractPayment payment) {
        this.payment = payment;
        return this;
    }
    
    public ContractTerms(@JsonProperty("deadline") OffsetDateTime deadline, @JsonProperty("payment") ContractPayment payment) {
        this.deadline = deadline;
        this.payment = payment;
  }
}
