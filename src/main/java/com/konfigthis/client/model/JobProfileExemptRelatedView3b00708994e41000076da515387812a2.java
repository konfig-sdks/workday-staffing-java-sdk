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
import com.konfigthis.client.model.CountryOrRegion3b00708994e4100007848bc917a112a6;
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
 * JobProfileExemptRelatedView3b00708994e41000076da515387812a2
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class JobProfileExemptRelatedView3b00708994e41000076da515387812a2 {
  public static final String SERIALIZED_NAME_COUNTRY_OR_REGION = "countryOrRegion";
  @SerializedName(SERIALIZED_NAME_COUNTRY_OR_REGION)
  private CountryOrRegion3b00708994e4100007848bc917a112a6 countryOrRegion;

  public static final String SERIALIZED_NAME_EXEMPT = "exempt";
  @SerializedName(SERIALIZED_NAME_EXEMPT)
  private Boolean exempt;

  public JobProfileExemptRelatedView3b00708994e41000076da515387812a2() {
  }

  public JobProfileExemptRelatedView3b00708994e41000076da515387812a2 countryOrRegion(CountryOrRegion3b00708994e4100007848bc917a112a6 countryOrRegion) {
    
    
    
    
    this.countryOrRegion = countryOrRegion;
    return this;
  }

   /**
   * Get countryOrRegion
   * @return countryOrRegion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CountryOrRegion3b00708994e4100007848bc917a112a6 getCountryOrRegion() {
    return countryOrRegion;
  }


  public void setCountryOrRegion(CountryOrRegion3b00708994e4100007848bc917a112a6 countryOrRegion) {
    
    
    
    this.countryOrRegion = countryOrRegion;
  }


  public JobProfileExemptRelatedView3b00708994e41000076da515387812a2 exempt(Boolean exempt) {
    
    
    
    
    this.exempt = exempt;
    return this;
  }

   /**
   * Returns the exempt value for this Job Profile Exempt.
   * @return exempt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Returns the exempt value for this Job Profile Exempt.")

  public Boolean getExempt() {
    return exempt;
  }


  public void setExempt(Boolean exempt) {
    
    
    
    this.exempt = exempt;
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
   * @return the JobProfileExemptRelatedView3b00708994e41000076da515387812a2 instance itself
   */
  public JobProfileExemptRelatedView3b00708994e41000076da515387812a2 putAdditionalProperty(String key, Object value) {
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
    JobProfileExemptRelatedView3b00708994e41000076da515387812a2 jobProfileExemptRelatedView3b00708994e41000076da515387812a2 = (JobProfileExemptRelatedView3b00708994e41000076da515387812a2) o;
    return Objects.equals(this.countryOrRegion, jobProfileExemptRelatedView3b00708994e41000076da515387812a2.countryOrRegion) &&
        Objects.equals(this.exempt, jobProfileExemptRelatedView3b00708994e41000076da515387812a2.exempt)&&
        Objects.equals(this.additionalProperties, jobProfileExemptRelatedView3b00708994e41000076da515387812a2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryOrRegion, exempt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobProfileExemptRelatedView3b00708994e41000076da515387812a2 {\n");
    sb.append("    countryOrRegion: ").append(toIndentedString(countryOrRegion)).append("\n");
    sb.append("    exempt: ").append(toIndentedString(exempt)).append("\n");
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
    openapiFields.add("countryOrRegion");
    openapiFields.add("exempt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobProfileExemptRelatedView3b00708994e41000076da515387812a2
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JobProfileExemptRelatedView3b00708994e41000076da515387812a2.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobProfileExemptRelatedView3b00708994e41000076da515387812a2 is not found in the empty JSON string", JobProfileExemptRelatedView3b00708994e41000076da515387812a2.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `countryOrRegion`
      if (jsonObj.get("countryOrRegion") != null && !jsonObj.get("countryOrRegion").isJsonNull()) {
        CountryOrRegion3b00708994e4100007848bc917a112a6.validateJsonObject(jsonObj.getAsJsonObject("countryOrRegion"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobProfileExemptRelatedView3b00708994e41000076da515387812a2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobProfileExemptRelatedView3b00708994e41000076da515387812a2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobProfileExemptRelatedView3b00708994e41000076da515387812a2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobProfileExemptRelatedView3b00708994e41000076da515387812a2.class));

       return (TypeAdapter<T>) new TypeAdapter<JobProfileExemptRelatedView3b00708994e41000076da515387812a2>() {
           @Override
           public void write(JsonWriter out, JobProfileExemptRelatedView3b00708994e41000076da515387812a2 value) throws IOException {
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
           public JobProfileExemptRelatedView3b00708994e41000076da515387812a2 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             JobProfileExemptRelatedView3b00708994e41000076da515387812a2 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of JobProfileExemptRelatedView3b00708994e41000076da515387812a2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobProfileExemptRelatedView3b00708994e41000076da515387812a2
  * @throws IOException if the JSON string is invalid with respect to JobProfileExemptRelatedView3b00708994e41000076da515387812a2
  */
  public static JobProfileExemptRelatedView3b00708994e41000076da515387812a2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobProfileExemptRelatedView3b00708994e41000076da515387812a2.class);
  }

 /**
  * Convert an instance of JobProfileExemptRelatedView3b00708994e41000076da515387812a2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

