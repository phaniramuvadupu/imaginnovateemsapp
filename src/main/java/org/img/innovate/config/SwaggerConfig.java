package org.img.innovate.config;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

//@Configuration
//@EnableSwagger2
public class SwaggerConfig {
	
	public Docket apiDoc() {
		return new Docket(DocumentationType.SWAGGER_2)
				    .select()
				    .apis(RequestHandlerSelectors.basePackage("org.img.innovate"))
				    .paths(PathSelectors.any())
				    .build();
	}

}
