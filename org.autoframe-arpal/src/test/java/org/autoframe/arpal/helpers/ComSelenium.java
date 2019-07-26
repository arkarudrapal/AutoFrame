package org.autoframe.arpal.helpers;

import org.autoframe.arpal.SetUp.Driver;
import org.openqa.selenium.By;

public class ComSelenium {
	Driver instance;
	int shortWait = 3000;

	public ComSelenium(Driver instance) {
		this.instance = instance;
	}
	
	public void enterTextValue(By element) {
		instance.getDriver().findElement(element).sendKeys("Hello World");		
	}
	
	public void clickLink(By element) throws InterruptedException {
		instance.getDriver().findElement(element).click();
		Thread.sleep(shortWait);		
	}
	
}
