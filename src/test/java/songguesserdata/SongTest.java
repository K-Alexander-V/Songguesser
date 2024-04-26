package songguesserdata;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.exxeta.omni_potentials.songguesserdata.Guess;
import com.exxeta.omni_potentials.songguesserdata.Person;

class SongTest {

	private List<Guess> guesses;
	
	@Test
	void test() {
		String eventDayStart = "2024 04 12";
		DateTimeFormatter parser1 = DateTimeFormatter.ofPattern("yyyy MM dd");
		LocalDate eventDayStart1 = LocalDate.parse(eventDayStart,parser1);
	}
	
}
