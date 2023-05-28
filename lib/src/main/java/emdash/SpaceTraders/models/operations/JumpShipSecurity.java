/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package emdash.SpaceTraders.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import emdash.SpaceTraders.utils.SpeakeasyMetadata;

public class JumpShipSecurity {
    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=bearer,name=Authorization")
    public String agentToken;

    public JumpShipSecurity withAgentToken(String agentToken) {
        this.agentToken = agentToken;
        return this;
    }
    
    public JumpShipSecurity(@JsonProperty("AgentToken") String agentToken) {
        this.agentToken = agentToken;
  }
}
