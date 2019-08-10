# DashboardApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateTechnician**](DashboardApi.md#activateTechnician) | **POST** dashboard/activateTechnician | Activate Technician
[**activateUser**](DashboardApi.md#activateUser) | **POST** dashboard/activateUser | Activate User
[**addCustomerAddress**](DashboardApi.md#addCustomerAddress) | **POST** dashboard/addCustomerAddress | Add New Customer Address
[**addTechnicianBusySlot**](DashboardApi.md#addTechnicianBusySlot) | **POST** dashboard/addTechnicianBusySlot | add Technician Busy Slot
[**assignTechnicianToOrder**](DashboardApi.md#assignTechnicianToOrder) | **POST** dashboard/assignTechnicianToOrder | Technician Assigned To Order
[**blockTechnician**](DashboardApi.md#blockTechnician) | **POST** dashboard/blockTechnician | Block Technician
[**blockUser**](DashboardApi.md#blockUser) | **POST** dashboard/blockUser | Block User
[**cancelOrderByCustomer**](DashboardApi.md#cancelOrderByCustomer) | **POST** dashboard/cancelOrderByCustomer | Customer Cancel Order
[**cancelOrderByTechnician**](DashboardApi.md#cancelOrderByTechnician) | **POST** dashboard/cancelOrderByTechnician | Technician Cancel Order
[**cancelVisitByCustomer**](DashboardApi.md#cancelVisitByCustomer) | **POST** dashboard/cancelVisitByCustomer | Customer Cancel Visit
[**changeOrderTime**](DashboardApi.md#changeOrderTime) | **POST** dashboard/changeOrderTime | Change Order Time
[**checkAvailableSlots**](DashboardApi.md#checkAvailableSlots) | **POST** dashboard/checkAvailableSlots | Retrieve Available Slots
[**confirmOrderByTechnician**](DashboardApi.md#confirmOrderByTechnician) | **POST** dashboard/confirmOrder | Technician Confirm Order
[**createCustomer**](DashboardApi.md#createCustomer) | **POST** dashboard/createCustomer | Create New Customer
[**createNewVisit**](DashboardApi.md#createNewVisit) | **POST** dashboard/createVisit | Create New Visit
[**createOpportunity**](DashboardApi.md#createOpportunity) | **POST** dashboard/createOpportunity | Opportunity Created
[**createOrder**](DashboardApi.md#createOrder) | **POST** dashboard/createOrder | Create New Order
[**createRole**](DashboardApi.md#createRole) | **POST** dashboard/createRole | Create New Role
[**createTechnician**](DashboardApi.md#createTechnician) | **POST** dashboard/createTechnician | Create New Technician
[**createUser**](DashboardApi.md#createUser) | **POST** dashboard/createUser | Create New User
[**deleteBusySlotById**](DashboardApi.md#deleteBusySlotById) | **DELETE** dashboard/busyslot/{busySlotId} | Delete Busy Slot By ID
[**deleteRoleById**](DashboardApi.md#deleteRoleById) | **DELETE** dashboard/role/{roleId} | Delete Role By ID
[**finalizeOrderByTechnician**](DashboardApi.md#finalizeOrderByTechnician) | **POST** dashboard/finalizeOrder | User Finalize Order
[**forceUpdateOrderServices**](DashboardApi.md#forceUpdateOrderServices) | **POST** dashboard/forceUpdateOrderServices | Force Update Order
[**forceUpdateOrderVisit**](DashboardApi.md#forceUpdateOrderVisit) | **POST** dashboard/forceUpdateOrderVisit | Force Update Order Visit
[**getActiveCategories**](DashboardApi.md#getActiveCategories) | **GET** customer/listAllCategories | Retrieve Categories
[**getAllAreas**](DashboardApi.md#getAllAreas) | **GET** dashboard/listAllAreas | Retrieve Areas
[**getAllCategories**](DashboardApi.md#getAllCategories) | **GET** dashboard/listAllCategories | Retrieve Categories
[**getAllCustomers**](DashboardApi.md#getAllCustomers) | **GET** dashboard/listAllCustomers/{sort}/{dir}/{take}/{skip} | Retrieve Customers ( Sorted )
[**getAllOrders**](DashboardApi.md#getAllOrders) | **GET** dashboard/listAllOrders/{sort}/{dir}/{take}/{skip} | Retrieve Orders ( Sorted )
[**getAllPermissions**](DashboardApi.md#getAllPermissions) | **GET** dashboard/listAllPermissions | Retrieve permissions
[**getAllTechnicians**](DashboardApi.md#getAllTechnicians) | **GET** dashboard/listAllTechnicians/{sort}/{dir}/{take}/{skip} | Retrieve Technicians ( Sorted )
[**getAllUsers**](DashboardApi.md#getAllUsers) | **GET** dashboard/listAllUsers/{sort}/{dir}/{take}/{skip} | Retrieve Users ( Sorted )
[**getCategoryServices**](DashboardApi.md#getCategoryServices) | **GET** dashboard/list-category-services/{categoryId} | Retrieve all active category services
[**getCustomerById**](DashboardApi.md#getCustomerById) | **GET** dashboard/customer/{customerId} | Retrieve Customer Info By Id
[**getCustomerTicketsById**](DashboardApi.md#getCustomerTicketsById) | **GET** dashboard/customerTickets/{customerId}/{take}/{page} | Retrieve Customer Info By Id
[**getCustomersByKeyword**](DashboardApi.md#getCustomersByKeyword) | **GET** dashboard/listCustomersByKeyword/{keyword} | Retrieve Customers ( Sorted )
[**getFilteredLog**](DashboardApi.md#getFilteredLog) | **POST** dashboard/getFilteredLog | Retrieve Filtered Log
[**getFilteredOrders**](DashboardApi.md#getFilteredOrders) | **POST** dashboard/getFilteredOrders | Retrieve Filtered Orders
[**getFilteredTechnicians**](DashboardApi.md#getFilteredTechnicians) | **POST** dashboard/getFilteredTechnicians | Retrieve Filtered Technicians
[**getOpportunities**](DashboardApi.md#getOpportunities) | **POST** dashboard/listOpportunities | Retrieve Opportunities
[**getOpportunityById**](DashboardApi.md#getOpportunityById) | **GET** dashboard/opportunity/{opportunityId} | Retrieve Opportunity Info By Id
[**getOpportunityTypes**](DashboardApi.md#getOpportunityTypes) | **GET** dashboard/listOpportunityTypes | Retrieve Opportunity Types
[**getOrderSuggestedTechnicians**](DashboardApi.md#getOrderSuggestedTechnicians) | **GET** dashboard/listOrderSuggestedTechnicians | List Order Suggested Technicians
[**getOrdersStatusReport**](DashboardApi.md#getOrdersStatusReport) | **GET** dashboard/getOrdersStatusReport | Retrieve Orders Status Report
[**getRoleById**](DashboardApi.md#getRoleById) | **GET** dashboard/role/{roleId} | Get Role By ID
[**getRoles**](DashboardApi.md#getRoles) | **GET** dashboard/listRoles | Retrieve Roles
[**getTags**](DashboardApi.md#getTags) | **GET** dashboard/listTags | Retrieve Tags
[**getTechnicianBusySlots**](DashboardApi.md#getTechnicianBusySlots) | **GET** dashboard/technicianBusySlots | Retrieve Technician Busy Slots By Id
[**getTechnicianById**](DashboardApi.md#getTechnicianById) | **GET** dashboard/technician/{technicianId} | Retrieve Technician Info By Id
[**getTechnicianOrderFinancialDetails**](DashboardApi.md#getTechnicianOrderFinancialDetails) | **GET** dashboard/orderFinancialDetails/{orderId}/{technicianId} | Retrieve Order Info By Id
[**getTechnicianUnsettledOrders**](DashboardApi.md#getTechnicianUnsettledOrders) | **GET** dashboard/technicianUnsettledOrders/{technicianId} | Retrieve Technician Unsettled Orders
[**getTechniciansRequestsReport**](DashboardApi.md#getTechniciansRequestsReport) | **GET** dashboard/getTechniciansRequestsReport | Retrieve Technicians Requests Report
[**getUserById**](DashboardApi.md#getUserById) | **GET** dashboard/user/{userId} | Retrieve User Info By Id
[**getVisitVerificationByOrderId**](DashboardApi.md#getVisitVerificationByOrderId) | **GET** dashboard/orderVerification/{orderId} | Retrieve Visit Verification Info By Order Id
[**isAuthenticated**](DashboardApi.md#isAuthenticated) | **GET** dashboard/isAuthenticated | Check if user is authenticated
[**rematchOrder**](DashboardApi.md#rematchOrder) | **POST** dashboard/rematchOrder | Rematch Order
[**rescheduleAnOrder**](DashboardApi.md#rescheduleAnOrder) | **POST** dashboard/rescheduleOrder | User Reschedule Order
[**settleCustomer**](DashboardApi.md#settleCustomer) | **POST** dashboard/settleCustomer | User Settle Customer
[**settleTechnician**](DashboardApi.md#settleTechnician) | **POST** dashboard/settleTechnician | User Settle Technician
[**settleTechnicianOrders**](DashboardApi.md#settleTechnicianOrders) | **POST** dashboard/settleTechnicianOrders | Settle Technician Orders
[**startOrderByTechnician**](DashboardApi.md#startOrderByTechnician) | **POST** dashboard/startOrder | Technician Start Order
[**suspendTechnician**](DashboardApi.md#suspendTechnician) | **POST** dashboard/suspendTechnician | Suspend Technician
[**updateCustomer**](DashboardApi.md#updateCustomer) | **POST** dashboard/updateCustomer | Update Customer Info
[**updateCustomerNotes**](DashboardApi.md#updateCustomerNotes) | **POST** dashboard/updateCustomerNotes | Update Customer Notes
[**updateGuaranteeServices**](DashboardApi.md#updateGuaranteeServices) | **POST** dashboard/updateGuaranteeServices | Update Guarantee Services
[**updateOpportunity**](DashboardApi.md#updateOpportunity) | **POST** dashboard/updateOpportunity | Update Opportunity
[**updateOrderTags**](DashboardApi.md#updateOrderTags) | **POST** dashboard/updateOrderTags | Update Order Tags
[**updateRole**](DashboardApi.md#updateRole) | **POST** dashboard/updateRole | Update Role Info
[**updateTechnician**](DashboardApi.md#updateTechnician) | **POST** dashboard/updateTechnician | Update Technician Info
[**updateTechnicianComment**](DashboardApi.md#updateTechnicianComment) | **POST** dashboard/updateTechnicianComment | Update Technician Comment
[**updateUser**](DashboardApi.md#updateUser) | **POST** dashboard/updateUser | Update User Info
[**userCalculateVisitExpectedPaidAmount**](DashboardApi.md#userCalculateVisitExpectedPaidAmount) | **POST** dashboard/calculateExpectedPaidAmount | User get calculated expected paid amount for current visit
[**userLogin**](DashboardApi.md#userLogin) | **POST** dashboard/login | Logs user into dashboard
[**userUpdateOrderServices**](DashboardApi.md#userUpdateOrderServices) | **POST** dashboard/updateOrderServices | User Update Order Services
[**viewCalendar**](DashboardApi.md#viewCalendar) | **POST** dashboard/calendar | Retrieve Calendar View
[**viewOrderById**](DashboardApi.md#viewOrderById) | **GET** dashboard/order/{orderId} | Retrieve Order Info By Id


<a name="activateTechnician"></a>
# **activateTechnician**
> Technician activateTechnician(token, activateTechnicianRequest)

Activate Technician

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
ActivateTechnicianRequest activateTechnicianRequest = new ActivateTechnicianRequest(); // ActivateTechnicianRequest | Activate Technician Request
try {
    Technician result = apiInstance.activateTechnician(token, activateTechnicianRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#activateTechnician");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **activateTechnicianRequest** | [**ActivateTechnicianRequest**](ActivateTechnicianRequest.md)| Activate Technician Request | [optional]

### Return type

[**Technician**](Technician.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="activateUser"></a>
# **activateUser**
> User activateUser(token, activateUserRequest)

Activate User

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
ActivateUserRequest activateUserRequest = new ActivateUserRequest(); // ActivateUserRequest | Activate User Request
try {
    User result = apiInstance.activateUser(token, activateUserRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#activateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **activateUserRequest** | [**ActivateUserRequest**](ActivateUserRequest.md)| Activate User Request | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCustomerAddress"></a>
# **addCustomerAddress**
> Customer addCustomerAddress(token, newCustomerAddressRequest)

Add New Customer Address

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
NewCustomerAddressRequest newCustomerAddressRequest = new NewCustomerAddressRequest(); // NewCustomerAddressRequest | New Customer Address Request
try {
    Customer result = apiInstance.addCustomerAddress(token, newCustomerAddressRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#addCustomerAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **newCustomerAddressRequest** | [**NewCustomerAddressRequest**](NewCustomerAddressRequest.md)| New Customer Address Request | [optional]

### Return type

[**Customer**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addTechnicianBusySlot"></a>
# **addTechnicianBusySlot**
> TechnicianBusySlotsResponse addTechnicianBusySlot(token, addTechnicianBusySlotRequest)

add Technician Busy Slot

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
AddTechnicianBusySlotRequest addTechnicianBusySlotRequest = new AddTechnicianBusySlotRequest(); // AddTechnicianBusySlotRequest | Add Technician Busy Slot Request
try {
    TechnicianBusySlotsResponse result = apiInstance.addTechnicianBusySlot(token, addTechnicianBusySlotRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#addTechnicianBusySlot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **addTechnicianBusySlotRequest** | [**AddTechnicianBusySlotRequest**](AddTechnicianBusySlotRequest.md)| Add Technician Busy Slot Request | [optional]

### Return type

[**TechnicianBusySlotsResponse**](TechnicianBusySlotsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="assignTechnicianToOrder"></a>
# **assignTechnicianToOrder**
> SuccessResponse assignTechnicianToOrder(token, manualAssignOrderRequest)

Technician Assigned To Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
ManualAssignOrderRequest manualAssignOrderRequest = new ManualAssignOrderRequest(); // ManualAssignOrderRequest | Manual Assign Order Request
try {
    SuccessResponse result = apiInstance.assignTechnicianToOrder(token, manualAssignOrderRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#assignTechnicianToOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **manualAssignOrderRequest** | [**ManualAssignOrderRequest**](ManualAssignOrderRequest.md)| Manual Assign Order Request | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="blockTechnician"></a>
# **blockTechnician**
> Technician blockTechnician(token, blockTechnicianRequest)

Block Technician

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
BlockTechnicianRequest blockTechnicianRequest = new BlockTechnicianRequest(); // BlockTechnicianRequest | Block Technician Request
try {
    Technician result = apiInstance.blockTechnician(token, blockTechnicianRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#blockTechnician");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **blockTechnicianRequest** | [**BlockTechnicianRequest**](BlockTechnicianRequest.md)| Block Technician Request | [optional]

### Return type

[**Technician**](Technician.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="blockUser"></a>
# **blockUser**
> User blockUser(token, blockUserRequest)

Block User

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
BlockUserRequest blockUserRequest = new BlockUserRequest(); // BlockUserRequest | Block User Request
try {
    User result = apiInstance.blockUser(token, blockUserRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#blockUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **blockUserRequest** | [**BlockUserRequest**](BlockUserRequest.md)| Block User Request | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cancelOrderByCustomer"></a>
# **cancelOrderByCustomer**
> SuccessResponse cancelOrderByCustomer(token, cancelOrderByCustomerRequest)

Customer Cancel Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
CancelOrderByCustomerRequest cancelOrderByCustomerRequest = new CancelOrderByCustomerRequest(); // CancelOrderByCustomerRequest | Cancel Order By Customer Request
try {
    SuccessResponse result = apiInstance.cancelOrderByCustomer(token, cancelOrderByCustomerRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#cancelOrderByCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **cancelOrderByCustomerRequest** | [**CancelOrderByCustomerRequest**](CancelOrderByCustomerRequest.md)| Cancel Order By Customer Request | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cancelOrderByTechnician"></a>
# **cancelOrderByTechnician**
> SuccessResponse cancelOrderByTechnician(token, cancelOrderByTechnicianRequest)

Technician Cancel Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
CancelOrderByTechnicianRequest cancelOrderByTechnicianRequest = new CancelOrderByTechnicianRequest(); // CancelOrderByTechnicianRequest | Cancel Order By Technician Request
try {
    SuccessResponse result = apiInstance.cancelOrderByTechnician(token, cancelOrderByTechnicianRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#cancelOrderByTechnician");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **cancelOrderByTechnicianRequest** | [**CancelOrderByTechnicianRequest**](CancelOrderByTechnicianRequest.md)| Cancel Order By Technician Request | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cancelVisitByCustomer"></a>
# **cancelVisitByCustomer**
> SuccessResponse cancelVisitByCustomer(token, cancelVisitByCustomerRequest)

Customer Cancel Visit

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
CancelVisitByCustomerRequest cancelVisitByCustomerRequest = new CancelVisitByCustomerRequest(); // CancelVisitByCustomerRequest | Cancel Visit By Customer Request
try {
    SuccessResponse result = apiInstance.cancelVisitByCustomer(token, cancelVisitByCustomerRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#cancelVisitByCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **cancelVisitByCustomerRequest** | [**CancelVisitByCustomerRequest**](CancelVisitByCustomerRequest.md)| Cancel Visit By Customer Request | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="changeOrderTime"></a>
# **changeOrderTime**
> Order changeOrderTime(token, changeOrderTimeRequest)

Change Order Time

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
ChangeOrderTimeRequest changeOrderTimeRequest = new ChangeOrderTimeRequest(); // ChangeOrderTimeRequest | Change Order Time Request
try {
    Order result = apiInstance.changeOrderTime(token, changeOrderTimeRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#changeOrderTime");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **changeOrderTimeRequest** | [**ChangeOrderTimeRequest**](ChangeOrderTimeRequest.md)| Change Order Time Request | [optional]

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkAvailableSlots"></a>
# **checkAvailableSlots**
> AvailableSlotsResponse checkAvailableSlots(token, checkAvailableSlotsRequest)

Retrieve Available Slots

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
CheckAvailableSlotsRequest checkAvailableSlotsRequest = new CheckAvailableSlotsRequest(); // CheckAvailableSlotsRequest | Check Available Slots Request
try {
    AvailableSlotsResponse result = apiInstance.checkAvailableSlots(token, checkAvailableSlotsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#checkAvailableSlots");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **checkAvailableSlotsRequest** | [**CheckAvailableSlotsRequest**](CheckAvailableSlotsRequest.md)| Check Available Slots Request | [optional]

### Return type

[**AvailableSlotsResponse**](AvailableSlotsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="confirmOrderByTechnician"></a>
# **confirmOrderByTechnician**
> SuccessResponse confirmOrderByTechnician(token, confirmOrderRequest)

Technician Confirm Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
ConfirmOrderRequest1 confirmOrderRequest = new ConfirmOrderRequest1(); // ConfirmOrderRequest1 | Confirm Order Request
try {
    SuccessResponse result = apiInstance.confirmOrderByTechnician(token, confirmOrderRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#confirmOrderByTechnician");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **confirmOrderRequest** | [**ConfirmOrderRequest1**](ConfirmOrderRequest1.md)| Confirm Order Request | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCustomer"></a>
# **createCustomer**
> Customer createCustomer(token, newCustomerRequest)

Create New Customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
NewCustomerRequest newCustomerRequest = new NewCustomerRequest(); // NewCustomerRequest | New Customer Request
try {
    Customer result = apiInstance.createCustomer(token, newCustomerRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#createCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **newCustomerRequest** | [**NewCustomerRequest**](NewCustomerRequest.md)| New Customer Request | [optional]

### Return type

[**Customer**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNewVisit"></a>
# **createNewVisit**
> Order createNewVisit(token, newVisitRequest)

Create New Visit

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
NewVisitRequest newVisitRequest = new NewVisitRequest(); // NewVisitRequest | New Visit Request
try {
    Order result = apiInstance.createNewVisit(token, newVisitRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#createNewVisit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **newVisitRequest** | [**NewVisitRequest**](NewVisitRequest.md)| New Visit Request | [optional]

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOpportunity"></a>
# **createOpportunity**
> Opportunity createOpportunity(token, newOpportunityRequest)

Opportunity Created

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
NewOpportunityRequest newOpportunityRequest = new NewOpportunityRequest(); // NewOpportunityRequest | New Opportunity Request
try {
    Opportunity result = apiInstance.createOpportunity(token, newOpportunityRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#createOpportunity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **newOpportunityRequest** | [**NewOpportunityRequest**](NewOpportunityRequest.md)| New Opportunity Request | [optional]

### Return type

[**Opportunity**](Opportunity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOrder"></a>
# **createOrder**
> Order createOrder(token, newOrderRequest)

Create New Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
NewOrderRequest newOrderRequest = new NewOrderRequest(); // NewOrderRequest | New Order Request
try {
    Order result = apiInstance.createOrder(token, newOrderRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#createOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **newOrderRequest** | [**NewOrderRequest**](NewOrderRequest.md)| New Order Request | [optional]

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRole"></a>
# **createRole**
> Role createRole(token, newRoleRequest)

Create New Role

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
NewRoleRequest newRoleRequest = new NewRoleRequest(); // NewRoleRequest | New Role Request
try {
    Role result = apiInstance.createRole(token, newRoleRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#createRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **newRoleRequest** | [**NewRoleRequest**](NewRoleRequest.md)| New Role Request | [optional]

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTechnician"></a>
# **createTechnician**
> Technician createTechnician(token, newTechnicianRequest)

Create New Technician

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
NewTechnicianRequest newTechnicianRequest = new NewTechnicianRequest(); // NewTechnicianRequest | New Technician Request
try {
    Technician result = apiInstance.createTechnician(token, newTechnicianRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#createTechnician");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **newTechnicianRequest** | [**NewTechnicianRequest**](NewTechnicianRequest.md)| New Technician Request | [optional]

### Return type

[**Technician**](Technician.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createUser"></a>
# **createUser**
> User createUser(token, newUserRequest)

Create New User

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
NewUserRequest newUserRequest = new NewUserRequest(); // NewUserRequest | New User Request
try {
    User result = apiInstance.createUser(token, newUserRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#createUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **newUserRequest** | [**NewUserRequest**](NewUserRequest.md)| New User Request | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBusySlotById"></a>
# **deleteBusySlotById**
> SuccessResponse deleteBusySlotById(busySlotId, token)

Delete Busy Slot By ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String busySlotId = "busySlotId_example"; // String | Busy Slot ID
String token = "token_example"; // String | User Access Token
try {
    SuccessResponse result = apiInstance.deleteBusySlotById(busySlotId, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#deleteBusySlotById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **busySlotId** | **String**| Busy Slot ID |
 **token** | **String**| User Access Token | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRoleById"></a>
# **deleteRoleById**
> SuccessResponse deleteRoleById(roleId, token)

Delete Role By ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String roleId = "roleId_example"; // String | Role ID
String token = "token_example"; // String | User Access Token
try {
    SuccessResponse result = apiInstance.deleteRoleById(roleId, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#deleteRoleById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **String**| Role ID |
 **token** | **String**| User Access Token | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="finalizeOrderByTechnician"></a>
# **finalizeOrderByTechnician**
> Order finalizeOrderByTechnician(token, finalizeOrderRequest)

User Finalize Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
FinalizeOrderRequest finalizeOrderRequest = new FinalizeOrderRequest(); // FinalizeOrderRequest | Finalize Order Request
try {
    Order result = apiInstance.finalizeOrderByTechnician(token, finalizeOrderRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#finalizeOrderByTechnician");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **finalizeOrderRequest** | [**FinalizeOrderRequest**](FinalizeOrderRequest.md)| Finalize Order Request | [optional]

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="forceUpdateOrderServices"></a>
# **forceUpdateOrderServices**
> Order forceUpdateOrderServices(token, forceUpdateOrderServicesRequest)

Force Update Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
ForceUpdateOrderServicesRequest forceUpdateOrderServicesRequest = new ForceUpdateOrderServicesRequest(); // ForceUpdateOrderServicesRequest | Order Force Update Request
try {
    Order result = apiInstance.forceUpdateOrderServices(token, forceUpdateOrderServicesRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#forceUpdateOrderServices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **forceUpdateOrderServicesRequest** | [**ForceUpdateOrderServicesRequest**](ForceUpdateOrderServicesRequest.md)| Order Force Update Request | [optional]

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="forceUpdateOrderVisit"></a>
# **forceUpdateOrderVisit**
> Order forceUpdateOrderVisit(token, forceUpdateOrderVisitRequest)

Force Update Order Visit

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
ForceUpdateOrderVisitRequest forceUpdateOrderVisitRequest = new ForceUpdateOrderVisitRequest(); // ForceUpdateOrderVisitRequest | Order Force Update Request
try {
    Order result = apiInstance.forceUpdateOrderVisit(token, forceUpdateOrderVisitRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#forceUpdateOrderVisit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **forceUpdateOrderVisitRequest** | [**ForceUpdateOrderVisitRequest**](ForceUpdateOrderVisitRequest.md)| Order Force Update Request | [optional]

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getActiveCategories"></a>
# **getActiveCategories**
> CategoriesResponse getActiveCategories(token)

Retrieve Categories

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
try {
    CategoriesResponse result = apiInstance.getActiveCategories(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getActiveCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]

### Return type

[**CategoriesResponse**](CategoriesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllAreas"></a>
# **getAllAreas**
> AreasResponse getAllAreas(token)

Retrieve Areas

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
try {
    AreasResponse result = apiInstance.getAllAreas(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getAllAreas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]

### Return type

[**AreasResponse**](AreasResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllCategories"></a>
# **getAllCategories**
> CategoriesResponse getAllCategories(token)

Retrieve Categories

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
try {
    CategoriesResponse result = apiInstance.getAllCategories(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getAllCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]

### Return type

[**CategoriesResponse**](CategoriesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllCustomers"></a>
# **getAllCustomers**
> CustomersResponse getAllCustomers(sort, dir, take, skip, token)

Retrieve Customers ( Sorted )

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String sort = "sort_example"; // String | Sorted by Column
String dir = "dir_example"; // String | Sorting Direction
Integer take = 56; // Integer | Number of Technicians Retrieved ( Pagination )
Integer skip = 56; // Integer | Skipped Technicians ( Pagination )
String token = "token_example"; // String | User Access Token
try {
    CustomersResponse result = apiInstance.getAllCustomers(sort, dir, take, skip, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getAllCustomers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| Sorted by Column |
 **dir** | **String**| Sorting Direction |
 **take** | **Integer**| Number of Technicians Retrieved ( Pagination ) |
 **skip** | **Integer**| Skipped Technicians ( Pagination ) |
 **token** | **String**| User Access Token | [optional]

### Return type

[**CustomersResponse**](CustomersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllOrders"></a>
# **getAllOrders**
> OrdersResponse getAllOrders(sort, dir, take, skip, token)

Retrieve Orders ( Sorted )

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String sort = "sort_example"; // String | Sorted by Column
String dir = "dir_example"; // String | Sorting Direction
Integer take = 56; // Integer | Number of Orders Retrieved ( Pagination )
Integer skip = 56; // Integer | Skipped Orders ( Pagination )
String token = "token_example"; // String | User Access Token
try {
    OrdersResponse result = apiInstance.getAllOrders(sort, dir, take, skip, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getAllOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| Sorted by Column |
 **dir** | **String**| Sorting Direction |
 **take** | **Integer**| Number of Orders Retrieved ( Pagination ) |
 **skip** | **Integer**| Skipped Orders ( Pagination ) |
 **token** | **String**| User Access Token | [optional]

### Return type

[**OrdersResponse**](OrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllPermissions"></a>
# **getAllPermissions**
> PermissionsResponse getAllPermissions(token)

Retrieve permissions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
try {
    PermissionsResponse result = apiInstance.getAllPermissions(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getAllPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]

### Return type

[**PermissionsResponse**](PermissionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllTechnicians"></a>
# **getAllTechnicians**
> TechniciansResponse getAllTechnicians(sort, dir, take, skip, token)

Retrieve Technicians ( Sorted )

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String sort = "sort_example"; // String | Sorted by Column
String dir = "dir_example"; // String | Sorting Direction
Integer take = 56; // Integer | Number of Technicians Retrieved ( Pagination )
Integer skip = 56; // Integer | Skipped Technicians ( Pagination )
String token = "token_example"; // String | User Access Token
try {
    TechniciansResponse result = apiInstance.getAllTechnicians(sort, dir, take, skip, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getAllTechnicians");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| Sorted by Column |
 **dir** | **String**| Sorting Direction |
 **take** | **Integer**| Number of Technicians Retrieved ( Pagination ) |
 **skip** | **Integer**| Skipped Technicians ( Pagination ) |
 **token** | **String**| User Access Token | [optional]

### Return type

[**TechniciansResponse**](TechniciansResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllUsers"></a>
# **getAllUsers**
> UsersResponse getAllUsers(sort, dir, take, skip, token)

Retrieve Users ( Sorted )

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String sort = "sort_example"; // String | Sorted by Column
String dir = "dir_example"; // String | Sorting Direction
Integer take = 56; // Integer | Number of Users Retrieved ( Pagination )
Integer skip = 56; // Integer | Skipped Users ( Pagination )
String token = "token_example"; // String | User Access Token
try {
    UsersResponse result = apiInstance.getAllUsers(sort, dir, take, skip, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getAllUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| Sorted by Column |
 **dir** | **String**| Sorting Direction |
 **take** | **Integer**| Number of Users Retrieved ( Pagination ) |
 **skip** | **Integer**| Skipped Users ( Pagination ) |
 **token** | **String**| User Access Token | [optional]

### Return type

[**UsersResponse**](UsersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCategoryServices"></a>
# **getCategoryServices**
> ServicesResponse getCategoryServices(categoryId, token)

Retrieve all active category services

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String categoryId = "categoryId_example"; // String | Category ID
String token = "token_example"; // String | User Access Token
try {
    ServicesResponse result = apiInstance.getCategoryServices(categoryId, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getCategoryServices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **String**| Category ID |
 **token** | **String**| User Access Token | [optional]

### Return type

[**ServicesResponse**](ServicesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomerById"></a>
# **getCustomerById**
> Customer getCustomerById(customerId, token)

Retrieve Customer Info By Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String customerId = "customerId_example"; // String | Customer ID
String token = "token_example"; // String | User Access Token
try {
    Customer result = apiInstance.getCustomerById(customerId, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getCustomerById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Customer ID |
 **token** | **String**| User Access Token | [optional]

### Return type

[**Customer**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCustomerTicketsById"></a>
# **getCustomerTicketsById**
> CustomerTicketsResponse getCustomerTicketsById(customerId, take, page, token)

Retrieve Customer Info By Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String customerId = "customerId_example"; // String | Customer ID
Integer take = 56; // Integer | Number of Tickets Retrieved ( Pagination )
Integer page = 56; // Integer | Skipped Tickets ( Pagination )
String token = "token_example"; // String | User Access Token
try {
    CustomerTicketsResponse result = apiInstance.getCustomerTicketsById(customerId, take, page, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getCustomerTicketsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Customer ID |
 **take** | **Integer**| Number of Tickets Retrieved ( Pagination ) |
 **page** | **Integer**| Skipped Tickets ( Pagination ) |
 **token** | **String**| User Access Token | [optional]

### Return type

[**CustomerTicketsResponse**](CustomerTicketsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCustomersByKeyword"></a>
# **getCustomersByKeyword**
> CustomersResponse getCustomersByKeyword(keyword, token)

Retrieve Customers ( Sorted )

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String keyword = "keyword_example"; // String | Keyword
String token = "token_example"; // String | User Access Token
try {
    CustomersResponse result = apiInstance.getCustomersByKeyword(keyword, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getCustomersByKeyword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyword** | **String**| Keyword |
 **token** | **String**| User Access Token | [optional]

### Return type

[**CustomersResponse**](CustomersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFilteredLog"></a>
# **getFilteredLog**
> UserLogResponse getFilteredLog(token, filterLogRequest)

Retrieve Filtered Log

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
FilterLogRequest filterLogRequest = new FilterLogRequest(); // FilterLogRequest | Filter Log Request
try {
    UserLogResponse result = apiInstance.getFilteredLog(token, filterLogRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getFilteredLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **filterLogRequest** | [**FilterLogRequest**](FilterLogRequest.md)| Filter Log Request | [optional]

### Return type

[**UserLogResponse**](UserLogResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFilteredOrders"></a>
# **getFilteredOrders**
> OrdersResponse getFilteredOrders(token, filterOrdersRequest)

Retrieve Filtered Orders

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
FilterOrdersRequest filterOrdersRequest = new FilterOrdersRequest(); // FilterOrdersRequest | Filter Orders Request
try {
    OrdersResponse result = apiInstance.getFilteredOrders(token, filterOrdersRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getFilteredOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **filterOrdersRequest** | [**FilterOrdersRequest**](FilterOrdersRequest.md)| Filter Orders Request | [optional]

### Return type

[**OrdersResponse**](OrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFilteredTechnicians"></a>
# **getFilteredTechnicians**
> TechniciansResponse getFilteredTechnicians(token, filterTechniciansRequest)

Retrieve Filtered Technicians

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
FilterTechniciansRequest filterTechniciansRequest = new FilterTechniciansRequest(); // FilterTechniciansRequest | Filter Technicians Request
try {
    TechniciansResponse result = apiInstance.getFilteredTechnicians(token, filterTechniciansRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getFilteredTechnicians");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **filterTechniciansRequest** | [**FilterTechniciansRequest**](FilterTechniciansRequest.md)| Filter Technicians Request | [optional]

### Return type

[**TechniciansResponse**](TechniciansResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOpportunities"></a>
# **getOpportunities**
> OpportunitiesResponse getOpportunities(token, listOpportunitiesRequest)

Retrieve Opportunities

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
ListOpportunitiesRequest listOpportunitiesRequest = new ListOpportunitiesRequest(); // ListOpportunitiesRequest | List Opportunities Request
try {
    OpportunitiesResponse result = apiInstance.getOpportunities(token, listOpportunitiesRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getOpportunities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **listOpportunitiesRequest** | [**ListOpportunitiesRequest**](ListOpportunitiesRequest.md)| List Opportunities Request | [optional]

### Return type

[**OpportunitiesResponse**](OpportunitiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOpportunityById"></a>
# **getOpportunityById**
> Opportunity getOpportunityById(opportunityId, token)

Retrieve Opportunity Info By Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String opportunityId = "opportunityId_example"; // String | Opportunity ID
String token = "token_example"; // String | User Access Token
try {
    Opportunity result = apiInstance.getOpportunityById(opportunityId, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getOpportunityById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **opportunityId** | **String**| Opportunity ID |
 **token** | **String**| User Access Token | [optional]

### Return type

[**Opportunity**](Opportunity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOpportunityTypes"></a>
# **getOpportunityTypes**
> OpportunityTypesResponse getOpportunityTypes(token)

Retrieve Opportunity Types

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
try {
    OpportunityTypesResponse result = apiInstance.getOpportunityTypes(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getOpportunityTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]

### Return type

[**OpportunityTypesResponse**](OpportunityTypesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrderSuggestedTechnicians"></a>
# **getOrderSuggestedTechnicians**
> TechniciansResponse getOrderSuggestedTechnicians(orderId, type, keyword, take, skip, token)

List Order Suggested Technicians

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String orderId = "orderId_example"; // String | Order ID
String type = "type_example"; // String | Technician Type
String keyword = "keyword_example"; // String | Keyword to search for technicians
Integer take = 56; // Integer | Number of technicians retrieved ( Pagination )
Integer skip = 56; // Integer | Technicians to skip ( Pagination )
String token = "token_example"; // String | User Access Token
try {
    TechniciansResponse result = apiInstance.getOrderSuggestedTechnicians(orderId, type, keyword, take, skip, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getOrderSuggestedTechnicians");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Order ID |
 **type** | **String**| Technician Type |
 **keyword** | **String**| Keyword to search for technicians |
 **take** | **Integer**| Number of technicians retrieved ( Pagination ) |
 **skip** | **Integer**| Technicians to skip ( Pagination ) |
 **token** | **String**| User Access Token | [optional]

### Return type

[**TechniciansResponse**](TechniciansResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrdersStatusReport"></a>
# **getOrdersStatusReport**
> OrdersStatusReportResponse getOrdersStatusReport(dateFrom, dateTo, token)

Retrieve Orders Status Report

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String dateFrom = "dateFrom_example"; // String | Date From
String dateTo = "dateTo_example"; // String | Date To
String token = "token_example"; // String | User Access Token
try {
    OrdersStatusReportResponse result = apiInstance.getOrdersStatusReport(dateFrom, dateTo, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getOrdersStatusReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dateFrom** | **String**| Date From |
 **dateTo** | **String**| Date To |
 **token** | **String**| User Access Token | [optional]

### Return type

[**OrdersStatusReportResponse**](OrdersStatusReportResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRoleById"></a>
# **getRoleById**
> Role getRoleById(roleId, token)

Get Role By ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String roleId = "roleId_example"; // String | Role ID
String token = "token_example"; // String | User Access Token
try {
    Role result = apiInstance.getRoleById(roleId, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getRoleById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **String**| Role ID |
 **token** | **String**| User Access Token | [optional]

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRoles"></a>
# **getRoles**
> RolesResponse getRoles(keyword, take, skip, token)

Retrieve Roles

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String keyword = "keyword_example"; // String | 
Integer take = 56; // Integer | Number of Roles Retrieved ( Pagination )
Integer skip = 56; // Integer | Skipped Roles ( Pagination )
String token = "token_example"; // String | User Access Token
try {
    RolesResponse result = apiInstance.getRoles(keyword, take, skip, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyword** | **String**|  |
 **take** | **Integer**| Number of Roles Retrieved ( Pagination ) |
 **skip** | **Integer**| Skipped Roles ( Pagination ) |
 **token** | **String**| User Access Token | [optional]

### Return type

[**RolesResponse**](RolesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTags"></a>
# **getTags**
> TagsResponse getTags(token)

Retrieve Tags

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
try {
    TagsResponse result = apiInstance.getTags(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]

### Return type

[**TagsResponse**](TagsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTechnicianBusySlots"></a>
# **getTechnicianBusySlots**
> TechnicianBusySlotsResponse getTechnicianBusySlots(technicianId, dateFrom, dateTo, token)

Retrieve Technician Busy Slots By Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String technicianId = "technicianId_example"; // String | Technician ID
String dateFrom = "dateFrom_example"; // String | Date From
String dateTo = "dateTo_example"; // String | Date To
String token = "token_example"; // String | User Access Token
try {
    TechnicianBusySlotsResponse result = apiInstance.getTechnicianBusySlots(technicianId, dateFrom, dateTo, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getTechnicianBusySlots");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **technicianId** | **String**| Technician ID |
 **dateFrom** | **String**| Date From |
 **dateTo** | **String**| Date To |
 **token** | **String**| User Access Token | [optional]

### Return type

[**TechnicianBusySlotsResponse**](TechnicianBusySlotsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTechnicianById"></a>
# **getTechnicianById**
> Technician getTechnicianById(technicianId, token)

Retrieve Technician Info By Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String technicianId = "technicianId_example"; // String | Technician ID
String token = "token_example"; // String | User Access Token
try {
    Technician result = apiInstance.getTechnicianById(technicianId, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getTechnicianById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **technicianId** | **String**| Technician ID |
 **token** | **String**| User Access Token | [optional]

### Return type

[**Technician**](Technician.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTechnicianOrderFinancialDetails"></a>
# **getTechnicianOrderFinancialDetails**
> FinancialOrder getTechnicianOrderFinancialDetails(orderId, technicianId, token)

Retrieve Order Info By Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String orderId = "orderId_example"; // String | Order ID
String technicianId = "technicianId_example"; // String | Technician ID
String token = "token_example"; // String | User Access Token
try {
    FinancialOrder result = apiInstance.getTechnicianOrderFinancialDetails(orderId, technicianId, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getTechnicianOrderFinancialDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Order ID |
 **technicianId** | **String**| Technician ID |
 **token** | **String**| User Access Token | [optional]

### Return type

[**FinancialOrder**](FinancialOrder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTechnicianUnsettledOrders"></a>
# **getTechnicianUnsettledOrders**
> TechnicianUnsettledOrdersResponse getTechnicianUnsettledOrders(technicianId, token)

Retrieve Technician Unsettled Orders

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String technicianId = "technicianId_example"; // String | Technician ID
String token = "token_example"; // String | User Access Token
try {
    TechnicianUnsettledOrdersResponse result = apiInstance.getTechnicianUnsettledOrders(technicianId, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getTechnicianUnsettledOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **technicianId** | **String**| Technician ID |
 **token** | **String**| User Access Token | [optional]

### Return type

[**TechnicianUnsettledOrdersResponse**](TechnicianUnsettledOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTechniciansRequestsReport"></a>
# **getTechniciansRequestsReport**
> TechniciansRequestsReportResponse getTechniciansRequestsReport(dateFrom, dateTo, take, skip, token)

Retrieve Technicians Requests Report

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String dateFrom = "dateFrom_example"; // String | Date From
String dateTo = "dateTo_example"; // String | Date To
Integer take = 56; // Integer | Take
Integer skip = 56; // Integer | Skip
String token = "token_example"; // String | User Access Token
try {
    TechniciansRequestsReportResponse result = apiInstance.getTechniciansRequestsReport(dateFrom, dateTo, take, skip, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getTechniciansRequestsReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dateFrom** | **String**| Date From |
 **dateTo** | **String**| Date To |
 **take** | **Integer**| Take |
 **skip** | **Integer**| Skip |
 **token** | **String**| User Access Token | [optional]

### Return type

[**TechniciansRequestsReportResponse**](TechniciansRequestsReportResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserById"></a>
# **getUserById**
> User getUserById(userId, token)

Retrieve User Info By Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String userId = "userId_example"; // String | User ID
String token = "token_example"; // String | User Access Token
try {
    User result = apiInstance.getUserById(userId, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getUserById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User ID |
 **token** | **String**| User Access Token | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVisitVerificationByOrderId"></a>
# **getVisitVerificationByOrderId**
> VisitVerification getVisitVerificationByOrderId(orderId, token)

Retrieve Visit Verification Info By Order Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String orderId = "orderId_example"; // String | Order ID
String token = "token_example"; // String | User Access Token
try {
    VisitVerification result = apiInstance.getVisitVerificationByOrderId(orderId, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#getVisitVerificationByOrderId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Order ID |
 **token** | **String**| User Access Token | [optional]

### Return type

[**VisitVerification**](VisitVerification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="isAuthenticated"></a>
# **isAuthenticated**
> Void isAuthenticated(token)

Check if user is authenticated

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
try {
    Void result = apiInstance.isAuthenticated(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#isAuthenticated");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rematchOrder"></a>
# **rematchOrder**
> Order rematchOrder(token, rematchOrderRequest)

Rematch Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | Technician Access Token
RematchOrderRequest rematchOrderRequest = new RematchOrderRequest(); // RematchOrderRequest | Rematch Order Request
try {
    Order result = apiInstance.rematchOrder(token, rematchOrderRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#rematchOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]
 **rematchOrderRequest** | [**RematchOrderRequest**](RematchOrderRequest.md)| Rematch Order Request | [optional]

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rescheduleAnOrder"></a>
# **rescheduleAnOrder**
> Order rescheduleAnOrder(token, rescheduleOrderRequest)

User Reschedule Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
RescheduleOrderRequest rescheduleOrderRequest = new RescheduleOrderRequest(); // RescheduleOrderRequest | Reschedule Order Request
try {
    Order result = apiInstance.rescheduleAnOrder(token, rescheduleOrderRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#rescheduleAnOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **rescheduleOrderRequest** | [**RescheduleOrderRequest**](RescheduleOrderRequest.md)| Reschedule Order Request | [optional]

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="settleCustomer"></a>
# **settleCustomer**
> SuccessResponse settleCustomer(token, settleCustomerRequest)

User Settle Customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
SettleCustomerRequest settleCustomerRequest = new SettleCustomerRequest(); // SettleCustomerRequest | Settle Customer Request
try {
    SuccessResponse result = apiInstance.settleCustomer(token, settleCustomerRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#settleCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **settleCustomerRequest** | [**SettleCustomerRequest**](SettleCustomerRequest.md)| Settle Customer Request | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="settleTechnician"></a>
# **settleTechnician**
> SuccessResponse settleTechnician(token, settleTechnicianRequest)

User Settle Technician

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
SettleTechnicianRequest settleTechnicianRequest = new SettleTechnicianRequest(); // SettleTechnicianRequest | Settle Technician Request
try {
    SuccessResponse result = apiInstance.settleTechnician(token, settleTechnicianRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#settleTechnician");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **settleTechnicianRequest** | [**SettleTechnicianRequest**](SettleTechnicianRequest.md)| Settle Technician Request | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="settleTechnicianOrders"></a>
# **settleTechnicianOrders**
> TechnicianUnsettledOrdersResponse settleTechnicianOrders(token, settleTechnicianOrdersRequest)

Settle Technician Orders

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
SettleTechnicianOrdersRequest settleTechnicianOrdersRequest = new SettleTechnicianOrdersRequest(); // SettleTechnicianOrdersRequest | Settle Technician Orders Request
try {
    TechnicianUnsettledOrdersResponse result = apiInstance.settleTechnicianOrders(token, settleTechnicianOrdersRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#settleTechnicianOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **settleTechnicianOrdersRequest** | [**SettleTechnicianOrdersRequest**](SettleTechnicianOrdersRequest.md)| Settle Technician Orders Request | [optional]

### Return type

[**TechnicianUnsettledOrdersResponse**](TechnicianUnsettledOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="startOrderByTechnician"></a>
# **startOrderByTechnician**
> SuccessResponse startOrderByTechnician(token, startOrderRequest)

Technician Start Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
StartOrderRequest1 startOrderRequest = new StartOrderRequest1(); // StartOrderRequest1 | Start Order Request
try {
    SuccessResponse result = apiInstance.startOrderByTechnician(token, startOrderRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#startOrderByTechnician");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **startOrderRequest** | [**StartOrderRequest1**](StartOrderRequest1.md)| Start Order Request | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="suspendTechnician"></a>
# **suspendTechnician**
> Technician suspendTechnician(token, suspendTechnicianRequest)

Suspend Technician

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
SuspendTechnicianRequest suspendTechnicianRequest = new SuspendTechnicianRequest(); // SuspendTechnicianRequest | Suspend Technician Request
try {
    Technician result = apiInstance.suspendTechnician(token, suspendTechnicianRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#suspendTechnician");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **suspendTechnicianRequest** | [**SuspendTechnicianRequest**](SuspendTechnicianRequest.md)| Suspend Technician Request | [optional]

### Return type

[**Technician**](Technician.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomer"></a>
# **updateCustomer**
> Customer updateCustomer(token, updateCustomerRequest)

Update Customer Info

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
UpdateCustomerRequest updateCustomerRequest = new UpdateCustomerRequest(); // UpdateCustomerRequest | Update Customer Request
try {
    Customer result = apiInstance.updateCustomer(token, updateCustomerRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#updateCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **updateCustomerRequest** | [**UpdateCustomerRequest**](UpdateCustomerRequest.md)| Update Customer Request | [optional]

### Return type

[**Customer**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomerNotes"></a>
# **updateCustomerNotes**
> Order updateCustomerNotes(token, updateCustomerNotesRequest)

Update Customer Notes

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
UpdateCustomerNotesRequest updateCustomerNotesRequest = new UpdateCustomerNotesRequest(); // UpdateCustomerNotesRequest | Update Customer Notes Request
try {
    Order result = apiInstance.updateCustomerNotes(token, updateCustomerNotesRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#updateCustomerNotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **updateCustomerNotesRequest** | [**UpdateCustomerNotesRequest**](UpdateCustomerNotesRequest.md)| Update Customer Notes Request | [optional]

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateGuaranteeServices"></a>
# **updateGuaranteeServices**
> Order updateGuaranteeServices(token, updateGuaranteeServicesRequest)

Update Guarantee Services

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
UpdateGuaranteeServicesRequest updateGuaranteeServicesRequest = new UpdateGuaranteeServicesRequest(); // UpdateGuaranteeServicesRequest | Update Guarantee Services Request
try {
    Order result = apiInstance.updateGuaranteeServices(token, updateGuaranteeServicesRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#updateGuaranteeServices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **updateGuaranteeServicesRequest** | [**UpdateGuaranteeServicesRequest**](UpdateGuaranteeServicesRequest.md)| Update Guarantee Services Request | [optional]

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOpportunity"></a>
# **updateOpportunity**
> Opportunity updateOpportunity(token, updateOpportunityRequest)

Update Opportunity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
UpdateOpportunityRequest updateOpportunityRequest = new UpdateOpportunityRequest(); // UpdateOpportunityRequest | Update Opportunity Request
try {
    Opportunity result = apiInstance.updateOpportunity(token, updateOpportunityRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#updateOpportunity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **updateOpportunityRequest** | [**UpdateOpportunityRequest**](UpdateOpportunityRequest.md)| Update Opportunity Request | [optional]

### Return type

[**Opportunity**](Opportunity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateOrderTags"></a>
# **updateOrderTags**
> Order updateOrderTags(token, updateOrderTagsRequest)

Update Order Tags

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
UpdateOrderTagsRequest updateOrderTagsRequest = new UpdateOrderTagsRequest(); // UpdateOrderTagsRequest | Update Order Tags Request
try {
    Order result = apiInstance.updateOrderTags(token, updateOrderTagsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#updateOrderTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **updateOrderTagsRequest** | [**UpdateOrderTagsRequest**](UpdateOrderTagsRequest.md)| Update Order Tags Request | [optional]

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRole"></a>
# **updateRole**
> Role updateRole(token, updateRoleRequest)

Update Role Info

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
UpdateRoleRequest updateRoleRequest = new UpdateRoleRequest(); // UpdateRoleRequest | Update Role Request
try {
    Role result = apiInstance.updateRole(token, updateRoleRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#updateRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **updateRoleRequest** | [**UpdateRoleRequest**](UpdateRoleRequest.md)| Update Role Request | [optional]

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTechnician"></a>
# **updateTechnician**
> Technician updateTechnician(token, updateTechnicianRequest)

Update Technician Info

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
UpdateTechnicianRequest updateTechnicianRequest = new UpdateTechnicianRequest(); // UpdateTechnicianRequest | Update Technician Request
try {
    Technician result = apiInstance.updateTechnician(token, updateTechnicianRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#updateTechnician");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **updateTechnicianRequest** | [**UpdateTechnicianRequest**](UpdateTechnicianRequest.md)| Update Technician Request | [optional]

### Return type

[**Technician**](Technician.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTechnicianComment"></a>
# **updateTechnicianComment**
> Order updateTechnicianComment(token, updateTechnicianCommentRequest)

Update Technician Comment

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
UpdateTechnicianCommentRequest updateTechnicianCommentRequest = new UpdateTechnicianCommentRequest(); // UpdateTechnicianCommentRequest | Update Technician Comment Request
try {
    Order result = apiInstance.updateTechnicianComment(token, updateTechnicianCommentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#updateTechnicianComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **updateTechnicianCommentRequest** | [**UpdateTechnicianCommentRequest**](UpdateTechnicianCommentRequest.md)| Update Technician Comment Request | [optional]

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUser"></a>
# **updateUser**
> User updateUser(token, updateUserRequest)

Update User Info

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
UpdateUserRequest updateUserRequest = new UpdateUserRequest(); // UpdateUserRequest | Update User Request
try {
    User result = apiInstance.updateUser(token, updateUserRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **updateUserRequest** | [**UpdateUserRequest**](UpdateUserRequest.md)| Update User Request | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userCalculateVisitExpectedPaidAmount"></a>
# **userCalculateVisitExpectedPaidAmount**
> CalculateVisitExpectedPaidAmountResponse userCalculateVisitExpectedPaidAmount(token, calculateVisitExpectedPaidAmountRequest)

User get calculated expected paid amount for current visit

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
CalculateVisitExpectedPaidAmountRequest calculateVisitExpectedPaidAmountRequest = new CalculateVisitExpectedPaidAmountRequest(); // CalculateVisitExpectedPaidAmountRequest | Calculate Visit Expected Paid Amount Request
try {
    CalculateVisitExpectedPaidAmountResponse result = apiInstance.userCalculateVisitExpectedPaidAmount(token, calculateVisitExpectedPaidAmountRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#userCalculateVisitExpectedPaidAmount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **calculateVisitExpectedPaidAmountRequest** | [**CalculateVisitExpectedPaidAmountRequest**](CalculateVisitExpectedPaidAmountRequest.md)| Calculate Visit Expected Paid Amount Request | [optional]

### Return type

[**CalculateVisitExpectedPaidAmountResponse**](CalculateVisitExpectedPaidAmountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userLogin"></a>
# **userLogin**
> UserLoginResponse userLogin(userCredentials)

Logs user into dashboard

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
UserCredentials userCredentials = new UserCredentials(); // UserCredentials | User Credentials
try {
    UserLoginResponse result = apiInstance.userLogin(userCredentials);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#userLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userCredentials** | [**UserCredentials**](UserCredentials.md)| User Credentials | [optional]

### Return type

[**UserLoginResponse**](UserLoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userUpdateOrderServices"></a>
# **userUpdateOrderServices**
> Order userUpdateOrderServices(token, updateOrderServicesRequest)

User Update Order Services

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
UpdateOrderServicesRequest updateOrderServicesRequest = new UpdateOrderServicesRequest(); // UpdateOrderServicesRequest | User Update Order Services Request
try {
    Order result = apiInstance.userUpdateOrderServices(token, updateOrderServicesRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#userUpdateOrderServices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **updateOrderServicesRequest** | [**UpdateOrderServicesRequest**](UpdateOrderServicesRequest.md)| User Update Order Services Request | [optional]

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="viewCalendar"></a>
# **viewCalendar**
> TechniciansCalendarSlotsResponse viewCalendar(token, filterCalendarRequest)

Retrieve Calendar View

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String token = "token_example"; // String | User Access Token
FilterCalendarRequest filterCalendarRequest = new FilterCalendarRequest(); // FilterCalendarRequest | Filter Calendar Request
try {
    TechniciansCalendarSlotsResponse result = apiInstance.viewCalendar(token, filterCalendarRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#viewCalendar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User Access Token | [optional]
 **filterCalendarRequest** | [**FilterCalendarRequest**](FilterCalendarRequest.md)| Filter Calendar Request | [optional]

### Return type

[**TechniciansCalendarSlotsResponse**](TechniciansCalendarSlotsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="viewOrderById"></a>
# **viewOrderById**
> Order viewOrderById(orderId, token)

Retrieve Order Info By Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String orderId = "orderId_example"; // String | Order ID
String token = "token_example"; // String | User Access Token
try {
    Order result = apiInstance.viewOrderById(orderId, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#viewOrderById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Order ID |
 **token** | **String**| User Access Token | [optional]

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

