package com.karan.rest.service.demojavarest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class DemojavarestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemojavarestApplication.class, args);
		System.out.println("Program started");
	}
}
