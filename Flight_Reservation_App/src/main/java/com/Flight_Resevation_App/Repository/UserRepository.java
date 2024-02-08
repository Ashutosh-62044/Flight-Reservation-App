package com.Flight_Resevation_App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight_Resevation_App.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

	User findByEmail(String email);

	  
}
