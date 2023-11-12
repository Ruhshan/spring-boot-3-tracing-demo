package xyz.ruhshan.tracingspringboot3.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"xyz.ruhshan.tracingspringboot3.common", "xyz.ruhshan.tracingspringboot3.restapi"})
public class RestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

}
