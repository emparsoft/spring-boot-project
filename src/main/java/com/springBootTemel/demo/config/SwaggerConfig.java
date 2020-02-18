package com.springBootTemel.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;
import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    //Swagger Configuration sayesinde yazdıgımız Post,Get vs. methodların Dokumantasyonu
    //http://localhost:7500/swagger-ui.html adresi üzerinden net şekilde gorulebiliyor.

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Issue Management API Reference")
                .version("1.0.0")
                .build();
    }

    @Bean
    public Docket customImplementation() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select().paths(PathSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.springBootTemel"))
                .build()
                .pathMapping("/")
                .useDefaultResponseMessages(false)
                .directModelSubstitute(LocalDate.class,String.class)
                .genericModelSubstitutes(ResponseEntity.class);
    }
}
