package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.PartyPrivacyAgreementRef;
import org.openapitools.model.PartyPrivacyProfileCharacteristic;
import org.openapitools.model.PartyPrivacyProfileSpecificationRef;
import org.openapitools.model.RelatedParty;
import org.openapitools.model.TimePeriod;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A Party Privacy Profile represents the set of Privacy settings defined for a Party Skipped properties: id,href,creationDate
 */
@ApiModel(description = "A Party Privacy Profile represents the set of Privacy settings defined for a Party Skipped properties: id,href,creationDate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-20T12:51:03.308+01:00[Europe/Berlin]")

public class PartyPrivacyProfileUpdate   {
  @JsonProperty("description")
  private String description;

  @JsonProperty("name")
  private String name;

  @JsonProperty("status")
  private String status;

  @JsonProperty("agreedByParty")
  private RelatedParty agreedByParty;

  @JsonProperty("agreement")
  private PartyPrivacyAgreementRef agreement;

  @JsonProperty("applicableForParty")
  private RelatedParty applicableForParty;

  @JsonProperty("partyPrivacyProfileCharacteristic")
  @Valid
  private List<PartyPrivacyProfileCharacteristic> partyPrivacyProfileCharacteristic = null;

  @JsonProperty("partyPrivacyProfileSpecification")
  private PartyPrivacyProfileSpecificationRef partyPrivacyProfileSpecification;

  @JsonProperty("validFor")
  private TimePeriod validFor;

  @JsonProperty("@baseType")
  private String atBaseType;

  @JsonProperty("@schemaLocation")
  private URI atSchemaLocation;

  @JsonProperty("@type")
  private String atType;

  public PartyPrivacyProfileUpdate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the privacy profile
   * @return description
  */
  @ApiModelProperty(value = "Description of the privacy profile")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PartyPrivacyProfileUpdate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the privacy profile
   * @return name
  */
  @ApiModelProperty(value = "Name of the privacy profile")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PartyPrivacyProfileUpdate status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of this profile (such as agreed, created, terminated, etc.)
   * @return status
  */
  @ApiModelProperty(value = "The status of this profile (such as agreed, created, terminated, etc.)")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PartyPrivacyProfileUpdate agreedByParty(RelatedParty agreedByParty) {
    this.agreedByParty = agreedByParty;
    return this;
  }

  /**
   * Get agreedByParty
   * @return agreedByParty
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RelatedParty getAgreedByParty() {
    return agreedByParty;
  }

  public void setAgreedByParty(RelatedParty agreedByParty) {
    this.agreedByParty = agreedByParty;
  }

  public PartyPrivacyProfileUpdate agreement(PartyPrivacyAgreementRef agreement) {
    this.agreement = agreement;
    return this;
  }

  /**
   * Get agreement
   * @return agreement
  */
  @ApiModelProperty(value = "")

  @Valid

  public PartyPrivacyAgreementRef getAgreement() {
    return agreement;
  }

  public void setAgreement(PartyPrivacyAgreementRef agreement) {
    this.agreement = agreement;
  }

  public PartyPrivacyProfileUpdate applicableForParty(RelatedParty applicableForParty) {
    this.applicableForParty = applicableForParty;
    return this;
  }

  /**
   * Get applicableForParty
   * @return applicableForParty
  */
  @ApiModelProperty(value = "")

  @Valid

  public RelatedParty getApplicableForParty() {
    return applicableForParty;
  }

  public void setApplicableForParty(RelatedParty applicableForParty) {
    this.applicableForParty = applicableForParty;
  }

  public PartyPrivacyProfileUpdate partyPrivacyProfileCharacteristic(List<PartyPrivacyProfileCharacteristic> partyPrivacyProfileCharacteristic) {
    this.partyPrivacyProfileCharacteristic = partyPrivacyProfileCharacteristic;
    return this;
  }

