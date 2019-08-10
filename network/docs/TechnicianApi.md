# TechnicianApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptOrder**](TechnicianApi.md#acceptOrder) | **POST** acceptOrder | Technician Accept Order
[**acceptRescheduledOrder**](TechnicianApi.md#acceptRescheduledOrder) | **POST** acceptRescheduledOrder | Technician Accept Rescheduled Order
[**calculateVisitExpectedPaidAmount**](TechnicianApi.md#calculateVisitExpectedPaidAmount) | **POST** calculateExpectedPaidAmount | Technician get calculated expected paid amount for current visit
[**cancelOrder**](TechnicianApi.md#cancelOrder) | **POST** cancelOrder | Technician Cancel Order
[**confirmOrder**](TechnicianApi.md#confirmOrder) | **POST** confirmOrder | Technician Confirm Order
[**createVisit**](TechnicianApi.md#createVisit) | **POST** createVisit | Create New Visit
[**finalizeOrder**](TechnicianApi.md#finalizeOrder) | **POST** finalizeOrder | Technician Finalize Order
[**forgotPassword**](TechnicianApi.md#forgotPassword) | **POST** forgotPassword | Send Technician Password to his mobile
[**getBalance**](TechnicianApi.md#getBalance) | **GET** balance | Retrieve technician balance
[**getOrderById**](TechnicianApi.md#getOrderById) | **GET** order/{orderId} | Retrieve Order Info for Technician
[**getOrderServices**](TechnicianApi.md#getOrderServices) | **GET** list-order-services/{orderId} | Retrieve all active category services
[**getOrdersByStatus**](TechnicianApi.md#getOrdersByStatus) | **GET** orders/{status}/{skip} | Retrieve Orders for Technician
[**getProfile**](TechnicianApi.md#getProfile) | **GET** profile | Retrieve technician profile info
[**getSettings**](TechnicianApi.md#getSettings) | **GET** settings/{platform} | Retrieve App Settings
[**getStatus**](TechnicianApi.md#getStatus) | **GET** status | Technician Status
[**getTransactions**](TechnicianApi.md#getTransactions) | **GET** transactions/{skip} | Retrieve technician transactions
[**getWeeklyProfit**](TechnicianApi.md#getWeeklyProfit) | **GET** weekly-profit | Retrieve technician weekly profit
[**goOffline**](TechnicianApi.md#goOffline) | **POST** goOffline | Technician Go Online
[**goOnline**](TechnicianApi.md#goOnline) | **POST** goOnline | Technician Go Online
[**ignoreOrder**](TechnicianApi.md#ignoreOrder) | **POST** ignoreOrder | Technician Ignored Order
[**joinMatching**](TechnicianApi.md#joinMatching) | **POST** joinMatching | Technician Go Online to join matching
[**listCategories**](TechnicianApi.md#listCategories) | **GET** list-categories | Retrieve all active categories
[**login**](TechnicianApi.md#login) | **POST** login | Logs technician into the system
[**purgeOrdersAndResetBalance**](TechnicianApi.md#purgeOrdersAndResetBalance) | **POST** purge | Purge technician records
[**rateCustomer**](TechnicianApi.md#rateCustomer) | **POST** rateCustomer | Technician Rate Customer
[**receiveRequest**](TechnicianApi.md#receiveRequest) | **POST** receiveRequest | Technician Received Request
[**recommendTechnician**](TechnicianApi.md#recommendTechnician) | **POST** recommend-technician | Recommend new technician to join FilKhedma
[**refreshToken**](TechnicianApi.md#refreshToken) | **POST** refresh-token | Refresh Technician Access Token
[**registerPushNotification**](TechnicianApi.md#registerPushNotification) | **POST** pushNotificationRegister | Register Technician Device to Push Notification Provider
[**rejectOrder**](TechnicianApi.md#rejectOrder) | **POST** rejectOrder | Technician Reject Order
[**rejectRescheduledOrder**](TechnicianApi.md#rejectRescheduledOrder) | **POST** rejectRescheduledOrder | Technician Reject Rescheduled Order
[**requestToRegister**](TechnicianApi.md#requestToRegister) | **POST** request-to-register | Request to join FilKhedma as a technician
[**rescheduleOrder**](TechnicianApi.md#rescheduleOrder) | **POST** rescheduleOrder | Technician Reschedule Order
[**setOrderImage**](TechnicianApi.md#setOrderImage) | **POST** setOrderImage | Technician Update Order Image
[**startOrder**](TechnicianApi.md#startOrder) | **POST** startOrder | Technician Start Order
[**unregisterPushNotification**](TechnicianApi.md#unregisterPushNotification) | **POST** pushNotificationUnregister | Unregister Technician Device to Push Notification Provider
[**updateOrderServices**](TechnicianApi.md#updateOrderServices) | **POST** updateOrderServices | Technician Update Order Services


<a name="acceptOrder"></a>
# **acceptOrder**
> SuccessResponse acceptOrder(token, acceptOrderRequest)

Technician Accept Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Access Token
AcceptOrderRequest acceptOrderRequest = new AcceptOrderRequest(); // AcceptOrderRequest | Accept Order Request
try {
    SuccessResponse result = apiInstance.acceptOrder(token, acceptOrderRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#acceptOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]
 **acceptOrderRequest** | [**AcceptOrderRequest**](AcceptOrderRequest.md)| Accept Order Request | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="acceptRescheduledOrder"></a>
# **acceptRescheduledOrder**
> Order acceptRescheduledOrder(token, acceptRescheduledOrderRequest)

Technician Accept Rescheduled Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Access Token
AcceptRescheduledOrderRequest acceptRescheduledOrderRequest = new AcceptRescheduledOrderRequest(); // AcceptRescheduledOrderRequest | Accept Rescheduled Order Request
try {
    Order result = apiInstance.acceptRescheduledOrder(token, acceptRescheduledOrderRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#acceptRescheduledOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]
 **acceptRescheduledOrderRequest** | [**AcceptRescheduledOrderRequest**](AcceptRescheduledOrderRequest.md)| Accept Rescheduled Order Request | [optional]

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="calculateVisitExpectedPaidAmount"></a>
# **calculateVisitExpectedPaidAmount**
> CalculateVisitExpectedPaidAmountResponse calculateVisitExpectedPaidAmount(token, calculateVisitExpectedPaidAmountRequest)

Technician get calculated expected paid amount for current visit

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Access Token
CalculateVisitExpectedPaidAmountRequest calculateVisitExpectedPaidAmountRequest = new CalculateVisitExpectedPaidAmountRequest(); // CalculateVisitExpectedPaidAmountRequest | Calculate Visit Expected Paid Amount Request
try {
    CalculateVisitExpectedPaidAmountResponse result = apiInstance.calculateVisitExpectedPaidAmount(token, calculateVisitExpectedPaidAmountRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#calculateVisitExpectedPaidAmount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]
 **calculateVisitExpectedPaidAmountRequest** | [**CalculateVisitExpectedPaidAmountRequest**](CalculateVisitExpectedPaidAmountRequest.md)| Calculate Visit Expected Paid Amount Request | [optional]

### Return type

[**CalculateVisitExpectedPaidAmountResponse**](CalculateVisitExpectedPaidAmountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cancelOrder"></a>
# **cancelOrder**
> SuccessResponse cancelOrder(token, cancelOrderRequest)

Technician Cancel Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Access Token
CancelOrderRequest cancelOrderRequest = new CancelOrderRequest(); // CancelOrderRequest | Cancel Order Request
try {
    SuccessResponse result = apiInstance.cancelOrder(token, cancelOrderRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#cancelOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]
 **cancelOrderRequest** | [**CancelOrderRequest**](CancelOrderRequest.md)| Cancel Order Request | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="confirmOrder"></a>
# **confirmOrder**
> SuccessResponse confirmOrder(token, confirmOrderRequest)

Technician Confirm Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Access Token
ConfirmOrderRequest confirmOrderRequest = new ConfirmOrderRequest(); // ConfirmOrderRequest | Confirm Order Request
try {
    SuccessResponse result = apiInstance.confirmOrder(token, confirmOrderRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#confirmOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]
 **confirmOrderRequest** | [**ConfirmOrderRequest**](ConfirmOrderRequest.md)| Confirm Order Request | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVisit"></a>
# **createVisit**
> Order createVisit(token, newVisitRequest)

Create New Visit

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Access Token
NewVisitRequest newVisitRequest = new NewVisitRequest(); // NewVisitRequest | New Visit Request
try {
    Order result = apiInstance.createVisit(token, newVisitRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#createVisit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]
 **newVisitRequest** | [**NewVisitRequest**](NewVisitRequest.md)| New Visit Request | [optional]

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="finalizeOrder"></a>
# **finalizeOrder**
> Order finalizeOrder(token, finalizeOrderRequest)

Technician Finalize Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Access Token
FinalizeOrderRequest finalizeOrderRequest = new FinalizeOrderRequest(); // FinalizeOrderRequest | Finalize Order Request
try {
    Order result = apiInstance.finalizeOrder(token, finalizeOrderRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#finalizeOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]
 **finalizeOrderRequest** | [**FinalizeOrderRequest**](FinalizeOrderRequest.md)| Finalize Order Request | [optional]

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="forgotPassword"></a>
# **forgotPassword**
> SuccessResponse forgotPassword(forgotPasswordRequest)

Send Technician Password to his mobile

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
RestApi


TechnicianApi apiInstance = new TechnicianApi();
ForgotPasswordRequest forgotPasswordRequest = new ForgotPasswordRequest(); // ForgotPasswordRequest | Technician Mobile
try {
    SuccessResponse result = apiInstance.forgotPassword(forgotPasswordRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#forgotPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **forgotPasswordRequest** | [**ForgotPasswordRequest**](ForgotPasswordRequest.md)| Technician Mobile | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBalance"></a>
# **getBalance**
> TechnicianBalance getBalance(token)

Retrieve technician balance

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Access Token
try {
    TechnicianBalance result = apiInstance.getBalance(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#getBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]

### Return type

[**TechnicianBalance**](TechnicianBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderById"></a>
# **getOrderById**
> Order getOrderById(orderId, token)

Retrieve Order Info for Technician

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String orderId = "orderId_example"; // String | Order ID
String token = "token_example"; // String | Technician Access Token
try {
    Order result = apiInstance.getOrderById(orderId, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#getOrderById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Order ID |
 **token** | **String**| Technician Access Token | [optional]

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrderServices"></a>
# **getOrderServices**
> ServicesResponse getOrderServices(orderId, token)

Retrieve all active category services

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String orderId = "orderId_example"; // String | Order ID
String token = "token_example"; // String | Technician Access Token
try {
    ServicesResponse result = apiInstance.getOrderServices(orderId, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#getOrderServices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Order ID |
 **token** | **String**| Technician Access Token | [optional]

### Return type

[**ServicesResponse**](ServicesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrdersByStatus"></a>
# **getOrdersByStatus**
> OrdersResponse getOrdersByStatus(status, skip, token)

Retrieve Orders for Technician

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String status = "status_example"; // String | Order Status
Integer skip = 56; // Integer | Skipped Orders ( Pagination )
String token = "token_example"; // String | Technician Access Token
try {
    OrdersResponse result = apiInstance.getOrdersByStatus(status, skip, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#getOrdersByStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **String**| Order Status |
 **skip** | **Integer**| Skipped Orders ( Pagination ) |
 **token** | **String**| Technician Access Token | [optional]

### Return type

[**OrdersResponse**](OrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProfile"></a>
# **getProfile**
> ProfileResponse getProfile(token)

Retrieve technician profile info

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Access Token
try {
    ProfileResponse result = apiInstance.getProfile(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#getProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]

### Return type

[**ProfileResponse**](ProfileResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSettings"></a>
# **getSettings**
> Settings getSettings(platform)

Retrieve App Settings

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String platform = "platform_example"; // String | Application Platform
try {
    Settings result = apiInstance.getSettings(platform);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#getSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **String**| Application Platform |

### Return type

[**Settings**](Settings.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStatus"></a>
# **getStatus**
> StatusResponse getStatus(token)

Technician Status

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Access Token
try {
    StatusResponse result = apiInstance.getStatus(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#getStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]

### Return type

[**StatusResponse**](StatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransactions"></a>
# **getTransactions**
> List&lt;FinancialTransaction&gt; getTransactions(skip, token)

Retrieve technician transactions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
Integer skip = 56; // Integer | Skipped Transactions ( Pagination )
String token = "token_example"; // String | Technician Access Token
try {
    List<FinancialTransaction> result = apiInstance.getTransactions(skip, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#getTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skip** | **Integer**| Skipped Transactions ( Pagination ) |
 **token** | **String**| Technician Access Token | [optional]

### Return type

[**List&lt;FinancialTransaction&gt;**](FinancialTransaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWeeklyProfit"></a>
# **getWeeklyProfit**
> TechnicianWeeklyProfit getWeeklyProfit(token)

Retrieve technician weekly profit

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Access Token
try {
    TechnicianWeeklyProfit result = apiInstance.getWeeklyProfit(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#getWeeklyProfit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]

### Return type

[**TechnicianWeeklyProfit**](TechnicianWeeklyProfit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="goOffline"></a>
# **goOffline**
> SuccessResponse goOffline(token)

Technician Go Online

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Access Token
try {
    SuccessResponse result = apiInstance.goOffline(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#goOffline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="goOnline"></a>
# **goOnline**
> SuccessResponse goOnline(token)

Technician Go Online

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
RestApi


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Access Token
try {
    SuccessResponse result = apiInstance.goOnline(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#goOnline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ignoreOrder"></a>
# **ignoreOrder**
> SuccessResponse ignoreOrder(token, ignoreOrderRequest)

Technician Ignored Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Access Token
IgnoreOrderRequest ignoreOrderRequest = new IgnoreOrderRequest(); // IgnoreOrderRequest | Ignore Order Request
try {
    SuccessResponse result = apiInstance.ignoreOrder(token, ignoreOrderRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#ignoreOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]
 **ignoreOrderRequest** | [**IgnoreOrderRequest**](IgnoreOrderRequest.md)| Ignore Order Request | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="joinMatching"></a>
# **joinMatching**
> SuccessResponse joinMatching(token)

Technician Go Online to join matching

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Access Token
try {
    SuccessResponse result = apiInstance.joinMatching(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#joinMatching");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCategories"></a>
# **listCategories**
> List&lt;Category&gt; listCategories()

Retrieve all active categories

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
try {
    List<Category> result = apiInstance.listCategories();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#listCategories");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Category&gt;**](Category.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="login"></a>
# **login**
> LoginResponse login(credentials)

Logs technician into the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
Credentials credentials = new Credentials(); // Credentials | Technician Credentials
try {
    LoginResponse result = apiInstance.login(credentials);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#login");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **credentials** | [**Credentials**](Credentials.md)| Technician Credentials | [optional]

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="purgeOrdersAndResetBalance"></a>
# **purgeOrdersAndResetBalance**
> SuccessResponse purgeOrdersAndResetBalance(token)

Purge technician records

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Access Token
try {
    SuccessResponse result = apiInstance.purgeOrdersAndResetBalance(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#purgeOrdersAndResetBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rateCustomer"></a>
# **rateCustomer**
> Order rateCustomer(token, rateCustomerRequest)

Technician Rate Customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Access Token
RateCustomerRequest rateCustomerRequest = new RateCustomerRequest(); // RateCustomerRequest | Rate Customer Request
try {
    Order result = apiInstance.rateCustomer(token, rateCustomerRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#rateCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]
 **rateCustomerRequest** | [**RateCustomerRequest**](RateCustomerRequest.md)| Rate Customer Request | [optional]

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="receiveRequest"></a>
# **receiveRequest**
> SuccessResponse receiveRequest(token, receiveOrderRequest)

Technician Received Request

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Access Token
ReceiveOrderRequest receiveOrderRequest = new ReceiveOrderRequest(); // ReceiveOrderRequest | Receive Order Request
try {
    SuccessResponse result = apiInstance.receiveRequest(token, receiveOrderRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#receiveRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]
 **receiveOrderRequest** | [**ReceiveOrderRequest**](ReceiveOrderRequest.md)| Receive Order Request | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="recommendTechnician"></a>
# **recommendTechnician**
> SuccessResponse recommendTechnician(token, recommendedTechnicianInfo)

Recommend new technician to join FilKhedma

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Access Token
RecommendedTechnicianInfo recommendedTechnicianInfo = new RecommendedTechnicianInfo(); // RecommendedTechnicianInfo | Technician Info
try {
    SuccessResponse result = apiInstance.recommendTechnician(token, recommendedTechnicianInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#recommendTechnician");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]
 **recommendedTechnicianInfo** | [**RecommendedTechnicianInfo**](RecommendedTechnicianInfo.md)| Technician Info | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="refreshToken"></a>
# **refreshToken**
> RefreshTokenResponse refreshToken(token)

Refresh Technician Access Token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Refresh Token
try {
    RefreshTokenResponse result = apiInstance.refreshToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#refreshToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Refresh Token | [optional]

### Return type

[**RefreshTokenResponse**](RefreshTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="registerPushNotification"></a>
# **registerPushNotification**
> SuccessResponse registerPushNotification(token, pushNotificationRegistrationID)

Register Technician Device to Push Notification Provider

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Access Token
PushNotificationRegistrationID pushNotificationRegistrationID = new PushNotificationRegistrationID(); // PushNotificationRegistrationID | Push Notification Registration ID
try {
    SuccessResponse result = apiInstance.registerPushNotification(token, pushNotificationRegistrationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#registerPushNotification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]
 **pushNotificationRegistrationID** | [**PushNotificationRegistrationID**](PushNotificationRegistrationID.md)| Push Notification Registration ID | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rejectOrder"></a>
# **rejectOrder**
> SuccessResponse rejectOrder(token, rejectOrderRequest)

Technician Reject Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Access Token
RejectOrderRequest rejectOrderRequest = new RejectOrderRequest(); // RejectOrderRequest | Reject Order Request
try {
    SuccessResponse result = apiInstance.rejectOrder(token, rejectOrderRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#rejectOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]
 **rejectOrderRequest** | [**RejectOrderRequest**](RejectOrderRequest.md)| Reject Order Request | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rejectRescheduledOrder"></a>
# **rejectRescheduledOrder**
> SuccessResponse rejectRescheduledOrder(token, rejectRescheduledOrderRequest)

Technician Reject Rescheduled Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Access Token
RejectRescheduledOrderRequest rejectRescheduledOrderRequest = new RejectRescheduledOrderRequest(); // RejectRescheduledOrderRequest | Reject Order Request
try {
    SuccessResponse result = apiInstance.rejectRescheduledOrder(token, rejectRescheduledOrderRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#rejectRescheduledOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]
 **rejectRescheduledOrderRequest** | [**RejectRescheduledOrderRequest**](RejectRescheduledOrderRequest.md)| Reject Order Request | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="requestToRegister"></a>
# **requestToRegister**
> SuccessResponse requestToRegister(newTechnicianInfo)

Request to join FilKhedma as a technician

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
NewTechnicianInfo newTechnicianInfo = new NewTechnicianInfo(); // NewTechnicianInfo | Technician Info
try {
    SuccessResponse result = apiInstance.requestToRegister(newTechnicianInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#requestToRegister");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newTechnicianInfo** | [**NewTechnicianInfo**](NewTechnicianInfo.md)| Technician Info | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rescheduleOrder"></a>
# **rescheduleOrder**
> Order rescheduleOrder(token, rescheduleOrderRequest)

Technician Reschedule Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Access Token
RescheduleOrderRequest rescheduleOrderRequest = new RescheduleOrderRequest(); // RescheduleOrderRequest | Reschedule Order Request
try {
    Order result = apiInstance.rescheduleOrder(token, rescheduleOrderRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#rescheduleOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]
 **rescheduleOrderRequest** | [**RescheduleOrderRequest**](RescheduleOrderRequest.md)| Reschedule Order Request | [optional]

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setOrderImage"></a>
# **setOrderImage**
> SuccessResponse setOrderImage(token, orderId, type, image)

Technician Update Order Image

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Access Token
String orderId = "orderId_example"; // String | Order ID
String type = "type_example"; // String | Order Image Type
File image = new File("/path/to/file.txt"); // File | Order Image
try {
    SuccessResponse result = apiInstance.setOrderImage(token, orderId, type, image);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#setOrderImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]
 **orderId** | **String**| Order ID | [optional]
 **type** | **String**| Order Image Type | [optional] [enum: before, after]
 **image** | **File**| Order Image | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="startOrder"></a>
# **startOrder**
> SuccessResponse startOrder(token, startOrderRequest)

Technician Start Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Access Token
StartOrderRequest startOrderRequest = new StartOrderRequest(); // StartOrderRequest | Start Order Request
try {
    SuccessResponse result = apiInstance.startOrder(token, startOrderRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#startOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]
 **startOrderRequest** | [**StartOrderRequest**](StartOrderRequest.md)| Start Order Request | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unregisterPushNotification"></a>
# **unregisterPushNotification**
> SuccessResponse unregisterPushNotification(token)

Unregister Technician Device to Push Notification Provider

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Access Token
try {
    SuccessResponse result = apiInstance.unregisterPushNotification(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#unregisterPushNotification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOrderServices"></a>
# **updateOrderServices**
> Order updateOrderServices(token, updateOrderServicesRequest)

Technician Update Order Services

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TechnicianApi;


TechnicianApi apiInstance = new TechnicianApi();
String token = "token_example"; // String | Technician Access Token
UpdateOrderServicesRequest updateOrderServicesRequest = new UpdateOrderServicesRequest(); // UpdateOrderServicesRequest | Update Order Services Request
try {
    Order result = apiInstance.updateOrderServices(token, updateOrderServicesRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechnicianApi#updateOrderServices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Technician Access Token | [optional]
 **updateOrderServicesRequest** | [**UpdateOrderServicesRequest**](UpdateOrderServicesRequest.md)| Update Order Services Request | [optional]

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

