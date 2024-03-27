# PromptValuesApi

All URIs are relative to *https://&lt;tenantHostname&gt;/staffing/v6*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**availableLocations**](PromptValuesApi.md#availableLocations) | **GET** /values/jobChangesGroup/locations |  |
| [**getAssignmentChangeGroupCostCenters**](PromptValuesApi.md#getAssignmentChangeGroupCostCenters) | **GET** /values/organizationAssignmentChangesGroup/costCenters |  |
| [**getAssignmentTypes**](PromptValuesApi.md#getAssignmentTypes) | **GET** /values/jobChangesGroup/assignmentTypes |  |
| [**getCompanyInsiderTypes**](PromptValuesApi.md#getCompanyInsiderTypes) | **GET** /values/jobChangesGroup/companyInsiderTypes |  |
| [**getContingentWorkerTypes**](PromptValuesApi.md#getContingentWorkerTypes) | **GET** /values/jobChangesGroup/contingentWorkerTypes |  |
| [**getCurrencyInstances**](PromptValuesApi.md#getCurrencyInstances) | **GET** /values/jobChangesGroup/currencies |  |
| [**getEmployeeTypes**](PromptValuesApi.md#getEmployeeTypes) | **GET** /values/jobChangesGroup/employeeTypes |  |
| [**getGiftInstances**](PromptValuesApi.md#getGiftInstances) | **GET** /values/organizationAssignmentChangesGroup/gifts |  |
| [**getGrants**](PromptValuesApi.md#getGrants) | **GET** /values/organizationAssignmentChangesGroup/grants |  |
| [**getInstances**](PromptValuesApi.md#getInstances) | **GET** /values/organizationAssignmentChangesGroup/regions |  |
| [**getInstances_0**](PromptValuesApi.md#getInstances_0) | **GET** /values/jobChangesGroup/reason |  |
| [**getInstances_1**](PromptValuesApi.md#getInstances_1) | **GET** /values/organizationAssignmentChangesGroup/customs |  |
| [**getInstances_10**](PromptValuesApi.md#getInstances_10) | **GET** /values/jobChangesGroup/templates |  |
| [**getInstances_11**](PromptValuesApi.md#getInstances_11) | **GET** /values/jobChangesGroup/workers |  |
| [**getInstances_12**](PromptValuesApi.md#getInstances_12) | **GET** /values/jobChangesGroup/jobs |  |
| [**getInstances_13**](PromptValuesApi.md#getInstances_13) | **GET** /values/organizationAssignmentChangesGroup/workers |  |
| [**getInstances_14**](PromptValuesApi.md#getInstances_14) | **GET** /values/jobChangesGroup/workStudyAwards |  |
| [**getInstances_15**](PromptValuesApi.md#getInstances_15) | **GET** /values/organizationAssignmentChangesGroup/positions |  |
| [**getInstances_16**](PromptValuesApi.md#getInstances_16) | **GET** /values/jobChangesGroup/jobRequisitions |  |
| [**getInstances_17**](PromptValuesApi.md#getInstances_17) | **GET** /values/jobChangesGroup/jobProfiles |  |
| [**getInstances_18**](PromptValuesApi.md#getInstances_18) | **GET** /values/organizationAssignmentChangesGroup/companies |  |
| [**getInstances_19**](PromptValuesApi.md#getInstances_19) | **GET** /values/jobChangesGroup/jobClassifications |  |
| [**getInstances_2**](PromptValuesApi.md#getInstances_2) | **GET** /values/organizationAssignmentChangesGroup/programs |  |
| [**getInstances_3**](PromptValuesApi.md#getInstances_3) | **GET** /values/organizationAssignmentChangesGroup/jobs |  |
| [**getInstances_4**](PromptValuesApi.md#getInstances_4) | **GET** /values/organizationAssignmentChangesGroup/funds |  |
| [**getInstances_5**](PromptValuesApi.md#getInstances_5) | **GET** /values/jobChangesGroup/workersCompensationCodeOverrides |  |
| [**getInstances_6**](PromptValuesApi.md#getInstances_6) | **GET** /values/jobChangesGroup/workShifts |  |
| [**getInstances_7**](PromptValuesApi.md#getInstances_7) | **GET** /values/organizationAssignmentChangesGroup/businessUnits |  |
| [**getInstances_8**](PromptValuesApi.md#getInstances_8) | **GET** /values/jobChangesGroup/frequencies |  |
| [**getInstances_9**](PromptValuesApi.md#getInstances_9) | **GET** /values/jobChangesGroup/payRateTypes |  |
| [**getOptions**](PromptValuesApi.md#getOptions) | **GET** /values/jobChangesGroup/headcountOptions |  |
| [**getProposedPositions**](PromptValuesApi.md#getProposedPositions) | **GET** /values/jobChangesGroup/proposedPosition |  |
| [**getSupervisoryOrgValues**](PromptValuesApi.md#getSupervisoryOrgValues) | **GET** /values/jobChangesGroup/supervisoryOrganization |  |
| [**getTimeTypes**](PromptValuesApi.md#getTimeTypes) | **GET** /values/jobChangesGroup/timeTypes |  |
| [**getWorkerTypes**](PromptValuesApi.md#getWorkerTypes) | **GET** /values/jobChangesGroup/workerTypes |  |
| [**getWorkspaceInstances**](PromptValuesApi.md#getWorkspaceInstances) | **GET** /values/jobChangesGroup/workSpaces |  |


<a name="availableLocations"></a>
# **availableLocations**
> MULTIPLEINSTANCEMODELREFERENCE availableLocations().effectiveDate(effectiveDate).job(job).limit(limit).location(location).offset(offset).proposedManager(proposedManager).staffingEvent(staffingEvent).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String job = "job_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    String location = "location_example";
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    List<String> proposedManager = Arrays.asList();
    String staffingEvent = "staffingEvent_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .availableLocations()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#availableLocations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .availableLocations()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#availableLocations");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **job** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **location** | **String**|  | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **proposedManager** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **staffingEvent** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getAssignmentChangeGroupCostCenters"></a>
# **getAssignmentChangeGroupCostCenters**
> MULTIPLEINSTANCEMODELREFERENCE getAssignmentChangeGroupCostCenters().effectiveDate(effectiveDate).event(event).limit(limit).offset(offset).organizationType(organizationType).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String event = "event_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    String organizationType = "organizationType_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getAssignmentChangeGroupCostCenters()
              .effectiveDate(effectiveDate)
              .event(event)
              .limit(limit)
              .offset(offset)
              .organizationType(organizationType)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getAssignmentChangeGroupCostCenters");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getAssignmentChangeGroupCostCenters()
              .effectiveDate(effectiveDate)
              .event(event)
              .limit(limit)
              .offset(offset)
              .organizationType(organizationType)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getAssignmentChangeGroupCostCenters");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **event** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **organizationType** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getAssignmentTypes"></a>
# **getAssignmentTypes**
> MULTIPLEINSTANCEMODELREFERENCE getAssignmentTypes().effectiveDate(effectiveDate).job(job).limit(limit).location(location).offset(offset).proposedManager(proposedManager).staffingEvent(staffingEvent).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String job = "job_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    String location = "location_example";
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    List<String> proposedManager = Arrays.asList();
    String staffingEvent = "staffingEvent_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getAssignmentTypes()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getAssignmentTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getAssignmentTypes()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getAssignmentTypes");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **job** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **location** | **String**|  | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **proposedManager** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **staffingEvent** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getCompanyInsiderTypes"></a>
# **getCompanyInsiderTypes**
> MULTIPLEINSTANCEMODELREFERENCE getCompanyInsiderTypes().effectiveDate(effectiveDate).job(job).limit(limit).location(location).offset(offset).proposedManager(proposedManager).staffingEvent(staffingEvent).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String job = "job_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    String location = "location_example";
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    List<String> proposedManager = Arrays.asList();
    String staffingEvent = "staffingEvent_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getCompanyInsiderTypes()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getCompanyInsiderTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getCompanyInsiderTypes()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getCompanyInsiderTypes");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **job** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **location** | **String**|  | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **proposedManager** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **staffingEvent** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getContingentWorkerTypes"></a>
# **getContingentWorkerTypes**
> MULTIPLEINSTANCEMODELREFERENCE getContingentWorkerTypes().effectiveDate(effectiveDate).job(job).limit(limit).location(location).offset(offset).proposedManager(proposedManager).staffingEvent(staffingEvent).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String job = "job_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    String location = "location_example";
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    List<String> proposedManager = Arrays.asList();
    String staffingEvent = "staffingEvent_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getContingentWorkerTypes()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getContingentWorkerTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getContingentWorkerTypes()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getContingentWorkerTypes");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **job** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **location** | **String**|  | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **proposedManager** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **staffingEvent** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getCurrencyInstances"></a>
# **getCurrencyInstances**
> MULTIPLEINSTANCEMODELREFERENCE getCurrencyInstances().effectiveDate(effectiveDate).job(job).limit(limit).location(location).offset(offset).proposedManager(proposedManager).staffingEvent(staffingEvent).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String job = "job_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    String location = "location_example";
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    List<String> proposedManager = Arrays.asList();
    String staffingEvent = "staffingEvent_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getCurrencyInstances()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getCurrencyInstances");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getCurrencyInstances()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getCurrencyInstances");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **job** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **location** | **String**|  | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **proposedManager** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **staffingEvent** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getEmployeeTypes"></a>
# **getEmployeeTypes**
> MULTIPLEINSTANCEMODELREFERENCE getEmployeeTypes().effectiveDate(effectiveDate).job(job).limit(limit).location(location).offset(offset).proposedManager(proposedManager).staffingEvent(staffingEvent).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String job = "job_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    String location = "location_example";
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    List<String> proposedManager = Arrays.asList();
    String staffingEvent = "staffingEvent_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getEmployeeTypes()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getEmployeeTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getEmployeeTypes()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getEmployeeTypes");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **job** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **location** | **String**|  | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **proposedManager** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **staffingEvent** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getGiftInstances"></a>
# **getGiftInstances**
> MULTIPLEINSTANCEMODELREFERENCE getGiftInstances().effectiveDate(effectiveDate).event(event).limit(limit).offset(offset).organizationType(organizationType).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String event = "event_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    String organizationType = "organizationType_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getGiftInstances()
              .effectiveDate(effectiveDate)
              .event(event)
              .limit(limit)
              .offset(offset)
              .organizationType(organizationType)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getGiftInstances");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getGiftInstances()
              .effectiveDate(effectiveDate)
              .event(event)
              .limit(limit)
              .offset(offset)
              .organizationType(organizationType)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getGiftInstances");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **event** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **organizationType** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getGrants"></a>
# **getGrants**
> MULTIPLEINSTANCEMODELREFERENCE getGrants().effectiveDate(effectiveDate).event(event).limit(limit).offset(offset).organizationType(organizationType).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String event = "event_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    String organizationType = "organizationType_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getGrants()
              .effectiveDate(effectiveDate)
              .event(event)
              .limit(limit)
              .offset(offset)
              .organizationType(organizationType)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getGrants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getGrants()
              .effectiveDate(effectiveDate)
              .event(event)
              .limit(limit)
              .offset(offset)
              .organizationType(organizationType)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getGrants");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **event** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **organizationType** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getInstances"></a>
# **getInstances**
> MULTIPLEINSTANCEMODELREFERENCE getInstances().effectiveDate(effectiveDate).event(event).limit(limit).offset(offset).organizationType(organizationType).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String event = "event_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    String organizationType = "organizationType_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getInstances()
              .effectiveDate(effectiveDate)
              .event(event)
              .limit(limit)
              .offset(offset)
              .organizationType(organizationType)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getInstances()
              .effectiveDate(effectiveDate)
              .event(event)
              .limit(limit)
              .offset(offset)
              .organizationType(organizationType)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **event** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **organizationType** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getInstances_0"></a>
# **getInstances_0**
> MULTIPLEINSTANCEMODELREFERENCE getInstances_0().effectiveDate(effectiveDate).job(job).limit(limit).location(location).offset(offset).proposedManager(proposedManager).staffingEvent(staffingEvent).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String job = "job_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    String location = "location_example";
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    List<String> proposedManager = Arrays.asList();
    String staffingEvent = "staffingEvent_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getInstances_0()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getInstances_0()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_0");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **job** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **location** | **String**|  | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **proposedManager** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **staffingEvent** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getInstances_1"></a>
# **getInstances_1**
> MULTIPLEINSTANCEMODELREFERENCE getInstances_1().effectiveDate(effectiveDate).event(event).limit(limit).offset(offset).organizationType(organizationType).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String event = "event_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    String organizationType = "organizationType_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getInstances_1()
              .effectiveDate(effectiveDate)
              .event(event)
              .limit(limit)
              .offset(offset)
              .organizationType(organizationType)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getInstances_1()
              .effectiveDate(effectiveDate)
              .event(event)
              .limit(limit)
              .offset(offset)
              .organizationType(organizationType)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_1");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **event** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **organizationType** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getInstances_10"></a>
# **getInstances_10**
> MULTIPLEINSTANCEMODELREFERENCE getInstances_10().effectiveDate(effectiveDate).job(job).limit(limit).location(location).offset(offset).proposedManager(proposedManager).staffingEvent(staffingEvent).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String job = "job_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    String location = "location_example";
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    List<String> proposedManager = Arrays.asList();
    String staffingEvent = "staffingEvent_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getInstances_10()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_10");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getInstances_10()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_10");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **job** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **location** | **String**|  | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **proposedManager** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **staffingEvent** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getInstances_11"></a>
# **getInstances_11**
> MULTIPLEINSTANCEMODELREFERENCE getInstances_11().effectiveDate(effectiveDate).job(job).limit(limit).location(location).offset(offset).proposedManager(proposedManager).staffingEvent(staffingEvent).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String job = "job_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    String location = "location_example";
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    List<String> proposedManager = Arrays.asList();
    String staffingEvent = "staffingEvent_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getInstances_11()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_11");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getInstances_11()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_11");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **job** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **location** | **String**|  | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **proposedManager** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **staffingEvent** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getInstances_12"></a>
# **getInstances_12**
> MULTIPLEINSTANCEMODELREFERENCE getInstances_12().effectiveDate(effectiveDate).job(job).limit(limit).location(location).offset(offset).proposedManager(proposedManager).staffingEvent(staffingEvent).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String job = "job_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    String location = "location_example";
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    List<String> proposedManager = Arrays.asList();
    String staffingEvent = "staffingEvent_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getInstances_12()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_12");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getInstances_12()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_12");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **job** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **location** | **String**|  | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **proposedManager** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **staffingEvent** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getInstances_13"></a>
# **getInstances_13**
> MULTIPLEINSTANCEMODELREFERENCE getInstances_13().effectiveDate(effectiveDate).event(event).limit(limit).offset(offset).organizationType(organizationType).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String event = "event_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    String organizationType = "organizationType_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getInstances_13()
              .effectiveDate(effectiveDate)
              .event(event)
              .limit(limit)
              .offset(offset)
              .organizationType(organizationType)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_13");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getInstances_13()
              .effectiveDate(effectiveDate)
              .event(event)
              .limit(limit)
              .offset(offset)
              .organizationType(organizationType)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_13");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **event** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **organizationType** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getInstances_14"></a>
# **getInstances_14**
> MULTIPLEINSTANCEMODELREFERENCE getInstances_14().effectiveDate(effectiveDate).job(job).limit(limit).location(location).offset(offset).proposedManager(proposedManager).staffingEvent(staffingEvent).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String job = "job_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    String location = "location_example";
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    List<String> proposedManager = Arrays.asList();
    String staffingEvent = "staffingEvent_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getInstances_14()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_14");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getInstances_14()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_14");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **job** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **location** | **String**|  | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **proposedManager** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **staffingEvent** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getInstances_15"></a>
# **getInstances_15**
> MULTIPLEINSTANCEMODELREFERENCE getInstances_15().effectiveDate(effectiveDate).event(event).limit(limit).offset(offset).organizationType(organizationType).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String event = "event_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    String organizationType = "organizationType_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getInstances_15()
              .effectiveDate(effectiveDate)
              .event(event)
              .limit(limit)
              .offset(offset)
              .organizationType(organizationType)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_15");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getInstances_15()
              .effectiveDate(effectiveDate)
              .event(event)
              .limit(limit)
              .offset(offset)
              .organizationType(organizationType)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_15");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **event** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **organizationType** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getInstances_16"></a>
# **getInstances_16**
> MULTIPLEINSTANCEMODELREFERENCE getInstances_16().effectiveDate(effectiveDate).job(job).limit(limit).location(location).offset(offset).proposedManager(proposedManager).staffingEvent(staffingEvent).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String job = "job_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    String location = "location_example";
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    List<String> proposedManager = Arrays.asList();
    String staffingEvent = "staffingEvent_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getInstances_16()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_16");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getInstances_16()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_16");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **job** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **location** | **String**|  | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **proposedManager** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **staffingEvent** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getInstances_17"></a>
# **getInstances_17**
> MULTIPLEINSTANCEMODELREFERENCE getInstances_17().effectiveDate(effectiveDate).job(job).limit(limit).location(location).offset(offset).proposedManager(proposedManager).staffingEvent(staffingEvent).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String job = "job_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    String location = "location_example";
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    List<String> proposedManager = Arrays.asList();
    String staffingEvent = "staffingEvent_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getInstances_17()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_17");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getInstances_17()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_17");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **job** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **location** | **String**|  | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **proposedManager** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **staffingEvent** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getInstances_18"></a>
# **getInstances_18**
> MULTIPLEINSTANCEMODELREFERENCE getInstances_18().effectiveDate(effectiveDate).event(event).limit(limit).offset(offset).organizationType(organizationType).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String event = "event_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    String organizationType = "organizationType_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getInstances_18()
              .effectiveDate(effectiveDate)
              .event(event)
              .limit(limit)
              .offset(offset)
              .organizationType(organizationType)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_18");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getInstances_18()
              .effectiveDate(effectiveDate)
              .event(event)
              .limit(limit)
              .offset(offset)
              .organizationType(organizationType)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_18");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **event** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **organizationType** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getInstances_19"></a>
# **getInstances_19**
> MULTIPLEINSTANCEMODELREFERENCE getInstances_19().effectiveDate(effectiveDate).job(job).limit(limit).location(location).offset(offset).proposedManager(proposedManager).staffingEvent(staffingEvent).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String job = "job_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    String location = "location_example";
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    List<String> proposedManager = Arrays.asList();
    String staffingEvent = "staffingEvent_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getInstances_19()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_19");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getInstances_19()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_19");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **job** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **location** | **String**|  | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **proposedManager** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **staffingEvent** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getInstances_2"></a>
# **getInstances_2**
> MULTIPLEINSTANCEMODELREFERENCE getInstances_2().effectiveDate(effectiveDate).event(event).limit(limit).offset(offset).organizationType(organizationType).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String event = "event_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    String organizationType = "organizationType_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getInstances_2()
              .effectiveDate(effectiveDate)
              .event(event)
              .limit(limit)
              .offset(offset)
              .organizationType(organizationType)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_2");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getInstances_2()
              .effectiveDate(effectiveDate)
              .event(event)
              .limit(limit)
              .offset(offset)
              .organizationType(organizationType)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_2");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **event** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **organizationType** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getInstances_3"></a>
# **getInstances_3**
> MULTIPLEINSTANCEMODELREFERENCE getInstances_3().effectiveDate(effectiveDate).event(event).limit(limit).offset(offset).organizationType(organizationType).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String event = "event_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    String organizationType = "organizationType_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getInstances_3()
              .effectiveDate(effectiveDate)
              .event(event)
              .limit(limit)
              .offset(offset)
              .organizationType(organizationType)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_3");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getInstances_3()
              .effectiveDate(effectiveDate)
              .event(event)
              .limit(limit)
              .offset(offset)
              .organizationType(organizationType)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_3");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **event** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **organizationType** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getInstances_4"></a>
# **getInstances_4**
> MULTIPLEINSTANCEMODELREFERENCE getInstances_4().effectiveDate(effectiveDate).event(event).limit(limit).offset(offset).organizationType(organizationType).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String event = "event_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    String organizationType = "organizationType_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getInstances_4()
              .effectiveDate(effectiveDate)
              .event(event)
              .limit(limit)
              .offset(offset)
              .organizationType(organizationType)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_4");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getInstances_4()
              .effectiveDate(effectiveDate)
              .event(event)
              .limit(limit)
              .offset(offset)
              .organizationType(organizationType)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_4");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **event** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **organizationType** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getInstances_5"></a>
# **getInstances_5**
> MULTIPLEINSTANCEMODELREFERENCE getInstances_5().effectiveDate(effectiveDate).job(job).limit(limit).location(location).offset(offset).proposedManager(proposedManager).staffingEvent(staffingEvent).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String job = "job_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    String location = "location_example";
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    List<String> proposedManager = Arrays.asList();
    String staffingEvent = "staffingEvent_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getInstances_5()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_5");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getInstances_5()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_5");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **job** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **location** | **String**|  | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **proposedManager** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **staffingEvent** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getInstances_6"></a>
# **getInstances_6**
> MULTIPLEINSTANCEMODELREFERENCE getInstances_6().effectiveDate(effectiveDate).job(job).limit(limit).location(location).offset(offset).proposedManager(proposedManager).staffingEvent(staffingEvent).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String job = "job_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    String location = "location_example";
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    List<String> proposedManager = Arrays.asList();
    String staffingEvent = "staffingEvent_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getInstances_6()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_6");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getInstances_6()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_6");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **job** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **location** | **String**|  | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **proposedManager** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **staffingEvent** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getInstances_7"></a>
# **getInstances_7**
> MULTIPLEINSTANCEMODELREFERENCE getInstances_7().effectiveDate(effectiveDate).event(event).limit(limit).offset(offset).organizationType(organizationType).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String event = "event_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    String organizationType = "organizationType_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getInstances_7()
              .effectiveDate(effectiveDate)
              .event(event)
              .limit(limit)
              .offset(offset)
              .organizationType(organizationType)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_7");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getInstances_7()
              .effectiveDate(effectiveDate)
              .event(event)
              .limit(limit)
              .offset(offset)
              .organizationType(organizationType)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_7");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **event** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **organizationType** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getInstances_8"></a>
# **getInstances_8**
> MULTIPLEINSTANCEMODELREFERENCE getInstances_8().effectiveDate(effectiveDate).job(job).limit(limit).location(location).offset(offset).proposedManager(proposedManager).staffingEvent(staffingEvent).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String job = "job_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    String location = "location_example";
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    List<String> proposedManager = Arrays.asList();
    String staffingEvent = "staffingEvent_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getInstances_8()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_8");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getInstances_8()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_8");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **job** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **location** | **String**|  | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **proposedManager** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **staffingEvent** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getInstances_9"></a>
# **getInstances_9**
> MULTIPLEINSTANCEMODELREFERENCE getInstances_9().effectiveDate(effectiveDate).job(job).limit(limit).location(location).offset(offset).proposedManager(proposedManager).staffingEvent(staffingEvent).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String job = "job_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    String location = "location_example";
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    List<String> proposedManager = Arrays.asList();
    String staffingEvent = "staffingEvent_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getInstances_9()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_9");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getInstances_9()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getInstances_9");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **job** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **location** | **String**|  | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **proposedManager** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **staffingEvent** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getOptions"></a>
# **getOptions**
> MULTIPLEINSTANCEMODELREFERENCE getOptions().effectiveDate(effectiveDate).job(job).limit(limit).location(location).offset(offset).proposedManager(proposedManager).staffingEvent(staffingEvent).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String job = "job_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    String location = "location_example";
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    List<String> proposedManager = Arrays.asList();
    String staffingEvent = "staffingEvent_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getOptions()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getOptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getOptions()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getOptions");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **job** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **location** | **String**|  | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **proposedManager** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **staffingEvent** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getProposedPositions"></a>
# **getProposedPositions**
> MULTIPLEINSTANCEMODELREFERENCE getProposedPositions().effectiveDate(effectiveDate).job(job).limit(limit).location(location).offset(offset).proposedManager(proposedManager).staffingEvent(staffingEvent).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String job = "job_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    String location = "location_example";
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    List<String> proposedManager = Arrays.asList();
    String staffingEvent = "staffingEvent_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getProposedPositions()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getProposedPositions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getProposedPositions()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getProposedPositions");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **job** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **location** | **String**|  | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **proposedManager** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **staffingEvent** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getSupervisoryOrgValues"></a>
# **getSupervisoryOrgValues**
> MULTIPLEINSTANCEMODELREFERENCE getSupervisoryOrgValues().effectiveDate(effectiveDate).job(job).limit(limit).location(location).offset(offset).proposedManager(proposedManager).staffingEvent(staffingEvent).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String job = "job_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    String location = "location_example";
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    List<String> proposedManager = Arrays.asList();
    String staffingEvent = "staffingEvent_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getSupervisoryOrgValues()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getSupervisoryOrgValues");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getSupervisoryOrgValues()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getSupervisoryOrgValues");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **job** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **location** | **String**|  | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **proposedManager** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **staffingEvent** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getTimeTypes"></a>
# **getTimeTypes**
> MULTIPLEINSTANCEMODELREFERENCE getTimeTypes().effectiveDate(effectiveDate).job(job).limit(limit).location(location).offset(offset).proposedManager(proposedManager).staffingEvent(staffingEvent).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String job = "job_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    String location = "location_example";
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    List<String> proposedManager = Arrays.asList();
    String staffingEvent = "staffingEvent_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getTimeTypes()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getTimeTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getTimeTypes()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getTimeTypes");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **job** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **location** | **String**|  | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **proposedManager** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **staffingEvent** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getWorkerTypes"></a>
# **getWorkerTypes**
> MULTIPLEINSTANCEMODELREFERENCE getWorkerTypes().effectiveDate(effectiveDate).job(job).limit(limit).location(location).offset(offset).proposedManager(proposedManager).staffingEvent(staffingEvent).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String job = "job_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    String location = "location_example";
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    List<String> proposedManager = Arrays.asList();
    String staffingEvent = "staffingEvent_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getWorkerTypes()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getWorkerTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getWorkerTypes()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getWorkerTypes");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **job** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **location** | **String**|  | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **proposedManager** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **staffingEvent** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

<a name="getWorkspaceInstances"></a>
# **getWorkspaceInstances**
> MULTIPLEINSTANCEMODELREFERENCE getWorkspaceInstances().effectiveDate(effectiveDate).job(job).limit(limit).location(location).offset(offset).proposedManager(proposedManager).staffingEvent(staffingEvent).worker(worker).execute();



Retrieves instances that can be used as values for other endpoint parameters in this service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptValuesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    LocalDate effectiveDate = LocalDate.now();
    String job = "job_example";
    Long limit = 56L; // The maximum number of objects in a single response. The default and maximum is 1000.
    String location = "location_example";
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    List<String> proposedManager = Arrays.asList();
    String staffingEvent = "staffingEvent_example";
    String worker = "worker_example";
    try {
      MULTIPLEINSTANCEMODELREFERENCE result = client
              .promptValues
              .getWorkspaceInstances()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getWorkspaceInstances");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MULTIPLEINSTANCEMODELREFERENCE> response = client
              .promptValues
              .getWorkspaceInstances()
              .effectiveDate(effectiveDate)
              .job(job)
              .limit(limit)
              .location(location)
              .offset(offset)
              .proposedManager(proposedManager)
              .staffingEvent(staffingEvent)
              .worker(worker)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptValuesApi#getWorkspaceInstances");
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
| **effectiveDate** | **LocalDate**|  | [optional] |
| **job** | **String**|  | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default and maximum is 1000. | [optional] |
| **location** | **String**|  | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **proposedManager** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **staffingEvent** | **String**|  | [optional] |
| **worker** | **String**|  | [optional] |

### Return type

[**MULTIPLEINSTANCEMODELREFERENCE**](MULTIPLEINSTANCEMODELREFERENCE.md)

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

