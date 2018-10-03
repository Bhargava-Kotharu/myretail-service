package com.myretail.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * My Retail Service Application
 * 
 * @author bkotharu
 *
 */
@EnableSwagger2
@SpringBootApplication
public class MyRetailServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyRetailServiceApplication.class, args);
	}

	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage(getClass().getPackage().getName())).paths(PathSelectors.any())
				.build().apiInfo(generateApiInfo());
	}

	private ApiInfo generateApiInfo() {
		return new ApiInfoBuilder().title("My Retail Service").description("Target Evaluation Test").version("1.0.0")
				.build();
	}

}
