package com.malsolo.vanilla.spring.puzzler.welcome;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class ConsoleWelcomeService implements WelcomeService {
	
	@Inject @Named("Spanish")
	private LocalizedWelcomePrinter printer;// = new SpanishWelcomePrinter();


	public void welcome(String name) {
		printer.printWelcome(name);
	}

}
