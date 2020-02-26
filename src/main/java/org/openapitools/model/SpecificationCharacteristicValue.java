package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import org.openapitools.model.TimePeriod;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A number or text that can be assigned to a SpecificationCharacteristic
 */
@ApiModel(description = "A number or text that can be assigned to a SpecificationCharacteristic")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-20T12:51:03.308+01:00[Europe/Berlin]")

public class SpecificationCharacteristicValue   {
  @JsonProperty("isDefault")
  private Boolean isDefault;

  @JsonProperty("rangeInterval")
  private String rangeInterval;

  @JsonProperty("regex")
  private String regex;

  @JsonProperty("unitOfMeasure")
  private String unitOfMeasure;

  @JsonProperty("valueFrom")
  private Integer valueFrom;

  @JsonProperty("valueTo")
  private Integer valueTo;

  @JsonProperty("valueType")
  private String valueType;

  @JsonProperty("validFor")
  private TimePeriod validFor;

  @JsonProperty("value")
  private Object value;

  @JsonProperty("@baseType")
  private String atBaseType;

  @JsonProperty("@schemaLocation")
  private URI atSchemaLocation;

  @JsonProperty("@type")
  private String atType;

  public SpecificationCharacteristicValue isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * If true, the Boolean Indicates if the value is the default value for a characteristic
   * @return isDefault
  */
  @ApiModelProperty(value = "If true, the Boolean Indicates if the value is the default value for a characteristic")


  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public SpecificationCharacteristicValue rangeInterval(String rangeInterval) {
    this.rangeInterval = rangeInterval;
    return this;
  }

  /**
   * An indicator that specifies the inclusion or exclusion of the valueFrom and valueTo attributes. If applicable, possible values are \"open\", \"closed\", \"closedBottom\" and \"closedTop\".
   * @return rangeInterval
  */
  @ApiModelProperty(value = "An indicator that specifies the inclusion or exclusion of the valueFrom and valueTo attributes. If applicable, possible values are \"open\", \"closed\", \"closedBottom\" and \"closedTop\".")


  public String getRangeInterval() {
    return rangeInterval;
  }

  public void setRangeInterval(String rangeInterval) {
    this.rangeInterval = rangeInterval;
  }

  public SpecificationCharacteristicValue regex(String regex) {
    this.regex = regex;
    return this;
  }

  /**
   * A regular expression constraint for given value
   * @return regex
  */
  @ApiModelProperty(value = "A regular expression constraint for given value")


  public String getRegex() {
    return regex;
  }

  public void setRegex(String regex) {
    this.regex = regex;
  }

  public SpecificationCharacteristicValue unitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

  /**
   * unit of measure for the valueCould be minutes, GB, etc
   * @return unitOfMeasure
  */
  @ApiModelProperty(value = "unit of measure for the valueCould be minutes, GB, etc")


  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  public SpecificationCharacteristicValue valueFrom(Integer valueFrom) {
    this.valueFrom = valueFrom;
    return this;
  }

  /**
   * The low range value that a characteristic can take on
   * @return valueFrom
  */
  @ApiModelProperty(value = "The low range value that a characteristic can take on")


  public Integer getValueFrom() {
    return valueFrom;
  }

  public void setValueFrom(Integer valueFrom) {
    this.valueFrom = valueFrom;
  }

  public SpecificationCharacteristicValue valueTo(Integer valueTo) {
    this.valueTo = valueTo;
    return this;
  }

  /**
   * The upper range value that a characteristic can take on
   * @return valueTo
  */
  @ApiModelProperty(value = "The upper range value that a characteristic can take on")


  public Integer getValueTo() {
    return valueTo;
  }

  public void setValueTo(Integer valueTo) {
    this.valueTo = valueTo;
  }

  public SpecificationCharacteristicValue valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * A kind of value that the characteristic value can take on, such as numeric, text and so forth
   * @return valueType
  */
  @ApiModelProperty(value = "A kind of value that the characteristic value can take on, such as numeric, text and so forth")


  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  public SpecificationCharacteristicValue validFor(TimePeriod validFor) {
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

  public SpecificationCharacteristicValue value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public SpecificationCharacteristicValue atBaseType(String atBaseType) {
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

  public SpecificationCharacteristicValue atSchemaLocation(URI atSchemaLocation) {
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

  public SpecificationCharacteristicValue atType(String atType) {
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
    SpecificationCharacteristicValue specificationCharacteristicValue = (SpecificationCharacteristicValue) o;
    return Objects.equals(this.isDefault, specificationCharacteristicValue.isDefault) &&
        Objects.equals(this.rangeInterval, specificationCharacteristicValue.rangeInterval) &&
        Objects.equals(this.regex, specificationCharacteristicValue.regex) &&
        Objects.equals(this.unitOfMeasure, specificationCharacteristicValue.unitOfMeasure) &&
        Objects.equals(this.valueFrom, specificationCharacteristicValue.valueFrom) &&
        Objects.equals(this.valueTo, specificationCharacteristicValue.valueTo) &&
        Objects.equals(this.valueType, specificationCharacteristicValue.valueType) &&
        Objects.equals(this.validFor, specificationCharacteristicValue.validFor) &&
        Objects.equals(this.value, specificationCharacteristicValue.value) &&
        Objects.equals(this.atBaseType, specificationCharacteristicValue.atBaseType) &&
        Objects.equals(this.atSchemaLocation, specificationCharacteristicValue.atSchemaLocation) &&
        Objects.equals(this.atType, specificationCharacteristicValue.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDefault, rangeInterval, regex, unitOfMeasure, valueFrom, valueTo, valueType, validFor, value, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecificationCharacteristicValue {\n");
    
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    rangeInterval: ").append(toIndentedString(rangeInterval)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    valueFrom: ").append(toIndentedString(valueFrom)).append("\n");
    sb.append("    valueTo: ").append(toIndentedString(valueTo)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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

