package com.exxeta.omni_potentials.songguesserdata;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Song {
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE			)
	private long id;
	
	@ManyToOne
	private  Event newEvent;
	
	private  LocalTime start;
	private  int durationInSec;
	private  String songName;
	
	@ManyToOne
	private  Person submitter;
	

	protected Song() {
		
	}
	
	public Song (Event newEvent, LocalTime start,  int durationInSec, String songName, Person submitter) {
		this.durationInSec = durationInSec;
		this.start = start;
		this.songName = songName;
		this.submitter = submitter;
		this.newEvent = newEvent;
	}
	
	public Event getEvent() {
		return newEvent;
	}

	public LocalTime getStart() {
		return start;
	}
	
	public int getDuration() {
		return durationInSec;
	}

	public String getName() {
		return songName;
	}
	
	public Person getSubmitter() {
		return submitter;
	}

}
