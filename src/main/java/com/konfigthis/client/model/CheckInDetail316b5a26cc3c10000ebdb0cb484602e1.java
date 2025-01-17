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
import com.konfigthis.client.model.AssociatedCheckInTopicDetail316b5a26cc3c100010a01184c23902ea;
import com.konfigthis.client.model.CheckInAttachmentDetailEf244acfe6cf10002ebe92d43a7701d7;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
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
 * CheckInDetail316b5a26cc3c10000ebdb0cb484602e1
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CheckInDetail316b5a26cc3c10000ebdb0cb484602e1 {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ASSOCIATED_TOPICS = "associatedTopics";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_TOPICS)
  private List<AssociatedCheckInTopicDetail316b5a26cc3c100010a01184c23902ea> associatedTopics = null;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_CHECK_IN_ATTACHMENTS = "checkInAttachments";
  @SerializedName(SERIALIZED_NAME_CHECK_IN_ATTACHMENTS)
  private List<CheckInAttachmentDetailEf244acfe6cf10002ebe92d43a7701d7> checkInAttachments = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public CheckInDetail316b5a26cc3c10000ebdb0cb484602e1() {
  }

  public CheckInDetail316b5a26cc3c10000ebdb0cb484602e1 description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Description of check-in.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "Description of check-in.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public CheckInDetail316b5a26cc3c10000ebdb0cb484602e1 associatedTopics(List<AssociatedCheckInTopicDetail316b5a26cc3c100010a01184c23902ea> associatedTopics) {
    
    
    
    
    this.associatedTopics = associatedTopics;
    return this;
  }

  public CheckInDetail316b5a26cc3c10000ebdb0cb484602e1 addAssociatedTopicsItem(AssociatedCheckInTopicDetail316b5a26cc3c100010a01184c23902ea associatedTopicsItem) {
    if (this.associatedTopics == null) {
      this.associatedTopics = new ArrayList<>();
    }
    this.associatedTopics.add(associatedTopicsItem);
    return this;
  }

   /**
   * Topics included in a check-in.
   * @return associatedTopics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Topics included in a check-in.")

  public List<AssociatedCheckInTopicDetail316b5a26cc3c100010a01184c23902ea> getAssociatedTopics() {
    return associatedTopics;
  }


  public void setAssociatedTopics(List<AssociatedCheckInTopicDetail316b5a26cc3c100010a01184c23902ea> associatedTopics) {
    
    
    
    this.associatedTopics = associatedTopics;
  }


  public CheckInDetail316b5a26cc3c10000ebdb0cb484602e1 date(LocalDate date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * Date of check-in.
   * @return date
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Date of check-in.")

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    
    
    
    this.date = date;
  }


  public CheckInDetail316b5a26cc3c10000ebdb0cb484602e1 checkInAttachments(List<CheckInAttachmentDetailEf244acfe6cf10002ebe92d43a7701d7> checkInAttachments) {
    
    
    
    
    this.checkInAttachments = checkInAttachments;
    return this;
  }

  public CheckInDetail316b5a26cc3c10000ebdb0cb484602e1 addCheckInAttachmentsItem(CheckInAttachmentDetailEf244acfe6cf10002ebe92d43a7701d7 checkInAttachmentsItem) {
    if (this.checkInAttachments == null) {
      this.checkInAttachments = new ArrayList<>();
    }
    this.checkInAttachments.add(checkInAttachmentsItem);
    return this;
  }

   /**
   * Returns all attachments for the Check-In.
   * @return checkInAttachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns all attachments for the Check-In.")

  public List<CheckInAttachmentDetailEf244acfe6cf10002ebe92d43a7701d7> getCheckInAttachments() {
    return checkInAttachments;
  }


  public void setCheckInAttachments(List<CheckInAttachmentDetailEf244acfe6cf10002ebe92d43a7701d7> checkInAttachments) {
    
    
    
    this.checkInAttachments = checkInAttachments;
  }


  public CheckInDetail316b5a26cc3c10000ebdb0cb484602e1 id(String id) {
    
    
    
    
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
   * @return the CheckInDetail316b5a26cc3c10000ebdb0cb484602e1 instance itself
   */
  public CheckInDetail316b5a26cc3c10000ebdb0cb484602e1 putAdditionalProperty(String key, Object value) {
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
    CheckInDetail316b5a26cc3c10000ebdb0cb484602e1 checkInDetail316b5a26cc3c10000ebdb0cb484602e1 = (CheckInDetail316b5a26cc3c10000ebdb0cb484602e1) o;
    return Objects.equals(this.description, checkInDetail316b5a26cc3c10000ebdb0cb484602e1.description) &&
        Objects.equals(this.associatedTopics, checkInDetail316b5a26cc3c10000ebdb0cb484602e1.associatedTopics) &&
        Objects.equals(this.date, checkInDetail316b5a26cc3c10000ebdb0cb484602e1.date) &&
        Objects.equals(this.checkInAttachments, checkInDetail316b5a26cc3c10000ebdb0cb484602e1.checkInAttachments) &&
        Objects.equals(this.id, checkInDetail316b5a26cc3c10000ebdb0cb484602e1.id)&&
        Objects.equals(this.additionalProperties, checkInDetail316b5a26cc3c10000ebdb0cb484602e1.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, associatedTopics, date, checkInAttachments, id, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckInDetail316b5a26cc3c10000ebdb0cb484602e1 {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    associatedTopics: ").append(toIndentedString(associatedTopics)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    checkInAttachments: ").append(toIndentedString(checkInAttachments)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("associatedTopics");
    openapiFields.add("date");
    openapiFields.add("checkInAttachments");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("date");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CheckInDetail316b5a26cc3c10000ebdb0cb484602e1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CheckInDetail316b5a26cc3c10000ebdb0cb484602e1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckInDetail316b5a26cc3c10000ebdb0cb484602e1 is not found in the empty JSON string", CheckInDetail316b5a26cc3c10000ebdb0cb484602e1.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CheckInDetail316b5a26cc3c10000ebdb0cb484602e1.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("associatedTopics") != null && !jsonObj.get("associatedTopics").isJsonNull()) {
        JsonArray jsonArrayassociatedTopics = jsonObj.getAsJsonArray("associatedTopics");
        if (jsonArrayassociatedTopics != null) {
          // ensure the json data is an array
          if (!jsonObj.get("associatedTopics").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `associatedTopics` to be an array in the JSON string but got `%s`", jsonObj.get("associatedTopics").toString()));
          }

          // validate the optional field `associatedTopics` (array)
          for (int i = 0; i < jsonArrayassociatedTopics.size(); i++) {
            AssociatedCheckInTopicDetail316b5a26cc3c100010a01184c23902ea.validateJsonObject(jsonArrayassociatedTopics.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("checkInAttachments") != null && !jsonObj.get("checkInAttachments").isJsonNull()) {
        JsonArray jsonArraycheckInAttachments = jsonObj.getAsJsonArray("checkInAttachments");
        if (jsonArraycheckInAttachments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("checkInAttachments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `checkInAttachments` to be an array in the JSON string but got `%s`", jsonObj.get("checkInAttachments").toString()));
          }

          // validate the optional field `checkInAttachments` (array)
          for (int i = 0; i < jsonArraycheckInAttachments.size(); i++) {
            CheckInAttachmentDetailEf244acfe6cf10002ebe92d43a7701d7.validateJsonObject(jsonArraycheckInAttachments.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckInDetail316b5a26cc3c10000ebdb0cb484602e1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckInDetail316b5a26cc3c10000ebdb0cb484602e1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckInDetail316b5a26cc3c10000ebdb0cb484602e1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckInDetail316b5a26cc3c10000ebdb0cb484602e1.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckInDetail316b5a26cc3c10000ebdb0cb484602e1>() {
           @Override
           public void write(JsonWriter out, CheckInDetail316b5a26cc3c10000ebdb0cb484602e1 value) throws IOException {
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
           public CheckInDetail316b5a26cc3c10000ebdb0cb484602e1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CheckInDetail316b5a26cc3c10000ebdb0cb484602e1 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CheckInDetail316b5a26cc3c10000ebdb0cb484602e1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CheckInDetail316b5a26cc3c10000ebdb0cb484602e1
  * @throws IOException if the JSON string is invalid with respect to CheckInDetail316b5a26cc3c10000ebdb0cb484602e1
  */
  public static CheckInDetail316b5a26cc3c10000ebdb0cb484602e1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckInDetail316b5a26cc3c10000ebdb0cb484602e1.class);
  }

 /**
  * Convert an instance of CheckInDetail316b5a26cc3c10000ebdb0cb484602e1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

