package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AgreementTermOrCondition;
import org.openapitools.model.ProductOfferingRef;
import org.openapitools.model.ProductRef;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A part of the agreement expressed in terms of a product offering and possibly including specific terms and conditions.
 */
@ApiModel(description = "A part of the agreement expressed in terms of a product offering and possibly including specific terms and conditions.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-20T12:51:03.308+01:00[Europe/Berlin]")

public class AgreementItem   {
  @JsonProperty("product")
  @Valid
  private List<ProductRef> product = null;

  @JsonProperty("productOffering")
  @Valid
  private List<ProductOfferingRef> productOffering = null;

  @JsonProperty("termOrCondition")
  @Valid
  private List<AgreementTermOrCondition> termOrCondition = null;

  @JsonProperty("@baseType")
  private String atBaseType;

  @JsonProperty("@schemaLocation")
  private URI atSchemaLocation;

  @JsonProperty("@type")
  private String atType;

  public AgreementItem product(List<ProductRef> product) {
    this.product = product;
    return this;
  }

  public AgreementItem addProductItem(ProductRef productItem) {
    if (this.product == null) {
      this.product = new ArrayList<>();
    }
    this.product.add(productItem);
    return this;
  }

  /**
   * The list of products indirectly referred by this agreement item (since an agreement item refers primarily to product offerings)
   * @return product
  */
  @ApiModelProperty(value = "The list of products indirectly referred by this agreement item (since an agreement item refers primarily to product offerings)")

  @Valid

  public List<ProductRef> getProduct() {
    return product;
  }

  public void setProduct(List<ProductRef> product) {
    this.product = product;
  }

  public AgreementItem productOffering(List<ProductOfferingRef> productOffering) {
    this.productOffering = productOffering;
    return this;
  }

  public AgreementItem addProductOfferingItem(ProductOfferingRef productOfferingItem) {
    if (this.productOffering == null) {
      this.productOffering = new ArrayList<>();
    }
    this.productOffering.add(productOfferingItem);
    return this;
  }

  /**
   * The list of product offerings referred by this agreement item
   * @return productOffering
  */
  @ApiModelProperty(value = "The list of product offerings referred by this agreement item")

  @Valid

  public List<ProductOfferingRef> getProductOffering() {
    return productOffering;
  }

  public void setProductOffering(List<ProductOfferingRef> productOffering) {
    this.productOffering = productOffering;
  }

  public AgreementItem termOrCondition(List<AgreementTermOrCondition> termOrCondition) {
    this.termOrCondition = termOrCondition;
    return this;
  }

  public AgreementItem addTermOrConditionItem(AgreementTermOrCondition termOrConditionItem) {
    if (this.termOrCondition == null) {
      this.termOrCondition = new ArrayList<>();
    }
    this.termOrCondition.add(termOrConditionItem);
    return this;
  }

  /**
   * Get termOrCondition
   * @return termOrCondition
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AgreementTermOrCondition> getTermOrCondition() {
    return termOrCondition;
  }

  public void setTermOrCondition(List<AgreementTermOrCondition> termOrCondition) {
    this.termOrCondition = termOrCondition;
  }

  public AgreementItem atBaseType(String atBaseType) {
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

  public AgreementItem atSchemaLocation(URI atSchemaLocation) {
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

  public AgreementItem atType(String atType) {
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
    AgreementItem agreementItem = (AgreementItem) o;
    return Objects.equals(this.product, agreementItem.product) &&
        Objects.equals(this.productOffering, agreementItem.productOffering) &&
        Objects.equals(this.termOrCondition, agreementItem.termOrCondition) &&
        Objects.equals(this.atBaseType, agreementItem.atBaseType) &&
        Objects.equals(this.atSchemaLocation, agreementItem.atSchemaLocation) &&
        Objects.equals(this.atType, agreementItem.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, productOffering, termOrCondition, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementItem {\n");
    
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
    sb.append("    termOrCondition: ").append(toIndentedString(termOrCondition)).append("\n");
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

