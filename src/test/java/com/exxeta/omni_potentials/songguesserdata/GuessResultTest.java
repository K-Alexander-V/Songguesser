package com.exxeta.omni_potentials.songguesserdata;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class GuessResultTest {

	@Test
	void test() {
		Person submitter1 = new Person("Kilian Voigt");
		Person submitter2 = new Person("Ilona Breidt");
		Person submitter3 = new Person("Louis Roth");
		Person submitter4 = new Person("Hannah Freter");
		Person submitter5 = new Person("Wer Auch Immer");

		LocalDate eventDate = LocalDate.of(2024, 5, 20);
		LocalTime eventTimeStart = LocalTime.of(17, 0);
		LocalTime eventTimeEnd = LocalTime.of(17, 0);
		Event event = new Event("Teamabend Mai", eventDate, eventTimeStart, eventDate, eventTimeEnd);

		LocalTime eventTime = eventTimeStart;
		Song song11 = new Song(event, eventTime, 240, "Song11", submitter1);
		eventTime.plusSeconds(240);
		
		Song song12 = new Song(event, eventTime, 240, "Song12", submitter1);
		eventTime.plusSeconds(240);
		
		Song song13 = new Song(event, eventTime, 240, "Song13", submitter1);
		eventTime.plusSeconds(240);
		
		Song song14 = new Song(event, eventTime, 240, "Song14", submitter2);
		eventTime.plusSeconds(240);
		
		Song song15 = new Song(event, eventTime, 240, "Song15", submitter2);
		eventTime.plusSeconds(240);
		
		Song song16 = new Song(event, eventTime, 240, "Song16", submitter2);
		eventTime.plusSeconds(240);
		
		Song song17 = new Song(event, eventTime, 240, "Song17", submitter3);
		eventTime.plusSeconds(240);
		
		Song song18 = new Song(event, eventTime, 240, "Song18", submitter3);
		eventTime.plusSeconds(240);
		
		Song song19 = new Song(event, eventTime, 240, "Song19", submitter3);
		eventTime.plusSeconds(240);
		
		Song song20 = new Song(event, eventTime, 240, "Song20", submitter4);
		eventTime.plusSeconds(240);
		
		Song song21 = new Song(event, eventTime, 240, "Song21", submitter4);
		eventTime.plusSeconds(240);
		
		Song song22 = new Song(event, eventTime, 240, "Song22", submitter4);
		eventTime.plusSeconds(240);
		
		Song song23 = new Song(event, eventTime, 240, "Song23", submitter5);
		eventTime.plusSeconds(240);
		
		Song song24 = new Song(event, eventTime, 240, "Song24", submitter5);
		eventTime.plusSeconds(240);
		
		Song song25 = new Song(event, eventTime, 240, "Song25", submitter5);
		eventTime.plusSeconds(240);
		//und so weiter
		
		List<Song> songs = new ArrayList<Song>();
		songs.add(song11);
		songs.add(song12);
		songs.add(song13);
		songs.add(song14);
		songs.add(song15);
		songs.add(song16);
		songs.add(song17);
		songs.add(song18);
		songs.add(song19);
		songs.add(song20);
		songs.add(song21);
		songs.add(song22);
		songs.add(song23);
		songs.add(song24);
		songs.add(song25);
		
		//und so weiter
			
		
		
		Guess guessSong11Submitter1 = new Guess(submitter1, submitter1, "sehr gut");
		LocalDateTime guessTime = LocalDateTime.of(eventDate, song11.getStart().plusSeconds(120));
		guessSong11Submitter1.setTimestamp(guessTime );
		Guess guessSong11Submitter2 = new Guess(submitter2, submitter4, "sehr gut");
		LocalDateTime guessTime1 = LocalDateTime.of(eventDate, song11.getStart().plusSeconds(120));
		guessSong11Submitter2.setTimestamp(guessTime1 );
		Guess guessSong11Submitter3 = new Guess(submitter3, submitter3, "okay");
		LocalDateTime guessTime2 = LocalDateTime.of(eventDate, song11.getStart().plusSeconds(120));
		guessSong11Submitter3.setTimestamp(guessTime2 );
		Guess guessSong11Submitter4 = new Guess(submitter4, submitter4, "sehr gut");
		LocalDateTime guessTime3 = LocalDateTime.of(eventDate, song11.getStart().plusSeconds(120));
		guessSong11Submitter4.setTimestamp(guessTime3 );
		Guess guessSong11Submitter5 = new Guess(submitter5, submitter3, "okay");
		LocalDateTime guessTime4 = LocalDateTime.of(eventDate, song11.getStart().plusSeconds(120));
		guessSong11Submitter5.setTimestamp(guessTime4 );
		
		Guess guessSong12Submitter1 = new Guess(submitter1, submitter1, "sehr gut");
		LocalDateTime guessTime5 = LocalDateTime.of(eventDate, song12.getStart().plusSeconds(120));
		guessSong12Submitter1.setTimestamp(guessTime5 );
		Guess guessSong12Submitter2 = new Guess(submitter2, submitter4, "sehr gut");
		LocalDateTime guessTime6 = LocalDateTime.of(eventDate, song12.getStart().plusSeconds(120));
		guessSong12Submitter2.setTimestamp(guessTime6 );
		Guess guessSong12Submitter3 = new Guess(submitter3, submitter3, "okay");
		LocalDateTime guessTime7 = LocalDateTime.of(eventDate, song12.getStart().plusSeconds(120));
		guessSong12Submitter3.setTimestamp(guessTime7 );
		Guess guessSong12Submitter4 = new Guess(submitter4, submitter2, "sehr gut");
		LocalDateTime guessTime8 = LocalDateTime.of(eventDate, song12.getStart().plusSeconds(120));
		guessSong12Submitter4.setTimestamp(guessTime8 );
		Guess guessSong12Submitter5 = new Guess(submitter5, submitter3, "okay");
		LocalDateTime guessTime9 = LocalDateTime.of(eventDate, song12.getStart().plusSeconds(120));
		guessSong12Submitter5.setTimestamp(guessTime9 );
		
		Guess guessSong13Submitter1 = new Guess(submitter1, submitter1, "sehr gut");
		LocalDateTime guessTime10 = LocalDateTime.of(eventDate, song13.getStart().plusSeconds(120));
		guessSong13Submitter1.setTimestamp(guessTime10 );
		Guess guessSong13Submitter2 = new Guess(submitter2, submitter4, "sehr gut");
		LocalDateTime guessTime11 = LocalDateTime.of(eventDate, song13.getStart().plusSeconds(120));
		guessSong13Submitter2.setTimestamp(guessTime11 );
		Guess guessSong13Submitter3 = new Guess(submitter3, submitter3, "okay");
		LocalDateTime guessTime12 = LocalDateTime.of(eventDate, song13.getStart().plusSeconds(120));
		guessSong13Submitter3.setTimestamp(guessTime12 );
		Guess guessSong13Submitter4 = new Guess(submitter4, submitter2, "sehr gut");
		LocalDateTime guessTime13 = LocalDateTime.of(eventDate, song13.getStart().plusSeconds(120));
		guessSong13Submitter4.setTimestamp(guessTime13 );
		Guess guessSong13Submitter5 = new Guess(submitter5, submitter3, "okay");
		LocalDateTime guessTime14 = LocalDateTime.of(eventDate, song13.getStart().plusSeconds(120));
		guessSong13Submitter5.setTimestamp(guessTime14 );
		
		Guess guessSong14Submitter1 = new Guess(submitter1, submitter1, "sehr gut");
		LocalDateTime guessTime15 = LocalDateTime.of(eventDate, song14.getStart().plusSeconds(120));
		guessSong14Submitter1.setTimestamp(guessTime15 );
		Guess guessSong14Submitter2 = new Guess(submitter2, submitter4, "sehr gut");
		LocalDateTime guessTime16 = LocalDateTime.of(eventDate, song14.getStart().plusSeconds(120));
		guessSong14Submitter2.setTimestamp(guessTime16 );
		Guess guessSong14Submitter3 = new Guess(submitter3, submitter3, "okay");
		LocalDateTime guessTime17 = LocalDateTime.of(eventDate, song14.getStart().plusSeconds(120));
		guessSong14Submitter3.setTimestamp(guessTime17 );
		Guess guessSong14Submitter4 = new Guess(submitter4, submitter2, "sehr gut");
		LocalDateTime guessTime18 = LocalDateTime.of(eventDate, song14.getStart().plusSeconds(120));
		guessSong14Submitter4.setTimestamp(guessTime18 );
		Guess guessSong14Submitter5 = new Guess(submitter5, submitter3, "okay");
		LocalDateTime guessTime19 = LocalDateTime.of(eventDate, song14.getStart().plusSeconds(120));
		guessSong14Submitter5.setTimestamp(guessTime19 );
		
		Guess guessSong15Submitter1 = new Guess(submitter1, submitter1, "sehr gut");
		LocalDateTime guessTime20 = LocalDateTime.of(eventDate, song15.getStart().plusSeconds(120));
		guessSong15Submitter1.setTimestamp(guessTime20 );
		Guess guessSong15Submitter2 = new Guess(submitter2, submitter4, "sehr gut");
		LocalDateTime guessTime21 = LocalDateTime.of(eventDate, song15.getStart().plusSeconds(120));
		guessSong15Submitter2.setTimestamp(guessTime21 );
		Guess guessSong15Submitter3 = new Guess(submitter3, submitter3, "okay");
		LocalDateTime guessTime22 = LocalDateTime.of(eventDate, song15.getStart().plusSeconds(120));
		guessSong15Submitter3.setTimestamp(guessTime22 );
		Guess guessSong15Submitter4 = new Guess(submitter4, submitter2, "sehr gut");
		LocalDateTime guessTime23 = LocalDateTime.of(eventDate, song15.getStart().plusSeconds(120));
		guessSong15Submitter4.setTimestamp(guessTime23 );
		Guess guessSong15Submitter5 = new Guess(submitter5, submitter3, "okay");
		LocalDateTime guessTime24 = LocalDateTime.of(eventDate, song15.getStart().plusSeconds(120));
		guessSong15Submitter5.setTimestamp(guessTime24 );
		
		Guess guessSong16Submitter1 = new Guess(submitter1, submitter1, "sehr gut");
		LocalDateTime guessTime25 = LocalDateTime.of(eventDate, song16.getStart().plusSeconds(120));
		guessSong16Submitter1.setTimestamp(guessTime25 );
		Guess guessSong16Submitter2 = new Guess(submitter2, submitter4, "sehr gut");
		LocalDateTime guessTime26 = LocalDateTime.of(eventDate, song16.getStart().plusSeconds(120));
		guessSong16Submitter2.setTimestamp(guessTime26 );
		Guess guessSong16Submitter3 = new Guess(submitter3, submitter3, "okay");
		LocalDateTime guessTime27 = LocalDateTime.of(eventDate, song16.getStart().plusSeconds(120));
		guessSong16Submitter3.setTimestamp(guessTime27 );
		Guess guessSong16Submitter4 = new Guess(submitter4, submitter2, "sehr gut");
		LocalDateTime guessTime28 = LocalDateTime.of(eventDate, song16.getStart().plusSeconds(120));
		guessSong16Submitter4.setTimestamp(guessTime28 );
		Guess guessSong16Submitter5 = new Guess(submitter5, submitter3, "okay");
		LocalDateTime guessTime29 = LocalDateTime.of(eventDate, song16.getStart().plusSeconds(120));
		guessSong16Submitter5.setTimestamp(guessTime29 );
		
		Guess guessSong17Submitter1 = new Guess(submitter1, submitter1, "sehr gut");
		LocalDateTime guessTime30 = LocalDateTime.of(eventDate, song17.getStart().plusSeconds(120));
		guessSong17Submitter1.setTimestamp(guessTime30 );
		Guess guessSong17Submitter2 = new Guess(submitter2, submitter4, "sehr gut");
		LocalDateTime guessTime31 = LocalDateTime.of(eventDate, song17.getStart().plusSeconds(120));
		guessSong17Submitter2.setTimestamp(guessTime31 );
		Guess guessSong17Submitter3 = new Guess(submitter3, submitter3, "okay");
		LocalDateTime guessTime32 = LocalDateTime.of(eventDate, song17.getStart().plusSeconds(120));
		guessSong17Submitter3.setTimestamp(guessTime32 );
		Guess guessSong17Submitter4 = new Guess(submitter4, submitter2, "sehr gut");
		LocalDateTime guessTime33 = LocalDateTime.of(eventDate, song17.getStart().plusSeconds(120));
		guessSong17Submitter4.setTimestamp(guessTime33 );
		Guess guessSong17Submitter5 = new Guess(submitter5, submitter3, "okay");
		LocalDateTime guessTime34 = LocalDateTime.of(eventDate, song17.getStart().plusSeconds(120));
		guessSong17Submitter5.setTimestamp(guessTime34 );
		
		Guess guessSong18Submitter1 = new Guess(submitter1, submitter1, "sehr gut");
		LocalDateTime guessTime35 = LocalDateTime.of(eventDate, song18.getStart().plusSeconds(120));
		guessSong18Submitter1.setTimestamp(guessTime35 );
		Guess guessSong18Submitter2 = new Guess(submitter2, submitter4, "sehr gut");
		LocalDateTime guessTime36 = LocalDateTime.of(eventDate, song18.getStart().plusSeconds(120));
		guessSong18Submitter2.setTimestamp(guessTime36 );
		Guess guessSong18Submitter3 = new Guess(submitter3, submitter3, "okay");
		LocalDateTime guessTime37 = LocalDateTime.of(eventDate, song18.getStart().plusSeconds(120));
		guessSong18Submitter3.setTimestamp(guessTime37 );
		Guess guessSong18Submitter4 = new Guess(submitter4, submitter2, "sehr gut");
		LocalDateTime guessTime38 = LocalDateTime.of(eventDate, song18.getStart().plusSeconds(120));
		guessSong18Submitter4.setTimestamp(guessTime38 );
		Guess guessSong18Submitter5 = new Guess(submitter5, submitter3, "okay");
		LocalDateTime guessTime39 = LocalDateTime.of(eventDate, song18.getStart().plusSeconds(120));
		guessSong18Submitter5.setTimestamp(guessTime39 );
		
		Guess guessSong19Submitter1 = new Guess(submitter1, submitter1, "sehr gut");
		LocalDateTime guessTime40 = LocalDateTime.of(eventDate, song19.getStart().plusSeconds(120));
		guessSong19Submitter1.setTimestamp(guessTime40 );
		Guess guessSong19Submitter2 = new Guess(submitter2, submitter4, "sehr gut");
		LocalDateTime guessTime41 = LocalDateTime.of(eventDate, song19.getStart().plusSeconds(120));
		guessSong19Submitter2.setTimestamp(guessTime41 );
		Guess guessSong19Submitter3 = new Guess(submitter3, submitter3, "okay");
		LocalDateTime guessTime42 = LocalDateTime.of(eventDate, song19.getStart().plusSeconds(120));
		guessSong19Submitter3.setTimestamp(guessTime42 );
		Guess guessSong19Submitter4 = new Guess(submitter4, submitter2, "sehr gut");
		LocalDateTime guessTime43 = LocalDateTime.of(eventDate, song19.getStart().plusSeconds(120));
		guessSong19Submitter4.setTimestamp(guessTime43 );
		Guess guessSong19Submitter5 = new Guess(submitter5, submitter3, "okay");
		LocalDateTime guessTime44 = LocalDateTime.of(eventDate, song19.getStart().plusSeconds(120));
		guessSong19Submitter5.setTimestamp(guessTime44 );
		
		Guess guessSong20Submitter1 = new Guess(submitter1, submitter1, "sehr gut");
		LocalDateTime guessTime45 = LocalDateTime.of(eventDate, song20.getStart().plusSeconds(120));
		guessSong20Submitter1.setTimestamp(guessTime45 );
		Guess guessSong20Submitter2 = new Guess(submitter2, submitter4, "sehr gut");
		LocalDateTime guessTime46 = LocalDateTime.of(eventDate, song20.getStart().plusSeconds(120));
		guessSong20Submitter2.setTimestamp(guessTime46 );
		Guess guessSong20Submitter3 = new Guess(submitter3, submitter3, "okay");
		LocalDateTime guessTime47 = LocalDateTime.of(eventDate, song20.getStart().plusSeconds(120));
		guessSong20Submitter3.setTimestamp(guessTime47 );
		Guess guessSong20Submitter4 = new Guess(submitter4, submitter2, "sehr gut");
		LocalDateTime guessTime48 = LocalDateTime.of(eventDate, song20.getStart().plusSeconds(120));
		guessSong20Submitter4.setTimestamp(guessTime48 );
		Guess guessSong20Submitter5 = new Guess(submitter5, submitter3, "okay");
		LocalDateTime guessTime49 = LocalDateTime.of(eventDate, song20.getStart().plusSeconds(120));
		guessSong20Submitter5.setTimestamp(guessTime49 );
		
		Guess guessSong21Submitter1 = new Guess(submitter1, submitter1, "sehr gut");
		LocalDateTime guessTime50 = LocalDateTime.of(eventDate, song21.getStart().plusSeconds(120));
		guessSong21Submitter1.setTimestamp(guessTime50 );
		Guess guessSong21Submitter2 = new Guess(submitter2, submitter4, "sehr gut");
		LocalDateTime guessTime51 = LocalDateTime.of(eventDate, song21.getStart().plusSeconds(120));
		guessSong21Submitter2.setTimestamp(guessTime51 );
		Guess guessSong21Submitter3 = new Guess(submitter3, submitter3, "okay");
		LocalDateTime guessTime52 = LocalDateTime.of(eventDate, song21.getStart().plusSeconds(120));
		guessSong21Submitter3.setTimestamp(guessTime52 );
		Guess guessSong21Submitter4 = new Guess(submitter4, submitter2, "sehr gut");
		LocalDateTime guessTime53 = LocalDateTime.of(eventDate, song21.getStart().plusSeconds(120));
		guessSong21Submitter4.setTimestamp(guessTime53 );
		Guess guessSong21Submitter5 = new Guess(submitter5, submitter3, "okay");
		LocalDateTime guessTime54 = LocalDateTime.of(eventDate, song21.getStart().plusSeconds(120));
		guessSong21Submitter5.setTimestamp(guessTime54 );
		
		Guess guessSong22Submitter1 = new Guess(submitter1, submitter1, "sehr gut");
		LocalDateTime guessTime55 = LocalDateTime.of(eventDate, song22.getStart().plusSeconds(120));
		guessSong22Submitter1.setTimestamp(guessTime55 );
		Guess guessSong22Submitter2 = new Guess(submitter2, submitter4, "sehr gut");
		LocalDateTime guessTime56 = LocalDateTime.of(eventDate, song22.getStart().plusSeconds(120));
		guessSong22Submitter2.setTimestamp(guessTime56 );
		Guess guessSong22Submitter3 = new Guess(submitter3, submitter3, "okay");
		LocalDateTime guessTime57 = LocalDateTime.of(eventDate, song22.getStart().plusSeconds(120));
		guessSong22Submitter3.setTimestamp(guessTime57 );
		Guess guessSong22Submitter4 = new Guess(submitter4, submitter2, "sehr gut");
		LocalDateTime guessTime58 = LocalDateTime.of(eventDate, song22.getStart().plusSeconds(120));
		guessSong22Submitter4.setTimestamp(guessTime58 );
		Guess guessSong22Submitter5 = new Guess(submitter5, submitter3, "okay");
		LocalDateTime guessTime59 = LocalDateTime.of(eventDate, song22.getStart().plusSeconds(120));
		guessSong22Submitter5.setTimestamp(guessTime59 );
		
		Guess guessSong23Submitter1 = new Guess(submitter1, submitter1, "sehr gut");
		LocalDateTime guessTime60 = LocalDateTime.of(eventDate, song23.getStart().plusSeconds(120));
		guessSong23Submitter1.setTimestamp(guessTime60 );
		Guess guessSong23Submitter2 = new Guess(submitter2, submitter4, "sehr gut");
		LocalDateTime guessTime61 = LocalDateTime.of(eventDate, song23.getStart().plusSeconds(120));
		guessSong23Submitter2.setTimestamp(guessTime61 );
		Guess guessSong23Submitter3 = new Guess(submitter3, submitter3, "okay");
		LocalDateTime guessTime62 = LocalDateTime.of(eventDate, song23.getStart().plusSeconds(120));
		guessSong23Submitter3.setTimestamp(guessTime62 );
		Guess guessSong23Submitter4 = new Guess(submitter4, submitter2, "sehr gut");
		LocalDateTime guessTime63 = LocalDateTime.of(eventDate, song23.getStart().plusSeconds(120));
		guessSong23Submitter4.setTimestamp(guessTime63 );
		Guess guessSong23Submitter5 = new Guess(submitter5, submitter3, "okay");
		LocalDateTime guessTime64 = LocalDateTime.of(eventDate, song23.getStart().plusSeconds(120));
		guessSong23Submitter5.setTimestamp(guessTime64 );
		
		Guess guessSong24Submitter1 = new Guess(submitter1, submitter1, "sehr gut");
		LocalDateTime guessTime65 = LocalDateTime.of(eventDate, song24.getStart().plusSeconds(120));
		guessSong24Submitter1.setTimestamp(guessTime65 );
		Guess guessSong24Submitter2 = new Guess(submitter2, submitter4, "sehr gut");
		LocalDateTime guessTime66 = LocalDateTime.of(eventDate, song24.getStart().plusSeconds(120));
		guessSong24Submitter2.setTimestamp(guessTime66 );
		Guess guessSong24Submitter3 = new Guess(submitter3, submitter3, "okay");
		LocalDateTime guessTime67 = LocalDateTime.of(eventDate, song24.getStart().plusSeconds(120));
		guessSong24Submitter3.setTimestamp(guessTime67 );
		Guess guessSong24Submitter4 = new Guess(submitter4, submitter2, "sehr gut");
		LocalDateTime guessTime68 = LocalDateTime.of(eventDate, song24.getStart().plusSeconds(120));
		guessSong24Submitter4.setTimestamp(guessTime68 );
		Guess guessSong24Submitter5 = new Guess(submitter5, submitter3, "okay");
		LocalDateTime guessTime69 = LocalDateTime.of(eventDate, song24.getStart().plusSeconds(120));
		guessSong24Submitter5.setTimestamp(guessTime69 );
		
		Guess guessSong25Submitter1 = new Guess(submitter1, submitter1, "sehr gut");
		LocalDateTime guessTime70 = LocalDateTime.of(eventDate, song25.getStart().plusSeconds(120));
		guessSong25Submitter1.setTimestamp(guessTime70 );
		Guess guessSong25Submitter2 = new Guess(submitter2, submitter4, "sehr gut");
		LocalDateTime guessTime71 = LocalDateTime.of(eventDate, song25.getStart().plusSeconds(120));
		guessSong25Submitter2.setTimestamp(guessTime71 );
		Guess guessSong25Submitter3 = new Guess(submitter3, submitter3, "okay");
		LocalDateTime guessTime72 = LocalDateTime.of(eventDate, song25.getStart().plusSeconds(120));
		guessSong25Submitter3.setTimestamp(guessTime72);
		Guess guessSong25Submitter4 = new Guess(submitter4, submitter2, "sehr gut");
		LocalDateTime guessTime73 = LocalDateTime.of(eventDate, song25.getStart().plusSeconds(120));
		guessSong25Submitter4.setTimestamp(guessTime73 );
		Guess guessSong25Submitter5 = new Guess(submitter5, submitter3, "okay");
		LocalDateTime guessTime74 = LocalDateTime.of(eventDate, song25.getStart().plusSeconds(120));
		guessSong25Submitter5.setTimestamp(guessTime74 );
		//und so weiter
		
		List<Guess> guesses = new ArrayList<Guess>();
		guesses.add(guessSong11Submitter1);
		guesses.add(guessSong11Submitter2);
		guesses.add(guessSong11Submitter3);
		guesses.add(guessSong11Submitter4);
		guesses.add(guessSong11Submitter5);
		
		guesses.add(guessSong12Submitter1);
		guesses.add(guessSong12Submitter2);
		guesses.add(guessSong12Submitter3);
		guesses.add(guessSong12Submitter4);
		guesses.add(guessSong12Submitter5);
		
		guesses.add(guessSong13Submitter1);
		guesses.add(guessSong13Submitter2);
		guesses.add(guessSong13Submitter3);
		guesses.add(guessSong13Submitter4);
		guesses.add(guessSong13Submitter5);
		
		guesses.add(guessSong14Submitter1);
		guesses.add(guessSong14Submitter2);
		guesses.add(guessSong14Submitter3);
		guesses.add(guessSong14Submitter4);
		guesses.add(guessSong14Submitter5);
		
		guesses.add(guessSong15Submitter1);
		guesses.add(guessSong15Submitter2);
		guesses.add(guessSong15Submitter3);
		guesses.add(guessSong15Submitter4);
		guesses.add(guessSong15Submitter5);
		
		guesses.add(guessSong16Submitter1);
		guesses.add(guessSong16Submitter2);
		guesses.add(guessSong16Submitter3);
		guesses.add(guessSong16Submitter4);
		guesses.add(guessSong16Submitter5);
		
		guesses.add(guessSong17Submitter1);
		guesses.add(guessSong17Submitter2);
		guesses.add(guessSong17Submitter3);
		guesses.add(guessSong17Submitter4);
		guesses.add(guessSong17Submitter5);
		
		guesses.add(guessSong18Submitter1);
		guesses.add(guessSong18Submitter2);
		guesses.add(guessSong18Submitter3);
		guesses.add(guessSong18Submitter4);
		guesses.add(guessSong18Submitter5);
		
		guesses.add(guessSong19Submitter1);
		guesses.add(guessSong19Submitter2);
		guesses.add(guessSong19Submitter3);
		guesses.add(guessSong19Submitter4);
		guesses.add(guessSong19Submitter5);
		
		guesses.add(guessSong20Submitter1);
		guesses.add(guessSong20Submitter2);
		guesses.add(guessSong20Submitter3);
		guesses.add(guessSong20Submitter4);
		guesses.add(guessSong20Submitter5);
		
		guesses.add(guessSong21Submitter1);
		guesses.add(guessSong21Submitter2);
		guesses.add(guessSong21Submitter3);
		guesses.add(guessSong21Submitter4);
		guesses.add(guessSong21Submitter5);
		
		guesses.add(guessSong22Submitter1);
		guesses.add(guessSong22Submitter2);
		guesses.add(guessSong22Submitter3);
		guesses.add(guessSong22Submitter4);
		guesses.add(guessSong22Submitter5);
		
		guesses.add(guessSong23Submitter1);
		guesses.add(guessSong23Submitter2);
		guesses.add(guessSong23Submitter3);
		guesses.add(guessSong23Submitter4);
		guesses.add(guessSong23Submitter5);
		
		guesses.add(guessSong24Submitter1);
		guesses.add(guessSong24Submitter2);
		guesses.add(guessSong24Submitter3);
		guesses.add(guessSong24Submitter4);
		guesses.add(guessSong24Submitter5);
		
		guesses.add(guessSong25Submitter1);
		guesses.add(guessSong25Submitter2);
		guesses.add(guessSong25Submitter3);
		guesses.add(guessSong25Submitter4);
		guesses.add(guessSong25Submitter5);
		//und so weiter
		
		GuessController guessController = new GuessController(null, null);
		List<GuessResult> guessResults = guessController.calculateGuessResults(songs, guesses);
		assertEquals(3, guessResults.get(0).getPoints(), "Kilian has three points");
		
		
	}

}
