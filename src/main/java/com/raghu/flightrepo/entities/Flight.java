package com.raghu.flightrepo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="flight")
public class Flight implements Serializable{
	private static final long serialVersionUID = -3527202373622448198L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int flight_id;
	private int airline_id;
	private String airline_name;
	private String from_location;
	private String to_location;
	@Temporal(TemporalType.TIMESTAMP)
	private Date departure_time;
	@Temporal(TemporalType.TIMESTAMP)
	private Date arrival_time;
	private String duration;
	private int total_seats;
	
	public Flight(){}
	public int getFlight_id() {
		return flight_id;
	}
	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}
	public int getAirline_id() {
		return airline_id;
	}
	public void setAirline_id(int airline_id) {
		this.airline_id = airline_id;
	}
	public String getAirline_name() {
		return airline_name;
	}
	public void setAirline_name(String airline_name) {
		this.airline_name = airline_name;
	}
	public String getFrom_location() {
		return from_location;
	}
	public void setFrom_location(String from_location) {
		this.from_location = from_location;
	}
	public String getTo_location() {
		return to_location;
	}
	public void setTo_location(String to_location) {
		this.to_location = to_location;
	}
	public Date getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(Date departure_time) {
		this.departure_time = departure_time;
	}
	public Date getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(Date arrival_time) {
		this.arrival_time = arrival_time;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getTotal_seats() {
		return total_seats;
	}
	public void setTotal_seats(int total_seats) {
		this.total_seats = total_seats;
	}
	

}
