package com.konfigthis.client;

import com.konfigthis.client.api.PromptValuesApi;
import com.konfigthis.client.api.JobChangesApi;
import com.konfigthis.client.api.JobFamiliesApi;
import com.konfigthis.client.api.JobProfilesApi;
import com.konfigthis.client.api.JobsApi;
import com.konfigthis.client.api.OrganizationAssignmentChangesApi;
import com.konfigthis.client.api.SupervisoryOrganizationsApi;
import com.konfigthis.client.api.WorkersApi;

public class WorkdayStaffing {
    private ApiClient apiClient;
    public final PromptValuesApi promptValues;
    public final JobChangesApi jobChanges;
    public final JobFamiliesApi jobFamilies;
    public final JobProfilesApi jobProfiles;
    public final JobsApi jobs;
    public final OrganizationAssignmentChangesApi organizationAssignmentChanges;
    public final SupervisoryOrganizationsApi supervisoryOrganizations;
    public final WorkersApi workers;

    public WorkdayStaffing() {
        this(null);
    }

    public WorkdayStaffing(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.promptValues = new PromptValuesApi(this.apiClient);
        this.jobChanges = new JobChangesApi(this.apiClient);
        this.jobFamilies = new JobFamiliesApi(this.apiClient);
        this.jobProfiles = new JobProfilesApi(this.apiClient);
        this.jobs = new JobsApi(this.apiClient);
        this.organizationAssignmentChanges = new OrganizationAssignmentChangesApi(this.apiClient);
        this.supervisoryOrganizations = new SupervisoryOrganizationsApi(this.apiClient);
        this.workers = new WorkersApi(this.apiClient);
    }

}
