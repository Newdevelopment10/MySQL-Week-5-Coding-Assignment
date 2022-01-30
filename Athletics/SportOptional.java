package Athletics;

import java.util.NoSuchElementException;
import java.util.Optional;

public class SportOptional {

	public static void main(String[] args) {
		new SportOptional().run();

	}

	private void run() {
		Sport sports = SportMethod(Optional.of(new Sport("Ice")));
		System.out.println(sports);
		
		try {
		SportMethod(Optional.empty());
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
	}

	private Sport SportMethod(Optional<Sport> sportOptional) {
		return sportOptional.orElseThrow(
				() -> new NoSuchElementException("SPORT OPTIONAL IS EMPTY!!"));
	}
	
}