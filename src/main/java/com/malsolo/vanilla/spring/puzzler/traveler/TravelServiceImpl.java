package com.malsolo.vanilla.spring.puzzler.traveler;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Async;

public class TravelServiceImpl implements TravelService {
	
	private Logger logger = Logger.getLogger(TravelServiceImpl.class);
	
	private DestinationPicker destinationPicker;
	
	/* (non-Javadoc)
	 * @see com.malsolo.vanilla.spring.puzzler.traveler.TravelService#printNextDestination()
	 */
	@Async
	public void printNextDestination() {
		logger.info("Running from thread: " + Thread.currentThread().getId());
		System.out.println("Your next holiday destination: " + destinationPicker.getDestination());
	}
	
	public void setDestinationPicker(DestinationPicker destinationPicker) {
		this.destinationPicker = destinationPicker;
	}

}
