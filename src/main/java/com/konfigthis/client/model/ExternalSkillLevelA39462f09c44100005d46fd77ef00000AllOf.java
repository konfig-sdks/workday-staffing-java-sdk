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
 * ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf {
  public static final String SERIALIZED_NAME_EXTERNAL_SKILL_LEVEL = "externalSkillLevel";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SKILL_LEVEL)
  private Integer externalSkillLevel;

  public static final String SERIALIZED_NAME_EXTERNAL_SKILL_ID = "externalSkillId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SKILL_ID)
  private String externalSkillId;

  public static final String SERIALIZED_NAME_EFFECTIVE_MOMENT = "effectiveMoment";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_MOMENT)
  private LocalDate effectiveMoment;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private String context;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf() {
  }

  public ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf externalSkillLevel(Integer externalSkillLevel) {
    
    
    
    
    this.externalSkillLevel = externalSkillLevel;
    return this;
  }

   /**
   * The skill level normalized to a scale from 1-5 and to 1 decimal place.
   * @return externalSkillLevel
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "8", required = true, value = "The skill level normalized to a scale from 1-5 and to 1 decimal place.")

  public Integer getExternalSkillLevel() {
    return externalSkillLevel;
  }


  public void setExternalSkillLevel(Integer externalSkillLevel) {
    
    
    
    this.externalSkillLevel = externalSkillLevel;
  }


  public ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf externalSkillId(String externalSkillId) {
    
    
    
    
    this.externalSkillId = externalSkillId;
    return this;
  }

   /**
   * The skill from the external system.
   * @return externalSkillId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", required = true, value = "The skill from the external system.")

  public String getExternalSkillId() {
    return externalSkillId;
  }


  public void setExternalSkillId(String externalSkillId) {
    
    
    
    this.externalSkillId = externalSkillId;
  }


  public ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf effectiveMoment(LocalDate effectiveMoment) {
    
    
    
    
    this.effectiveMoment = effectiveMoment;
    return this;
  }

   /**
   * The date that the external Skill Level was last updated.
   * @return effectiveMoment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date that the external Skill Level was last updated.")

  public LocalDate getEffectiveMoment() {
    return effectiveMoment;
  }


  public void setEffectiveMoment(LocalDate effectiveMoment) {
    
    
    
    this.effectiveMoment = effectiveMoment;
  }


  public ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf context(String context) {
    
    
    
    
    this.context = context;
    return this;
  }

   /**
   * The text you enter to provide context for this external skill load. Not visible to end users.
   * @return context
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "The text you enter to provide context for this external skill load. Not visible to end users.")

  public String getContext() {
    return context;
  }


  public void setContext(String context) {
    
    
    
    this.context = context;
  }


  public ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf id(String id) {
    
    
    
    
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
   * @return the ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf instance itself
   */
  public ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf putAdditionalProperty(String key, Object value) {
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
    ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf externalSkillLevelA39462f09c44100005d46fd77ef00000AllOf = (ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf) o;
    return Objects.equals(this.externalSkillLevel, externalSkillLevelA39462f09c44100005d46fd77ef00000AllOf.externalSkillLevel) &&
        Objects.equals(this.externalSkillId, externalSkillLevelA39462f09c44100005d46fd77ef00000AllOf.externalSkillId) &&
        Objects.equals(this.effectiveMoment, externalSkillLevelA39462f09c44100005d46fd77ef00000AllOf.effectiveMoment) &&
        Objects.equals(this.context, externalSkillLevelA39462f09c44100005d46fd77ef00000AllOf.context) &&
        Objects.equals(this.id, externalSkillLevelA39462f09c44100005d46fd77ef00000AllOf.id)&&
        Objects.equals(this.additionalProperties, externalSkillLevelA39462f09c44100005d46fd77ef00000AllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalSkillLevel, externalSkillId, effectiveMoment, context, id, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf {\n");
    sb.append("    externalSkillLevel: ").append(toIndentedString(externalSkillLevel)).append("\n");
    sb.append("    externalSkillId: ").append(toIndentedString(externalSkillId)).append("\n");
    sb.append("    effectiveMoment: ").append(toIndentedString(effectiveMoment)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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
    openapiFields.add("externalSkillLevel");
    openapiFields.add("externalSkillId");
    openapiFields.add("effectiveMoment");
    openapiFields.add("context");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("externalSkillLevel");
    openapiRequiredFields.add("externalSkillId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf is not found in the empty JSON string", ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("externalSkillId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalSkillId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalSkillId").toString()));
      }
      if ((jsonObj.get("context") != null && !jsonObj.get("context").isJsonNull()) && !jsonObj.get("context").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `context` to be a primitive type in the JSON string but got `%s`", jsonObj.get("context").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf>() {
           @Override
           public void write(JsonWriter out, ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf value) throws IOException {
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
           public ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf
  * @throws IOException if the JSON string is invalid with respect to ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf
  */
  public static ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf.class);
  }

 /**
  * Convert an instance of ExternalSkillLevelA39462f09c44100005d46fd77ef00000AllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

