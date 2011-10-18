package com.malsolo.vanilla.spring.puzzler.welcome;

import javax.inject.Named;

@Named("Spanish")
public class SpanishWelcomePrinter implements LocalizedWelcomePrinter {

	public void printWelcome(String name) {
		 System.out.println("Bienvenido a Spring Puzzlers " + name);
	}

}
