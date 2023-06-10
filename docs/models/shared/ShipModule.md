# ShipModule

A module can be installed in a ship and provides a set of capabilities such as storage space or quarters for crew. Module installations are permanent.


## Fields

| Field                                                       | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `capacity`                                                  | *Long*                                                      | :heavy_minus_sign:                                          | N/A                                                         |
| `description`                                               | *String*                                                    | :heavy_minus_sign:                                          | N/A                                                         |
| `name`                                                      | *String*                                                    | :heavy_check_mark:                                          | N/A                                                         |
| `range`                                                     | *Long*                                                      | :heavy_minus_sign:                                          | N/A                                                         |
| `requirements`                                              | [ShipRequirements](../../models/shared/ShipRequirements.md) | :heavy_check_mark:                                          | The requirements for installation on a ship                 |
| `symbol`                                                    | [ShipModuleSymbol](../../models/shared/ShipModuleSymbol.md) | :heavy_check_mark:                                          | N/A                                                         |