package com.yourorg.library;

import com.yourorg.library.Service.implementation.ExcludedService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(
		basePackages = "com.yourorg.library",
		excludeFilters = @ComponentScan.Filter(
				type = FilterType.ASSIGNABLE_TYPE,
				classes = ExcludedService.class
		)
)
public class SpringBootLibraryAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryAppApplication.class, args);
	}

}
