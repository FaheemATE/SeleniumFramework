package Automation.UtilitiesClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Automation.BaseClass.InitializeWebDriver;

public class CommonTestMethods {

	WebDriver driver = InitializeWebDriver.driver;
	WebElement element;

	public WebElement getElement(String locator) {
		try {
			String[] split = locator.split(";");
			String locatorType = split[0];
			String locatorValue = split[1];
			// System.out.println(locatorType);
			// System.out.println(locatorValue);
			if (locatorType.toLowerCase().equals("id")) {
				element = driver.findElement(By.id(locatorValue));
			} 
			else if (locatorType.toLowerCase().equals("name")) {
				element = driver.findElement(By.name(locatorValue));
			} 
			else if (locatorType.toLowerCase().equals("class") || locatorType.toLowerCase().equals("classname")) {
				element = driver.findElement(By.className(locatorValue));
			} 
			else if (locatorType.toLowerCase().equals("tag") || locatorType.toLowerCase().equals("tagname")) {
				element = driver.findElement(By.tagName(locatorValue));
			} 
			else if (locatorType.toLowerCase().equals("link") || locatorType.toLowerCase().equals("linktext")) {
				element = driver.findElement(By.linkText(locatorValue));
			} 
			else if (locatorType.toLowerCase().equals("css") || locatorType.toLowerCase().equals("cssselector")) {
				element = driver.findElement(By.cssSelector(locatorValue));
			} 
			else if (locatorType.toLowerCase().equals("partiallinktext")) {
				element = driver.findElement(By.partialLinkText(locatorValue));
			} 
			else if (locatorType.toLowerCase().equals("xpath")) {
				element = driver.findElement(By.xpath(locatorValue));
			} 
			else {
				throw new Exception("Unknown locator type'" + locatorType + "'");
			}

		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return element;
	}

	
	public void selectValueInDropdown(WebElement element, String value, boolean selectByValue, boolean selectByText)
	{
		Select select = new Select(element);
		if(selectByValue)
		{
			select.selectByValue(value);
		}
		else if(selectByText)
		{
			select.selectByVisibleText(value);
		}
		else
		{
			select.selectByIndex(Integer.parseInt(value));	
		}
	}
	
	 public String getAlphaNumericString(int n) 
	    { 
	  
	        // chose a Character random from this String 
	        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	                                    + "0123456789"
	                                    + "abcdefghijklmnopqrstuvxyz"; 
	  
	        // create StringBuffer size of AlphaNumericString 
	        StringBuilder sb = new StringBuilder(n); 
	  
	        for (int i = 0; i < n; i++) { 
	  
	            // generate a random number between 
	            // 0 to AlphaNumericString variable length 
	            int index 
	                = (int)(AlphaNumericString.length() 
	                        * Math.random()); 
	  
	            // add Character one by one in end of sb 
	            sb.append(AlphaNumericString 
	                          .charAt(index)); 
	        } 
	  
	        return sb.toString(); 
	    } 
	
}
