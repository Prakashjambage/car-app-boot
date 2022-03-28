package com.ty.car.carappboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class CarAppBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarAppBootApplication.class, args);
	}
	@Bean
	public Docket getDocket() {
		
		Contact contact = new Contact("simran", "www.testyantra.com", "infp@ty.com");
		List<VendorExtension> extensions = new ArrayList<VendorExtension>();
		
		ApiInfo apiInfo = new ApiInfo("Car Api service", "service to manage car savles", "snapshot 1.0", "www.testyantraglobal.com", contact, "License 12345", "www.testyantra.com",extensions);
		
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.ty.car"))
				.build()
				.apiInfo(apiInfo)
				.useDefaultResponseMessages(false);
	}

}
