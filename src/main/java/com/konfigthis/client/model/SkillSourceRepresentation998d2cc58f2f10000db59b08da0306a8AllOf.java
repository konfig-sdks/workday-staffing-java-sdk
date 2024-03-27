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
 * SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf {
  public static final String SERIALIZED_NAME_SOURCE_TYPE = "sourceType";
  @SerializedName(SERIALIZED_NAME_SOURCE_TYPE)
  private String sourceType;

  public static final String SERIALIZED_NAME_SOURCE_TYPE_I_D = "sourceTypeID";
  @SerializedName(SERIALIZED_NAME_SOURCE_TYPE_I_D)
  private String sourceTypeID;

  public static final String SERIALIZED_NAME_DATE_CREATED = "dateCreated";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private LocalDate dateCreated;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTOR = "descriptor";
  @SerializedName(SERIALIZED_NAME_DESCRIPTOR)
  private String descriptor;

  public SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf() {
  }

  public SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf sourceType(String sourceType) {
    
    
    
    
    this.sourceType = sourceType;
    return this;
  }

   /**
   * The Source Type of this Skill Item Source
   * @return sourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "The Source Type of this Skill Item Source")

  public String getSourceType() {
    return sourceType;
  }


  public void setSourceType(String sourceType) {
    
    
    
    this.sourceType = sourceType;
  }


  public SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf sourceTypeID(String sourceTypeID) {
    
    
    
    
    this.sourceTypeID = sourceTypeID;
    return this;
  }

   /**
   * source type ID
   * @return sourceTypeID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "source type ID")

  public String getSourceTypeID() {
    return sourceTypeID;
  }


  public void setSourceTypeID(String sourceTypeID) {
    
    
    
    this.sourceTypeID = sourceTypeID;
  }


  public SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf dateCreated(LocalDate dateCreated) {
    
    
    
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * The Creation Date of this Skill Item Source
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Creation Date of this Skill Item Source")

  public LocalDate getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(LocalDate dateCreated) {
    
    
    
    this.dateCreated = dateCreated;
  }


  public SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf id(String id) {
    
    
    
    
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


  public SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf descriptor(String descriptor) {
    
    
    
    
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
   * @return the SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf instance itself
   */
  public SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf putAdditionalProperty(String key, Object value) {
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
    SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf skillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf = (SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf) o;
    return Objects.equals(this.sourceType, skillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf.sourceType) &&
        Objects.equals(this.sourceTypeID, skillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf.sourceTypeID) &&
        Objects.equals(this.dateCreated, skillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf.dateCreated) &&
        Objects.equals(this.id, skillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf.id) &&
        Objects.equals(this.descriptor, skillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf.descriptor)&&
        Objects.equals(this.additionalProperties, skillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceType, sourceTypeID, dateCreated, id, descriptor, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf {\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    sourceTypeID: ").append(toIndentedString(sourceTypeID)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
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
    openapiFields.add("sourceType");
    openapiFields.add("sourceTypeID");
    openapiFields.add("dateCreated");
    openapiFields.add("id");
    openapiFields.add("descriptor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf is not found in the empty JSON string", SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("sourceType") != null && !jsonObj.get("sourceType").isJsonNull()) && !jsonObj.get("sourceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceType").toString()));
      }
      if ((jsonObj.get("sourceTypeID") != null && !jsonObj.get("sourceTypeID").isJsonNull()) && !jsonObj.get("sourceTypeID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceTypeID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceTypeID").toString()));
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
       if (!SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf>() {
           @Override
           public void write(JsonWriter out, SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf value) throws IOException {
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
           public SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf
  * @throws IOException if the JSON string is invalid with respect to SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf
  */
  public static SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf.class);
  }

 /**
  * Convert an instance of SkillSourceRepresentation998d2cc58f2f10000db59b08da0306a8AllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

