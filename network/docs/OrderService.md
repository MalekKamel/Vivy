
# OrderService

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serviceId** | **String** | Service ID |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Service Type |  [optional]
**nameEn** | **String** | Service English Name |  [optional]
**nameAr** | **String** | Service Arabic Name |  [optional]
**customerNameEn** | **String** | Service Customer English Name |  [optional]
**customerNameAr** | **String** | Service Customer Arabic Name |  [optional]
**qty** | **Integer** | Service Quantity |  [optional]
**doneQty** | **Integer** | Service Done Quantity |  [optional]
**remainingQty** | **Integer** | Service Remaining Quantity |  [optional]
**price** | **Double** | Service price |  [optional]
**estimatedTime** | **String** | Service estimated time |  [optional]
**qtyVisitIds** | [**List&lt;GuaranteeQtyServiceVisit&gt;**](GuaranteeQtyServiceVisit.md) | Guarantee Service Quantity Per Visit |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
GUARANTEE | &quot;guarantee&quot;



