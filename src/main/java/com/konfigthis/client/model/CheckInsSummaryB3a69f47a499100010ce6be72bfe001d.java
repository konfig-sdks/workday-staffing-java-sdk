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
import com.konfigthis.client.model.AssociatedTopicsSummaryB3a69f47a4991000171aae4c5a810040;
import com.konfigthis.client.model.CheckInAttachmentDetailEf244acfe6cf10002ebe92d43a7701d7;
import com.konfigthis.client.model.CreatorB3a69f47a49910001687de28dd71003d;
import com.konfigthis.client.model.ParticipantB3a69f47a49910001687de1d4c75003c;
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
 * CheckInsSummaryB3a69f47a499100010ce6be72bfe001d
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CheckInsSummaryB3a69f47a499100010ce6be72bfe001d {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ASSOCIATED_TOPICS = "associatedTopics";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_TOPICS)
  private List<AssociatedTopicsSummaryB3a69f47a4991000171aae4c5a810040> associatedTopics = null;

  public static final String SERIALIZED_NAME_CREATOR = "creator";
  @SerializedName(SERIALIZED_NAME_CREATOR)
  private CreatorB3a69f47a49910001687de28dd71003d creator;

  public static final String SERIALIZED_NAME_ARCHIVED = "archived";
  @SerializedName(SERIALIZED_NAME_ARCHIVED)
  private Boolean archived;

  public static final String SERIALIZED_NAME_CHECK_IN_ATTACHMENTS = "checkInAttachments";
  @SerializedName(SERIALIZED_NAME_CHECK_IN_ATTACHMENTS)
  private List<CheckInAttachmentDetailEf244acfe6cf10002ebe92d43a7701d7> checkInAttachments = null;

  public static final String SERIALIZED_NAME_PARTICIPANT = "participant";
  @SerializedName(SERIALIZED_NAME_PARTICIPANT)
  private ParticipantB3a69f47a49910001687de1d4c75003c participant;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public CheckInsSummaryB3a69f47a499100010ce6be72bfe001d() {
  }

  public CheckInsSummaryB3a69f47a499100010ce6be72bfe001d description(String description) {
    
    
    
    
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


  public CheckInsSummaryB3a69f47a499100010ce6be72bfe001d associatedTopics(List<AssociatedTopicsSummaryB3a69f47a4991000171aae4c5a810040> associatedTopics) {
    
    
    
    
    this.associatedTopics = associatedTopics;
    return this;
  }

  public CheckInsSummaryB3a69f47a499100010ce6be72bfe001d addAssociatedTopicsItem(AssociatedTopicsSummaryB3a69f47a4991000171aae4c5a810040 associatedTopicsItem) {
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

  public List<AssociatedTopicsSummaryB3a69f47a4991000171aae4c5a810040> getAssociatedTopics() {
    return associatedTopics;
  }


  public void setAssociatedTopics(List<AssociatedTopicsSummaryB3a69f47a4991000171aae4c5a810040> associatedTopics) {
    
    
    
    this.associatedTopics = associatedTopics;
  }


  public CheckInsSummaryB3a69f47a499100010ce6be72bfe001d creator(CreatorB3a69f47a49910001687de28dd71003d creator) {
    
    
    
    
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreatorB3a69f47a49910001687de28dd71003d getCreator() {
    return creator;
  }


  public void setCreator(CreatorB3a69f47a49910001687de28dd71003d creator) {
    
    
    
    this.creator = creator;
  }


  public CheckInsSummaryB3a69f47a499100010ce6be72bfe001d archived(Boolean archived) {
    
    
    
    
    this.archived = archived;
    return this;
  }

   /**
   * Indicates that the check-in is archived.
   * @return archived
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates that the check-in is archived.")

  public Boolean getArchived() {
    return archived;
  }


  public void setArchived(Boolean archived) {
    
    
    
    this.archived = archived;
  }


  public CheckInsSummaryB3a69f47a499100010ce6be72bfe001d checkInAttachments(List<CheckInAttachmentDetailEf244acfe6cf10002ebe92d43a7701d7> checkInAttachments) {
    
    
    
    
    this.checkInAttachments = checkInAttachments;
    return this;
  }

  public CheckInsSummaryB3a69f47a499100010ce6be72bfe001d addCheckInAttachmentsItem(CheckInAttachmentDetailEf244acfe6cf10002ebe92d43a7701d7 checkInAttachmentsItem) {
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


  public CheckInsSummaryB3a69f47a499100010ce6be72bfe001d participant(ParticipantB3a69f47a49910001687de1d4c75003c participant) {
    
    
    
    
    this.participant = participant;
    return this;
  }

   /**
   * Get participant
   * @return participant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ParticipantB3a69f47a49910001687de1d4c75003c getParticipant() {
    return participant;
  }


  public void setParticipant(ParticipantB3a69f47a49910001687de1d4c75003c participant) {
    
    
    
    this.participant = participant;
  }


  public CheckInsSummaryB3a69f47a499100010ce6be72bfe001d date(LocalDate date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * Date of check-in.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of check-in.")

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    
    
    
    this.date = date;
  }


  public CheckInsSummaryB3a69f47a499100010ce6be72bfe001d id(String id) {
    
    
    
    
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
   * @return the CheckInsSummaryB3a69f47a499100010ce6be72bfe001d instance itself
   */
  public CheckInsSummaryB3a69f47a499100010ce6be72bfe001d putAdditionalProperty(String key, Object value) {
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
    CheckInsSummaryB3a69f47a499100010ce6be72bfe001d checkInsSummaryB3a69f47a499100010ce6be72bfe001d = (CheckInsSummaryB3a69f47a499100010ce6be72bfe001d) o;
    return Objects.equals(this.description, checkInsSummaryB3a69f47a499100010ce6be72bfe001d.description) &&
        Objects.equals(this.associatedTopics, checkInsSummaryB3a69f47a499100010ce6be72bfe001d.associatedTopics) &&
        Objects.equals(this.creator, checkInsSummaryB3a69f47a499100010ce6be72bfe001d.creator) &&
        Objects.equals(this.archived, checkInsSummaryB3a69f47a499100010ce6be72bfe001d.archived) &&
        Objects.equals(this.checkInAttachments, checkInsSummaryB3a69f47a499100010ce6be72bfe001d.checkInAttachments) &&
        Objects.equals(this.participant, checkInsSummaryB3a69f47a499100010ce6be72bfe001d.participant) &&
        Objects.equals(this.date, checkInsSummaryB3a69f47a499100010ce6be72bfe001d.date) &&
        Objects.equals(this.id, checkInsSummaryB3a69f47a499100010ce6be72bfe001d.id)&&
        Objects.equals(this.additionalProperties, checkInsSummaryB3a69f47a499100010ce6be72bfe001d.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, associatedTopics, creator, archived, checkInAttachments, participant, date, id, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckInsSummaryB3a69f47a499100010ce6be72bfe001d {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    associatedTopics: ").append(toIndentedString(associatedTopics)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    checkInAttachments: ").append(toIndentedString(checkInAttachments)).append("\n");
    sb.append("    participant: ").append(toIndentedString(participant)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
    openapiFields.add("creator");
    openapiFields.add("archived");
    openapiFields.add("checkInAttachments");
    openapiFields.add("participant");
    openapiFields.add("date");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CheckInsSummaryB3a69f47a499100010ce6be72bfe001d
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CheckInsSummaryB3a69f47a499100010ce6be72bfe001d.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckInsSummaryB3a69f47a499100010ce6be72bfe001d is not found in the empty JSON string", CheckInsSummaryB3a69f47a499100010ce6be72bfe001d.openapiRequiredFields.toString()));
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
            AssociatedTopicsSummaryB3a69f47a4991000171aae4c5a810040.validateJsonObject(jsonArrayassociatedTopics.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `creator`
      if (jsonObj.get("creator") != null && !jsonObj.get("creator").isJsonNull()) {
        CreatorB3a69f47a49910001687de28dd71003d.validateJsonObject(jsonObj.getAsJsonObject("creator"));
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
      // validate the optional field `participant`
      if (jsonObj.get("participant") != null && !jsonObj.get("participant").isJsonNull()) {
        ParticipantB3a69f47a49910001687de1d4c75003c.validateJsonObject(jsonObj.getAsJsonObject("participant"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckInsSummaryB3a69f47a499100010ce6be72bfe001d.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckInsSummaryB3a69f47a499100010ce6be72bfe001d' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckInsSummaryB3a69f47a499100010ce6be72bfe001d> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckInsSummaryB3a69f47a499100010ce6be72bfe001d.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckInsSummaryB3a69f47a499100010ce6be72bfe001d>() {
           @Override
           public void write(JsonWriter out, CheckInsSummaryB3a69f47a499100010ce6be72bfe001d value) throws IOException {
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
           public CheckInsSummaryB3a69f47a499100010ce6be72bfe001d read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CheckInsSummaryB3a69f47a499100010ce6be72bfe001d instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CheckInsSummaryB3a69f47a499100010ce6be72bfe001d given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CheckInsSummaryB3a69f47a499100010ce6be72bfe001d
  * @throws IOException if the JSON string is invalid with respect to CheckInsSummaryB3a69f47a499100010ce6be72bfe001d
  */
  public static CheckInsSummaryB3a69f47a499100010ce6be72bfe001d fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckInsSummaryB3a69f47a499100010ce6be72bfe001d.class);
  }

 /**
  * Convert an instance of CheckInsSummaryB3a69f47a499100010ce6be72bfe001d to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

