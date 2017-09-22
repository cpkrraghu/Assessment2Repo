package com.raghu.flightrepo.dao;

import org.springframework.data.repository.CrudRepository;

import com.raghu.flightrepo.entities.Flight;

public interface FlightRepo extends CrudRepository<Flight, Integer> {

}
