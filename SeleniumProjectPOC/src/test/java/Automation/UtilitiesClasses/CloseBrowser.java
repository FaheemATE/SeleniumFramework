package Automation.UtilitiesClasses;

import org.openqa.selenium.WebDriver;

import Automation.BaseClass.InitializeWebDriver;

public class CloseBrowser {

	 static WebDriver driver = InitializeWebDriver.driver;
	
	public CloseBrowser() {
		
		driver.close();

	}
	
	public static void closeAllBrowsers() {
		
		driver.quit();
	}
	
}
