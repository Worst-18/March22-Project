package com.logger.demo;

import org.apache.commons.math3.analysis.function.Log;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Basic_Configuration {
	
	public static Logger log = Logger.getLogger(Basic_Configuration.class);
	
	public static void main(String[] args) {
		
	//	PropertyConfigurator.configure("log4j.properties");
		
	//	BasicConfigurator.configure();
		
		BasicConfigurator.configure();
		
		
		
		log.info("Info");
		
		log.info("debug");
		
		
		
	}


}
