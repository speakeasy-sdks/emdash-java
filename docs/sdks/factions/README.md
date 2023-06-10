# factions

## Overview

Factions

### Available Operations

* [getFaction](#getfaction) - Get Faction
* [getFactions](#getfactions) - List Factions

## getFaction

View the details of a faction.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.GetFactionRequest;
import emdash.SpaceTraders.models.operations.GetFactionResponse;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .setSecurity(new Security("nisi") {{
                    agentToken = "";
                }})
                .build();

            GetFactionRequest req = new GetFactionRequest("recusandae");            

            GetFactionResponse res = sdk.factions.getFaction(req);

            if (res.getFaction200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [emdash.SpaceTraders.models.operations.GetFactionRequest](../../models/operations/GetFactionRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |


### Response

**[emdash.SpaceTraders.models.operations.GetFactionResponse](../../models/operations/GetFactionResponse.md)**


## getFactions

List all discovered factions in the game.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.GetFactionsRequest;
import emdash.SpaceTraders.models.operations.GetFactionsResponse;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .setSecurity(new Security("temporibus") {{
                    agentToken = "";
                }})
                .build();

            GetFactionsRequest req = new GetFactionsRequest() {{
                limit = 71036L;
                page = 337396L;
            }};            

            GetFactionsResponse res = sdk.factions.getFactions(req);

            if (res.getFactions200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [emdash.SpaceTraders.models.operations.GetFactionsRequest](../../models/operations/GetFactionsRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |


### Response

**[emdash.SpaceTraders.models.operations.GetFactionsResponse](../../models/operations/GetFactionsResponse.md)**

