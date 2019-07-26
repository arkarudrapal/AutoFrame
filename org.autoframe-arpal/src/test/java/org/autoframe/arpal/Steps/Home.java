package org.autoframe.arpal.Steps;

import org.autoframe.arpal.implement.HomeImplement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

public class Home {

	HomeImplement hm;

	public Home(HomeImplement hm) {
		this.hm = hm;
	}

	@Given("^the mailinator URL$")
	public void theMailinatorURL() throws Throwable {
		hm.enterHomeText();
	}

	@Then("^click Email link$")
	public void clickEmailLink() throws Throwable {
		hm.clickEmailLink();
	}

}
