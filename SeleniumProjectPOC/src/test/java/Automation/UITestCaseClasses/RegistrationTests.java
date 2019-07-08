package Automation.UITestCaseClasses;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Automation.TestPageClasses.RegistrationFormPageClass;
import Automation.UIPageElementsClasses.RegistrationFormElements;
import Automation.UtilitiesClasses.CloseBrowser;
import Automation.UtilitiesClasses.LaunchApplication;
import Automation.UtilitiesClasses.ReadPropertiesFiles;

public class RegistrationTests {
	
	RegistrationFormElements formElements;
	RegistrationFormPageClass formPageClass;
	private Properties prop;
	
	@BeforeTest
	public void initialization()
	{
			new LaunchApplication();
		    formElements = new RegistrationFormElements();
		    formPageClass = new RegistrationFormPageClass();
		    prop = ReadPropertiesFiles.prop;
				
	}
	
	@Test(priority=0, enabled=false)
	public void verifyRegistrationForm()
	{
		WebElement formHeaderElement = formElements.registrationFormHeader();
		String formText = formHeaderElement.getText();
		
		Assert.assertEquals(formText, prop.getProperty("formHeaderText"),"Form did't get");
	}
	
	@Test(priority=1)
	public void doRegistration()
	{
		formPageClass.doRegistration();
	}

	@AfterTest
	public void teardown()
	{
		//new CloseBrowser();
	}
	
	
}
