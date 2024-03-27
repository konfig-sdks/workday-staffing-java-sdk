/*
 * staffing
 * The Staffing REST APIs enable you to get and manage staffing information, such as jobs, job families, job profiles, supervisory organizations, worker check-ins, and job changes. The Staffing service also includes the /workers resource to access staffing information for non-terminated workers.    Related Information: - Administrator Guide: Setup Considerations: Job Changes
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.ERRORMODELREFERENCE;
import com.konfigthis.client.model.JobData1bfa8925c50510000ae4479925510026;
import com.konfigthis.client.model.JobWorkspaceData1005157e3d631000144205466a6c13d3;
import com.konfigthis.client.model.JobsGetCollectionResponse;
import com.konfigthis.client.model.JobsGetWorkspacesResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class JobsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public JobsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public JobsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getCollectionCall(Long limit, Long offset, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/jobs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCollectionValidateBeforeCall(Long limit, Long offset, final ApiCallback _callback) throws ApiException {
        return getCollectionCall(limit, offset, _callback);

    }


    private ApiResponse<JobsGetCollectionResponse> getCollectionWithHttpInfo(Long limit, Long offset) throws ApiException {
        okhttp3.Call localVarCall = getCollectionValidateBeforeCall(limit, offset, null);
        Type localVarReturnType = new TypeToken<JobsGetCollectionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getCollectionAsync(Long limit, Long offset, final ApiCallback<JobsGetCollectionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCollectionValidateBeforeCall(limit, offset, _callback);
        Type localVarReturnType = new TypeToken<JobsGetCollectionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetCollectionRequestBuilder {
        private Long limit;
        private Long offset;

        private GetCollectionRequestBuilder() {
        }

        /**
         * Set limit
         * @param limit The maximum number of objects in a single response. The default is 20. The maximum is 100. (optional)
         * @return GetCollectionRequestBuilder
         */
        public GetCollectionRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set offset
         * @param offset The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. (optional)
         * @return GetCollectionRequestBuilder
         */
        public GetCollectionRequestBuilder offset(Long offset) {
            this.offset = offset;
            return this;
        }
        
        /**
         * Build call for getCollection
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response. A successful response can return no matched data. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getCollectionCall(limit, offset, _callback);
        }


        /**
         * Execute getCollection request
         * @return JobsGetCollectionResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response. A successful response can return no matched data. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public JobsGetCollectionResponse execute() throws ApiException {
            ApiResponse<JobsGetCollectionResponse> localVarResp = getCollectionWithHttpInfo(limit, offset);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getCollection request with HTTP info returned
         * @return ApiResponse&lt;JobsGetCollectionResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response. A successful response can return no matched data. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<JobsGetCollectionResponse> executeWithHttpInfo() throws ApiException {
            return getCollectionWithHttpInfo(limit, offset);
        }

        /**
         * Execute getCollection request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response. A successful response can return no matched data. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<JobsGetCollectionResponse> _callback) throws ApiException {
            return getCollectionAsync(limit, offset, _callback);
        }
    }

    /**
     * Retrieves a collection of jobs.
     * Retrieves a collection of jobs.  Secured by: Worker Position: View  Scope: Staffing
     * @return GetCollectionRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response. A successful response can return no matched data. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An error occurred. </td><td>  -  </td></tr>
     </table>
     */
    public GetCollectionRequestBuilder getCollection() throws IllegalArgumentException {
        return new GetCollectionRequestBuilder();
    }
    private okhttp3.Call getJobByIdCall(String ID, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/jobs/{ID}"
            .replace("{" + "ID" + "}", localVarApiClient.escapeString(ID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getJobByIdValidateBeforeCall(String ID, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'ID' is set
        if (ID == null) {
            throw new ApiException("Missing the required parameter 'ID' when calling getJobById(Async)");
        }

        return getJobByIdCall(ID, _callback);

    }


    private ApiResponse<JobData1bfa8925c50510000ae4479925510026> getJobByIdWithHttpInfo(String ID) throws ApiException {
        okhttp3.Call localVarCall = getJobByIdValidateBeforeCall(ID, null);
        Type localVarReturnType = new TypeToken<JobData1bfa8925c50510000ae4479925510026>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getJobByIdAsync(String ID, final ApiCallback<JobData1bfa8925c50510000ae4479925510026> _callback) throws ApiException {

        okhttp3.Call localVarCall = getJobByIdValidateBeforeCall(ID, _callback);
        Type localVarReturnType = new TypeToken<JobData1bfa8925c50510000ae4479925510026>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetJobByIdRequestBuilder {
        private final String ID;

        private GetJobByIdRequestBuilder(String ID) {
            this.ID = ID;
        }

        /**
         * Build call for getJobById
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response. A successful response can return no matched data. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getJobByIdCall(ID, _callback);
        }


        /**
         * Execute getJobById request
         * @return JobData1bfa8925c50510000ae4479925510026
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response. A successful response can return no matched data. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public JobData1bfa8925c50510000ae4479925510026 execute() throws ApiException {
            ApiResponse<JobData1bfa8925c50510000ae4479925510026> localVarResp = getJobByIdWithHttpInfo(ID);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getJobById request with HTTP info returned
         * @return ApiResponse&lt;JobData1bfa8925c50510000ae4479925510026&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response. A successful response can return no matched data. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<JobData1bfa8925c50510000ae4479925510026> executeWithHttpInfo() throws ApiException {
            return getJobByIdWithHttpInfo(ID);
        }

        /**
         * Execute getJobById request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response. A successful response can return no matched data. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<JobData1bfa8925c50510000ae4479925510026> _callback) throws ApiException {
            return getJobByIdAsync(ID, _callback);
        }
    }

    /**
     * Retrieves a single job instance.
     * Retrieves a job with the specified job ID.  Secured by: Worker Position: View  Scope: Staffing
     * @param ID The Workday ID of the resource. (required)
     * @return GetJobByIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response. A successful response can return no matched data. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An error occurred. </td><td>  -  </td></tr>
     </table>
     */
    public GetJobByIdRequestBuilder getJobById(String ID) throws IllegalArgumentException {
        if (ID == null) throw new IllegalArgumentException("\"ID\" is required but got null");
            

        return new GetJobByIdRequestBuilder(ID);
    }
    private okhttp3.Call getWorkspaceCall(String ID, String subresourceID, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/jobs/{ID}/workspace/{subresourceID}"
            .replace("{" + "ID" + "}", localVarApiClient.escapeString(ID.toString()))
            .replace("{" + "subresourceID" + "}", localVarApiClient.escapeString(subresourceID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getWorkspaceValidateBeforeCall(String ID, String subresourceID, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'ID' is set
        if (ID == null) {
            throw new ApiException("Missing the required parameter 'ID' when calling getWorkspace(Async)");
        }

        // verify the required parameter 'subresourceID' is set
        if (subresourceID == null) {
            throw new ApiException("Missing the required parameter 'subresourceID' when calling getWorkspace(Async)");
        }

        return getWorkspaceCall(ID, subresourceID, _callback);

    }


    private ApiResponse<JobWorkspaceData1005157e3d631000144205466a6c13d3> getWorkspaceWithHttpInfo(String ID, String subresourceID) throws ApiException {
        okhttp3.Call localVarCall = getWorkspaceValidateBeforeCall(ID, subresourceID, null);
        Type localVarReturnType = new TypeToken<JobWorkspaceData1005157e3d631000144205466a6c13d3>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getWorkspaceAsync(String ID, String subresourceID, final ApiCallback<JobWorkspaceData1005157e3d631000144205466a6c13d3> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWorkspaceValidateBeforeCall(ID, subresourceID, _callback);
        Type localVarReturnType = new TypeToken<JobWorkspaceData1005157e3d631000144205466a6c13d3>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetWorkspaceRequestBuilder {
        private final String ID;
        private final String subresourceID;

        private GetWorkspaceRequestBuilder(String ID, String subresourceID) {
            this.ID = ID;
            this.subresourceID = subresourceID;
        }

        /**
         * Build call for getWorkspace
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response. A successful response can return no matched data. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getWorkspaceCall(ID, subresourceID, _callback);
        }


        /**
         * Execute getWorkspace request
         * @return JobWorkspaceData1005157e3d631000144205466a6c13d3
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response. A successful response can return no matched data. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public JobWorkspaceData1005157e3d631000144205466a6c13d3 execute() throws ApiException {
            ApiResponse<JobWorkspaceData1005157e3d631000144205466a6c13d3> localVarResp = getWorkspaceWithHttpInfo(ID, subresourceID);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getWorkspace request with HTTP info returned
         * @return ApiResponse&lt;JobWorkspaceData1005157e3d631000144205466a6c13d3&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response. A successful response can return no matched data. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<JobWorkspaceData1005157e3d631000144205466a6c13d3> executeWithHttpInfo() throws ApiException {
            return getWorkspaceWithHttpInfo(ID, subresourceID);
        }

        /**
         * Execute getWorkspace request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response. A successful response can return no matched data. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<JobWorkspaceData1005157e3d631000144205466a6c13d3> _callback) throws ApiException {
            return getWorkspaceAsync(ID, subresourceID, _callback);
        }
    }

    /**
     * Retrieves a single workspace instance.
     * Retrieves a single workspace for the specified job ID.  Secured by: Worker Data: Public Worker Reports  Scope: Staffing
     * @param ID The Workday ID of the resource. (required)
     * @param subresourceID The Workday ID of the subresource. (required)
     * @return GetWorkspaceRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response. A successful response can return no matched data. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An error occurred. </td><td>  -  </td></tr>
     </table>
     */
    public GetWorkspaceRequestBuilder getWorkspace(String ID, String subresourceID) throws IllegalArgumentException {
        if (ID == null) throw new IllegalArgumentException("\"ID\" is required but got null");
            

        if (subresourceID == null) throw new IllegalArgumentException("\"subresourceID\" is required but got null");
            

        return new GetWorkspaceRequestBuilder(ID, subresourceID);
    }
    private okhttp3.Call getWorkspacesCall(String ID, Long limit, Long offset, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/jobs/{ID}/workspace"
            .replace("{" + "ID" + "}", localVarApiClient.escapeString(ID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getWorkspacesValidateBeforeCall(String ID, Long limit, Long offset, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'ID' is set
        if (ID == null) {
            throw new ApiException("Missing the required parameter 'ID' when calling getWorkspaces(Async)");
        }

        return getWorkspacesCall(ID, limit, offset, _callback);

    }


    private ApiResponse<JobsGetWorkspacesResponse> getWorkspacesWithHttpInfo(String ID, Long limit, Long offset) throws ApiException {
        okhttp3.Call localVarCall = getWorkspacesValidateBeforeCall(ID, limit, offset, null);
        Type localVarReturnType = new TypeToken<JobsGetWorkspacesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getWorkspacesAsync(String ID, Long limit, Long offset, final ApiCallback<JobsGetWorkspacesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWorkspacesValidateBeforeCall(ID, limit, offset, _callback);
        Type localVarReturnType = new TypeToken<JobsGetWorkspacesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetWorkspacesRequestBuilder {
        private final String ID;
        private Long limit;
        private Long offset;

        private GetWorkspacesRequestBuilder(String ID) {
            this.ID = ID;
        }

        /**
         * Set limit
         * @param limit The maximum number of objects in a single response. The default is 20. The maximum is 100. (optional)
         * @return GetWorkspacesRequestBuilder
         */
        public GetWorkspacesRequestBuilder limit(Long limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set offset
         * @param offset The zero-based index of the first object in a response collection. The default is 0. Use offset with the limit parameter to control paging of a response collection. Example: If limit is 5 and offset is 9, the response returns a collection of 5 objects starting with the 10th object. (optional)
         * @return GetWorkspacesRequestBuilder
         */
        public GetWorkspacesRequestBuilder offset(Long offset) {
            this.offset = offset;
            return this;
        }
        
        /**
         * Build call for getWorkspaces
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response. A successful response can return no matched data. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getWorkspacesCall(ID, limit, offset, _callback);
        }


        /**
         * Execute getWorkspaces request
         * @return JobsGetWorkspacesResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response. A successful response can return no matched data. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public JobsGetWorkspacesResponse execute() throws ApiException {
            ApiResponse<JobsGetWorkspacesResponse> localVarResp = getWorkspacesWithHttpInfo(ID, limit, offset);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getWorkspaces request with HTTP info returned
         * @return ApiResponse&lt;JobsGetWorkspacesResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response. A successful response can return no matched data. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<JobsGetWorkspacesResponse> executeWithHttpInfo() throws ApiException {
            return getWorkspacesWithHttpInfo(ID, limit, offset);
        }

        /**
         * Execute getWorkspaces request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response. A successful response can return no matched data. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<JobsGetWorkspacesResponse> _callback) throws ApiException {
            return getWorkspacesAsync(ID, limit, offset, _callback);
        }
    }

    /**
     * Retrieves a collection of workspaces for the specified job ID.
     * Retrieves a collection of workspaces for the specified job ID.  Secured by: Worker Data: Public Worker Reports  Scope: Staffing
     * @param ID The Workday ID of the resource. (required)
     * @return GetWorkspacesRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response. A successful response can return no matched data. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An error occurred. </td><td>  -  </td></tr>
     </table>
     */
    public GetWorkspacesRequestBuilder getWorkspaces(String ID) throws IllegalArgumentException {
        if (ID == null) throw new IllegalArgumentException("\"ID\" is required but got null");
            

        return new GetWorkspacesRequestBuilder(ID);
    }
}
