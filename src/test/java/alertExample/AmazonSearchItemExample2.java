package alertExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonSearchItemExample2 {

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
		driver.get("file:///C:/Users/91995/Desktop/rajesh/testData/Test.html");
		Thread.sleep(5000);
		driver.manage().window().maximize();

	}

	
	
	
	
	@Test
	public void PromptAlertTest() throws Exception {
		
		//click on Show Me Prompt
		//input[@value='Show Me Alert']
		driver.findElement(By.xpath("//button[text()='Generate Prompt Box']")).click();
		
		
		//Alert/window/frame   ------- driver.switchTo()
		//handle an alert
		
		
		Alert promptAlert = driver.switchTo().alert();
		
		
		
		Thread.sleep(5000);
		
		//accept ----- ok
		//dismiss ----- cancel
		//getText
		//sendKeys
		
		System.out.println("Alert Text: " + promptAlert.getText());				//Please enter your name:
		System.out.println("**************: "+ promptAlert.getText().contains("Please enter your name:"));
		
		Assert.assertTrue(promptAlert.getText().contains("Please enter your name:"));
		
	
		Thread.sleep(3000);
		//sendKeys
		
		
		String name = "Kalpna";
		promptAlert.sendKeys(name);
		Thread.sleep(3000);
		
		
		
		promptAlert.accept();
		
		
		
		//validation
		String ok_cancel_validation = driver.findElement(By.cssSelector("#demoPrompt")).getText();
		System.out.println("ok_cancel_validation: " + ok_cancel_validation);					
				
		Assert.assertTrue(ok_cancel_validation.contains(name));

		
		
		
	}
	
}
