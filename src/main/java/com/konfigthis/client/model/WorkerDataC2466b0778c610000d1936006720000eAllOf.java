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
import com.konfigthis.client.model.JobDataForWorkerB8ac205877fd10000ea91719a02a00a2;
import com.konfigthis.client.model.Person0ad147648b0a1000237bd486634a001a;
import com.konfigthis.client.model.PrimaryJob352c3a97ecd51000353cba144c5b0042;
import com.konfigthis.client.model.WorkerType3f78eeedc01d1000138d97d80e5a0000;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * WorkerDataC2466b0778c610000d1936006720000eAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WorkerDataC2466b0778c610000d1936006720000eAllOf {
  public static final String SERIALIZED_NAME_PRIMARY_JOB = "primaryJob";
  @SerializedName(SERIALIZED_NAME_PRIMARY_JOB)
  private PrimaryJob352c3a97ecd51000353cba144c5b0042 primaryJob;

  public static final String SERIALIZED_NAME_PERSON = "person";
  @SerializedName(SERIALIZED_NAME_PERSON)
  private Person0ad147648b0a1000237bd486634a001a person;

  public static final String SERIALIZED_NAME_WORKER_ID = "workerId";
  @SerializedName(SERIALIZED_NAME_WORKER_ID)
  private String workerId;

  public static final String SERIALIZED_NAME_WORKER_TYPE = "workerType";
  @SerializedName(SERIALIZED_NAME_WORKER_TYPE)
  private WorkerType3f78eeedc01d1000138d97d80e5a0000 workerType;

  public static final String SERIALIZED_NAME_ADDITIONAL_JOBS = "additionalJobs";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_JOBS)
  private List<JobDataForWorkerB8ac205877fd10000ea91719a02a00a2> additionalJobs = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTOR = "descriptor";
  @SerializedName(SERIALIZED_NAME_DESCRIPTOR)
  private String descriptor;

  public WorkerDataC2466b0778c610000d1936006720000eAllOf() {
  }

  public WorkerDataC2466b0778c610000d1936006720000eAllOf primaryJob(PrimaryJob352c3a97ecd51000353cba144c5b0042 primaryJob) {
    
    
    
    
    this.primaryJob = primaryJob;
    return this;
  }

   /**
   * Get primaryJob
   * @return primaryJob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PrimaryJob352c3a97ecd51000353cba144c5b0042 getPrimaryJob() {
    return primaryJob;
  }


  public void setPrimaryJob(PrimaryJob352c3a97ecd51000353cba144c5b0042 primaryJob) {
    
    
    
    this.primaryJob = primaryJob;
  }


  public WorkerDataC2466b0778c610000d1936006720000eAllOf person(Person0ad147648b0a1000237bd486634a001a person) {
    
    
    
    
    this.person = person;
    return this;
  }

   /**
   * Get person
   * @return person
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Person0ad147648b0a1000237bd486634a001a getPerson() {
    return person;
  }


  public void setPerson(Person0ad147648b0a1000237bd486634a001a person) {
    
    
    
    this.person = person;
  }


  public WorkerDataC2466b0778c610000d1936006720000eAllOf workerId(String workerId) {
    
    
    
    
    this.workerId = workerId;
    return this;
  }

   /**
   * The Employee ID or Contingent Worker ID for the worker.
   * @return workerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "The Employee ID or Contingent Worker ID for the worker.")

  public String getWorkerId() {
    return workerId;
  }


  public void setWorkerId(String workerId) {
    
    
    
    this.workerId = workerId;
  }


  public WorkerDataC2466b0778c610000d1936006720000eAllOf workerType(WorkerType3f78eeedc01d1000138d97d80e5a0000 workerType) {
    
    
    
    
    this.workerType = workerType;
    return this;
  }

   /**
   * Get workerType
   * @return workerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkerType3f78eeedc01d1000138d97d80e5a0000 getWorkerType() {
    return workerType;
  }


  public void setWorkerType(WorkerType3f78eeedc01d1000138d97d80e5a0000 workerType) {
    
    
    
    this.workerType = workerType;
  }


  public WorkerDataC2466b0778c610000d1936006720000eAllOf additionalJobs(List<JobDataForWorkerB8ac205877fd10000ea91719a02a00a2> additionalJobs) {
    
    
    
    
    this.additionalJobs = additionalJobs;
    return this;
  }

  public WorkerDataC2466b0778c610000d1936006720000eAllOf addAdditionalJobsItem(JobDataForWorkerB8ac205877fd10000ea91719a02a00a2 additionalJobsItem) {
    if (this.additionalJobs == null) {
      this.additionalJobs = new ArrayList<>();
    }
    this.additionalJobs.add(additionalJobsItem);
    return this;
  }

   /**
   * The employee’s additional jobs and international assignments.
   * @return additionalJobs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The employee’s additional jobs and international assignments.")

  public List<JobDataForWorkerB8ac205877fd10000ea91719a02a00a2> getAdditionalJobs() {
    return additionalJobs;
  }


  public void setAdditionalJobs(List<JobDataForWorkerB8ac205877fd10000ea91719a02a00a2> additionalJobs) {
    
    
    
    this.additionalJobs = additionalJobs;
  }


  public WorkerDataC2466b0778c610000d1936006720000eAllOf id(String id) {
    
    
    
    
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


  public WorkerDataC2466b0778c610000d1936006720000eAllOf descriptor(String descriptor) {
    
    
    
    
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
   * @return the WorkerDataC2466b0778c610000d1936006720000eAllOf instance itself
   */
  public WorkerDataC2466b0778c610000d1936006720000eAllOf putAdditionalProperty(String key, Object value) {
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
    WorkerDataC2466b0778c610000d1936006720000eAllOf workerDataC2466b0778c610000d1936006720000eAllOf = (WorkerDataC2466b0778c610000d1936006720000eAllOf) o;
    return Objects.equals(this.primaryJob, workerDataC2466b0778c610000d1936006720000eAllOf.primaryJob) &&
        Objects.equals(this.person, workerDataC2466b0778c610000d1936006720000eAllOf.person) &&
        Objects.equals(this.workerId, workerDataC2466b0778c610000d1936006720000eAllOf.workerId) &&
        Objects.equals(this.workerType, workerDataC2466b0778c610000d1936006720000eAllOf.workerType) &&
        Objects.equals(this.additionalJobs, workerDataC2466b0778c610000d1936006720000eAllOf.additionalJobs) &&
        Objects.equals(this.id, workerDataC2466b0778c610000d1936006720000eAllOf.id) &&
        Objects.equals(this.descriptor, workerDataC2466b0778c610000d1936006720000eAllOf.descriptor)&&
        Objects.equals(this.additionalProperties, workerDataC2466b0778c610000d1936006720000eAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryJob, person, workerId, workerType, additionalJobs, id, descriptor, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkerDataC2466b0778c610000d1936006720000eAllOf {\n");
    sb.append("    primaryJob: ").append(toIndentedString(primaryJob)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
    sb.append("    workerType: ").append(toIndentedString(workerType)).append("\n");
    sb.append("    additionalJobs: ").append(toIndentedString(additionalJobs)).append("\n");
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
    openapiFields.add("primaryJob");
    openapiFields.add("person");
    openapiFields.add("workerId");
    openapiFields.add("workerType");
    openapiFields.add("additionalJobs");
    openapiFields.add("id");
    openapiFields.add("descriptor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkerDataC2466b0778c610000d1936006720000eAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkerDataC2466b0778c610000d1936006720000eAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkerDataC2466b0778c610000d1936006720000eAllOf is not found in the empty JSON string", WorkerDataC2466b0778c610000d1936006720000eAllOf.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `primaryJob`
      if (jsonObj.get("primaryJob") != null && !jsonObj.get("primaryJob").isJsonNull()) {
        PrimaryJob352c3a97ecd51000353cba144c5b0042.validateJsonObject(jsonObj.getAsJsonObject("primaryJob"));
      }
      // validate the optional field `person`
      if (jsonObj.get("person") != null && !jsonObj.get("person").isJsonNull()) {
        Person0ad147648b0a1000237bd486634a001a.validateJsonObject(jsonObj.getAsJsonObject("person"));
      }
      if ((jsonObj.get("workerId") != null && !jsonObj.get("workerId").isJsonNull()) && !jsonObj.get("workerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workerId").toString()));
      }
      // validate the optional field `workerType`
      if (jsonObj.get("workerType") != null && !jsonObj.get("workerType").isJsonNull()) {
        WorkerType3f78eeedc01d1000138d97d80e5a0000.validateJsonObject(jsonObj.getAsJsonObject("workerType"));
      }
      if (jsonObj.get("additionalJobs") != null && !jsonObj.get("additionalJobs").isJsonNull()) {
        JsonArray jsonArrayadditionalJobs = jsonObj.getAsJsonArray("additionalJobs");
        if (jsonArrayadditionalJobs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additionalJobs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additionalJobs` to be an array in the JSON string but got `%s`", jsonObj.get("additionalJobs").toString()));
          }

          // validate the optional field `additionalJobs` (array)
          for (int i = 0; i < jsonArrayadditionalJobs.size(); i++) {
            JobDataForWorkerB8ac205877fd10000ea91719a02a00a2.validateJsonObject(jsonArrayadditionalJobs.get(i).getAsJsonObject());
          };
        }
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
       if (!WorkerDataC2466b0778c610000d1936006720000eAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkerDataC2466b0778c610000d1936006720000eAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkerDataC2466b0778c610000d1936006720000eAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkerDataC2466b0778c610000d1936006720000eAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkerDataC2466b0778c610000d1936006720000eAllOf>() {
           @Override
           public void write(JsonWriter out, WorkerDataC2466b0778c610000d1936006720000eAllOf value) throws IOException {
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
           public WorkerDataC2466b0778c610000d1936006720000eAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WorkerDataC2466b0778c610000d1936006720000eAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WorkerDataC2466b0778c610000d1936006720000eAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkerDataC2466b0778c610000d1936006720000eAllOf
  * @throws IOException if the JSON string is invalid with respect to WorkerDataC2466b0778c610000d1936006720000eAllOf
  */
  public static WorkerDataC2466b0778c610000d1936006720000eAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkerDataC2466b0778c610000d1936006720000eAllOf.class);
  }

 /**
  * Convert an instance of WorkerDataC2466b0778c610000d1936006720000eAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

