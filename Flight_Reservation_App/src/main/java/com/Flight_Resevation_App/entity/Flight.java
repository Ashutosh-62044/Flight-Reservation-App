package com.Flight_Resevation_App.entity;

import javax.persistence.Entity;

import javax.persistence.Column;
import javax.persistence.Table;

import com.itextpdf.text.pdf.PdfPCell;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "FLIGHT")
public class Flight extends AbstractEntity{
   
    @Column(name = "FLIGHT_NUMBER", length = 20)
    private String flightNumber;

    @Column(name = "OPERATING_AIRLINES", length = 20)
    private String operatingAirlines;

    @Column(name = "DEPARTURE_CITY", length = 20)
    private String departureCity;

    @Column(name = "ARRIVAL_CITY", length = 20)
    private String arrivalCity;

    @Column(name = "DATE_OF_DEPARTURE")
    private Date dateOfDeparture;

    @Column(name = "ESTIMATED_DEPARTURE_TIME")
    private Timestamp estimatedDepartureTime;

	

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOperatingAirlines() {
		return operatingAirlines;
	}

	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public Timestamp getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}

	public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}
    

    
}