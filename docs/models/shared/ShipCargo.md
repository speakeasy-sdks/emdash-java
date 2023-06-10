# ShipCargo


## Fields

| Field                                                         | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `capacity`                                                    | *Long*                                                        | :heavy_check_mark:                                            | The max number of items that can be stored in the cargo hold. |
| `inventory`                                                   | List<[ShipCargoItem](../../models/shared/ShipCargoItem.md)>   | :heavy_check_mark:                                            | The items currently in the cargo hold.                        |
| `units`                                                       | *Long*                                                        | :heavy_check_mark:                                            | The number of items currently stored in the cargo hold.       |