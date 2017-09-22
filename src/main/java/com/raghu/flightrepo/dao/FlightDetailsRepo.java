package com.raghu.flightrepo.dao;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;

import com.raghu.flightrepo.entities.Flight_Details;

public interface FlightDetailsRepo  extends CrudRepository<Flight_Details, Integer>{
	Flight_Details findByFlightIdAndFlightDepartureDate(int id,Date date);
}
