package controlExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
	
	WebDriver driver;
	
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
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
	}
	
	


}
