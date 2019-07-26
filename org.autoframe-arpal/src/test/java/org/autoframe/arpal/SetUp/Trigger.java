package org.autoframe.arpal.SetUp;

public class Trigger {

	Driver driverobject;

	public Trigger(Driver driverobject) {
		this.driverobject = driverobject;
	}

	@cucumber.api.java.Before
	public void setUp() {
		driverobject.initDriver();
		driverobject.getDriver().get("https://www.google.com");
	}
}
