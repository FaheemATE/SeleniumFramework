package Automation.UIPageElementsClasses;

import java.util.Properties;
import org.openqa.selenium.WebElement;

import Automation.UtilitiesClasses.CommonTestMethods;
import Automation.UtilitiesClasses.ReadPropertiesFiles;

public class RegistrationFormElements {

	private Properties prop = ReadPropertiesFiles.prop;
	WebElement element;
	CommonTestMethods testMethods = new CommonTestMethods();

	
	public WebElement registrationFormHeader() {

		element = testMethods.getElement(prop.getProperty("registationFormHeader"));
		return element;
	}
	
	public WebElement nameTextBox() {
		element = testMethods.getElement(prop.getProperty("registrationForm_NameTextField"));
		return element;
	}
	
	public WebElement phoneTextBox() {
		element = testMethods.getElement(prop.getProperty("registrationForm_PhoneTextField"));
		return element;
	}
	
	public WebElement emailTextBox() {
		element = testMethods.getElement(prop.getProperty("registrationForm_EmailTextField"));
		return element;
	}
	
	public WebElement countryDropdown() {
		element = testMethods.getElement(prop.getProperty("registrationForm_CountryDropdown"));
		return element;
	}
	
	public WebElement cityTextBox() {
		element = testMethods.getElement(prop.getProperty("registrationForm_CityTextField"));
		return element;
	}
	
	public WebElement userTextBox() {
		element = testMethods.getElement(prop.getProperty("registrationForm_UserNameTextField"));
		return element;
	}
	public WebElement passwordTextBox() {
		element = testMethods.getElement(prop.getProperty("registrationForm_PasswordTextField"));
		return element;
	}
	
	public WebElement submitButton() {
		element = testMethods.getElement(prop.getProperty("registrationForm_SubmitButton"));
		return element;
	}

}
