package com.exxeta.omni_potentials.songguesserdata;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
	
	private List<Event> events;
	private final EventRepository repository;
	
	public EventController(EventRepository repository) {
		events = new ArrayList<Event>();
		this.repository = repository;
		List<Event> list = repository.findAll();
		if(!list.isEmpty()) {
			events.addAll(list);
		}
	}
	
	
	
	@GetMapping("/teamevents/events")
	public List<Event> getAllEvents(){
		return events;
	}
	
	private boolean add = true;
	
	@PostMapping("/teamevents/events")
	public void createNewEvent(String eventName, String eventDayStart, String eventStart, String eventDayEnd, String eventEnd) {
		DateTimeFormatter parser1 = DateTimeFormatter.ofPattern("yyyy MM dd");
		LocalDate eventDayStart1 = LocalDate.parse(eventDayStart,parser1);
		DateTimeFormatter parser2 = DateTimeFormatter.ofPattern("H:mm:ss");
		LocalTime eventStart1 = LocalTime.parse(eventStart,parser2);
		DateTimeFormatter parser3 = DateTimeFormatter.ofPattern("yyyy MM dd");
		LocalDate eventDayEnd1 = LocalDate.parse(eventDayEnd,parser3);
		DateTimeFormatter parser4 = DateTimeFormatter.ofPattern("H:mm:ss");
		LocalTime eventEnd1 = LocalTime.parse(eventEnd,parser4);
		Event newEvent = new Event( eventName , eventDayStart1, eventStart1, eventDayEnd1, eventEnd1 );
		for(int i = 0 ; i < events.size(); i++) {
			if( eventName.equals(events.get(i).getname())) {
				add = false;
			}	
		}
		
		if(add == true) {
			events.add(newEvent);
			repository.save(newEvent);
		}
	}
	
	
}
	

