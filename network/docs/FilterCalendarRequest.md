
# FilterCalendarRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | **String** |  |  [optional]
**categoryIds** | **List&lt;String&gt;** |  |  [optional]
**areaIds** | **List&lt;String&gt;** |  |  [optional]
**technicianIds** | **List&lt;String&gt;** |  |  [optional]
**technicianType** | [**TechnicianTypeEnum**](#TechnicianTypeEnum) |  |  [optional]
**sort** | [**SortEnum**](#SortEnum) |  |  [optional]
**take** | **Integer** |  |  [optional]
**skip** | **Integer** |  |  [optional]


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
AVAILABILITY | &quot;availability&quot;
BUSYNESS | &quot;busyness&quot;



