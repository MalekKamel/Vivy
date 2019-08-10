
# StatusResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Technician Status |  [optional]
**accountStatus** | [**AccountStatusEnum**](#AccountStatusEnum) | Technician Account Status |  [optional]
**shouldDislayStatusMsg** | **Boolean** | Display Technician Status Message Flag |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Technician Type |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ONLINE | &quot;online&quot;
OFFLINE | &quot;offline&quot;


<a name="AccountStatusEnum"></a>
## Enum: AccountStatusEnum
Name | Value
---- | -----
ACTIVE | &quot;active&quot;
SUSPENDED | &quot;suspended&quot;
BLOCKED | &quot;blocked&quot;
PENDING | &quot;pending&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
INHOUSE | &quot;inhouse&quot;
MARKETPLACE | &quot;marketplace&quot;



