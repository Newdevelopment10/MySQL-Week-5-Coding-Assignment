package Athletics;

import java.util.List;

public class SportSorter {

	public static void main(String[] args) {
		new SportSorter().run();

	}

	private void run() {
		boolean sortWithLambda = false;
		
		System.out.println("Novel: "  + Sport.getSports());
		List<Sport> sports;
		
		if(sortWithLambda) {
		  sports = sortWithLambda();
	}
		else {
		  sports = sortWithReference();
		}

		System.out.println("Sorted: " + sports);
}

	 private List<Sport> sortWithReference() {
		List<Sport> sports = Sport.getSports();
		
		sports.sort(Sport::compare);
		return sports;
	}

	private List<Sport> sortWithLambda() {
		List<Sport> sports = Sport.getSports();
		
		sports.sort((s1, s2) -> Sport.compareTo(s1, s2));
		
		return sports;
  }
}
