package logExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Constants;

public class BaseTest {
	
	WebDriver driver;
	Logger log;
	
	@AfterTest
	public void closeApp() throws Exception {
		Thread.sleep(5000);
		
		
		
		log.info("close the application");
		driver.close();
	}
	
	
	@BeforeTest
	public void launchapp() throws Exception {
		
		
		
		log = Logger.getLogger("NOP Comm Application");
		PropertyConfigurator.configure(".\\testData\\log4j.properties");
		
		
		
		log.info("===============info===============");
		log.warn("===============warn===============");
		log.error("===============error===============");
		
		log.info("launching chrome browser");
		
		driver = new ChromeDriver();
		log.info("launching application: " + Constants.nopComm);
		driver.get(Constants.nopComm);					//https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
	}
	
	


}
