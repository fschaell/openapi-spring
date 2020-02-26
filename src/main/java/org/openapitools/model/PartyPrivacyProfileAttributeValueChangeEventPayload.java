package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PartyPrivacyProfile;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The event data structure
 */
@ApiModel(description = "The event data structure")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-20T12:51:03.308+01:00[Europe/Berlin]")

public class PartyPrivacyProfileAttributeValueChangeEventPayload   {
  @JsonProperty("partyPrivacyProfile")
  private PartyPrivacyProfile partyPrivacyProfile;

  public PartyPrivacyProfileAttributeValueChangeEventPayload partyPrivacyProfile(PartyPrivacyProfile partyPrivacyProfile) {
    this.partyPrivacyProfile = partyPrivacyProfile;
    return this;
  }

  /**
   * Get partyPrivacyProfile
   * @return partyPrivacyProfile
  */
  @ApiModelProperty(value = "")

  @Valid

  public PartyPrivacyProfile getPartyPrivacyProfile() {
    return partyPrivacyProfile;
  }

  public void setPartyPrivacyProfile(PartyPrivacyProfile partyPrivacyProfile) {
    this.partyPrivacyProfile = partyPrivacyProfile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyPrivacyProfileAttributeValueChangeEventPayload partyPrivacyProfileAttributeValueChangeEventPayload = (PartyPrivacyProfileAttributeValueChangeEventPayload) o;
    return Objects.equals(this.partyPrivacyProfile, partyPrivacyProfileAttributeValueChangeEventPayload.partyPrivacyProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyPrivacyProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyProfileAttributeValueChangeEventPayload {\n");
    
    sb.append("    partyPrivacyProfile: ").append(toIndentedString(partyPrivacyProfile)).append("\n");
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

