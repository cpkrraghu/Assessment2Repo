package com.raghu.flightrepo.service;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raghu.flightrepo.dao.FlightDetailsRepo;
import com.raghu.flightrepo.dao.FlightRepo;
import com.raghu.flightrepo.entities.Flight;
import com.raghu.flightrepo.entities.Flight_Details;

@Service
@Transactional
public class FlightServiceImpl implements FlightService {
	@Autowired
	FlightDetailsRepo fdr;
	@Autowired
	FlightRepo fr;
	@Override
	public void createFlight(Flight flight) {
		fr.save(flight);
	}

	@Override
	public void createFlightDetails(Flight_Details fd) {
		fdr.save(fd);
		
	}

	@Override
	public Flight getFlight(int id) {
		return fr.findOne(id);
	}

	@Override
	public Flight_Details getFlightDetails(int id, Date departure_date) {
		return fdr.findByFlightIdAndFlightDepartureDate(id, departure_date);
	}

	@Override
	public void updateFlight(Flight flight) {
		fr.save(flight);
		
	}

	@Override
	public void updateFlightDetails(Flight_Details fd) {
		fdr.save(fd);
		
	}

	@Override
	public void deleteFlight(Flight flight) {
		fr.delete(flight);
		
	}

	@Override
	public void deleteFlightDetails(Flight_Details fd) {
		fdr.delete(fd);
	}

}
