package com.malsolo.vanilla.spring.puzzler.traveler;

import java.util.List;

public class RandomDestinationPicker implements DestinationPicker {
	
	private static int instances = 0;

	private int id;
	private List<String> availableDestinations;
	
	public RandomDestinationPicker(List<String> availableDestinations) {
		this.availableDestinations = availableDestinations;
		id = instances++;
	}
	
	public String getDestination() {
		return availableDestinations.get(id % availableDestinations.size());
	}

}
