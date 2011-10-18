package com.malsolo.vanilla.spring.puzzler.welcome;

import javax.inject.Named;

@Named("English")
public class EnglishWelcomePrinter implements LocalizedWelcomePrinter {

	public void printWelcome(String name) {
		System.out.println("Welcome to Spring Puzzlers " + name);
	}

}
