
# TechnicianCalendarSlots

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**technicianId** | **String** | Technician ID |  [optional]
**firstName** | **String** | Technician First Name |  [optional]
**lastName** | **String** | Technician Last Name |  [optional]
**mobile** | **String** | Technician Mobile Number |  [optional]
**code** | **Integer** | Technician Mobile Number |  [optional]
**type** | **String** | Technician Type |  [optional]
**accountStatus** | [**AccountStatusEnum**](#AccountStatusEnum) | Technician Type |  [optional]
**busySlots** | [**List&lt;TechnicianBusySlot&gt;**](TechnicianBusySlot.md) | Technician Busy Slot |  [optional]


<a name="AccountStatusEnum"></a>
## Enum: AccountStatusEnum
Name | Value
---- | -----
ACTIVE | &quot;active&quot;
SUSPENDED | &quot;suspended&quot;



