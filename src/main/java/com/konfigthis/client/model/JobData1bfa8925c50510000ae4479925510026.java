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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.JobProfile6fb921f8a11d10001d5268980bbb0097;
import com.konfigthis.client.model.JobTypeB8ac205877fd100005c55b45c6400057;
import com.konfigthis.client.model.Location6d3eb084b4c410002b617efb943f0059;
import com.konfigthis.client.model.SupervisoryOrganizationFab4a151b24810000d13073c5d341257;
import com.konfigthis.client.model.WorkerFab4a151b24810000e66f769304c126b;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * JobData1bfa8925c50510000ae4479925510026
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class JobData1bfa8925c50510000ae4479925510026 {
  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private Location6d3eb084b4c410002b617efb943f0059 location;

  public static final String SERIALIZED_NAME_BUSINESS_TITLE = "businessTitle";
  @SerializedName(SERIALIZED_NAME_BUSINESS_TITLE)
  private String businessTitle;

  public static final String SERIALIZED_NAME_WORKER = "worker";
  @SerializedName(SERIALIZED_NAME_WORKER)
  private WorkerFab4a151b24810000e66f769304c126b worker;

  public static final String SERIALIZED_NAME_SUPERVISORY_ORGANIZATION = "supervisoryOrganization";
  @SerializedName(SERIALIZED_NAME_SUPERVISORY_ORGANIZATION)
  private SupervisoryOrganizationFab4a151b24810000d13073c5d341257 supervisoryOrganization;

  public static final String SERIALIZED_NAME_NEXT_PAY_PERIOD_START_DATE = "nextPayPeriodStartDate";
  @SerializedName(SERIALIZED_NAME_NEXT_PAY_PERIOD_START_DATE)
  private LocalDate nextPayPeriodStartDate;

  public static final String SERIALIZED_NAME_JOB_TYPE = "jobType";
  @SerializedName(SERIALIZED_NAME_JOB_TYPE)
  private JobTypeB8ac205877fd100005c55b45c6400057 jobType;

  public static final String SERIALIZED_NAME_JOB_PROFILE = "jobProfile";
  @SerializedName(SERIALIZED_NAME_JOB_PROFILE)
  private JobProfile6fb921f8a11d10001d5268980bbb0097 jobProfile;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTOR = "descriptor";
  @SerializedName(SERIALIZED_NAME_DESCRIPTOR)
  private String descriptor;

  public JobData1bfa8925c50510000ae4479925510026() {
  }

  public JobData1bfa8925c50510000ae4479925510026 location(Location6d3eb084b4c410002b617efb943f0059 location) {
    
    
    
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Location6d3eb084b4c410002b617efb943f0059 getLocation() {
    return location;
  }


  public void setLocation(Location6d3eb084b4c410002b617efb943f0059 location) {
    
    
    
    this.location = location;
  }


  public JobData1bfa8925c50510000ae4479925510026 businessTitle(String businessTitle) {
    
    
    
    
    this.businessTitle = businessTitle;
    return this;
  }

   /**
   * The business title for the position.
   * @return businessTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sample Business Title", value = "The business title for the position.")

  public String getBusinessTitle() {
    return businessTitle;
  }


  public void setBusinessTitle(String businessTitle) {
    
    
    
    this.businessTitle = businessTitle;
  }


  public JobData1bfa8925c50510000ae4479925510026 worker(WorkerFab4a151b24810000e66f769304c126b worker) {
    
    
    
    
    this.worker = worker;
    return this;
  }

   /**
   * Get worker
   * @return worker
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkerFab4a151b24810000e66f769304c126b getWorker() {
    return worker;
  }


  public void setWorker(WorkerFab4a151b24810000e66f769304c126b worker) {
    
    
    
    this.worker = worker;
  }


  public JobData1bfa8925c50510000ae4479925510026 supervisoryOrganization(SupervisoryOrganizationFab4a151b24810000d13073c5d341257 supervisoryOrganization) {
    
    
    
    
    this.supervisoryOrganization = supervisoryOrganization;
    return this;
  }

   /**
   * Get supervisoryOrganization
   * @return supervisoryOrganization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SupervisoryOrganizationFab4a151b24810000d13073c5d341257 getSupervisoryOrganization() {
    return supervisoryOrganization;
  }


  public void setSupervisoryOrganization(SupervisoryOrganizationFab4a151b24810000d13073c5d341257 supervisoryOrganization) {
    
    
    
    this.supervisoryOrganization = supervisoryOrganization;
  }


  public JobData1bfa8925c50510000ae4479925510026 nextPayPeriodStartDate(LocalDate nextPayPeriodStartDate) {
    
    
    
    
    this.nextPayPeriodStartDate = nextPayPeriodStartDate;
    return this;
  }

   /**
   * The next pay period start date for the job.
   * @return nextPayPeriodStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The next pay period start date for the job.")

  public LocalDate getNextPayPeriodStartDate() {
    return nextPayPeriodStartDate;
  }


  public void setNextPayPeriodStartDate(LocalDate nextPayPeriodStartDate) {
    
    
    
    this.nextPayPeriodStartDate = nextPayPeriodStartDate;
  }


  public JobData1bfa8925c50510000ae4479925510026 jobType(JobTypeB8ac205877fd100005c55b45c6400057 jobType) {
    
    
    
    
    this.jobType = jobType;
    return this;
  }

   /**
   * Get jobType
   * @return jobType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JobTypeB8ac205877fd100005c55b45c6400057 getJobType() {
    return jobType;
  }


  public void setJobType(JobTypeB8ac205877fd100005c55b45c6400057 jobType) {
    
    
    
    this.jobType = jobType;
  }


  public JobData1bfa8925c50510000ae4479925510026 jobProfile(JobProfile6fb921f8a11d10001d5268980bbb0097 jobProfile) {
    
    
    
    
    this.jobProfile = jobProfile;
    return this;
  }

   /**
   * Get jobProfile
   * @return jobProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JobProfile6fb921f8a11d10001d5268980bbb0097 getJobProfile() {
    return jobProfile;
  }


  public void setJobProfile(JobProfile6fb921f8a11d10001d5268980bbb0097 jobProfile) {
    
    
    
    this.jobProfile = jobProfile;
  }


  public JobData1bfa8925c50510000ae4479925510026 id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Id of the instance
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the instance")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public JobData1bfa8925c50510000ae4479925510026 descriptor(String descriptor) {
    
    
    
    
    this.descriptor = descriptor;
    return this;
  }

   /**
   * A preview of the instance
   * @return descriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit ame", value = "A preview of the instance")

  public String getDescriptor() {
    return descriptor;
  }


  public void setDescriptor(String descriptor) {
    
    
    
    this.descriptor = descriptor;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the JobData1bfa8925c50510000ae4479925510026 instance itself
   */
  public JobData1bfa8925c50510000ae4479925510026 putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobData1bfa8925c50510000ae4479925510026 jobData1bfa8925c50510000ae4479925510026 = (JobData1bfa8925c50510000ae4479925510026) o;
    return Objects.equals(this.location, jobData1bfa8925c50510000ae4479925510026.location) &&
        Objects.equals(this.businessTitle, jobData1bfa8925c50510000ae4479925510026.businessTitle) &&
        Objects.equals(this.worker, jobData1bfa8925c50510000ae4479925510026.worker) &&
        Objects.equals(this.supervisoryOrganization, jobData1bfa8925c50510000ae4479925510026.supervisoryOrganization) &&
        Objects.equals(this.nextPayPeriodStartDate, jobData1bfa8925c50510000ae4479925510026.nextPayPeriodStartDate) &&
        Objects.equals(this.jobType, jobData1bfa8925c50510000ae4479925510026.jobType) &&
        Objects.equals(this.jobProfile, jobData1bfa8925c50510000ae4479925510026.jobProfile) &&
        Objects.equals(this.id, jobData1bfa8925c50510000ae4479925510026.id) &&
        Objects.equals(this.descriptor, jobData1bfa8925c50510000ae4479925510026.descriptor)&&
        Objects.equals(this.additionalProperties, jobData1bfa8925c50510000ae4479925510026.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, businessTitle, worker, supervisoryOrganization, nextPayPeriodStartDate, jobType, jobProfile, id, descriptor, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobData1bfa8925c50510000ae4479925510026 {\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    businessTitle: ").append(toIndentedString(businessTitle)).append("\n");
    sb.append("    worker: ").append(toIndentedString(worker)).append("\n");
    sb.append("    supervisoryOrganization: ").append(toIndentedString(supervisoryOrganization)).append("\n");
    sb.append("    nextPayPeriodStartDate: ").append(toIndentedString(nextPayPeriodStartDate)).append("\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
    sb.append("    jobProfile: ").append(toIndentedString(jobProfile)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("location");
    openapiFields.add("businessTitle");
    openapiFields.add("worker");
    openapiFields.add("supervisoryOrganization");
    openapiFields.add("nextPayPeriodStartDate");
    openapiFields.add("jobType");
    openapiFields.add("jobProfile");
    openapiFields.add("id");
    openapiFields.add("descriptor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobData1bfa8925c50510000ae4479925510026
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JobData1bfa8925c50510000ae4479925510026.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobData1bfa8925c50510000ae4479925510026 is not found in the empty JSON string", JobData1bfa8925c50510000ae4479925510026.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        Location6d3eb084b4c410002b617efb943f0059.validateJsonObject(jsonObj.getAsJsonObject("location"));
      }
      if ((jsonObj.get("businessTitle") != null && !jsonObj.get("businessTitle").isJsonNull()) && !jsonObj.get("businessTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `businessTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("businessTitle").toString()));
      }
      // validate the optional field `worker`
      if (jsonObj.get("worker") != null && !jsonObj.get("worker").isJsonNull()) {
        WorkerFab4a151b24810000e66f769304c126b.validateJsonObject(jsonObj.getAsJsonObject("worker"));
      }
      // validate the optional field `supervisoryOrganization`
      if (jsonObj.get("supervisoryOrganization") != null && !jsonObj.get("supervisoryOrganization").isJsonNull()) {
        SupervisoryOrganizationFab4a151b24810000d13073c5d341257.validateJsonObject(jsonObj.getAsJsonObject("supervisoryOrganization"));
      }
      // validate the optional field `jobType`
      if (jsonObj.get("jobType") != null && !jsonObj.get("jobType").isJsonNull()) {
        JobTypeB8ac205877fd100005c55b45c6400057.validateJsonObject(jsonObj.getAsJsonObject("jobType"));
      }
      // validate the optional field `jobProfile`
      if (jsonObj.get("jobProfile") != null && !jsonObj.get("jobProfile").isJsonNull()) {
        JobProfile6fb921f8a11d10001d5268980bbb0097.validateJsonObject(jsonObj.getAsJsonObject("jobProfile"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("descriptor") != null && !jsonObj.get("descriptor").isJsonNull()) && !jsonObj.get("descriptor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descriptor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descriptor").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobData1bfa8925c50510000ae4479925510026.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobData1bfa8925c50510000ae4479925510026' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobData1bfa8925c50510000ae4479925510026> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobData1bfa8925c50510000ae4479925510026.class));

       return (TypeAdapter<T>) new TypeAdapter<JobData1bfa8925c50510000ae4479925510026>() {
           @Override
           public void write(JsonWriter out, JobData1bfa8925c50510000ae4479925510026 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public JobData1bfa8925c50510000ae4479925510026 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             JobData1bfa8925c50510000ae4479925510026 instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JobData1bfa8925c50510000ae4479925510026 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobData1bfa8925c50510000ae4479925510026
  * @throws IOException if the JSON string is invalid with respect to JobData1bfa8925c50510000ae4479925510026
  */
  public static JobData1bfa8925c50510000ae4479925510026 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobData1bfa8925c50510000ae4479925510026.class);
  }

 /**
  * Convert an instance of JobData1bfa8925c50510000ae4479925510026 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

