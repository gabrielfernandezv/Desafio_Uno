package com.pr.desafiouno.nivel3;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Value("${application.name}")
    private String applicationName;

    @Value("${build.version}")
    private String buildVersion;

    @Bean
    public Docket swagger() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build().apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo() {
        return new ApiInfo(applicationName,
                "api Desafío 1: Periodos perdidos Nivel 3",
                buildVersion, "https://www.previred.com/web/previred/",
                new Contact("Gabriel Fernandez",
                        "https://www.previred.com/web/previred/", "gabriel.fernandez.velasquez@gmail.com"),
                "previred", "", Lists.newArrayList(new ArrayList<>()));
    }

}