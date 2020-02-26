package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-20T12:51:03.308+01:00[Europe/Berlin]")

@Controller
@RequestMapping("${openapi.privacy.base-path:/tmf-api/privacyManagement/v4}")
public class PartyPrivacyProfileSpecificationApiController implements PartyPrivacyProfileSpecificationApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PartyPrivacyProfileSpecificationApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
