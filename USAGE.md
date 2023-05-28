<!-- Start SDK Example Usage -->
```java
package hello.world;

import emdash.SpaceTraders.SpaceTraders;
import emdash.SpaceTraders.models.operations.GetStatusResponse;
import emdash.SpaceTraders.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SpaceTraders sdk = SpaceTraders.builder()
                .setSecurity(new Security("corrupti") {{
                    agentToken = "YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            GetStatusResponse res = sdk.getStatus();

            if (res.getStatus200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage -->