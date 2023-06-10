# JumpGate


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `connectedSystems`                                                   | List<[ConnectedSystem](../../models/shared/ConnectedSystem.md)>      | :heavy_check_mark:                                                   | The systems within range of the gate that have a corresponding gate. |
| `factionSymbol`                                                      | *String*                                                             | :heavy_minus_sign:                                                   | The symbol of the faction that owns the gate.                        |
| `jumpRange`                                                          | *Double*                                                             | :heavy_check_mark:                                                   | The maximum jump range of the gate.                                  |