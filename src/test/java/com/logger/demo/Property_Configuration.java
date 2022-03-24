package com.logger.demo;

import org.apache.commons.math3.analysis.function.Log;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_Configuration {

	public static	Logger log= Logger.getLogger(Property_Configuration.class);
 
	public static void main(String[] args) {
		
PropertyConfigurator.configure("log4j.properties");	
   
        log.debug("Debug");
        log.info("Info");
        log.warn("Warn");
        log.error("Error");
        log.fatal("Fatal");
		
	}
	
		
	}
	

