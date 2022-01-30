package Athletics;

import java.util.stream.Collectors;

public class SportStreamer {

	public static void main(String[] args) {
		new SportStreamer().run();
	}

	private void run() {
		String sports = Sport.getSports()
			.stream()
			.map(Sport::toString)
			.sorted()
			.collect(Collectors.joining(", "));
		
		System.out.println(sports);
		
	}

}
