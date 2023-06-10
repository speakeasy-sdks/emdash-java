# contracts

## Overview

Contracts

### Available Operations

* [acceptContract](#acceptcontract) - Accept Contract
* [deliverContract](#delivercontract) - Deliver Contract
* [fulfillContract](#fulfillcontract) - Fulfill Contract
* [getContract](#getcontract) - Get Contract
* [getContracts](#getcontracts) - List Contracts

## acceptContract

Accept a contract.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.AcceptContractRequest;
import emdash.SpaceTraders.models.operations.AcceptContractResponse;
import emdash.SpaceTraders.models.operations.AcceptContractSecurity;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            AcceptContractRequest req = new AcceptContractRequest("suscipit");            

            AcceptContractResponse res = sdk.contracts.acceptContract(req, new AcceptContractSecurity("iure") {{
                agentToken = "";
            }});

            if (res.acceptContract200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [emdash.SpaceTraders.models.operations.AcceptContractRequest](../../models/operations/AcceptContractRequest.md)   | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |
| `security`                                                                                                        | [emdash.SpaceTraders.models.operations.AcceptContractSecurity](../../models/operations/AcceptContractSecurity.md) | :heavy_check_mark:                                                                                                | The security requirements to use for the request.                                                                 |


### Response

**[emdash.SpaceTraders.models.operations.AcceptContractResponse](../../models/operations/AcceptContractResponse.md)**


## deliverContract

Deliver cargo on a given contract.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.DeliverContractRequest;
import emdash.SpaceTraders.models.operations.DeliverContractRequestBody;
import emdash.SpaceTraders.models.operations.DeliverContractResponse;
import emdash.SpaceTraders.models.operations.DeliverContractSecurity;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            DeliverContractRequest req = new DeliverContractRequest("magnam") {{
                requestBody = new DeliverContractRequestBody("debitis", "ipsa", 963663L);;
            }};            

            DeliverContractResponse res = sdk.contracts.deliverContract(req, new DeliverContractSecurity("tempora") {{
                agentToken = "";
            }});

            if (res.deliverContract200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [emdash.SpaceTraders.models.operations.DeliverContractRequest](../../models/operations/DeliverContractRequest.md)   | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |
| `security`                                                                                                          | [emdash.SpaceTraders.models.operations.DeliverContractSecurity](../../models/operations/DeliverContractSecurity.md) | :heavy_check_mark:                                                                                                  | The security requirements to use for the request.                                                                   |


### Response

**[emdash.SpaceTraders.models.operations.DeliverContractResponse](../../models/operations/DeliverContractResponse.md)**


## fulfillContract

Fulfill a contract

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.FulfillContractRequest;
import emdash.SpaceTraders.models.operations.FulfillContractResponse;
import emdash.SpaceTraders.models.operations.FulfillContractSecurity;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            FulfillContractRequest req = new FulfillContractRequest("suscipit");            

            FulfillContractResponse res = sdk.contracts.fulfillContract(req, new FulfillContractSecurity("molestiae") {{
                agentToken = "";
            }});

            if (res.fulfillContract200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [emdash.SpaceTraders.models.operations.FulfillContractRequest](../../models/operations/FulfillContractRequest.md)   | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |
| `security`                                                                                                          | [emdash.SpaceTraders.models.operations.FulfillContractSecurity](../../models/operations/FulfillContractSecurity.md) | :heavy_check_mark:                                                                                                  | The security requirements to use for the request.                                                                   |


### Response

**[emdash.SpaceTraders.models.operations.FulfillContractResponse](../../models/operations/FulfillContractResponse.md)**


## getContract

Get the details of a contract by ID.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.GetContractRequest;
import emdash.SpaceTraders.models.operations.GetContractResponse;
import emdash.SpaceTraders.models.operations.GetContractSecurity;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            GetContractRequest req = new GetContractRequest("minus");            

            GetContractResponse res = sdk.contracts.getContract(req, new GetContractSecurity("placeat") {{
                agentToken = "";
            }});

            if (res.getContract200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [emdash.SpaceTraders.models.operations.GetContractRequest](../../models/operations/GetContractRequest.md)   | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |
| `security`                                                                                                  | [emdash.SpaceTraders.models.operations.GetContractSecurity](../../models/operations/GetContractSecurity.md) | :heavy_check_mark:                                                                                          | The security requirements to use for the request.                                                           |


### Response

**[emdash.SpaceTraders.models.operations.GetContractResponse](../../models/operations/GetContractResponse.md)**


## getContracts

List all of your contracts.

### Example Usage

```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.GetContractsRequest;
import emdash.SpaceTraders.models.operations.GetContractsResponse;
import emdash.SpaceTraders.models.operations.GetContractsSecurity;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .build();

            GetContractsRequest req = new GetContractsRequest() {{
                limit = 528895L;
                page = 479977L;
            }};            

            GetContractsResponse res = sdk.contracts.getContracts(req, new GetContractsSecurity("excepturi") {{
                agentToken = "";
            }});

            if (res.getContracts200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [emdash.SpaceTraders.models.operations.GetContractsRequest](../../models/operations/GetContractsRequest.md)   | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |
| `security`                                                                                                    | [emdash.SpaceTraders.models.operations.GetContractsSecurity](../../models/operations/GetContractsSecurity.md) | :heavy_check_mark:                                                                                            | The security requirements to use for the request.                                                             |


### Response

**[emdash.SpaceTraders.models.operations.GetContractsResponse](../../models/operations/GetContractsResponse.md)**

