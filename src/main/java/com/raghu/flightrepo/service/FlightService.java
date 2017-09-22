package com.raghu.flightrepo.service;

import java.util.Date;

import com.raghu.flightrepo.entities.Flight;
import com.raghu.flightrepo.entities.Flight_Details;

public interface FlightService {
	void createFlight(Flight flight); 
	void createFlightDetails(Flight_Details fd);
	Flight getFlight(int id);
	Flight_Details getFlightDetails(int id,Date departure_date);
	void updateFlight(Flight flight);
	void updateFlightDetails(Flight_Details fd);
	void deleteFlight(Flight flight);
	void deleteFlightDetails(Flight_Details fd);
	
}
