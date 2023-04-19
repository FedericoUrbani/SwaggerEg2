package com.develhope.SwaggerEg2.config;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@OpenAPIDefinition
@Configuration
public class SpringDocConfiguration {
    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI().info(new Info()
                        .title("Swagger eg")
                        .version("1.0.0")
                        .description("A swagger eg that owns some arithmetical operations"))
                .tags(List.of(new Tag().name("Arithmetical eg")
                        .description("u can make operations")));
    }
}
/* http://localhost:1234/swagger-ui/index.html /// check for swagger */