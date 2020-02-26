package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.RoleSpecification;
import org.openapitools.model.SpecificationCharacteristicValue;
import org.openapitools.model.TimePeriod;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A characteristic of the party privacy profile, whose value(s) would be supplied at runtime. For example, email address
 */
@ApiModel(description = "A characteristic of the party privacy profile, whose value(s) would be supplied at runtime. For example, email address")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-20T12:51:03.308+01:00[Europe/Berlin]")

public class PartyPrivacyProfileSpecificationCharacteristic   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("criticalityLevel")
  private String criticalityLevel;

  @JsonProperty("description")
  private String description;

  @JsonProperty("name")
  private String name;

  @JsonProperty("privacyType")
  private String privacyType;

  @JsonProperty("privacyUsagePurpose")
  private String privacyUsagePurpose;

  @JsonProperty("allowedRole")
  @Valid
  private List<RoleSpecification> allowedRole = null;

  @JsonProperty("partyPrivacyProfileSpecCharacteristicValue")
  @Valid
  private List<SpecificationCharacteristicValue> partyPrivacyProfileSpecCharacteristicValue = null;

  @JsonProperty("validFor")
  private TimePeriod validFor;

  @JsonProperty("@baseType")
  private String atBaseType;

  @JsonProperty("@schemaLocation")
  private URI atSchemaLocation;

  @JsonProperty("@type")
  private String atType;

  public PartyPrivacyProfileSpecificationCharacteristic id(String id) {
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

  public PartyPrivacyProfileSpecificationCharacteristic criticalityLevel(String criticalityLevel) {
    this.criticalityLevel = criticalityLevel;
    return this;
  }

  /**
   * Level of criticality for this characteristic of personal identifiable information (e.g. in terms of the damage if this item was breached), such as low, medium, high.
   * @return criticalityLevel
  */
  @ApiModelProperty(value = "Level of criticality for this characteristic of personal identifiable information (e.g. in terms of the damage if this item was breached), such as low, medium, high.")


  public String getCriticalityLevel() {
    return criticalityLevel;
  }

  public void setCriticalityLevel(String criticalityLevel) {
    this.criticalityLevel = criticalityLevel;
  }

  public PartyPrivacyProfileSpecificationCharacteristic description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the characteristic
   * @return description
  */
  @ApiModelProperty(value = "Description of the characteristic")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PartyPrivacyProfileSpecificationCharacteristic name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the characteristic
   * @return name
  */
  @ApiModelProperty(value = "Name of the characteristic")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PartyPrivacyProfileSpecificationCharacteristic privacyType(String privacyType) {
    this.privacyType = privacyType;
    return this;
  }

  /**
   * Type of privacy (e.g. Internal Purpose, External Purpose, Internal Retention, External Retention)
   * @return privacyType
  */
  @ApiModelProperty(value = "Type of privacy (e.g. Internal Purpose, External Purpose, Internal Retention, External Retention)")


  public String getPrivacyType() {
    return privacyType;
  }

  public void setPrivacyType(String privacyType) {
    this.privacyType = privacyType;
  }

  public PartyPrivacyProfileSpecificationCharacteristic privacyUsagePurpose(String privacyUsagePurpose) {
    this.privacyUsagePurpose = privacyUsagePurpose;
    return this;
  }

  /**
   * Defines the purpose authorized or refused for the characteristic (e.g. ADMIN, INFORMATION, MARKETING, RESEARCH).
   * @return privacyUsagePurpose
  */
  @ApiModelProperty(value = "Defines the purpose authorized or refused for the characteristic (e.g. ADMIN, INFORMATION, MARKETING, RESEARCH).")


  public String getPrivacyUsagePurpose() {
    return privacyUsagePurpose;
  }

  public void setPrivacyUsagePurpose(String privacyUsagePurpose) {
    this.privacyUsagePurpose = privacyUsagePurpose;
  }

  public PartyPrivacyProfileSpecificationCharacteristic allowedRole(List<RoleSpecification> allowedRole) {
    this.allowedRole = allowedRole;
    return this;
  }

  public PartyPrivacyProfileSpecificationCharacteristic addAllowedRoleItem(RoleSpecification allowedRoleItem) {
    if (this.allowedRole == null) {
      this.allowedRole = new ArrayList<>();
    }
    this.allowedRole.add(allowedRoleItem);
    return this;
  }

  /**
   * A list of roles in the organization who are allowed access to this characteristic
   * @return allowedRole
  */
  @ApiModelProperty(value = "A list of roles in the organization who are allowed access to this characteristic")

  @Valid

  public List<RoleSpecification> getAllowedRole() {
    return allowedRole;
  }

  public void setAllowedRole(List<RoleSpecification> allowedRole) {
    this.allowedRole = allowedRole;
  }

  public PartyPrivacyProfileSpecificationCharacteristic partyPrivacyProfileSpecCharacteristicValue(List<SpecificationCharacteristicValue> partyPrivacyProfileSpecCharacteristicValue) {
    this.partyPrivacyProfileSpecCharacteristicValue = partyPrivacyProfileSpecCharacteristicValue;
    return this;
  }

  public PartyPrivacyProfileSpecificationCharacteristic addPartyPrivacyProfileSpecCharacteristicValueItem(SpecificationCharacteristicValue partyPrivacyProfileSpecCharacteristicValueItem) {
    if (this.partyPrivacyProfileSpecCharacteristicValue == null) {
      this.partyPrivacyProfileSpecCharacteristicValue = new ArrayList<>();
    }
    this.partyPrivacyProfileSpecCharacteristicValue.add(partyPrivacyProfileSpecCharacteristicValueItem);
    return this;
  }

  /**
   * List of values that can be assigned to this characteristic at runtime
   * @return partyPrivacyProfileSpecCharacteristicValue
  */
  @ApiModelProperty(value = "List of values that can be assigned to this characteristic at runtime")

  @Valid

  public List<SpecificationCharacteristicValue> getPartyPrivacyProfileSpecCharacteristicValue() {
    return partyPrivacyProfileSpecCharacteristicValue;
  }

  public void setPartyPrivacyProfileSpecCharacteristicValue(List<SpecificationCharacteristicValue> partyPrivacyProfileSpecCharacteristicValue) {
    this.partyPrivacyProfileSpecCharacteristicValue = partyPrivacyProfileSpecCharacteristicValue;
  }

  public PartyPrivacyProfileSpecificationCharacteristic validFor(TimePeriod validFor) {
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

  public PartyPrivacyProfileSpecificationCharacteristic atBaseType(String atBaseType) {
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

  public PartyPrivacyProfileSpecificationCharacteristic atSchemaLocation(URI atSchemaLocation) {
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

  public PartyPrivacyProfileSpecificationCharacteristic atType(String atType) {
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
    PartyPrivacyProfileSpecificationCharacteristic partyPrivacyProfileSpecificationCharacteristic = (PartyPrivacyProfileSpecificationCharacteristic) o;
    return Objects.equals(this.id, partyPrivacyProfileSpecificationCharacteristic.id) &&
        Objects.equals(this.criticalityLevel, partyPrivacyProfileSpecificationCharacteristic.criticalityLevel) &&
        Objects.equals(this.description, partyPrivacyProfileSpecificationCharacteristic.description) &&
        Objects.equals(this.name, partyPrivacyProfileSpecificationCharacteristic.name) &&
        Objects.equals(this.privacyType, partyPrivacyProfileSpecificationCharacteristic.privacyType) &&
        Objects.equals(this.privacyUsagePurpose, partyPrivacyProfileSpecificationCharacteristic.privacyUsagePurpose) &&
        Objects.equals(this.allowedRole, partyPrivacyProfileSpecificationCharacteristic.allowedRole) &&
        Objects.equals(this.partyPrivacyProfileSpecCharacteristicValue, partyPrivacyProfileSpecificationCharacteristic.partyPrivacyProfileSpecCharacteristicValue) &&
        Objects.equals(this.validFor, partyPrivacyProfileSpecificationCharacteristic.validFor) &&
        Objects.equals(this.atBaseType, partyPrivacyProfileSpecificationCharacteristic.atBaseType) &&
        Objects.equals(this.atSchemaLocation, partyPrivacyProfileSpecificationCharacteristic.atSchemaLocation) &&
        Objects.equals(this.atType, partyPrivacyProfileSpecificationCharacteristic.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, criticalityLevel, description, name, privacyType, privacyUsagePurpose, allowedRole, partyPrivacyProfileSpecCharacteristicValue, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyProfileSpecificationCharacteristic {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    criticalityLevel: ").append(toIndentedString(criticalityLevel)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    privacyType: ").append(toIndentedString(privacyType)).append("\n");
    sb.append("    privacyUsagePurpose: ").append(toIndentedString(privacyUsagePurpose)).append("\n");
    sb.append("    allowedRole: ").append(toIndentedString(allowedRole)).append("\n");
    sb.append("    partyPrivacyProfileSpecCharacteristicValue: ").append(toIndentedString(partyPrivacyProfileSpecCharacteristicValue)).append("\n");
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

