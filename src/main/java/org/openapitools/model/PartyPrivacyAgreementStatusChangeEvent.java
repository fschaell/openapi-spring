package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.PartyPrivacyAgreementStatusChangeEventPayload;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The notification data structure
 */
@ApiModel(description = "The notification data structure")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-20T12:51:03.308+01:00[Europe/Berlin]")

public class PartyPrivacyAgreementStatusChangeEvent   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("href")
  private String href;

  @JsonProperty("eventId")
  private String eventId;

  @JsonProperty("eventTime")
  private OffsetDateTime eventTime;

  @JsonProperty("eventType")
  private String eventType;

  @JsonProperty("correlationId")
  private String correlationId;

  @JsonProperty("domain")
  private String domain;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("priority")
  private String priority;

  @JsonProperty("timeOcurred")
  private OffsetDateTime timeOcurred;

  @JsonProperty("event")
  private PartyPrivacyAgreementStatusChangeEventPayload event;

  public PartyPrivacyAgreementStatusChangeEvent id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the Process flow
   * @return id
  */
  @ApiModelProperty(value = "Identifier of the Process flow")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PartyPrivacyAgreementStatusChangeEvent href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference of the ProcessFlow
   * @return href
  */
  @ApiModelProperty(value = "Reference of the ProcessFlow")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public PartyPrivacyAgreementStatusChangeEvent eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * The identifier of the notification.
   * @return eventId
  */
  @ApiModelProperty(value = "The identifier of the notification.")


  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public PartyPrivacyAgreementStatusChangeEvent eventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * Time of the event occurrence.
   * @return eventTime
  */
  @ApiModelProperty(value = "Time of the event occurrence.")

  @Valid

  public OffsetDateTime getEventTime() {
    return eventTime;
  }

  public void setEventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
  }

  public PartyPrivacyAgreementStatusChangeEvent eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * The type of the notification.
   * @return eventType
  */
  @ApiModelProperty(value = "The type of the notification.")


  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public PartyPrivacyAgreementStatusChangeEvent correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

  /**
   * The correlation id for this event.
   * @return correlationId
  */
  @ApiModelProperty(value = "The correlation id for this event.")


  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public PartyPrivacyAgreementStatusChangeEvent domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * The domain of the event.
   * @return domain
  */
  @ApiModelProperty(value = "The domain of the event.")


  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public PartyPrivacyAgreementStatusChangeEvent title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the event.
   * @return title
  */
  @ApiModelProperty(value = "The title of the event.")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PartyPrivacyAgreementStatusChangeEvent description(String description) {
    this.description = description;
    return this;
  }

  /**
   * An explnatory of the event.
   * @return description
  */
  @ApiModelProperty(value = "An explnatory of the event.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PartyPrivacyAgreementStatusChangeEvent priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * A priority.
   * @return priority
  */
  @ApiModelProperty(value = "A priority.")


  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public PartyPrivacyAgreementStatusChangeEvent timeOcurred(OffsetDateTime timeOcurred) {
    this.timeOcurred = timeOcurred;
    return this;
  }

  /**
   * The time the event occured.
   * @return timeOcurred
  */
  @ApiModelProperty(value = "The time the event occured.")

  @Valid

  public OffsetDateTime getTimeOcurred() {
    return timeOcurred;
  }

  public void setTimeOcurred(OffsetDateTime timeOcurred) {
    this.timeOcurred = timeOcurred;
  }

  public PartyPrivacyAgreementStatusChangeEvent event(PartyPrivacyAgreementStatusChangeEventPayload event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
  */
  @ApiModelProperty(value = "")

  @Valid

  public PartyPrivacyAgreementStatusChangeEventPayload getEvent() {
    return event;
  }

  public void setEvent(PartyPrivacyAgreementStatusChangeEventPayload event) {
    this.event = event;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyPrivacyAgreementStatusChangeEvent partyPrivacyAgreementStatusChangeEvent = (PartyPrivacyAgreementStatusChangeEvent) o;
    return Objects.equals(this.id, partyPrivacyAgreementStatusChangeEvent.id) &&
        Objects.equals(this.href, partyPrivacyAgreementStatusChangeEvent.href) &&
        Objects.equals(this.eventId, partyPrivacyAgreementStatusChangeEvent.eventId) &&
        Objects.equals(this.eventTime, partyPrivacyAgreementStatusChangeEvent.eventTime) &&
        Objects.equals(this.eventType, partyPrivacyAgreementStatusChangeEvent.eventType) &&
        Objects.equals(this.correlationId, partyPrivacyAgreementStatusChangeEvent.correlationId) &&
        Objects.equals(this.domain, partyPrivacyAgreementStatusChangeEvent.domain) &&
        Objects.equals(this.title, partyPrivacyAgreementStatusChangeEvent.title) &&
        Objects.equals(this.description, partyPrivacyAgreementStatusChangeEvent.description) &&
        Objects.equals(this.priority, partyPrivacyAgreementStatusChangeEvent.priority) &&
        Objects.equals(this.timeOcurred, partyPrivacyAgreementStatusChangeEvent.timeOcurred) &&
        Objects.equals(this.event, partyPrivacyAgreementStatusChangeEvent.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, eventId, eventTime, eventType, correlationId, domain, title, description, priority, timeOcurred, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyPrivacyAgreementStatusChangeEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    timeOcurred: ").append(toIndentedString(timeOcurred)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

