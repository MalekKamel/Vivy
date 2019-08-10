
# NewVisitVerificationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** |  |  [optional]
**postAction** | [**PostActionEnum**](#PostActionEnum) |  |  [optional]
**technicianComment** | **String** |  |  [optional]
**usedMaterials** | **String** |  |  [optional]
**servicesChecksum** | **String** |  |  [optional]
**paidMaterialsAmount** | **Double** |  |  [optional]
**paidServicesAmount** | **Double** |  |  [optional]
**expectedPaidAmount** | **Double** |  |  [optional]
**doneServicesIds** | [**List&lt;UpdateOrderService&gt;**](UpdateOrderService.md) |  |  [optional]


<a name="PostActionEnum"></a>
## Enum: PostActionEnum
Name | Value
---- | -----
FINALIZE | &quot;finalize&quot;
RESCHEDULE | &quot;reschedule&quot;



