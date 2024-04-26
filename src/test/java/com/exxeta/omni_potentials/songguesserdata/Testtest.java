package com.exxeta.omni_potentials.songguesserdata;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Testtest {

	@Test
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
	
		assertEquals(true, isGuessBeforeSongEnd(songs, guesses, 0, 0));
		assertEquals(true, isGuessAfterSongStart(songs, guesses, 0, 0));
	
	}
	private boolean isGuessBeforeSongEnd(List<Song> songs, List<Guess> guesses, int i, int e) {
		System.out.println(songs.size());
		return guesses.get(e).getTimestamp().toLocalTime().isBefore(songs.get(i).getStart().plusSeconds(songs.get(i).getDuration()));
	}
	private boolean isGuessAfterSongStart(List<Song> songs, List<Guess> guesses, int i, int e) {
		return guesses.get(e).getTimestamp().getSecond() >= songs.get(i).getStart().getSecond();
	}
	
}


