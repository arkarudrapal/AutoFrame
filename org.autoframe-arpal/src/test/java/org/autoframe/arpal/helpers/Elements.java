package org.autoframe.arpal.helpers;

import org.openqa.selenium.By;

public class Elements {
	
	public By homeLink = By.xpath("//a[contains(text(),'Home')]");
	public By email = By.xpath("//input[@id='inputEmail']");
	public By password = By.xpath("//input[@id='inputPassword']");
	public By signInButton = By.xpath("//button[text()='Sign in']");
	public By unorderList = By.xpath("//ul[@class='list-group']");
	public By unorderList2 = By.xpath("//ul[@class='list-group']/li[2]");
	public By unorderList2Badge = By.xpath("//ul[@class='list-group']/li[2]/span");
	public By dropdownTest = By.xpath("//button[@id='dropdownMenuButton']");
	public By dropdownTestDefaultVal = By.xpath("//button[@id='dropdownMenuButton']");
	public By dropdownvalue = By.xpath("//a[text()='Option 3']");
	public By buttonEnabled = By.xpath("//button[contains(@class,'primary') and .='Button']");
	public By buttonDisabled = By.xpath("//button[contains(@disabled,'') and contains (@class,'secondary') and .='Button']");
	public By button5 = By.xpath("//button[@id='test5-button']");
	public By successMsg = By.xpath("//div[@role='alert']");
	public By tabledata = By.xpath("//table/tbody/tr[2]/td[2]");	
}
