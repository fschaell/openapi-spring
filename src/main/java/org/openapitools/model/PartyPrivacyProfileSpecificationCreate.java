package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.PartyPrivacyProfileSpecificationCharacteristic;
import org.openapitools.model.PartyPrivacyRoleSpecification;
import org.openapitools.model.ProductOfferingRef;
import org.openapitools.model.RelatedParty;
import org.openapitools.model.TimePeriod;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Party Privacy Profile Specification serves as a template for creating Privacy Profiles. The specification defines characteristics for the profile. For example there might be a profile specification for residential customers, and a different specification for partners. Skipped properties: id,href
 */
@ApiModel(description = "Party Privacy Profile Specification serves as a template for creating Privacy Profiles. The specification defines characteristics for the profile. For example there might be a profile specification for residential customers, and a different specification for partners. Skipped properties: id,href")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-20T12:51:03.308+01:00[Europe/Berlin]")

public class PartyPrivacyProfileSpecificationCreate   {
  @JsonProperty("description")
  private String description;

  @JsonProperty("lastUpdate")
  private OffsetDateTime lastUpdate;

  @JsonProperty("name")
  private String name;

  @JsonProperty("status")
  private String status;

  @JsonProperty("version")
  private String version;

  @JsonProperty("applicableRole")
  @Valid
  private List<PartyPrivacyRoleSpecification> applicableRole = null;

  @JsonProperty("partyPrivacyProfileSpecCharacteristic")
  @Valid
  private List<PartyPrivacyProfileSpecificationCharacteristic> partyPrivacyProfileSpecCharacteristic = new ArrayList<>();

  @JsonProperty("productOffering")
  @Valid
  private List<ProductOfferingRef> productOffering = null;

  @JsonProperty("relatedParty")
  @Valid
  private List<RelatedParty> relatedParty = null;

  @JsonProperty("validFor")
  private TimePeriod validFor;

  @JsonProperty("@baseType")
  private String atBaseType;

  @JsonProperty("@schemaLocation")
  private URI atSchemaLocation;

  @JsonProperty("@type")
  private String atType;

  public PartyPrivacyProfileSpecificationCreate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the specification
   * @return description
  */
  @ApiModelProperty(value = "Description of the specification")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PartyPrivacyProfileSpecificationCreate lastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * Date and time when the specification was last updated
   * @return lastUpdate
  */
  @ApiModelProperty(value = "Date and time when the specification was last updated")

  @Valid

  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public PartyPrivacyProfileSpecificationCreate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the specification
   * @return name
  */
  @ApiModelProperty(value = "Name of the specification")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PartyPrivacyProfileSpecificationCreate status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Lifecycle status of the specification (e.g. In Design, Active, Rejected, Retired)
   * @return status
  */
  @ApiModelProperty(value = "Lifecycle status of the specification (e.g. In Design, Active, Rejected, Retired)")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PartyPrivacyProfileSpecificationCreate version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the specification, in case it is desired to maintain multiple versions of profile specifications
   * @return version
  */
  @ApiModelProperty(value = "The version of the specification, in case it is desired to maintain multiple versions of profile specifications")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public PartyPrivacyProfileSpecificationCreate applicableRole(List<PartyPrivacyRoleSpecification> applicableRole) {
    this.applicableRole = applicableRole;
    return this;
  }

  public PartyPrivacyProfileSpecificationCreate addApplicableRoleItem(PartyPrivacyRoleSpecification applicableRoleItem) {
    if (this.applicableRole == null) {
      this.applicableRole = new ArrayList<>();
    }
    this.applicableRole.add(applicableRoleItem);
    return this;
  }

  /**
   * A list of roles to which this specification can apply. For example: Shop Agent, Call Center Agent.
   * @return applicableRole
  */
  @ApiModelProperty(value = "A list of roles to which this specification can apply. For example: Shop Agent, Call Center Agent.")

  @Valid

  public List<PartyPrivacyRoleSpecification> getApplicableRole() {
    return applicableRole;
  }

  public void setApplicableRole(List<PartyPrivacyRoleSpecification> applicableRole) {
    this.applicableRole = applicableRole;
  }

  public PartyPrivacyProfileSpecificationCreate partyPrivacyProfileSpecCharacteristic(List<PartyPrivacyProfileSpecificationCharacteristic> partyPrivacyProfileSpecCharacteristic) {
    this.partyPrivacyProfileSpecCharacteristic = partyPrivacyProfileSpecCharacteristic;
    return this;
  }

