package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties
public class StartApp{
	public static void main(String[] args) {
		SpringApplication.run(StartApp.class, args);
	}
}

/*public class StartApp extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(StartApp.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(StartApp.class, args);
	}
}*/
