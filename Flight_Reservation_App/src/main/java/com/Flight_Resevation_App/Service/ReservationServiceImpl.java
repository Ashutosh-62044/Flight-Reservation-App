package com.Flight_Resevation_App.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Flight_Resevation_App.Repository.FlightRepository;
import com.Flight_Resevation_App.Repository.PassengerRepository;
import com.Flight_Resevation_App.Repository.ReservationRepository;
import com.Flight_Resevation_App.dto.ReservationRequest;
import com.Flight_Resevation_App.entity.Flight;
import com.Flight_Resevation_App.entity.Passenger;
import com.Flight_Resevation_App.entity.Reservation;
import com.Flight_Resevation_App.utilities.EmailUtil;
import com.Flight_Resevation_App.utilities.PDFgenerator;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private PassengerRepository passengerRepo;
	
	@Autowired
	private FlightRepository flightRepo;
	
	@Autowired
	private PDFgenerator pdfgenerator;
	
	@Autowired
	private EmailUtil emailUtil;
	
	@Autowired
	private ReservationRepository reservationRepo;
	
	@Override
	public Reservation bookFlight(ReservationRequest request) {
		  

		  // Get Passenger details... 
		   Passenger passenger = new Passenger();
		   passenger.setFirstName(request.getFirstName());
		   passenger.setLastName(request.getLastname());
		   passenger.setMiddleName(request.getMiddleName());
		   passenger.setEmail(request.getEmail());
		   passenger.setPhone(request.getPhone());
		   passengerRepo.save(passenger);
		   
		  // Find flight details. 
		   long flightId = request.getFlightId();
		   Optional<Flight> findById = flightRepo.findById(flightId);
		   Flight flight = findById.get();
		   
		   // checkin process
		  Reservation reservation = new Reservation();
		  reservation.setFlight(flight);
		  reservation.setPassenger(passenger);
		  reservation.setCheckedIn(false);
		  reservation.setNumberOfBags(0);
		 
		  //pdf path file 
		  String filePath ="C:\\sts-11july-code\\Flight_Reservation_App\\Tickets\\reservation"+reservation.getId()+".pdf";
		  reservationRepo.save(reservation);
		   
		  pdfgenerator.generateItinerary(reservation, filePath);
		  
		  emailUtil.sendItinerary(passenger.getEmail() , filePath);
		return reservation;
	}

}
