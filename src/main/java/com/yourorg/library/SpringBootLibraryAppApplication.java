package com.yourorg.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
(exclude = {DataSourceAutoConfiguration.class})
public class SpringBootLibraryAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryAppApplication.class, args);
	}

}
