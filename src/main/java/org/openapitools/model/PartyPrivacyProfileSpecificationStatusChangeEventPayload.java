package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PartyPrivacyProfileSpecification;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The event data structure
 */
@ApiModel(description = "The event data structure")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-20T12:51:03.308+01:00[Europe/Berlin]")

public class PartyPrivacyProfileSpecificationStatusChangeEventPayload   {
  @JsonProperty("partyPrivacyProfileSpecification")
  private PartyPrivacyProfileSpecification partyPrivacyProfileSpecification;

  public PartyPrivacyProfileSpecificationStatusChangeEventPayload partyPrivacyProfileSpecification(PartyPrivacyProfileSpecification partyPrivacyProfileSpecification) {
    this.partyPrivacyProfileSpecification = partyPrivacyProfileSpecification;
    return this;
  }

  /**
   * Get partyPrivacyProfileSpecification
   * @return partyPrivacyProfileSpecification
  */
  @ApiModelProperty(value = "")

  @Valid

  public PartyPrivacyProfileSpecification getPartyPrivacyProfileSpecification() {
    return partyPrivacyProfileSpecification;
  }

  public void setPartyPrivacyProfileSpecification(PartyPrivacyProfileSpecification partyPrivacyProfileSpecification) {
    this.partyPrivacyProfileSpecification = partyPrivacyProfileSpecification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyPrivacyProfileSpecificationStatusChangeEventPayload partyPrivacyProfileSpecificationStatusChangeEventPayload = (PartyPrivacyProfileSpecificationStatusChangeEventPayload) o;
    return Objects.equals(this.partyPrivacyProfileSpecification, partyPrivacyProfileSpecificationStatusChangeEventPayload.partyPrivacyProfileSpecification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyPrivacyProfileSpecification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyProfileSpecificationStatusChangeEventPayload {\n");
    
    sb.append("    partyPrivacyProfileSpecification: ").append(toIndentedString(partyPrivacyProfileSpecification)).append("\n");
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

