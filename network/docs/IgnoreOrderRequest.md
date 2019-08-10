
# IgnoreOrderRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | Order ID | 
**matchingType** | [**MatchingTypeEnum**](#MatchingTypeEnum) | Matching Type |  [optional]
**matchingCycleId** | **String** | Matching Cycle ID | 
**ignoredBy** | [**IgnoredByEnum**](#IgnoredByEnum) | Ignored By | 


<a name="MatchingTypeEnum"></a>
## Enum: MatchingTypeEnum
Name | Value
---- | -----
ONLINE | &quot;online&quot;
OFFLINE | &quot;offline&quot;


<a name="IgnoredByEnum"></a>
## Enum: IgnoredByEnum
Name | Value
---- | -----
TECHNICIAN | &quot;technician&quot;
QUEUE | &quot;queue&quot;
DELAYED_REJECT | &quot;delayed_reject&quot;
DELAYED_ACCEPT | &quot;delayed_accept&quot;



