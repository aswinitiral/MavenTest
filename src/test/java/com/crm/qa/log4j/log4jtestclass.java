package com.crm.qa.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

public class log4jtestclass {
	
	static Logger logger;

	@Test(priority=1)
	public void setup()
	{
		logger = Logger.getLogger("log4jtestclass");
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("setup method started");
		
		System.out.println("config.setproperty");
	}
	
	@Test(priority=2)
	public void login() {
		logger.info("login method started");
		System.out.println("this is login test");
		
		logger.info("login method progress");
		logger.info("login method completed");
		logger.info("login method passed");
	}
	
	@Test(priority=3)
	public void logout() {
		
		logger.info("logout method started");
		System.out.println("this is login test");
		
	}
}
