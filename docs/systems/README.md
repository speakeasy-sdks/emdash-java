# systems

## Overview

Systems

### Available Operations

* [getJumpGate](#getjumpgate) - Get Jump Gate
* [getMarket](#getmarket) - Get Market
* [getShipyard](#getshipyard) - Get Shipyard
* [getSystem](#getsystem) - Get System
* [getSystemWaypoints](#getsystemwaypoints) - List Waypoints
* [getSystems](#getsystems) - List Systems
* [getWaypoint](#getwaypoint) - Get Waypoint

## getJumpGate

Get jump gate details for a waypoint.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.GetJumpGateRequest;
import emdash.SpaceTraders.models.operations.GetJumpGateResponse;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .setSecurity(new Security("repellat") {{
                    agentToken = "YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            GetJumpGateRequest req = new GetJumpGateRequest("mollitia", "occaecati");            

            GetJumpGateResponse res = sdk.systems.getJumpGate(req);

            if (res.getJumpGate200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getMarket

Retrieve imports, exports and exchange data from a marketplace. Imports can be sold, exports can be purchased, and exchange goods can be purchased or sold. Send a ship to the waypoint to access trade good prices and recent transactions.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.GetMarketRequest;
import emdash.SpaceTraders.models.operations.GetMarketResponse;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .setSecurity(new Security("numquam") {{
                    agentToken = "YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            GetMarketRequest req = new GetMarketRequest("commodi", "quam");            

            GetMarketResponse res = sdk.systems.getMarket(req);

            if (res.getMarket200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getShipyard

Get the shipyard for a waypoint. Send a ship to the waypoint to access ships that are currently available for purchase and recent transactions.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.GetShipyardRequest;
import emdash.SpaceTraders.models.operations.GetShipyardResponse;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .setSecurity(new Security("molestiae") {{
                    agentToken = "YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            GetShipyardRequest req = new GetShipyardRequest("velit", "error");            

            GetShipyardResponse res = sdk.systems.getShipyard(req);

            if (res.getShipyard200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getSystem

Get the details of a system.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.GetSystemRequest;
import emdash.SpaceTraders.models.operations.GetSystemResponse;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .setSecurity(new Security("quia") {{
                    agentToken = "YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            GetSystemRequest req = new GetSystemRequest("quis");            

            GetSystemResponse res = sdk.systems.getSystem(req);

            if (res.getSystem200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getSystemWaypoints

Fetch all of the waypoints for a given system. System must be charted or a ship must be present to return waypoint details.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.GetSystemWaypointsRequest;
import emdash.SpaceTraders.models.operations.GetSystemWaypointsResponse;
import emdash.SpaceTraders.models.operations.GetSystemWaypointsSecurity;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            GetSystemWaypointsRequest req = new GetSystemWaypointsRequest("vitae") {{
                limit = 674752L;
                page = 656330L;
            }};            

            GetSystemWaypointsResponse res = sdk.systems.getSystemWaypoints(req, new GetSystemWaypointsSecurity("enim") {{
                agentToken = "YOUR_BEARER_TOKEN_HERE";
            }});

            if (res.getSystemWaypoints200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getSystems

Return a list of all systems.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.GetSystemsRequest;
import emdash.SpaceTraders.models.operations.GetSystemsResponse;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .setSecurity(new Security("odit") {{
                    agentToken = "YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            GetSystemsRequest req = new GetSystemsRequest() {{
                limit = 778346L;
                page = 196582L;
            }};            

            GetSystemsResponse res = sdk.systems.getSystems(req);

            if (res.getSystems200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getWaypoint

View the details of a waypoint.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.GetWaypointRequest;
import emdash.SpaceTraders.models.operations.GetWaypointResponse;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .setSecurity(new Security("tenetur") {{
                    agentToken = "YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            GetWaypointRequest req = new GetWaypointRequest("ipsam", "id");            

            GetWaypointResponse res = sdk.systems.getWaypoint(req);

            if (res.getWaypoint200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
