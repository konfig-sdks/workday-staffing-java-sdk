<div align="left">

[![Visit Workday](./header.png)](https://workday.com)

# [Workday](https://workday.com)

The Staffing REST APIs enable you to get and manage staffing information, such as jobs, job families, job profiles, supervisory organizations, worker check-ins, and job changes. The Staffing service also includes the /workers resource to access staffing information for non-terminated workers.



Related Information:
- Administrator Guide: Setup Considerations: Job Changes

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Workday&serviceName=Staffing&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>workday-staffing-java-sdk</artifactId>
  <version>v6</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:workday-staffing-java-sdk:v6"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/workday-staffing-java-sdk-v6.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://&lt;tenantHostname&gt;/staffing/v6*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PromptValuesApi* | [**availableLocations**](docs/PromptValuesApi.md#availableLocations) | **GET** /values/jobChangesGroup/locations | 
*PromptValuesApi* | [**getAssignmentChangeGroupCostCenters**](docs/PromptValuesApi.md#getAssignmentChangeGroupCostCenters) | **GET** /values/organizationAssignmentChangesGroup/costCenters | 
*PromptValuesApi* | [**getAssignmentTypes**](docs/PromptValuesApi.md#getAssignmentTypes) | **GET** /values/jobChangesGroup/assignmentTypes | 
*PromptValuesApi* | [**getCompanyInsiderTypes**](docs/PromptValuesApi.md#getCompanyInsiderTypes) | **GET** /values/jobChangesGroup/companyInsiderTypes | 
*PromptValuesApi* | [**getContingentWorkerTypes**](docs/PromptValuesApi.md#getContingentWorkerTypes) | **GET** /values/jobChangesGroup/contingentWorkerTypes | 
*PromptValuesApi* | [**getCurrencyInstances**](docs/PromptValuesApi.md#getCurrencyInstances) | **GET** /values/jobChangesGroup/currencies | 
*PromptValuesApi* | [**getEmployeeTypes**](docs/PromptValuesApi.md#getEmployeeTypes) | **GET** /values/jobChangesGroup/employeeTypes | 
*PromptValuesApi* | [**getGiftInstances**](docs/PromptValuesApi.md#getGiftInstances) | **GET** /values/organizationAssignmentChangesGroup/gifts | 
*PromptValuesApi* | [**getGrants**](docs/PromptValuesApi.md#getGrants) | **GET** /values/organizationAssignmentChangesGroup/grants | 
*PromptValuesApi* | [**getInstances**](docs/PromptValuesApi.md#getInstances) | **GET** /values/organizationAssignmentChangesGroup/regions | 
*PromptValuesApi* | [**getInstances_0**](docs/PromptValuesApi.md#getInstances_0) | **GET** /values/jobChangesGroup/reason | 
*PromptValuesApi* | [**getInstances_1**](docs/PromptValuesApi.md#getInstances_1) | **GET** /values/organizationAssignmentChangesGroup/customs | 
*PromptValuesApi* | [**getInstances_10**](docs/PromptValuesApi.md#getInstances_10) | **GET** /values/jobChangesGroup/templates | 
*PromptValuesApi* | [**getInstances_11**](docs/PromptValuesApi.md#getInstances_11) | **GET** /values/jobChangesGroup/workers | 
*PromptValuesApi* | [**getInstances_12**](docs/PromptValuesApi.md#getInstances_12) | **GET** /values/jobChangesGroup/jobs | 
*PromptValuesApi* | [**getInstances_13**](docs/PromptValuesApi.md#getInstances_13) | **GET** /values/organizationAssignmentChangesGroup/workers | 
*PromptValuesApi* | [**getInstances_14**](docs/PromptValuesApi.md#getInstances_14) | **GET** /values/jobChangesGroup/workStudyAwards | 
*PromptValuesApi* | [**getInstances_15**](docs/PromptValuesApi.md#getInstances_15) | **GET** /values/organizationAssignmentChangesGroup/positions | 
*PromptValuesApi* | [**getInstances_16**](docs/PromptValuesApi.md#getInstances_16) | **GET** /values/jobChangesGroup/jobRequisitions | 
*PromptValuesApi* | [**getInstances_17**](docs/PromptValuesApi.md#getInstances_17) | **GET** /values/jobChangesGroup/jobProfiles | 
*PromptValuesApi* | [**getInstances_18**](docs/PromptValuesApi.md#getInstances_18) | **GET** /values/organizationAssignmentChangesGroup/companies | 
*PromptValuesApi* | [**getInstances_19**](docs/PromptValuesApi.md#getInstances_19) | **GET** /values/jobChangesGroup/jobClassifications | 
*PromptValuesApi* | [**getInstances_2**](docs/PromptValuesApi.md#getInstances_2) | **GET** /values/organizationAssignmentChangesGroup/programs | 
*PromptValuesApi* | [**getInstances_3**](docs/PromptValuesApi.md#getInstances_3) | **GET** /values/organizationAssignmentChangesGroup/jobs | 
*PromptValuesApi* | [**getInstances_4**](docs/PromptValuesApi.md#getInstances_4) | **GET** /values/organizationAssignmentChangesGroup/funds | 
*PromptValuesApi* | [**getInstances_5**](docs/PromptValuesApi.md#getInstances_5) | **GET** /values/jobChangesGroup/workersCompensationCodeOverrides | 
*PromptValuesApi* | [**getInstances_6**](docs/PromptValuesApi.md#getInstances_6) | **GET** /values/jobChangesGroup/workShifts | 
*PromptValuesApi* | [**getInstances_7**](docs/PromptValuesApi.md#getInstances_7) | **GET** /values/organizationAssignmentChangesGroup/businessUnits | 
*PromptValuesApi* | [**getInstances_8**](docs/PromptValuesApi.md#getInstances_8) | **GET** /values/jobChangesGroup/frequencies | 
*PromptValuesApi* | [**getInstances_9**](docs/PromptValuesApi.md#getInstances_9) | **GET** /values/jobChangesGroup/payRateTypes | 
*PromptValuesApi* | [**getOptions**](docs/PromptValuesApi.md#getOptions) | **GET** /values/jobChangesGroup/headcountOptions | 
*PromptValuesApi* | [**getProposedPositions**](docs/PromptValuesApi.md#getProposedPositions) | **GET** /values/jobChangesGroup/proposedPosition | 
*PromptValuesApi* | [**getSupervisoryOrgValues**](docs/PromptValuesApi.md#getSupervisoryOrgValues) | **GET** /values/jobChangesGroup/supervisoryOrganization | 
*PromptValuesApi* | [**getTimeTypes**](docs/PromptValuesApi.md#getTimeTypes) | **GET** /values/jobChangesGroup/timeTypes | 
*PromptValuesApi* | [**getWorkerTypes**](docs/PromptValuesApi.md#getWorkerTypes) | **GET** /values/jobChangesGroup/workerTypes | 
*PromptValuesApi* | [**getWorkspaceInstances**](docs/PromptValuesApi.md#getWorkspaceInstances) | **GET** /values/jobChangesGroup/workSpaces | 
*JobChangesApi* | [**getAdminOptions**](docs/JobChangesApi.md#getAdminOptions) | **GET** /jobChanges/{ID}/administrative/{subresourceID} | Retrieves the administrative options for the specified job change ID.
*JobChangesApi* | [**getAdministrativeOptions**](docs/JobChangesApi.md#getAdministrativeOptions) | **GET** /jobChanges/{ID}/administrative | Retrieves the administrative options for the specified job change ID.
*JobChangesApi* | [**getBusinessTitle**](docs/JobChangesApi.md#getBusinessTitle) | **GET** /jobChanges/{ID}/businessTitle/{subresourceID} | Retrieves a business title for the specified job change ID.
*JobChangesApi* | [**getBusinessTitle_0**](docs/JobChangesApi.md#getBusinessTitle_0) | **GET** /jobChanges/{ID}/businessTitle | Retrieves a business title for the specified job change ID.
*JobChangesApi* | [**getById**](docs/JobChangesApi.md#getById) | **GET** /jobChanges/{ID} | Retrieves a single change job event instance.
*JobChangesApi* | [**getCommentById**](docs/JobChangesApi.md#getCommentById) | **GET** /jobChanges/{ID}/comment | Returns the comment information for the specified job change ID.
*JobChangesApi* | [**getCommentInfo**](docs/JobChangesApi.md#getCommentInfo) | **GET** /jobChanges/{ID}/comment/{subresourceID} | Returns the comment information for the specified job change ID.
*JobChangesApi* | [**getContractOptions**](docs/JobChangesApi.md#getContractOptions) | **GET** /jobChanges/{ID}/contract | Retrieves the contract options for the specified change job ID.
*JobChangesApi* | [**getContractOptions_0**](docs/JobChangesApi.md#getContractOptions_0) | **GET** /jobChanges/{ID}/contract/{subresourceID} | Retrieves the contract options for the specified change job ID.
*JobChangesApi* | [**getJobClassification**](docs/JobChangesApi.md#getJobClassification) | **GET** /jobChanges/{ID}/jobClassification | Retrieves a job classification for the specified job change ID.
*JobChangesApi* | [**getJobClassification_0**](docs/JobChangesApi.md#getJobClassification_0) | **GET** /jobChanges/{ID}/jobClassification/{subresourceID} | Retrieves a job classification for the specified job change ID.
*JobChangesApi* | [**getJobProfile**](docs/JobChangesApi.md#getJobProfile) | **GET** /jobChanges/{ID}/jobProfile | Retrieves a job profile for the specified job change ID.
*JobChangesApi* | [**getLocationInfo**](docs/JobChangesApi.md#getLocationInfo) | **GET** /jobChanges/{ID}/location | Returns the location information for the specified job change ID.
*JobChangesApi* | [**getLocationInfo_0**](docs/JobChangesApi.md#getLocationInfo_0) | **GET** /jobChanges/{ID}/location/{subresourceID} | Returns the location information for the specified job change ID.
*JobChangesApi* | [**getMoveTeamOption**](docs/JobChangesApi.md#getMoveTeamOption) | **GET** /jobChanges/{ID}/moveTeam/{subresourceID} | Retrieves a move team option from the specified job change ID.
*JobChangesApi* | [**getMoveTeamOption_0**](docs/JobChangesApi.md#getMoveTeamOption_0) | **GET** /jobChanges/{ID}/moveTeam | Retrieves a move team option from the specified job change ID.
*JobChangesApi* | [**getOpeningOptions**](docs/JobChangesApi.md#getOpeningOptions) | **GET** /jobChanges/{ID}/opening | Retrieves the opening options for the specified job change ID.
*JobChangesApi* | [**getOpeningOptions_0**](docs/JobChangesApi.md#getOpeningOptions_0) | **GET** /jobChanges/{ID}/opening/{subresourceID} | Retrieves the opening options for the specified job change ID.
*JobChangesApi* | [**getPositionById**](docs/JobChangesApi.md#getPositionById) | **GET** /jobChanges/{ID}/position | Retrieves a position for the specified job change ID.
*JobChangesApi* | [**getPositionBySubresourceId**](docs/JobChangesApi.md#getPositionBySubresourceId) | **GET** /jobChanges/{ID}/position/{subresourceID} | Retrieves a position for the specified job change ID.
*JobChangesApi* | [**getProfile**](docs/JobChangesApi.md#getProfile) | **GET** /jobChanges/{ID}/jobProfile/{subresourceID} | Retrieves a job profile for the specified job change ID.
*JobChangesApi* | [**getStartDetails**](docs/JobChangesApi.md#getStartDetails) | **GET** /jobChanges/{ID}/startDetails/{subresourceID} | Retrieves the start details for the specified job change ID.
*JobChangesApi* | [**getStartDetails_0**](docs/JobChangesApi.md#getStartDetails_0) | **GET** /jobChanges/{ID}/startDetails | Retrieves the start details for the specified job change ID.
*JobChangesApi* | [**partialUpdateLocationOptions**](docs/JobChangesApi.md#partialUpdateLocationOptions) | **PATCH** /jobChanges/{ID}/location/{subresourceID} | Partially updates the location options for the specified change job ID.
*JobChangesApi* | [**partiallyUpdateContractOptions**](docs/JobChangesApi.md#partiallyUpdateContractOptions) | **PATCH** /jobChanges/{ID}/contract/{subresourceID} | Partially updates the contract options for the specified change job ID.
*JobChangesApi* | [**submitChangeJob**](docs/JobChangesApi.md#submitChangeJob) | **POST** /jobChanges/{ID}/submit | Submit the specified change job ID.
*JobChangesApi* | [**updateAdministrativeOptions**](docs/JobChangesApi.md#updateAdministrativeOptions) | **PATCH** /jobChanges/{ID}/administrative/{subresourceID} | Partially updates the administrative options for the specified job change ID.
*JobChangesApi* | [**updateBusinessTitleOptions**](docs/JobChangesApi.md#updateBusinessTitleOptions) | **PATCH** /jobChanges/{ID}/businessTitle/{subresourceID} | Partially updates the businessTitle options for the specified change job ID.
*JobChangesApi* | [**updateComment**](docs/JobChangesApi.md#updateComment) | **PATCH** /jobChanges/{ID}/comment/{subresourceID} | Partially updates the comment for the specified change job ID.
*JobChangesApi* | [**updateJobClassificationOptions**](docs/JobChangesApi.md#updateJobClassificationOptions) | **PATCH** /jobChanges/{ID}/jobClassification/{subresourceID} | Partially updates the jobClassification options for the specified change job ID.
*JobChangesApi* | [**updateJobProfileOptions**](docs/JobChangesApi.md#updateJobProfileOptions) | **PATCH** /jobChanges/{ID}/jobProfile/{subresourceID} | Partially updates the jobProfile options for the specified change job ID.
*JobChangesApi* | [**updateMoveTeamOptions**](docs/JobChangesApi.md#updateMoveTeamOptions) | **PATCH** /jobChanges/{ID}/moveTeam/{subresourceID} | Partially updates the moveTeam options for the specified change job ID.
*JobChangesApi* | [**updateOpeningOptions**](docs/JobChangesApi.md#updateOpeningOptions) | **PATCH** /jobChanges/{ID}/opening/{subresourceID} | Partially updates the opening options for the specified change job ID.
*JobChangesApi* | [**updatePositionOptions**](docs/JobChangesApi.md#updatePositionOptions) | **PATCH** /jobChanges/{ID}/position/{subresourceID} | Partially updates the position options for the specified change job ID.
*JobChangesApi* | [**updateStartDetails**](docs/JobChangesApi.md#updateStartDetails) | **PATCH** /jobChanges/{ID}/startDetails/{subresourceID} | Partially updates the startDetails options for the specified change job ID.
*JobFamiliesApi* | [**getById**](docs/JobFamiliesApi.md#getById) | **GET** /jobFamilies/{ID} | Retrieves a single job family instance.
*JobFamiliesApi* | [**list**](docs/JobFamiliesApi.md#list) | **GET** /jobFamilies | Retrieves a collection of job families.
*JobProfilesApi* | [**getById**](docs/JobProfilesApi.md#getById) | **GET** /jobProfiles/{ID} | Retrieves a single job profile instance.
*JobProfilesApi* | [**listCollection**](docs/JobProfilesApi.md#listCollection) | **GET** /jobProfiles | Retrieves a collection of job profiles.
*JobsApi* | [**getCollection**](docs/JobsApi.md#getCollection) | **GET** /jobs | Retrieves a collection of jobs.
*JobsApi* | [**getJobById**](docs/JobsApi.md#getJobById) | **GET** /jobs/{ID} | Retrieves a single job instance.
*JobsApi* | [**getWorkspace**](docs/JobsApi.md#getWorkspace) | **GET** /jobs/{ID}/workspace/{subresourceID} | Retrieves a single workspace instance.
*JobsApi* | [**getWorkspaces**](docs/JobsApi.md#getWorkspaces) | **GET** /jobs/{ID}/workspace | Retrieves a collection of workspaces for the specified job ID.
*OrganizationAssignmentChangesApi* | [**createChangeEvent**](docs/OrganizationAssignmentChangesApi.md#createChangeEvent) | **POST** /organizationAssignmentChanges | Creates a new change organization assignment event for a specific filled or unfilled position.
*OrganizationAssignmentChangesApi* | [**getBusinessUnit**](docs/OrganizationAssignmentChangesApi.md#getBusinessUnit) | **GET** /organizationAssignmentChanges/{ID}/businessUnit/{subresourceID} | Retrieves a business unit for the specified organization assignment change ID.
*OrganizationAssignmentChangesApi* | [**getBusinessUnit_0**](docs/OrganizationAssignmentChangesApi.md#getBusinessUnit_0) | **GET** /organizationAssignmentChanges/{ID}/businessUnit | Retrieves a business unit for the specified organization assignment change ID.
*OrganizationAssignmentChangesApi* | [**getComment**](docs/OrganizationAssignmentChangesApi.md#getComment) | **GET** /organizationAssignmentChanges/{ID}/comment | Retrieves the comment information for the specified organization assignment change ID.
*OrganizationAssignmentChangesApi* | [**getCommentInfo**](docs/OrganizationAssignmentChangesApi.md#getCommentInfo) | **GET** /organizationAssignmentChanges/{ID}/comment/{subresourceID} | Retrieves the comment information for the specified organization assignment change ID.
*OrganizationAssignmentChangesApi* | [**getCompany**](docs/OrganizationAssignmentChangesApi.md#getCompany) | **GET** /organizationAssignmentChanges/{ID}/company | Retrieves a company for the specified organization assignment change ID.
*OrganizationAssignmentChangesApi* | [**getCompanyById**](docs/OrganizationAssignmentChangesApi.md#getCompanyById) | **GET** /organizationAssignmentChanges/{ID}/company/{subresourceID} | Retrieves a company for the specified organization assignment change ID.
*OrganizationAssignmentChangesApi* | [**getCostCenter**](docs/OrganizationAssignmentChangesApi.md#getCostCenter) | **GET** /organizationAssignmentChanges/{ID}/costCenter/{subresourceID} | Retrieves a cost center for the specified organization assignment change ID.
*OrganizationAssignmentChangesApi* | [**getCostCenter_0**](docs/OrganizationAssignmentChangesApi.md#getCostCenter_0) | **GET** /organizationAssignmentChanges/{ID}/costCenter | Retrieves a cost center for the specified organization assignment change ID.
*OrganizationAssignmentChangesApi* | [**getCostingOrganizations**](docs/OrganizationAssignmentChangesApi.md#getCostingOrganizations) | **GET** /organizationAssignmentChanges/{ID}/costing/{subresourceID} | Retrieves the costing organizations for the specified organization assignment change ID.
*OrganizationAssignmentChangesApi* | [**getCostingOrganizations_0**](docs/OrganizationAssignmentChangesApi.md#getCostingOrganizations_0) | **GET** /organizationAssignmentChanges/{ID}/costing | Retrieves the costing organizations for the specified organization assignment change ID.
*OrganizationAssignmentChangesApi* | [**getCustomOrganizations**](docs/OrganizationAssignmentChangesApi.md#getCustomOrganizations) | **GET** /organizationAssignmentChanges/{ID}/customOrganizations/{subresourceID} | Retrieves the custom organizations for the specified organization assignment change ID.
*OrganizationAssignmentChangesApi* | [**getCustomOrganizations_0**](docs/OrganizationAssignmentChangesApi.md#getCustomOrganizations_0) | **GET** /organizationAssignmentChanges/{ID}/customOrganizations | Retrieves the custom organizations for the specified organization assignment change ID.
*OrganizationAssignmentChangesApi* | [**getInstance**](docs/OrganizationAssignmentChangesApi.md#getInstance) | **GET** /organizationAssignmentChanges/{ID} | Retrieves a single organization assignment change event instance.
*OrganizationAssignmentChangesApi* | [**getRegion**](docs/OrganizationAssignmentChangesApi.md#getRegion) | **GET** /organizationAssignmentChanges/{ID}/region | Retrieves a region for the specified organization assignment change ID.
*OrganizationAssignmentChangesApi* | [**getRegionById**](docs/OrganizationAssignmentChangesApi.md#getRegionById) | **GET** /organizationAssignmentChanges/{ID}/region/{subresourceID} | Retrieves a region for the specified organization assignment change ID.
*OrganizationAssignmentChangesApi* | [**getStartDetails**](docs/OrganizationAssignmentChangesApi.md#getStartDetails) | **GET** /organizationAssignmentChanges/{ID}/startDetails/{subresourceID} | Retrieves the start details for the specified organization assignment change ID.
*OrganizationAssignmentChangesApi* | [**getStartDetails_0**](docs/OrganizationAssignmentChangesApi.md#getStartDetails_0) | **GET** /organizationAssignmentChanges/{ID}/startDetails | Retrieves the start details for the specified organization assignment change ID.
*OrganizationAssignmentChangesApi* | [**partiallyUpdateCompany**](docs/OrganizationAssignmentChangesApi.md#partiallyUpdateCompany) | **PATCH** /organizationAssignmentChanges/{ID}/company/{subresourceID} | Partially updates the company for the specified organization assignment change ID.
*OrganizationAssignmentChangesApi* | [**partiallyUpdateCostingOptions**](docs/OrganizationAssignmentChangesApi.md#partiallyUpdateCostingOptions) | **PATCH** /organizationAssignmentChanges/{ID}/costing/{subresourceID} | Partially updates the costing organization options for the specified organization assignment change ID.
*OrganizationAssignmentChangesApi* | [**partiallyUpdateStartDetails**](docs/OrganizationAssignmentChangesApi.md#partiallyUpdateStartDetails) | **PATCH** /organizationAssignmentChanges/{ID}/startDetails/{subresourceID} | Partially updates the start details for the specified organization assignment change ID.
*OrganizationAssignmentChangesApi* | [**submitChangeRequest**](docs/OrganizationAssignmentChangesApi.md#submitChangeRequest) | **POST** /organizationAssignmentChanges/{ID}/submit | Submits the organization changes request for the specified ID, and initiates the Change Organization Assignment business process.
*OrganizationAssignmentChangesApi* | [**updateBusinessUnit**](docs/OrganizationAssignmentChangesApi.md#updateBusinessUnit) | **PATCH** /organizationAssignmentChanges/{ID}/businessUnit/{subresourceID} | Partially updates the business unit for the specified organization assignment change ID.
*OrganizationAssignmentChangesApi* | [**updateComment**](docs/OrganizationAssignmentChangesApi.md#updateComment) | **PATCH** /organizationAssignmentChanges/{ID}/comment/{subresourceID} | Partially updates  the comment for the organization assignment change ID.
*OrganizationAssignmentChangesApi* | [**updateCostCenter**](docs/OrganizationAssignmentChangesApi.md#updateCostCenter) | **PATCH** /organizationAssignmentChanges/{ID}/costCenter/{subresourceID} | Partially updates the cost center for the specified organization assignment change ID.
*OrganizationAssignmentChangesApi* | [**updateCustomOrganizations**](docs/OrganizationAssignmentChangesApi.md#updateCustomOrganizations) | **PATCH** /organizationAssignmentChanges/{ID}/customOrganizations/{subresourceID} | Partially updates the custom organizations for the specified organization assignment change ID.
*OrganizationAssignmentChangesApi* | [**updateRegion**](docs/OrganizationAssignmentChangesApi.md#updateRegion) | **PATCH** /organizationAssignmentChanges/{ID}/region/{subresourceID} | Partially updates the region for the specified organization assignment change ID.
*SupervisoryOrganizationsApi* | [**getById**](docs/SupervisoryOrganizationsApi.md#getById) | **GET** /supervisoryOrganizations | Retrieves a supervisory organization for the specified ID.
*SupervisoryOrganizationsApi* | [**getInstance**](docs/SupervisoryOrganizationsApi.md#getInstance) | **GET** /supervisoryOrganizations/{ID} | Retrieves a single supervisory organization instance.
*SupervisoryOrganizationsApi* | [**getMember**](docs/SupervisoryOrganizationsApi.md#getMember) | **GET** /supervisoryOrganizations/{ID}/members/{subresourceID} | Retrieves a single member instance.
*SupervisoryOrganizationsApi* | [**getMembers**](docs/SupervisoryOrganizationsApi.md#getMembers) | **GET** /supervisoryOrganizations/{ID}/members | Retrieves a collection of members for the specified supervisory organization ID.
*SupervisoryOrganizationsApi* | [**getOrgChart**](docs/SupervisoryOrganizationsApi.md#getOrgChart) | **GET** /supervisoryOrganizations/{ID}/orgChart | Retrieves information about an organization chart of the specified supervisory organization id.
*SupervisoryOrganizationsApi* | [**getOrgChart_0**](docs/SupervisoryOrganizationsApi.md#getOrgChart_0) | **GET** /supervisoryOrganizations/{ID}/orgChart/{subresourceID} | Retrieves a single organization chart instance.
*WorkersApi* | [**createCheckIn**](docs/WorkersApi.md#createCheckIn) | **POST** /workers/{ID}/checkIns | Creates Check-Ins.
*WorkersApi* | [**createCheckInTopic**](docs/WorkersApi.md#createCheckInTopic) | **POST** /workers/{ID}/checkInTopics | Creates Check-In topics.
*WorkersApi* | [**createExternalSkillLevels**](docs/WorkersApi.md#createExternalSkillLevels) | **POST** /workers/{ID}/externalSkillLevel | Creates external skill levels.
*WorkersApi* | [**createHomeContactChangeProcess**](docs/WorkersApi.md#createHomeContactChangeProcess) | **POST** /workers/{ID}/homeContactInformationChanges | 
*WorkersApi* | [**createSkillItem**](docs/WorkersApi.md#createSkillItem) | **POST** /workers/{ID}/skillItems | 
*WorkersApi* | [**createWorkContactInformationChanges**](docs/WorkersApi.md#createWorkContactInformationChanges) | **POST** /workers/{ID}/workContactInformationChanges | 
*WorkersApi* | [**deleteCheckIn**](docs/WorkersApi.md#deleteCheckIn) | **DELETE** /workers/{ID}/checkIns/{subresourceID} | Deletes an existing Check-In instance.
*WorkersApi* | [**deleteCheckInTopic**](docs/WorkersApi.md#deleteCheckInTopic) | **DELETE** /workers/{ID}/checkInTopics/{subresourceID} | Deletes an existing Check-In topic instance.
*WorkersApi* | [**getCheckIn**](docs/WorkersApi.md#getCheckIn) | **GET** /workers/{ID}/checkIns/{subresourceID} | Retrieves a single Check-In instance.
*WorkersApi* | [**getCheckInTopic**](docs/WorkersApi.md#getCheckInTopic) | **GET** /workers/{ID}/checkInTopics/{subresourceID} | Retrieves a single Check-In topic instance.
*WorkersApi* | [**getCheckInTopics**](docs/WorkersApi.md#getCheckInTopics) | **GET** /workers/{ID}/checkInTopics | Retrieves a collection of Check-Ins topics.
*WorkersApi* | [**getCheckIns**](docs/WorkersApi.md#getCheckIns) | **GET** /workers/{ID}/checkIns | Retrieves a collection of Check-Ins.
*WorkersApi* | [**getCollectionStaffing**](docs/WorkersApi.md#getCollectionStaffing) | **GET** /workers | Retrieves a collection of workers and current staffing information.
*WorkersApi* | [**getExplicitSkills**](docs/WorkersApi.md#getExplicitSkills) | **GET** /workers/{ID}/explicitSkills | Get Explicit Skills for Skill Enabled
*WorkersApi* | [**getExplicitSkillsForSkillEnabled**](docs/WorkersApi.md#getExplicitSkillsForSkillEnabled) | **GET** /workers/{ID}/explicitSkills/{subresourceID} | Get Explicit Skills for Skill Enabled
*WorkersApi* | [**getExternalSkillLevel**](docs/WorkersApi.md#getExternalSkillLevel) | **GET** /workers/{ID}/externalSkillLevel | Retrieves all external skill level information for a worker. You can filter the external skill levels by externalSkillId.
*WorkersApi* | [**getExternalSkillLevels**](docs/WorkersApi.md#getExternalSkillLevels) | **GET** /workers/{ID}/externalSkillLevel/{subresourceID} | Retrieves all external skill level information for a worker. You can filter the external skill levels by externalSkillId.
*WorkersApi* | [**getHomeContactChange**](docs/WorkersApi.md#getHomeContactChange) | **GET** /workers/{ID}/homeContactInformationChanges/{subresourceID} | Retrieves an existing Home Contact Change event for the Person.
*WorkersApi* | [**getServiceDate**](docs/WorkersApi.md#getServiceDate) | **GET** /workers/{ID}/serviceDates/{subresourceID} | Retrieves a single service date information instance.
*WorkersApi* | [**getServiceDates**](docs/WorkersApi.md#getServiceDates) | **GET** /workers/{ID}/serviceDates | Retrieves a collection of service dates for the specified worker id.
*WorkersApi* | [**getSkillItems**](docs/WorkersApi.md#getSkillItems) | **GET** /workers/{ID}/skillItems | 
*WorkersApi* | [**getSkillItemsById**](docs/WorkersApi.md#getSkillItemsById) | **GET** /workers/{ID}/skillItems/{subresourceID} | 
*WorkersApi* | [**getStaffingInformation**](docs/WorkersApi.md#getStaffingInformation) | **GET** /workers/{ID} | Retrieves a collection of workers and current staffing information.
*WorkersApi* | [**getWorkContactChange**](docs/WorkersApi.md#getWorkContactChange) | **GET** /workers/{ID}/workContactInformationChanges/{subresourceID} | Retrieves an existing Work Contact Change event for the Person.
*WorkersApi* | [**initiateJobChange**](docs/WorkersApi.md#initiateJobChange) | **POST** /workers/{ID}/jobChanges | Initiates a job change request for a specific worker
*WorkersApi* | [**initiateOrganizationAssignmentChange**](docs/WorkersApi.md#initiateOrganizationAssignmentChange) | **POST** /workers/{ID}/organizationAssignmentChanges | Initiates an organization assignment change for a specific worker.
*WorkersApi* | [**partiallyUpdateCheckIn**](docs/WorkersApi.md#partiallyUpdateCheckIn) | **PATCH** /workers/{ID}/checkIns/{subresourceID}?type&#x3D;archive | Partially updates an existing Check-In to archived or un-archived.
*WorkersApi* | [**partiallyUpdateCheckInTopic**](docs/WorkersApi.md#partiallyUpdateCheckInTopic) | **PATCH** /workers/{ID}/checkInTopics/{subresourceID} | Partially updates an existing Check-In topic instance.
*WorkersApi* | [**saveUserSkills**](docs/WorkersApi.md#saveUserSkills) | **POST** /workers/{ID}/explicitSkills | Save skills a user has
*WorkersApi* | [**updateCheckIn**](docs/WorkersApi.md#updateCheckIn) | **PATCH** /workers/{ID}/checkIns/{subresourceID} | Partially updates an existing Check-In instance.
*WorkersApi* | [**updateCheckInTopicState**](docs/WorkersApi.md#updateCheckInTopicState) | **PATCH** /workers/{ID}/checkInTopics/{subresourceID}?type&#x3D;archive | Partially updates an existing Check-In topic to archived or un-archived.
*WorkersApi* | [**updateExternalSkillLevel**](docs/WorkersApi.md#updateExternalSkillLevel) | **PUT** /workers/{ID}/externalSkillLevel/{subresourceID} | Updates external skill levels.


## Documentation for Models

 - [Action38ff08ab6736100010816009079d0126](docs/Action38ff08ab6736100010816009079d0126.md)
 - [AssignmentType23929e1f68ca10000d6940d6bde56963](docs/AssignmentType23929e1f68ca10000d6940d6bde56963.md)
 - [AssociatedCheckInDetail3267c0ba92a0100016ed105476ad03c4](docs/AssociatedCheckInDetail3267c0ba92a0100016ed105476ad03c4.md)
 - [AssociatedCheckInTopicDetail316b5a26cc3c100010a01184c23902ea](docs/AssociatedCheckInTopicDetail316b5a26cc3c100010a01184c23902ea.md)
 - [AssociatedCheckInTopicDetail316b5a26cc3c100010a01184c23902eaAllOf](docs/AssociatedCheckInTopicDetail316b5a26cc3c100010a01184c23902eaAllOf.md)
 - [AssociatedCheckInsSummaryD81c816de26f10000f7a29ea89140020](docs/AssociatedCheckInsSummaryD81c816de26f10000f7a29ea89140020.md)
 - [AssociatedCheckInsSummaryD81c816de26f10000f7a29ea89140020AllOf](docs/AssociatedCheckInsSummaryD81c816de26f10000f7a29ea89140020AllOf.md)
 - [AssociatedTopicsSummaryB3a69f47a4991000171aae4c5a810040](docs/AssociatedTopicsSummaryB3a69f47a4991000171aae4c5a810040.md)
 - [AssociatedTopicsSummaryB3a69f47a4991000171aae4c5a810040AllOf](docs/AssociatedTopicsSummaryB3a69f47a4991000171aae4c5a810040AllOf.md)
 - [BusinessProcessParameters23782ad3f54110002073aab65def00fb](docs/BusinessProcessParameters23782ad3f54110002073aab65def00fb.md)
 - [BusinessProcessParameters2dcd9a4882b210000f7b2e0a85982265](docs/BusinessProcessParameters2dcd9a4882b210000f7b2e0a85982265.md)
 - [BusinessProcessParameters2dcd9a4882b210000f7b2e0a85982265AllOf](docs/BusinessProcessParameters2dcd9a4882b210000f7b2e0a85982265AllOf.md)
 - [BusinessProcessParameters5afc0b4b5a4610002aaebb8180cd2261](docs/BusinessProcessParameters5afc0b4b5a4610002aaebb8180cd2261.md)
 - [BusinessUnit5aabf8e28cb310002520b2aabc470366](docs/BusinessUnit5aabf8e28cb310002520b2aabc470366.md)
 - [Category43b30ba735b8100011ee4781a9d50146](docs/Category43b30ba735b8100011ee4781a9d50146.md)
 - [ChangeJobAdditionalJobClassificationData27ec818d10d0100003600115b5200102](docs/ChangeJobAdditionalJobClassificationData27ec818d10d0100003600115b5200102.md)
 - [ChangeJobAdditionalJobClassificationData27ec818d10d0100003600115b5200102AllOf](docs/ChangeJobAdditionalJobClassificationData27ec818d10d0100003600115b5200102AllOf.md)
 - [ChangeJobAdministrativeDetailsDataF8f20079bc5a1000089ccb7f6a8800ea](docs/ChangeJobAdministrativeDetailsDataF8f20079bc5a1000089ccb7f6a8800ea.md)
 - [ChangeJobAdministrativeDetailsDataF8f20079bc5a1000089ccb7f6a8800eaAllOf](docs/ChangeJobAdministrativeDetailsDataF8f20079bc5a1000089ccb7f6a8800eaAllOf.md)
 - [ChangeJobBusinessTitle3db8095ffa18100013a5f96969ca0102](docs/ChangeJobBusinessTitle3db8095ffa18100013a5f96969ca0102.md)
 - [ChangeJobBusinessTitle3db8095ffa18100013a5f96969ca0102AllOf](docs/ChangeJobBusinessTitle3db8095ffa18100013a5f96969ca0102AllOf.md)
 - [ChangeJobCompanyInsiderTypesData05d4c45042b61000131e4b2132f30137](docs/ChangeJobCompanyInsiderTypesData05d4c45042b61000131e4b2132f30137.md)
 - [ChangeJobCompanyInsiderTypesData05d4c45042b61000131e4b2132f30137AllOf](docs/ChangeJobCompanyInsiderTypesData05d4c45042b61000131e4b2132f30137AllOf.md)
 - [ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107](docs/ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107.md)
 - [ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf](docs/ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf.md)
 - [ChangeJobDefaultRepresentation6cc31ee444d010000bb4153a954300e7](docs/ChangeJobDefaultRepresentation6cc31ee444d010000bb4153a954300e7.md)
 - [ChangeJobDefaultRepresentation6cc31ee444d010000bb4153a954300e7AllOf](docs/ChangeJobDefaultRepresentation6cc31ee444d010000bb4153a954300e7AllOf.md)
 - [ChangeJobJobClassificationData354103f196361000084489bcb281017f](docs/ChangeJobJobClassificationData354103f196361000084489bcb281017f.md)
 - [ChangeJobJobClassificationData354103f196361000084489bcb281017fAllOf](docs/ChangeJobJobClassificationData354103f196361000084489bcb281017fAllOf.md)
 - [ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115](docs/ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115.md)
 - [ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115AllOf](docs/ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115AllOf.md)
 - [ChangeJobLocation90151d6c4ff110001b4a46091678025c](docs/ChangeJobLocation90151d6c4ff110001b4a46091678025c.md)
 - [ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf](docs/ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf.md)
 - [ChangeJobMoveTeamData544fdf5c01da1000238ad82d26d90146](docs/ChangeJobMoveTeamData544fdf5c01da1000238ad82d26d90146.md)
 - [ChangeJobMoveTeamData544fdf5c01da1000238ad82d26d90146AllOf](docs/ChangeJobMoveTeamData544fdf5c01da1000238ad82d26d90146AllOf.md)
 - [ChangeJobOpeningData97af9049a5fd10001c4888d654170000](docs/ChangeJobOpeningData97af9049a5fd10001c4888d654170000.md)
 - [ChangeJobOpeningData97af9049a5fd10001c4888d654170000AllOf](docs/ChangeJobOpeningData97af9049a5fd10001c4888d654170000AllOf.md)
 - [ChangeJobPositionDataDfc4e58f7308100018bd1c459f435221](docs/ChangeJobPositionDataDfc4e58f7308100018bd1c459f435221.md)
 - [ChangeJobPositionDataDfc4e58f7308100018bd1c459f435221AllOf](docs/ChangeJobPositionDataDfc4e58f7308100018bd1c459f435221AllOf.md)
 - [ChangeOrganizationAssignmentDefaultRepresentationDb2f38bfb555100012de1eb17c2f00ff](docs/ChangeOrganizationAssignmentDefaultRepresentationDb2f38bfb555100012de1eb17c2f00ff.md)
 - [ChangeOrganizationAssignmentDefaultRepresentationDb2f38bfb555100012de1eb17c2f00ffAllOf](docs/ChangeOrganizationAssignmentDefaultRepresentationDb2f38bfb555100012de1eb17c2f00ffAllOf.md)
 - [CheckInArchiveDetail1163fe23102e10001df342088f8a018e](docs/CheckInArchiveDetail1163fe23102e10001df342088f8a018e.md)
 - [CheckInArchiveDetail1163fe23102e10001df342088f8a018eAllOf](docs/CheckInArchiveDetail1163fe23102e10001df342088f8a018eAllOf.md)
 - [CheckInAttachmentDetailEf244acfe6cf10002ebe92d43a7701d7](docs/CheckInAttachmentDetailEf244acfe6cf10002ebe92d43a7701d7.md)
 - [CheckInAttachmentDetailEf244acfe6cf10002ebe92d43a7701d7AllOf](docs/CheckInAttachmentDetailEf244acfe6cf10002ebe92d43a7701d7AllOf.md)
 - [CheckInDetail316b5a26cc3c10000ebdb0cb484602e1](docs/CheckInDetail316b5a26cc3c10000ebdb0cb484602e1.md)
 - [CheckInDetail316b5a26cc3c10000ebdb0cb484602e1AllOf](docs/CheckInDetail316b5a26cc3c10000ebdb0cb484602e1AllOf.md)
 - [CheckInTopicArchiveDetail1163fe23102e10001f72d77b213401a2](docs/CheckInTopicArchiveDetail1163fe23102e10001f72d77b213401a2.md)
 - [CheckInTopicArchiveDetail1163fe23102e10001f72d77b213401a2AllOf](docs/CheckInTopicArchiveDetail1163fe23102e10001f72d77b213401a2AllOf.md)
 - [CheckInTopicAttachmentDetail600ecde4c8421000278d06bfacea01c1](docs/CheckInTopicAttachmentDetail600ecde4c8421000278d06bfacea01c1.md)
 - [CheckInTopicAttachmentDetail600ecde4c8421000278d06bfacea01c1AllOf](docs/CheckInTopicAttachmentDetail600ecde4c8421000278d06bfacea01c1AllOf.md)
 - [CheckInTopicDetail3267c0ba92a010001688d79b032b03b8](docs/CheckInTopicDetail3267c0ba92a010001688d79b032b03b8.md)
 - [CheckInTopicDetail3267c0ba92a010001688d79b032b03b8AllOf](docs/CheckInTopicDetail3267c0ba92a010001688d79b032b03b8AllOf.md)
 - [CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015](docs/CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015.md)
 - [CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015AllOf](docs/CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015AllOf.md)
 - [CheckInsSummaryB3a69f47a499100010ce6be72bfe001d](docs/CheckInsSummaryB3a69f47a499100010ce6be72bfe001d.md)
 - [CheckInsSummaryB3a69f47a499100010ce6be72bfe001dAllOf](docs/CheckInsSummaryB3a69f47a499100010ce6be72bfe001dAllOf.md)
 - [Comments7d98fd55aeee100022968e52a1b31c60](docs/Comments7d98fd55aeee100022968e52a1b31c60.md)
 - [Comments7d98fd55aeee100022968e52a1b31c60AllOf](docs/Comments7d98fd55aeee100022968e52a1b31c60AllOf.md)
 - [Comments86093b8a932f10001499f356ff83012e](docs/Comments86093b8a932f10001499f356ff83012e.md)
 - [Comments86093b8a932f10001499f356ff83012eAllOf](docs/Comments86093b8a932f10001499f356ff83012eAllOf.md)
 - [Company56fe0dd0eca1100019cfe097d26a03f2](docs/Company56fe0dd0eca1100019cfe097d26a03f2.md)
 - [CompanyInsiderTypeRelatedView7deab99f645f10001000f8a388740081](docs/CompanyInsiderTypeRelatedView7deab99f645f10001000f8a388740081.md)
 - [CompanyInsiderTypeRelatedView7deab99f645f10001000f8a388740081AllOf](docs/CompanyInsiderTypeRelatedView7deab99f645f10001000f8a388740081AllOf.md)
 - [ContentType43b30ba735b8100011ee47993f11014a](docs/ContentType43b30ba735b8100011ee47993f11014a.md)
 - [ContentType600ecde4c842100027eaa21d044e01cf](docs/ContentType600ecde4c842100027eaa21d044e01cf.md)
 - [ContentTypeEf244acfe6cf10002ebe92e7001601d8](docs/ContentTypeEf244acfe6cf10002ebe92e7001601d8.md)
 - [CostCenter5aabf8e28cb3100010a999f40b07024f](docs/CostCenter5aabf8e28cb3100010a999f40b07024f.md)
 - [Country3b00708994e4100004edeb4e0d37128c](docs/Country3b00708994e4100004edeb4e0d37128c.md)
 - [Country3b00708994e41000095e4647007012bc](docs/Country3b00708994e41000095e4647007012bc.md)
 - [CountryAf21e47ff7c01000092ecf4d7ad30270](docs/CountryAf21e47ff7c01000092ecf4d7ad30270.md)
 - [CountryDataForLocationDataAf21e47ff7c01000092e0e4f9a22026e](docs/CountryDataForLocationDataAf21e47ff7c01000092e0e4f9a22026e.md)
 - [CountryDataForLocationDataAf21e47ff7c01000092e0e4f9a22026eAllOf](docs/CountryDataForLocationDataAf21e47ff7c01000092e0e4f9a22026eAllOf.md)
 - [CountryOrRegion3b00708994e4100007848bc917a112a6](docs/CountryOrRegion3b00708994e4100007848bc917a112a6.md)
 - [CountryOrRegionRelatedView3b00708994e4100007e9c8f14e3812ae](docs/CountryOrRegionRelatedView3b00708994e4100007e9c8f14e3812ae.md)
 - [CountryOrRegionRelatedView3b00708994e4100007e9c8f14e3812aeAllOf](docs/CountryOrRegionRelatedView3b00708994e4100007e9c8f14e3812aeAllOf.md)
 - [CountryRelatedView7deab99f645f10000cf305c30e260054](docs/CountryRelatedView7deab99f645f10000cf305c30e260054.md)
 - [CountryRelatedView7deab99f645f10000cf305c30e260054AllOf](docs/CountryRelatedView7deab99f645f10000cf305c30e260054AllOf.md)
 - [CreateSkillUsageRepresentation98f198f5056b1000196313ffe9a0225e](docs/CreateSkillUsageRepresentation98f198f5056b1000196313ffe9a0225e.md)
 - [CreateSkillUsageRepresentation98f198f5056b1000196313ffe9a0225eAllOf](docs/CreateSkillUsageRepresentation98f198f5056b1000196313ffe9a0225eAllOf.md)
 - [CreatorB3a69f47a49910001687de28dd71003d](docs/CreatorB3a69f47a49910001687de28dd71003d.md)
 - [CreatorD81c816de26f10000f521459ac80001d](docs/CreatorD81c816de26f10000f521459ac80001d.md)
 - [Currency2d0ca2cb2448100009c54386a8570e07](docs/Currency2d0ca2cb2448100009c54386a8570e07.md)
 - [CustomOrganizationDetails3950e273020a100017857926d35d369c](docs/CustomOrganizationDetails3950e273020a100017857926d35d369c.md)
 - [CustomOrganizationDetails3950e273020a100017857926d35d369cAllOf](docs/CustomOrganizationDetails3950e273020a100017857926d35d369cAllOf.md)
 - [DifficultyToFill89a0b59e7cce1000074acb57c0c50162](docs/DifficultyToFill89a0b59e7cce1000074acb57c0c50162.md)
 - [DifficultyToFillRelatedView3b00708994e41000032f4de84695004c](docs/DifficultyToFillRelatedView3b00708994e41000032f4de84695004c.md)
 - [DifficultyToFillRelatedView3b00708994e41000032f4de84695004cAllOf](docs/DifficultyToFillRelatedView3b00708994e41000032f4de84695004cAllOf.md)
 - [DisplayExplicitSkillRepresentationD6ca778018011000182fa5be1ae901a8](docs/DisplayExplicitSkillRepresentationD6ca778018011000182fa5be1ae901a8.md)
 - [DisplayExplicitSkillRepresentationD6ca778018011000182fa5be1ae901a8AllOf](docs/DisplayExplicitSkillRepresentationD6ca778018011000182fa5be1ae901a8AllOf.md)
 - [ERRORMODELREFERENCE](docs/ERRORMODELREFERENCE.md)
 - [EventAttachmentsForToolbar43b30ba735b8100011ee4767246d0143](docs/EventAttachmentsForToolbar43b30ba735b8100011ee4767246d0143.md)
 - [EventAttachmentsForToolbar43b30ba735b8100011ee4767246d0143AllOf](docs/EventAttachmentsForToolbar43b30ba735b8100011ee4767246d0143AllOf.md)
 - [EventState54e611eca2c910000fbc4579181c0111](docs/EventState54e611eca2c910000fbc4579181c0111.md)
 - [EventState54e611eca2c910000fbc4579181c0111AllOf](docs/EventState54e611eca2c910000fbc4579181c0111AllOf.md)
 - [EventStateOrganizationAssignmentF3e1ff305e2d100003327f7b7fa103f1](docs/EventStateOrganizationAssignmentF3e1ff305e2d100003327f7b7fa103f1.md)
 - [EventStateOrganizationAssignmentF3e1ff305e2d100003327f7b7fa103f1AllOf](docs/EventStateOrganizationAssignmentF3e1ff305e2d100003327f7b7fa103f1AllOf.md)
 - [ExternalSkillLevelA39462f09c44100005d46fd77ef00000](docs/ExternalSkillLevelA39462f09c44100005d46fd77ef00000.md)
 - [ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf](docs/ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf.md)
 - [ExternalSkillLevelDetail1c67ac98c0f310002706be33dcdb0000](docs/ExternalSkillLevelDetail1c67ac98c0f310002706be33dcdb0000.md)
 - [ExternalSkillLevelDetail1c67ac98c0f310002706be33dcdb0000AllOf](docs/ExternalSkillLevelDetail1c67ac98c0f310002706be33dcdb0000AllOf.md)
 - [FACETSMODELREFERENCEInner](docs/FACETSMODELREFERENCEInner.md)
 - [FACETSMODELREFERENCEInnerValuesInner](docs/FACETSMODELREFERENCEInnerValuesInner.md)
 - [For5d688bd57bb910001815ab3dd10024a9](docs/For5d688bd57bb910001815ab3dd10024a9.md)
 - [Frequency2d0ca2cb2448100009c5436d5d670e06](docs/Frequency2d0ca2cb2448100009c5436d5d670e06.md)
 - [FundA18edb56aca0100014a4a0b27352045c](docs/FundA18edb56aca0100014a4a0b27352045c.md)
 - [GiftA18edb56aca0100014a4a0a9f876045b](docs/GiftA18edb56aca0100014a4a0a9f876045b.md)
 - [GrantA18edb56aca0100014a4a0bcf25c045e](docs/GrantA18edb56aca0100014a4a0bcf25c045e.md)
 - [HeadcountOption97af9049a5fd10001c48896fbde30000](docs/HeadcountOption97af9049a5fd10001c48896fbde30000.md)
 - [HomeContactChangeEventF42ba27d87ed10001aa58a5d231b1621](docs/HomeContactChangeEventF42ba27d87ed10001aa58a5d231b1621.md)
 - [HomeContactChangeEventF42ba27d87ed10001aa58a5d231b1621AllOf](docs/HomeContactChangeEventF42ba27d87ed10001aa58a5d231b1621AllOf.md)
 - [INSTANCEMODELREFERENCE](docs/INSTANCEMODELREFERENCE.md)
 - [Job35b8f199c29410002508ffd7ad6101f3](docs/Job35b8f199c29410002508ffd7ad6101f3.md)
 - [Job75e528a78e9a10000ab7512c5c550115](docs/Job75e528a78e9a10000ab7512c5c550115.md)
 - [JobCategory89a0b59e7cce1000074acb471919015f](docs/JobCategory89a0b59e7cce1000074acb471919015f.md)
 - [JobCategoryRelatedView7deab99f645f10000f8582dc572d0075](docs/JobCategoryRelatedView7deab99f645f10000f8582dc572d0075.md)
 - [JobCategoryRelatedView7deab99f645f10000f8582dc572d0075AllOf](docs/JobCategoryRelatedView7deab99f645f10000f8582dc572d0075AllOf.md)
 - [JobChangesGetAdministrativeOptionsResponse](docs/JobChangesGetAdministrativeOptionsResponse.md)
 - [JobChangesGetBusinessTitleResponse](docs/JobChangesGetBusinessTitleResponse.md)
 - [JobChangesGetCommentByIdResponse](docs/JobChangesGetCommentByIdResponse.md)
 - [JobChangesGetContractOptionsResponse](docs/JobChangesGetContractOptionsResponse.md)
 - [JobChangesGetJobClassificationResponse](docs/JobChangesGetJobClassificationResponse.md)
 - [JobChangesGetJobProfileResponse](docs/JobChangesGetJobProfileResponse.md)
 - [JobChangesGetLocationInfoResponse](docs/JobChangesGetLocationInfoResponse.md)
 - [JobChangesGetMoveTeamOptionResponse](docs/JobChangesGetMoveTeamOptionResponse.md)
 - [JobChangesGetOpeningOptionsResponse](docs/JobChangesGetOpeningOptionsResponse.md)
 - [JobChangesGetPositionByIdResponse](docs/JobChangesGetPositionByIdResponse.md)
 - [JobChangesGetStartDetailsResponse](docs/JobChangesGetStartDetailsResponse.md)
 - [JobChangesStartDetailsDataCe861a6a360d10002d40f176b7180020](docs/JobChangesStartDetailsDataCe861a6a360d10002d40f176b7180020.md)
 - [JobChangesStartDetailsDataCe861a6a360d10002d40f176b7180020AllOf](docs/JobChangesStartDetailsDataCe861a6a360d10002d40f176b7180020AllOf.md)
 - [JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111](docs/JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111.md)
 - [JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf](docs/JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf.md)
 - [JobData1bfa8925c50510000ae4479925510026](docs/JobData1bfa8925c50510000ae4479925510026.md)
 - [JobData1bfa8925c50510000ae4479925510026AllOf](docs/JobData1bfa8925c50510000ae4479925510026AllOf.md)
 - [JobDataForWorkerB8ac205877fd10000ea91719a02a00a2](docs/JobDataForWorkerB8ac205877fd10000ea91719a02a00a2.md)
 - [JobDataForWorkerB8ac205877fd10000ea91719a02a00a2AllOf](docs/JobDataForWorkerB8ac205877fd10000ea91719a02a00a2AllOf.md)
 - [JobFamiliesListResponse](docs/JobFamiliesListResponse.md)
 - [JobFamilyGroup51ed1475e9e6100006229cfe817b0014](docs/JobFamilyGroup51ed1475e9e6100006229cfe817b0014.md)
 - [JobFamilyGroupView7164d34509ba10000b8610c566ea002d](docs/JobFamilyGroupView7164d34509ba10000b8610c566ea002d.md)
 - [JobFamilyGroupView7164d34509ba10000b8610c566ea002dAllOf](docs/JobFamilyGroupView7164d34509ba10000b8610c566ea002dAllOf.md)
 - [JobFamilyRelatedView3b00708994e410000e0e2540529b12d6](docs/JobFamilyRelatedView3b00708994e410000e0e2540529b12d6.md)
 - [JobFamilyRelatedView3b00708994e410000e0e2540529b12d6AllOf](docs/JobFamilyRelatedView3b00708994e410000e0e2540529b12d6AllOf.md)
 - [JobFamilyView51ed1475e9e6100005d10fcedc5a000a](docs/JobFamilyView51ed1475e9e6100005d10fcedc5a000a.md)
 - [JobFamilyView51ed1475e9e6100005d10fcedc5a000aAllOf](docs/JobFamilyView51ed1475e9e6100005d10fcedc5a000aAllOf.md)
 - [JobLevel89a0b59e7cce1000074acb3c1e8e015d](docs/JobLevel89a0b59e7cce1000074acb3c1e8e015d.md)
 - [JobLevelRelatedView7deab99f645f10000f06cbbf927a0069](docs/JobLevelRelatedView7deab99f645f10000f06cbbf927a0069.md)
 - [JobLevelRelatedView7deab99f645f10000f06cbbf927a0069AllOf](docs/JobLevelRelatedView7deab99f645f10000f06cbbf927a0069AllOf.md)
 - [JobProfile3db8095ffa18100013f019afc6d30116](docs/JobProfile3db8095ffa18100013f019afc6d30116.md)
 - [JobProfile6fb921f8a11d10001d5268980bbb0097](docs/JobProfile6fb921f8a11d10001d5268980bbb0097.md)
 - [JobProfileB8ac205877fd10000ea9174f73c500aa](docs/JobProfileB8ac205877fd10000ea9174f73c500aa.md)
 - [JobProfileDetailView7deab99f645f10000bd5e61a1b780041](docs/JobProfileDetailView7deab99f645f10000bd5e61a1b780041.md)
 - [JobProfileDetailView7deab99f645f10000bd5e61a1b780041AllOf](docs/JobProfileDetailView7deab99f645f10000bd5e61a1b780041AllOf.md)
 - [JobProfileExemptRelatedView3b00708994e41000076da515387812a2](docs/JobProfileExemptRelatedView3b00708994e41000076da515387812a2.md)
 - [JobProfileExemptRelatedView3b00708994e41000076da515387812a2AllOf](docs/JobProfileExemptRelatedView3b00708994e41000076da515387812a2AllOf.md)
 - [JobProfileJobViewFab4a151b24810000d511d61ee641262](docs/JobProfileJobViewFab4a151b24810000d511d61ee641262.md)
 - [JobProfileJobViewFab4a151b24810000d511d61ee641262AllOf](docs/JobProfileJobViewFab4a151b24810000d511d61ee641262AllOf.md)
 - [JobProfilePayRateTypeRelatedView3b00708994e4100008d4b09e903f12b5](docs/JobProfilePayRateTypeRelatedView3b00708994e4100008d4b09e903f12b5.md)
 - [JobProfilePayRateTypeRelatedView3b00708994e4100008d4b09e903f12b5AllOf](docs/JobProfilePayRateTypeRelatedView3b00708994e4100008d4b09e903f12b5AllOf.md)
 - [JobProfileSummaryView7deab99f645f10000b5152ce2d700034](docs/JobProfileSummaryView7deab99f645f10000b5152ce2d700034.md)
 - [JobProfileSummaryView7deab99f645f10000b5152ce2d700034AllOf](docs/JobProfileSummaryView7deab99f645f10000b5152ce2d700034AllOf.md)
 - [JobProfileView51ed1475e9e6100006c698ef68480017](docs/JobProfileView51ed1475e9e6100006c698ef68480017.md)
 - [JobProfileView51ed1475e9e6100006c698ef68480017AllOf](docs/JobProfileView51ed1475e9e6100006c698ef68480017AllOf.md)
 - [JobProfilesListCollectionResponse](docs/JobProfilesListCollectionResponse.md)
 - [JobRequisitionDfc4e58f730810001ad60325d9bc52cf](docs/JobRequisitionDfc4e58f730810001ad60325d9bc52cf.md)
 - [JobTypeB8ac205877fd100005c55b45c6400057](docs/JobTypeB8ac205877fd100005c55b45c6400057.md)
 - [JobTypeB8ac205877fd10000ea91752f39c00ab](docs/JobTypeB8ac205877fd10000ea91752f39c00ab.md)
 - [JobTypeDataB8ac205877fd100005c3b50b74a30055](docs/JobTypeDataB8ac205877fd100005c3b50b74a30055.md)
 - [JobTypeDataB8ac205877fd100005c3b50b74a30055AllOf](docs/JobTypeDataB8ac205877fd100005c3b50b74a30055AllOf.md)
 - [JobWorkspaceData1005157e3d631000144205466a6c13d3](docs/JobWorkspaceData1005157e3d631000144205466a6c13d3.md)
 - [JobWorkspaceData1005157e3d631000144205466a6c13d3AllOf](docs/JobWorkspaceData1005157e3d631000144205466a6c13d3AllOf.md)
 - [JobsGetCollectionResponse](docs/JobsGetCollectionResponse.md)
 - [JobsGetWorkspacesResponse](docs/JobsGetWorkspacesResponse.md)
 - [Location6d3eb084b4c410002b617efb943f0059](docs/Location6d3eb084b4c410002b617efb943f0059.md)
 - [Location6da81665c26510001fc6b1d42fae5f7b](docs/Location6da81665c26510001fc6b1d42fae5f7b.md)
 - [Location75e528a78e9a10000ab75125ebe50114](docs/Location75e528a78e9a10000ab75125ebe50114.md)
 - [Location90151d6c4ff110001bfa027116820278](docs/Location90151d6c4ff110001bfa027116820278.md)
 - [LocationB8ac205877fd10000ea91737c7da00a5](docs/LocationB8ac205877fd10000ea91737c7da00a5.md)
 - [LocationDataJobView6d3eb084b4c410002b5fa13f0c9d0056](docs/LocationDataJobView6d3eb084b4c410002b5fa13f0c9d0056.md)
 - [LocationDataJobView6d3eb084b4c410002b5fa13f0c9d0056AllOf](docs/LocationDataJobView6d3eb084b4c410002b5fa13f0c9d0056AllOf.md)
 - [MULTIPLEINSTANCEMODELREFERENCE](docs/MULTIPLEINSTANCEMODELREFERENCE.md)
 - [ManagementLevel89a0b59e7cce1000074acb1d768e0158](docs/ManagementLevel89a0b59e7cce1000074acb1d768e0158.md)
 - [ManagementLevelRelatedView7deab99f645f10000d69adf2c932005c](docs/ManagementLevelRelatedView7deab99f645f10000d69adf2c932005c.md)
 - [ManagementLevelRelatedView7deab99f645f10000d69adf2c932005cAllOf](docs/ManagementLevelRelatedView7deab99f645f10000d69adf2c932005cAllOf.md)
 - [ManagerWorkerViewA02c2e1916fa10000cbb84be81ce0027](docs/ManagerWorkerViewA02c2e1916fa10000cbb84be81ce0027.md)
 - [ManagerWorkerViewA02c2e1916fa10000cbb84be81ce0027AllOf](docs/ManagerWorkerViewA02c2e1916fa10000cbb84be81ce0027AllOf.md)
 - [MassActionHeaderCf97466f96d910002bd32afbf0000001](docs/MassActionHeaderCf97466f96d910002bd32afbf0000001.md)
 - [MassActionWorksheet31485c9a93c0100007276cf4e5640000](docs/MassActionWorksheet31485c9a93c0100007276cf4e5640000.md)
 - [OrgChartView643e3a12629710000554e0338e670044](docs/OrgChartView643e3a12629710000554e0338e670044.md)
 - [OrgChartView643e3a12629710000554e0338e670044AllOf](docs/OrgChartView643e3a12629710000554e0338e670044AllOf.md)
 - [OrganizationAssignmentChangesBusinessUnitData5aabf8e28cb310002520b2a2b31d0365](docs/OrganizationAssignmentChangesBusinessUnitData5aabf8e28cb310002520b2a2b31d0365.md)
 - [OrganizationAssignmentChangesBusinessUnitData5aabf8e28cb310002520b2a2b31d0365AllOf](docs/OrganizationAssignmentChangesBusinessUnitData5aabf8e28cb310002520b2a2b31d0365AllOf.md)
 - [OrganizationAssignmentChangesCompanyData652d516fdff41000086e0b9c96950354](docs/OrganizationAssignmentChangesCompanyData652d516fdff41000086e0b9c96950354.md)
 - [OrganizationAssignmentChangesCompanyData652d516fdff41000086e0b9c96950354AllOf](docs/OrganizationAssignmentChangesCompanyData652d516fdff41000086e0b9c96950354AllOf.md)
 - [OrganizationAssignmentChangesCostCenterData5aabf8e28cb3100010a999db2700024e](docs/OrganizationAssignmentChangesCostCenterData5aabf8e28cb3100010a999db2700024e.md)
 - [OrganizationAssignmentChangesCostCenterData5aabf8e28cb3100010a999db2700024eAllOf](docs/OrganizationAssignmentChangesCostCenterData5aabf8e28cb3100010a999db2700024eAllOf.md)
 - [OrganizationAssignmentChangesCostingDataA18edb56aca0100014a4a09dc57e045a](docs/OrganizationAssignmentChangesCostingDataA18edb56aca0100014a4a09dc57e045a.md)
 - [OrganizationAssignmentChangesCostingDataA18edb56aca0100014a4a09dc57e045aAllOf](docs/OrganizationAssignmentChangesCostingDataA18edb56aca0100014a4a09dc57e045aAllOf.md)
 - [OrganizationAssignmentChangesCustomOrganizationDetailsData53cd2b632146100011e9bf4e7041551f](docs/OrganizationAssignmentChangesCustomOrganizationDetailsData53cd2b632146100011e9bf4e7041551f.md)
 - [OrganizationAssignmentChangesCustomOrganizationDetailsData53cd2b632146100011e9bf4e7041551fAllOf](docs/OrganizationAssignmentChangesCustomOrganizationDetailsData53cd2b632146100011e9bf4e7041551fAllOf.md)
 - [OrganizationAssignmentChangesGetBusinessUnitResponse](docs/OrganizationAssignmentChangesGetBusinessUnitResponse.md)
 - [OrganizationAssignmentChangesGetCommentResponse](docs/OrganizationAssignmentChangesGetCommentResponse.md)
 - [OrganizationAssignmentChangesGetCompanyResponse](docs/OrganizationAssignmentChangesGetCompanyResponse.md)
 - [OrganizationAssignmentChangesGetCostCenterResponse](docs/OrganizationAssignmentChangesGetCostCenterResponse.md)
 - [OrganizationAssignmentChangesGetCostingOrganizationsResponse](docs/OrganizationAssignmentChangesGetCostingOrganizationsResponse.md)
 - [OrganizationAssignmentChangesGetCustomOrganizationsResponse](docs/OrganizationAssignmentChangesGetCustomOrganizationsResponse.md)
 - [OrganizationAssignmentChangesGetRegionResponse](docs/OrganizationAssignmentChangesGetRegionResponse.md)
 - [OrganizationAssignmentChangesGetStartDetailsResponse](docs/OrganizationAssignmentChangesGetStartDetailsResponse.md)
 - [OrganizationAssignmentChangesPostCc45d62b623c1000132ac812c30a052e](docs/OrganizationAssignmentChangesPostCc45d62b623c1000132ac812c30a052e.md)
 - [OrganizationAssignmentChangesPostCc45d62b623c1000132ac812c30a052eAllOf](docs/OrganizationAssignmentChangesPostCc45d62b623c1000132ac812c30a052eAllOf.md)
 - [OrganizationAssignmentChangesPostPositionCf97466f96d9100029bffcf91c120000](docs/OrganizationAssignmentChangesPostPositionCf97466f96d9100029bffcf91c120000.md)
 - [OrganizationAssignmentChangesPostPositionCf97466f96d9100029bffcf91c120000AllOf](docs/OrganizationAssignmentChangesPostPositionCf97466f96d9100029bffcf91c120000AllOf.md)
 - [OrganizationAssignmentChangesRegionDataA18edb56aca0100006997e68e5780373](docs/OrganizationAssignmentChangesRegionDataA18edb56aca0100006997e68e5780373.md)
 - [OrganizationAssignmentChangesRegionDataA18edb56aca0100006997e68e5780373AllOf](docs/OrganizationAssignmentChangesRegionDataA18edb56aca0100006997e68e5780373AllOf.md)
 - [OrganizationAssignmentChangesStartDetailsData90009f2bfc49100017b10cd07d19063b](docs/OrganizationAssignmentChangesStartDetailsData90009f2bfc49100017b10cd07d19063b.md)
 - [OrganizationAssignmentChangesStartDetailsData90009f2bfc49100017b10cd07d19063bAllOf](docs/OrganizationAssignmentChangesStartDetailsData90009f2bfc49100017b10cd07d19063bAllOf.md)
 - [OrganizationType3950e273020a100017857958e234369d](docs/OrganizationType3950e273020a100017857958e234369d.md)
 - [OverallBusinessProcess5d688bd57bb910001815ab49927724aa](docs/OverallBusinessProcess5d688bd57bb910001815ab49927724aa.md)
 - [ParticipantB3a69f47a49910001687de1d4c75003c](docs/ParticipantB3a69f47a49910001687de1d4c75003c.md)
 - [ParticipantD81c816de26f10000f52144d053f001b](docs/ParticipantD81c816de26f10000f52144d053f001b.md)
 - [PayRateType3b00708994e410000c3d01aea96012c1](docs/PayRateType3b00708994e410000c3d01aea96012c1.md)
 - [PayRateTypeD25283821c01100016756a14eb650000](docs/PayRateTypeD25283821c01100016756a14eb650000.md)
 - [PayRateTypeRelatedView3b00708994e410000c52776049ba12c3](docs/PayRateTypeRelatedView3b00708994e410000c52776049ba12c3.md)
 - [PayRateTypeRelatedView3b00708994e410000c52776049ba12c3AllOf](docs/PayRateTypeRelatedView3b00708994e410000c52776049ba12c3AllOf.md)
 - [Person0ad147648b0a1000237bd486634a001a](docs/Person0ad147648b0a1000237bd486634a001a.md)
 - [Person86093b8a932f10001499f38c72410130](docs/Person86093b8a932f10001499f38c72410130.md)
 - [PersonDataViewBe343791f59d100028d6a277ca8a0017](docs/PersonDataViewBe343791f59d100028d6a277ca8a0017.md)
 - [PersonDataViewBe343791f59d100028d6a277ca8a0017AllOf](docs/PersonDataViewBe343791f59d100028d6a277ca8a0017AllOf.md)
 - [Position827372de4457100019c0e9c5977d0000](docs/Position827372de4457100019c0e9c5977d0000.md)
 - [Position99f6257185e61000043aadd66df203bb](docs/Position99f6257185e61000043aadd66df203bb.md)
 - [PositionCf97466f96d9100029bffcf91c120001](docs/PositionCf97466f96d9100029bffcf91c120001.md)
 - [PositionDfc4e58f730810001ad60369c23452d1](docs/PositionDfc4e58f730810001ad60369c23452d1.md)
 - [PositionWorkerType05d4c45042b610001030ee47f2c90118](docs/PositionWorkerType05d4c45042b610001030ee47f2c90118.md)
 - [PrimaryJob352c3a97ecd51000353cba144c5b0042](docs/PrimaryJob352c3a97ecd51000353cba144c5b0042.md)
 - [ProgramA18edb56aca0100014a4a0b7ddf7045d](docs/ProgramA18edb56aca0100014a4a0b7ddf7045d.md)
 - [PurchaseOrder2d0ca2cb2448100009c5433bcff60e05](docs/PurchaseOrder2d0ca2cb2448100009c5433bcff60e05.md)
 - [Reason6da81665c26510001f34d0a154765e9b](docs/Reason6da81665c26510001f34d0a154765e9b.md)
 - [Reason85deac43cd1a10000b96c80c118f171e](docs/Reason85deac43cd1a10000b96c80c118f171e.md)
 - [RegionA18edb56aca0100006997ec7e07d0374](docs/RegionA18edb56aca0100006997ec7e07d0374.md)
 - [RegionRelatedView3b00708994e41000053151ffd9e31293](docs/RegionRelatedView3b00708994e41000053151ffd9e31293.md)
 - [RegionRelatedView3b00708994e41000053151ffd9e31293AllOf](docs/RegionRelatedView3b00708994e41000053151ffd9e31293AllOf.md)
 - [ServiceDatesData6b1db753fd82100027b0c8519c860018](docs/ServiceDatesData6b1db753fd82100027b0c8519c860018.md)
 - [ServiceDatesData6b1db753fd82100027b0c8519c860018AllOf](docs/ServiceDatesData6b1db753fd82100027b0c8519c860018AllOf.md)
 - [SkillItem4b4b7d34b4a210001c7927f9e1330080](docs/SkillItem4b4b7d34b4a210001c7927f9e1330080.md)
 - [SkillItem98f198f5056b100019631445471d225f](docs/SkillItem98f198f5056b100019631445471d225f.md)
 - [SkillItemAddDefinitionFaed9891d75a10001e9a289910540228](docs/SkillItemAddDefinitionFaed9891d75a10001e9a289910540228.md)
 - [SkillItemAddDefinitionFaed9891d75a10001e9a289910540228AllOf](docs/SkillItemAddDefinitionFaed9891d75a10001e9a289910540228AllOf.md)
 - [SkillItemAddRepresentationC5fabc4ca81610000eaeb4ff2f000137](docs/SkillItemAddRepresentationC5fabc4ca81610000eaeb4ff2f000137.md)
 - [SkillItemAddRepresentationC5fabc4ca81610000eaeb4ff2f000137AllOf](docs/SkillItemAddRepresentationC5fabc4ca81610000eaeb4ff2f000137AllOf.md)
 - [SkillItemD6ca778018011000182fa5f3b32001aa](docs/SkillItemD6ca778018011000182fa5f3b32001aa.md)
 - [SkillItemDisplayDefinition4b4b7d34b4a21000301eaf52086700d8](docs/SkillItemDisplayDefinition4b4b7d34b4a21000301eaf52086700d8.md)
 - [SkillItemDisplayDefinition4b4b7d34b4a21000301eaf52086700d8AllOf](docs/SkillItemDisplayDefinition4b4b7d34b4a21000301eaf52086700d8AllOf.md)
 - [SkillItemSourceAddRepresentationC5fabc4ca81610000d5d15309ac90122](docs/SkillItemSourceAddRepresentationC5fabc4ca81610000d5d15309ac90122.md)
 - [SkillItemSourceAddRepresentationC5fabc4ca81610000d5d15309ac90122AllOf](docs/SkillItemSourceAddRepresentationC5fabc4ca81610000d5d15309ac90122AllOf.md)
 - [SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12de](docs/SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12de.md)
 - [SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf](docs/SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf.md)
 - [SkillSourceC5fabc4ca81610000d5d154e6e3c0123](docs/SkillSourceC5fabc4ca81610000d5d154e6e3c0123.md)
 - [SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8](docs/SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8.md)
 - [SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf](docs/SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf.md)
 - [Status54e611eca2c910000fbc4599be0b0112](docs/Status54e611eca2c910000fbc4599be0b0112.md)
 - [Superior643e3a1262971000145238b2ccd10059](docs/Superior643e3a1262971000145238b2ccd10059.md)
 - [SupervisoryOrganization75e528a78e9a10000ab75132a9df0116](docs/SupervisoryOrganization75e528a78e9a10000ab75132a9df0116.md)
 - [SupervisoryOrganization827372de445710001cfe36968a480000](docs/SupervisoryOrganization827372de445710001cfe36968a480000.md)
 - [SupervisoryOrganizationB8ac205877fd10000ea91743659800a7](docs/SupervisoryOrganizationB8ac205877fd10000ea91743659800a7.md)
 - [SupervisoryOrganizationE3267ea37e6f100032c00c34a99e74d8](docs/SupervisoryOrganizationE3267ea37e6f100032c00c34a99e74d8.md)
 - [SupervisoryOrganizationFab4a151b24810000d13073c5d341257](docs/SupervisoryOrganizationFab4a151b24810000d13073c5d341257.md)
 - [SupervisoryOrganizationJobViewFab4a151b24810000d29746fb7e21259](docs/SupervisoryOrganizationJobViewFab4a151b24810000d29746fb7e21259.md)
 - [SupervisoryOrganizationJobViewFab4a151b24810000d29746fb7e21259AllOf](docs/SupervisoryOrganizationJobViewFab4a151b24810000d29746fb7e21259AllOf.md)
 - [SupervisoryOrganizationViewA02c2e1916fa100009e137235f1f0018](docs/SupervisoryOrganizationViewA02c2e1916fa100009e137235f1f0018.md)
 - [SupervisoryOrganizationViewA02c2e1916fa100009e137235f1f0018AllOf](docs/SupervisoryOrganizationViewA02c2e1916fa100009e137235f1f0018AllOf.md)
 - [SupervisoryOrganizationsGetByIdResponse](docs/SupervisoryOrganizationsGetByIdResponse.md)
 - [SupervisoryOrganizationsGetMembersResponse](docs/SupervisoryOrganizationsGetMembersResponse.md)
 - [SupervisoryOrganizationsGetOrgChartResponse](docs/SupervisoryOrganizationsGetOrgChartResponse.md)
 - [Template2b1b95dfe4af100007f63081aec5158e](docs/Template2b1b95dfe4af100007f63081aec5158e.md)
 - [Template2b1b95dfe4af100009f30dc769a31686](docs/Template2b1b95dfe4af100009f30dc769a31686.md)
 - [TimeType05d4c45042b610000bb540b7458e0108](docs/TimeType05d4c45042b610000bb540b7458e0108.md)
 - [TransactionStatus7457adcbe0fa1000089b63ab3a510000](docs/TransactionStatus7457adcbe0fa1000089b63ab3a510000.md)
 - [UploadedByB32ff437243510000e22e06470370160](docs/UploadedByB32ff437243510000e22e06470370160.md)
 - [VALIDATIONERRORMODELREFERENCE](docs/VALIDATIONERRORMODELREFERENCE.md)
 - [VALIDATIONERRORMODELREFERENCEAllOf](docs/VALIDATIONERRORMODELREFERENCEAllOf.md)
 - [WorkContactChangeEvent5fca6c96c1c81000142fd03784140113](docs/WorkContactChangeEvent5fca6c96c1c81000142fd03784140113.md)
 - [WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf](docs/WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf.md)
 - [WorkShift0ee7bb8b41db1000143d4e4822174f2e](docs/WorkShift0ee7bb8b41db1000143d4e4822174f2e.md)
 - [WorkSpace0ee7bb8b41db10001e7db6a6c3e55663](docs/WorkSpace0ee7bb8b41db10001e7db6a6c3e55663.md)
 - [WorkSpace426ac445037110001b3eb91ddf6f0100](docs/WorkSpace426ac445037110001b3eb91ddf6f0100.md)
 - [WorkStudy05d4c45042b610000ba2f83c70f30101](docs/WorkStudy05d4c45042b610000ba2f83c70f30101.md)
 - [Worker271bbd673582100010110b9f9a6d99e1](docs/Worker271bbd673582100010110b9f9a6d99e1.md)
 - [Worker90009f2bfc4910001b166d44a72c0727](docs/Worker90009f2bfc4910001b166d44a72c0727.md)
 - [WorkerDataC2466b0778c610000d1936006720000e](docs/WorkerDataC2466b0778c610000d1936006720000e.md)
 - [WorkerDataC2466b0778c610000d1936006720000eAllOf](docs/WorkerDataC2466b0778c610000d1936006720000eAllOf.md)
 - [WorkerFab4a151b24810000e66f769304c126b](docs/WorkerFab4a151b24810000e66f769304c126b.md)
 - [WorkerJobViewFab4a151b24810000e7ff8d0c7f0126d](docs/WorkerJobViewFab4a151b24810000e7ff8d0c7f0126d.md)
 - [WorkerJobViewFab4a151b24810000e7ff8d0c7f0126dAllOf](docs/WorkerJobViewFab4a151b24810000e7ff8d0c7f0126dAllOf.md)
 - [WorkerType3f78eeedc01d1000138d97d80e5a0000](docs/WorkerType3f78eeedc01d1000138d97d80e5a0000.md)
 - [WorkersCompensationCodeOverride05d4c45042b61000138500e185e0013f](docs/WorkersCompensationCodeOverride05d4c45042b61000138500e185e0013f.md)
 - [WorkersCompensationCodeRelatedView3b00708994e4100004af13d958811287](docs/WorkersCompensationCodeRelatedView3b00708994e4100004af13d958811287.md)
 - [WorkersCompensationCodeRelatedView3b00708994e4100004af13d958811287AllOf](docs/WorkersCompensationCodeRelatedView3b00708994e4100004af13d958811287AllOf.md)
 - [WorkersGetCheckInTopicsResponse](docs/WorkersGetCheckInTopicsResponse.md)
 - [WorkersGetCheckInsResponse](docs/WorkersGetCheckInsResponse.md)
 - [WorkersGetCollectionStaffingResponse](docs/WorkersGetCollectionStaffingResponse.md)
 - [WorkersGetExplicitSkillsResponse](docs/WorkersGetExplicitSkillsResponse.md)
 - [WorkersGetExternalSkillLevelResponse](docs/WorkersGetExternalSkillLevelResponse.md)
 - [WorkersGetServiceDatesResponse](docs/WorkersGetServiceDatesResponse.md)
 - [WorkersGetSkillItemsResponse](docs/WorkersGetSkillItemsResponse.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
