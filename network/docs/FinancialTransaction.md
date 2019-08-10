
# FinancialTransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | Transaction ID |  [optional]
**time** | **String** | Transaction Time |  [optional]
**transactionTime** | **String** | Transaction Time |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Transaction Type |  [optional]
**description** | **String** | Transaction Description |  [optional]
**partyType** | **String** |  |  [optional]
**provider** | **String** |  |  [optional]
**paymentMethod** | [**PaymentMethodEnum**](#PaymentMethodEnum) |  |  [optional]
**technician** | [**Technician**](Technician.md) |  |  [optional]
**customer** | [**Customer**](Customer.md) |  |  [optional]
**amount** | **Double** | Transaction Amount |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ORDER | &quot;order&quot;
SETTLEMENT | &quot;settlement&quot;


<a name="PaymentMethodEnum"></a>
## Enum: PaymentMethodEnum
Name | Value
---- | -----
CASH | &quot;cash&quot;
CREDIT | &quot;credit&quot;



