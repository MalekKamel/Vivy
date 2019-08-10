
# Order

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | Order ID |  [optional]
**orderNo** | **Integer** | Order Number |  [optional]
**createdAt** | **String** | Order createdAt |  [optional]
**updatedAt** | **String** | Order updatedAt |  [optional]
**status** | **String** | Order status |  [optional]
**canConfirm** | **Boolean** | Order canConfirm Flag |  [optional]
**canCancel** | **Boolean** | Order canCancel Flag |  [optional]
**inspectionApplied** | **Boolean** | Order inspectionApplied Flag |  [optional]
**technicianCancellationLabel** | [**TechnicianCancellationLabelEnum**](#TechnicianCancellationLabelEnum) | Order Technician Cancellation Button Label |  [optional]
**orderTime** | **String** | Order orderTime |  [optional]
**nextVisitTime** | **String** | Order Next Visit Time |  [optional]
**timeSlot** | [**OrderTimeSlot**](OrderTimeSlot.md) | Order Time Slot |  [optional]
**currentTechnician** | [**CurrentTechnician**](CurrentTechnician.md) |  |  [optional]
**address** | **String** | Order Address |  [optional]
**addressId** | **String** | Order Customer Address ID |  [optional]
**clientNotes** | **String** | Order Client Notes |  [optional]
**customer** | [**Customer**](Customer.md) |  |  [optional]
**customerRate** | **Integer** |  |  [optional]
**customerRateComment** | **String** |  |  [optional]
**customerBalance** | **Double** |  |  [optional]
**category** | [**Category**](Category.md) |  |  [optional]
**servicesChecksum** | **String** |  |  [optional]
**services** | [**List&lt;OrderService&gt;**](OrderService.md) |  |  [optional]
**history** | [**List&lt;OrderHistory&gt;**](OrderHistory.md) |  |  [optional]
**paymentMethod** | [**PaymentMethod**](PaymentMethod.md) |  |  [optional]
**area** | [**Area**](Area.md) |  |  [optional]
**visits** | [**List&lt;Visit&gt;**](Visit.md) |  |  [optional]
**lastVisit** | [**Visit**](Visit.md) |  |  [optional]
**lastVisitId** | **String** |  |  [optional]
**pricing** | [**OrderPricing**](OrderPricing.md) |  |  [optional]
**estimatedEndTime** | **String** |  |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  [optional]
**materials** | [**List&lt;Material&gt;**](Material.md) |  |  [optional]
**imageBefore** | **String** |  |  [optional]
**imageAfter** | **String** |  |  [optional]
**finance** | [**FinanceResponse**](FinanceResponse.md) |  |  [optional]
**creator** | [**User**](User.md) |  |  [optional]
**verificationPostAction** | **String** |  |  [optional]


<a name="TechnicianCancellationLabelEnum"></a>
## Enum: TechnicianCancellationLabelEnum
Name | Value
---- | -----
REQUEST | &quot;request&quot;
CANCEL | &quot;cancel&quot;



