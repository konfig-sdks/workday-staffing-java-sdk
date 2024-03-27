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
import com.konfigthis.client.model.Action38ff08ab6736100010816009079d0126;
import com.konfigthis.client.model.Comments86093b8a932f10001499f356ff83012e;
import com.konfigthis.client.model.EventAttachmentsForToolbar43b30ba735b8100011ee4767246d0143;
import com.konfigthis.client.model.For5d688bd57bb910001815ab3dd10024a9;
import com.konfigthis.client.model.OverallBusinessProcess5d688bd57bb910001815ab49927724aa;
import com.konfigthis.client.model.TransactionStatus7457adcbe0fa1000089b63ab3a510000;
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
 * The Action Event instance to be used with businessProcessLinkable linked service representations.
 */
@ApiModel(description = "The Action Event instance to be used with businessProcessLinkable linked service representations.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BusinessProcessParameters23782ad3f54110002073aab65def00fb {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private Action38ff08ab6736100010816009079d0126 action;

  public static final String SERIALIZED_NAME_OVERALL_BUSINESS_PROCESS = "overallBusinessProcess";
  @SerializedName(SERIALIZED_NAME_OVERALL_BUSINESS_PROCESS)
  private OverallBusinessProcess5d688bd57bb910001815ab49927724aa overallBusinessProcess;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private List<Comments86093b8a932f10001499f356ff83012e> comments = null;

  public static final String SERIALIZED_NAME_TRANSACTION_STATUS = "transactionStatus";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_STATUS)
  private TransactionStatus7457adcbe0fa1000089b63ab3a510000 transactionStatus;

  public static final String SERIALIZED_NAME_WARNING_VALIDATIONS = "warningValidations";
  @SerializedName(SERIALIZED_NAME_WARNING_VALIDATIONS)
  private String warningValidations;

  public static final String SERIALIZED_NAME_OVERALL_STATUS = "overallStatus";
  @SerializedName(SERIALIZED_NAME_OVERALL_STATUS)
  private String overallStatus;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<EventAttachmentsForToolbar43b30ba735b8100011ee4767246d0143> attachments = null;

  public static final String SERIALIZED_NAME_CRITICAL_VALIDATIONS = "criticalValidations";
  @SerializedName(SERIALIZED_NAME_CRITICAL_VALIDATIONS)
  private String criticalValidations;

  public static final String SERIALIZED_NAME_FOR = "for";
  @SerializedName(SERIALIZED_NAME_FOR)
  private For5d688bd57bb910001815ab3dd10024a9 _for;

  public BusinessProcessParameters23782ad3f54110002073aab65def00fb() {
  }

  
  public BusinessProcessParameters23782ad3f54110002073aab65def00fb(
     List<Comments86093b8a932f10001499f356ff83012e> comments, 
     String warningValidations, 
     String overallStatus, 
     String criticalValidations
  ) {
    this();
    this.comments = comments;
    this.warningValidations = warningValidations;
    this.overallStatus = overallStatus;
    this.criticalValidations = criticalValidations;
  }

  public BusinessProcessParameters23782ad3f54110002073aab65def00fb action(Action38ff08ab6736100010816009079d0126 action) {
    
    
    
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Action38ff08ab6736100010816009079d0126 getAction() {
    return action;
  }


  public void setAction(Action38ff08ab6736100010816009079d0126 action) {
    
    
    
    this.action = action;
  }


  public BusinessProcessParameters23782ad3f54110002073aab65def00fb overallBusinessProcess(OverallBusinessProcess5d688bd57bb910001815ab49927724aa overallBusinessProcess) {
    
    
    
    
    this.overallBusinessProcess = overallBusinessProcess;
    return this;
  }

   /**
   * Get overallBusinessProcess
   * @return overallBusinessProcess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OverallBusinessProcess5d688bd57bb910001815ab49927724aa getOverallBusinessProcess() {
    return overallBusinessProcess;
  }


  public void setOverallBusinessProcess(OverallBusinessProcess5d688bd57bb910001815ab49927724aa overallBusinessProcess) {
    
    
    
    this.overallBusinessProcess = overallBusinessProcess;
  }


  public BusinessProcessParameters23782ad3f54110002073aab65def00fb comment(String comment) {
    
    
    
    
    this.comment = comment;
    return this;
  }

   /**
   * Returns a null.
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "Returns a null.")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    
    
    
    this.comment = comment;
  }


   /**
   * Returns the comments for the current business process.
   * @return comments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns the comments for the current business process.")

  public List<Comments86093b8a932f10001499f356ff83012e> getComments() {
    return comments;
  }




  public BusinessProcessParameters23782ad3f54110002073aab65def00fb transactionStatus(TransactionStatus7457adcbe0fa1000089b63ab3a510000 transactionStatus) {
    
    
    
    
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * Get transactionStatus
   * @return transactionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransactionStatus7457adcbe0fa1000089b63ab3a510000 getTransactionStatus() {
    return transactionStatus;
  }


  public void setTransactionStatus(TransactionStatus7457adcbe0fa1000089b63ab3a510000 transactionStatus) {
    
    
    
    this.transactionStatus = transactionStatus;
  }


   /**
   * Warning message for an action event triggered by a condition.
   * @return warningValidations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "Warning message for an action event triggered by a condition.")

  public String getWarningValidations() {
    return warningValidations;
  }




   /**
   * The current status of the business process.  For example: Successfully Completed, Denied, Terminated.
   * @return overallStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "The current status of the business process.  For example: Successfully Completed, Denied, Terminated.")

  public String getOverallStatus() {
    return overallStatus;
  }




  public BusinessProcessParameters23782ad3f54110002073aab65def00fb attachments(List<EventAttachmentsForToolbar43b30ba735b8100011ee4767246d0143> attachments) {
    
    
    
    
    this.attachments = attachments;
    return this;
  }

  public BusinessProcessParameters23782ad3f54110002073aab65def00fb addAttachmentsItem(EventAttachmentsForToolbar43b30ba735b8100011ee4767246d0143 attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Returns attachments associated with this business process that are uploaded from the toolbar and are accessible to the processing person. Returns blank if either of these conditions are not met.
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns attachments associated with this business process that are uploaded from the toolbar and are accessible to the processing person. Returns blank if either of these conditions are not met.")

  public List<EventAttachmentsForToolbar43b30ba735b8100011ee4767246d0143> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<EventAttachmentsForToolbar43b30ba735b8100011ee4767246d0143> attachments) {
    
    
    
    this.attachments = attachments;
  }


   /**
   * Validation message for an action event triggered by a condition.
   * @return criticalValidations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, cum choro singulis consectetuer ut, ubique iisque contentiones ex duo. Quo lorem etiam eu.", value = "Validation message for an action event triggered by a condition.")

  public String getCriticalValidations() {
    return criticalValidations;
  }




  public BusinessProcessParameters23782ad3f54110002073aab65def00fb _for(For5d688bd57bb910001815ab3dd10024a9 _for) {
    
    
    
    
    this._for = _for;
    return this;
  }

   /**
   * Get _for
   * @return _for
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public For5d688bd57bb910001815ab3dd10024a9 getFor() {
    return _for;
  }


  public void setFor(For5d688bd57bb910001815ab3dd10024a9 _for) {
    
    
    
    this._for = _for;
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
   * @return the BusinessProcessParameters23782ad3f54110002073aab65def00fb instance itself
   */
  public BusinessProcessParameters23782ad3f54110002073aab65def00fb putAdditionalProperty(String key, Object value) {
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
    BusinessProcessParameters23782ad3f54110002073aab65def00fb businessProcessParameters23782ad3f54110002073aab65def00fb = (BusinessProcessParameters23782ad3f54110002073aab65def00fb) o;
    return Objects.equals(this.action, businessProcessParameters23782ad3f54110002073aab65def00fb.action) &&
        Objects.equals(this.overallBusinessProcess, businessProcessParameters23782ad3f54110002073aab65def00fb.overallBusinessProcess) &&
        Objects.equals(this.comment, businessProcessParameters23782ad3f54110002073aab65def00fb.comment) &&
        Objects.equals(this.comments, businessProcessParameters23782ad3f54110002073aab65def00fb.comments) &&
        Objects.equals(this.transactionStatus, businessProcessParameters23782ad3f54110002073aab65def00fb.transactionStatus) &&
        Objects.equals(this.warningValidations, businessProcessParameters23782ad3f54110002073aab65def00fb.warningValidations) &&
        Objects.equals(this.overallStatus, businessProcessParameters23782ad3f54110002073aab65def00fb.overallStatus) &&
        Objects.equals(this.attachments, businessProcessParameters23782ad3f54110002073aab65def00fb.attachments) &&
        Objects.equals(this.criticalValidations, businessProcessParameters23782ad3f54110002073aab65def00fb.criticalValidations) &&
        Objects.equals(this._for, businessProcessParameters23782ad3f54110002073aab65def00fb._for)&&
        Objects.equals(this.additionalProperties, businessProcessParameters23782ad3f54110002073aab65def00fb.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, overallBusinessProcess, comment, comments, transactionStatus, warningValidations, overallStatus, attachments, criticalValidations, _for, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessProcessParameters23782ad3f54110002073aab65def00fb {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    overallBusinessProcess: ").append(toIndentedString(overallBusinessProcess)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    warningValidations: ").append(toIndentedString(warningValidations)).append("\n");
    sb.append("    overallStatus: ").append(toIndentedString(overallStatus)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    criticalValidations: ").append(toIndentedString(criticalValidations)).append("\n");
    sb.append("    _for: ").append(toIndentedString(_for)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("overallBusinessProcess");
    openapiFields.add("comment");
    openapiFields.add("comments");
    openapiFields.add("transactionStatus");
    openapiFields.add("warningValidations");
    openapiFields.add("overallStatus");
    openapiFields.add("attachments");
    openapiFields.add("criticalValidations");
    openapiFields.add("for");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("action");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BusinessProcessParameters23782ad3f54110002073aab65def00fb
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BusinessProcessParameters23782ad3f54110002073aab65def00fb.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessProcessParameters23782ad3f54110002073aab65def00fb is not found in the empty JSON string", BusinessProcessParameters23782ad3f54110002073aab65def00fb.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BusinessProcessParameters23782ad3f54110002073aab65def00fb.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `action`
      Action38ff08ab6736100010816009079d0126.validateJsonObject(jsonObj.getAsJsonObject("action"));
      // validate the optional field `overallBusinessProcess`
      if (jsonObj.get("overallBusinessProcess") != null && !jsonObj.get("overallBusinessProcess").isJsonNull()) {
        OverallBusinessProcess5d688bd57bb910001815ab49927724aa.validateJsonObject(jsonObj.getAsJsonObject("overallBusinessProcess"));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if (jsonObj.get("comments") != null && !jsonObj.get("comments").isJsonNull()) {
        JsonArray jsonArraycomments = jsonObj.getAsJsonArray("comments");
        if (jsonArraycomments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("comments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `comments` to be an array in the JSON string but got `%s`", jsonObj.get("comments").toString()));
          }

          // validate the optional field `comments` (array)
          for (int i = 0; i < jsonArraycomments.size(); i++) {
            Comments86093b8a932f10001499f356ff83012e.validateJsonObject(jsonArraycomments.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `transactionStatus`
      if (jsonObj.get("transactionStatus") != null && !jsonObj.get("transactionStatus").isJsonNull()) {
        TransactionStatus7457adcbe0fa1000089b63ab3a510000.validateJsonObject(jsonObj.getAsJsonObject("transactionStatus"));
      }
      if ((jsonObj.get("warningValidations") != null && !jsonObj.get("warningValidations").isJsonNull()) && !jsonObj.get("warningValidations").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `warningValidations` to be a primitive type in the JSON string but got `%s`", jsonObj.get("warningValidations").toString()));
      }
      if ((jsonObj.get("overallStatus") != null && !jsonObj.get("overallStatus").isJsonNull()) && !jsonObj.get("overallStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `overallStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("overallStatus").toString()));
      }
      if (jsonObj.get("attachments") != null && !jsonObj.get("attachments").isJsonNull()) {
        JsonArray jsonArrayattachments = jsonObj.getAsJsonArray("attachments");
        if (jsonArrayattachments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attachments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
          }

          // validate the optional field `attachments` (array)
          for (int i = 0; i < jsonArrayattachments.size(); i++) {
            EventAttachmentsForToolbar43b30ba735b8100011ee4767246d0143.validateJsonObject(jsonArrayattachments.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("criticalValidations") != null && !jsonObj.get("criticalValidations").isJsonNull()) && !jsonObj.get("criticalValidations").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `criticalValidations` to be a primitive type in the JSON string but got `%s`", jsonObj.get("criticalValidations").toString()));
      }
      // validate the optional field `for`
      if (jsonObj.get("for") != null && !jsonObj.get("for").isJsonNull()) {
        For5d688bd57bb910001815ab3dd10024a9.validateJsonObject(jsonObj.getAsJsonObject("for"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessProcessParameters23782ad3f54110002073aab65def00fb.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessProcessParameters23782ad3f54110002073aab65def00fb' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessProcessParameters23782ad3f54110002073aab65def00fb> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessProcessParameters23782ad3f54110002073aab65def00fb.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessProcessParameters23782ad3f54110002073aab65def00fb>() {
           @Override
           public void write(JsonWriter out, BusinessProcessParameters23782ad3f54110002073aab65def00fb value) throws IOException {
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
           public BusinessProcessParameters23782ad3f54110002073aab65def00fb read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BusinessProcessParameters23782ad3f54110002073aab65def00fb instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BusinessProcessParameters23782ad3f54110002073aab65def00fb given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessProcessParameters23782ad3f54110002073aab65def00fb
  * @throws IOException if the JSON string is invalid with respect to BusinessProcessParameters23782ad3f54110002073aab65def00fb
  */
  public static BusinessProcessParameters23782ad3f54110002073aab65def00fb fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessProcessParameters23782ad3f54110002073aab65def00fb.class);
  }

 /**
  * Convert an instance of BusinessProcessParameters23782ad3f54110002073aab65def00fb to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

