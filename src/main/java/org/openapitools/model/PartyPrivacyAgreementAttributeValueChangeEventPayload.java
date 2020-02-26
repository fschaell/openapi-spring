package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PartyPrivacyAgreement;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The event data structure
 */
@ApiModel(description = "The event data structure")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-20T12:51:03.308+01:00[Europe/Berlin]")

public class PartyPrivacyAgreementAttributeValueChangeEventPayload   {
  @JsonProperty("partyPrivacyAgreement")
  private PartyPrivacyAgreement partyPrivacyAgreement;

  public PartyPrivacyAgreementAttributeValueChangeEventPayload partyPrivacyAgreement(PartyPrivacyAgreement partyPrivacyAgreement) {
    this.partyPrivacyAgreement = partyPrivacyAgreement;
    return this;
  }

  /**
   * Get partyPrivacyAgreement
   * @return partyPrivacyAgreement
  */
  @ApiModelProperty(value = "")

  @Valid

  public PartyPrivacyAgreement getPartyPrivacyAgreement() {
    return partyPrivacyAgreement;
  }

  public void setPartyPrivacyAgreement(PartyPrivacyAgreement partyPrivacyAgreement) {
    this.partyPrivacyAgreement = partyPrivacyAgreement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyPrivacyAgreementAttributeValueChangeEventPayload partyPrivacyAgreementAttributeValueChangeEventPayload = (PartyPrivacyAgreementAttributeValueChangeEventPayload) o;
    return Objects.equals(this.partyPrivacyAgreement, partyPrivacyAgreementAttributeValueChangeEventPayload.partyPrivacyAgreement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyPrivacyAgreement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyAgreementAttributeValueChangeEventPayload {\n");
    
    sb.append("    partyPrivacyAgreement: ").append(toIndentedString(partyPrivacyAgreement)).append("\n");
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

