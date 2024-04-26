package com.exxeta.omni_potentials.songguesserdata;




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
