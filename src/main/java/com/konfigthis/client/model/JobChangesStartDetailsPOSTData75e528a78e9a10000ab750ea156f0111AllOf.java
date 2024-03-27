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
import com.konfigthis.client.model.Job75e528a78e9a10000ab7512c5c550115;
import com.konfigthis.client.model.Location75e528a78e9a10000ab75125ebe50114;
import com.konfigthis.client.model.Reason85deac43cd1a10000b96c80c118f171e;
import com.konfigthis.client.model.SupervisoryOrganization75e528a78e9a10000ab75132a9df0116;
import com.konfigthis.client.model.Template2b1b95dfe4af100007f63081aec5158e;
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
 * JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf {
  public static final String SERIALIZED_NAME_SUPERVISORY_ORGANIZATION = "supervisoryOrganization";
  @SerializedName(SERIALIZED_NAME_SUPERVISORY_ORGANIZATION)
  private SupervisoryOrganization75e528a78e9a10000ab75132a9df0116 supervisoryOrganization;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private Location75e528a78e9a10000ab75125ebe50114 location;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private Template2b1b95dfe4af100007f63081aec5158e template;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private Reason85deac43cd1a10000b96c80c118f171e reason;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_JOB = "job";
  @SerializedName(SERIALIZED_NAME_JOB)
  private Job75e528a78e9a10000ab7512c5c550115 job;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTOR = "descriptor";
  @SerializedName(SERIALIZED_NAME_DESCRIPTOR)
  private String descriptor;

  public JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf() {
  }

  public JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf supervisoryOrganization(SupervisoryOrganization75e528a78e9a10000ab75132a9df0116 supervisoryOrganization) {
    
    
    
    
    this.supervisoryOrganization = supervisoryOrganization;
    return this;
  }

   /**
   * Get supervisoryOrganization
   * @return supervisoryOrganization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SupervisoryOrganization75e528a78e9a10000ab75132a9df0116 getSupervisoryOrganization() {
    return supervisoryOrganization;
  }


  public void setSupervisoryOrganization(SupervisoryOrganization75e528a78e9a10000ab75132a9df0116 supervisoryOrganization) {
    
    
    
    this.supervisoryOrganization = supervisoryOrganization;
  }


  public JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf location(Location75e528a78e9a10000ab75125ebe50114 location) {
    
    
    
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Location75e528a78e9a10000ab75125ebe50114 getLocation() {
    return location;
  }


  public void setLocation(Location75e528a78e9a10000ab75125ebe50114 location) {
    
    
    
    this.location = location;
  }


  public JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf template(Template2b1b95dfe4af100007f63081aec5158e template) {
    
    
    
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Template2b1b95dfe4af100007f63081aec5158e getTemplate() {
    return template;
  }


  public void setTemplate(Template2b1b95dfe4af100007f63081aec5158e template) {
    
    
    
    this.template = template;
  }


  public JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf reason(Reason85deac43cd1a10000b96c80c118f171e reason) {
    
    
    
    
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Reason85deac43cd1a10000b96c80c118f171e getReason() {
    return reason;
  }


  public void setReason(Reason85deac43cd1a10000b96c80c118f171e reason) {
    
    
    
    this.reason = reason;
  }


  public JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf date(LocalDate date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * The date this business process takes effect.
   * @return date
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The date this business process takes effect.")

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    
    
    
    this.date = date;
  }


  public JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf job(Job75e528a78e9a10000ab7512c5c550115 job) {
    
    
    
    
    this.job = job;
    return this;
  }

   /**
   * Get job
   * @return job
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Job75e528a78e9a10000ab7512c5c550115 getJob() {
    return job;
  }


  public void setJob(Job75e528a78e9a10000ab7512c5c550115 job) {
    
    
    
    this.job = job;
  }


  public JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf id(String id) {
    
    
    
    
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


  public JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf descriptor(String descriptor) {
    
    
    
    
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
   * @return the JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf instance itself
   */
  public JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf putAdditionalProperty(String key, Object value) {
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
    JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf jobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf = (JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf) o;
    return Objects.equals(this.supervisoryOrganization, jobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf.supervisoryOrganization) &&
        Objects.equals(this.location, jobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf.location) &&
        Objects.equals(this.template, jobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf.template) &&
        Objects.equals(this.reason, jobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf.reason) &&
        Objects.equals(this.date, jobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf.date) &&
        Objects.equals(this.job, jobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf.job) &&
        Objects.equals(this.id, jobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf.id) &&
        Objects.equals(this.descriptor, jobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf.descriptor)&&
        Objects.equals(this.additionalProperties, jobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supervisoryOrganization, location, template, reason, date, job, id, descriptor, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf {\n");
    sb.append("    supervisoryOrganization: ").append(toIndentedString(supervisoryOrganization)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
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
    openapiFields.add("supervisoryOrganization");
    openapiFields.add("location");
    openapiFields.add("template");
    openapiFields.add("reason");
    openapiFields.add("date");
    openapiFields.add("job");
    openapiFields.add("id");
    openapiFields.add("descriptor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("date");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf is not found in the empty JSON string", JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `supervisoryOrganization`
      if (jsonObj.get("supervisoryOrganization") != null && !jsonObj.get("supervisoryOrganization").isJsonNull()) {
        SupervisoryOrganization75e528a78e9a10000ab75132a9df0116.validateJsonObject(jsonObj.getAsJsonObject("supervisoryOrganization"));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        Location75e528a78e9a10000ab75125ebe50114.validateJsonObject(jsonObj.getAsJsonObject("location"));
      }
      // validate the optional field `template`
      if (jsonObj.get("template") != null && !jsonObj.get("template").isJsonNull()) {
        Template2b1b95dfe4af100007f63081aec5158e.validateJsonObject(jsonObj.getAsJsonObject("template"));
      }
      // validate the optional field `reason`
      if (jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) {
        Reason85deac43cd1a10000b96c80c118f171e.validateJsonObject(jsonObj.getAsJsonObject("reason"));
      }
      // validate the optional field `job`
      if (jsonObj.get("job") != null && !jsonObj.get("job").isJsonNull()) {
        Job75e528a78e9a10000ab7512c5c550115.validateJsonObject(jsonObj.getAsJsonObject("job"));
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
       if (!JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf>() {
           @Override
           public void write(JsonWriter out, JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf value) throws IOException {
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
           public JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf
  * @throws IOException if the JSON string is invalid with respect to JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf
  */
  public static JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf.class);
  }

 /**
  * Convert an instance of JobChangesStartDetailsPOSTData75e528a78e9a10000ab750ea156f0111AllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
