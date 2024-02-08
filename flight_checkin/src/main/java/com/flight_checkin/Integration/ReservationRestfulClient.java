package com.flight_checkin.Integration;

import org.springframework.stereotype.Component;

import com.flight_checkin.Integration.dto.Reservation;
import com.flight_checkin.Integration.dto.ReservationUpdateRequest;

@Component
public interface ReservationRestfulClient {
 
	public Reservation findReservation(Long id);

	public Reservation UpadteReservation(ReservationUpdateRequest request);

	
}
