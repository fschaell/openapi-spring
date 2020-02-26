package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.RelatedParty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A characteristic for an instantiated party profile, where the value indicates the allowed use of the characteristic
 */
@ApiModel(description = "A characteristic for an instantiated party profile, where the value indicates the allowed use of the characteristic")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-20T12:51:03.308+01:00[Europe/Berlin]")

public class PartyPrivacyProfileCharacteristic   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("privacyUsagePurpose")
  private String privacyUsagePurpose;

  @JsonProperty("valueType")
  private String valueType;

  @JsonProperty("relatedParty")
  @Valid
  private List<RelatedParty> relatedParty = null;

  @JsonProperty("value")
  private Object value;

  @JsonProperty("@baseType")
  private String atBaseType;

  @JsonProperty("@schemaLocation")
  private URI atSchemaLocation;

  @JsonProperty("@type")
  private String atType;

  public PartyPrivacyProfileCharacteristic id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PartyPrivacyProfileCharacteristic name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the characteristic
   * @return name
  */
  @ApiModelProperty(required = true, value = "Name of the characteristic")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PartyPrivacyProfileCharacteristic privacyUsagePurpose(String privacyUsagePurpose) {
    this.privacyUsagePurpose = privacyUsagePurpose;
    return this;
  }

  /**
   * Defines the purpose authorized or refused for the characteristic (e.g. ADMIN, INFORMATION, MARKETING, RESEARCH, etc.
   * @return privacyUsagePurpose
  */
  @ApiModelProperty(value = "Defines the purpose authorized or refused for the characteristic (e.g. ADMIN, INFORMATION, MARKETING, RESEARCH, etc.")


  public String getPrivacyUsagePurpose() {
    return privacyUsagePurpose;
  }

  public void setPrivacyUsagePurpose(String privacyUsagePurpose) {
    this.privacyUsagePurpose = privacyUsagePurpose;
  }

  public PartyPrivacyProfileCharacteristic valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * Data type of the value of the characteristic
   * @return valueType
  */
  @ApiModelProperty(value = "Data type of the value of the characteristic")


  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  public PartyPrivacyProfileCharacteristic relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public PartyPrivacyProfileCharacteristic addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * A list of parties to which the allowed use of the characteristic applies.
   * @return relatedParty
  */
  @ApiModelProperty(value = "A list of parties to which the allowed use of the characteristic applies.")

  @Valid

  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public PartyPrivacyProfileCharacteristic value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public PartyPrivacyProfileCharacteristic atBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
  */
  @ApiModelProperty(value = "When sub-classing, this defines the super-class")


  public String getAtBaseType() {
    return atBaseType;
  }

  public void setAtBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
  }

  public PartyPrivacyProfileCharacteristic atSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
  */
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")

  @Valid

  public URI getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public PartyPrivacyProfileCharacteristic atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class entity name
   * @return atType
  */
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name")


  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyPrivacyProfileCharacteristic partyPrivacyProfileCharacteristic = (PartyPrivacyProfileCharacteristic) o;
    return Objects.equals(this.id, partyPrivacyProfileCharacteristic.id) &&
        Objects.equals(this.name, partyPrivacyProfileCharacteristic.name) &&
        Objects.equals(this.privacyUsagePurpose, partyPrivacyProfileCharacteristic.privacyUsagePurpose) &&
        Objects.equals(this.valueType, partyPrivacyProfileCharacteristic.valueType) &&
        Objects.equals(this.relatedParty, partyPrivacyProfileCharacteristic.relatedParty) &&
        Objects.equals(this.value, partyPrivacyProfileCharacteristic.value) &&
        Objects.equals(this.atBaseType, partyPrivacyProfileCharacteristic.atBaseType) &&
        Objects.equals(this.atSchemaLocation, partyPrivacyProfileCharacteristic.atSchemaLocation) &&
        Objects.equals(this.atType, partyPrivacyProfileCharacteristic.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, privacyUsagePurpose, valueType, relatedParty, value, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyProfileCharacteristic {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    privacyUsagePurpose: ").append(toIndentedString(privacyUsagePurpose)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

