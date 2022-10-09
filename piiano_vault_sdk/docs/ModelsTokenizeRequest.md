

# ModelsTokenizeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fpprops** | **List&lt;String&gt;** | Format preserving properties names to be used by the template for the ID generation. |  [optional] |
|**fptemplate** | **String** | Format preserving template to use. Keep empty to use UUID. |  [optional] |
|**objectIds** | **List&lt;UUID&gt;** | Object IDs to tokenize. |  |
|**props** | **List&lt;String&gt;** | The properties to tokenize. |  |
|**reuseTokenId** | **Boolean** | Whether the token ID can be reused if tokenizing the same data. |  [optional] |
|**reversible** | **Boolean** | Whether the token can be detokenized. |  [optional] |
|**scope** | **String** | Uniqueness scope of the token. |  [optional] |
|**tags** | **List&lt;String&gt;** | Tags to attach to the token (max 10). |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Token type. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| POINTER | &quot;pointer&quot; |
| VALUE | &quot;value&quot; |



