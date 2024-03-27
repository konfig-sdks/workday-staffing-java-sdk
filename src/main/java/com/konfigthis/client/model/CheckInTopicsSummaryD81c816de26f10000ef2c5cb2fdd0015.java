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
import com.konfigthis.client.model.AssociatedCheckInsSummaryD81c816de26f10000f7a29ea89140020;
import com.konfigthis.client.model.CheckInTopicAttachmentDetail600ecde4c8421000278d06bfacea01c1;
import com.konfigthis.client.model.CreatorD81c816de26f10000f521459ac80001d;
import com.konfigthis.client.model.ParticipantD81c816de26f10000f52144d053f001b;
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
 * CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015 {
  public static final String SERIALIZED_NAME_SHARED_NOTES = "sharedNotes";
  @SerializedName(SERIALIZED_NAME_SHARED_NOTES)
  private String sharedNotes;

  public static final String SERIALIZED_NAME_PRIVATE_NOTES = "privateNotes";
  @SerializedName(SERIALIZED_NAME_PRIVATE_NOTES)
  private String privateNotes;

  public static final String SERIALIZED_NAME_ARCHIVED = "archived";
  @SerializedName(SERIALIZED_NAME_ARCHIVED)
  private Boolean archived;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CHECK_IN_TOPIC_ATTACHMENTS = "checkInTopicAttachments";
  @SerializedName(SERIALIZED_NAME_CHECK_IN_TOPIC_ATTACHMENTS)
  private List<CheckInTopicAttachmentDetail600ecde4c8421000278d06bfacea01c1> checkInTopicAttachments = null;

  public static final String SERIALIZED_NAME_PARTICIPANT = "participant";
  @SerializedName(SERIALIZED_NAME_PARTICIPANT)
  private ParticipantD81c816de26f10000f52144d053f001b participant;

  public static final String SERIALIZED_NAME_ASSOCIATED_CHECK_INS = "associatedCheckIns";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_CHECK_INS)
  private List<AssociatedCheckInsSummaryD81c816de26f10000f7a29ea89140020> associatedCheckIns = null;

  public static final String SERIALIZED_NAME_CREATOR = "creator";
  @SerializedName(SERIALIZED_NAME_CREATOR)
  private CreatorD81c816de26f10000f521459ac80001d creator;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015() {
  }

  public CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015 sharedNotes(String sharedNotes) {
    
    
    
    
    this.sharedNotes = sharedNotes;
    return this;
  }

   /**
   * Shared notes of the topic.
   * @return sharedNotes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "Shared notes of the topic.")

  public String getSharedNotes() {
    return sharedNotes;
  }


  public void setSharedNotes(String sharedNotes) {
    
    
    
    this.sharedNotes = sharedNotes;
  }


  public CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015 privateNotes(String privateNotes) {
    
    
    
    
    this.privateNotes = privateNotes;
    return this;
  }

   /**
   * Personal notes of the topic.
   * @return privateNotes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "Personal notes of the topic.")

  public String getPrivateNotes() {
    return privateNotes;
  }


  public void setPrivateNotes(String privateNotes) {
    
    
    
    this.privateNotes = privateNotes;
  }


  public CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015 archived(Boolean archived) {
    
    
    
    
    this.archived = archived;
    return this;
  }

   /**
   * Indicates that the topic is archived.
   * @return archived
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates that the topic is archived.")

  public Boolean getArchived() {
    return archived;
  }


  public void setArchived(Boolean archived) {
    
    
    
    this.archived = archived;
  }


  public CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015 name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Topic name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "Topic name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015 checkInTopicAttachments(List<CheckInTopicAttachmentDetail600ecde4c8421000278d06bfacea01c1> checkInTopicAttachments) {
    
    
    
    
    this.checkInTopicAttachments = checkInTopicAttachments;
    return this;
  }

  public CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015 addCheckInTopicAttachmentsItem(CheckInTopicAttachmentDetail600ecde4c8421000278d06bfacea01c1 checkInTopicAttachmentsItem) {
    if (this.checkInTopicAttachments == null) {
      this.checkInTopicAttachments = new ArrayList<>();
    }
    this.checkInTopicAttachments.add(checkInTopicAttachmentsItem);
    return this;
  }

   /**
   * Returns all attachments for the Check-In Topic.
   * @return checkInTopicAttachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns all attachments for the Check-In Topic.")

  public List<CheckInTopicAttachmentDetail600ecde4c8421000278d06bfacea01c1> getCheckInTopicAttachments() {
    return checkInTopicAttachments;
  }


  public void setCheckInTopicAttachments(List<CheckInTopicAttachmentDetail600ecde4c8421000278d06bfacea01c1> checkInTopicAttachments) {
    
    
    
    this.checkInTopicAttachments = checkInTopicAttachments;
  }


  public CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015 participant(ParticipantD81c816de26f10000f52144d053f001b participant) {
    
    
    
    
    this.participant = participant;
    return this;
  }

   /**
   * Get participant
   * @return participant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ParticipantD81c816de26f10000f52144d053f001b getParticipant() {
    return participant;
  }


  public void setParticipant(ParticipantD81c816de26f10000f52144d053f001b participant) {
    
    
    
    this.participant = participant;
  }


  public CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015 associatedCheckIns(List<AssociatedCheckInsSummaryD81c816de26f10000f7a29ea89140020> associatedCheckIns) {
    
    
    
    
    this.associatedCheckIns = associatedCheckIns;
    return this;
  }

  public CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015 addAssociatedCheckInsItem(AssociatedCheckInsSummaryD81c816de26f10000f7a29ea89140020 associatedCheckInsItem) {
    if (this.associatedCheckIns == null) {
      this.associatedCheckIns = new ArrayList<>();
    }
    this.associatedCheckIns.add(associatedCheckInsItem);
    return this;
  }

   /**
   * Check-ins associated to topic.
   * @return associatedCheckIns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Check-ins associated to topic.")

  public List<AssociatedCheckInsSummaryD81c816de26f10000f7a29ea89140020> getAssociatedCheckIns() {
    return associatedCheckIns;
  }


  public void setAssociatedCheckIns(List<AssociatedCheckInsSummaryD81c816de26f10000f7a29ea89140020> associatedCheckIns) {
    
    
    
    this.associatedCheckIns = associatedCheckIns;
  }


  public CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015 creator(CreatorD81c816de26f10000f521459ac80001d creator) {
    
    
    
    
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreatorD81c816de26f10000f521459ac80001d getCreator() {
    return creator;
  }


  public void setCreator(CreatorD81c816de26f10000f521459ac80001d creator) {
    
    
    
    this.creator = creator;
  }


  public CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015 id(String id) {
    
    
    
    
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
   * @return the CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015 instance itself
   */
  public CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015 putAdditionalProperty(String key, Object value) {
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
    CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015 checkInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015 = (CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015) o;
    return Objects.equals(this.sharedNotes, checkInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015.sharedNotes) &&
        Objects.equals(this.privateNotes, checkInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015.privateNotes) &&
        Objects.equals(this.archived, checkInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015.archived) &&
        Objects.equals(this.name, checkInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015.name) &&
        Objects.equals(this.checkInTopicAttachments, checkInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015.checkInTopicAttachments) &&
        Objects.equals(this.participant, checkInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015.participant) &&
        Objects.equals(this.associatedCheckIns, checkInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015.associatedCheckIns) &&
        Objects.equals(this.creator, checkInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015.creator) &&
        Objects.equals(this.id, checkInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015.id)&&
        Objects.equals(this.additionalProperties, checkInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharedNotes, privateNotes, archived, name, checkInTopicAttachments, participant, associatedCheckIns, creator, id, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015 {\n");
    sb.append("    sharedNotes: ").append(toIndentedString(sharedNotes)).append("\n");
    sb.append("    privateNotes: ").append(toIndentedString(privateNotes)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    checkInTopicAttachments: ").append(toIndentedString(checkInTopicAttachments)).append("\n");
    sb.append("    participant: ").append(toIndentedString(participant)).append("\n");
    sb.append("    associatedCheckIns: ").append(toIndentedString(associatedCheckIns)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
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
    openapiFields.add("sharedNotes");
    openapiFields.add("privateNotes");
    openapiFields.add("archived");
    openapiFields.add("name");
    openapiFields.add("checkInTopicAttachments");
    openapiFields.add("participant");
    openapiFields.add("associatedCheckIns");
    openapiFields.add("creator");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015 is not found in the empty JSON string", CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("sharedNotes") != null && !jsonObj.get("sharedNotes").isJsonNull()) && !jsonObj.get("sharedNotes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sharedNotes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sharedNotes").toString()));
      }
      if ((jsonObj.get("privateNotes") != null && !jsonObj.get("privateNotes").isJsonNull()) && !jsonObj.get("privateNotes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `privateNotes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("privateNotes").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("checkInTopicAttachments") != null && !jsonObj.get("checkInTopicAttachments").isJsonNull()) {
        JsonArray jsonArraycheckInTopicAttachments = jsonObj.getAsJsonArray("checkInTopicAttachments");
        if (jsonArraycheckInTopicAttachments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("checkInTopicAttachments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `checkInTopicAttachments` to be an array in the JSON string but got `%s`", jsonObj.get("checkInTopicAttachments").toString()));
          }

          // validate the optional field `checkInTopicAttachments` (array)
          for (int i = 0; i < jsonArraycheckInTopicAttachments.size(); i++) {
            CheckInTopicAttachmentDetail600ecde4c8421000278d06bfacea01c1.validateJsonObject(jsonArraycheckInTopicAttachments.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `participant`
      if (jsonObj.get("participant") != null && !jsonObj.get("participant").isJsonNull()) {
        ParticipantD81c816de26f10000f52144d053f001b.validateJsonObject(jsonObj.getAsJsonObject("participant"));
      }
      if (jsonObj.get("associatedCheckIns") != null && !jsonObj.get("associatedCheckIns").isJsonNull()) {
        JsonArray jsonArrayassociatedCheckIns = jsonObj.getAsJsonArray("associatedCheckIns");
        if (jsonArrayassociatedCheckIns != null) {
          // ensure the json data is an array
          if (!jsonObj.get("associatedCheckIns").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `associatedCheckIns` to be an array in the JSON string but got `%s`", jsonObj.get("associatedCheckIns").toString()));
          }

          // validate the optional field `associatedCheckIns` (array)
          for (int i = 0; i < jsonArrayassociatedCheckIns.size(); i++) {
            AssociatedCheckInsSummaryD81c816de26f10000f7a29ea89140020.validateJsonObject(jsonArrayassociatedCheckIns.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `creator`
      if (jsonObj.get("creator") != null && !jsonObj.get("creator").isJsonNull()) {
        CreatorD81c816de26f10000f521459ac80001d.validateJsonObject(jsonObj.getAsJsonObject("creator"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015>() {
           @Override
           public void write(JsonWriter out, CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015 value) throws IOException {
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
           public CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015
  * @throws IOException if the JSON string is invalid with respect to CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015
  */
  public static CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015.class);
  }

 /**
  * Convert an instance of CheckInTopicsSummaryD81c816de26f10000ef2c5cb2fdd0015 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