  public PartyPrivacyProfileUpdate addPartyPrivacyProfileCharacteristicItem(PartyPrivacyProfileCharacteristic partyPrivacyProfileCharacteristicItem) {
    if (this.partyPrivacyProfileCharacteristic == null) {
      this.partyPrivacyProfileCharacteristic = new ArrayList<>();
    }
    this.partyPrivacyProfileCharacteristic.add(partyPrivacyProfileCharacteristicItem);
    return this;
  }

  /**
   * List of characteristics of the privacy profile
   * @return partyPrivacyProfileCharacteristic
  */
  @ApiModelProperty(value = "List of characteristics of the privacy profile")

  @Valid

  public List<PartyPrivacyProfileCharacteristic> getPartyPrivacyProfileCharacteristic() {
    return partyPrivacyProfileCharacteristic;
  }

  public void setPartyPrivacyProfileCharacteristic(List<PartyPrivacyProfileCharacteristic> partyPrivacyProfileCharacteristic) {
    this.partyPrivacyProfileCharacteristic = partyPrivacyProfileCharacteristic;
  }

  public PartyPrivacyProfileUpdate partyPrivacyProfileSpecification(PartyPrivacyProfileSpecificationRef partyPrivacyProfileSpecification) {
    this.partyPrivacyProfileSpecification = partyPrivacyProfileSpecification;
    return this;
  }

  /**
   * Get partyPrivacyProfileSpecification
   * @return partyPrivacyProfileSpecification
  */
  @ApiModelProperty(value = "")

  @Valid

  public PartyPrivacyProfileSpecificationRef getPartyPrivacyProfileSpecification() {
    return partyPrivacyProfileSpecification;
  }

  public void setPartyPrivacyProfileSpecification(PartyPrivacyProfileSpecificationRef partyPrivacyProfileSpecification) {
    this.partyPrivacyProfileSpecification = partyPrivacyProfileSpecification;
  }

  public PartyPrivacyProfileUpdate validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Get validFor
   * @return validFor
  */
  @ApiModelProperty(value = "")

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public PartyPrivacyProfileUpdate atBaseType(String atBaseType) {
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

  public PartyPrivacyProfileUpdate atSchemaLocation(URI atSchemaLocation) {
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

  public PartyPrivacyProfileUpdate atType(String atType) {
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
    PartyPrivacyProfileUpdate partyPrivacyProfileUpdate = (PartyPrivacyProfileUpdate) o;
    return Objects.equals(this.description, partyPrivacyProfileUpdate.description) &&
        Objects.equals(this.name, partyPrivacyProfileUpdate.name) &&
        Objects.equals(this.status, partyPrivacyProfileUpdate.status) &&
        Objects.equals(this.agreedByParty, partyPrivacyProfileUpdate.agreedByParty) &&
        Objects.equals(this.agreement, partyPrivacyProfileUpdate.agreement) &&
        Objects.equals(this.applicableForParty, partyPrivacyProfileUpdate.applicableForParty) &&
        Objects.equals(this.partyPrivacyProfileCharacteristic, partyPrivacyProfileUpdate.partyPrivacyProfileCharacteristic) &&
        Objects.equals(this.partyPrivacyProfileSpecification, partyPrivacyProfileUpdate.partyPrivacyProfileSpecification) &&
        Objects.equals(this.validFor, partyPrivacyProfileUpdate.validFor) &&
        Objects.equals(this.atBaseType, partyPrivacyProfileUpdate.atBaseType) &&
        Objects.equals(this.atSchemaLocation, partyPrivacyProfileUpdate.atSchemaLocation) &&
        Objects.equals(this.atType, partyPrivacyProfileUpdate.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, status, agreedByParty, agreement, applicableForParty, partyPrivacyProfileCharacteristic, partyPrivacyProfileSpecification, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyProfileUpdate {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    agreedByParty: ").append(toIndentedString(agreedByParty)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    applicableForParty: ").append(toIndentedString(applicableForParty)).append("\n");
    sb.append("    partyPrivacyProfileCharacteristic: ").append(toIndentedString(partyPrivacyProfileCharacteristic)).append("\n");
    sb.append("    partyPrivacyProfileSpecification: ").append(toIndentedString(partyPrivacyProfileSpecification)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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

