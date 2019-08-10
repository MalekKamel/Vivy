
# FilterTechniciansBusySlotsRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryId** | **String** | Category ID |  [optional]
**technicianId** | **String** | Technician ID |  [optional]
**date** | **String** | Date |  [optional]
**technicianType** | [**TechnicianTypeEnum**](#TechnicianTypeEnum) | Technician Type |  [optional]
**take** | **Integer** |  |  [optional]
**skip** | **Integer** |  |  [optional]
**sort** | [**SortEnum**](#SortEnum) |  |  [optional]


<a name="TechnicianTypeEnum"></a>
## Enum: TechnicianTypeEnum
Name | Value
---- | -----
INHOUSE | &quot;inhouse&quot;
MARKETPLACE | &quot;marketplace&quot;


<a name="SortEnum"></a>
## Enum: SortEnum
Name | Value
---- | -----
AVAILABLE | &quot;available&quot;
BUSY | &quot;busy&quot;



