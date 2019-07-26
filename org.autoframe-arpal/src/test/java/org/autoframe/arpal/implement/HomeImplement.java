package org.autoframe.arpal.implement;

import org.autoframe.arpal.SetUp.Driver;
import org.autoframe.arpal.helpers.ComSelenium;
import org.autoframe.arpal.helpers.Elements;

public class HomeImplement {

	Driver driver;
	ComSelenium cs;
	Elements ele;
	
	public HomeImplement(Driver driver, ComSelenium cs, Elements ele) {
		this.driver = driver;
		this.cs = cs;
		this.ele = ele;
	}
	
	public void enterHomeText() {
		cs.enterTextValue(ele.homeTextBox);
	}
	
	public void clickEmailLink() throws InterruptedException {
		cs.clickLink(ele.emailLink);
	}
	
}
