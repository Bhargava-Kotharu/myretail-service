package com.myretail.products.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

@Configuration
@EnableMongoRepositories
@ComponentScan(basePackages = { "com.myretail.products" })
public class MyRetailServiceConfig {

	@Bean
	public MapperFactory mapperFactory() {
		return new DefaultMapperFactory.Builder().build();
	}
}
