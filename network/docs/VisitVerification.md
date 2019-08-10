
# VisitVerification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**verificationId** | **String** |  |  [optional]
**orderId** | **String** |  |  [optional]
**visitId** | **String** |  |  [optional]
**technician** | [**Technician**](Technician.md) |  |  [optional]
**doneServices** | [**List&lt;VisitDoneService&gt;**](VisitDoneService.md) |  |  [optional]
**pricing** | [**VisitPricing**](VisitPricing.md) |  |  [optional]
**visitType** | [**VisitTypeEnum**](#VisitTypeEnum) |  |  [optional]
**postAction** | [**PostActionEnum**](#PostActionEnum) |  |  [optional]
**usedMaterials** | **String** |  |  [optional]
**technicianComment** | **String** |  |  [optional]
**isVerified** | **Boolean** |  |  [optional]
**verifiedBy** | [**User**](User.md) |  |  [optional]
**changes** | [**VisitVerification**](VisitVerification.md) |  |  [optional]
**createdAt** | **String** |  |  [optional]
**updatedAt** | **String** |  |  [optional]


<a name="VisitTypeEnum"></a>
## Enum: VisitTypeEnum
Name | Value
---- | -----
INSPECTION | &quot;inspection&quot;
MAINTENANCE | &quot;maintenance&quot;


<a name="PostActionEnum"></a>
## Enum: PostActionEnum
Name | Value
---- | -----
FINALIZE | &quot;finalize&quot;
RESCHEDULE | &quot;reschedule&quot;



