package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfigFile {

	public static void main(String[] args) throws Exception {
		
		
//		FileInputStream fis1 = new FileInputStream("C:\\Users\\91995\\eclipse-workspace\\com.coforge.weekendApril.banking\\testData\\coforge_data.properties");
//		FileInputStream fis1 = new FileInputStream("C:/Users/91995/eclipse-workspace/com.coforge.weekendApril.banking/testData/coforge_data.properties");
//		FileInputStream fis3 = new FileInputStream("./testData/coforge_data.properties");
		
		FileInputStream fis = new FileInputStream("./testData/coforge_data.properties");
		
		
		Properties prop = new Properties();
		
		
		prop.load(fis);
		
		
		String appURL = prop.getProperty("nopComm_QA");
		
		
		System.out.println("Application URL: " + appURL);
		System.out.println("userName: " + prop.getProperty("email"));
		System.out.println("password Details" + prop.getProperty("password"));

	}

}
