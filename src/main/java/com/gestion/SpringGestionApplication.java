package com.gestion;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;



@SpringBootApplication
public class SpringGestionApplication implements CommandLineRunner {

	 @Configuration
	 static class SecuritConfig extends GlobalAuthenticationConfigurerAdapter{
		 @Override
		 public void init(AuthenticationManagerBuilder auth) throws Exception {
			 
			        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
			        auth.inMemoryAuthentication()
			          .withUser("user").password(encoder.encode("user")).roles("USER").accountExpired(true);    
		 }
		
	 }
	 
	public static void main(String[] args) {
		SpringApplication.run(SpringGestionApplication.class, args);
	}
	
	public void run(String... args) {
		
	}

}
