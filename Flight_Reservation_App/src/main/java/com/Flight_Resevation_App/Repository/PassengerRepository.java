package com.Flight_Resevation_App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight_Resevation_App.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
