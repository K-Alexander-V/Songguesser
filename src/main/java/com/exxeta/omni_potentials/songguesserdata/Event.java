package com.exxeta.omni_potentials.songguesserdata;





import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;







@Entity
public class Event  {
	
	
	
	@Id
	private  String eventName;
	private  LocalDate eventDayStart;
	private  LocalTime eventStart;
	private  LocalDate eventDayEnd;
	private  LocalTime eventEnd;

	protected Event() {
		
	}
	
	public Event (String eventName, LocalDate eventDayStart, LocalTime eventStart, LocalDate eventDayEnd,  LocalTime eventEnd) {
		this.eventName = eventName;
		this.eventDayStart = eventDayStart;
		this.eventStart = eventStart;
		this.eventDayEnd = eventDayEnd;
		this.eventEnd = eventEnd;
	}

	public String getname() {
		return eventName;
	}

	public LocalDate getDayStart() {
		return eventDayStart;
	}
	
	public LocalTime getStart() {
		return eventStart;
	}
	
	public LocalDate getDayEnd() {
		return eventDayEnd;
	}
	
	public LocalTime getEnd() {
		return eventEnd;
	}

	
}
