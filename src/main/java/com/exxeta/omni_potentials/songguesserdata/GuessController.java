package com.exxeta.omni_potentials.songguesserdata;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuessController {
	
	private List<Guess> guesses;
	private final GuessRepository guessRepository;
	private final SongRepository songRepository; 
	int counter = 0;
	
	// aus Datenbank laden
	public GuessController(GuessRepository guessRepository, SongRepository songRepository) {
		guesses = new ArrayList<Guess>();
		this.guessRepository = guessRepository;
		this.songRepository = songRepository;
		List<Guess> list = guessRepository.findAll();
		if(!list.isEmpty()) {
			guesses.addAll(list);
		}
	}
	
	
	
	@GetMapping("/teamguesses/guessresults")
	public List<GuessResult> getGuessResults(){
		List<GuessResult> results = calculateGuessResults(songRepository.findAll(),getAllGuesses());
		return results;
		
	}
	
	public List<GuessResult> createNewResult(List<Song> all, List<Guess> allGuesses) {
		List<GuessResult> counts = new ArrayList<GuessResult>();
		//Schleife um Guess Liste
		for(int e = 0; e < allGuesses.size(); e++) {
			//add results
			GuessResult result = new GuessResult(allGuesses.get(e).getGuesser());
			if(!isAlreadyInList(counts, result))
			counts.add(result); 
		}
		return counts;
	}
	
	private boolean isAlreadyInList(List<GuessResult> counts, GuessResult result) {
		//Schleife um counts zum überprüfen auf Duplicate
		for(int i = 0; i < counts.size(); i++) {
			if(counts.get(i).getGuesser().getName1().equals(result.getGuesser().getName1())) {
			return true; 
			}
		}
		return false;
		
	}



	public List<GuessResult> calculateGuessResults(List<Song> allSongs, List<Guess> allGuesses) {
		List<GuessResult> counts = createNewResult(allSongs, allGuesses);
		//Schleife um Song Liste
		for(int i = 0; i < allSongs.size(); i++){
			//Schleife um Guess Liste 
			for(int e = 0; e < allGuesses.size(); e++) {
				//  Guess wird geprüft auf den richtigen Zeitraum 
				if(isGuessAfterSongStart(allSongs, allGuesses, i, e) && isGuessBeforeSongEnd(allSongs, allGuesses, i, e)) {
					// Guess wird geprüft ob richtig geraten
					if(allGuesses.get(e).getSubmitter().equals(allSongs.get(i).getSubmitter())){
						// Schleife um counts
						for(int a = 0; a < counts.size(); a++) {
							// nach richtigen Guesser gesucht um Punktzahl zu erhöhen
							if(counts.get(a).getGuesser().getName1().equals(allGuesses.get(e).getGuesser().getName1())) {
								counts.get(a).increasePoints();
							}
						}	
					}
				}
			}
		}
		return counts;
	}

	private boolean isGuessBeforeSongEnd(List<Song> allSongs, List<Guess> allGuesses, int i, int e) {
		return allGuesses.get(e).getTimestamp().toLocalTime().isBefore(allSongs.get(i).getStart().plusSeconds(allSongs.get(i).getDuration()));
	}

	private boolean isGuessAfterSongStart(List<Song> allSongs, List<Guess> allGuesses, int i, int e) {
		return allGuesses.get(e).getTimestamp().toLocalTime().isAfter(allSongs.get(i).getStart());
	}


	@GetMapping("/teamguesses/guesses")
	public List<Guess> getAllGuesses(){
		return guesses;
	}
	

	@PostMapping("/teamguesses/guesses")
	public void createNewGuess(String guesser, String submitter, String favor) {
		Guess newGuess = new Guess( new Person(guesser),  new Person(submitter), favor);
		guesses.add(newGuess);
		guessRepository.save(newGuess);
	}
	
}
