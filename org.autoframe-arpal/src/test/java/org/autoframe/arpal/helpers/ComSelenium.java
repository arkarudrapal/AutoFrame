package org.autoframe.arpal.helpers;

import java.util.List;

import org.autoframe.arpal.SetUp.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ComSelenium {
	Driver instance;
	int shortWait = 3000;

	public ComSelenium(Driver instance) {
		this.instance = instance;
	}
	
	//Getting the Current URL
	public String getCurrentURL() {
		return instance.getDriver().getCurrentUrl();
	}
	
	//Entering the text value in a text box
	public void enterTextValue(By element, String text) {
		instance.getDriver().findElement(element).sendKeys(text);		
	}
	
	//clicking a webelement
	public void clickElement(By element) throws InterruptedException {
		instance.getDriver().findElement(element).click();
		Thread.sleep(shortWait);		
	}
	
	//fetch text value of a webelement
	public String getText(By element) throws Throwable {
		return instance.getDriver().findElement(element).getText();
	}
	
	public Boolean ifPresent(By element) throws Throwable {
		if(instance.getDriver().findElement(element).isDisplayed())
			return true;
		else
			return false;
	}
	
	//Find List
	public List<WebElement> getList(By element) throws Throwable {
		return instance.getDriver().findElements(element);
	}
	
	//Select value from a dropdown
	public void selectValueDropdown(By element, String text) throws Throwable {
		Select dropdown = new Select(instance.getDriver().findElement(element));
		dropdown.selectByValue(text);
		Thread.sleep(3000);
	}
	
	//Find Element
	public WebElement getElement(By element) throws Throwable {
		return instance.getDriver().findElement(element);
	}
	
	//fetching from webTable
	public WebElement getElementTable(int rowvalue, int colvalue) throws Throwable {
		List<WebElement> row = instance.getDriver().findElements(By.xpath("//table/tbody/tr"));
		List<WebElement> col = instance.getDriver().findElements(By.xpath("//table/tbody/tr[1]/td"));
		
		WebElement element = null;
		
		for(int i = 0; i<= row.size(); i++) {
			for(int j = 0; j<=col.size(); j++) {
				String xpathfinal = "//table/tbody/tr[" + i + "]/td[" + j + "]";
				element = instance.getDriver().findElement(By.xpath(xpathfinal));
			}
		}
		return element;
	}
}
