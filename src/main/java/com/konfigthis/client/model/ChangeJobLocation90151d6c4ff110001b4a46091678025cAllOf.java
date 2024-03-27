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
import com.konfigthis.client.model.Location90151d6c4ff110001bfa027116820278;
import com.konfigthis.client.model.WorkShift0ee7bb8b41db1000143d4e4822174f2e;
import com.konfigthis.client.model.WorkSpace0ee7bb8b41db10001e7db6a6c3e55663;
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
 * ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf {
  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private Location90151d6c4ff110001bfa027116820278 location;

  public static final String SERIALIZED_NAME_SCHEDULED_HOURS = "scheduledHours";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_HOURS)
  private Integer scheduledHours;

  public static final String SERIALIZED_NAME_WORK_SHIFT = "workShift";
  @SerializedName(SERIALIZED_NAME_WORK_SHIFT)
  private WorkShift0ee7bb8b41db1000143d4e4822174f2e workShift;

  public static final String SERIALIZED_NAME_WORK_SPACE = "workSpace";
  @SerializedName(SERIALIZED_NAME_WORK_SPACE)
  private WorkSpace0ee7bb8b41db10001e7db6a6c3e55663 workSpace;

  public ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf() {
  }

  public ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf location(Location90151d6c4ff110001bfa027116820278 location) {
    
    
    
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Location90151d6c4ff110001bfa027116820278 getLocation() {
    return location;
  }


  public void setLocation(Location90151d6c4ff110001bfa027116820278 location) {
    
    
    
    this.location = location;
  }


  public ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf scheduledHours(Integer scheduledHours) {
    
    
    
    
    this.scheduledHours = scheduledHours;
    return this;
  }

   /**
   * The new scheduled hours for the worker as of the effective date.
   * @return scheduledHours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "40", value = "The new scheduled hours for the worker as of the effective date.")

  public Integer getScheduledHours() {
    return scheduledHours;
  }


  public void setScheduledHours(Integer scheduledHours) {
    
    
    
    this.scheduledHours = scheduledHours;
  }


  public ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf workShift(WorkShift0ee7bb8b41db1000143d4e4822174f2e workShift) {
    
    
    
    
    this.workShift = workShift;
    return this;
  }

   /**
   * Get workShift
   * @return workShift
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkShift0ee7bb8b41db1000143d4e4822174f2e getWorkShift() {
    return workShift;
  }


  public void setWorkShift(WorkShift0ee7bb8b41db1000143d4e4822174f2e workShift) {
    
    
    
    this.workShift = workShift;
  }


  public ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf workSpace(WorkSpace0ee7bb8b41db10001e7db6a6c3e55663 workSpace) {
    
    
    
    
    this.workSpace = workSpace;
    return this;
  }

   /**
   * Get workSpace
   * @return workSpace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkSpace0ee7bb8b41db10001e7db6a6c3e55663 getWorkSpace() {
    return workSpace;
  }


  public void setWorkSpace(WorkSpace0ee7bb8b41db10001e7db6a6c3e55663 workSpace) {
    
    
    
    this.workSpace = workSpace;
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
   * @return the ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf instance itself
   */
  public ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf putAdditionalProperty(String key, Object value) {
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
    ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf changeJobLocation90151d6c4ff110001b4a46091678025cAllOf = (ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf) o;
    return Objects.equals(this.location, changeJobLocation90151d6c4ff110001b4a46091678025cAllOf.location) &&
        Objects.equals(this.scheduledHours, changeJobLocation90151d6c4ff110001b4a46091678025cAllOf.scheduledHours) &&
        Objects.equals(this.workShift, changeJobLocation90151d6c4ff110001b4a46091678025cAllOf.workShift) &&
        Objects.equals(this.workSpace, changeJobLocation90151d6c4ff110001b4a46091678025cAllOf.workSpace)&&
        Objects.equals(this.additionalProperties, changeJobLocation90151d6c4ff110001b4a46091678025cAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, scheduledHours, workShift, workSpace, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf {\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    scheduledHours: ").append(toIndentedString(scheduledHours)).append("\n");
    sb.append("    workShift: ").append(toIndentedString(workShift)).append("\n");
    sb.append("    workSpace: ").append(toIndentedString(workSpace)).append("\n");
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
    openapiFields.add("scheduledHours");
    openapiFields.add("workShift");
    openapiFields.add("workSpace");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf is not found in the empty JSON string", ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        Location90151d6c4ff110001bfa027116820278.validateJsonObject(jsonObj.getAsJsonObject("location"));
      }
      // validate the optional field `workShift`
      if (jsonObj.get("workShift") != null && !jsonObj.get("workShift").isJsonNull()) {
        WorkShift0ee7bb8b41db1000143d4e4822174f2e.validateJsonObject(jsonObj.getAsJsonObject("workShift"));
      }
      // validate the optional field `workSpace`
      if (jsonObj.get("workSpace") != null && !jsonObj.get("workSpace").isJsonNull()) {
        WorkSpace0ee7bb8b41db10001e7db6a6c3e55663.validateJsonObject(jsonObj.getAsJsonObject("workSpace"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf>() {
           @Override
           public void write(JsonWriter out, ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf value) throws IOException {
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
           public ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf
  * @throws IOException if the JSON string is invalid with respect to ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf
  */
  public static ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf.class);
  }

 /**
  * Convert an instance of ChangeJobLocation90151d6c4ff110001b4a46091678025cAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
