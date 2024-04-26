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
	private final SongRepository songRepository; //wird nicht genutzt
	int counter = 0;
	
	
	public GuessController(GuessRepository guessRepository, SongRepository songRepository) {
		guesses = new ArrayList<Guess>();
		this.guessRepository = guessRepository;
		this.songRepository = songRepository;
//		List<Guess> list = guessRepository.findAll();
//		if(!list.isEmpty()) {
//			guesses.addAll(list);
//		}
	}
	
	
	
	@GetMapping("/teamguesses/guessresults")
	public List<GuessResult> getGuessResults(){
		List<GuessResult> results = calculateGuessResults(songRepository.findAll(),getAllGuesses());
		return results;
		
	}
	
	public List<GuessResult> createNewResult(List<Song> all, List<Guess> allGuesses) {
		List<GuessResult> counts = new ArrayList<GuessResult>();
		//Schleife um guesses
		for(int e = 0; e < allGuesses.size(); e++) {
			//hier sollen die dann counts hinzugefügt werden 
			GuessResult result = new GuessResult(allGuesses.get(e).getGuesser());
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



	public List<GuessResult> calculateGuessResults(List<Song> allSongs, List<Guess> allGuesses) {
		List<GuessResult> counts = createNewResult(allSongs, allGuesses);
		//Schleife für Songs 
		for(int i = 0; i < allSongs.size(); i++){
			//Schleife für alle guesses 
			for(int e = 0; e < allGuesses.size(); e++) {
				//  wenn guess zwischen start und ende ist dann verzweigung
				if(isGuessAfterSongStart(allSongs, allGuesses, i, e) && isGuessBeforeSongEnd(allSongs, allGuesses, i, e)) {
					// weiter verzweigen wenn die submitter gleich sind(richtig geraten)
					if(allGuesses.get(e).getSubmitter().equals(allSongs.get(i).getSubmitter())){
						// Schleife für counts
						for(int a = 0; a < counts.size(); a++) {
							//verzweigen wenn die Person mit dem Guesser aus dem Guess übereinstimmt
							if(counts.get(a).getGuesser().getName1().equals(allGuesses.get(e).getGuesser().getName1())) {
								//Puunkte für die Person werden erhöt
								counts.get(a).increasePoints();
							}
						}	
					}
				}
			}
		}
		return counts;
	}

	//Test
	private boolean isGuessBeforeSongEnd(List<Song> all, List<Guess> allGuesses, int i, int e) {
		System.out.println(all.size());
		return allGuesses.get(e).getTimestamp().toLocalTime().isBefore(all.get(i).getStart().plusSeconds(all.get(i).getDuration()));
	}

	//Test
	private boolean isGuessAfterSongStart(List<Song> all, List<Guess> allGuesses, int i, int e) {
		return allGuesses.get(e).getTimestamp().getSecond() >= all.get(i).getStart().getSecond();
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
