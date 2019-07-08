package Automation.UtilitiesClasses;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import Automation.BaseClass.InitializeWebDriver;

public class LaunchApplication{

	public WebDriver driver;
	Properties prop;

	public LaunchApplication() {
		try {
			new InitializeWebDriver();
			driver = InitializeWebDriver.driver;
			prop = ReadPropertiesFiles.prop;

			driver.get(prop.getProperty("url"));

			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
