package com.myretail.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

/**
 * My Retail Service Application
 * 
 * @author bkotharu
 *
 */
@SpringBootApplication
public class MyRetailServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyRetailServiceApplication.class, args);
	}

}
