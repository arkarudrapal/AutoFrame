package org.autoframe.arpal.implement;

import java.util.logging.Logger;

import org.autoframe.arpal.SetUp.Driver;
import org.autoframe.arpal.helpers.ComSelenium;
import org.autoframe.arpal.helpers.Elements;
import org.openqa.selenium.WebElement;

public class TestStepDefinition {

	Driver driver;
	ComSelenium cs;
	Elements ele;

	Logger log = Logger.getLogger(Driver.class.getName());

	public TestStepDefinition(Driver driver, ComSelenium cs, Elements ele) {
		this.driver = driver;
		this.cs = cs;
		this.ele = ele;
	}

	public void clickHome() throws Throwable {
		cs.clickElement(ele.homeLink);
	}

	public void enterEmail(String emailAddress) throws Throwable {
		if(cs.ifPresent(ele.email)) {
			log.info("The email address field is present.");
			cs.enterTextValue(ele.email,emailAddress);
		}
	}

	public void enterPassWord(String psswordText) throws Throwable {
		if(cs.ifPresent(ele.password)) {
			log.info("The password field is present.");
			cs.enterTextValue(ele.password,psswordText);
		}
	}

	public void clickSignInButton() throws Throwable {
		cs.clickElement(ele.signInButton);
		Thread.sleep(3000);
	}

	public void verifyHomePage() throws Throwable {
		if(cs.ifPresent(ele.homeLink)) {
			log.info("User is navigated to the home page successfully.");
		}
	}
	
	public void verifyUOL() throws Throwable {
		if(cs.ifPresent(ele.unorderList)) {
			log.info("The Test2 Div is present.");
		}
	}
	
	public int verifySizeUOL() throws Throwable {
		return cs.getList(ele.unorderList).size();
	}
	
	public WebElement getUOL2text() throws Throwable {
		return cs.getElement(ele.unorderList2);
	}
	
	public String getBadgeValue() throws Throwable {
		return cs.getText(ele.unorderList2Badge);
	}
	
	public void verifyTestDiv3() throws Throwable {
		if(cs.ifPresent(ele.dropdownTest))
			log.info("The Test Div 3 is present.");
	}
	
	public void verifyDefaultValTestDiv3(String anotherString) throws Throwable {
		if(cs.getText(ele.dropdownTest).equalsIgnoreCase(anotherString))
			log.info("The Default value is " + anotherString + ".");
	}
	
	public void selectValueDropdown(String value) throws Throwable {
		cs.clickElement(ele.dropdownTest);
		Thread.sleep(3000);
		cs.clickElement(ele.dropdownvalue);
		log.info("User selects " + value + " from the dropdown.");
	}
	
	public void buttonEnabled() throws Throwable {
		if(cs.ifPresent(ele.buttonEnabled))
			log.info("The Button 1 is enabled.");		
	}
	
	public void buttonDisabled() throws Throwable {
		if(cs.ifPresent(ele.buttonDisabled))
			log.info("The Button 2 is disabled.");		
	}
	
	public void buttonClick() throws Throwable {
		cs.clickElement(ele.button5);
		Thread.sleep(2000);
	}
	
	public void verifySuccesMessage() throws Throwable {
		if(cs.ifPresent(ele.successMsg))
			log.info("The Success message is displayed successfully.");
	}	
	
	public void iterateThruTable(int row, int col) throws Throwable {
		
	}
}
