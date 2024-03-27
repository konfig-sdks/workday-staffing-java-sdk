# JobFamiliesApi

All URIs are relative to *https://&lt;tenantHostname&gt;/staffing/v6*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getById**](JobFamiliesApi.md#getById) | **GET** /jobFamilies/{ID} | Retrieves a single job family instance. |
| [**list**](JobFamiliesApi.md#list) | **GET** /jobFamilies | Retrieves a collection of job families. |


<a name="getById"></a>
# **getById**
> JobFamilyView51ed1475e9e6100005d10fcedc5a000a getById(ID).execute();

Retrieves a single job family instance.

Retrieves a job family with the specified ID.  Secured by: Job Information  Scope: Jobs &amp; Positions

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobFamiliesApi;
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
      JobFamilyView51ed1475e9e6100005d10fcedc5a000a result = client
              .jobFamilies
              .getById(ID)
              .execute();
      System.out.println(result);
      System.out.println(result.getSummary());
      System.out.println(result.getInactive());
      System.out.println(result.getJobFamilyGroup());
      System.out.println(result.getJobProfiles());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobFamiliesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobFamilyView51ed1475e9e6100005d10fcedc5a000a> response = client
              .jobFamilies
              .getById(ID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobFamiliesApi#getById");
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

[**JobFamilyView51ed1475e9e6100005d10fcedc5a000a**](JobFamilyView51ed1475e9e6100005d10fcedc5a000a.md)

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

<a name="list"></a>
# **list**
> JobFamiliesListResponse list().inactive(inactive).jobFamilyGroup(jobFamilyGroup).jobProfile(jobProfile).limit(limit).offset(offset).execute();

Retrieves a collection of job families.

Retrieves a collection of job families.  Secured by: Job Information  Scope: Jobs &amp; Positions

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobFamiliesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    Boolean inactive = true; // If true, the method returns inactive job families. Default is false.
    List<String> jobFamilyGroup = Arrays.asList(); // The job family group for the job family. You can specify more than 1 jobFamilyGroup query parameter.
    List<String> jobProfile = Arrays.asList(); // The job profile for the job family. You can specify more than 1 jobFamilyGroup query parameter. For possible values, you can use a returned id from GET /jobProfiles.
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    try {
      JobFamiliesListResponse result = client
              .jobFamilies
              .list()
              .inactive(inactive)
              .jobFamilyGroup(jobFamilyGroup)
              .jobProfile(jobProfile)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobFamiliesApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobFamiliesListResponse> response = client
              .jobFamilies
              .list()
              .inactive(inactive)
              .jobFamilyGroup(jobFamilyGroup)
              .jobProfile(jobProfile)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobFamiliesApi#list");
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
| **inactive** | **Boolean**| If true, the method returns inactive job families. Default is false. | [optional] |
| **jobFamilyGroup** | [**List&lt;String&gt;**](String.md)| The job family group for the job family. You can specify more than 1 jobFamilyGroup query parameter. | [optional] |
| **jobProfile** | [**List&lt;String&gt;**](String.md)| The job profile for the job family. You can specify more than 1 jobFamilyGroup query parameter. For possible values, you can use a returned id from GET /jobProfiles. | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |

### Return type

[**JobFamiliesListResponse**](JobFamiliesListResponse.md)

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

