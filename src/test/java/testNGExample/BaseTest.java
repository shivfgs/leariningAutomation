package testNGExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	WebDriver driver;
	
	@AfterTest
	public void closeApp() throws Exception {
		Thread.sleep(5000);
		System.out.println("close the application");
		driver.close();
	}
	
	
	@BeforeTest
	public void launchapp() {
		
		System.out.println("launching app on chrome browser");
		
		driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/org.testng/testng");
		
	}
	
	

}
