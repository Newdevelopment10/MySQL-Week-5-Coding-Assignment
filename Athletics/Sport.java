package Athletics;

import java.util.ArrayList;
import java.util.List;

public class Sport {
	private String name;
	
	
	private static List<Sport> sports = List.of(
			new Sport("Combat"), 
			new Sport("Team"), 
			new Sport("Solo"), 
			new Sport("Mental"), 
			new Sport("Water")
			);
	
	public Sport(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	
	public String toString() {
		return name + " Sport";
	}

	/**
	 * < 0 if sport1 < sport2
	 * == 0 if sport1 == sport2
	 * > 0 if sport1 > sport2
	 */
		
	public int compare(Sport win) {
		return this.name.compareTo(win.name);
			
	}
	
	public static int compareTo(Sport s1, Sport s2) {
		return s1.name.compareTo(s2.name);
	}

	public static List<Sport> getSports() {
		return new ArrayList<>(sports);
	}
}