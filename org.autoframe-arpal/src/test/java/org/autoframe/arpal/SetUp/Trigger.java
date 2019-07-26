package org.autoframe.arpal.SetUp;

import cucumber.api.Scenario;

public class Trigger {

	Driver driverobject;
	
	String browserValue = System.getProperty("browser");
	String URL = System.getProperty("url");

	public Trigger(Driver driverobject) {
		this.driverobject = driverobject;		
	}

	@cucumber.api.java.Before
	public void setUp(Scenario scenario) {
		driverobject.log.info("***********Scenario:" + scenario.getName() + "******************");
		driverobject.initDriver(browserValue);
		driverobject.getDriver().get(URL);		
	}
	
	@cucumber.api.java.After
	public void teardown(Scenario scenario) {
		driverobject.log.info("***********Status of the scenario :" + scenario.getName() + 
						" is " + scenario.getStatus() + "******************");
		driverobject.getDriver().close();		
	}
}
