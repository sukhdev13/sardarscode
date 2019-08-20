package com.vir.LogDemo;
import org.apache.log4j.Logger;

public class logCalc {
	private static final Logger logger=Logger.getLogger(logCalc.class);
	public static void main(String ar[])
	{
		int x=5,y=4;
		int z= x+y;
		logger.trace("the value of list item is 5");
		logger.debug("the method called with following arguments");
		logger.info("the library was installed or message from the server");
		logger.warn("the library to convert xml was not fount using default");
		logger.error("the excepton with values occur");
		logger.fatal("sorry restart your system ");
		
		
		logger.info("Add completed");
		logger.error("error occured");
		logger.debug("debug message");
		logger.trace("this is trace");
		logger.warn("warning message");
		
		System.out.println("z= "+z);
	}
}
