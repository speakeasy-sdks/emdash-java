# agents

## Overview

Agents

### Available Operations

* [getMyAgent](#getmyagent) - My Agent Details

## getMyAgent

Fetch your agent's details.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.GetMyAgentResponse;
import emdash.SpaceTraders.models.operations.GetMyAgentSecurity;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            GetMyAgentResponse res = sdk.agents.getMyAgent(new GetMyAgentSecurity("deserunt") {{
                agentToken = "";
            }});

            if (res.getMyAgent200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
