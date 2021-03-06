/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.3).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.EventSubscription;
import org.openapitools.model.PartyPrivacyAgreementAttributeValueChangeEvent;
import org.openapitools.model.PartyPrivacyAgreementCreateEvent;
import org.openapitools.model.PartyPrivacyAgreementDeleteEvent;
import org.openapitools.model.PartyPrivacyAgreementStatusChangeEvent;
import org.openapitools.model.PartyPrivacyProfileAttributeValueChangeEvent;
import org.openapitools.model.PartyPrivacyProfileCreateEvent;
import org.openapitools.model.PartyPrivacyProfileDeleteEvent;
import org.openapitools.model.PartyPrivacyProfileSpecificationAttributeValueChangeEvent;
import org.openapitools.model.PartyPrivacyProfileSpecificationCreateEvent;
import org.openapitools.model.PartyPrivacyProfileSpecificationDeleteEvent;
import org.openapitools.model.PartyPrivacyProfileSpecificationStatusChangeEvent;
import org.openapitools.model.PartyPrivacyProfileStatusChangeEvent;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-20T12:51:03.308+01:00[Europe/Berlin]")

@Validated
@Api(value = "listener", description = "the listener API")
public interface ListenerApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /listener/partyPrivacyAgreementAttributeValueChangeEvent : Client listener for entity PartyPrivacyAgreementAttributeValueChangeEvent
     * Example of a client listener for receiving the notification PartyPrivacyAgreementAttributeValueChangeEvent
     *
     * @param data The event data (required)
     * @return Notified (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Method Not allowed (status code 405)
     *         or Conflict (status code 409)
     *         or Internal Server Error (status code 500)
     */
    @ApiOperation(value = "Client listener for entity PartyPrivacyAgreementAttributeValueChangeEvent", nickname = "listenToPartyPrivacyAgreementAttributeValueChangeEvent", notes = "Example of a client listener for receiving the notification PartyPrivacyAgreementAttributeValueChangeEvent", response = EventSubscription.class, tags={ "notification listeners (client side)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Notified", response = EventSubscription.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/listener/partyPrivacyAgreementAttributeValueChangeEvent",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.POST)
    default ResponseEntity<EventSubscription> listenToPartyPrivacyAgreementAttributeValueChangeEvent(@ApiParam(value = "The event data" ,required=true )  @Valid @RequestBody PartyPrivacyAgreementAttributeValueChangeEvent data) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"query\" : \"query\", \"callback\" : \"callback\", \"id\" : \"id\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /listener/partyPrivacyAgreementCreateEvent : Client listener for entity PartyPrivacyAgreementCreateEvent
     * Example of a client listener for receiving the notification PartyPrivacyAgreementCreateEvent
     *
     * @param data The event data (required)
     * @return Notified (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Method Not allowed (status code 405)
     *         or Conflict (status code 409)
     *         or Internal Server Error (status code 500)
     */
    @ApiOperation(value = "Client listener for entity PartyPrivacyAgreementCreateEvent", nickname = "listenToPartyPrivacyAgreementCreateEvent", notes = "Example of a client listener for receiving the notification PartyPrivacyAgreementCreateEvent", response = EventSubscription.class, tags={ "notification listeners (client side)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Notified", response = EventSubscription.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/listener/partyPrivacyAgreementCreateEvent",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.POST)
    default ResponseEntity<EventSubscription> listenToPartyPrivacyAgreementCreateEvent(@ApiParam(value = "The event data" ,required=true )  @Valid @RequestBody PartyPrivacyAgreementCreateEvent data) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"query\" : \"query\", \"callback\" : \"callback\", \"id\" : \"id\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /listener/partyPrivacyAgreementDeleteEvent : Client listener for entity PartyPrivacyAgreementDeleteEvent
     * Example of a client listener for receiving the notification PartyPrivacyAgreementDeleteEvent
     *
     * @param data The event data (required)
     * @return Notified (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Method Not allowed (status code 405)
     *         or Conflict (status code 409)
     *         or Internal Server Error (status code 500)
     */
    @ApiOperation(value = "Client listener for entity PartyPrivacyAgreementDeleteEvent", nickname = "listenToPartyPrivacyAgreementDeleteEvent", notes = "Example of a client listener for receiving the notification PartyPrivacyAgreementDeleteEvent", response = EventSubscription.class, tags={ "notification listeners (client side)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Notified", response = EventSubscription.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/listener/partyPrivacyAgreementDeleteEvent",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.POST)
    default ResponseEntity<EventSubscription> listenToPartyPrivacyAgreementDeleteEvent(@ApiParam(value = "The event data" ,required=true )  @Valid @RequestBody PartyPrivacyAgreementDeleteEvent data) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"query\" : \"query\", \"callback\" : \"callback\", \"id\" : \"id\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /listener/partyPrivacyAgreementStatusChangeEvent : Client listener for entity PartyPrivacyAgreementStatusChangeEvent
     * Example of a client listener for receiving the notification PartyPrivacyAgreementStatusChangeEvent
     *
     * @param data The event data (required)
     * @return Notified (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Method Not allowed (status code 405)
     *         or Conflict (status code 409)
     *         or Internal Server Error (status code 500)
     */
    @ApiOperation(value = "Client listener for entity PartyPrivacyAgreementStatusChangeEvent", nickname = "listenToPartyPrivacyAgreementStatusChangeEvent", notes = "Example of a client listener for receiving the notification PartyPrivacyAgreementStatusChangeEvent", response = EventSubscription.class, tags={ "notification listeners (client side)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Notified", response = EventSubscription.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/listener/partyPrivacyAgreementStatusChangeEvent",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.POST)
    default ResponseEntity<EventSubscription> listenToPartyPrivacyAgreementStatusChangeEvent(@ApiParam(value = "The event data" ,required=true )  @Valid @RequestBody PartyPrivacyAgreementStatusChangeEvent data) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"query\" : \"query\", \"callback\" : \"callback\", \"id\" : \"id\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /listener/partyPrivacyProfileAttributeValueChangeEvent : Client listener for entity PartyPrivacyProfileAttributeValueChangeEvent
     * Example of a client listener for receiving the notification PartyPrivacyProfileAttributeValueChangeEvent
     *
     * @param data The event data (required)
     * @return Notified (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Method Not allowed (status code 405)
     *         or Conflict (status code 409)
     *         or Internal Server Error (status code 500)
     */
    @ApiOperation(value = "Client listener for entity PartyPrivacyProfileAttributeValueChangeEvent", nickname = "listenToPartyPrivacyProfileAttributeValueChangeEvent", notes = "Example of a client listener for receiving the notification PartyPrivacyProfileAttributeValueChangeEvent", response = EventSubscription.class, tags={ "notification listeners (client side)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Notified", response = EventSubscription.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/listener/partyPrivacyProfileAttributeValueChangeEvent",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.POST)
    default ResponseEntity<EventSubscription> listenToPartyPrivacyProfileAttributeValueChangeEvent(@ApiParam(value = "The event data" ,required=true )  @Valid @RequestBody PartyPrivacyProfileAttributeValueChangeEvent data) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"query\" : \"query\", \"callback\" : \"callback\", \"id\" : \"id\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /listener/partyPrivacyProfileCreateEvent : Client listener for entity PartyPrivacyProfileCreateEvent
     * Example of a client listener for receiving the notification PartyPrivacyProfileCreateEvent
     *
     * @param data The event data (required)
     * @return Notified (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Method Not allowed (status code 405)
     *         or Conflict (status code 409)
     *         or Internal Server Error (status code 500)
     */
    @ApiOperation(value = "Client listener for entity PartyPrivacyProfileCreateEvent", nickname = "listenToPartyPrivacyProfileCreateEvent", notes = "Example of a client listener for receiving the notification PartyPrivacyProfileCreateEvent", response = EventSubscription.class, tags={ "notification listeners (client side)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Notified", response = EventSubscription.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/listener/partyPrivacyProfileCreateEvent",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.POST)
    default ResponseEntity<EventSubscription> listenToPartyPrivacyProfileCreateEvent(@ApiParam(value = "The event data" ,required=true )  @Valid @RequestBody PartyPrivacyProfileCreateEvent data) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"query\" : \"query\", \"callback\" : \"callback\", \"id\" : \"id\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /listener/partyPrivacyProfileDeleteEvent : Client listener for entity PartyPrivacyProfileDeleteEvent
     * Example of a client listener for receiving the notification PartyPrivacyProfileDeleteEvent
     *
     * @param data The event data (required)
     * @return Notified (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Method Not allowed (status code 405)
     *         or Conflict (status code 409)
     *         or Internal Server Error (status code 500)
     */
    @ApiOperation(value = "Client listener for entity PartyPrivacyProfileDeleteEvent", nickname = "listenToPartyPrivacyProfileDeleteEvent", notes = "Example of a client listener for receiving the notification PartyPrivacyProfileDeleteEvent", response = EventSubscription.class, tags={ "notification listeners (client side)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Notified", response = EventSubscription.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/listener/partyPrivacyProfileDeleteEvent",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.POST)
    default ResponseEntity<EventSubscription> listenToPartyPrivacyProfileDeleteEvent(@ApiParam(value = "The event data" ,required=true )  @Valid @RequestBody PartyPrivacyProfileDeleteEvent data) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"query\" : \"query\", \"callback\" : \"callback\", \"id\" : \"id\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /listener/partyPrivacyProfileSpecificationAttributeValueChangeEvent : Client listener for entity PartyPrivacyProfileSpecificationAttributeValueChangeEvent
     * Example of a client listener for receiving the notification PartyPrivacyProfileSpecificationAttributeValueChangeEvent
     *
     * @param data The event data (required)
     * @return Notified (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Method Not allowed (status code 405)
     *         or Conflict (status code 409)
     *         or Internal Server Error (status code 500)
     */
    @ApiOperation(value = "Client listener for entity PartyPrivacyProfileSpecificationAttributeValueChangeEvent", nickname = "listenToPartyPrivacyProfileSpecificationAttributeValueChangeEvent", notes = "Example of a client listener for receiving the notification PartyPrivacyProfileSpecificationAttributeValueChangeEvent", response = EventSubscription.class, tags={ "notification listeners (client side)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Notified", response = EventSubscription.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/listener/partyPrivacyProfileSpecificationAttributeValueChangeEvent",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.POST)
    default ResponseEntity<EventSubscription> listenToPartyPrivacyProfileSpecificationAttributeValueChangeEvent(@ApiParam(value = "The event data" ,required=true )  @Valid @RequestBody PartyPrivacyProfileSpecificationAttributeValueChangeEvent data) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"query\" : \"query\", \"callback\" : \"callback\", \"id\" : \"id\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /listener/partyPrivacyProfileSpecificationCreateEvent : Client listener for entity PartyPrivacyProfileSpecificationCreateEvent
     * Example of a client listener for receiving the notification PartyPrivacyProfileSpecificationCreateEvent
     *
     * @param data The event data (required)
     * @return Notified (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Method Not allowed (status code 405)
     *         or Conflict (status code 409)
     *         or Internal Server Error (status code 500)
     */
    @ApiOperation(value = "Client listener for entity PartyPrivacyProfileSpecificationCreateEvent", nickname = "listenToPartyPrivacyProfileSpecificationCreateEvent", notes = "Example of a client listener for receiving the notification PartyPrivacyProfileSpecificationCreateEvent", response = EventSubscription.class, tags={ "notification listeners (client side)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Notified", response = EventSubscription.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/listener/partyPrivacyProfileSpecificationCreateEvent",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.POST)
    default ResponseEntity<EventSubscription> listenToPartyPrivacyProfileSpecificationCreateEvent(@ApiParam(value = "The event data" ,required=true )  @Valid @RequestBody PartyPrivacyProfileSpecificationCreateEvent data) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"query\" : \"query\", \"callback\" : \"callback\", \"id\" : \"id\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /listener/partyPrivacyProfileSpecificationDeleteEvent : Client listener for entity PartyPrivacyProfileSpecificationDeleteEvent
     * Example of a client listener for receiving the notification PartyPrivacyProfileSpecificationDeleteEvent
     *
     * @param data The event data (required)
     * @return Notified (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Method Not allowed (status code 405)
     *         or Conflict (status code 409)
     *         or Internal Server Error (status code 500)
     */
    @ApiOperation(value = "Client listener for entity PartyPrivacyProfileSpecificationDeleteEvent", nickname = "listenToPartyPrivacyProfileSpecificationDeleteEvent", notes = "Example of a client listener for receiving the notification PartyPrivacyProfileSpecificationDeleteEvent", response = EventSubscription.class, tags={ "notification listeners (client side)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Notified", response = EventSubscription.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/listener/partyPrivacyProfileSpecificationDeleteEvent",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.POST)
    default ResponseEntity<EventSubscription> listenToPartyPrivacyProfileSpecificationDeleteEvent(@ApiParam(value = "The event data" ,required=true )  @Valid @RequestBody PartyPrivacyProfileSpecificationDeleteEvent data) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"query\" : \"query\", \"callback\" : \"callback\", \"id\" : \"id\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /listener/partyPrivacyProfileSpecificationStatusChangeEvent : Client listener for entity PartyPrivacyProfileSpecificationStatusChangeEvent
     * Example of a client listener for receiving the notification PartyPrivacyProfileSpecificationStatusChangeEvent
     *
     * @param data The event data (required)
     * @return Notified (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Method Not allowed (status code 405)
     *         or Conflict (status code 409)
     *         or Internal Server Error (status code 500)
     */
    @ApiOperation(value = "Client listener for entity PartyPrivacyProfileSpecificationStatusChangeEvent", nickname = "listenToPartyPrivacyProfileSpecificationStatusChangeEvent", notes = "Example of a client listener for receiving the notification PartyPrivacyProfileSpecificationStatusChangeEvent", response = EventSubscription.class, tags={ "notification listeners (client side)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Notified", response = EventSubscription.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/listener/partyPrivacyProfileSpecificationStatusChangeEvent",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.POST)
    default ResponseEntity<EventSubscription> listenToPartyPrivacyProfileSpecificationStatusChangeEvent(@ApiParam(value = "The event data" ,required=true )  @Valid @RequestBody PartyPrivacyProfileSpecificationStatusChangeEvent data) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"query\" : \"query\", \"callback\" : \"callback\", \"id\" : \"id\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /listener/partyPrivacyProfileStatusChangeEvent : Client listener for entity PartyPrivacyProfileStatusChangeEvent
     * Example of a client listener for receiving the notification PartyPrivacyProfileStatusChangeEvent
     *
     * @param data The event data (required)
     * @return Notified (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Method Not allowed (status code 405)
     *         or Conflict (status code 409)
     *         or Internal Server Error (status code 500)
     */
    @ApiOperation(value = "Client listener for entity PartyPrivacyProfileStatusChangeEvent", nickname = "listenToPartyPrivacyProfileStatusChangeEvent", notes = "Example of a client listener for receiving the notification PartyPrivacyProfileStatusChangeEvent", response = EventSubscription.class, tags={ "notification listeners (client side)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Notified", response = EventSubscription.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/listener/partyPrivacyProfileStatusChangeEvent",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.POST)
    default ResponseEntity<EventSubscription> listenToPartyPrivacyProfileStatusChangeEvent(@ApiParam(value = "The event data" ,required=true )  @Valid @RequestBody PartyPrivacyProfileStatusChangeEvent data) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"query\" : \"query\", \"callback\" : \"callback\", \"id\" : \"id\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
