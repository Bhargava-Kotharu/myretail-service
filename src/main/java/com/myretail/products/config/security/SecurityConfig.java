package com.myretail.products.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private AuthenticationEntryPoint authenticationEntryPoint;

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication().withUser("user").password("password").roles("USER").and().withUser("admin")
				.password("password").roles("USER", "ADMIN");
	}

	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/securityNone").permitAll().anyRequest().authenticated().and().httpBasic();
				//.authenticationEntryPoint(authenticationEntryPoint);

	}

}
