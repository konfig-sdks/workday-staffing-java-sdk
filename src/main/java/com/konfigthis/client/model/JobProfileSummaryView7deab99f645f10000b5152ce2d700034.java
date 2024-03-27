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
 * JobProfileSummaryView7deab99f645f10000b5152ce2d700034
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class JobProfileSummaryView7deab99f645f10000b5152ce2d700034 {
  public static final String SERIALIZED_NAME_INACTIVE = "inactive";
  @SerializedName(SERIALIZED_NAME_INACTIVE)
  private Boolean inactive;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public JobProfileSummaryView7deab99f645f10000b5152ce2d700034() {
  }

  public JobProfileSummaryView7deab99f645f10000b5152ce2d700034 inactive(Boolean inactive) {
    
    
    
    
    this.inactive = inactive;
    return this;
  }

   /**
   * Returns true if the Job Profile is inactive.
   * @return inactive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Returns true if the Job Profile is inactive.")

  public Boolean getInactive() {
    return inactive;
  }


  public void setInactive(Boolean inactive) {
    
    
    
    this.inactive = inactive;
  }


  public JobProfileSummaryView7deab99f645f10000b5152ce2d700034 name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the job profile.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "The name of the job profile.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public JobProfileSummaryView7deab99f645f10000b5152ce2d700034 id(String id) {
    
    
    
    
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
   * @return the JobProfileSummaryView7deab99f645f10000b5152ce2d700034 instance itself
   */
  public JobProfileSummaryView7deab99f645f10000b5152ce2d700034 putAdditionalProperty(String key, Object value) {
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
    JobProfileSummaryView7deab99f645f10000b5152ce2d700034 jobProfileSummaryView7deab99f645f10000b5152ce2d700034 = (JobProfileSummaryView7deab99f645f10000b5152ce2d700034) o;
    return Objects.equals(this.inactive, jobProfileSummaryView7deab99f645f10000b5152ce2d700034.inactive) &&
        Objects.equals(this.name, jobProfileSummaryView7deab99f645f10000b5152ce2d700034.name) &&
        Objects.equals(this.id, jobProfileSummaryView7deab99f645f10000b5152ce2d700034.id)&&
        Objects.equals(this.additionalProperties, jobProfileSummaryView7deab99f645f10000b5152ce2d700034.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inactive, name, id, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobProfileSummaryView7deab99f645f10000b5152ce2d700034 {\n");
    sb.append("    inactive: ").append(toIndentedString(inactive)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("inactive");
    openapiFields.add("name");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobProfileSummaryView7deab99f645f10000b5152ce2d700034
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JobProfileSummaryView7deab99f645f10000b5152ce2d700034.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobProfileSummaryView7deab99f645f10000b5152ce2d700034 is not found in the empty JSON string", JobProfileSummaryView7deab99f645f10000b5152ce2d700034.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobProfileSummaryView7deab99f645f10000b5152ce2d700034.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobProfileSummaryView7deab99f645f10000b5152ce2d700034' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobProfileSummaryView7deab99f645f10000b5152ce2d700034> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobProfileSummaryView7deab99f645f10000b5152ce2d700034.class));

       return (TypeAdapter<T>) new TypeAdapter<JobProfileSummaryView7deab99f645f10000b5152ce2d700034>() {
           @Override
           public void write(JsonWriter out, JobProfileSummaryView7deab99f645f10000b5152ce2d700034 value) throws IOException {
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
           public JobProfileSummaryView7deab99f645f10000b5152ce2d700034 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             JobProfileSummaryView7deab99f645f10000b5152ce2d700034 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of JobProfileSummaryView7deab99f645f10000b5152ce2d700034 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobProfileSummaryView7deab99f645f10000b5152ce2d700034
  * @throws IOException if the JSON string is invalid with respect to JobProfileSummaryView7deab99f645f10000b5152ce2d700034
  */
  public static JobProfileSummaryView7deab99f645f10000b5152ce2d700034 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobProfileSummaryView7deab99f645f10000b5152ce2d700034.class);
  }

 /**
  * Convert an instance of JobProfileSummaryView7deab99f645f10000b5152ce2d700034 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
