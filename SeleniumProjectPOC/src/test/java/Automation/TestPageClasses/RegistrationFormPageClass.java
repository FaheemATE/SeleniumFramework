package Automation.TestPageClasses;

import java.nio.charset.Charset;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import Automation.UIPageElementsClasses.RegistrationFormElements;
import Automation.UtilitiesClasses.CommonTestMethods;
import Automation.UtilitiesClasses.ReadPropertiesFiles;

public class RegistrationFormPageClass {
	
	private Properties prop = ReadPropertiesFiles.prop;
	private WebElement element;
	
	RegistrationFormElements formElements = new RegistrationFormElements();
	CommonTestMethods commonMethod = new CommonTestMethods();

	public void doRegistration()
	{
	    String email = commonMethod.getAlphaNumericString(5)+"@gmail.com";	    
		formElements.nameTextBox().sendKeys(prop.getProperty("name"));
		formElements.phoneTextBox().sendKeys(prop.getProperty("phone"));
		formElements.emailTextBox().sendKeys(email);
		element = formElements.countryDropdown();
		commonMethod.selectValueInDropdown(element, prop.getProperty("country"), true, false);
		formElements.cityTextBox().sendKeys(prop.getProperty("city"));		
		formElements.userTextBox().sendKeys(prop.getProperty("user"));
		formElements.passwordTextBox().sendKeys(prop.getProperty("pass"));
		
		formElements.submitButton().click();		
		
	}
	
}
