# JobProfilesApi

All URIs are relative to *https://&lt;tenantHostname&gt;/staffing/v6*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getById**](JobProfilesApi.md#getById) | **GET** /jobProfiles/{ID} | Retrieves a single job profile instance. |
| [**listCollection**](JobProfilesApi.md#listCollection) | **GET** /jobProfiles | Retrieves a collection of job profiles. |


<a name="getById"></a>
# **getById**
> JobProfileDetailView7deab99f645f10000bd5e61a1b780041 getById(ID).execute();

Retrieves a single job profile instance.

Retrieves a job profile with the specified ID.  Secured by: Job Profile: View, Public Job: View  Scope: Jobs &amp; Positions

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobProfilesApi;
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
      JobProfileDetailView7deab99f645f10000bd5e61a1b780041 result = client
              .jobProfiles
              .getById(ID)
              .execute();
      System.out.println(result);
      System.out.println(result.getSummary());
      System.out.println(result.getJobDescription());
      System.out.println(result.getInactive());
      System.out.println(result.getPublic());
      System.out.println(result.getJobLevel());
      System.out.println(result.getManagementLevel());
      System.out.println(result.getCriticalJob());
      System.out.println(result.getJobExempts());
      System.out.println(result.getCompanyInsiderTypes());
      System.out.println(result.getDefaultJobTitle());
      System.out.println(result.getWorkShiftRequired());
      System.out.println(result.getAdditionalJobDescription());
      System.out.println(result.getJobFamilies());
      System.out.println(result.getDifficultyToFill());
      System.out.println(result.getName());
      System.out.println(result.getJobCategory());
      System.out.println(result.getPayRateTypes());
      System.out.println(result.getRestrictedToCountries());
      System.out.println(result.getWorkersCompensationCodes());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobProfilesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobProfileDetailView7deab99f645f10000bd5e61a1b780041> response = client
              .jobProfiles
              .getById(ID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobProfilesApi#getById");
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

[**JobProfileDetailView7deab99f645f10000bd5e61a1b780041**](JobProfileDetailView7deab99f645f10000bd5e61a1b780041.md)

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

<a name="listCollection"></a>
# **listCollection**
> JobProfilesListCollectionResponse listCollection().includeInactive(includeInactive).limit(limit).offset(offset).execute();

Retrieves a collection of job profiles.

Retrieves a collection of job profiles.  Secured by: Job Profile: View, Public Job: View  Scope: Jobs &amp; Positions

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobProfilesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    Boolean includeInactive = true; // If true, the method returns inactive job profiles. Default is false.
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    try {
      JobProfilesListCollectionResponse result = client
              .jobProfiles
              .listCollection()
              .includeInactive(includeInactive)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobProfilesApi#listCollection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobProfilesListCollectionResponse> response = client
              .jobProfiles
              .listCollection()
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
      System.err.println("Exception when calling JobProfilesApi#listCollection");
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
| **includeInactive** | **Boolean**| If true, the method returns inactive job profiles. Default is false. | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |

### Return type

[**JobProfilesListCollectionResponse**](JobProfilesListCollectionResponse.md)

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

