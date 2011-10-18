package com.malsolo.vanilla.spring.puzzler.traveler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TravelBootstrap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/META-INF/spring/app-context-traveler.xml");
		
		TravelService travelService = applicationContext.getBean(TravelService.class);
		
		travelService.printNextDestination();
		travelService.printNextDestination();
		travelService.printNextDestination();
		travelService.printNextDestination();


	}

}
