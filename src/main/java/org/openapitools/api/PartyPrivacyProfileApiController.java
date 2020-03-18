package org.openapitools.api;

import org.openapitools.model.PartyPrivacyProfile;
import org.openapitools.model.PartyPrivacyProfileCreate;
import org.openapitools.repository.entity.PartyPrivacyProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-20T12:51:03.308+01:00[Europe/Berlin]")

@Controller
@RequestMapping("${openapi.privacy.base-path:/tmf-api/privacyManagement/v4}")
public class PartyPrivacyProfileApiController implements PartyPrivacyProfileApi {

    private final NativeWebRequest request;

    @Autowired
    private PartyPrivacyProfileRepository repository;

    @org.springframework.beans.factory.annotation.Autowired
    public PartyPrivacyProfileApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<PartyPrivacyProfile> createPartyPrivacyProfile(@Valid PartyPrivacyProfileCreate partyPrivacyProfile) {
       repository.insert(partyPrivacyProfile.agreement());


        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
