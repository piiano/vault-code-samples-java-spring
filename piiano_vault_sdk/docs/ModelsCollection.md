

# ModelsCollection


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**creationTime** | **OffsetDateTime** | The time when the collection was created in an RFC3339 format. |  [optional] [readonly] |
|**modificationTime** | **OffsetDateTime** | The time when the collection was last modified in an RFC3339 format. |  [optional] [readonly] |
|**name** | **String** | The name of the collection. |  |
|**properties** | [**List&lt;ModelsProperty&gt;**](ModelsProperty.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The schema prototype the collection is based on. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PERSONS | &quot;PERSONS&quot; |
| DATA | &quot;DATA&quot; |



