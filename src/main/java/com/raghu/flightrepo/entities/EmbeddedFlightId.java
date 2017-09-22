package com.raghu.flightrepo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Id;

public class EmbeddedFlightId implements Serializable{

	private int flightId;
	private Date flightDepartureDate;
	
}
