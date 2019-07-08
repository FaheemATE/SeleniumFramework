package Automation.UtilitiesClasses;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertiesFiles {
	
	public static Properties prop;
	String projectDir = System.getProperty("user.dir");
	File filePath;
	FileInputStream file;
		
	
	public ReadPropertiesFiles()
	{
		try {
	    //loading testconfig file		
		prop = new Properties();
		filePath = new File(projectDir+"/src/test/resources/propertyfiles/TestConfigFile.properties");
		file = new FileInputStream(filePath);
		prop.load(file);
		//loading registrationform file
		filePath = new File(projectDir+"/src/test/resources/propertyfiles/RegistrationFormElements.properties");
		file = new FileInputStream(filePath);
		prop.load(file);
		}
		catch (Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}
		
	}

}
