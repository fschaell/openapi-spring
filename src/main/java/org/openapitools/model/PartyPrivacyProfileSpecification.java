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
 * Party Privacy Profile Specification serves as a template for creating Privacy Profiles. The specification defines characteristics for the profile. For example there might be a profile specification for residential customers, and a different specification for partners.
 */
@ApiModel(description = "Party Privacy Profile Specification serves as a template for creating Privacy Profiles. The specification defines characteristics for the profile. For example there might be a profile specification for residential customers, and a different specification for partners.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-20T12:51:03.308+01:00[Europe/Berlin]")

public class PartyPrivacyProfileSpecification   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("href")
  private String href;

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
  private List<PartyPrivacyProfileSpecificationCharacteristic> partyPrivacyProfileSpecCharacteristic = null;

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

  public PartyPrivacyProfileSpecification id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the specification
   * @return id
  */
  @ApiModelProperty(value = "Unique identifier of the specification")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PartyPrivacyProfileSpecification href(String href) {
    this.href = href;
    return this;
  }

  /**
   * URI reference of the specification allowing navigation to the resource
   * @return href
  */
  @ApiModelProperty(value = "URI reference of the specification allowing navigation to the resource")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public PartyPrivacyProfileSpecification description(String description) {
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

  public PartyPrivacyProfileSpecification lastUpdate(OffsetDateTime lastUpdate) {
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

  public PartyPrivacyProfileSpecification name(String name) {
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

  public PartyPrivacyProfileSpecification status(String status) {
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

  public PartyPrivacyProfileSpecification version(String version) {
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

  public PartyPrivacyProfileSpecification applicableRole(List<PartyPrivacyRoleSpecification> applicableRole) {
    this.applicableRole = applicableRole;
    return this;
  }

  public PartyPrivacyProfileSpecification addApplicableRoleItem(PartyPrivacyRoleSpecification applicableRoleItem) {
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

  public PartyPrivacyProfileSpecification partyPrivacyProfileSpecCharacteristic(List<PartyPrivacyProfileSpecificationCharacteristic> partyPrivacyProfileSpecCharacteristic) {
    this.partyPrivacyProfileSpecCharacteristic = partyPrivacyProfileSpecCharacteristic;
    return this;
  }

  public PartyPrivacyProfileSpecification addPartyPrivacyProfileSpecCharacteristicItem(PartyPrivacyProfileSpecificationCharacteristic partyPrivacyProfileSpecCharacteristicItem) {
    if (this.partyPrivacyProfileSpecCharacteristic == null) {
      this.partyPrivacyProfileSpecCharacteristic = new ArrayList<>();
    }
    this.partyPrivacyProfileSpecCharacteristic.add(partyPrivacyProfileSpecCharacteristicItem);
    return this;
  }

  /**
   * List of characteristics of the specification, whose values would typically be supplied when the profile is instantiated
   * @return partyPrivacyProfileSpecCharacteristic
  */
  @ApiModelProperty(value = "List of characteristics of the specification, whose values would typically be supplied when the profile is instantiated")

  @Valid

  public List<PartyPrivacyProfileSpecificationCharacteristic> getPartyPrivacyProfileSpecCharacteristic() {
    return partyPrivacyProfileSpecCharacteristic;
  }

  public void setPartyPrivacyProfileSpecCharacteristic(List<PartyPrivacyProfileSpecificationCharacteristic> partyPrivacyProfileSpecCharacteristic) {
    this.partyPrivacyProfileSpecCharacteristic = partyPrivacyProfileSpecCharacteristic;
  }

  public PartyPrivacyProfileSpecification productOffering(List<ProductOfferingRef> productOffering) {
    this.productOffering = productOffering;
    return this;
  }

  public PartyPrivacyProfileSpecification addProductOfferingItem(ProductOfferingRef productOfferingItem) {
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

  public PartyPrivacyProfileSpecification relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public PartyPrivacyProfileSpecification addRelatedPartyItem(RelatedParty relatedPartyItem) {
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

  public PartyPrivacyProfileSpecification validFor(TimePeriod validFor) {
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

  public PartyPrivacyProfileSpecification atBaseType(String atBaseType) {
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

  public PartyPrivacyProfileSpecification atSchemaLocation(URI atSchemaLocation) {
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

  public PartyPrivacyProfileSpecification atType(String atType) {
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
    PartyPrivacyProfileSpecification partyPrivacyProfileSpecification = (PartyPrivacyProfileSpecification) o;
    return Objects.equals(this.id, partyPrivacyProfileSpecification.id) &&
        Objects.equals(this.href, partyPrivacyProfileSpecification.href) &&
        Objects.equals(this.description, partyPrivacyProfileSpecification.description) &&
        Objects.equals(this.lastUpdate, partyPrivacyProfileSpecification.lastUpdate) &&
        Objects.equals(this.name, partyPrivacyProfileSpecification.name) &&
        Objects.equals(this.status, partyPrivacyProfileSpecification.status) &&
        Objects.equals(this.version, partyPrivacyProfileSpecification.version) &&
        Objects.equals(this.applicableRole, partyPrivacyProfileSpecification.applicableRole) &&
        Objects.equals(this.partyPrivacyProfileSpecCharacteristic, partyPrivacyProfileSpecification.partyPrivacyProfileSpecCharacteristic) &&
        Objects.equals(this.productOffering, partyPrivacyProfileSpecification.productOffering) &&
        Objects.equals(this.relatedParty, partyPrivacyProfileSpecification.relatedParty) &&
        Objects.equals(this.validFor, partyPrivacyProfileSpecification.validFor) &&
        Objects.equals(this.atBaseType, partyPrivacyProfileSpecification.atBaseType) &&
        Objects.equals(this.atSchemaLocation, partyPrivacyProfileSpecification.atSchemaLocation) &&
        Objects.equals(this.atType, partyPrivacyProfileSpecification.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, description, lastUpdate, name, status, version, applicableRole, partyPrivacyProfileSpecCharacteristic, productOffering, relatedParty, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyProfileSpecification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

