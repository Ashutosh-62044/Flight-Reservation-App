package com.flight_checkin.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight_checkin.Integration.ReservationRestfulClient;
import com.flight_checkin.Integration.dto.Reservation;
import com.flight_checkin.Integration.dto.ReservationUpdateRequest;

@Controller
public class ReservationController {
 
	@Autowired
	private ReservationRestfulClient  restClient;
	
	@RequestMapping("/showCheckIn")
	public String showCheckIn() {
		return "startCheckin";
		
	}
	
	@RequestMapping("/proceedCheckIn")
	public String proceedCheckIn(@RequestParam("id") long id , ModelMap modelMap) {
		     Reservation reservation = restClient.findReservation(id);
		     modelMap.addAttribute("reservation", reservation);
		    return "displayRegistration";
		
	}
	
	@RequestMapping("/checkinconfirm")
	public String checkingConfirm(@RequestParam("id") Long id , @RequestParam("numberOfBags") int numberOfBags ) {
		ReservationUpdateRequest request = new ReservationUpdateRequest();
		request.setId(id);
		request.setCheckedIn(true);
		request.setNumberOfBags(numberOfBags);
		restClient.UpadteReservation(request);
		return "confirmReservation";
		
	}
}
