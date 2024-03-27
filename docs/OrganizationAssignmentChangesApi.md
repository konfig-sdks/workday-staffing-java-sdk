# OrganizationAssignmentChangesApi

All URIs are relative to *https://&lt;tenantHostname&gt;/staffing/v6*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createChangeEvent**](OrganizationAssignmentChangesApi.md#createChangeEvent) | **POST** /organizationAssignmentChanges | Creates a new change organization assignment event for a specific filled or unfilled position. |
| [**getBusinessUnit**](OrganizationAssignmentChangesApi.md#getBusinessUnit) | **GET** /organizationAssignmentChanges/{ID}/businessUnit/{subresourceID} | Retrieves a business unit for the specified organization assignment change ID. |
| [**getBusinessUnit_0**](OrganizationAssignmentChangesApi.md#getBusinessUnit_0) | **GET** /organizationAssignmentChanges/{ID}/businessUnit | Retrieves a business unit for the specified organization assignment change ID. |
| [**getComment**](OrganizationAssignmentChangesApi.md#getComment) | **GET** /organizationAssignmentChanges/{ID}/comment | Retrieves the comment information for the specified organization assignment change ID. |
| [**getCommentInfo**](OrganizationAssignmentChangesApi.md#getCommentInfo) | **GET** /organizationAssignmentChanges/{ID}/comment/{subresourceID} | Retrieves the comment information for the specified organization assignment change ID. |
| [**getCompany**](OrganizationAssignmentChangesApi.md#getCompany) | **GET** /organizationAssignmentChanges/{ID}/company | Retrieves a company for the specified organization assignment change ID. |
| [**getCompanyById**](OrganizationAssignmentChangesApi.md#getCompanyById) | **GET** /organizationAssignmentChanges/{ID}/company/{subresourceID} | Retrieves a company for the specified organization assignment change ID. |
| [**getCostCenter**](OrganizationAssignmentChangesApi.md#getCostCenter) | **GET** /organizationAssignmentChanges/{ID}/costCenter/{subresourceID} | Retrieves a cost center for the specified organization assignment change ID. |
| [**getCostCenter_0**](OrganizationAssignmentChangesApi.md#getCostCenter_0) | **GET** /organizationAssignmentChanges/{ID}/costCenter | Retrieves a cost center for the specified organization assignment change ID. |
| [**getCostingOrganizations**](OrganizationAssignmentChangesApi.md#getCostingOrganizations) | **GET** /organizationAssignmentChanges/{ID}/costing/{subresourceID} | Retrieves the costing organizations for the specified organization assignment change ID. |
| [**getCostingOrganizations_0**](OrganizationAssignmentChangesApi.md#getCostingOrganizations_0) | **GET** /organizationAssignmentChanges/{ID}/costing | Retrieves the costing organizations for the specified organization assignment change ID. |
| [**getCustomOrganizations**](OrganizationAssignmentChangesApi.md#getCustomOrganizations) | **GET** /organizationAssignmentChanges/{ID}/customOrganizations/{subresourceID} | Retrieves the custom organizations for the specified organization assignment change ID. |
| [**getCustomOrganizations_0**](OrganizationAssignmentChangesApi.md#getCustomOrganizations_0) | **GET** /organizationAssignmentChanges/{ID}/customOrganizations | Retrieves the custom organizations for the specified organization assignment change ID. |
| [**getInstance**](OrganizationAssignmentChangesApi.md#getInstance) | **GET** /organizationAssignmentChanges/{ID} | Retrieves a single organization assignment change event instance. |
| [**getRegion**](OrganizationAssignmentChangesApi.md#getRegion) | **GET** /organizationAssignmentChanges/{ID}/region | Retrieves a region for the specified organization assignment change ID. |
| [**getRegionById**](OrganizationAssignmentChangesApi.md#getRegionById) | **GET** /organizationAssignmentChanges/{ID}/region/{subresourceID} | Retrieves a region for the specified organization assignment change ID. |
| [**getStartDetails**](OrganizationAssignmentChangesApi.md#getStartDetails) | **GET** /organizationAssignmentChanges/{ID}/startDetails/{subresourceID} | Retrieves the start details for the specified organization assignment change ID. |
| [**getStartDetails_0**](OrganizationAssignmentChangesApi.md#getStartDetails_0) | **GET** /organizationAssignmentChanges/{ID}/startDetails | Retrieves the start details for the specified organization assignment change ID. |
| [**partiallyUpdateCompany**](OrganizationAssignmentChangesApi.md#partiallyUpdateCompany) | **PATCH** /organizationAssignmentChanges/{ID}/company/{subresourceID} | Partially updates the company for the specified organization assignment change ID. |
| [**partiallyUpdateCostingOptions**](OrganizationAssignmentChangesApi.md#partiallyUpdateCostingOptions) | **PATCH** /organizationAssignmentChanges/{ID}/costing/{subresourceID} | Partially updates the costing organization options for the specified organization assignment change ID. |
| [**partiallyUpdateStartDetails**](OrganizationAssignmentChangesApi.md#partiallyUpdateStartDetails) | **PATCH** /organizationAssignmentChanges/{ID}/startDetails/{subresourceID} | Partially updates the start details for the specified organization assignment change ID. |
| [**submitChangeRequest**](OrganizationAssignmentChangesApi.md#submitChangeRequest) | **POST** /organizationAssignmentChanges/{ID}/submit | Submits the organization changes request for the specified ID, and initiates the Change Organization Assignment business process. |
| [**updateBusinessUnit**](OrganizationAssignmentChangesApi.md#updateBusinessUnit) | **PATCH** /organizationAssignmentChanges/{ID}/businessUnit/{subresourceID} | Partially updates the business unit for the specified organization assignment change ID. |
| [**updateComment**](OrganizationAssignmentChangesApi.md#updateComment) | **PATCH** /organizationAssignmentChanges/{ID}/comment/{subresourceID} | Partially updates  the comment for the organization assignment change ID. |
| [**updateCostCenter**](OrganizationAssignmentChangesApi.md#updateCostCenter) | **PATCH** /organizationAssignmentChanges/{ID}/costCenter/{subresourceID} | Partially updates the cost center for the specified organization assignment change ID. |
| [**updateCustomOrganizations**](OrganizationAssignmentChangesApi.md#updateCustomOrganizations) | **PATCH** /organizationAssignmentChanges/{ID}/customOrganizations/{subresourceID} | Partially updates the custom organizations for the specified organization assignment change ID. |
| [**updateRegion**](OrganizationAssignmentChangesApi.md#updateRegion) | **PATCH** /organizationAssignmentChanges/{ID}/region/{subresourceID} | Partially updates the region for the specified organization assignment change ID. |


<a name="createChangeEvent"></a>
# **createChangeEvent**
> OrganizationAssignmentChangesPostPositionCf97466f96d9100029bffcf91c120000 createChangeEvent(organizationAssignmentChangesPostPositionCf97466f96d9100029bffcf91c120000).execute();

Creates a new change organization assignment event for a specific filled or unfilled position.

Creates a new change organization assignment event for a specific filled or unfilled position, which returns a new change organization assignment ID. Specify the new ID in subsequent requests that update or get information about the change organization assignment event.  In the request body, specify at least this required field: date, job {id}.\&quot;  Secured by: Change Organization Assignment (REST)  Scope: Organizations and Roles

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    PositionCf97466f96d9100029bffcf91c120001 position = new PositionCf97466f96d9100029bffcf91c120001();
    MassActionWorksheet31485c9a93c0100007276cf4e5640000 massActionWorksheet = new MassActionWorksheet31485c9a93c0100007276cf4e5640000();
    MassActionHeaderCf97466f96d910002bd32afbf0000001 massActionHeader = new MassActionHeaderCf97466f96d910002bd32afbf0000001();
    LocalDate date = LocalDate.now(); // The effective date of the business process event using the yyyy-mm-dd format.
    String id = "id_example"; // Id of the instance
    String descriptor = "descriptor_example"; // A preview of the instance
    try {
      OrganizationAssignmentChangesPostPositionCf97466f96d9100029bffcf91c120000 result = client
              .organizationAssignmentChanges
              .createChangeEvent()
              .position(position)
              .massActionWorksheet(massActionWorksheet)
              .massActionHeader(massActionHeader)
              .date(date)
              .id(id)
              .descriptor(descriptor)
              .execute();
      System.out.println(result);
      System.out.println(result.getPosition());
      System.out.println(result.getMassActionWorksheet());
      System.out.println(result.getMassActionHeader());
      System.out.println(result.getDate());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#createChangeEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationAssignmentChangesPostPositionCf97466f96d9100029bffcf91c120000> response = client
              .organizationAssignmentChanges
              .createChangeEvent()
              .position(position)
              .massActionWorksheet(massActionWorksheet)
              .massActionHeader(massActionHeader)
              .date(date)
              .id(id)
              .descriptor(descriptor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#createChangeEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationAssignmentChangesPostPositionCf97466f96d9100029bffcf91c120000** | [**OrganizationAssignmentChangesPostPositionCf97466f96d9100029bffcf91c120000**](OrganizationAssignmentChangesPostPositionCf97466f96d9100029bffcf91c120000.md)|  | |

### Return type

[**OrganizationAssignmentChangesPostPositionCf97466f96d9100029bffcf91c120000**](OrganizationAssignmentChangesPostPositionCf97466f96d9100029bffcf91c120000.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Resource created. |  -  |
| **0** | An error occurred. |  -  |

<a name="getBusinessUnit"></a>
# **getBusinessUnit**
> OrganizationAssignmentChangesBusinessUnitData5aabf8e28cb310002520b2a2b31d0365 getBusinessUnit(ID, subresourceID).execute();

Retrieves a business unit for the specified organization assignment change ID.

Retrieves a business unit for the specified organization assignment change ID.  The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Organizations: Business Unit  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    try {
      OrganizationAssignmentChangesBusinessUnitData5aabf8e28cb310002520b2a2b31d0365 result = client
              .organizationAssignmentChanges
              .getBusinessUnit(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getBusinessUnit());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getBusinessUnit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationAssignmentChangesBusinessUnitData5aabf8e28cb310002520b2a2b31d0365> response = client
              .organizationAssignmentChanges
              .getBusinessUnit(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getBusinessUnit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |

### Return type

[**OrganizationAssignmentChangesBusinessUnitData5aabf8e28cb310002520b2a2b31d0365**](OrganizationAssignmentChangesBusinessUnitData5aabf8e28cb310002520b2a2b31d0365.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="getBusinessUnit_0"></a>
# **getBusinessUnit_0**
> OrganizationAssignmentChangesGetBusinessUnitResponse getBusinessUnit_0(ID).limit(limit).offset(offset).execute();

Retrieves a business unit for the specified organization assignment change ID.

Retrieves a business unit for the specified organization assignment change ID. The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Organizations: Business Unit  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    try {
      OrganizationAssignmentChangesGetBusinessUnitResponse result = client
              .organizationAssignmentChanges
              .getBusinessUnit_0(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getBusinessUnit_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationAssignmentChangesGetBusinessUnitResponse> response = client
              .organizationAssignmentChanges
              .getBusinessUnit_0(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getBusinessUnit_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ID** | **String**| The Workday ID of the resource. | |
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |

### Return type

[**OrganizationAssignmentChangesGetBusinessUnitResponse**](OrganizationAssignmentChangesGetBusinessUnitResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="getComment"></a>
# **getComment**
> OrganizationAssignmentChangesGetCommentResponse getComment(ID).limit(limit).offset(offset).execute();

Retrieves the comment information for the specified organization assignment change ID.

Retrieves the comment information for the specified organization assignment change ID. The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Change Organization Assignment (REST), Change Organization Assignments for  \\~Worker\\~ (Mass Action)  Scope: Organizations and Roles

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    try {
      OrganizationAssignmentChangesGetCommentResponse result = client
              .organizationAssignmentChanges
              .getComment(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationAssignmentChangesGetCommentResponse> response = client
              .organizationAssignmentChanges
              .getComment(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ID** | **String**| The Workday ID of the resource. | |
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |

### Return type

[**OrganizationAssignmentChangesGetCommentResponse**](OrganizationAssignmentChangesGetCommentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="getCommentInfo"></a>
# **getCommentInfo**
> Comments7d98fd55aeee100022968e52a1b31c60 getCommentInfo(ID, subresourceID).execute();

Retrieves the comment information for the specified organization assignment change ID.

Retrieves the comment information for the specified organization assignment change ID. The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Change Organization Assignment (REST), Change Organization Assignments for  \\~Worker\\~ (Mass Action)  Scope: Organizations and Roles

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    try {
      Comments7d98fd55aeee100022968e52a1b31c60 result = client
              .organizationAssignmentChanges
              .getCommentInfo(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getComment());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getCommentInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Comments7d98fd55aeee100022968e52a1b31c60> response = client
              .organizationAssignmentChanges
              .getCommentInfo(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getCommentInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |

### Return type

[**Comments7d98fd55aeee100022968e52a1b31c60**](Comments7d98fd55aeee100022968e52a1b31c60.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="getCompany"></a>
# **getCompany**
> OrganizationAssignmentChangesGetCompanyResponse getCompany(ID).limit(limit).offset(offset).execute();

Retrieves a company for the specified organization assignment change ID.

Retrieves a company for the specified organization assignment change ID. The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Organizations: Company  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    try {
      OrganizationAssignmentChangesGetCompanyResponse result = client
              .organizationAssignmentChanges
              .getCompany(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getCompany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationAssignmentChangesGetCompanyResponse> response = client
              .organizationAssignmentChanges
              .getCompany(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getCompany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ID** | **String**| The Workday ID of the resource. | |
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |

### Return type

[**OrganizationAssignmentChangesGetCompanyResponse**](OrganizationAssignmentChangesGetCompanyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="getCompanyById"></a>
# **getCompanyById**
> OrganizationAssignmentChangesCompanyData652d516fdff41000086e0b9c96950354 getCompanyById(ID, subresourceID).execute();

Retrieves a company for the specified organization assignment change ID.

Retrieves a company for the specified organization assignment change ID.  The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Organizations: Company  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    try {
      OrganizationAssignmentChangesCompanyData652d516fdff41000086e0b9c96950354 result = client
              .organizationAssignmentChanges
              .getCompanyById(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getCompany());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getCompanyById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationAssignmentChangesCompanyData652d516fdff41000086e0b9c96950354> response = client
              .organizationAssignmentChanges
              .getCompanyById(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getCompanyById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |

### Return type

[**OrganizationAssignmentChangesCompanyData652d516fdff41000086e0b9c96950354**](OrganizationAssignmentChangesCompanyData652d516fdff41000086e0b9c96950354.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="getCostCenter"></a>
# **getCostCenter**
> OrganizationAssignmentChangesCostCenterData5aabf8e28cb3100010a999db2700024e getCostCenter(ID, subresourceID).execute();

Retrieves a cost center for the specified organization assignment change ID.

Retrieves a cost center for the specified organization assignment change ID.  The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Organizations: Cost Center  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    try {
      OrganizationAssignmentChangesCostCenterData5aabf8e28cb3100010a999db2700024e result = client
              .organizationAssignmentChanges
              .getCostCenter(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getCostCenter());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getCostCenter");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationAssignmentChangesCostCenterData5aabf8e28cb3100010a999db2700024e> response = client
              .organizationAssignmentChanges
              .getCostCenter(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getCostCenter");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |

### Return type

[**OrganizationAssignmentChangesCostCenterData5aabf8e28cb3100010a999db2700024e**](OrganizationAssignmentChangesCostCenterData5aabf8e28cb3100010a999db2700024e.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="getCostCenter_0"></a>
# **getCostCenter_0**
> OrganizationAssignmentChangesGetCostCenterResponse getCostCenter_0(ID).limit(limit).offset(offset).execute();

Retrieves a cost center for the specified organization assignment change ID.

Retrieves a cost center for the specified organization assignment change ID. The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Organizations: Cost Center  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    try {
      OrganizationAssignmentChangesGetCostCenterResponse result = client
              .organizationAssignmentChanges
              .getCostCenter_0(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getCostCenter_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationAssignmentChangesGetCostCenterResponse> response = client
              .organizationAssignmentChanges
              .getCostCenter_0(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getCostCenter_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ID** | **String**| The Workday ID of the resource. | |
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |

### Return type

[**OrganizationAssignmentChangesGetCostCenterResponse**](OrganizationAssignmentChangesGetCostCenterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="getCostingOrganizations"></a>
# **getCostingOrganizations**
> OrganizationAssignmentChangesCostingDataA18edb56aca0100014a4a09dc57e045a getCostingOrganizations(ID, subresourceID).execute();

Retrieves the costing organizations for the specified organization assignment change ID.

Retrieves the costing organizations for the specified organization assignment change ID. Costing organizations include: Grants, Funds, Programs, and Gifts. The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Organizations: Grant, Fund, Program, Gift  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    try {
      OrganizationAssignmentChangesCostingDataA18edb56aca0100014a4a09dc57e045a result = client
              .organizationAssignmentChanges
              .getCostingOrganizations(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getGrant());
      System.out.println(result.getProgram());
      System.out.println(result.getGift());
      System.out.println(result.getFund());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getCostingOrganizations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationAssignmentChangesCostingDataA18edb56aca0100014a4a09dc57e045a> response = client
              .organizationAssignmentChanges
              .getCostingOrganizations(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getCostingOrganizations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |

### Return type

[**OrganizationAssignmentChangesCostingDataA18edb56aca0100014a4a09dc57e045a**](OrganizationAssignmentChangesCostingDataA18edb56aca0100014a4a09dc57e045a.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="getCostingOrganizations_0"></a>
# **getCostingOrganizations_0**
> OrganizationAssignmentChangesGetCostingOrganizationsResponse getCostingOrganizations_0(ID).limit(limit).offset(offset).execute();

Retrieves the costing organizations for the specified organization assignment change ID.

Retrieves the costing organizations for the specified organization assignment change ID. Costing organizations include: Grants, Funds, Programs, and Gifts. The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Organizations: Grant, Fund, Program, Gift  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    try {
      OrganizationAssignmentChangesGetCostingOrganizationsResponse result = client
              .organizationAssignmentChanges
              .getCostingOrganizations_0(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getCostingOrganizations_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationAssignmentChangesGetCostingOrganizationsResponse> response = client
              .organizationAssignmentChanges
              .getCostingOrganizations_0(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getCostingOrganizations_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ID** | **String**| The Workday ID of the resource. | |
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |

### Return type

[**OrganizationAssignmentChangesGetCostingOrganizationsResponse**](OrganizationAssignmentChangesGetCostingOrganizationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="getCustomOrganizations"></a>
# **getCustomOrganizations**
> OrganizationAssignmentChangesCustomOrganizationDetailsData53cd2b632146100011e9bf4e7041551f getCustomOrganizations(ID, subresourceID).execute();

Retrieves the custom organizations for the specified organization assignment change ID.

Retrieves the custom organizations for the specified organization assignment change ID. The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Organizations: Custom Organization  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    try {
      OrganizationAssignmentChangesCustomOrganizationDetailsData53cd2b632146100011e9bf4e7041551f result = client
              .organizationAssignmentChanges
              .getCustomOrganizations(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomOrganizations());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getCustomOrganizations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationAssignmentChangesCustomOrganizationDetailsData53cd2b632146100011e9bf4e7041551f> response = client
              .organizationAssignmentChanges
              .getCustomOrganizations(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getCustomOrganizations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |

### Return type

[**OrganizationAssignmentChangesCustomOrganizationDetailsData53cd2b632146100011e9bf4e7041551f**](OrganizationAssignmentChangesCustomOrganizationDetailsData53cd2b632146100011e9bf4e7041551f.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="getCustomOrganizations_0"></a>
# **getCustomOrganizations_0**
> OrganizationAssignmentChangesGetCustomOrganizationsResponse getCustomOrganizations_0(ID).limit(limit).offset(offset).execute();

Retrieves the custom organizations for the specified organization assignment change ID.

Retrieves the custom organizations for the specified organization assignment change ID. The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Organizations: Custom Organization  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    try {
      OrganizationAssignmentChangesGetCustomOrganizationsResponse result = client
              .organizationAssignmentChanges
              .getCustomOrganizations_0(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getCustomOrganizations_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationAssignmentChangesGetCustomOrganizationsResponse> response = client
              .organizationAssignmentChanges
              .getCustomOrganizations_0(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getCustomOrganizations_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ID** | **String**| The Workday ID of the resource. | |
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |

### Return type

[**OrganizationAssignmentChangesGetCustomOrganizationsResponse**](OrganizationAssignmentChangesGetCustomOrganizationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="getInstance"></a>
# **getInstance**
> ChangeOrganizationAssignmentDefaultRepresentationDb2f38bfb555100012de1eb17c2f00ff getInstance(ID).execute();

Retrieves a single organization assignment change event instance.

Retrieves information about an organization assignment change event with the specified ID.  Secured by: Change Organization Assignment (REST), Staffing Organizations: Business Unit, Staffing Organizations: Company, Staffing Organizations: Cost Center, Staffing Organizations: Custom Organization, Staffing Organizations: Grant, Fund, Program, Gift, Staffing Organizations: Header, Staffing Organizations: Region  Scope: Organizations and Roles, Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    try {
      ChangeOrganizationAssignmentDefaultRepresentationDb2f38bfb555100012de1eb17c2f00ff result = client
              .organizationAssignmentChanges
              .getInstance(ID)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getInstance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChangeOrganizationAssignmentDefaultRepresentationDb2f38bfb555100012de1eb17c2f00ff> response = client
              .organizationAssignmentChanges
              .getInstance(ID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getInstance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ID** | **String**| The Workday ID of the resource. | |

### Return type

[**ChangeOrganizationAssignmentDefaultRepresentationDb2f38bfb555100012de1eb17c2f00ff**](ChangeOrganizationAssignmentDefaultRepresentationDb2f38bfb555100012de1eb17c2f00ff.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="getRegion"></a>
# **getRegion**
> OrganizationAssignmentChangesGetRegionResponse getRegion(ID).limit(limit).offset(offset).execute();

Retrieves a region for the specified organization assignment change ID.

Retrieves a region for the specified organization assignment change ID. The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Organizations: Region  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    try {
      OrganizationAssignmentChangesGetRegionResponse result = client
              .organizationAssignmentChanges
              .getRegion(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getRegion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationAssignmentChangesGetRegionResponse> response = client
              .organizationAssignmentChanges
              .getRegion(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getRegion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ID** | **String**| The Workday ID of the resource. | |
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |

### Return type

[**OrganizationAssignmentChangesGetRegionResponse**](OrganizationAssignmentChangesGetRegionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="getRegionById"></a>
# **getRegionById**
> OrganizationAssignmentChangesRegionDataA18edb56aca0100006997e68e5780373 getRegionById(ID, subresourceID).execute();

Retrieves a region for the specified organization assignment change ID.

Retrieves a region for the specified organization assignment change ID.  The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Organizations: Region  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    try {
      OrganizationAssignmentChangesRegionDataA18edb56aca0100006997e68e5780373 result = client
              .organizationAssignmentChanges
              .getRegionById(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getRegion());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getRegionById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationAssignmentChangesRegionDataA18edb56aca0100006997e68e5780373> response = client
              .organizationAssignmentChanges
              .getRegionById(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getRegionById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |

### Return type

[**OrganizationAssignmentChangesRegionDataA18edb56aca0100006997e68e5780373**](OrganizationAssignmentChangesRegionDataA18edb56aca0100006997e68e5780373.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="getStartDetails"></a>
# **getStartDetails**
> OrganizationAssignmentChangesStartDetailsData90009f2bfc49100017b10cd07d19063b getStartDetails(ID, subresourceID).execute();

Retrieves the start details for the specified organization assignment change ID.

Retrieves the start details for the specified organization assignment change ID. The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Organizations: Header  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    try {
      OrganizationAssignmentChangesStartDetailsData90009f2bfc49100017b10cd07d19063b result = client
              .organizationAssignmentChanges
              .getStartDetails(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getDate());
      System.out.println(result.getSupervisoryOrganization());
      System.out.println(result.getPosition());
      System.out.println(result.getWorker());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getStartDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationAssignmentChangesStartDetailsData90009f2bfc49100017b10cd07d19063b> response = client
              .organizationAssignmentChanges
              .getStartDetails(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getStartDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |

### Return type

[**OrganizationAssignmentChangesStartDetailsData90009f2bfc49100017b10cd07d19063b**](OrganizationAssignmentChangesStartDetailsData90009f2bfc49100017b10cd07d19063b.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="getStartDetails_0"></a>
# **getStartDetails_0**
> OrganizationAssignmentChangesGetStartDetailsResponse getStartDetails_0(ID).limit(limit).offset(offset).execute();

Retrieves the start details for the specified organization assignment change ID.

Retrieves the start details for the specified organization assignment change ID. The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Organizations: Header  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    try {
      OrganizationAssignmentChangesGetStartDetailsResponse result = client
              .organizationAssignmentChanges
              .getStartDetails_0(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getStartDetails_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationAssignmentChangesGetStartDetailsResponse> response = client
              .organizationAssignmentChanges
              .getStartDetails_0(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#getStartDetails_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ID** | **String**| The Workday ID of the resource. | |
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |

### Return type

[**OrganizationAssignmentChangesGetStartDetailsResponse**](OrganizationAssignmentChangesGetStartDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. |  -  |
| **0** | An error occurred. |  -  |

<a name="partiallyUpdateCompany"></a>
# **partiallyUpdateCompany**
> OrganizationAssignmentChangesCompanyData652d516fdff41000086e0b9c96950354 partiallyUpdateCompany(ID, subresourceID, organizationAssignmentChangesCompanyData652d516fdff41000086e0b9c96950354).execute();

Partially updates the company for the specified organization assignment change ID.

Partially updates the company for the specified organization assignment change ID.  The {subResourceID} path parameter must be the same as the {ID} value.  You can call GET /organizationAssignmentChanges/{ID}/company/{subResourceID} to get the existing data to update.   The same Workday UI validations apply with this PATCH method. The data updates in this PATCH method do not persist until you call POST /organizationAssignmentChanges/{ID}/submit.  In the request body, specify the Workday ID of the company.   To retrieve a companies ID, call the GET /values/organizationAssignmentChangesGroup/companies prompt endpoint, which takes the change organization assignment ID as the event query parameter. If you specify the event parameter, it returns HREF links to the companies by organization, as of the event&#39;s effective date. If you don&#39;t specify the event parameter, it returns HREF links to the companies by active organization based on the current date.  Secured by: Staffing Organizations: Company  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    Company56fe0dd0eca1100019cfe097d26a03f2 company = new Company56fe0dd0eca1100019cfe097d26a03f2();
    try {
      OrganizationAssignmentChangesCompanyData652d516fdff41000086e0b9c96950354 result = client
              .organizationAssignmentChanges
              .partiallyUpdateCompany(ID, subresourceID)
              .company(company)
              .execute();
      System.out.println(result);
      System.out.println(result.getCompany());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#partiallyUpdateCompany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationAssignmentChangesCompanyData652d516fdff41000086e0b9c96950354> response = client
              .organizationAssignmentChanges
              .partiallyUpdateCompany(ID, subresourceID)
              .company(company)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#partiallyUpdateCompany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |
| **organizationAssignmentChangesCompanyData652d516fdff41000086e0b9c96950354** | [**OrganizationAssignmentChangesCompanyData652d516fdff41000086e0b9c96950354**](OrganizationAssignmentChangesCompanyData652d516fdff41000086e0b9c96950354.md)|  | |

### Return type

[**OrganizationAssignmentChangesCompanyData652d516fdff41000086e0b9c96950354**](OrganizationAssignmentChangesCompanyData652d516fdff41000086e0b9c96950354.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. Updating resource. |  -  |
| **0** | An error occurred. |  -  |

<a name="partiallyUpdateCostingOptions"></a>
# **partiallyUpdateCostingOptions**
> OrganizationAssignmentChangesCostingDataA18edb56aca0100014a4a09dc57e045a partiallyUpdateCostingOptions(ID, subresourceID, organizationAssignmentChangesCostingDataA18edb56aca0100014a4a09dc57e045a).execute();

Partially updates the costing organization options for the specified organization assignment change ID.

Partially updates the costing organizations for the specified organization assignment change ID. Costing organizations include: Grants, Funds, Programs, and Gifts. The {subResourceID} path parameter must be the same as the {ID} value.  You can call GET /organizationAssignmentChanges/{ID}/costing/{subResourceID} to get the existing data to update.   The same Workday UI validations apply with this PATCH method. The data updates in this PATCH method do not persist until you call POST /organizationAssignmentChanges/{ID}/submit.  In the request body, specify the Workday ID of the grant, program, gift, or fund you want to update.  To retrieve a grants ID, call the GET /values/organizationAssignmentChangesGroup/grants prompt endpoint, which takes the change organization assignment ID as the event query parameter. If you specify the event parameter, it returns HREF links to the grants by organization, as of the event&#39;s effective date. If you don&#39;t specify the event parameter, it returns HREF links to the grants by active organization based on the current date.   To retrieve a funds ID, call the GET /values/organizationAssignmentChangesGroup/funds prompt endpoint, which takes the change organization assignment ID as the event query parameter. If you specify the event parameter, it returns HREF links to the funds by organization, as of the event&#39;s effective date. If you don&#39;t specify the event parameter, it returns HREF links to the funds by active organization based on the current date.   To retrieve a programs ID, call the GET /values/organizationAssignmentChangesGroup/programs prompt endpoint, which takes the change organization assignment ID as the event query parameter. If you specify the event parameter, it returns HREF links to the programs by organization, as of the event&#39;s effective date. If you don&#39;t specify the event parameter, it returns HREF links to the programs by active organization based on the current date.   To retrieve a gifts ID, call the GET /values/organizationAssignmentChangesGroup/gifts prompt endpoint, which takes the change organization assignment ID as the event query parameter. If you specify the event parameter, it returns HREF links to the gifts by organization, as of the event&#39;s effective date. If you don&#39;t specify the event parameter, it returns HREF links to the gifts by active organization based on the current date.  Secured by: Staffing Organizations: Grant, Fund, Program, Gift  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    GrantA18edb56aca0100014a4a0bcf25c045e grant = new GrantA18edb56aca0100014a4a0bcf25c045e();
    ProgramA18edb56aca0100014a4a0b7ddf7045d program = new ProgramA18edb56aca0100014a4a0b7ddf7045d();
    GiftA18edb56aca0100014a4a0a9f876045b gift = new GiftA18edb56aca0100014a4a0a9f876045b();
    FundA18edb56aca0100014a4a0b27352045c fund = new FundA18edb56aca0100014a4a0b27352045c();
    try {
      OrganizationAssignmentChangesCostingDataA18edb56aca0100014a4a09dc57e045a result = client
              .organizationAssignmentChanges
              .partiallyUpdateCostingOptions(ID, subresourceID)
              .grant(grant)
              .program(program)
              .gift(gift)
              .fund(fund)
              .execute();
      System.out.println(result);
      System.out.println(result.getGrant());
      System.out.println(result.getProgram());
      System.out.println(result.getGift());
      System.out.println(result.getFund());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#partiallyUpdateCostingOptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationAssignmentChangesCostingDataA18edb56aca0100014a4a09dc57e045a> response = client
              .organizationAssignmentChanges
              .partiallyUpdateCostingOptions(ID, subresourceID)
              .grant(grant)
              .program(program)
              .gift(gift)
              .fund(fund)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#partiallyUpdateCostingOptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |
| **organizationAssignmentChangesCostingDataA18edb56aca0100014a4a09dc57e045a** | [**OrganizationAssignmentChangesCostingDataA18edb56aca0100014a4a09dc57e045a**](OrganizationAssignmentChangesCostingDataA18edb56aca0100014a4a09dc57e045a.md)|  | |

### Return type

[**OrganizationAssignmentChangesCostingDataA18edb56aca0100014a4a09dc57e045a**](OrganizationAssignmentChangesCostingDataA18edb56aca0100014a4a09dc57e045a.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. Updating resource. |  -  |
| **0** | An error occurred. |  -  |

<a name="partiallyUpdateStartDetails"></a>
# **partiallyUpdateStartDetails**
> OrganizationAssignmentChangesStartDetailsData90009f2bfc49100017b10cd07d19063b partiallyUpdateStartDetails(ID, subresourceID, organizationAssignmentChangesStartDetailsData90009f2bfc49100017b10cd07d19063b).execute();

Partially updates the start details for the specified organization assignment change ID.

Partially updates the start details for the specified organization assignment change ID.  The {subResourceID} path parameter must be the same as the {ID} value.  In the request body, specify the effective date for the event.   You can call GET /organizationAssignmentChanges/{ID}/startDetails/{subResourceID} to get the existing data to update.   You can only update the date field once the event is initiated. These fields are read-only: worker, supervisoryOrganization, and position.  The same Workday UI validations apply with this PATCH method.   The updates in this PATCH method do not persist until you call POST /organizationAssignmentChanges/{ID}/submit.  Secured by: Staffing Organizations: Header  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    LocalDate date = LocalDate.now(); // The date this business process takes effect.
    SupervisoryOrganization827372de445710001cfe36968a480000 supervisoryOrganization = new SupervisoryOrganization827372de445710001cfe36968a480000();
    Position827372de4457100019c0e9c5977d0000 position = new Position827372de4457100019c0e9c5977d0000();
    Worker90009f2bfc4910001b166d44a72c0727 worker = new Worker90009f2bfc4910001b166d44a72c0727();
    try {
      OrganizationAssignmentChangesStartDetailsData90009f2bfc49100017b10cd07d19063b result = client
              .organizationAssignmentChanges
              .partiallyUpdateStartDetails(ID, subresourceID)
              .date(date)
              .supervisoryOrganization(supervisoryOrganization)
              .position(position)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getDate());
      System.out.println(result.getSupervisoryOrganization());
      System.out.println(result.getPosition());
      System.out.println(result.getWorker());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#partiallyUpdateStartDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationAssignmentChangesStartDetailsData90009f2bfc49100017b10cd07d19063b> response = client
              .organizationAssignmentChanges
              .partiallyUpdateStartDetails(ID, subresourceID)
              .date(date)
              .supervisoryOrganization(supervisoryOrganization)
              .position(position)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#partiallyUpdateStartDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |
| **organizationAssignmentChangesStartDetailsData90009f2bfc49100017b10cd07d19063b** | [**OrganizationAssignmentChangesStartDetailsData90009f2bfc49100017b10cd07d19063b**](OrganizationAssignmentChangesStartDetailsData90009f2bfc49100017b10cd07d19063b.md)|  | |

### Return type

[**OrganizationAssignmentChangesStartDetailsData90009f2bfc49100017b10cd07d19063b**](OrganizationAssignmentChangesStartDetailsData90009f2bfc49100017b10cd07d19063b.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. Updating resource. |  -  |
| **0** | An error occurred. |  -  |

<a name="submitChangeRequest"></a>
# **submitChangeRequest**
> EventStateOrganizationAssignmentF3e1ff305e2d100003327f7b7fa103f1 submitChangeRequest(ID, eventStateOrganizationAssignmentF3e1ff305e2d100003327f7b7fa103f1).execute();

Submits the organization changes request for the specified ID, and initiates the Change Organization Assignment business process.

Submits the organization assignment change event for the specified ID, and initiates the Change Organization Assignment business process.  Submitting this request with an empty request body { } is equivalent to clicking the Submit button on the Change Organization Assgingment task in Workday.  For the equivalent of clicking the Save For Later button, specify the Save for Later Workday ID, \&quot;\&quot;d9e41a8c446c11de98360015c5e6daf6\&quot;\&quot;, in the status{id} request field.   Example: { \&quot;\&quot;status\&quot;\&quot;: {     \&quot;\&quot;id\&quot;\&quot;: \&quot;\&quot;d9e41a8c446c11de98360015c5e6daf6\&quot;\&quot;   } }  Secured by: Change Organization Assignment (REST)  Scope: Organizations and Roles

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    BusinessProcessParameters23782ad3f54110002073aab65def00fb businessProcessParameters = new BusinessProcessParameters23782ad3f54110002073aab65def00fb();
    String id = "id_example"; // Id of the instance
    String descriptor = "descriptor_example"; // A preview of the instance
    try {
      EventStateOrganizationAssignmentF3e1ff305e2d100003327f7b7fa103f1 result = client
              .organizationAssignmentChanges
              .submitChangeRequest(ID)
              .businessProcessParameters(businessProcessParameters)
              .id(id)
              .descriptor(descriptor)
              .execute();
      System.out.println(result);
      System.out.println(result.getBusinessProcessParameters());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#submitChangeRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EventStateOrganizationAssignmentF3e1ff305e2d100003327f7b7fa103f1> response = client
              .organizationAssignmentChanges
              .submitChangeRequest(ID)
              .businessProcessParameters(businessProcessParameters)
              .id(id)
              .descriptor(descriptor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#submitChangeRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ID** | **String**| The Workday ID of the resource. | |
| **eventStateOrganizationAssignmentF3e1ff305e2d100003327f7b7fa103f1** | [**EventStateOrganizationAssignmentF3e1ff305e2d100003327f7b7fa103f1**](EventStateOrganizationAssignmentF3e1ff305e2d100003327f7b7fa103f1.md)|  | |

### Return type

[**EventStateOrganizationAssignmentF3e1ff305e2d100003327f7b7fa103f1**](EventStateOrganizationAssignmentF3e1ff305e2d100003327f7b7fa103f1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Resource created. |  -  |
| **0** | An error occurred. |  -  |

<a name="updateBusinessUnit"></a>
# **updateBusinessUnit**
> OrganizationAssignmentChangesBusinessUnitData5aabf8e28cb310002520b2a2b31d0365 updateBusinessUnit(ID, subresourceID, organizationAssignmentChangesBusinessUnitData5aabf8e28cb310002520b2a2b31d0365).execute();

Partially updates the business unit for the specified organization assignment change ID.

Partially updates the business unit option for the specified change organization assignment ID. The {subResourceID} path parameter must be the same as the {ID} value.  You can call GET /organizationAssignmentChanges/{ID}/businessUnit/{subResourceID} to get the existing data to update.   The same Workday UI validations apply with this PATCH method. The data updates in this PATCH method do not persist until you call POST /organizationAssignmentChanges/{ID}/submit.  In the request body, specify the Workday ID of the business unit.   To retrieve a businessUnit ID, call the GET /values/organizationAssignmentChangesGroup/businessUnit prompt endpoint, which takes the change organization assignment ID as the event query parameter. If you specify the event parameter, it returns HREF links to the business units by organization, as of the event&#39;s effective date. If you don&#39;t specify the event parameter, it returns HREF links to the business units by active organization based on the current date.  Secured by: Staffing Organizations: Business Unit  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    BusinessUnit5aabf8e28cb310002520b2aabc470366 businessUnit = new BusinessUnit5aabf8e28cb310002520b2aabc470366();
    try {
      OrganizationAssignmentChangesBusinessUnitData5aabf8e28cb310002520b2a2b31d0365 result = client
              .organizationAssignmentChanges
              .updateBusinessUnit(ID, subresourceID)
              .businessUnit(businessUnit)
              .execute();
      System.out.println(result);
      System.out.println(result.getBusinessUnit());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#updateBusinessUnit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationAssignmentChangesBusinessUnitData5aabf8e28cb310002520b2a2b31d0365> response = client
              .organizationAssignmentChanges
              .updateBusinessUnit(ID, subresourceID)
              .businessUnit(businessUnit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#updateBusinessUnit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |
| **organizationAssignmentChangesBusinessUnitData5aabf8e28cb310002520b2a2b31d0365** | [**OrganizationAssignmentChangesBusinessUnitData5aabf8e28cb310002520b2a2b31d0365**](OrganizationAssignmentChangesBusinessUnitData5aabf8e28cb310002520b2a2b31d0365.md)|  | |

### Return type

[**OrganizationAssignmentChangesBusinessUnitData5aabf8e28cb310002520b2a2b31d0365**](OrganizationAssignmentChangesBusinessUnitData5aabf8e28cb310002520b2a2b31d0365.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. Updating resource. |  -  |
| **0** | An error occurred. |  -  |

<a name="updateComment"></a>
# **updateComment**
> Comments7d98fd55aeee100022968e52a1b31c60 updateComment(ID, subresourceID, comments7d98fd55aeee100022968e52a1b31c60).execute();

Partially updates  the comment for the organization assignment change ID.

Partially updates the comment for the organization assignment change ID. The {subResourceID} path parameter must be the same as the {ID} value.  The data updates in this PATCH method don&#39;t persist until you call POST/organizationAssignmentChanges/{ID}/submit.  To get the exising data to update, call GET/organizationAssignmentChanges/{ID}/comment/{subResourceID}.  Secured by: Change Organization Assignment (REST), Change Organization Assignments for  \\~Worker\\~ (Mass Action)  Scope: Organizations and Roles

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    String comment = "comment_example"; // The business process comment for a worker event before it's submitted.
    try {
      Comments7d98fd55aeee100022968e52a1b31c60 result = client
              .organizationAssignmentChanges
              .updateComment(ID, subresourceID)
              .comment(comment)
              .execute();
      System.out.println(result);
      System.out.println(result.getComment());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#updateComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Comments7d98fd55aeee100022968e52a1b31c60> response = client
              .organizationAssignmentChanges
              .updateComment(ID, subresourceID)
              .comment(comment)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#updateComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |
| **comments7d98fd55aeee100022968e52a1b31c60** | [**Comments7d98fd55aeee100022968e52a1b31c60**](Comments7d98fd55aeee100022968e52a1b31c60.md)|  | |

### Return type

[**Comments7d98fd55aeee100022968e52a1b31c60**](Comments7d98fd55aeee100022968e52a1b31c60.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. Updating resource. |  -  |
| **0** | An error occurred. |  -  |

<a name="updateCostCenter"></a>
# **updateCostCenter**
> OrganizationAssignmentChangesCostCenterData5aabf8e28cb3100010a999db2700024e updateCostCenter(ID, subresourceID, organizationAssignmentChangesCostCenterData5aabf8e28cb3100010a999db2700024e).execute();

Partially updates the cost center for the specified organization assignment change ID.

Partially updates the cost center for the specified organization assignment change ID.  The {subResourceID} path parameter must be the same as the {ID} value.  You can call GET /organizationAssignmentChanges/{ID}/costCenter/{subResourceID} to get the existing data to update.   The same Workday UI validations apply with this PATCH method. The data updates in this PATCH method do not persist until you call POST /organizationAssignmentChanges/{ID}/submit.  In the request body, specify the Workday ID of the cost center.   To retrieve a costCenter ID, call the GET /values/organizationAssignmentChangesGroup/costCenters prompt endpoint, which takes the change organization assignment ID as the event query parameter. If you specify the event parameter, it returns HREF links to the cost centers by organization, as of the event&#39;s effective date. If you don&#39;t specify the event parameter, it returns HREF links to the cost centers by active organization based on the current date.  Secured by: Staffing Organizations: Cost Center  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    CostCenter5aabf8e28cb3100010a999f40b07024f costCenter = new CostCenter5aabf8e28cb3100010a999f40b07024f();
    try {
      OrganizationAssignmentChangesCostCenterData5aabf8e28cb3100010a999db2700024e result = client
              .organizationAssignmentChanges
              .updateCostCenter(ID, subresourceID)
              .costCenter(costCenter)
              .execute();
      System.out.println(result);
      System.out.println(result.getCostCenter());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#updateCostCenter");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationAssignmentChangesCostCenterData5aabf8e28cb3100010a999db2700024e> response = client
              .organizationAssignmentChanges
              .updateCostCenter(ID, subresourceID)
              .costCenter(costCenter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#updateCostCenter");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |
| **organizationAssignmentChangesCostCenterData5aabf8e28cb3100010a999db2700024e** | [**OrganizationAssignmentChangesCostCenterData5aabf8e28cb3100010a999db2700024e**](OrganizationAssignmentChangesCostCenterData5aabf8e28cb3100010a999db2700024e.md)|  | |

### Return type

[**OrganizationAssignmentChangesCostCenterData5aabf8e28cb3100010a999db2700024e**](OrganizationAssignmentChangesCostCenterData5aabf8e28cb3100010a999db2700024e.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. Updating resource. |  -  |
| **0** | An error occurred. |  -  |

<a name="updateCustomOrganizations"></a>
# **updateCustomOrganizations**
> OrganizationAssignmentChangesCustomOrganizationDetailsData53cd2b632146100011e9bf4e7041551f updateCustomOrganizations(ID, subresourceID, organizationAssignmentChangesCustomOrganizationDetailsData53cd2b632146100011e9bf4e7041551f).execute();

Partially updates the custom organizations for the specified organization assignment change ID.

Partially updates the custom organizations for the specified organization assignment change ID.  The {subResourceID} path parameter must be the same as the {ID} value.  You can call GET /organizationAssignmentChanges/{ID}/customorganization/{subResourceID} to get the existing data to update.   The same Workday UI validations apply with this PATCH method. The data updates in this PATCH method do not persist until you call POST /organizationAssignmentChanges/{ID}/submit.  In the request body, specify the Workday ID of the custom organization {id}  To retrieve a custom organization ID, call the GET /values/organizationAssignmentChangesGroup/customs prompt endpoint, which takes the change organization assignment ID as the event query parameter. If you specify the event parameter, it returns HREF links to the custom organizations, as of the event&#39;s effective date. If you don&#39;t specify the event parameter, it returns HREF links to the active custom organizations based on the current date.  Secured by: Staffing Organizations: Custom Organization  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    List<CustomOrganizationDetails3950e273020a100017857926d35d369c> customOrganizations = Arrays.asList(); // The new custom organizations for the worker as of the effective date.
    try {
      OrganizationAssignmentChangesCustomOrganizationDetailsData53cd2b632146100011e9bf4e7041551f result = client
              .organizationAssignmentChanges
              .updateCustomOrganizations(ID, subresourceID)
              .customOrganizations(customOrganizations)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomOrganizations());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#updateCustomOrganizations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationAssignmentChangesCustomOrganizationDetailsData53cd2b632146100011e9bf4e7041551f> response = client
              .organizationAssignmentChanges
              .updateCustomOrganizations(ID, subresourceID)
              .customOrganizations(customOrganizations)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#updateCustomOrganizations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |
| **organizationAssignmentChangesCustomOrganizationDetailsData53cd2b632146100011e9bf4e7041551f** | [**OrganizationAssignmentChangesCustomOrganizationDetailsData53cd2b632146100011e9bf4e7041551f**](OrganizationAssignmentChangesCustomOrganizationDetailsData53cd2b632146100011e9bf4e7041551f.md)|  | |

### Return type

[**OrganizationAssignmentChangesCustomOrganizationDetailsData53cd2b632146100011e9bf4e7041551f**](OrganizationAssignmentChangesCustomOrganizationDetailsData53cd2b632146100011e9bf4e7041551f.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. Updating resource. |  -  |
| **0** | An error occurred. |  -  |

<a name="updateRegion"></a>
# **updateRegion**
> OrganizationAssignmentChangesRegionDataA18edb56aca0100006997e68e5780373 updateRegion(ID, subresourceID, organizationAssignmentChangesRegionDataA18edb56aca0100006997e68e5780373).execute();

Partially updates the region for the specified organization assignment change ID.

Partially updates the region for the specified organization assignment change ID.   The {subResourceID} path parameter must be the same as the {ID} value.  In the request body, specify the Workday ID of the region.   To retrieve a regions ID, call the GET /values/organizationAssignmentChangesGroup/regions prompt endpoint, which takes the change organization assignment ID as the event query parameter. If you specify the event parameter, it returns HREF links to the regions by organization, as of the event&#39;s effective date. If you don&#39;t specify the event parameter, it returns HREF links to the regions by active organization based on the current date.  Secured by: Staffing Organizations: Region  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String subresourceID = "subresourceID_example"; // The Workday ID of the subresource.
    RegionA18edb56aca0100006997ec7e07d0374 region = new RegionA18edb56aca0100006997ec7e07d0374();
    try {
      OrganizationAssignmentChangesRegionDataA18edb56aca0100006997e68e5780373 result = client
              .organizationAssignmentChanges
              .updateRegion(ID, subresourceID)
              .region(region)
              .execute();
      System.out.println(result);
      System.out.println(result.getRegion());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#updateRegion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationAssignmentChangesRegionDataA18edb56aca0100006997e68e5780373> response = client
              .organizationAssignmentChanges
              .updateRegion(ID, subresourceID)
              .region(region)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationAssignmentChangesApi#updateRegion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ID** | **String**| The Workday ID of the resource. | |
| **subresourceID** | **String**| The Workday ID of the subresource. | |
| **organizationAssignmentChangesRegionDataA18edb56aca0100006997e68e5780373** | [**OrganizationAssignmentChangesRegionDataA18edb56aca0100006997e68e5780373**](OrganizationAssignmentChangesRegionDataA18edb56aca0100006997e68e5780373.md)|  | |

### Return type

[**OrganizationAssignmentChangesRegionDataA18edb56aca0100006997e68e5780373**](OrganizationAssignmentChangesRegionDataA18edb56aca0100006997e68e5780373.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. Updating resource. |  -  |
| **0** | An error occurred. |  -  |

