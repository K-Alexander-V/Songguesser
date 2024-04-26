package com.exxeta.omni_potentials.songguesserdata;





import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;



public class GuessResult {
	
	
	


	private Person guesser;
	
	private int points = 0;
	
	public GuessResult( Person guesser) {
		super();
		this.guesser = guesser;
	}
	
	
	public void increasePoints() {
		points++;
	}


	public Person getGuesser() {
		return guesser;
	}


	public int getPoints() {
		return points;
	}
	
	
	


	
	
}
