package com.Flight_Resevation_App.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Flight_Resevation_App.Service.ReservationService;
import com.Flight_Resevation_App.dto.ReservationRequest;
import com.Flight_Resevation_App.entity.Reservation;

@Controller
public class ReservationController {
    
	@Autowired
	private ReservationService reservationservice;
	
	
	@RequestMapping("/confirmReservation")
	public String confirmReservation(ReservationRequest request , ModelMap modelMap) {
		Reservation reservationId = reservationservice.bookFlight(request);
		modelMap.addAttribute("reservationId", reservationId.getId());
		return "confirmReservationpage";
	}
}
