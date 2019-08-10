
# Customer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerId** | **String** | Customer ID |  [optional]
**firstName** | **String** | Customer First Name |  [optional]
**lastName** | **String** | Customer Last Name |  [optional]
**mobile** | **String** | Customer Mobile Number |  [optional]
**otherMobiles** | **List&lt;String&gt;** |  |  [optional]
**email** | **String** | Customer Email |  [optional]
**addresses** | [**List&lt;CustomerAddress&gt;**](CustomerAddress.md) | Customer Addresses |  [optional]
**source** | [**SourceEnum**](#SourceEnum) | Customer Source |  [optional]
**balance** | **Double** | Customer Balance |  [optional]
**rate** | **Double** | Customer Rate |  [optional]
**accountStatus** | **String** | Customer Account Status |  [optional]
**createdAt** | **String** | Customer Created At |  [optional]
**updatedAt** | **String** | Customer Updated At |  [optional]


<a name="SourceEnum"></a>
## Enum: SourceEnum
Name | Value
---- | -----
DASHBOARD | &quot;dashboard&quot;
WEBSITE | &quot;website&quot;
MOBILE_APP | &quot;mobile_app&quot;



