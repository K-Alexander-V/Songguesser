package com.exxeta.omni_potentials.songguesserdata;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongController {
	
	private List<Song> songs;
	private final SongRepository repository;
	private final EventRepository eventrepository;
	
	// aus Datenbank laden
	public SongController(SongRepository repository, EventRepository eventrepository) {
		songs = new ArrayList<Song>();
		this.repository = repository;
		this.eventrepository = eventrepository;
		List<Song> list = repository.findAll(); 
		if(!list.isEmpty()) {
			songs.addAll(list);
		}
	}
	
	




	@GetMapping("/teamsongs/songs")
	public List<Song> getAllSongs(){
		return songs;
	}
	
	
	@PostMapping("/teamsongs/songs")
	public void createNewSong(String eventName, String start, String duration, String songName, String submitter) {
		// umwandeln der Strings
		DateTimeFormatter parser = DateTimeFormatter.ofPattern("H:mm:ss");
		LocalTime start1 = LocalTime.parse(start,parser);
		
		int durationInSec = Integer.parseInt(duration);
		
		Event loadedevent = eventrepository.findById(eventName).get();
		Song newSong = new Song( loadedevent, start1,  durationInSec, songName, new Person(submitter));
		songs.add(newSong);
		repository.save(newSong);
	}







	
}
