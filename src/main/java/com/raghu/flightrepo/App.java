package com.raghu.flightrepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.raghu.flightrepo.entities.Flight;
import com.raghu.flightrepo.service.FlightService;

@SpringBootApplication
public class App implements CommandLineRunner{
	
	@Autowired
	FlightService fs;
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		fs.createFlight(new Flight());
	}
}
