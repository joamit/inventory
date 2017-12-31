package io.joamit.inventory.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.RequestHandlerSelectors.basePackage;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static final String CONTROLLER_BASE_PACKAGE = "io.joamit.inventory.service.controller";

    /**
     * Enables swagger only for the controllers created in defined package
     *
     * @return Docket instance for swagger initialization
     */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(or(RequestHandlerSelectors.withClassAnnotation(RepositoryRestController.class),
                        basePackage(CONTROLLER_BASE_PACKAGE)))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    /**
     * Add custom api information to be displayed on Swagger page
     *
     * @return ApiInformation for the swagger page
     */
    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Inventory Service RESTful API",
                "This API can be used to perform Inventory related CRUD Operations.",
                "1.0-SNAPSHOT",
                "https://github.com/joamit/inventory/blob/master/LICENSE",
                new Contact("Amit Joshi", "https://github.com/joamit/inventory", "amit.joshi@gs.com"),
                "MIT Open source", "https://github.com/joamit/inventory/blob/master/LICENSE", Collections.emptyList());
    }
}
