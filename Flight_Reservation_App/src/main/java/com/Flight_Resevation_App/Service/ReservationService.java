package com.Flight_Resevation_App.Service;

import org.springframework.stereotype.Service;

import com.Flight_Resevation_App.dto.ReservationRequest;
import com.Flight_Resevation_App.entity.Reservation;

@Service
public interface ReservationService {

	Reservation bookFlight(ReservationRequest request);
    
	
}
