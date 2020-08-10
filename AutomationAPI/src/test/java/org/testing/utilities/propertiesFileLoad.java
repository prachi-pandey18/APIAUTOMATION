package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesFileLoad {
	
	public static Properties propertiesFile() throws IOException {
		
		File file= new File("../AutomationAPI/Environment.properties");
		
		FileInputStream fs= new FileInputStream(file);
		Properties pr = new Properties();
		pr.load(fs);
		return pr;
	}
	
	

}
