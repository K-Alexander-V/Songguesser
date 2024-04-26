package com.exxeta.omni_potentials.songguesserdata;



import java.time.LocalDateTime;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;






@Entity
public class Guess  {
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE			)
	private long id;
		
	@ManyToOne
	private  Person guesser;

	@ManyToOne
	private  Person submitter;

	private  String favor;
	private  LocalDateTime timestamp;

	protected Guess() {
		
	}
	public Guess(Person guesser, Person submitter, String favor) {
		this.guesser = guesser;
		this.submitter = submitter;
		this.favor = favor;
		timestamp = LocalDateTime.now();
	}

	public Person getGuesser() {
		return guesser;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public Person getSubmitter() {
		return submitter;
	}
	
	public String getFavor() {
		return favor;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	
}
