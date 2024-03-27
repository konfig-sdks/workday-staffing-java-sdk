# JobChangesApi

All URIs are relative to *https://&lt;tenantHostname&gt;/staffing/v6*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAdminOptions**](JobChangesApi.md#getAdminOptions) | **GET** /jobChanges/{ID}/administrative/{subresourceID} | Retrieves the administrative options for the specified job change ID. |
| [**getAdministrativeOptions**](JobChangesApi.md#getAdministrativeOptions) | **GET** /jobChanges/{ID}/administrative | Retrieves the administrative options for the specified job change ID. |
| [**getBusinessTitle**](JobChangesApi.md#getBusinessTitle) | **GET** /jobChanges/{ID}/businessTitle/{subresourceID} | Retrieves a business title for the specified job change ID. |
| [**getBusinessTitle_0**](JobChangesApi.md#getBusinessTitle_0) | **GET** /jobChanges/{ID}/businessTitle | Retrieves a business title for the specified job change ID. |
| [**getById**](JobChangesApi.md#getById) | **GET** /jobChanges/{ID} | Retrieves a single change job event instance. |
| [**getCommentById**](JobChangesApi.md#getCommentById) | **GET** /jobChanges/{ID}/comment | Returns the comment information for the specified job change ID. |
| [**getCommentInfo**](JobChangesApi.md#getCommentInfo) | **GET** /jobChanges/{ID}/comment/{subresourceID} | Returns the comment information for the specified job change ID. |
| [**getContractOptions**](JobChangesApi.md#getContractOptions) | **GET** /jobChanges/{ID}/contract | Retrieves the contract options for the specified change job ID. |
| [**getContractOptions_0**](JobChangesApi.md#getContractOptions_0) | **GET** /jobChanges/{ID}/contract/{subresourceID} | Retrieves the contract options for the specified change job ID. |
| [**getJobClassification**](JobChangesApi.md#getJobClassification) | **GET** /jobChanges/{ID}/jobClassification | Retrieves a job classification for the specified job change ID. |
| [**getJobClassification_0**](JobChangesApi.md#getJobClassification_0) | **GET** /jobChanges/{ID}/jobClassification/{subresourceID} | Retrieves a job classification for the specified job change ID. |
| [**getJobProfile**](JobChangesApi.md#getJobProfile) | **GET** /jobChanges/{ID}/jobProfile | Retrieves a job profile for the specified job change ID. |
| [**getLocationInfo**](JobChangesApi.md#getLocationInfo) | **GET** /jobChanges/{ID}/location | Returns the location information for the specified job change ID. |
| [**getLocationInfo_0**](JobChangesApi.md#getLocationInfo_0) | **GET** /jobChanges/{ID}/location/{subresourceID} | Returns the location information for the specified job change ID. |
| [**getMoveTeamOption**](JobChangesApi.md#getMoveTeamOption) | **GET** /jobChanges/{ID}/moveTeam/{subresourceID} | Retrieves a move team option from the specified job change ID. |
| [**getMoveTeamOption_0**](JobChangesApi.md#getMoveTeamOption_0) | **GET** /jobChanges/{ID}/moveTeam | Retrieves a move team option from the specified job change ID. |
| [**getOpeningOptions**](JobChangesApi.md#getOpeningOptions) | **GET** /jobChanges/{ID}/opening | Retrieves the opening options for the specified job change ID. |
| [**getOpeningOptions_0**](JobChangesApi.md#getOpeningOptions_0) | **GET** /jobChanges/{ID}/opening/{subresourceID} | Retrieves the opening options for the specified job change ID. |
| [**getPositionById**](JobChangesApi.md#getPositionById) | **GET** /jobChanges/{ID}/position | Retrieves a position for the specified job change ID. |
| [**getPositionBySubresourceId**](JobChangesApi.md#getPositionBySubresourceId) | **GET** /jobChanges/{ID}/position/{subresourceID} | Retrieves a position for the specified job change ID. |
| [**getProfile**](JobChangesApi.md#getProfile) | **GET** /jobChanges/{ID}/jobProfile/{subresourceID} | Retrieves a job profile for the specified job change ID. |
| [**getStartDetails**](JobChangesApi.md#getStartDetails) | **GET** /jobChanges/{ID}/startDetails/{subresourceID} | Retrieves the start details for the specified job change ID. |
| [**getStartDetails_0**](JobChangesApi.md#getStartDetails_0) | **GET** /jobChanges/{ID}/startDetails | Retrieves the start details for the specified job change ID. |
| [**partialUpdateLocationOptions**](JobChangesApi.md#partialUpdateLocationOptions) | **PATCH** /jobChanges/{ID}/location/{subresourceID} | Partially updates the location options for the specified change job ID. |
| [**partiallyUpdateContractOptions**](JobChangesApi.md#partiallyUpdateContractOptions) | **PATCH** /jobChanges/{ID}/contract/{subresourceID} | Partially updates the contract options for the specified change job ID. |
| [**submitChangeJob**](JobChangesApi.md#submitChangeJob) | **POST** /jobChanges/{ID}/submit | Submit the specified change job ID. |
| [**updateAdministrativeOptions**](JobChangesApi.md#updateAdministrativeOptions) | **PATCH** /jobChanges/{ID}/administrative/{subresourceID} | Partially updates the administrative options for the specified job change ID. |
| [**updateBusinessTitleOptions**](JobChangesApi.md#updateBusinessTitleOptions) | **PATCH** /jobChanges/{ID}/businessTitle/{subresourceID} | Partially updates the businessTitle options for the specified change job ID. |
| [**updateComment**](JobChangesApi.md#updateComment) | **PATCH** /jobChanges/{ID}/comment/{subresourceID} | Partially updates the comment for the specified change job ID. |
| [**updateJobClassificationOptions**](JobChangesApi.md#updateJobClassificationOptions) | **PATCH** /jobChanges/{ID}/jobClassification/{subresourceID} | Partially updates the jobClassification options for the specified change job ID. |
| [**updateJobProfileOptions**](JobChangesApi.md#updateJobProfileOptions) | **PATCH** /jobChanges/{ID}/jobProfile/{subresourceID} | Partially updates the jobProfile options for the specified change job ID. |
| [**updateMoveTeamOptions**](JobChangesApi.md#updateMoveTeamOptions) | **PATCH** /jobChanges/{ID}/moveTeam/{subresourceID} | Partially updates the moveTeam options for the specified change job ID. |
| [**updateOpeningOptions**](JobChangesApi.md#updateOpeningOptions) | **PATCH** /jobChanges/{ID}/opening/{subresourceID} | Partially updates the opening options for the specified change job ID. |
| [**updatePositionOptions**](JobChangesApi.md#updatePositionOptions) | **PATCH** /jobChanges/{ID}/position/{subresourceID} | Partially updates the position options for the specified change job ID. |
| [**updateStartDetails**](JobChangesApi.md#updateStartDetails) | **PATCH** /jobChanges/{ID}/startDetails/{subresourceID} | Partially updates the startDetails options for the specified change job ID. |


<a name="getAdminOptions"></a>
# **getAdminOptions**
> ChangeJobAdministrativeDetailsDataF8f20079bc5a1000089ccb7f6a8800ea getAdminOptions(ID, subresourceID).execute();

Retrieves the administrative options for the specified job change ID.

Retrieves the administrative options for the specified job change ID.  The {subResourceID} path parameter must be the same as the {ID} value.  Note that there are no localization constraints in this API version. This method returns the workingFTE and paidFTE fields even if the fields have not been localized.  Secured by: Staffing Actions: Administrator  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
      ChangeJobAdministrativeDetailsDataF8f20079bc5a1000089ccb7f6a8800ea result = client
              .jobChanges
              .getAdminOptions(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getPayRateType());
      System.out.println(result.getWorkersCompensationCodeOverride());
      System.out.println(result.getFte());
      System.out.println(result.getNotifyBy());
      System.out.println(result.getCompanyInsiderTypes());
      System.out.println(result.getFirstDayOfWork());
      System.out.println(result.getDefaultWeeklyHours());
      System.out.println(result.getPositionWorkerType());
      System.out.println(result.getWorkingFte());
      System.out.println(result.getSpecifyWorkingFte());
      System.out.println(result.getTimeType());
      System.out.println(result.getSpecifyPaidFte());
      System.out.println(result.getPaidFte());
      System.out.println(result.getWorkStudy());
      System.out.println(result.getAssignmentType());
      System.out.println(result.getEndEmploymentDate());
      System.out.println(result.getExpectedAssignmentEndDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getAdminOptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChangeJobAdministrativeDetailsDataF8f20079bc5a1000089ccb7f6a8800ea> response = client
              .jobChanges
              .getAdminOptions(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getAdminOptions");
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

[**ChangeJobAdministrativeDetailsDataF8f20079bc5a1000089ccb7f6a8800ea**](ChangeJobAdministrativeDetailsDataF8f20079bc5a1000089ccb7f6a8800ea.md)

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

<a name="getAdministrativeOptions"></a>
# **getAdministrativeOptions**
> JobChangesGetAdministrativeOptionsResponse getAdministrativeOptions(ID).limit(limit).offset(offset).execute();

Retrieves the administrative options for the specified job change ID.

Retrieves the administrative options for the specified job change ID.  The {subResourceID} path parameter must be the same as the {ID} value.  Note that there are no localization constraints in this API version. This method returns the workingFTE and paidFTE fields even if the fields have not been localized.  Secured by: Staffing Actions: Administrator  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
      JobChangesGetAdministrativeOptionsResponse result = client
              .jobChanges
              .getAdministrativeOptions(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getAdministrativeOptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobChangesGetAdministrativeOptionsResponse> response = client
              .jobChanges
              .getAdministrativeOptions(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getAdministrativeOptions");
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

[**JobChangesGetAdministrativeOptionsResponse**](JobChangesGetAdministrativeOptionsResponse.md)

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

<a name="getBusinessTitle"></a>
# **getBusinessTitle**
> ChangeJobBusinessTitle3db8095ffa18100013a5f96969ca0102 getBusinessTitle(ID, subresourceID).execute();

Retrieves a business title for the specified job change ID.

Retrieves a business title for the specified specified job change ID. The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Actions: Business Title  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
      ChangeJobBusinessTitle3db8095ffa18100013a5f96969ca0102 result = client
              .jobChanges
              .getBusinessTitle(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getBusinessTitle());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getBusinessTitle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChangeJobBusinessTitle3db8095ffa18100013a5f96969ca0102> response = client
              .jobChanges
              .getBusinessTitle(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getBusinessTitle");
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

[**ChangeJobBusinessTitle3db8095ffa18100013a5f96969ca0102**](ChangeJobBusinessTitle3db8095ffa18100013a5f96969ca0102.md)

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

<a name="getBusinessTitle_0"></a>
# **getBusinessTitle_0**
> JobChangesGetBusinessTitleResponse getBusinessTitle_0(ID).limit(limit).offset(offset).execute();

Retrieves a business title for the specified job change ID.

Retrieves a business title for the specified specified job change ID. The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Actions: Business Title  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
      JobChangesGetBusinessTitleResponse result = client
              .jobChanges
              .getBusinessTitle_0(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getBusinessTitle_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobChangesGetBusinessTitleResponse> response = client
              .jobChanges
              .getBusinessTitle_0(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getBusinessTitle_0");
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

[**JobChangesGetBusinessTitleResponse**](JobChangesGetBusinessTitleResponse.md)

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

<a name="getById"></a>
# **getById**
> ChangeJobDefaultRepresentation6cc31ee444d010000bb4153a954300e7 getById(ID).execute();

Retrieves a single change job event instance.

Retrieves a change job event with the specified ID.  Secured by: Change Job (Mass Action), Change Job (REST Service), Staffing Actions, Staffing Actions: Academic Pay, Staffing Actions: Additional Job Classifications, Staffing Actions: Administrator, Staffing Actions: Attachments, Staffing Actions: Business Title, Staffing Actions: Change Job Date and Reason, Staffing Actions: Compensation for All Job Profiles, Staffing Actions: Contract Details, Staffing Actions: Hire Student, Staffing Actions: Job Profile, Staffing Actions: View \\~Worker\\~ Start Date Correction  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
      ChangeJobDefaultRepresentation6cc31ee444d010000bb4153a954300e7 result = client
              .jobChanges
              .getById(ID)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChangeJobDefaultRepresentation6cc31ee444d010000bb4153a954300e7> response = client
              .jobChanges
              .getById(ID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getById");
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

[**ChangeJobDefaultRepresentation6cc31ee444d010000bb4153a954300e7**](ChangeJobDefaultRepresentation6cc31ee444d010000bb4153a954300e7.md)

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

<a name="getCommentById"></a>
# **getCommentById**
> JobChangesGetCommentByIdResponse getCommentById(ID).limit(limit).offset(offset).execute();

Returns the comment information for the specified job change ID.

Returns the comment information for the specified job change ID. The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Change Job (Mass Action), Change Job (REST Service)  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
      JobChangesGetCommentByIdResponse result = client
              .jobChanges
              .getCommentById(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getCommentById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobChangesGetCommentByIdResponse> response = client
              .jobChanges
              .getCommentById(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getCommentById");
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

[**JobChangesGetCommentByIdResponse**](JobChangesGetCommentByIdResponse.md)

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

Returns the comment information for the specified job change ID.

Returns the comment information for the specified job change ID. The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Change Job (Mass Action), Change Job (REST Service)  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
              .jobChanges
              .getCommentInfo(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getComment());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getCommentInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Comments7d98fd55aeee100022968e52a1b31c60> response = client
              .jobChanges
              .getCommentInfo(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getCommentInfo");
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

<a name="getContractOptions"></a>
# **getContractOptions**
> JobChangesGetContractOptionsResponse getContractOptions(ID).limit(limit).offset(offset).execute();

Retrieves the contract options for the specified change job ID.

Returns the contract options for the specified job change ID.  The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Actions: Contract Details  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
      JobChangesGetContractOptionsResponse result = client
              .jobChanges
              .getContractOptions(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getContractOptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobChangesGetContractOptionsResponse> response = client
              .jobChanges
              .getContractOptions(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getContractOptions");
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

[**JobChangesGetContractOptionsResponse**](JobChangesGetContractOptionsResponse.md)

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

<a name="getContractOptions_0"></a>
# **getContractOptions_0**
> ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107 getContractOptions_0(ID, subresourceID).execute();

Retrieves the contract options for the specified change job ID.

Returns the contract options for the specified job change ID.  The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Actions: Contract Details  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
      ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107 result = client
              .jobChanges
              .getContractOptions_0(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getAssignmentDetails());
      System.out.println(result.getContractEndDate());
      System.out.println(result.getContractPayRate());
      System.out.println(result.getCurrency());
      System.out.println(result.getFrequency());
      System.out.println(result.getPurchaseOrder());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getContractOptions_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107> response = client
              .jobChanges
              .getContractOptions_0(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getContractOptions_0");
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

[**ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107**](ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107.md)

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

<a name="getJobClassification"></a>
# **getJobClassification**
> JobChangesGetJobClassificationResponse getJobClassification(ID).limit(limit).offset(offset).execute();

Retrieves a job classification for the specified job change ID.

Retrieves a job classification for the specified job change ID.  The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Actions: Additional Job Classifications  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
      JobChangesGetJobClassificationResponse result = client
              .jobChanges
              .getJobClassification(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getJobClassification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobChangesGetJobClassificationResponse> response = client
              .jobChanges
              .getJobClassification(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getJobClassification");
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

[**JobChangesGetJobClassificationResponse**](JobChangesGetJobClassificationResponse.md)

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

<a name="getJobClassification_0"></a>
# **getJobClassification_0**
> ChangeJobJobClassificationData354103f196361000084489bcb281017f getJobClassification_0(ID, subresourceID).execute();

Retrieves a job classification for the specified job change ID.

Retrieves a job classification for the specified job change ID.  The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Actions: Additional Job Classifications  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
      ChangeJobJobClassificationData354103f196361000084489bcb281017f result = client
              .jobChanges
              .getJobClassification_0(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getAdditionalJobClassifications());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getJobClassification_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChangeJobJobClassificationData354103f196361000084489bcb281017f> response = client
              .jobChanges
              .getJobClassification_0(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getJobClassification_0");
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

[**ChangeJobJobClassificationData354103f196361000084489bcb281017f**](ChangeJobJobClassificationData354103f196361000084489bcb281017f.md)

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

<a name="getJobProfile"></a>
# **getJobProfile**
> JobChangesGetJobProfileResponse getJobProfile(ID).limit(limit).offset(offset).execute();

Retrieves a job profile for the specified job change ID.

Retrieves a job profile for the specified job change ID. The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Actions: Job Profile  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
      JobChangesGetJobProfileResponse result = client
              .jobChanges
              .getJobProfile(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getJobProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobChangesGetJobProfileResponse> response = client
              .jobChanges
              .getJobProfile(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getJobProfile");
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

[**JobChangesGetJobProfileResponse**](JobChangesGetJobProfileResponse.md)

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

<a name="getLocationInfo"></a>
# **getLocationInfo**
> JobChangesGetLocationInfoResponse getLocationInfo(ID).limit(limit).offset(offset).execute();

Returns the location information for the specified job change ID.

Returns the location information for the specified job change ID. The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Actions: Location  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
      JobChangesGetLocationInfoResponse result = client
              .jobChanges
              .getLocationInfo(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getLocationInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobChangesGetLocationInfoResponse> response = client
              .jobChanges
              .getLocationInfo(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getLocationInfo");
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

[**JobChangesGetLocationInfoResponse**](JobChangesGetLocationInfoResponse.md)

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

<a name="getLocationInfo_0"></a>
# **getLocationInfo_0**
> ChangeJobLocation90151d6c4ff110001b4a46091678025c getLocationInfo_0(ID, subresourceID).execute();

Returns the location information for the specified job change ID.

Returns the location information for the specified job change ID. The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Actions: Location  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
      ChangeJobLocation90151d6c4ff110001b4a46091678025c result = client
              .jobChanges
              .getLocationInfo_0(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getLocation());
      System.out.println(result.getScheduledHours());
      System.out.println(result.getWorkShift());
      System.out.println(result.getWorkSpace());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getLocationInfo_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChangeJobLocation90151d6c4ff110001b4a46091678025c> response = client
              .jobChanges
              .getLocationInfo_0(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getLocationInfo_0");
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

[**ChangeJobLocation90151d6c4ff110001b4a46091678025c**](ChangeJobLocation90151d6c4ff110001b4a46091678025c.md)

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

<a name="getMoveTeamOption"></a>
# **getMoveTeamOption**
> ChangeJobMoveTeamData544fdf5c01da1000238ad82d26d90146 getMoveTeamOption(ID, subresourceID).execute();

Retrieves a move team option from the specified job change ID.

Retrieves a move team option from the specified job change ID.  The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Actions: Move Manager&#39;s Team  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
      ChangeJobMoveTeamData544fdf5c01da1000238ad82d26d90146 result = client
              .jobChanges
              .getMoveTeamOption(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getMoveTeam());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getMoveTeamOption");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChangeJobMoveTeamData544fdf5c01da1000238ad82d26d90146> response = client
              .jobChanges
              .getMoveTeamOption(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getMoveTeamOption");
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

[**ChangeJobMoveTeamData544fdf5c01da1000238ad82d26d90146**](ChangeJobMoveTeamData544fdf5c01da1000238ad82d26d90146.md)

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

<a name="getMoveTeamOption_0"></a>
# **getMoveTeamOption_0**
> JobChangesGetMoveTeamOptionResponse getMoveTeamOption_0(ID).limit(limit).offset(offset).execute();

Retrieves a move team option from the specified job change ID.

Retrieves a move team option from the specified job change ID.  The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Actions: Move Manager&#39;s Team  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
      JobChangesGetMoveTeamOptionResponse result = client
              .jobChanges
              .getMoveTeamOption_0(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getMoveTeamOption_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobChangesGetMoveTeamOptionResponse> response = client
              .jobChanges
              .getMoveTeamOption_0(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getMoveTeamOption_0");
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

[**JobChangesGetMoveTeamOptionResponse**](JobChangesGetMoveTeamOptionResponse.md)

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

<a name="getOpeningOptions"></a>
# **getOpeningOptions**
> JobChangesGetOpeningOptionsResponse getOpeningOptions(ID).limit(limit).offset(offset).execute();

Retrieves the opening options for the specified job change ID.

Retrieves the opening options for the specified job change ID. The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Actions: Change Job Date and Reason  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
      JobChangesGetOpeningOptionsResponse result = client
              .jobChanges
              .getOpeningOptions(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getOpeningOptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobChangesGetOpeningOptionsResponse> response = client
              .jobChanges
              .getOpeningOptions(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getOpeningOptions");
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

[**JobChangesGetOpeningOptionsResponse**](JobChangesGetOpeningOptionsResponse.md)

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

<a name="getOpeningOptions_0"></a>
# **getOpeningOptions_0**
> ChangeJobOpeningData97af9049a5fd10001c4888d654170000 getOpeningOptions_0(ID, subresourceID).execute();

Retrieves the opening options for the specified job change ID.

Retrieves the opening options for the specified job change ID. The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Actions: Change Job Date and Reason  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
      ChangeJobOpeningData97af9049a5fd10001c4888d654170000 result = client
              .jobChanges
              .getOpeningOptions_0(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getHeadcountOption());
      System.out.println(result.getOpeningAvailableForOverlap());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getOpeningOptions_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChangeJobOpeningData97af9049a5fd10001c4888d654170000> response = client
              .jobChanges
              .getOpeningOptions_0(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getOpeningOptions_0");
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

[**ChangeJobOpeningData97af9049a5fd10001c4888d654170000**](ChangeJobOpeningData97af9049a5fd10001c4888d654170000.md)

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

<a name="getPositionById"></a>
# **getPositionById**
> JobChangesGetPositionByIdResponse getPositionById(ID).limit(limit).offset(offset).execute();

Retrieves a position for the specified job change ID.

Retrieves a position for the specified job change ID.  The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Actions: Select or Create Position  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
      JobChangesGetPositionByIdResponse result = client
              .jobChanges
              .getPositionById(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getPositionById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobChangesGetPositionByIdResponse> response = client
              .jobChanges
              .getPositionById(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getPositionById");
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

[**JobChangesGetPositionByIdResponse**](JobChangesGetPositionByIdResponse.md)

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

<a name="getPositionBySubresourceId"></a>
# **getPositionBySubresourceId**
> ChangeJobPositionDataDfc4e58f7308100018bd1c459f435221 getPositionBySubresourceId(ID, subresourceID).execute();

Retrieves a position for the specified job change ID.

Retrieves a position for the specified job change ID.  The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Actions: Select or Create Position  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
      ChangeJobPositionDataDfc4e58f7308100018bd1c459f435221 result = client
              .jobChanges
              .getPositionBySubresourceId(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreatePosition());
      System.out.println(result.getAvailableForOverlap());
      System.out.println(result.getPosition());
      System.out.println(result.getClosePosition());
      System.out.println(result.getJobRequisition());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getPositionBySubresourceId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChangeJobPositionDataDfc4e58f7308100018bd1c459f435221> response = client
              .jobChanges
              .getPositionBySubresourceId(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getPositionBySubresourceId");
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

[**ChangeJobPositionDataDfc4e58f7308100018bd1c459f435221**](ChangeJobPositionDataDfc4e58f7308100018bd1c459f435221.md)

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

<a name="getProfile"></a>
# **getProfile**
> ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115 getProfile(ID, subresourceID).execute();

Retrieves a job profile for the specified job change ID.

Retrieves a job profile for the specified job change ID. The {subResourceID} path parameter must be the same as the {ID} value.  Secured by: Staffing Actions: Job Profile  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
      ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115 result = client
              .jobChanges
              .getProfile(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getJobProfile());
      System.out.println(result.getJobTitle());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115> response = client
              .jobChanges
              .getProfile(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getProfile");
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

[**ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115**](ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115.md)

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
> JobChangesStartDetailsDataCe861a6a360d10002d40f176b7180020 getStartDetails(ID, subresourceID).execute();

Retrieves the start details for the specified job change ID.

Retrieves the start details for the specified job change ID.  Secured by: Staffing Actions: Change Job Date and Reason  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
      JobChangesStartDetailsDataCe861a6a360d10002d40f176b7180020 result = client
              .jobChanges
              .getStartDetails(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getWorker());
      System.out.println(result.getUseNextPayPeriod());
      System.out.println(result.getTemplate());
      System.out.println(result.getJob());
      System.out.println(result.getDate());
      System.out.println(result.getLocation());
      System.out.println(result.getReason());
      System.out.println(result.getSupervisoryOrganization());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getStartDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobChangesStartDetailsDataCe861a6a360d10002d40f176b7180020> response = client
              .jobChanges
              .getStartDetails(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getStartDetails");
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

[**JobChangesStartDetailsDataCe861a6a360d10002d40f176b7180020**](JobChangesStartDetailsDataCe861a6a360d10002d40f176b7180020.md)

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
> JobChangesGetStartDetailsResponse getStartDetails_0(ID).limit(limit).offset(offset).execute();

Retrieves the start details for the specified job change ID.

Retrieves the start details for the specified job change ID.  Secured by: Staffing Actions: Change Job Date and Reason  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
      JobChangesGetStartDetailsResponse result = client
              .jobChanges
              .getStartDetails_0(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#getStartDetails_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobChangesGetStartDetailsResponse> response = client
              .jobChanges
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
      System.err.println("Exception when calling JobChangesApi#getStartDetails_0");
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

[**JobChangesGetStartDetailsResponse**](JobChangesGetStartDetailsResponse.md)

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

<a name="partialUpdateLocationOptions"></a>
# **partialUpdateLocationOptions**
> ChangeJobLocation90151d6c4ff110001b4a46091678025c partialUpdateLocationOptions(ID, subresourceID, changeJobLocation90151d6c4ff110001b4a46091678025c).execute();

Partially updates the location options for the specified change job ID.

Partially updates the location options for the specified job change ID.  The {subResourceID} path parameter must be the same as the {ID} value.  You can call GET /jobChanges/{ID}/location/{subResourceID} to get the existing data to update.   The same Workday UI validations apply with this PATCH method. The data updates in this PATCH method do not persist until you call POST /jobChanges/{ID}/submit.  In the request body, specify at least this request field: location{id}.   To retrieve a location ID, you can call the GET /values/jobChangesGroup/locations prompt endpoint, which takes the job change ID as the staffingEvent query parameter. It returns HREF links to locations by location categories for the staffingEvent. You can filter the results by effectiveDate. By default, it returns locations on the current date.   To retrieve a workShift ID, call the GET /values/jobChangesGroup/workShifts prompt endpoint with the location query parameter. It returns work shifts by location. If you don&#39;t specify the location parameter, it returns an empty result.  To retrieve a workSpace ID, call the GET /values/jobChangesGroup/workSpaces prompt endpoint with the location query parameter. It returns HREF links to workspaces by configured prompt categories for the specified location. You can filter the results by effectiveDate. By default, it returns workspaces on the current date.  Secured by: Staffing Actions: Location  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
    Location90151d6c4ff110001bfa027116820278 location = new Location90151d6c4ff110001bfa027116820278();
    Integer scheduledHours = 56; // The new scheduled hours for the worker as of the effective date.
    WorkShift0ee7bb8b41db1000143d4e4822174f2e workShift = new WorkShift0ee7bb8b41db1000143d4e4822174f2e();
    WorkSpace0ee7bb8b41db10001e7db6a6c3e55663 workSpace = new WorkSpace0ee7bb8b41db10001e7db6a6c3e55663();
    try {
      ChangeJobLocation90151d6c4ff110001b4a46091678025c result = client
              .jobChanges
              .partialUpdateLocationOptions(ID, subresourceID)
              .location(location)
              .scheduledHours(scheduledHours)
              .workShift(workShift)
              .workSpace(workSpace)
              .execute();
      System.out.println(result);
      System.out.println(result.getLocation());
      System.out.println(result.getScheduledHours());
      System.out.println(result.getWorkShift());
      System.out.println(result.getWorkSpace());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#partialUpdateLocationOptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChangeJobLocation90151d6c4ff110001b4a46091678025c> response = client
              .jobChanges
              .partialUpdateLocationOptions(ID, subresourceID)
              .location(location)
              .scheduledHours(scheduledHours)
              .workShift(workShift)
              .workSpace(workSpace)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#partialUpdateLocationOptions");
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
| **changeJobLocation90151d6c4ff110001b4a46091678025c** | [**ChangeJobLocation90151d6c4ff110001b4a46091678025c**](ChangeJobLocation90151d6c4ff110001b4a46091678025c.md)|  | |

### Return type

[**ChangeJobLocation90151d6c4ff110001b4a46091678025c**](ChangeJobLocation90151d6c4ff110001b4a46091678025c.md)

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

<a name="partiallyUpdateContractOptions"></a>
# **partiallyUpdateContractOptions**
> ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107 partiallyUpdateContractOptions(ID, subresourceID, changeJobContractDetailsData27ec818d10d010000386ce823ac20107).execute();

Partially updates the contract options for the specified change job ID.

Partially updates the contract details options for the specified job change ID. The {subResourceID} path parameter must be the same as the {ID} value.  You can call GET /jobChanges/{ID}/contract/{subResourceID} to get the existing data to update.   The same Workday UI validations apply with this PATCH method. The updates in this PATCH method do not persist until you call POST /jobChanges/{ID}/submit.   To retrieve a frequency ID, call the GET /values/jobChangesGroup/frequencies prompt endpoint, which takes the job change ID as the staffingEvent query parameter. It returns all frequencies based on staffing event for contingent workers. By default, it returns all frequencies in the tenant.  To retrieve a currency ID, call the GET /values/jobChangesGroup/currencies prompt endpoint, which takes the job change ID as the staffingEvent query parameter. If you specify the staffingEvent parameter, it returns HREF links to active currencies by prompt category. By default, it returns all active currencies.  Secured by: Staffing Actions: Contract Details  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
    String assignmentDetails = "assignmentDetails_example"; // The new contract assignment details for the contingent worker as of the effective date.
    LocalDate contractEndDate = LocalDate.now(); // The contract end date for the position as of this business process.
    Object contractPayRate = null; // The new contract pay rate for the contingent worker as of the effective date.
    Currency2d0ca2cb2448100009c54386a8570e07 currency = new Currency2d0ca2cb2448100009c54386a8570e07();
    Frequency2d0ca2cb2448100009c5436d5d670e06 frequency = new Frequency2d0ca2cb2448100009c5436d5d670e06();
    PurchaseOrder2d0ca2cb2448100009c5433bcff60e05 purchaseOrder = new PurchaseOrder2d0ca2cb2448100009c5433bcff60e05();
    try {
      ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107 result = client
              .jobChanges
              .partiallyUpdateContractOptions(ID, subresourceID)
              .assignmentDetails(assignmentDetails)
              .contractEndDate(contractEndDate)
              .contractPayRate(contractPayRate)
              .currency(currency)
              .frequency(frequency)
              .purchaseOrder(purchaseOrder)
              .execute();
      System.out.println(result);
      System.out.println(result.getAssignmentDetails());
      System.out.println(result.getContractEndDate());
      System.out.println(result.getContractPayRate());
      System.out.println(result.getCurrency());
      System.out.println(result.getFrequency());
      System.out.println(result.getPurchaseOrder());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#partiallyUpdateContractOptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107> response = client
              .jobChanges
              .partiallyUpdateContractOptions(ID, subresourceID)
              .assignmentDetails(assignmentDetails)
              .contractEndDate(contractEndDate)
              .contractPayRate(contractPayRate)
              .currency(currency)
              .frequency(frequency)
              .purchaseOrder(purchaseOrder)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#partiallyUpdateContractOptions");
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
| **changeJobContractDetailsData27ec818d10d010000386ce823ac20107** | [**ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107**](ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107.md)|  | |

### Return type

[**ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107**](ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107.md)

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

<a name="submitChangeJob"></a>
# **submitChangeJob**
> EventState54e611eca2c910000fbc4579181c0111 submitChangeJob(ID, eventState54e611eca2c910000fbc4579181c0111).execute();

Submit the specified change job ID.

Submits the specified change job ID.   To submit the Change Job event and initiate the Change Job business process, specify an empty request body: {}. To save for later, specify this request body: {     \&quot;businessProcessParameters\&quot;: {         \&quot;action\&quot;:{             \&quot;id\&quot;: \&quot;d9e41a8c446c11de98360015c5e6daf6\&quot;         }     } }  The action id value is the Workday ID of the \&quot;Save for Later\&quot; action. If you submit this endpoint with the Save for Later action, you can no longer edit nor resubmit the Change Job event using the REST APIs. The user with correct permissions can edit and submit the saved Change Job event in the Workday UI.  Secured by: Change Job (Mass Action), Change Job (REST Service)  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    BusinessProcessParameters5afc0b4b5a4610002aaebb8180cd2261 businessProcessParameters = new BusinessProcessParameters5afc0b4b5a4610002aaebb8180cd2261();
    Status54e611eca2c910000fbc4599be0b0112 status = new Status54e611eca2c910000fbc4599be0b0112();
    String validation = "validation_example"; // Validation message for an action event triggered by a condition.
    String id = "id_example"; // Id of the instance
    String descriptor = "descriptor_example"; // A preview of the instance
    try {
      EventState54e611eca2c910000fbc4579181c0111 result = client
              .jobChanges
              .submitChangeJob(ID)
              .businessProcessParameters(businessProcessParameters)
              .status(status)
              .validation(validation)
              .id(id)
              .descriptor(descriptor)
              .execute();
      System.out.println(result);
      System.out.println(result.getBusinessProcessParameters());
      System.out.println(result.getStatus());
      System.out.println(result.getValidation());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#submitChangeJob");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EventState54e611eca2c910000fbc4579181c0111> response = client
              .jobChanges
              .submitChangeJob(ID)
              .businessProcessParameters(businessProcessParameters)
              .status(status)
              .validation(validation)
              .id(id)
              .descriptor(descriptor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#submitChangeJob");
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
| **eventState54e611eca2c910000fbc4579181c0111** | [**EventState54e611eca2c910000fbc4579181c0111**](EventState54e611eca2c910000fbc4579181c0111.md)|  | |

### Return type

[**EventState54e611eca2c910000fbc4579181c0111**](EventState54e611eca2c910000fbc4579181c0111.md)

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

<a name="updateAdministrativeOptions"></a>
# **updateAdministrativeOptions**
> ChangeJobAdministrativeDetailsDataF8f20079bc5a1000089ccb7f6a8800ea updateAdministrativeOptions(ID, subresourceID, changeJobAdministrativeDetailsDataF8f20079bc5a1000089ccb7f6a8800ea).execute();

Partially updates the administrative options for the specified job change ID.

Partially updates the administrative options for the specified job change ID. The {subResourceID} path parameter must be the same as the {ID} value.  You can call GET /jobChanges/{ID}/administrative/{subResourceID} to get the existing data to update.   The same Workday UI validations apply with this PATCH method. The updates in this PATCH method do not persist until you call POST /jobChanges/{ID}/submit.  Note that there are no localization constraints in this API version. You can update the workingFTE and paidFTE fields even if the fields have not been localized.  To retrieve a positionWorkerType ID, you can call the GET /values/jobChangesGroup/employeeTypes prompt endpoint, with staffingEvent and location query parameters. If you specify the staffingEvent parameter, it returns HREF links to employee types by country. By default, it returns all employee types, excluding contingent workers.  For the positionWorkerType ID, you can also call the GET /values/jobChangesGroup/contingentWorkerTypes prompt endpoint, with staffingEvent and location query parameters. If you specify the staffingEvent parameter, it returns HREF links to contingent worker types for staffing event. If you specify location, it returns HREF links to contingent worker types by location or country. By default, it returns all contingent worker types.  To retrieve a workersCompensationCodeOverride ID, call the GET /values/jobChangesGroup/workersCompensationCodeOverrides prompt endpoint, which takes the job change ID as the staffing Event query parameter.   To retrieve a payRateType ID, call the GET /values/jobChangesGroup/payRateTypes prompt endpoint, which takes the job change ID as the staffingEvent query parameter. It returns all pay rate types based on staffing event for contingent workers. By default, it returns all pay rate types in the tenant.   To retrieve companyInsiderType IDs, call the GET /values/jobChangesGroup/companyInsiderTypes prompt endpoint, which returns all company insider types in the tenant.   To retrieve an assignmentType ID, call the GET /values/jobChangesGroup/assignmentTypes prompt endpoint, which takes the job change ID as the staffingEvent query parameter. If you specify the staffingEvent parameter, it returns assignmentTypes for the staffingEvent. By default, it returns all active assignment types.  To retrieve a workStudy ID, call the GET /values/jobChangesGroup/workStudyAwards prompt endpoint, which takes the job change ID as the staffingEvent query parameter. If you specify the staffingEvent parameter, it returns work study awards for the staffingEvent. By default, it returns all work studies in the tenant.  To retrieve a timeType ID, call the GET /values/jobChangesGroup/timeTypes prompt endpoint, which takes the job change ID as the staffingEvent query parameter. If you specify the staffingEvent parameter, it returns time types for the staffingEvent. By default, it returns all time types based on the Relax Hiring Restrictions tenant configuration.  Secured by: Staffing Actions: Administrator  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
    PayRateTypeD25283821c01100016756a14eb650000 payRateType = new PayRateTypeD25283821c01100016756a14eb650000();
    WorkersCompensationCodeOverride05d4c45042b61000138500e185e0013f workersCompensationCodeOverride = new WorkersCompensationCodeOverride05d4c45042b61000138500e185e0013f();
    Integer fte = 56; // Full Time Equivalent for a worker calculated by scheduled weekly hours divided by default weekly hours either current or proposed.
    LocalDate notifyBy = LocalDate.now(); // Returns the date that the employee should be notified for a termination.
    List<ChangeJobCompanyInsiderTypesData05d4c45042b61000131e4b2132f30137> companyInsiderTypes = Arrays.asList(); // The new company insider types for the worker as of the effective date.
    LocalDate firstDayOfWork = LocalDate.now(); // The first day of work for the worker, as specified on the Hire, Add International Assignment, or Add Job transaction. This field will not return a value for any other transaction.
    Integer defaultWeeklyHours = 56; // The new default weekly hours for the worker as of the effective date.
    PositionWorkerType05d4c45042b610001030ee47f2c90118 positionWorkerType = new PositionWorkerType05d4c45042b610001030ee47f2c90118();
    Integer workingFte = 56; // The working full time equivalent for the worker as of the effective date.
    Boolean specifyWorkingFte = true; // True if working full time equivalent is specified on a worker as of the effective date.
    TimeType05d4c45042b610000bb540b7458e0108 timeType = new TimeType05d4c45042b610000bb540b7458e0108();
    Boolean specifyPaidFte = true; // True if paid full time equivalent is specified on a worker as of the effective date.
    Integer paidFte = 56; // The paid full time equivalent for the worker as of the effective date.
    WorkStudy05d4c45042b610000ba2f83c70f30101 workStudy = new WorkStudy05d4c45042b610000ba2f83c70f30101();
    AssignmentType23929e1f68ca10000d6940d6bde56963 assignmentType = new AssignmentType23929e1f68ca10000d6940d6bde56963();
    LocalDate endEmploymentDate = LocalDate.now(); // The new End Employment Date for the worker. If the worker has an Employee Contract sub event, this field will return that end date instead.
    LocalDate expectedAssignmentEndDate = LocalDate.now(); // For a past or current business process, the value of the Expected Assignment End Date field that is being (or was) proposed in the process.
    try {
      ChangeJobAdministrativeDetailsDataF8f20079bc5a1000089ccb7f6a8800ea result = client
              .jobChanges
              .updateAdministrativeOptions(ID, subresourceID)
              .payRateType(payRateType)
              .workersCompensationCodeOverride(workersCompensationCodeOverride)
              .fte(fte)
              .notifyBy(notifyBy)
              .companyInsiderTypes(companyInsiderTypes)
              .firstDayOfWork(firstDayOfWork)
              .defaultWeeklyHours(defaultWeeklyHours)
              .positionWorkerType(positionWorkerType)
              .workingFte(workingFte)
              .specifyWorkingFte(specifyWorkingFte)
              .timeType(timeType)
              .specifyPaidFte(specifyPaidFte)
              .paidFte(paidFte)
              .workStudy(workStudy)
              .assignmentType(assignmentType)
              .endEmploymentDate(endEmploymentDate)
              .expectedAssignmentEndDate(expectedAssignmentEndDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getPayRateType());
      System.out.println(result.getWorkersCompensationCodeOverride());
      System.out.println(result.getFte());
      System.out.println(result.getNotifyBy());
      System.out.println(result.getCompanyInsiderTypes());
      System.out.println(result.getFirstDayOfWork());
      System.out.println(result.getDefaultWeeklyHours());
      System.out.println(result.getPositionWorkerType());
      System.out.println(result.getWorkingFte());
      System.out.println(result.getSpecifyWorkingFte());
      System.out.println(result.getTimeType());
      System.out.println(result.getSpecifyPaidFte());
      System.out.println(result.getPaidFte());
      System.out.println(result.getWorkStudy());
      System.out.println(result.getAssignmentType());
      System.out.println(result.getEndEmploymentDate());
      System.out.println(result.getExpectedAssignmentEndDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#updateAdministrativeOptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChangeJobAdministrativeDetailsDataF8f20079bc5a1000089ccb7f6a8800ea> response = client
              .jobChanges
              .updateAdministrativeOptions(ID, subresourceID)
              .payRateType(payRateType)
              .workersCompensationCodeOverride(workersCompensationCodeOverride)
              .fte(fte)
              .notifyBy(notifyBy)
              .companyInsiderTypes(companyInsiderTypes)
              .firstDayOfWork(firstDayOfWork)
              .defaultWeeklyHours(defaultWeeklyHours)
              .positionWorkerType(positionWorkerType)
              .workingFte(workingFte)
              .specifyWorkingFte(specifyWorkingFte)
              .timeType(timeType)
              .specifyPaidFte(specifyPaidFte)
              .paidFte(paidFte)
              .workStudy(workStudy)
              .assignmentType(assignmentType)
              .endEmploymentDate(endEmploymentDate)
              .expectedAssignmentEndDate(expectedAssignmentEndDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#updateAdministrativeOptions");
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
| **changeJobAdministrativeDetailsDataF8f20079bc5a1000089ccb7f6a8800ea** | [**ChangeJobAdministrativeDetailsDataF8f20079bc5a1000089ccb7f6a8800ea**](ChangeJobAdministrativeDetailsDataF8f20079bc5a1000089ccb7f6a8800ea.md)|  | |

### Return type

[**ChangeJobAdministrativeDetailsDataF8f20079bc5a1000089ccb7f6a8800ea**](ChangeJobAdministrativeDetailsDataF8f20079bc5a1000089ccb7f6a8800ea.md)

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

<a name="updateBusinessTitleOptions"></a>
# **updateBusinessTitleOptions**
> ChangeJobBusinessTitle3db8095ffa18100013a5f96969ca0102 updateBusinessTitleOptions(ID, subresourceID, changeJobBusinessTitle3db8095ffa18100013a5f96969ca0102).execute();

Partially updates the businessTitle options for the specified change job ID.

Partially updates the businessTitle options for the specified change job ID.  The {subResourceID} path parameter must be the same as the {ID} value.  You can call GET /jobChanges/{ID}/businessTitle/{subResourceID} to get the existing data to update.   The same Workday UI validations apply with this PATCH method. The updates in this PATCH method do not persist until you call POST /jobChanges/{ID}/submit.  Secured by: Staffing Actions: Business Title  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
    String businessTitle = "businessTitle_example"; // The new business title for the worker as of the effective date.  If there is no business title override, this field defaults to the job title or job profile name.
    try {
      ChangeJobBusinessTitle3db8095ffa18100013a5f96969ca0102 result = client
              .jobChanges
              .updateBusinessTitleOptions(ID, subresourceID)
              .businessTitle(businessTitle)
              .execute();
      System.out.println(result);
      System.out.println(result.getBusinessTitle());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#updateBusinessTitleOptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChangeJobBusinessTitle3db8095ffa18100013a5f96969ca0102> response = client
              .jobChanges
              .updateBusinessTitleOptions(ID, subresourceID)
              .businessTitle(businessTitle)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#updateBusinessTitleOptions");
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
| **changeJobBusinessTitle3db8095ffa18100013a5f96969ca0102** | [**ChangeJobBusinessTitle3db8095ffa18100013a5f96969ca0102**](ChangeJobBusinessTitle3db8095ffa18100013a5f96969ca0102.md)|  | |

### Return type

[**ChangeJobBusinessTitle3db8095ffa18100013a5f96969ca0102**](ChangeJobBusinessTitle3db8095ffa18100013a5f96969ca0102.md)

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

Partially updates the comment for the specified change job ID.

Updates the comment for the specified change job ID. The {subResourceID} path parameter must be the same as the {ID} value.  The data updates in this PATCH method do not persist until you call POST /jobChanges/{ID}/submit.  You can call GET /jobChanges/{ID}/comment/{subResourceID} to get the existing data to update.  Secured by: Change Job (Mass Action), Change Job (REST Service)  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
              .jobChanges
              .updateComment(ID, subresourceID)
              .comment(comment)
              .execute();
      System.out.println(result);
      System.out.println(result.getComment());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#updateComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Comments7d98fd55aeee100022968e52a1b31c60> response = client
              .jobChanges
              .updateComment(ID, subresourceID)
              .comment(comment)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#updateComment");
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

<a name="updateJobClassificationOptions"></a>
# **updateJobClassificationOptions**
> ChangeJobJobClassificationData354103f196361000084489bcb281017f updateJobClassificationOptions(ID, subresourceID, changeJobJobClassificationData354103f196361000084489bcb281017f).execute();

Partially updates the jobClassification options for the specified change job ID.

Partially updates the job classifications for the specified job change ID.  The {subResourceID} path parameter must be the same as the {ID} value.  You can call GET /jobChanges/{ID}/jobClassification/{subResourceID} to get the existing data to update.   The same Workday UI validations apply with this PATCH method. The updates in this PATCH method do not persist until you call POST /jobChanges/{ID}/submit.  In the request body, specify at least this required field: additionalJobClassifications[ {id} ].   To retrieve an additionalJobClassifications ID, call the GET /values/jobChangesGroup/jobClassifications prompt endpoint with the location and/or staffingEvent query parameter. It returns HREF links to job classifications by location for the staffing event. It returns an empty result if both location and staffingEvent are not specified. You can filter the results by effectiveDate. By default, it returns job classifications on the current date.  Secured by: Staffing Actions: Additional Job Classifications  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
    List<ChangeJobAdditionalJobClassificationData27ec818d10d0100003600115b5200102> additionalJobClassifications = Arrays.asList(); // Additional Job Classifications Proposed By Staffing Event
    try {
      ChangeJobJobClassificationData354103f196361000084489bcb281017f result = client
              .jobChanges
              .updateJobClassificationOptions(ID, subresourceID)
              .additionalJobClassifications(additionalJobClassifications)
              .execute();
      System.out.println(result);
      System.out.println(result.getAdditionalJobClassifications());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#updateJobClassificationOptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChangeJobJobClassificationData354103f196361000084489bcb281017f> response = client
              .jobChanges
              .updateJobClassificationOptions(ID, subresourceID)
              .additionalJobClassifications(additionalJobClassifications)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#updateJobClassificationOptions");
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
| **changeJobJobClassificationData354103f196361000084489bcb281017f** | [**ChangeJobJobClassificationData354103f196361000084489bcb281017f**](ChangeJobJobClassificationData354103f196361000084489bcb281017f.md)|  | |

### Return type

[**ChangeJobJobClassificationData354103f196361000084489bcb281017f**](ChangeJobJobClassificationData354103f196361000084489bcb281017f.md)

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

<a name="updateJobProfileOptions"></a>
# **updateJobProfileOptions**
> ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115 updateJobProfileOptions(ID, subresourceID, changeJobJobProfileData3db8095ffa18100013f019a27a1f0115).execute();

Partially updates the jobProfile options for the specified change job ID.

Partially updates the job profile options for the specified job change ID.  The {subResourceID} path parameter must be the same as the {ID} value.  You can call GET /jobChanges/{ID}/jobProfile/{subResourceID} to get the existing data to update.  The same Workday UI validations apply with this PATCH method. The updates in this PATCH method do not persist until you call POST /jobChanges/{ID}/submit.  In the request body, specify at least this required field: jobProfile{id}  To retrieve a jobProfile ID, call the GET /values/jobChangesGroup/jobProfiles prompt endpoint, which takes the job change ID as the staffingEvent query parameter. If you specify the staffingEvent parameter, it returns HREF links to the job profiles by the prompt category. If you don&#39;t specify the staffingEvent parameter, it returns all job profiles, regardless of their categories. You can also filter the job profiles by the effectiveDate query parameter. The default is the current date.  Secured by: Staffing Actions: Job Profile  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
    JobProfile3db8095ffa18100013f019afc6d30116 jobProfile = new JobProfile3db8095ffa18100013f019afc6d30116();
    String jobTitle = "jobTitle_example"; // The new job title for the worker as of the effective date.
    try {
      ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115 result = client
              .jobChanges
              .updateJobProfileOptions(ID, subresourceID)
              .jobProfile(jobProfile)
              .jobTitle(jobTitle)
              .execute();
      System.out.println(result);
      System.out.println(result.getJobProfile());
      System.out.println(result.getJobTitle());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#updateJobProfileOptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115> response = client
              .jobChanges
              .updateJobProfileOptions(ID, subresourceID)
              .jobProfile(jobProfile)
              .jobTitle(jobTitle)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#updateJobProfileOptions");
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
| **changeJobJobProfileData3db8095ffa18100013f019a27a1f0115** | [**ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115**](ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115.md)|  | |

### Return type

[**ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115**](ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115.md)

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

<a name="updateMoveTeamOptions"></a>
# **updateMoveTeamOptions**
> ChangeJobMoveTeamData544fdf5c01da1000238ad82d26d90146 updateMoveTeamOptions(ID, subresourceID, changeJobMoveTeamData544fdf5c01da1000238ad82d26d90146).execute();

Partially updates the moveTeam options for the specified change job ID.

Partially updates the moveTeam options for the specified change job ID.  The {subResourceID} path parameter must be the same as the {ID} value.  You can call GET /jobChanges/{ID}/moveTeam/{subResourceID} to get the existing data to update.   The same Workday UI validations apply with this PATCH method. The updates in this PATCH method do not persist until you call POST /jobChanges/{ID}/submit.  Secured by: Staffing Actions: Move Manager&#39;s Team  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
    Boolean moveTeam = true; // Returns a boolean that indicates whether teams reporting to the Manager moved with them during the Change Job Event.
    try {
      ChangeJobMoveTeamData544fdf5c01da1000238ad82d26d90146 result = client
              .jobChanges
              .updateMoveTeamOptions(ID, subresourceID)
              .moveTeam(moveTeam)
              .execute();
      System.out.println(result);
      System.out.println(result.getMoveTeam());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#updateMoveTeamOptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChangeJobMoveTeamData544fdf5c01da1000238ad82d26d90146> response = client
              .jobChanges
              .updateMoveTeamOptions(ID, subresourceID)
              .moveTeam(moveTeam)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#updateMoveTeamOptions");
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
| **changeJobMoveTeamData544fdf5c01da1000238ad82d26d90146** | [**ChangeJobMoveTeamData544fdf5c01da1000238ad82d26d90146**](ChangeJobMoveTeamData544fdf5c01da1000238ad82d26d90146.md)|  | |

### Return type

[**ChangeJobMoveTeamData544fdf5c01da1000238ad82d26d90146**](ChangeJobMoveTeamData544fdf5c01da1000238ad82d26d90146.md)

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

<a name="updateOpeningOptions"></a>
# **updateOpeningOptions**
> ChangeJobOpeningData97af9049a5fd10001c4888d654170000 updateOpeningOptions(ID, subresourceID, changeJobOpeningData97af9049a5fd10001c4888d654170000).execute();

Partially updates the opening options for the specified change job ID.

Partially updates the opening options for the specified job change ID.  The {subResourceID} path parameter must be the same as the {ID} value.  You can call GET /jobChanges/{ID}/opening/{subResourceID} to get the existing data to update.   The same Workday UI validations apply with this PATCH method. The updates in this PATCH method do not persist until you call POST /jobChanges/{ID}/submit.  In the request body, specify at least this required field: headcountOption{id}   To retrieve a headcountOption ID, call the GET /values/jobChangesGroup/headcountOptions prompt endpoint, which takes the job change ID as the staffingEvent query parameter. By default, it returns all headcount options.  Secured by: Staffing Actions: Change Job Date and Reason  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
    HeadcountOption97af9049a5fd10001c48896fbde30000 headcountOption = new HeadcountOption97af9049a5fd10001c48896fbde30000();
    Boolean openingAvailableForOverlap = true; // Returns true if the value for 'Available for job overlap' box is checked
    String id = "id_example"; // Id of the instance
    String descriptor = "descriptor_example"; // A preview of the instance
    try {
      ChangeJobOpeningData97af9049a5fd10001c4888d654170000 result = client
              .jobChanges
              .updateOpeningOptions(ID, subresourceID)
              .headcountOption(headcountOption)
              .openingAvailableForOverlap(openingAvailableForOverlap)
              .id(id)
              .descriptor(descriptor)
              .execute();
      System.out.println(result);
      System.out.println(result.getHeadcountOption());
      System.out.println(result.getOpeningAvailableForOverlap());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#updateOpeningOptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChangeJobOpeningData97af9049a5fd10001c4888d654170000> response = client
              .jobChanges
              .updateOpeningOptions(ID, subresourceID)
              .headcountOption(headcountOption)
              .openingAvailableForOverlap(openingAvailableForOverlap)
              .id(id)
              .descriptor(descriptor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#updateOpeningOptions");
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
| **changeJobOpeningData97af9049a5fd10001c4888d654170000** | [**ChangeJobOpeningData97af9049a5fd10001c4888d654170000**](ChangeJobOpeningData97af9049a5fd10001c4888d654170000.md)|  | |

### Return type

[**ChangeJobOpeningData97af9049a5fd10001c4888d654170000**](ChangeJobOpeningData97af9049a5fd10001c4888d654170000.md)

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

<a name="updatePositionOptions"></a>
# **updatePositionOptions**
> ChangeJobPositionDataDfc4e58f7308100018bd1c459f435221 updatePositionOptions(ID, subresourceID, changeJobPositionDataDfc4e58f7308100018bd1c459f435221).execute();

Partially updates the position options for the specified change job ID.

Partially updates the position options for the specified job change ID. The {subResourceID} path parameter must be the same as the {ID} value.  You can call GET /jobChanges/{ID}/startDetails/{subResourceID} to get the existing data to update.   The same Workday UI validations apply with this PATCH method. The updates in this PATCH method do not persist until you call POST /jobChanges/{ID}/submit.  In the request body, specify at least these request fields: position{id}, createPosition, closePosition, availableForOverlap  To retrieve a position ID, call the GET /values/jobChangesGroup/proposedPosition prompt endpoint, which takes the job change ID as the staffingEvent query parameter. It returns HREF links to proposed positions based on staffing event for contingent workers. You can filter the results by effectiveDate. By default, it returns all proposed positions on current date.  Secured by: Staffing Actions: Select or Create Position  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
    Boolean createPosition = true; // Returns true if the position is being created.
    Boolean availableForOverlap = true; // Returns true if the value for 'Available for job overlap' box is checked
    PositionDfc4e58f730810001ad60369c23452d1 position = new PositionDfc4e58f730810001ad60369c23452d1();
    Boolean closePosition = true; // Returns true if the position is being closed.
    JobRequisitionDfc4e58f730810001ad60325d9bc52cf jobRequisition = new JobRequisitionDfc4e58f730810001ad60325d9bc52cf();
    String id = "id_example"; // Id of the instance
    String descriptor = "descriptor_example"; // A preview of the instance
    try {
      ChangeJobPositionDataDfc4e58f7308100018bd1c459f435221 result = client
              .jobChanges
              .updatePositionOptions(ID, subresourceID)
              .createPosition(createPosition)
              .availableForOverlap(availableForOverlap)
              .position(position)
              .closePosition(closePosition)
              .jobRequisition(jobRequisition)
              .id(id)
              .descriptor(descriptor)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreatePosition());
      System.out.println(result.getAvailableForOverlap());
      System.out.println(result.getPosition());
      System.out.println(result.getClosePosition());
      System.out.println(result.getJobRequisition());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#updatePositionOptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChangeJobPositionDataDfc4e58f7308100018bd1c459f435221> response = client
              .jobChanges
              .updatePositionOptions(ID, subresourceID)
              .createPosition(createPosition)
              .availableForOverlap(availableForOverlap)
              .position(position)
              .closePosition(closePosition)
              .jobRequisition(jobRequisition)
              .id(id)
              .descriptor(descriptor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#updatePositionOptions");
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
| **changeJobPositionDataDfc4e58f7308100018bd1c459f435221** | [**ChangeJobPositionDataDfc4e58f7308100018bd1c459f435221**](ChangeJobPositionDataDfc4e58f7308100018bd1c459f435221.md)|  | |

### Return type

[**ChangeJobPositionDataDfc4e58f7308100018bd1c459f435221**](ChangeJobPositionDataDfc4e58f7308100018bd1c459f435221.md)

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

<a name="updateStartDetails"></a>
# **updateStartDetails**
> JobChangesStartDetailsDataCe861a6a360d10002d40f176b7180020 updateStartDetails(ID, subresourceID, jobChangesStartDetailsDataCe861a6a360d10002d40f176b7180020).execute();

Partially updates the startDetails options for the specified change job ID.

Partially updates the start details for the specified job change ID.  The {subResourceID} path parameter must be the same as the {ID} value.  You can call GET /jobChanges/{ID}/startDetails/{subResourceID} to get the existing data to update.   The same Workday UI validations apply with this PATCH method. The updates in this PATCH method do not persist until you call POST /jobChanges/{ID}/submit.  In the request body, specify at least these request fields: date, reason{id}.   To retrieve a reason ID, call the GET /values/jobChangesGroup/reason prompt endpoint, which takes the job change ID as the staffingEvent query parameter. If you specify the staffingEvent parameter, it returns change job reasons for the staffingEvent, by the change job category. By default, it returns all change job categories and reasons.  Secured by: Staffing Actions: Change Job Date and Reason  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobChangesApi;
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
    Worker271bbd673582100010110b9f9a6d99e1 worker = new Worker271bbd673582100010110b9f9a6d99e1();
    Boolean useNextPayPeriod = true; // Next Pay Period?
    Template2b1b95dfe4af100009f30dc769a31686 template = new Template2b1b95dfe4af100009f30dc769a31686();
    Job35b8f199c29410002508ffd7ad6101f3 job = new Job35b8f199c29410002508ffd7ad6101f3();
    LocalDate date = LocalDate.now(); // The date this business process takes effect.
    Location6da81665c26510001fc6b1d42fae5f7b location = new Location6da81665c26510001fc6b1d42fae5f7b();
    Reason6da81665c26510001f34d0a154765e9b reason = new Reason6da81665c26510001f34d0a154765e9b();
    SupervisoryOrganizationE3267ea37e6f100032c00c34a99e74d8 supervisoryOrganization = new SupervisoryOrganizationE3267ea37e6f100032c00c34a99e74d8();
    String id = "id_example"; // Id of the instance
    String descriptor = "descriptor_example"; // A preview of the instance
    try {
      JobChangesStartDetailsDataCe861a6a360d10002d40f176b7180020 result = client
              .jobChanges
              .updateStartDetails(ID, subresourceID)
              .worker(worker)
              .useNextPayPeriod(useNextPayPeriod)
              .template(template)
              .job(job)
              .date(date)
              .location(location)
              .reason(reason)
              .supervisoryOrganization(supervisoryOrganization)
              .id(id)
              .descriptor(descriptor)
              .execute();
      System.out.println(result);
      System.out.println(result.getWorker());
      System.out.println(result.getUseNextPayPeriod());
      System.out.println(result.getTemplate());
      System.out.println(result.getJob());
      System.out.println(result.getDate());
      System.out.println(result.getLocation());
      System.out.println(result.getReason());
      System.out.println(result.getSupervisoryOrganization());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#updateStartDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobChangesStartDetailsDataCe861a6a360d10002d40f176b7180020> response = client
              .jobChanges
              .updateStartDetails(ID, subresourceID)
              .worker(worker)
              .useNextPayPeriod(useNextPayPeriod)
              .template(template)
              .job(job)
              .date(date)
              .location(location)
              .reason(reason)
              .supervisoryOrganization(supervisoryOrganization)
              .id(id)
              .descriptor(descriptor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobChangesApi#updateStartDetails");
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
| **jobChangesStartDetailsDataCe861a6a360d10002d40f176b7180020** | [**JobChangesStartDetailsDataCe861a6a360d10002d40f176b7180020**](JobChangesStartDetailsDataCe861a6a360d10002d40f176b7180020.md)|  | |

### Return type

[**JobChangesStartDetailsDataCe861a6a360d10002d40f176b7180020**](JobChangesStartDetailsDataCe861a6a360d10002d40f176b7180020.md)

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

