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
import com.konfigthis.client.model.Currency2d0ca2cb2448100009c54386a8570e07;
import com.konfigthis.client.model.Frequency2d0ca2cb2448100009c5436d5d670e06;
import com.konfigthis.client.model.PurchaseOrder2d0ca2cb2448100009c5433bcff60e05;
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
 * ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf {
  public static final String SERIALIZED_NAME_ASSIGNMENT_DETAILS = "assignmentDetails";
  @SerializedName(SERIALIZED_NAME_ASSIGNMENT_DETAILS)
  private String assignmentDetails;

  public static final String SERIALIZED_NAME_CONTRACT_END_DATE = "contractEndDate";
  @SerializedName(SERIALIZED_NAME_CONTRACT_END_DATE)
  private LocalDate contractEndDate;

  public static final String SERIALIZED_NAME_CONTRACT_PAY_RATE = "contractPayRate";
  @SerializedName(SERIALIZED_NAME_CONTRACT_PAY_RATE)
  private Object contractPayRate;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency2d0ca2cb2448100009c54386a8570e07 currency;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private Frequency2d0ca2cb2448100009c5436d5d670e06 frequency;

  public static final String SERIALIZED_NAME_PURCHASE_ORDER = "purchaseOrder";
  @SerializedName(SERIALIZED_NAME_PURCHASE_ORDER)
  private PurchaseOrder2d0ca2cb2448100009c5433bcff60e05 purchaseOrder;

  public ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf() {
  }

  public ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf assignmentDetails(String assignmentDetails) {
    
    
    
    
    this.assignmentDetails = assignmentDetails;
    return this;
  }

   /**
   * The new contract assignment details for the contingent worker as of the effective date.
   * @return assignmentDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sample Contract Assignment Details", value = "The new contract assignment details for the contingent worker as of the effective date.")

  public String getAssignmentDetails() {
    return assignmentDetails;
  }


  public void setAssignmentDetails(String assignmentDetails) {
    
    
    
    this.assignmentDetails = assignmentDetails;
  }


  public ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf contractEndDate(LocalDate contractEndDate) {
    
    
    
    
    this.contractEndDate = contractEndDate;
    return this;
  }

   /**
   * The contract end date for the position as of this business process.
   * @return contractEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The contract end date for the position as of this business process.")

  public LocalDate getContractEndDate() {
    return contractEndDate;
  }


  public void setContractEndDate(LocalDate contractEndDate) {
    
    
    
    this.contractEndDate = contractEndDate;
  }


  public ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf contractPayRate(Object contractPayRate) {
    
    
    
    
    this.contractPayRate = contractPayRate;
    return this;
  }

   /**
   * The new contract pay rate for the contingent worker as of the effective date.
   * @return contractPayRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50.25", value = "The new contract pay rate for the contingent worker as of the effective date.")

  public Object getContractPayRate() {
    return contractPayRate;
  }


  public void setContractPayRate(Object contractPayRate) {
    
    
    
    this.contractPayRate = contractPayRate;
  }


  public ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf currency(Currency2d0ca2cb2448100009c54386a8570e07 currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Currency2d0ca2cb2448100009c54386a8570e07 getCurrency() {
    return currency;
  }


  public void setCurrency(Currency2d0ca2cb2448100009c54386a8570e07 currency) {
    
    
    
    this.currency = currency;
  }


  public ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf frequency(Frequency2d0ca2cb2448100009c5436d5d670e06 frequency) {
    
    
    
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Frequency2d0ca2cb2448100009c5436d5d670e06 getFrequency() {
    return frequency;
  }


  public void setFrequency(Frequency2d0ca2cb2448100009c5436d5d670e06 frequency) {
    
    
    
    this.frequency = frequency;
  }


  public ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf purchaseOrder(PurchaseOrder2d0ca2cb2448100009c5433bcff60e05 purchaseOrder) {
    
    
    
    
    this.purchaseOrder = purchaseOrder;
    return this;
  }

   /**
   * Get purchaseOrder
   * @return purchaseOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PurchaseOrder2d0ca2cb2448100009c5433bcff60e05 getPurchaseOrder() {
    return purchaseOrder;
  }


  public void setPurchaseOrder(PurchaseOrder2d0ca2cb2448100009c5433bcff60e05 purchaseOrder) {
    
    
    
    this.purchaseOrder = purchaseOrder;
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
   * @return the ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf instance itself
   */
  public ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf putAdditionalProperty(String key, Object value) {
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
    ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf changeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf = (ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf) o;
    return Objects.equals(this.assignmentDetails, changeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf.assignmentDetails) &&
        Objects.equals(this.contractEndDate, changeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf.contractEndDate) &&
        Objects.equals(this.contractPayRate, changeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf.contractPayRate) &&
        Objects.equals(this.currency, changeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf.currency) &&
        Objects.equals(this.frequency, changeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf.frequency) &&
        Objects.equals(this.purchaseOrder, changeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf.purchaseOrder)&&
        Objects.equals(this.additionalProperties, changeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignmentDetails, contractEndDate, contractPayRate, currency, frequency, purchaseOrder, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf {\n");
    sb.append("    assignmentDetails: ").append(toIndentedString(assignmentDetails)).append("\n");
    sb.append("    contractEndDate: ").append(toIndentedString(contractEndDate)).append("\n");
    sb.append("    contractPayRate: ").append(toIndentedString(contractPayRate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    purchaseOrder: ").append(toIndentedString(purchaseOrder)).append("\n");
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
    openapiFields.add("assignmentDetails");
    openapiFields.add("contractEndDate");
    openapiFields.add("contractPayRate");
    openapiFields.add("currency");
    openapiFields.add("frequency");
    openapiFields.add("purchaseOrder");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf is not found in the empty JSON string", ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("assignmentDetails") != null && !jsonObj.get("assignmentDetails").isJsonNull()) && !jsonObj.get("assignmentDetails").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assignmentDetails` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assignmentDetails").toString()));
      }
      // validate the optional field `currency`
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) {
        Currency2d0ca2cb2448100009c54386a8570e07.validateJsonObject(jsonObj.getAsJsonObject("currency"));
      }
      // validate the optional field `frequency`
      if (jsonObj.get("frequency") != null && !jsonObj.get("frequency").isJsonNull()) {
        Frequency2d0ca2cb2448100009c5436d5d670e06.validateJsonObject(jsonObj.getAsJsonObject("frequency"));
      }
      // validate the optional field `purchaseOrder`
      if (jsonObj.get("purchaseOrder") != null && !jsonObj.get("purchaseOrder").isJsonNull()) {
        PurchaseOrder2d0ca2cb2448100009c5433bcff60e05.validateJsonObject(jsonObj.getAsJsonObject("purchaseOrder"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf>() {
           @Override
           public void write(JsonWriter out, ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf value) throws IOException {
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
           public ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf
  * @throws IOException if the JSON string is invalid with respect to ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf
  */
  public static ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf.class);
  }

 /**
  * Convert an instance of ChangeJobContractDetailsData27ec818d10d010000386ce823ac20107AllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

