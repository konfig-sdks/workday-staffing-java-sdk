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
import com.konfigthis.client.model.JobProfile3db8095ffa18100013f019afc6d30116;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115 {
  public static final String SERIALIZED_NAME_JOB_PROFILE = "jobProfile";
  @SerializedName(SERIALIZED_NAME_JOB_PROFILE)
  private JobProfile3db8095ffa18100013f019afc6d30116 jobProfile;

  public static final String SERIALIZED_NAME_JOB_TITLE = "jobTitle";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  private String jobTitle;

  public ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115() {
  }

  public ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115 jobProfile(JobProfile3db8095ffa18100013f019afc6d30116 jobProfile) {
    
    
    
    
    this.jobProfile = jobProfile;
    return this;
  }

   /**
   * Get jobProfile
   * @return jobProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JobProfile3db8095ffa18100013f019afc6d30116 getJobProfile() {
    return jobProfile;
  }


  public void setJobProfile(JobProfile3db8095ffa18100013f019afc6d30116 jobProfile) {
    
    
    
    this.jobProfile = jobProfile;
  }


  public ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115 jobTitle(String jobTitle) {
    
    
    
    
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * The new job title for the worker as of the effective date.
   * @return jobTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sample Job Title", value = "The new job title for the worker as of the effective date.")

  public String getJobTitle() {
    return jobTitle;
  }


  public void setJobTitle(String jobTitle) {
    
    
    
    this.jobTitle = jobTitle;
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
   * @return the ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115 instance itself
   */
  public ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115 putAdditionalProperty(String key, Object value) {
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
    ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115 changeJobJobProfileData3db8095ffa18100013f019a27a1f0115 = (ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115) o;
    return Objects.equals(this.jobProfile, changeJobJobProfileData3db8095ffa18100013f019a27a1f0115.jobProfile) &&
        Objects.equals(this.jobTitle, changeJobJobProfileData3db8095ffa18100013f019a27a1f0115.jobTitle)&&
        Objects.equals(this.additionalProperties, changeJobJobProfileData3db8095ffa18100013f019a27a1f0115.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobProfile, jobTitle, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115 {\n");
    sb.append("    jobProfile: ").append(toIndentedString(jobProfile)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
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
    openapiFields.add("jobProfile");
    openapiFields.add("jobTitle");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115 is not found in the empty JSON string", ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `jobProfile`
      if (jsonObj.get("jobProfile") != null && !jsonObj.get("jobProfile").isJsonNull()) {
        JobProfile3db8095ffa18100013f019afc6d30116.validateJsonObject(jsonObj.getAsJsonObject("jobProfile"));
      }
      if ((jsonObj.get("jobTitle") != null && !jsonObj.get("jobTitle").isJsonNull()) && !jsonObj.get("jobTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jobTitle").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115.class));

       return (TypeAdapter<T>) new TypeAdapter<ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115>() {
           @Override
           public void write(JsonWriter out, ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115 value) throws IOException {
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
           public ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115
  * @throws IOException if the JSON string is invalid with respect to ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115
  */
  public static ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115.class);
  }

 /**
  * Convert an instance of ChangeJobJobProfileData3db8095ffa18100013f019a27a1f0115 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

