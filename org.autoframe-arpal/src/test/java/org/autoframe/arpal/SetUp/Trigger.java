package org.autoframe.arpal.SetUp;

public class Trigger {

	Driver driverobject;
	
	String browserValue = System.getProperty("browser");

	public Trigger(Driver driverobject) {
		this.driverobject = driverobject;
	}

	@cucumber.api.java.Before
	public void setUp() {
		driverobject.initDriver(browserValue);
		driverobject.getDriver().get("https://www.google.com");		
	}
	
}
