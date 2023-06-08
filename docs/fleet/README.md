# fleet

## Overview

Fleet

### Available Operations

* [createChart](#createchart) - Create Chart
* [createShipShipScan](#createshipshipscan) - Scan Ships
* [createShipSystemScan](#createshipsystemscan) - Scan Systems
* [createShipWaypointScan](#createshipwaypointscan) - Scan Waypoints
* [createSurvey](#createsurvey) - Create Survey
* [dockShip](#dockship) - Dock Ship
* [extractResources](#extractresources) - Extract Resources
* [getMyShip](#getmyship) - Get Ship
* [getMyShipCargo](#getmyshipcargo) - Get Ship Cargo
* [getMyShips](#getmyships) - List Ships
* [getShipCooldown](#getshipcooldown) - Get Ship Cooldown
* [getShipNav](#getshipnav) - Get Ship Nav
* [jettison](#jettison) - Jettison Cargo
* [jumpShip](#jumpship) - Jump Ship
* [navigateShip](#navigateship) - Navigate Ship
* [negotiateContract](#negotiatecontract) - Negotiate Contract
* [orbitShip](#orbitship) - Orbit Ship
* [patchShipNav](#patchshipnav) - Patch Ship Nav
* [purchaseCargo](#purchasecargo) - Purchase Cargo
* [purchaseShip](#purchaseship) - Purchase Ship
* [refuelShip](#refuelship) - Refuel Ship
* [sellCargo](#sellcargo) - Sell Cargo
* [shipRefine](#shiprefine) - Ship Refine
* [transferCargo](#transfercargo) - Transfer Cargo
* [warpShip](#warpship) - Warp Ship

## createChart

Command a ship to chart the current waypoint.

Waypoints in the universe are uncharted by default. These locations will not show up in the API until they have been charted by a ship.

Charting a location will record your agent as the one who created the chart.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.CreateChartRequest;
import emdash.SpaceTraders.models.operations.CreateChartResponse;
import emdash.SpaceTraders.models.operations.CreateChartSecurity;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            CreateChartRequest req = new CreateChartRequest("veritatis");            

            CreateChartResponse res = sdk.fleet.createChart(req, new CreateChartSecurity("deserunt") {{
                agentToken = "";
            }});

            if (res.createChart201ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## createShipShipScan

Activate your ship's sensor arrays to scan for ship information.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.CreateShipShipScanRequest;
import emdash.SpaceTraders.models.operations.CreateShipShipScanResponse;
import emdash.SpaceTraders.models.operations.CreateShipShipScanSecurity;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            CreateShipShipScanRequest req = new CreateShipShipScanRequest("perferendis");            

            CreateShipShipScanResponse res = sdk.fleet.createShipShipScan(req, new CreateShipShipScanSecurity("ipsam") {{
                agentToken = "";
            }});

            if (res.createShipShipScan201ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## createShipSystemScan

Activate your ship's sensor arrays to scan for system information.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.CreateShipSystemScanRequest;
import emdash.SpaceTraders.models.operations.CreateShipSystemScanResponse;
import emdash.SpaceTraders.models.operations.CreateShipSystemScanSecurity;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            CreateShipSystemScanRequest req = new CreateShipSystemScanRequest("repellendus");            

            CreateShipSystemScanResponse res = sdk.fleet.createShipSystemScan(req, new CreateShipSystemScanSecurity("sapiente") {{
                agentToken = "";
            }});

            if (res.createShipSystemScan201ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## createShipWaypointScan

Activate your ship's sensor arrays to scan for waypoint information.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.CreateShipWaypointScanRequest;
import emdash.SpaceTraders.models.operations.CreateShipWaypointScanResponse;
import emdash.SpaceTraders.models.operations.CreateShipWaypointScanSecurity;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            CreateShipWaypointScanRequest req = new CreateShipWaypointScanRequest("quo");            

            CreateShipWaypointScanResponse res = sdk.fleet.createShipWaypointScan(req, new CreateShipWaypointScanSecurity("odit") {{
                agentToken = "";
            }});

            if (res.createShipWaypointScan201ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## createSurvey

If you want to target specific yields for an extraction, you can survey a waypoint, such as an asteroid field, and send the survey in the body of the extract request. Each survey may have multiple deposits, and if a symbol shows up more than once, that indicates a higher chance of extracting that resource.

Your ship will enter a cooldown between consecutive survey requests. Surveys will eventually expire after a period of time. Multiple ships can use the same survey for extraction.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.CreateSurveyRequest;
import emdash.SpaceTraders.models.operations.CreateSurveyResponse;
import emdash.SpaceTraders.models.operations.CreateSurveySecurity;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            CreateSurveyRequest req = new CreateSurveyRequest("at");            

            CreateSurveyResponse res = sdk.fleet.createSurvey(req, new CreateSurveySecurity("at") {{
                agentToken = "";
            }});

            if (res.createSurvey201ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## dockShip

Attempt to dock your ship at it's current location. Docking will only succeed if the waypoint is a dockable location, and your ship is capable of docking at the time of the request.

The endpoint is idempotent - successive calls will succeed even if the ship is already docked.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.DockShipRequest;
import emdash.SpaceTraders.models.operations.DockShipResponse;
import emdash.SpaceTraders.models.operations.DockShipSecurity;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            DockShipRequest req = new DockShipRequest("maiores");            

            DockShipResponse res = sdk.fleet.dockShip(req, new DockShipSecurity("molestiae") {{
                agentToken = "";
            }});

            if (res.dockShip200Response != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## extractResources

Extract resources from the waypoint into your ship. Send an optional survey as the payload to target specific yields.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.ExtractResourcesRequest;
import emdash.SpaceTraders.models.operations.ExtractResourcesRequestBody;
import emdash.SpaceTraders.models.operations.ExtractResourcesResponse;
import emdash.SpaceTraders.models.operations.ExtractResourcesSecurity;
import emdash.SpaceTraders.models.shared.Security;
import emdash.SpaceTraders.models.shared.Survey;
import emdash.SpaceTraders.models.shared.SurveyDeposit;
import emdash.SpaceTraders.models.shared.SurveySize;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            ExtractResourcesRequest req = new ExtractResourcesRequest("quod") {{
                requestBody = new ExtractResourcesRequestBody() {{
                    survey = new Survey(                new emdash.SpaceTraders.models.shared.SurveyDeposit[]{{
                                        add(new SurveyDeposit("totam") {{
                                            symbol = "esse";
                                        }}),
                                        add(new SurveyDeposit("dolorum") {{
                                            symbol = "porro";
                                        }}),
                                        add(new SurveyDeposit("nam") {{
                                            symbol = "dicta";
                                        }}),
                                        add(new SurveyDeposit("occaecati") {{
                                            symbol = "officia";
                                        }}),
                                    }}, OffsetDateTime.parse("2022-06-18T20:36:37.412Z"), "hic", SurveySize.LARGE, "totam");;
                }};;
            }};            

            ExtractResourcesResponse res = sdk.fleet.extractResources(req, new ExtractResourcesSecurity("beatae") {{
                agentToken = "";
            }});

            if (res.extractResources201ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getMyShip

Retrieve the details of your ship.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.GetMyShipRequest;
import emdash.SpaceTraders.models.operations.GetMyShipResponse;
import emdash.SpaceTraders.models.operations.GetMyShipSecurity;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            GetMyShipRequest req = new GetMyShipRequest("commodi");            

            GetMyShipResponse res = sdk.fleet.getMyShip(req, new GetMyShipSecurity("molestiae") {{
                agentToken = "";
            }});

            if (res.getMyShip200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getMyShipCargo

Retrieve the cargo of your ship.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.GetMyShipCargoRequest;
import emdash.SpaceTraders.models.operations.GetMyShipCargoResponse;
import emdash.SpaceTraders.models.operations.GetMyShipCargoSecurity;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            GetMyShipCargoRequest req = new GetMyShipCargoRequest("modi");            

            GetMyShipCargoResponse res = sdk.fleet.getMyShipCargo(req, new GetMyShipCargoSecurity("qui") {{
                agentToken = "";
            }});

            if (res.getMyShipCargo200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getMyShips

Retrieve all of your ships.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.GetMyShipsRequest;
import emdash.SpaceTraders.models.operations.GetMyShipsResponse;
import emdash.SpaceTraders.models.operations.GetMyShipsSecurity;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            GetMyShipsRequest req = new GetMyShipsRequest() {{
                limit = 774234L;
                page = 736918L;
            }};            

            GetMyShipsResponse res = sdk.fleet.getMyShips(req, new GetMyShipsSecurity("esse") {{
                agentToken = "";
            }});

            if (res.getMyShips200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getShipCooldown

Retrieve the details of your ship's reactor cooldown. Some actions such as activating your jump drive, scanning, or extracting resources taxes your reactor and results in a cooldown.

Your ship cannot perform additional actions until your cooldown has expired. The duration of your cooldown is relative to the power consumption of the related modules or mounts for the action taken.

Response returns a 204 status code (no-content) when the ship has no cooldown.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.GetShipCooldownRequest;
import emdash.SpaceTraders.models.operations.GetShipCooldownResponse;
import emdash.SpaceTraders.models.operations.GetShipCooldownSecurity;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            GetShipCooldownRequest req = new GetShipCooldownRequest("ipsum");            

            GetShipCooldownResponse res = sdk.fleet.getShipCooldown(req, new GetShipCooldownSecurity("excepturi") {{
                agentToken = "";
            }});

            if (res.getShipCooldown200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getShipNav

Get the current nav status of a ship.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.GetShipNavRequest;
import emdash.SpaceTraders.models.operations.GetShipNavResponse;
import emdash.SpaceTraders.models.operations.GetShipNavSecurity;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            GetShipNavRequest req = new GetShipNavRequest("aspernatur");            

            GetShipNavResponse res = sdk.fleet.getShipNav(req, new GetShipNavSecurity("perferendis") {{
                agentToken = "";
            }});

            if (res.getShipNav200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## jettison

Jettison cargo from your ship's cargo hold.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.JettisonRequest;
import emdash.SpaceTraders.models.operations.JettisonRequestBody;
import emdash.SpaceTraders.models.operations.JettisonResponse;
import emdash.SpaceTraders.models.operations.JettisonSecurity;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            JettisonRequest req = new JettisonRequest("ad") {{
                requestBody = new JettisonRequestBody("natus", 149675L);;
            }};            

            JettisonResponse res = sdk.fleet.jettison(req, new JettisonSecurity("iste") {{
                agentToken = "";
            }});

            if (res.jettison200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## jumpShip

Jump your ship instantly to a target system. When used while in orbit or docked to a jump gate waypoint, any ship can use this command. When used elsewhere, jumping requires a jump drive unit and consumes a unit of antimatter (which needs to be in your cargo).

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.JumpShipRequest;
import emdash.SpaceTraders.models.operations.JumpShipRequestBody;
import emdash.SpaceTraders.models.operations.JumpShipResponse;
import emdash.SpaceTraders.models.operations.JumpShipSecurity;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            JumpShipRequest req = new JumpShipRequest("dolor") {{
                requestBody = new JumpShipRequestBody("natus");;
            }};            

            JumpShipResponse res = sdk.fleet.jumpShip(req, new JumpShipSecurity("laboriosam") {{
                agentToken = "";
            }});

            if (res.jumpShip200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## navigateShip

Navigate to a target destination. The destination must be located within the same system as the ship. Navigating will consume the necessary fuel and supplies from the ship's manifest, and will pay out crew wages from the agent's account.

The returned response will detail the route information including the expected time of arrival. Most ship actions are unavailable until the ship has arrived at it's destination.

To travel between systems, see the ship's warp or jump actions.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.NavigateShipRequest;
import emdash.SpaceTraders.models.operations.NavigateShipRequestBody;
import emdash.SpaceTraders.models.operations.NavigateShipResponse;
import emdash.SpaceTraders.models.operations.NavigateShipSecurity;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            NavigateShipRequest req = new NavigateShipRequest("hic") {{
                requestBody = new NavigateShipRequestBody("saepe");;
            }};            

            NavigateShipResponse res = sdk.fleet.navigateShip(req, new NavigateShipSecurity("fuga") {{
                agentToken = "";
            }});

            if (res.navigateShip200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## negotiateContract

Negotiate Contract

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.NegotiateContractRequest;
import emdash.SpaceTraders.models.operations.NegotiateContractResponse;
import emdash.SpaceTraders.models.operations.NegotiateContractSecurity;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            NegotiateContractRequest req = new NegotiateContractRequest("in") {{
                requestBody = "corporis";
            }};            

            NegotiateContractResponse res = sdk.fleet.negotiateContract(req, new NegotiateContractSecurity("iste") {{
                agentToken = "";
            }});

            if (res.negotiateContract200Response != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## orbitShip

Attempt to move your ship into orbit at it's current location. The request will only succeed if your ship is capable of moving into orbit at the time of the request.

The endpoint is idempotent - successive calls will succeed even if the ship is already in orbit.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.OrbitShipRequest;
import emdash.SpaceTraders.models.operations.OrbitShipResponse;
import emdash.SpaceTraders.models.operations.OrbitShipSecurity;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            OrbitShipRequest req = new OrbitShipRequest("iure");            

            OrbitShipResponse res = sdk.fleet.orbitShip(req, new OrbitShipSecurity("saepe") {{
                agentToken = "";
            }});

            if (res.orbitShip200Response != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## patchShipNav

Update the nav data of a ship, such as the flight mode.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.PatchShipNavRequest;
import emdash.SpaceTraders.models.operations.PatchShipNavRequestBody;
import emdash.SpaceTraders.models.operations.PatchShipNavResponse;
import emdash.SpaceTraders.models.operations.PatchShipNavSecurity;
import emdash.SpaceTraders.models.shared.Security;
import emdash.SpaceTraders.models.shared.ShipNavFlightMode;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            PatchShipNavRequest req = new PatchShipNavRequest("quidem") {{
                requestBody = new PatchShipNavRequestBody() {{
                    flightMode = ShipNavFlightMode.DRIFT;
                }};;
            }};            

            PatchShipNavResponse res = sdk.fleet.patchShipNav(req, new PatchShipNavSecurity("ipsa") {{
                agentToken = "";
            }});

            if (res.patchShipNav200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## purchaseCargo

Purchase cargo.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.PurchaseCargoPurchaseCargoRequest;
import emdash.SpaceTraders.models.operations.PurchaseCargoRequest;
import emdash.SpaceTraders.models.operations.PurchaseCargoResponse;
import emdash.SpaceTraders.models.operations.PurchaseCargoSecurity;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            PurchaseCargoRequest req = new PurchaseCargoRequest("reiciendis") {{
                requestBody = new PurchaseCargoPurchaseCargoRequest("est", 653140L);;
            }};            

            PurchaseCargoResponse res = sdk.fleet.purchaseCargo(req, new PurchaseCargoSecurity("laborum") {{
                agentToken = "";
            }});

            if (res.purchaseCargo201Response != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## purchaseShip

Purchase a ship

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.PurchaseShipRequestBody;
import emdash.SpaceTraders.models.operations.PurchaseShipResponse;
import emdash.SpaceTraders.models.operations.PurchaseShipSecurity;
import emdash.SpaceTraders.models.shared.Security;
import emdash.SpaceTraders.models.shared.ShipType;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            PurchaseShipRequestBody req = new PurchaseShipRequestBody(ShipType.SHIP_MINING_DRONE, "dolorem");            

            PurchaseShipResponse res = sdk.fleet.purchaseShip(req, new PurchaseShipSecurity("corporis") {{
                agentToken = "";
            }});

            if (res.purchaseShip201ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## refuelShip

Refuel your ship from the local market.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.RefuelShipRequest;
import emdash.SpaceTraders.models.operations.RefuelShipResponse;
import emdash.SpaceTraders.models.operations.RefuelShipSecurity;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            RefuelShipRequest req = new RefuelShipRequest("explicabo");            

            RefuelShipResponse res = sdk.fleet.refuelShip(req, new RefuelShipSecurity("nobis") {{
                agentToken = "";
            }});

            if (res.refuelShip200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## sellCargo

Sell cargo.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.SellCargoRequest;
import emdash.SpaceTraders.models.operations.SellCargoResponse;
import emdash.SpaceTraders.models.operations.SellCargoSecurity;
import emdash.SpaceTraders.models.operations.SellCargoSellCargoRequest;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            SellCargoRequest req = new SellCargoRequest("enim") {{
                requestBody = new SellCargoSellCargoRequest("omnis", 363711L);;
            }};            

            SellCargoResponse res = sdk.fleet.sellCargo(req, new SellCargoSecurity("minima") {{
                agentToken = "";
            }});

            if (res.sellCargo201Response != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## shipRefine

Attempt to refine the raw materials on your ship. The request will only succeed if your ship is capable of refining at the time of the request.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.ShipRefineRequest;
import emdash.SpaceTraders.models.operations.ShipRefineRequestBody;
import emdash.SpaceTraders.models.operations.ShipRefineRequestBodyProduce;
import emdash.SpaceTraders.models.operations.ShipRefineResponse;
import emdash.SpaceTraders.models.operations.ShipRefineSecurity;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            ShipRefineRequest req = new ShipRefineRequest("excepturi") {{
                requestBody = new ShipRefineRequestBody(ShipRefineRequestBodyProduce.IRON);;
            }};            

            ShipRefineResponse res = sdk.fleet.shipRefine(req, new ShipRefineSecurity("iure") {{
                agentToken = "";
            }});

            if (res.shipRefine200Response != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## transferCargo

Transfer cargo between ships.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.TransferCargoRequest;
import emdash.SpaceTraders.models.operations.TransferCargoResponse;
import emdash.SpaceTraders.models.operations.TransferCargoSecurity;
import emdash.SpaceTraders.models.operations.TransferCargoTransferCargoRequest;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            TransferCargoRequest req = new TransferCargoRequest("culpa") {{
                requestBody = new TransferCargoTransferCargoRequest("doloribus", "sapiente", 102044L);;
            }};            

            TransferCargoResponse res = sdk.fleet.transferCargo(req, new TransferCargoSecurity("mollitia") {{
                agentToken = "";
            }});

            if (res.transferCargo200Response != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## warpShip

Warp your ship to a target destination in another system. Warping will consume the necessary fuel and supplies from the ship's manifest, and will pay out crew wages from the agent's account.

The returned response will detail the route information including the expected time of arrival. Most ship actions are unavailable until the ship has arrived at it's destination.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.WarpShipRequest;
import emdash.SpaceTraders.models.operations.WarpShipRequestBody;
import emdash.SpaceTraders.models.operations.WarpShipResponse;
import emdash.SpaceTraders.models.operations.WarpShipSecurity;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            WarpShipRequest req = new WarpShipRequest("dolorem") {{
                requestBody = new WarpShipRequestBody("culpa");;
            }};            

            WarpShipResponse res = sdk.fleet.warpShip(req, new WarpShipSecurity("consequuntur") {{
                agentToken = "";
            }});

            if (res.warpShip200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
