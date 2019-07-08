package Automation.BaseClass;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Automation.UtilitiesClasses.ReadPropertiesFiles;



public class InitializeWebDriver{
	
	public static WebDriver driver;
    private static Properties prop;
	private static InitializeWebDriver wd;
	String projectDir = System.getProperty("user.dir");
	
	
	@SuppressWarnings("static-access")
	public InitializeWebDriver() {
		ReadPropertiesFiles propFilesObj = new ReadPropertiesFiles();
		prop = propFilesObj.prop;
		InitilizeDriver();
		
	}
	
	
	private void InitilizeDriver()
	{
		if(wd==null)
		{
			if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", projectDir+"/src/test/resources/drivers/chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("start-maximized");
			    driver = new ChromeDriver(options);
			}
			if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", projectDir+"/src/test/resources/drivers/geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
			}
			if(prop.getProperty("browser").equalsIgnoreCase("IE"))
			{
				System.setProperty("webdriver.ie.driver", projectDir+"/src/test/resources/drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();

			}
			
			
		}
	}
	
	

}
