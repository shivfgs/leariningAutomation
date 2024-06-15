package syncExample;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleAppSyncIssue2 {
	
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
		driver.get("http://only-testing-blog.blogspot.com/2014/01/new-testing.html?");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void enterValue() throws Exception {
		
//		Thread.sleep(20000);
		
		
		
		//conditional wait
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.alertIsPresent());
//		
		
		
		Alert simeplAlert = driver.switchTo().alert();
		
		System.out.println("********Alert Text ******** : " +simeplAlert.getText());
		
		Assert.assertEquals(simeplAlert.getText(), "Now you can click on submit query button!");
		
		
		
		simeplAlert.dismiss();
		
		
		
		
	}
	


}
