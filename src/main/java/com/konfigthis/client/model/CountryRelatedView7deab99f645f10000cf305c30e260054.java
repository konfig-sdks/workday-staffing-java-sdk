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
 * CountryRelatedView7deab99f645f10000cf305c30e260054
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CountryRelatedView7deab99f645f10000cf305c30e260054 {
  public static final String SERIALIZED_NAME_ALPHA3_CODE = "alpha3Code";
  @SerializedName(SERIALIZED_NAME_ALPHA3_CODE)
  private String alpha3Code;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTOR = "descriptor";
  @SerializedName(SERIALIZED_NAME_DESCRIPTOR)
  private String descriptor;

  public CountryRelatedView7deab99f645f10000cf305c30e260054() {
  }

  public CountryRelatedView7deab99f645f10000cf305c30e260054 alpha3Code(String alpha3Code) {
    
    
    
    
    this.alpha3Code = alpha3Code;
    return this;
  }

   /**
   * The ISO alpha-3 code for a country.
   * @return alpha3Code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "The ISO alpha-3 code for a country.")

  public String getAlpha3Code() {
    return alpha3Code;
  }


  public void setAlpha3Code(String alpha3Code) {
    
    
    
    this.alpha3Code = alpha3Code;
  }


  public CountryRelatedView7deab99f645f10000cf305c30e260054 id(String id) {
    
    
    
    
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


  public CountryRelatedView7deab99f645f10000cf305c30e260054 descriptor(String descriptor) {
    
    
    
    
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
   * @return the CountryRelatedView7deab99f645f10000cf305c30e260054 instance itself
   */
  public CountryRelatedView7deab99f645f10000cf305c30e260054 putAdditionalProperty(String key, Object value) {
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
    CountryRelatedView7deab99f645f10000cf305c30e260054 countryRelatedView7deab99f645f10000cf305c30e260054 = (CountryRelatedView7deab99f645f10000cf305c30e260054) o;
    return Objects.equals(this.alpha3Code, countryRelatedView7deab99f645f10000cf305c30e260054.alpha3Code) &&
        Objects.equals(this.id, countryRelatedView7deab99f645f10000cf305c30e260054.id) &&
        Objects.equals(this.descriptor, countryRelatedView7deab99f645f10000cf305c30e260054.descriptor)&&
        Objects.equals(this.additionalProperties, countryRelatedView7deab99f645f10000cf305c30e260054.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alpha3Code, id, descriptor, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryRelatedView7deab99f645f10000cf305c30e260054 {\n");
    sb.append("    alpha3Code: ").append(toIndentedString(alpha3Code)).append("\n");
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
    openapiFields.add("alpha3Code");
    openapiFields.add("id");
    openapiFields.add("descriptor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CountryRelatedView7deab99f645f10000cf305c30e260054
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CountryRelatedView7deab99f645f10000cf305c30e260054.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CountryRelatedView7deab99f645f10000cf305c30e260054 is not found in the empty JSON string", CountryRelatedView7deab99f645f10000cf305c30e260054.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("alpha3Code") != null && !jsonObj.get("alpha3Code").isJsonNull()) && !jsonObj.get("alpha3Code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alpha3Code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alpha3Code").toString()));
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
       if (!CountryRelatedView7deab99f645f10000cf305c30e260054.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CountryRelatedView7deab99f645f10000cf305c30e260054' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CountryRelatedView7deab99f645f10000cf305c30e260054> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CountryRelatedView7deab99f645f10000cf305c30e260054.class));

       return (TypeAdapter<T>) new TypeAdapter<CountryRelatedView7deab99f645f10000cf305c30e260054>() {
           @Override
           public void write(JsonWriter out, CountryRelatedView7deab99f645f10000cf305c30e260054 value) throws IOException {
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
           public CountryRelatedView7deab99f645f10000cf305c30e260054 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CountryRelatedView7deab99f645f10000cf305c30e260054 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CountryRelatedView7deab99f645f10000cf305c30e260054 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CountryRelatedView7deab99f645f10000cf305c30e260054
  * @throws IOException if the JSON string is invalid with respect to CountryRelatedView7deab99f645f10000cf305c30e260054
  */
  public static CountryRelatedView7deab99f645f10000cf305c30e260054 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CountryRelatedView7deab99f645f10000cf305c30e260054.class);
  }

 /**
  * Convert an instance of CountryRelatedView7deab99f645f10000cf305c30e260054 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

