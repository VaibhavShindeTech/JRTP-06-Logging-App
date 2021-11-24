package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.service.UserService;

@SpringBootApplication
public class Jrtp06LoggingAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Jrtp06LoggingAppApplication.class, args);
		UserService userService = context.getBean(UserService.class);
		userService.saveUser();
	}

}
