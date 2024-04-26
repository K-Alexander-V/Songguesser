package com.exxeta.omni_potentials.songguesserdata;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

class Test {

	@org.junit.jupiter.api.Test
	void test() {	
		Person submitter4 = new Person("Hannah Freter");
		Person submitter5 = new Person("Wer Auch Immer");

		LocalDate eventDate = LocalDate.of(2024, 5, 20);
		LocalTime eventTimeStart = LocalTime.of(17, 0);
		LocalTime eventTimeEnd = LocalTime.of(17, 0);
		Event event = new Event("Teamabend Mai", eventDate, eventTimeStart, eventDate, eventTimeEnd);
		LocalTime eventTime = eventTimeStart;
		
		Song song25 = new Song(event, eventTime, 240, "Song25", submitter5);
		eventTime.plusSeconds(240);
		Song song24 = new Song(event, eventTime, 240, "Song24", submitter5);
		eventTime.plusSeconds(240);
		
		List<Song> songs = new ArrayList<Song>();
		songs.add(song25);
		songs.add(song24);
		
		Guess guessSong25Submitter5 = new Guess(submitter5, submitter4, "okay");
		LocalDateTime guessTime74 = LocalDateTime.of(eventDate, song25.getStart().plusSeconds(120));
		guessSong25Submitter5.setTimestamp(guessTime74 );
		Guess guessSong24Submitter5 = new Guess(submitter5, submitter4, "okay");
		LocalDateTime guessTime75 = LocalDateTime.of(eventDate, song24.getStart().plusSeconds(120));
		guessSong24Submitter5.setTimestamp(guessTime75 );
		
		List<Guess> guesses = new ArrayList<Guess>();
		guesses.add(guessSong25Submitter5);
		guesses.add(guessSong24Submitter5);
	}
	public List<GuessResult> createNewResult(List<Song> songs, List<Guess> guesses) {
		List<GuessResult> counts = new ArrayList<GuessResult>();
		//Schleife um guesses
		for(int e = 0; e < guesses.size(); e++) {
			//hier sollen die dann counts hinzugefügt werden 
			GuessResult result = new GuessResult(guesses.get(e).getGuesser());
			if(isAlreadyInList(counts, result))
			counts.add(result); 
		}
		return counts;
	}
	
	private boolean isAlreadyInList(List<GuessResult> counts, GuessResult result) {
		//Schleife für counts
		for(int i = 0; i < counts.size(); i++) {
			if(counts.get(i).getGuesser().getName1().equals(result.getGuesser().getName1())) {
			return true; 
			}
		}
		return false;
		
	}
}