  public PartyPrivacyProfileSpecificationCreate addPartyPrivacyProfileSpecCharacteristicItem(PartyPrivacyProfileSpecificationCharacteristic partyPrivacyProfileSpecCharacteristicItem) {
    this.partyPrivacyProfileSpecCharacteristic.add(partyPrivacyProfileSpecCharacteristicItem);
    return this;
  }

  /**
   * List of characteristics of the specification, whose values would typically be supplied when the profile is instantiated
   * @return partyPrivacyProfileSpecCharacteristic
  */
  @ApiModelProperty(required = true, value = "List of characteristics of the specification, whose values would typically be supplied when the profile is instantiated")
  @NotNull

  @Valid
@Size(min=1) 
  public List<PartyPrivacyProfileSpecificationCharacteristic> getPartyPrivacyProfileSpecCharacteristic() {
    return partyPrivacyProfileSpecCharacteristic;
  }

  public void setPartyPrivacyProfileSpecCharacteristic(List<PartyPrivacyProfileSpecificationCharacteristic> partyPrivacyProfileSpecCharacteristic) {
    this.partyPrivacyProfileSpecCharacteristic = partyPrivacyProfileSpecCharacteristic;
  }

  public PartyPrivacyProfileSpecificationCreate productOffering(List<ProductOfferingRef> productOffering) {
    this.productOffering = productOffering;
    return this;
  }

  public PartyPrivacyProfileSpecificationCreate addProductOfferingItem(ProductOfferingRef productOfferingItem) {
    if (this.productOffering == null) {
      this.productOffering = new ArrayList<>();
    }
    this.productOffering.add(productOfferingItem);
    return this;
  }

  /**
   * Get productOffering
   * @return productOffering
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ProductOfferingRef> getProductOffering() {
    return productOffering;
  }

  public void setProductOffering(List<ProductOfferingRef> productOffering) {
    this.productOffering = productOffering;
  }

  public PartyPrivacyProfileSpecificationCreate relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public PartyPrivacyProfileSpecificationCreate addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * List of parties or party roles involved in the definition or management of the specification
   * @return relatedParty
  */
  @ApiModelProperty(value = "List of parties or party roles involved in the definition or management of the specification")

  @Valid

  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public PartyPrivacyProfileSpecificationCreate validFor(TimePeriod validFor) {
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

  public PartyPrivacyProfileSpecificationCreate atBaseType(String atBaseType) {
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

  public PartyPrivacyProfileSpecificationCreate atSchemaLocation(URI atSchemaLocation) {
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

  public PartyPrivacyProfileSpecificationCreate atType(String atType) {
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
    PartyPrivacyProfileSpecificationCreate partyPrivacyProfileSpecificationCreate = (PartyPrivacyProfileSpecificationCreate) o;
    return Objects.equals(this.description, partyPrivacyProfileSpecificationCreate.description) &&
        Objects.equals(this.lastUpdate, partyPrivacyProfileSpecificationCreate.lastUpdate) &&
        Objects.equals(this.name, partyPrivacyProfileSpecificationCreate.name) &&
        Objects.equals(this.status, partyPrivacyProfileSpecificationCreate.status) &&
        Objects.equals(this.version, partyPrivacyProfileSpecificationCreate.version) &&
        Objects.equals(this.applicableRole, partyPrivacyProfileSpecificationCreate.applicableRole) &&
        Objects.equals(this.partyPrivacyProfileSpecCharacteristic, partyPrivacyProfileSpecificationCreate.partyPrivacyProfileSpecCharacteristic) &&
        Objects.equals(this.productOffering, partyPrivacyProfileSpecificationCreate.productOffering) &&
        Objects.equals(this.relatedParty, partyPrivacyProfileSpecificationCreate.relatedParty) &&
        Objects.equals(this.validFor, partyPrivacyProfileSpecificationCreate.validFor) &&
        Objects.equals(this.atBaseType, partyPrivacyProfileSpecificationCreate.atBaseType) &&
        Objects.equals(this.atSchemaLocation, partyPrivacyProfileSpecificationCreate.atSchemaLocation) &&
        Objects.equals(this.atType, partyPrivacyProfileSpecificationCreate.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, lastUpdate, name, status, version, applicableRole, partyPrivacyProfileSpecCharacteristic, productOffering, relatedParty, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyProfileSpecificationCreate {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    applicableRole: ").append(toIndentedString(applicableRole)).append("\n");
    sb.append("    partyPrivacyProfileSpecCharacteristic: ").append(toIndentedString(partyPrivacyProfileSpecCharacteristic)).append("\n");
    sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
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

