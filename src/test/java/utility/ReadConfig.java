package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties prop;

	public ReadConfig() throws Exception {

		FileInputStream fis = new FileInputStream("./testData/coforge_data.properties");

		prop = new Properties();

		prop.load(fis);

	}

	public String getAppURL() {

		return prop.getProperty("nopComm_QA");

	}

	public String getAdminUser() {

		return prop.getProperty("email");

	}
	
	public String getAdminPass() {

		return prop.getProperty("password");

	}

}
