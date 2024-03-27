# WorkersApi

All URIs are relative to *https://&lt;tenantHostname&gt;/staffing/v6*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCheckIn**](WorkersApi.md#createCheckIn) | **POST** /workers/{ID}/checkIns | Creates Check-Ins. |
| [**createCheckInTopic**](WorkersApi.md#createCheckInTopic) | **POST** /workers/{ID}/checkInTopics | Creates Check-In topics. |
| [**createExternalSkillLevels**](WorkersApi.md#createExternalSkillLevels) | **POST** /workers/{ID}/externalSkillLevel | Creates external skill levels. |
| [**createHomeContactChangeProcess**](WorkersApi.md#createHomeContactChangeProcess) | **POST** /workers/{ID}/homeContactInformationChanges |  |
| [**createSkillItem**](WorkersApi.md#createSkillItem) | **POST** /workers/{ID}/skillItems |  |
| [**createWorkContactInformationChanges**](WorkersApi.md#createWorkContactInformationChanges) | **POST** /workers/{ID}/workContactInformationChanges |  |
| [**deleteCheckIn**](WorkersApi.md#deleteCheckIn) | **DELETE** /workers/{ID}/checkIns/{subresourceID} | Deletes an existing Check-In instance. |
| [**deleteCheckInTopic**](WorkersApi.md#deleteCheckInTopic) | **DELETE** /workers/{ID}/checkInTopics/{subresourceID} | Deletes an existing Check-In topic instance. |
| [**getCheckIn**](WorkersApi.md#getCheckIn) | **GET** /workers/{ID}/checkIns/{subresourceID} | Retrieves a single Check-In instance. |
| [**getCheckInTopic**](WorkersApi.md#getCheckInTopic) | **GET** /workers/{ID}/checkInTopics/{subresourceID} | Retrieves a single Check-In topic instance. |
| [**getCheckInTopics**](WorkersApi.md#getCheckInTopics) | **GET** /workers/{ID}/checkInTopics | Retrieves a collection of Check-Ins topics. |
| [**getCheckIns**](WorkersApi.md#getCheckIns) | **GET** /workers/{ID}/checkIns | Retrieves a collection of Check-Ins. |
| [**getCollectionStaffing**](WorkersApi.md#getCollectionStaffing) | **GET** /workers | Retrieves a collection of workers and current staffing information. |
| [**getExplicitSkills**](WorkersApi.md#getExplicitSkills) | **GET** /workers/{ID}/explicitSkills | Get Explicit Skills for Skill Enabled |
| [**getExplicitSkillsForSkillEnabled**](WorkersApi.md#getExplicitSkillsForSkillEnabled) | **GET** /workers/{ID}/explicitSkills/{subresourceID} | Get Explicit Skills for Skill Enabled |
| [**getExternalSkillLevel**](WorkersApi.md#getExternalSkillLevel) | **GET** /workers/{ID}/externalSkillLevel | Retrieves all external skill level information for a worker. You can filter the external skill levels by externalSkillId. |
| [**getExternalSkillLevels**](WorkersApi.md#getExternalSkillLevels) | **GET** /workers/{ID}/externalSkillLevel/{subresourceID} | Retrieves all external skill level information for a worker. You can filter the external skill levels by externalSkillId. |
| [**getHomeContactChange**](WorkersApi.md#getHomeContactChange) | **GET** /workers/{ID}/homeContactInformationChanges/{subresourceID} | Retrieves an existing Home Contact Change event for the Person. |
| [**getServiceDate**](WorkersApi.md#getServiceDate) | **GET** /workers/{ID}/serviceDates/{subresourceID} | Retrieves a single service date information instance. |
| [**getServiceDates**](WorkersApi.md#getServiceDates) | **GET** /workers/{ID}/serviceDates | Retrieves a collection of service dates for the specified worker id. |
| [**getSkillItems**](WorkersApi.md#getSkillItems) | **GET** /workers/{ID}/skillItems |  |
| [**getSkillItemsById**](WorkersApi.md#getSkillItemsById) | **GET** /workers/{ID}/skillItems/{subresourceID} |  |
| [**getStaffingInformation**](WorkersApi.md#getStaffingInformation) | **GET** /workers/{ID} | Retrieves a collection of workers and current staffing information. |
| [**getWorkContactChange**](WorkersApi.md#getWorkContactChange) | **GET** /workers/{ID}/workContactInformationChanges/{subresourceID} | Retrieves an existing Work Contact Change event for the Person. |
| [**initiateJobChange**](WorkersApi.md#initiateJobChange) | **POST** /workers/{ID}/jobChanges | Initiates a job change request for a specific worker |
| [**initiateOrganizationAssignmentChange**](WorkersApi.md#initiateOrganizationAssignmentChange) | **POST** /workers/{ID}/organizationAssignmentChanges | Initiates an organization assignment change for a specific worker. |
| [**partiallyUpdateCheckIn**](WorkersApi.md#partiallyUpdateCheckIn) | **PATCH** /workers/{ID}/checkIns/{subresourceID}?type&#x3D;archive | Partially updates an existing Check-In to archived or un-archived. |
| [**partiallyUpdateCheckInTopic**](WorkersApi.md#partiallyUpdateCheckInTopic) | **PATCH** /workers/{ID}/checkInTopics/{subresourceID} | Partially updates an existing Check-In topic instance. |
| [**saveUserSkills**](WorkersApi.md#saveUserSkills) | **POST** /workers/{ID}/explicitSkills | Save skills a user has |
| [**updateCheckIn**](WorkersApi.md#updateCheckIn) | **PATCH** /workers/{ID}/checkIns/{subresourceID} | Partially updates an existing Check-In instance. |
| [**updateCheckInTopicState**](WorkersApi.md#updateCheckInTopicState) | **PATCH** /workers/{ID}/checkInTopics/{subresourceID}?type&#x3D;archive | Partially updates an existing Check-In topic to archived or un-archived. |
| [**updateExternalSkillLevel**](WorkersApi.md#updateExternalSkillLevel) | **PUT** /workers/{ID}/externalSkillLevel/{subresourceID} | Updates external skill levels. |


<a name="createCheckIn"></a>
# **createCheckIn**
> CheckInDetail316b5a26cc3c10000ebdb0cb484602e1 createCheckIn(ID, checkInDetail316b5a26cc3c10000ebdb0cb484602e1).execute();

Creates Check-Ins.

Creates a single Check-In instance with the specified data with the specified worker. The worker is specified by the Workday ID of the worker.  You can use a returned id from GET /workers in the Staffing service /staffing.  In the request body, specify at least the required field: date.    This endpoint is equivalent to the Create Check-In task in Workday.  Secured by: Worker Data: Check-Ins REST API  Scope: Performance Enablement  Contains attachment(s)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String description = "description_example"; // Description of check-in.
    List<AssociatedCheckInTopicDetail316b5a26cc3c100010a01184c23902ea> associatedTopics = Arrays.asList(); // Topics included in a check-in.
    LocalDate date = LocalDate.now(); // Date of check-in.
    List<CheckInAttachmentDetailEf244acfe6cf10002ebe92d43a7701d7> checkInAttachments = Arrays.asList(); // Returns all attachments for the Check-In.
    String id = "id_example"; // Id of the instance
    try {
      CheckInDetail316b5a26cc3c10000ebdb0cb484602e1 result = client
              .workers
              .createCheckIn(ID)
              .description(description)
              .associatedTopics(associatedTopics)
              .date(date)
              .checkInAttachments(checkInAttachments)
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAssociatedTopics());
      System.out.println(result.getDate());
      System.out.println(result.getCheckInAttachments());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#createCheckIn");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CheckInDetail316b5a26cc3c10000ebdb0cb484602e1> response = client
              .workers
              .createCheckIn(ID)
              .description(description)
              .associatedTopics(associatedTopics)
              .date(date)
              .checkInAttachments(checkInAttachments)
              .id(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#createCheckIn");
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
| **checkInDetail316b5a26cc3c10000ebdb0cb484602e1** | [**CheckInDetail316b5a26cc3c10000ebdb0cb484602e1**](CheckInDetail316b5a26cc3c10000ebdb0cb484602e1.md)|  | |

### Return type

[**CheckInDetail316b5a26cc3c10000ebdb0cb484602e1**](CheckInDetail316b5a26cc3c10000ebdb0cb484602e1.md)

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

<a name="createCheckInTopic"></a>
# **createCheckInTopic**
> CheckInTopicDetail3267c0ba92a010001688d79b032b03b8 createCheckInTopic(ID, checkInTopicDetail3267c0ba92a010001688d79b032b03b8).execute();

Creates Check-In topics.

Creates a single Check-In topic instance with the specified data with the specified worker. The worker is specified by the Workday ID of the worker.  You can use a returned id from GET /workers in the Staffing service /staffing.  In the request body, specify at least these required fields: name.   This endpoint is equivalent to the Create Check-In Topic task in Workday.  Secured by: Worker Data: Check-Ins REST API  Scope: Performance Enablement  Contains attachment(s)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String sharedNotes = "sharedNotes_example"; // Shared notes of the topic.
    List<AssociatedCheckInDetail3267c0ba92a0100016ed105476ad03c4> associatedCheckIns = Arrays.asList(); // Check-ins associated to topic.
    String privateNotes = "privateNotes_example"; // Personal notes of the topic.
    String name = "name_example"; // Topic name.
    List<CheckInTopicAttachmentDetail600ecde4c8421000278d06bfacea01c1> checkInTopicAttachments = Arrays.asList(); // Returns all attachments for the Check-In Topic.
    String id = "id_example"; // Id of the instance
    try {
      CheckInTopicDetail3267c0ba92a010001688d79b032b03b8 result = client
              .workers
              .createCheckInTopic(ID)
              .sharedNotes(sharedNotes)
              .associatedCheckIns(associatedCheckIns)
              .privateNotes(privateNotes)
              .name(name)
              .checkInTopicAttachments(checkInTopicAttachments)
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getSharedNotes());
      System.out.println(result.getAssociatedCheckIns());
      System.out.println(result.getPrivateNotes());
      System.out.println(result.getName());
      System.out.println(result.getCheckInTopicAttachments());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#createCheckInTopic");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CheckInTopicDetail3267c0ba92a010001688d79b032b03b8> response = client
              .workers
              .createCheckInTopic(ID)
              .sharedNotes(sharedNotes)
              .associatedCheckIns(associatedCheckIns)
              .privateNotes(privateNotes)
              .name(name)
              .checkInTopicAttachments(checkInTopicAttachments)
              .id(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#createCheckInTopic");
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
| **checkInTopicDetail3267c0ba92a010001688d79b032b03b8** | [**CheckInTopicDetail3267c0ba92a010001688d79b032b03b8**](CheckInTopicDetail3267c0ba92a010001688d79b032b03b8.md)|  | |

### Return type

[**CheckInTopicDetail3267c0ba92a010001688d79b032b03b8**](CheckInTopicDetail3267c0ba92a010001688d79b032b03b8.md)

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

<a name="createExternalSkillLevels"></a>
# **createExternalSkillLevels**
> ExternalSkillLevelA39462f09c44100005d46fd77ef00000 createExternalSkillLevels(ID, externalSkillLevelA39462f09c44100005d46fd77ef00000).execute();

Creates external skill levels.

Creates external skill levels.  Secured by: Self-Service: External Skill Source, Worker Data: External Skill Source  Scope: Worker Profile and Skills

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    Integer externalSkillLevel = 56; // The skill level normalized to a scale from 1-5 and to 1 decimal place.
    String externalSkillId = "externalSkillId_example"; // The skill from the external system.
    LocalDate effectiveMoment = LocalDate.now(); // The date that the external Skill Level was last updated.
    String context = "context_example"; // The text you enter to provide context for this external skill load. Not visible to end users.
    String id = "id_example"; // Id of the instance
    try {
      ExternalSkillLevelA39462f09c44100005d46fd77ef00000 result = client
              .workers
              .createExternalSkillLevels(ID)
              .externalSkillLevel(externalSkillLevel)
              .externalSkillId(externalSkillId)
              .effectiveMoment(effectiveMoment)
              .context(context)
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getExternalSkillLevel());
      System.out.println(result.getExternalSkillId());
      System.out.println(result.getEffectiveMoment());
      System.out.println(result.getContext());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#createExternalSkillLevels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExternalSkillLevelA39462f09c44100005d46fd77ef00000> response = client
              .workers
              .createExternalSkillLevels(ID)
              .externalSkillLevel(externalSkillLevel)
              .externalSkillId(externalSkillId)
              .effectiveMoment(effectiveMoment)
              .context(context)
              .id(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#createExternalSkillLevels");
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
| **externalSkillLevelA39462f09c44100005d46fd77ef00000** | [**ExternalSkillLevelA39462f09c44100005d46fd77ef00000**](ExternalSkillLevelA39462f09c44100005d46fd77ef00000.md)|  | |

### Return type

[**ExternalSkillLevelA39462f09c44100005d46fd77ef00000**](ExternalSkillLevelA39462f09c44100005d46fd77ef00000.md)

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

<a name="createHomeContactChangeProcess"></a>
# **createHomeContactChangeProcess**
> HomeContactChangeEventF42ba27d87ed10001aa58a5d231b1621 createHomeContactChangeProcess(ID, homeContactChangeEventF42ba27d87ed10001aa58a5d231b1621).execute();



Creates a new Home Contact Change business process event for the parent Person.  Secured by: Change Home Contact Information (REST Service)  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String href = "href_example"; // The URL to the related change home contact information resource where this event can be interacted with via REST
    LocalDate effectiveDate = LocalDate.now(); // The date this business process takes effect.
    String id = "id_example"; // Id of the instance
    String descriptor = "descriptor_example"; // A preview of the instance
    try {
      HomeContactChangeEventF42ba27d87ed10001aa58a5d231b1621 result = client
              .workers
              .createHomeContactChangeProcess(ID)
              .href(href)
              .effectiveDate(effectiveDate)
              .id(id)
              .descriptor(descriptor)
              .execute();
      System.out.println(result);
      System.out.println(result.getHref());
      System.out.println(result.getEffectiveDate());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#createHomeContactChangeProcess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HomeContactChangeEventF42ba27d87ed10001aa58a5d231b1621> response = client
              .workers
              .createHomeContactChangeProcess(ID)
              .href(href)
              .effectiveDate(effectiveDate)
              .id(id)
              .descriptor(descriptor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#createHomeContactChangeProcess");
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
| **homeContactChangeEventF42ba27d87ed10001aa58a5d231b1621** | [**HomeContactChangeEventF42ba27d87ed10001aa58a5d231b1621**](HomeContactChangeEventF42ba27d87ed10001aa58a5d231b1621.md)|  | |

### Return type

[**HomeContactChangeEventF42ba27d87ed10001aa58a5d231b1621**](HomeContactChangeEventF42ba27d87ed10001aa58a5d231b1621.md)

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

<a name="createSkillItem"></a>
# **createSkillItem**
> SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12de createSkillItem(ID, skillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12de).execute();



Secured by: Person Data: Skills, Self-Service: Skills  Scope: Worker Profile and Skills

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    List<SkillItemAddDefinitionFaed9891d75a10001e9a289910540228> skillItems = Arrays.asList(); // Exposes Skill Items for a Skill Qualification Enabled.
    try {
      SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12de result = client
              .workers
              .createSkillItem(ID)
              .skillItems(skillItems)
              .execute();
      System.out.println(result);
      System.out.println(result.getSkillItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#createSkillItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12de> response = client
              .workers
              .createSkillItem(ID)
              .skillItems(skillItems)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#createSkillItem");
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
| **skillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12de** | [**SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12de**](SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12de.md)|  | |

### Return type

[**SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12de**](SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12de.md)

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

<a name="createWorkContactInformationChanges"></a>
# **createWorkContactInformationChanges**
> WorkContactChangeEvent5fca6c96c1c81000142fd03784140113 createWorkContactInformationChanges(ID, workContactChangeEvent5fca6c96c1c81000142fd03784140113).execute();



Creates a new Home Contact Change business process event for the parent Person.  Secured by: Change Work Contact Information (REST Service)  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    LocalDate effectiveDate = LocalDate.now(); // The date this business process takes effect.
    String href = "href_example"; // The URL to the related change work contact information resource where this event can be interacted with via REST.
    String id = "id_example"; // Id of the instance
    String descriptor = "descriptor_example"; // A preview of the instance
    try {
      WorkContactChangeEvent5fca6c96c1c81000142fd03784140113 result = client
              .workers
              .createWorkContactInformationChanges(ID)
              .effectiveDate(effectiveDate)
              .href(href)
              .id(id)
              .descriptor(descriptor)
              .execute();
      System.out.println(result);
      System.out.println(result.getEffectiveDate());
      System.out.println(result.getHref());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#createWorkContactInformationChanges");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkContactChangeEvent5fca6c96c1c81000142fd03784140113> response = client
              .workers
              .createWorkContactInformationChanges(ID)
              .effectiveDate(effectiveDate)
              .href(href)
              .id(id)
              .descriptor(descriptor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#createWorkContactInformationChanges");
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
| **workContactChangeEvent5fca6c96c1c81000142fd03784140113** | [**WorkContactChangeEvent5fca6c96c1c81000142fd03784140113**](WorkContactChangeEvent5fca6c96c1c81000142fd03784140113.md)|  | |

### Return type

[**WorkContactChangeEvent5fca6c96c1c81000142fd03784140113**](WorkContactChangeEvent5fca6c96c1c81000142fd03784140113.md)

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

<a name="deleteCheckIn"></a>
# **deleteCheckIn**
> deleteCheckIn(ID, subresourceID).execute();

Deletes an existing Check-In instance.

Deletes an existing Check-In instance with the specified ID. This can only be done by the creater of the Check-In.    This endpoint is equivalent to the Delete Check-In task in Workday.  Secured by: Self-Service: Check-Ins  Scope: Performance Enablement

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
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
      client
              .workers
              .deleteCheckIn(ID, subresourceID)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#deleteCheckIn");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .workers
              .deleteCheckIn(ID, subresourceID)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#deleteCheckIn");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. Deleting resource. |  -  |
| **0** | An error occurred. |  -  |

<a name="deleteCheckInTopic"></a>
# **deleteCheckInTopic**
> deleteCheckInTopic(ID, subresourceID).execute();

Deletes an existing Check-In topic instance.

Deletes an existing Check-In topic instance with the specified ID. This can only be done by the creater of the Check-In topic.   This endpoint is equivalent to the Delete Check-In Topic task in Workday.  Secured by: Self-Service: Check-Ins  Scope: Performance Enablement

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
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
      client
              .workers
              .deleteCheckInTopic(ID, subresourceID)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#deleteCheckInTopic");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .workers
              .deleteCheckInTopic(ID, subresourceID)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#deleteCheckInTopic");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. Deleting resource. |  -  |
| **0** | An error occurred. |  -  |

<a name="getCheckIn"></a>
# **getCheckIn**
> CheckInsSummaryB3a69f47a499100010ce6be72bfe001d getCheckIn(ID, subresourceID).execute();

Retrieves a single Check-In instance.

Retrieves a Check-In with the specified ID for the specified worker. The worker is specified by the Workday ID of the worker.  You can use a returned id from GET /workers in the Staffing service /staffing.  Secured by: Self-Service: Check-Ins, Worker Data: Check-Ins  Scope: Performance Enablement  Contains attachment(s)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
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
      CheckInsSummaryB3a69f47a499100010ce6be72bfe001d result = client
              .workers
              .getCheckIn(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAssociatedTopics());
      System.out.println(result.getCreator());
      System.out.println(result.getArchived());
      System.out.println(result.getCheckInAttachments());
      System.out.println(result.getParticipant());
      System.out.println(result.getDate());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getCheckIn");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CheckInsSummaryB3a69f47a499100010ce6be72bfe001d> response = client
              .workers
              .getCheckIn(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getCheckIn");
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

[**CheckInsSummaryB3a69f47a499100010ce6be72bfe001d**](CheckInsSummaryB3a69f47a499100010ce6be72bfe001d.md)

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

<a name="getCheckInTopic"></a>
# **getCheckInTopic**
> CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015 getCheckInTopic(ID, subresourceID).execute();

Retrieves a single Check-In topic instance.

Retrieves a Check-In topic with the specified ID for the specified worker. The worker is specified by the Workday ID of the worker.  You can use a returned id from GET /workers in the Staffing service /staffing.  Secured by: Self-Service: Check-Ins, Worker Data: Check-Ins  Scope: Performance Enablement  Contains attachment(s)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
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
      CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015 result = client
              .workers
              .getCheckInTopic(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getSharedNotes());
      System.out.println(result.getPrivateNotes());
      System.out.println(result.getArchived());
      System.out.println(result.getName());
      System.out.println(result.getCheckInTopicAttachments());
      System.out.println(result.getParticipant());
      System.out.println(result.getAssociatedCheckIns());
      System.out.println(result.getCreator());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getCheckInTopic");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015> response = client
              .workers
              .getCheckInTopic(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getCheckInTopic");
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

[**CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015**](CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015.md)

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

<a name="getCheckInTopics"></a>
# **getCheckInTopics**
> WorkersGetCheckInTopicsResponse getCheckInTopics(ID).limit(limit).offset(offset).execute();

Retrieves a collection of Check-Ins topics.

Retrieves all Check-In topics for the specified worker. The worker is specified by the Workday ID of the worker.  You can use a returned id from GET /workers in the Staffing service /staffing.  Secured by: Self-Service: Check-Ins, Worker Data: Check-Ins  Scope: Performance Enablement  Contains attachment(s)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
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
      WorkersGetCheckInTopicsResponse result = client
              .workers
              .getCheckInTopics(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getCheckInTopics");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkersGetCheckInTopicsResponse> response = client
              .workers
              .getCheckInTopics(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getCheckInTopics");
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

[**WorkersGetCheckInTopicsResponse**](WorkersGetCheckInTopicsResponse.md)

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

<a name="getCheckIns"></a>
# **getCheckIns**
> WorkersGetCheckInsResponse getCheckIns(ID).limit(limit).offset(offset).execute();

Retrieves a collection of Check-Ins.

Retrieves all Check-Ins for the specified worker. The worker is specified by the Workday ID of the worker.  You can use a returned id from GET /workers in the Staffing service /staffing.   This endpoint is equivalent to the View Check-Ins task in Workday.  Secured by: Self-Service: Check-Ins, Worker Data: Check-Ins  Scope: Performance Enablement  Contains attachment(s)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
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
      WorkersGetCheckInsResponse result = client
              .workers
              .getCheckIns(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getCheckIns");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkersGetCheckInsResponse> response = client
              .workers
              .getCheckIns(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getCheckIns");
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

[**WorkersGetCheckInsResponse**](WorkersGetCheckInsResponse.md)

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

<a name="getCollectionStaffing"></a>
# **getCollectionStaffing**
> WorkersGetCollectionStaffingResponse getCollectionStaffing().includeTerminatedWorkers(includeTerminatedWorkers).limit(limit).offset(offset).search(search).execute();

Retrieves a collection of workers and current staffing information.

Retrieves a collection of workers and current staffing information.  Secured by: Self-Service: Current Staffing Information, Worker Data: Public Worker Reports  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    Boolean includeTerminatedWorkers = true; // Include terminated workers in the output
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    String search = "search_example"; // Searches workers by name or worker ID. The search is case-insensitive. You can include space-delimited search strings for an OR search.
    try {
      WorkersGetCollectionStaffingResponse result = client
              .workers
              .getCollectionStaffing()
              .includeTerminatedWorkers(includeTerminatedWorkers)
              .limit(limit)
              .offset(offset)
              .search(search)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getCollectionStaffing");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkersGetCollectionStaffingResponse> response = client
              .workers
              .getCollectionStaffing()
              .includeTerminatedWorkers(includeTerminatedWorkers)
              .limit(limit)
              .offset(offset)
              .search(search)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getCollectionStaffing");
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
| **includeTerminatedWorkers** | **Boolean**| Include terminated workers in the output | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |
| **search** | **String**| Searches workers by name or worker ID. The search is case-insensitive. You can include space-delimited search strings for an OR search. | [optional] |

### Return type

[**WorkersGetCollectionStaffingResponse**](WorkersGetCollectionStaffingResponse.md)

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

<a name="getExplicitSkills"></a>
# **getExplicitSkills**
> WorkersGetExplicitSkillsResponse getExplicitSkills(ID).limit(limit).offset(offset).skill(skill).skillSource(skillSource).execute();

Get Explicit Skills for Skill Enabled

Get Explicit Skills for Skill Enabled  Secured by: Person Data: Skills, Self-Service: Skills  Scope: Worker Profile and Skills

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
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
    String skill = "skill_example"; // Retrieves the skills for the specified skill name.
    String skillSource = "skillSource_example"; // The Workday ID of the skill source. Returns skills associated with the skill source.
    try {
      WorkersGetExplicitSkillsResponse result = client
              .workers
              .getExplicitSkills(ID)
              .limit(limit)
              .offset(offset)
              .skill(skill)
              .skillSource(skillSource)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getExplicitSkills");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkersGetExplicitSkillsResponse> response = client
              .workers
              .getExplicitSkills(ID)
              .limit(limit)
              .offset(offset)
              .skill(skill)
              .skillSource(skillSource)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getExplicitSkills");
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
| **skill** | **String**| Retrieves the skills for the specified skill name. | [optional] |
| **skillSource** | **String**| The Workday ID of the skill source. Returns skills associated with the skill source. | [optional] |

### Return type

[**WorkersGetExplicitSkillsResponse**](WorkersGetExplicitSkillsResponse.md)

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

<a name="getExplicitSkillsForSkillEnabled"></a>
# **getExplicitSkillsForSkillEnabled**
> DisplayExplicitSkillRepresentationD6ca778018011000182fa5be1ae901a8 getExplicitSkillsForSkillEnabled(ID, subresourceID).execute();

Get Explicit Skills for Skill Enabled

Get Explicit Skills for Skill Enabled  Secured by: Person Data: Skills, Self-Service: Skills  Scope: Worker Profile and Skills

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
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
      DisplayExplicitSkillRepresentationD6ca778018011000182fa5be1ae901a8 result = client
              .workers
              .getExplicitSkillsForSkillEnabled(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getRemoteID());
      System.out.println(result.getSkillSources());
      System.out.println(result.getSkillItem());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getExplicitSkillsForSkillEnabled");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DisplayExplicitSkillRepresentationD6ca778018011000182fa5be1ae901a8> response = client
              .workers
              .getExplicitSkillsForSkillEnabled(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getExplicitSkillsForSkillEnabled");
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

[**DisplayExplicitSkillRepresentationD6ca778018011000182fa5be1ae901a8**](DisplayExplicitSkillRepresentationD6ca778018011000182fa5be1ae901a8.md)

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

<a name="getExternalSkillLevel"></a>
# **getExternalSkillLevel**
> WorkersGetExternalSkillLevelResponse getExternalSkillLevel(ID).externalSkillId(externalSkillId).limit(limit).offset(offset).execute();

Retrieves all external skill level information for a worker. You can filter the external skill levels by externalSkillId.

Retrieves all external skill level information for a worker. You can filter the external skill levels by externalSkillId.  Secured by: Self-Service: External Skill Source, Worker Data: External Skill Source  Scope: Worker Profile and Skills

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    String externalSkillId = "externalSkillId_example"; // All External Skills. If passed, the External Skill Level associated with the External Skill ID.
    Long limit = 56L; // The maximum number of objects in a single response. The default is 20. The maximum is 100.
    Long offset = 56L; // The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object.
    try {
      WorkersGetExternalSkillLevelResponse result = client
              .workers
              .getExternalSkillLevel(ID)
              .externalSkillId(externalSkillId)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getExternalSkillLevel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkersGetExternalSkillLevelResponse> response = client
              .workers
              .getExternalSkillLevel(ID)
              .externalSkillId(externalSkillId)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getExternalSkillLevel");
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
| **externalSkillId** | **String**| All External Skills. If passed, the External Skill Level associated with the External Skill ID. | [optional] |
| **limit** | **Long**| The maximum number of objects in a single response. The default is 20. The maximum is 100. | [optional] |
| **offset** | **Long**| The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. | [optional] |

### Return type

[**WorkersGetExternalSkillLevelResponse**](WorkersGetExternalSkillLevelResponse.md)

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

<a name="getExternalSkillLevels"></a>
# **getExternalSkillLevels**
> ExternalSkillLevelDetail1c67ac98c0f310002706be33dcdb0000 getExternalSkillLevels(ID, subresourceID).execute();

Retrieves all external skill level information for a worker. You can filter the external skill levels by externalSkillId.

Retrieves all external skill level information for a worker. You can filter the external skill levels by externalSkillId.  Secured by: Self-Service: External Skill Source, Worker Data: External Skill Source  Scope: Worker Profile and Skills

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
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
      ExternalSkillLevelDetail1c67ac98c0f310002706be33dcdb0000 result = client
              .workers
              .getExternalSkillLevels(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getExternalSkillName());
      System.out.println(result.getExternalSkillLevel());
      System.out.println(result.getSkillVendorName());
      System.out.println(result.getSkillVendorId());
      System.out.println(result.getContext());
      System.out.println(result.getEffectiveMoment());
      System.out.println(result.getExternalSkillId());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getExternalSkillLevels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExternalSkillLevelDetail1c67ac98c0f310002706be33dcdb0000> response = client
              .workers
              .getExternalSkillLevels(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getExternalSkillLevels");
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

[**ExternalSkillLevelDetail1c67ac98c0f310002706be33dcdb0000**](ExternalSkillLevelDetail1c67ac98c0f310002706be33dcdb0000.md)

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

<a name="getHomeContactChange"></a>
# **getHomeContactChange**
> HomeContactChangeEventF42ba27d87ed10001aa58a5d231b1621 getHomeContactChange(ID, subresourceID).execute();

Retrieves an existing Home Contact Change event for the Person.

Retrieves an existing Home Contact Change event for the Person.  Secured by: Change Home Contact Information (REST Service)  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
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
      HomeContactChangeEventF42ba27d87ed10001aa58a5d231b1621 result = client
              .workers
              .getHomeContactChange(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getHref());
      System.out.println(result.getEffectiveDate());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getHomeContactChange");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HomeContactChangeEventF42ba27d87ed10001aa58a5d231b1621> response = client
              .workers
              .getHomeContactChange(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getHomeContactChange");
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

[**HomeContactChangeEventF42ba27d87ed10001aa58a5d231b1621**](HomeContactChangeEventF42ba27d87ed10001aa58a5d231b1621.md)

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

<a name="getServiceDate"></a>
# **getServiceDate**
> ServiceDatesData6b1db753fd82100027b0c8519c860018 getServiceDate(ID, subresourceID).execute();

Retrieves a single service date information instance.

Retrieves information about a service date for the specified worker id.  Secured by: Self-Service: Service Dates, Worker Data: Service Dates  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
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
      ServiceDatesData6b1db753fd82100027b0c8519c860018 result = client
              .workers
              .getServiceDate(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getHireDate());
      System.out.println(result.getContinuousServiceDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getServiceDate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ServiceDatesData6b1db753fd82100027b0c8519c860018> response = client
              .workers
              .getServiceDate(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getServiceDate");
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

[**ServiceDatesData6b1db753fd82100027b0c8519c860018**](ServiceDatesData6b1db753fd82100027b0c8519c860018.md)

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

<a name="getServiceDates"></a>
# **getServiceDates**
> WorkersGetServiceDatesResponse getServiceDates(ID).limit(limit).offset(offset).execute();

Retrieves a collection of service dates for the specified worker id.

Retrieves all service dates for the specified worker id.  Secured by: Self-Service: Service Dates, Worker Data: Service Dates  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
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
      WorkersGetServiceDatesResponse result = client
              .workers
              .getServiceDates(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getServiceDates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkersGetServiceDatesResponse> response = client
              .workers
              .getServiceDates(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getServiceDates");
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

[**WorkersGetServiceDatesResponse**](WorkersGetServiceDatesResponse.md)

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

<a name="getSkillItems"></a>
# **getSkillItems**
> WorkersGetSkillItemsResponse getSkillItems(ID).limit(limit).offset(offset).execute();



Secured by: Person Data: Skills, Self-Service: Skills  Scope: Worker Profile and Skills

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
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
      WorkersGetSkillItemsResponse result = client
              .workers
              .getSkillItems(ID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getSkillItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkersGetSkillItemsResponse> response = client
              .workers
              .getSkillItems(ID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getSkillItems");
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

[**WorkersGetSkillItemsResponse**](WorkersGetSkillItemsResponse.md)

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

<a name="getSkillItemsById"></a>
# **getSkillItemsById**
> SkillItemDisplayDefinition4b4b7d34b4a21000301eaf52086700d8 getSkillItemsById(ID, subresourceID).execute();



Secured by: Person Data: Skills, Self-Service: Skills  Scope: Worker Profile and Skills

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
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
      SkillItemDisplayDefinition4b4b7d34b4a21000301eaf52086700d8 result = client
              .workers
              .getSkillItemsById(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getSkillName());
      System.out.println(result.getRemoteID());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getSkillItemsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SkillItemDisplayDefinition4b4b7d34b4a21000301eaf52086700d8> response = client
              .workers
              .getSkillItemsById(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getSkillItemsById");
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

[**SkillItemDisplayDefinition4b4b7d34b4a21000301eaf52086700d8**](SkillItemDisplayDefinition4b4b7d34b4a21000301eaf52086700d8.md)

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

<a name="getStaffingInformation"></a>
# **getStaffingInformation**
> WorkerDataC2466b0778c610000d1936006720000e getStaffingInformation(ID).execute();

Retrieves a collection of workers and current staffing information.

Retrieves a collection of workers and current staffing information.  Secured by: Self-Service: Current Staffing Information, Worker Data: Public Worker Reports  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
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
      WorkerDataC2466b0778c610000d1936006720000e result = client
              .workers
              .getStaffingInformation(ID)
              .execute();
      System.out.println(result);
      System.out.println(result.getPrimaryJob());
      System.out.println(result.getPerson());
      System.out.println(result.getWorkerId());
      System.out.println(result.getWorkerType());
      System.out.println(result.getAdditionalJobs());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getStaffingInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkerDataC2466b0778c610000d1936006720000e> response = client
              .workers
              .getStaffingInformation(ID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getStaffingInformation");
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

[**WorkerDataC2466b0778c610000d1936006720000e**](WorkerDataC2466b0778c610000d1936006720000e.md)

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

<a name="getWorkContactChange"></a>
# **getWorkContactChange**
> WorkContactChangeEvent5fca6c96c1c81000142fd03784140113 getWorkContactChange(ID, subresourceID).execute();

Retrieves an existing Work Contact Change event for the Person.

Retrieves an existing Work Contact Change event for the Person.  Secured by: Change Work Contact Information (REST Service)  Scope: Contact Information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
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
      WorkContactChangeEvent5fca6c96c1c81000142fd03784140113 result = client
              .workers
              .getWorkContactChange(ID, subresourceID)
              .execute();
      System.out.println(result);
      System.out.println(result.getEffectiveDate());
      System.out.println(result.getHref());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getWorkContactChange");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkContactChangeEvent5fca6c96c1c81000142fd03784140113> response = client
              .workers
              .getWorkContactChange(ID, subresourceID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getWorkContactChange");
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

[**WorkContactChangeEvent5fca6c96c1c81000142fd03784140113**](WorkContactChangeEvent5fca6c96c1c81000142fd03784140113.md)

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

<a name="initiateJobChange"></a>
# **initiateJobChange**
> JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111 initiateJobChange(ID, jobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111).execute();

Initiates a job change request for a specific worker

Initiates a job change request for a specific worker Call this method to start a new job change event, which returns a new job change ID. Use the new ID to reference the job change event in subsequent methods that update or get information about the same event.  The same Workday UI validations apply with this POST method.  The updates in this POST method do not persist until you call POST /jobChanges/{ID}/submit.  In the request body, specify at least this required field: date, worker {id}, job {id}, reason {id}  To retrieve a worker ID, call the GET /values/jobChangesGroup/workers prompt endpoint with the effectiveDate query parameter. It returns HREF links to workers by category. You can filter the results by effectiveDate. By default, it returns workers on the current date. Only workers without blocking events or available for change job for the current user are returned.  To retrieve a job ID, call the GET /values/jobChangesGroup/jobs prompt endpoint with the worker query parameter.  It returns all positions for the worker with current user access to do a job change. You can filter the results by effectiveDate. By default, it returns positions on the current date.   To retrieve a reason ID, call the GET /values/jobChangesGroup/reason prompt endpoint, which takes the job change ID as the staffingEvent query parameter. If you specify the staffingEvent parameter, it returns change job reasons for the staffingEvent, by the change job category. By default, it returns all change job categories and reasons.  To retrieve a supervisoryOrganization ID, call the GET /values/jobChangesGroup/supervisoryOrganization prompt endpoint, with proposedManager and effectiveDate query parameters. If you specify the proposedManager parameter, it returns HREF links to all supervisory organizations for that manager. If you specify effectiveDate, it filters the results by effective date. The default is the current date.  To retrieve a location ID, call the GET /values/jobChangesGroup/locations prompt endpoint, which takes the staffingEvent query parameter.  It returns HREF links to locations by location categories for the specified location. You can filter the results by effectiveDate. By default, it returns locations on the current date.  Secured by: Change Job (REST Service)  Scope: Staffing

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    SupervisoryOrganization75e528a78e9a10000ab75132a9df0116 supervisoryOrganization = new SupervisoryOrganization75e528a78e9a10000ab75132a9df0116();
    Location75e528a78e9a10000ab75125ebe50114 location = new Location75e528a78e9a10000ab75125ebe50114();
    Template2b1b95dfe4af100007f63081aec5158e template = new Template2b1b95dfe4af100007f63081aec5158e();
    Reason85deac43cd1a10000b96c80c118f171e reason = new Reason85deac43cd1a10000b96c80c118f171e();
    LocalDate date = LocalDate.now(); // The date this business process takes effect.
    Job75e528a78e9a10000ab7512c5c550115 job = new Job75e528a78e9a10000ab7512c5c550115();
    String id = "id_example"; // Id of the instance
    String descriptor = "descriptor_example"; // A preview of the instance
    try {
      JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111 result = client
              .workers
              .initiateJobChange(ID)
              .supervisoryOrganization(supervisoryOrganization)
              .location(location)
              .template(template)
              .reason(reason)
              .date(date)
              .job(job)
              .id(id)
              .descriptor(descriptor)
              .execute();
      System.out.println(result);
      System.out.println(result.getSupervisoryOrganization());
      System.out.println(result.getLocation());
      System.out.println(result.getTemplate());
      System.out.println(result.getReason());
      System.out.println(result.getDate());
      System.out.println(result.getJob());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#initiateJobChange");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111> response = client
              .workers
              .initiateJobChange(ID)
              .supervisoryOrganization(supervisoryOrganization)
              .location(location)
              .template(template)
              .reason(reason)
              .date(date)
              .job(job)
              .id(id)
              .descriptor(descriptor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#initiateJobChange");
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
| **jobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111** | [**JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111**](JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111.md)|  | |

### Return type

[**JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111**](JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111.md)

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

<a name="initiateOrganizationAssignmentChange"></a>
# **initiateOrganizationAssignmentChange**
> OrganizationAssignmentChangesPostCc45d62b623c1000132ac812c30a052e initiateOrganizationAssignmentChange(ID, organizationAssignmentChangesPostCc45d62b623c1000132ac812c30a052e).execute();

Initiates an organization assignment change for a specific worker.

Initiates an organization assignment change for a specific worker. Call this method to start a new change organization assignment event, which returns a new change organization assignment ID. Use the new ID to reference the change organization assignment event in subsequent methods that update or get information about the same event.  The same Workday UI validations apply with this POST method.  The updates in this POST method do not persist until you call POST /organizationAssignmentChanges/{ID}/submit.  In the request body, specify at least this required field: date, worker {id}, job {id}  To retrieve a worker ID, call the GET /values/organizationAssignmentChangesGroup/workers prompt endpoint with the effectiveDate query parameter. It returns HREF links to workers by category. You can filter the results by effectiveDate. By default, it returns workers on the current date. Only workers without blocking events or available for organization assignment change for the current user are returned.  To retrieve a job ID, call the /values/organizationAssignmentChangesGroup/jobs prompt endpoint with the worker query parameter.  It returns all positions for the worker with current user access to do an organization assignment change . You can filter the results by effectiveDate. By default, it returns positions on the current date.  Secured by: Change Organization Assignment (REST)  Scope: Organizations and Roles

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    Position99f6257185e61000043aadd66df203bb position = new Position99f6257185e61000043aadd66df203bb();
    LocalDate date = LocalDate.now(); // The date this business process takes effect.
    String id = "id_example"; // Id of the instance
    String descriptor = "descriptor_example"; // A preview of the instance
    try {
      OrganizationAssignmentChangesPostCc45d62b623c1000132ac812c30a052e result = client
              .workers
              .initiateOrganizationAssignmentChange(ID)
              .position(position)
              .date(date)
              .id(id)
              .descriptor(descriptor)
              .execute();
      System.out.println(result);
      System.out.println(result.getPosition());
      System.out.println(result.getDate());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#initiateOrganizationAssignmentChange");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationAssignmentChangesPostCc45d62b623c1000132ac812c30a052e> response = client
              .workers
              .initiateOrganizationAssignmentChange(ID)
              .position(position)
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
      System.err.println("Exception when calling WorkersApi#initiateOrganizationAssignmentChange");
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
| **organizationAssignmentChangesPostCc45d62b623c1000132ac812c30a052e** | [**OrganizationAssignmentChangesPostCc45d62b623c1000132ac812c30a052e**](OrganizationAssignmentChangesPostCc45d62b623c1000132ac812c30a052e.md)|  | |

### Return type

[**OrganizationAssignmentChangesPostCc45d62b623c1000132ac812c30a052e**](OrganizationAssignmentChangesPostCc45d62b623c1000132ac812c30a052e.md)

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

<a name="partiallyUpdateCheckIn"></a>
# **partiallyUpdateCheckIn**
> CheckInArchiveDetail1163fe23102e10001df342088f8a018e partiallyUpdateCheckIn(ID, subresourceID, checkInArchiveDetail1163fe23102e10001df342088f8a018e).execute();

Partially updates an existing Check-In to archived or un-archived.

Partially updates an existing Check-In instance with the specified ID and the specified data in the request body (archive). This can only be done by the creator or participant of the Check-In.   This endpoint is equivalent to the Archive Check-Ins task in Workday.  Secured by: Self-Service: Check-Ins, Worker Data: Check-Ins  Scope: Performance Enablement

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
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
    Boolean archive = true; // Indicates that the check-in is archived.
    String id = "id_example"; // Id of the instance
    String descriptor = "descriptor_example"; // A preview of the instance
    try {
      CheckInArchiveDetail1163fe23102e10001df342088f8a018e result = client
              .workers
              .partiallyUpdateCheckIn(ID, subresourceID)
              .archive(archive)
              .id(id)
              .descriptor(descriptor)
              .execute();
      System.out.println(result);
      System.out.println(result.getArchive());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#partiallyUpdateCheckIn");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CheckInArchiveDetail1163fe23102e10001df342088f8a018e> response = client
              .workers
              .partiallyUpdateCheckIn(ID, subresourceID)
              .archive(archive)
              .id(id)
              .descriptor(descriptor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#partiallyUpdateCheckIn");
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
| **checkInArchiveDetail1163fe23102e10001df342088f8a018e** | [**CheckInArchiveDetail1163fe23102e10001df342088f8a018e**](CheckInArchiveDetail1163fe23102e10001df342088f8a018e.md)|  | |

### Return type

[**CheckInArchiveDetail1163fe23102e10001df342088f8a018e**](CheckInArchiveDetail1163fe23102e10001df342088f8a018e.md)

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

<a name="partiallyUpdateCheckInTopic"></a>
# **partiallyUpdateCheckInTopic**
> CheckInTopicDetail3267c0ba92a010001688d79b032b03b8 partiallyUpdateCheckInTopic(ID, subresourceID, checkInTopicDetail3267c0ba92a010001688d79b032b03b8).execute();

Partially updates an existing Check-In topic instance.

Partially updates an existing Check-In topic instance with the specified ID and the specified data in the request body (name, privateNotes, sharedNotes, checkInTopicAttachments, or associatedCheckIns). This can only be done by the creator or participant of the Check-In.   This endpoint is equivalent to the Edit Check-In Topic task in Workday.  Secured by: Self-Service: Check-Ins  Scope: Performance Enablement  Contains attachment(s)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
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
    String sharedNotes = "sharedNotes_example"; // Shared notes of the topic.
    List<AssociatedCheckInDetail3267c0ba92a0100016ed105476ad03c4> associatedCheckIns = Arrays.asList(); // Check-ins associated to topic.
    String privateNotes = "privateNotes_example"; // Personal notes of the topic.
    String name = "name_example"; // Topic name.
    List<CheckInTopicAttachmentDetail600ecde4c8421000278d06bfacea01c1> checkInTopicAttachments = Arrays.asList(); // Returns all attachments for the Check-In Topic.
    String id = "id_example"; // Id of the instance
    try {
      CheckInTopicDetail3267c0ba92a010001688d79b032b03b8 result = client
              .workers
              .partiallyUpdateCheckInTopic(ID, subresourceID)
              .sharedNotes(sharedNotes)
              .associatedCheckIns(associatedCheckIns)
              .privateNotes(privateNotes)
              .name(name)
              .checkInTopicAttachments(checkInTopicAttachments)
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getSharedNotes());
      System.out.println(result.getAssociatedCheckIns());
      System.out.println(result.getPrivateNotes());
      System.out.println(result.getName());
      System.out.println(result.getCheckInTopicAttachments());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#partiallyUpdateCheckInTopic");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CheckInTopicDetail3267c0ba92a010001688d79b032b03b8> response = client
              .workers
              .partiallyUpdateCheckInTopic(ID, subresourceID)
              .sharedNotes(sharedNotes)
              .associatedCheckIns(associatedCheckIns)
              .privateNotes(privateNotes)
              .name(name)
              .checkInTopicAttachments(checkInTopicAttachments)
              .id(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#partiallyUpdateCheckInTopic");
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
| **checkInTopicDetail3267c0ba92a010001688d79b032b03b8** | [**CheckInTopicDetail3267c0ba92a010001688d79b032b03b8**](CheckInTopicDetail3267c0ba92a010001688d79b032b03b8.md)|  | |

### Return type

[**CheckInTopicDetail3267c0ba92a010001688d79b032b03b8**](CheckInTopicDetail3267c0ba92a010001688d79b032b03b8.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. Updating file. |  -  |
| **0** | An error occurred. |  -  |

<a name="saveUserSkills"></a>
# **saveUserSkills**
> CreateSkillUsageRepresentation98f198f5056b1000196313ffe9a0225e saveUserSkills(ID, createSkillUsageRepresentation98f198f5056b1000196313ffe9a0225e).execute();

Save skills a user has

Save skills a user has  Secured by: Self-Service: Skills  Scope: Worker Profile and Skills

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://<tenantHostname>/staffing/v6";
    WorkdayStaffing client = new WorkdayStaffing(configuration);
    String ID = "ID_example"; // The Workday ID of the resource.
    List<DisplayExplicitSkillRepresentationD6ca778018011000182fa5be1ae901a8> skills = Arrays.asList(); // Explicit Skill Usages
    SkillItem98f198f5056b100019631445471d225f skillItem = new SkillItem98f198f5056b100019631445471d225f();
    List<SkillItemSourceAddRepresentationC5fabc4ca81610000d5d15309ac90122> skillSources = Arrays.asList(); // Skill Sources
    try {
      CreateSkillUsageRepresentation98f198f5056b1000196313ffe9a0225e result = client
              .workers
              .saveUserSkills(ID)
              .skills(skills)
              .skillItem(skillItem)
              .skillSources(skillSources)
              .execute();
      System.out.println(result);
      System.out.println(result.getSkills());
      System.out.println(result.getSkillItem());
      System.out.println(result.getSkillSources());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#saveUserSkills");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateSkillUsageRepresentation98f198f5056b1000196313ffe9a0225e> response = client
              .workers
              .saveUserSkills(ID)
              .skills(skills)
              .skillItem(skillItem)
              .skillSources(skillSources)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#saveUserSkills");
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
| **createSkillUsageRepresentation98f198f5056b1000196313ffe9a0225e** | [**CreateSkillUsageRepresentation98f198f5056b1000196313ffe9a0225e**](CreateSkillUsageRepresentation98f198f5056b1000196313ffe9a0225e.md)|  | |

### Return type

[**CreateSkillUsageRepresentation98f198f5056b1000196313ffe9a0225e**](CreateSkillUsageRepresentation98f198f5056b1000196313ffe9a0225e.md)

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

<a name="updateCheckIn"></a>
# **updateCheckIn**
> CheckInDetail316b5a26cc3c10000ebdb0cb484602e1 updateCheckIn(ID, subresourceID, checkInDetail316b5a26cc3c10000ebdb0cb484602e1).execute();

Partially updates an existing Check-In instance.

Partially updates an existing Check-In instance with the specified ID and the specified data in the request body (date, description, or associated topics). This can only be done by the creator or participant of the Check-In.    This endpoint is equivalent to the Edit Check-In task in Workday.  Secured by: Self-Service: Check-Ins  Scope: Performance Enablement  Contains attachment(s)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
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
    String description = "description_example"; // Description of check-in.
    List<AssociatedCheckInTopicDetail316b5a26cc3c100010a01184c23902ea> associatedTopics = Arrays.asList(); // Topics included in a check-in.
    LocalDate date = LocalDate.now(); // Date of check-in.
    List<CheckInAttachmentDetailEf244acfe6cf10002ebe92d43a7701d7> checkInAttachments = Arrays.asList(); // Returns all attachments for the Check-In.
    String id = "id_example"; // Id of the instance
    try {
      CheckInDetail316b5a26cc3c10000ebdb0cb484602e1 result = client
              .workers
              .updateCheckIn(ID, subresourceID)
              .description(description)
              .associatedTopics(associatedTopics)
              .date(date)
              .checkInAttachments(checkInAttachments)
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAssociatedTopics());
      System.out.println(result.getDate());
      System.out.println(result.getCheckInAttachments());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#updateCheckIn");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CheckInDetail316b5a26cc3c10000ebdb0cb484602e1> response = client
              .workers
              .updateCheckIn(ID, subresourceID)
              .description(description)
              .associatedTopics(associatedTopics)
              .date(date)
              .checkInAttachments(checkInAttachments)
              .id(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#updateCheckIn");
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
| **checkInDetail316b5a26cc3c10000ebdb0cb484602e1** | [**CheckInDetail316b5a26cc3c10000ebdb0cb484602e1**](CheckInDetail316b5a26cc3c10000ebdb0cb484602e1.md)|  | |

### Return type

[**CheckInDetail316b5a26cc3c10000ebdb0cb484602e1**](CheckInDetail316b5a26cc3c10000ebdb0cb484602e1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. A successful response can return no matched data. Updating file. |  -  |
| **0** | An error occurred. |  -  |

<a name="updateCheckInTopicState"></a>
# **updateCheckInTopicState**
> CheckInTopicArchiveDetail1163fe23102e10001f72d77b213401a2 updateCheckInTopicState(ID, subresourceID, checkInTopicArchiveDetail1163fe23102e10001f72d77b213401a2).execute();

Partially updates an existing Check-In topic to archived or un-archived.

Partially updates an existing Check-In topic instance with the specified ID and the specified data in the request body (archive). This can only be done by the creator or participant of the Check-In.   This endpoint is equivalent to the Archive Check-In Topic task in Workday.  Secured by: Self-Service: Check-Ins, Worker Data: Check-Ins  Scope: Performance Enablement

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
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
    Boolean archive = true; // Indicates that the topic is archived.
    String id = "id_example"; // Id of the instance
    String descriptor = "descriptor_example"; // A preview of the instance
    try {
      CheckInTopicArchiveDetail1163fe23102e10001f72d77b213401a2 result = client
              .workers
              .updateCheckInTopicState(ID, subresourceID)
              .archive(archive)
              .id(id)
              .descriptor(descriptor)
              .execute();
      System.out.println(result);
      System.out.println(result.getArchive());
      System.out.println(result.getId());
      System.out.println(result.getDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#updateCheckInTopicState");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CheckInTopicArchiveDetail1163fe23102e10001f72d77b213401a2> response = client
              .workers
              .updateCheckInTopicState(ID, subresourceID)
              .archive(archive)
              .id(id)
              .descriptor(descriptor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#updateCheckInTopicState");
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
| **checkInTopicArchiveDetail1163fe23102e10001f72d77b213401a2** | [**CheckInTopicArchiveDetail1163fe23102e10001f72d77b213401a2**](CheckInTopicArchiveDetail1163fe23102e10001f72d77b213401a2.md)|  | |

### Return type

[**CheckInTopicArchiveDetail1163fe23102e10001f72d77b213401a2**](CheckInTopicArchiveDetail1163fe23102e10001f72d77b213401a2.md)

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

<a name="updateExternalSkillLevel"></a>
# **updateExternalSkillLevel**
> ExternalSkillLevelA39462f09c44100005d46fd77ef00000 updateExternalSkillLevel(ID, subresourceID, externalSkillLevelA39462f09c44100005d46fd77ef00000).execute();

Updates external skill levels.

Updates external skill levels.  Secured by: Self-Service: External Skill Source, Worker Data: External Skill Source  Scope: Worker Profile and Skills

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.WorkdayStaffing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkersApi;
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
    Integer externalSkillLevel = 56; // The skill level normalized to a scale from 1-5 and to 1 decimal place.
    String externalSkillId = "externalSkillId_example"; // The skill from the external system.
    LocalDate effectiveMoment = LocalDate.now(); // The date that the external Skill Level was last updated.
    String context = "context_example"; // The text you enter to provide context for this external skill load. Not visible to end users.
    String id = "id_example"; // Id of the instance
    try {
      ExternalSkillLevelA39462f09c44100005d46fd77ef00000 result = client
              .workers
              .updateExternalSkillLevel(ID, subresourceID)
              .externalSkillLevel(externalSkillLevel)
              .externalSkillId(externalSkillId)
              .effectiveMoment(effectiveMoment)
              .context(context)
              .id(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getExternalSkillLevel());
      System.out.println(result.getExternalSkillId());
      System.out.println(result.getEffectiveMoment());
      System.out.println(result.getContext());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#updateExternalSkillLevel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExternalSkillLevelA39462f09c44100005d46fd77ef00000> response = client
              .workers
              .updateExternalSkillLevel(ID, subresourceID)
              .externalSkillLevel(externalSkillLevel)
              .externalSkillId(externalSkillId)
              .effectiveMoment(effectiveMoment)
              .context(context)
              .id(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#updateExternalSkillLevel");
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
| **externalSkillLevelA39462f09c44100005d46fd77ef00000** | [**ExternalSkillLevelA39462f09c44100005d46fd77ef00000**](ExternalSkillLevelA39462f09c44100005d46fd77ef00000.md)|  | |

### Return type

[**ExternalSkillLevelA39462f09c44100005d46fd77ef00000**](ExternalSkillLevelA39462f09c44100005d46fd77ef00000.md)

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

