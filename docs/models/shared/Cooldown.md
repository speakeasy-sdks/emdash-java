# Cooldown

A cooldown is a period of time in which a ship cannot perform certain actions.


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `expiration`                                                                              | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_minus_sign:                                                                        | The date and time when the cooldown expires in ISO 8601 format                            |
| `remainingSeconds`                                                                        | *Long*                                                                                    | :heavy_check_mark:                                                                        | The remaining duration of the cooldown in seconds                                         |
| `shipSymbol`                                                                              | *String*                                                                                  | :heavy_check_mark:                                                                        | The symbol of the ship that is on cooldown                                                |
| `totalSeconds`                                                                            | *Long*                                                                                    | :heavy_check_mark:                                                                        | The total duration of the cooldown in seconds                                             |