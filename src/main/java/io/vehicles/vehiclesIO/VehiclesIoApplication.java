package io.vehicles.vehiclesIO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

//@EntityScan("io.vehicles.vehiclesIO.entities")
@SpringBootApplication
public class VehiclesIoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehiclesIoApplication.class, args);
	}

}
