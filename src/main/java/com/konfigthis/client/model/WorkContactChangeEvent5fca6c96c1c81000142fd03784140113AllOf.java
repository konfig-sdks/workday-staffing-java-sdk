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
 * WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf {
  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "effective_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  private LocalDate effectiveDate;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTOR = "descriptor";
  @SerializedName(SERIALIZED_NAME_DESCRIPTOR)
  private String descriptor;

  public WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf() {
  }

  public WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf effectiveDate(LocalDate effectiveDate) {
    
    
    
    
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * The date this business process takes effect.
   * @return effectiveDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date this business process takes effect.")

  public LocalDate getEffectiveDate() {
    return effectiveDate;
  }


  public void setEffectiveDate(LocalDate effectiveDate) {
    
    
    
    this.effectiveDate = effectiveDate;
  }


  public WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf href(String href) {
    
    
    
    
    this.href = href;
    return this;
  }

   /**
   * The URL to the related change work contact information resource where this event can be interacted with via REST.
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "The URL to the related change work contact information resource where this event can be interacted with via REST.")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    
    
    
    this.href = href;
  }


  public WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf id(String id) {
    
    
    
    
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


  public WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf descriptor(String descriptor) {
    
    
    
    
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
   * @return the WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf instance itself
   */
  public WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf putAdditionalProperty(String key, Object value) {
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
    WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf workContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf = (WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf) o;
    return Objects.equals(this.effectiveDate, workContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf.effectiveDate) &&
        Objects.equals(this.href, workContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf.href) &&
        Objects.equals(this.id, workContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf.id) &&
        Objects.equals(this.descriptor, workContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf.descriptor)&&
        Objects.equals(this.additionalProperties, workContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveDate, href, id, descriptor, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf {\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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
    openapiFields.add("effective_date");
    openapiFields.add("href");
    openapiFields.add("id");
    openapiFields.add("descriptor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf is not found in the empty JSON string", WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
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
       if (!WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf>() {
           @Override
           public void write(JsonWriter out, WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf value) throws IOException {
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
           public WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf
  * @throws IOException if the JSON string is invalid with respect to WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf
  */
  public static WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf.class);
  }

 /**
  * Convert an instance of WorkContactChangeEvent5fca6c96c1c81000142fd03784140113AllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

