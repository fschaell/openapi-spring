package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AgreementSpecificationRef;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A PartyPrivacyRoleSpecification represents a specification of a role defined in the context of a given privacy spesification, such as Customer, User.
 */
@ApiModel(description = "A PartyPrivacyRoleSpecification represents a specification of a role defined in the context of a given privacy spesification, such as Customer, User.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-20T12:51:03.308+01:00[Europe/Berlin]")

public class PartyPrivacyRoleSpecification   {
  @JsonProperty("description")
  private String description;

  @JsonProperty("name")
  private String name;

  @JsonProperty("agreementSpecification")
  @Valid
  private List<AgreementSpecificationRef> agreementSpecification = null;

  @JsonProperty("@baseType")
  private String atBaseType;

  @JsonProperty("@schemaLocation")
  private URI atSchemaLocation;

  @JsonProperty("@type")
  private String atType;

  public PartyPrivacyRoleSpecification description(String description) {
    this.description = description;
    return this;
  }

  /**
   * An explanatory text documenting the role specification
   * @return description
  */
  @ApiModelProperty(value = "An explanatory text documenting the role specification")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PartyPrivacyRoleSpecification name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the role specification. This name uniquely identifies the role specification
   * @return name
  */
  @ApiModelProperty(required = true, value = "The name of the role specification. This name uniquely identifies the role specification")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PartyPrivacyRoleSpecification agreementSpecification(List<AgreementSpecificationRef> agreementSpecification) {
    this.agreementSpecification = agreementSpecification;
    return this;
  }

  public PartyPrivacyRoleSpecification addAgreementSpecificationItem(AgreementSpecificationRef agreementSpecificationItem) {
    if (this.agreementSpecification == null) {
      this.agreementSpecification = new ArrayList<>();
    }
    this.agreementSpecification.add(agreementSpecificationItem);
    return this;
  }

  /**
   * Get agreementSpecification
   * @return agreementSpecification
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AgreementSpecificationRef> getAgreementSpecification() {
    return agreementSpecification;
  }

  public void setAgreementSpecification(List<AgreementSpecificationRef> agreementSpecification) {
    this.agreementSpecification = agreementSpecification;
  }

  public PartyPrivacyRoleSpecification atBaseType(String atBaseType) {
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

  public PartyPrivacyRoleSpecification atSchemaLocation(URI atSchemaLocation) {
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

  public PartyPrivacyRoleSpecification atType(String atType) {
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
    PartyPrivacyRoleSpecification partyPrivacyRoleSpecification = (PartyPrivacyRoleSpecification) o;
    return Objects.equals(this.description, partyPrivacyRoleSpecification.description) &&
        Objects.equals(this.name, partyPrivacyRoleSpecification.name) &&
        Objects.equals(this.agreementSpecification, partyPrivacyRoleSpecification.agreementSpecification) &&
        Objects.equals(this.atBaseType, partyPrivacyRoleSpecification.atBaseType) &&
        Objects.equals(this.atSchemaLocation, partyPrivacyRoleSpecification.atSchemaLocation) &&
        Objects.equals(this.atType, partyPrivacyRoleSpecification.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, agreementSpecification, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyRoleSpecification {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    agreementSpecification: ").append(toIndentedString(agreementSpecification)).append("\n");
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

