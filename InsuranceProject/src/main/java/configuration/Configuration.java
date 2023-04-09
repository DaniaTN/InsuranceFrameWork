package configuration;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configuration {

	public static String getPropertyValue(String propertyName) {
		FileReader input =null;
		try {
			input = new FileReader("/Users/kaleemahmad/eclipse-workspace/InsuranceProject/src/main/java/configuration/Config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Properties p = new Properties();
		
		try {
			p.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p.getProperty(propertyName);
		
	}

}
