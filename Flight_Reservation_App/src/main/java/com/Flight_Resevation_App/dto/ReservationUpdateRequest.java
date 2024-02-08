package com.Flight_Resevation_App.dto;

public class ReservationUpdateRequest {

	
	   
	    private long id;

	    
	    private boolean checkedIn;

	    
	    private int numberOfBags;

   
	
	public boolean isCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public int getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	}	
	
	

