package com.flight_checkin.Integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.flight_checkin.Integration.dto.Reservation;
import com.flight_checkin.Integration.dto.ReservationUpdateRequest;

@Component
public class ReservationRestfulClientImpl implements ReservationRestfulClient {
   
	
	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject("http://localhost:8080/flightapp/reservation/"+id, Reservation.class);
		return reservation;
	}

	@Override
	public Reservation UpadteReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation postForObject = restTemplate.postForObject("http://localhost:8080/flightapp/updatereservation", request, Reservation.class);
		
		return postForObject;
		
	}

}
