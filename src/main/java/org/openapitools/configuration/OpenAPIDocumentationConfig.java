package org.openapitools.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.util.UriComponentsBuilder;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.paths.Paths;
import springfox.documentation.spring.web.paths.RelativePathProvider;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.ServletContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-20T12:51:03.308+01:00[Europe/Berlin]")

@Configuration
@EnableSwagger2
public class OpenAPIDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Privacy")
            .description("**TMF API Reference : TMF - 644 Privacy**  **Release : 19.0 - June 2019**  The Privacy Management API provides standardized mechanism for privacy profile specification, privacy profiles and privacy agreements such as creation, update, retrieval, deletion and notification of events.Privacy management API manages the following data resources:  **Privacy Profile specification** Privacy profile specification represents a description for privacy profiles.Main privacy profile specification attributes are its identifier, name, description, version, last update, lifecycle status, validity period, characteristics and their values, related parties, applicable roles.  **Privacy Profile** Privacy profile represents the set of Privacy settings defined for a Party.Main privacy profile attributes are its identifier, name, description, date of creation, status, validity period, privacy profile specification, characteristics values, agreement, the party who has agreed and the party which the privacy is applicable for, typically the same party represents both the aggreged by and applicable for. In case of minor privacy the applicable for party is the minor and the agreed party is the parent.  **Privacy Agreement** Privacy agreement represents the approval made by the Party about a Party Privacy Profile.Main privacy agreement attributes are its identifier, name, description, agreement period, initial date, completion date, document number, statement of intent, status, type, version, agreement specification, agreement items, engaged party, agreement authorization, characteristics, associated agreements, privacy profile and privacy profile characteristic values. Privacy management API performs the following operations on privacy profile specification, privacy profiles and privacy agreements: -Retrieval of a privacy profile specification, a privacy profile or a privacy agreement, or of a collection of them depending on filter criteria -Partial update of a privacy profile specification, a privacy profile or a privacy agreement -Creation of a privacy profile specification, a privacy profile or a privacy agreement -Deletion of a privacy profile specification, a privacy profile or a privacy agreement (for administration purposes)  **Notification of events:** -privacy profile specification create -privacy profile specification update -privacy profile specification delete -privacy profile create -privacy profile update -privacy profile delete -privacy agreement create -privacy agreement update   Copyright © TM Forum 2019. All Rights Reserved   ")
            .license("")
            .licenseUrl("http://unlicense.org")
            .termsOfServiceUrl("")
            .version("4.0.0")
            .contact(new Contact("","", ""))
            .build();
    }

    @Bean
    public Docket customImplementation(ServletContext servletContext, @Value("${openapi.privacy.base-path:/tmf-api/privacyManagement/v4}") String basePath) {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("org.openapitools.api"))
                    .build()
                .pathProvider(new BasePathAwareRelativePathProvider(servletContext, basePath))
                .directModelSubstitute(java.time.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(java.time.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

    class BasePathAwareRelativePathProvider extends RelativePathProvider {
        private String basePath;

        public BasePathAwareRelativePathProvider(ServletContext servletContext, String basePath) {
            super(servletContext);
            this.basePath = basePath;
        }

        @Override
        protected String applicationPath() {
            return  Paths.removeAdjacentForwardSlashes(UriComponentsBuilder.fromPath(super.applicationPath()).path(basePath).build().toString());
        }

        @Override
        public String getOperationPath(String operationPath) {
            UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromPath("/");
            return Paths.removeAdjacentForwardSlashes(
                    uriComponentsBuilder.path(operationPath.replaceFirst("^" + basePath, "")).build().toString());
        }
    }

}
