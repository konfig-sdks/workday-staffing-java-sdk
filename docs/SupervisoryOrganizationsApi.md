# SupervisoryOrganizationsApi

All URIs are relative to *https://&lt;tenantHostname&gt;/staffing/v6*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getById**](SupervisoryOrganizationsApi.md#getById) | **GET** /supervisoryOrganizations | Retrieves a supervisory organization for the specified ID. |
| [**getInstance**](SupervisoryOrganizationsApi.md#getInstance) | **GET** /supervisoryOrganizations/{ID} | Retrieves a single supervisory organization instance. |
| [**getMember**](SupervisoryOrganizationsApi.md#getMember) | **GET** /supervisoryOrganizations/{ID}/members/{subresourceID} | Retrieves a single member instance. |
| [**getMembers**](SupervisoryOrganizationsApi.md#getMembers) | **GET** /supervisoryOrganizations/{ID}/members | Retrieves a collection of members for the specified supervisory organization ID. |
| [**getOrgChart**](SupervisoryOrganizationsApi.md#getOrgChart) | **GET** /supervisoryOrganizations/{ID}/orgChart | Retrieves information about an organization chart of the specified supervisory organization id. |
| [**getOrgChart_0**](SupervisoryOrganizationsApi.md#getOrgChart_0) | **GET** /supervisoryOrganizations/{ID}/orgChart/{subresourceID} | Retrieves a single organization chart instance. |


<a name="getById"></a>
# **getById**
> SupervisoryOrganizationsGetByIdResponse getById().includeInactive(includeInactive).limit(limit).offset(offset).execute();

Retrieves a supervisory organization for the specified ID.

Retrieves a supervisory organization for the specified ID.  Secured by: BDA OAuth 2.0 Connector, Manage: Supervisory Organization, View: Supervisory Organization  Scope: Organizations and Roles

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SupervisoryOrganizationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    Boolean includeInactive = true; // If true, this method returns the inactive organizations. Default is false.
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    try {
      SupervisoryOrganizationsGetByIdResponse result = client
              .supervisoryOrganizations
              .getById()
              .includeInactive(includeInactive)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling SupervisoryOrganizationsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SupervisoryOrganizationsGetByIdResponse> response = client
              .supervisoryOrganizations
              .getById()
              .includeInactive(includeInactive)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SupervisoryOrganizationsApi#getById");
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
| **includeInactive** | **Boolean**| If true, this method returns the inactive organizations. Default is false. | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |

### Return type

[**SupervisoryOrganizationsGetByIdResponse**](SupervisoryOrganizationsGetByIdResponse.md)

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
> SupervisoryOrganizationViewA02c2e1916fa100009e137235f1f0018 getInstance(ID).execute();

Retrieves a single supervisory organization instance.

Retrieves a supervisory organization for the specified ID.  Secured by: BDA OAuth 2.0 Connector, Manage: Supervisory Organization, View: Supervisory Organization  Scope: Organizations and Roles

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SupervisoryOrganizationsApi;
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
      SupervisoryOrganizationViewA02c2e1916fa100009e137235f1f0018 result = client
              .supervisoryOrganizations
              .getInstance(ID)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getManagers());
      System.out.println(result.getCode());
      System.out.println(result.getInactive());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling SupervisoryOrganizationsApi#getInstance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SupervisoryOrganizationViewA02c2e1916fa100009e137235f1f0018> response = client
              .supervisoryOrganizations
              .getInstance(ID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SupervisoryOrganizationsApi#getInstance");
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

[**SupervisoryOrganizationViewA02c2e1916fa100009e137235f1f0018**](SupervisoryOrganizationViewA02c2e1916fa100009e137235f1f0018.md)

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

<a name="getMember"></a>
# **getMember**
> JobData1bfa8925c50510000ae4479925510026 getMember(ID, subresourceID).execute();

Retrieves a single member instance.

Retrieves a member for the specified supervisory organization ID.  Secured by: Reports: Organization  Scope: Organizations and Roles

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SupervisoryOrganizationsApi;
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
      JobData1bfa8925c50510000ae4479925510026 result = client
              .supervisoryOrganizations
              .getMember(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getLocation());
      System.out.println(result.getBusinessTitle());
      System.out.println(result.getWorker());
      System.out.println(result.getSupervisoryOrganization());
      System.out.println(result.getNextPayPeriodStartDate());
      System.out.println(result.getJobType());
      System.out.println(result.getJobProfile());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling SupervisoryOrganizationsApi#getMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobData1bfa8925c50510000ae4479925510026> response = client
              .supervisoryOrganizations
              .getMember(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SupervisoryOrganizationsApi#getMember");
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

[**JobData1bfa8925c50510000ae4479925510026**](JobData1bfa8925c50510000ae4479925510026.md)

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

<a name="getMembers"></a>
# **getMembers**
> SupervisoryOrganizationsGetMembersResponse getMembers(ID).limit(limit).offset(offset).execute();

Retrieves a collection of members for the specified supervisory organization ID.

Retrieves a collection of members for the specified supervisory organization ID.  Secured by: Reports: Organization  Scope: Organizations and Roles

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SupervisoryOrganizationsApi;
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
      SupervisoryOrganizationsGetMembersResponse result = client
              .supervisoryOrganizations
              .getMembers(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling SupervisoryOrganizationsApi#getMembers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SupervisoryOrganizationsGetMembersResponse> response = client
              .supervisoryOrganizations
              .getMembers(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SupervisoryOrganizationsApi#getMembers");
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

[**SupervisoryOrganizationsGetMembersResponse**](SupervisoryOrganizationsGetMembersResponse.md)

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

<a name="getOrgChart"></a>
# **getOrgChart**
> SupervisoryOrganizationsGetOrgChartResponse getOrgChart(ID).limit(limit).offset(offset).execute();

Retrieves information about an organization chart of the specified supervisory organization id.

Retrieves information about an organization chart of the specified supervisory organization id.  Secured by: Reports: Organization  Scope: Organizations and Roles

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SupervisoryOrganizationsApi;
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
      SupervisoryOrganizationsGetOrgChartResponse result = client
              .supervisoryOrganizations
              .getOrgChart(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling SupervisoryOrganizationsApi#getOrgChart");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SupervisoryOrganizationsGetOrgChartResponse> response = client
              .supervisoryOrganizations
              .getOrgChart(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SupervisoryOrganizationsApi#getOrgChart");
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

[**SupervisoryOrganizationsGetOrgChartResponse**](SupervisoryOrganizationsGetOrgChartResponse.md)

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

<a name="getOrgChart_0"></a>
# **getOrgChart_0**
> OrgChartView643e3a12629710000554e0338e670044 getOrgChart_0(ID, subresourceID).execute();

Retrieves a single organization chart instance.

Retrieves information about an organization chart of the specified supervisory organization id.  Secured by: Reports: Organization  Scope: Organizations and Roles

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SupervisoryOrganizationsApi;
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
      OrgChartView643e3a12629710000554e0338e670044 result = client
              .supervisoryOrganizations
              .getOrgChart_0(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuperior());
      System.out.println(result.getSubordinates());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling SupervisoryOrganizationsApi#getOrgChart_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgChartView643e3a12629710000554e0338e670044> response = client
              .supervisoryOrganizations
              .getOrgChart_0(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SupervisoryOrganizationsApi#getOrgChart_0");
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

[**OrgChartView643e3a12629710000554e0338e670044**](OrgChartView643e3a12629710000554e0338e670044.md)

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

