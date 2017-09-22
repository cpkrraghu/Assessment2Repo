package com.raghu.flightrepo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
@Entity
@Table(name="flight_details")
@IdClass(EmbeddedFlightId.class)
public class Flight_Details implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7309919656771998688L;
	
	
	/*@EmbeddedId
	private EmbeddedFlightId id;*/
	@Id
	private int flightId;
	@Id
	private Date flightDepartureDate;
	
	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public Date getFlightDepartureDate() {
		return flightDepartureDate;
	}

	public void setFlightDepartureDate(Date flightDepartureDate) {
		this.flightDepartureDate = flightDepartureDate;
	}
	private float price;
	private int available_seats;
	public Flight_Details(){}
	/*public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}*/
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getAvailable_seats() {
		return available_seats;
	}
	public void setAvailable_seats(int available_seats) {
		this.available_seats = available_seats;
	}
	
	
	
}
/*@Id
@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="flight_id",referencedColumnName="flight_id")
private Flight flight;*/
/*@Id
@GeneratedValue(generator="gen")
@GenericGenerator(name = "gen", strategy = "foreign", parameters = @Parameter(name = "property", value = "flight"))
private int flight_id;

public int getFlight_id() {
	return flight_id;
}
public void setFlight_id(int flight_id) {
	this.flight_id = flight_id;
}
public Date getDeparture_date() {
	return departure_date;
}
public void setDeparture_date(Date departure_date) {
	this.departure_date = departure_date;
}
@Id
private Date departure_date;
*/
