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
import com.konfigthis.client.model.SkillItemAddDefinitionFaed9891d75a10001e9a289910540228;
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
 * SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf {
  public static final String SERIALIZED_NAME_SKILL_ITEMS = "skillItems";
  @SerializedName(SERIALIZED_NAME_SKILL_ITEMS)
  private List<SkillItemAddDefinitionFaed9891d75a10001e9a289910540228> skillItems = null;

  public SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf() {
  }

  public SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf skillItems(List<SkillItemAddDefinitionFaed9891d75a10001e9a289910540228> skillItems) {
    
    
    
    
    this.skillItems = skillItems;
    return this;
  }

  public SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf addSkillItemsItem(SkillItemAddDefinitionFaed9891d75a10001e9a289910540228 skillItemsItem) {
    if (this.skillItems == null) {
      this.skillItems = new ArrayList<>();
    }
    this.skillItems.add(skillItemsItem);
    return this;
  }

   /**
   * Exposes Skill Items for a Skill Qualification Enabled.
   * @return skillItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Exposes Skill Items for a Skill Qualification Enabled.")

  public List<SkillItemAddDefinitionFaed9891d75a10001e9a289910540228> getSkillItems() {
    return skillItems;
  }


  public void setSkillItems(List<SkillItemAddDefinitionFaed9891d75a10001e9a289910540228> skillItems) {
    
    
    
    this.skillItems = skillItems;
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
   * @return the SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf instance itself
   */
  public SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf putAdditionalProperty(String key, Object value) {
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
    SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf skillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf = (SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf) o;
    return Objects.equals(this.skillItems, skillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf.skillItems)&&
        Objects.equals(this.additionalProperties, skillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skillItems, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf {\n");
    sb.append("    skillItems: ").append(toIndentedString(skillItems)).append("\n");
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
    openapiFields.add("skillItems");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf is not found in the empty JSON string", SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("skillItems") != null && !jsonObj.get("skillItems").isJsonNull()) {
        JsonArray jsonArrayskillItems = jsonObj.getAsJsonArray("skillItems");
        if (jsonArrayskillItems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("skillItems").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `skillItems` to be an array in the JSON string but got `%s`", jsonObj.get("skillItems").toString()));
          }

          // validate the optional field `skillItems` (array)
          for (int i = 0; i < jsonArrayskillItems.size(); i++) {
            SkillItemAddDefinitionFaed9891d75a10001e9a289910540228.validateJsonObject(jsonArrayskillItems.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf>() {
           @Override
           public void write(JsonWriter out, SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf value) throws IOException {
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
           public SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf
  * @throws IOException if the JSON string is invalid with respect to SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf
  */
  public static SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf.class);
  }

 /**
  * Convert an instance of SkillItemsBulkDefinition9d815bbfd67010000d6ed56204ab12deAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
