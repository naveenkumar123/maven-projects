package com.learning;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
	static Logger LOGGER = Logger.getLogger(App.class);
	
	public static void main(String[] args) {
		
		LOGGER.debug("addition " + new Calculator().add(1, 1));
		
		LOGGER.debug("substraction " + new Calculator().add(2, 1));
		
	}
}
