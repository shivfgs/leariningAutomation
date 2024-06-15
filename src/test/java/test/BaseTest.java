package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.LoginPage;
import utility.Constants;

public class BaseTest {
	
	WebDriver driver;
	public LoginPage lp;
	
	@AfterTest
	public void closeApp() throws Exception {
		Thread.sleep(5000);
		System.out.println("close the application");
		driver.close();
	}
	
	
	@BeforeTest
	public void launchapp() throws Exception {
		
		System.out.println("launching app on chrome browser");
		
		driver = new ChromeDriver();
		
		
		//Pages reference variable
		lp = new LoginPage(driver);
		
		
		
		
		
		System.out.println(Constants.nopComm);
		driver.get(Constants.nopComm);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
	}
	
	

}
