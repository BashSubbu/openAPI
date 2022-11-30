package com.oneoonecode.swaggercrashcourse;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// set title
@OpenAPIDefinition(
		info = @Info(title = "TodoItems API",version = "1.0.0"),
		tags = {@Tag(name = "TodoItems",
				description = "This is the todo items description ")}
)
public class SwaggercrashcourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggercrashcourseApplication.class, args);
	}

}
