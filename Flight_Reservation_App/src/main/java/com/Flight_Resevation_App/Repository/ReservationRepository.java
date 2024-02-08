package com.Flight_Resevation_App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight_Resevation_App.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
