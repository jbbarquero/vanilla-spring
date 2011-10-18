package com.malsolo.vanilla.spring.puzzler.welcome;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WelcomeBootstrap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("/META-INF/spring/app-context.xml");
		
		WelcomeService welcomeService =
				applicationContext.getBean(WelcomeService.class);
		
		 welcomeService.welcome("Javier");
	}

}
