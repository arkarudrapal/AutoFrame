package org.autoframe.arpal.SetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.util.logging.Logger;

public class Driver {

	private WebDriver driver;
	String browserName;
	
	Logger log = Logger.getLogger(Driver.class.getName());
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void initDriver(String browserName) {
		final String ROOTDIR = "user.dir";
		switch(browserName) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", 
						System.getProperty(ROOTDIR)+"\\src\\test\\resources\\driver\\chromedriver.exe");
				this.driver = new ChromeDriver();
				clearCache();
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver", 
						System.getProperty(ROOTDIR)+"\\src\\test\\resources\\driver\\geckodriver.exe");
				this.driver = new FirefoxDriver();
				clearCache();
				break;
			case "ie":
				System.setProperty("webdriver.ie.driver", 
						System.getProperty(ROOTDIR)+"\\src\\test\\resources\\driver\\IEDriverServer.exe");
				this.driver = new InternetExplorerDriver();
				clearCache();
				break;
			default:
				log.info("**************Invalid browser name***************");
				break;
		}		
	}

	public void clearCache() {
		this.driver.manage().deleteAllCookies();
		this.driver.manage().window().maximize();
	}

}
