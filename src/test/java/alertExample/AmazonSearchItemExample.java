package alertExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonSearchItemExample {

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

	
	//@Test
	public void SimpleAlertTest() throws Exception {
		
		//click on Show Me Alert
		//input[@value='Show Me Alert']
		driver.findElement(By.xpath("//input[@value='Show Me Alert']")).click();
		
		
		//Alert/window/frame   ------- driver.switchTo()
		//handle an alert
		
		Thread.sleep(5000);
		
		//accept ----- ok
		//dismiss ----- cancel
		//getText
		//sendKeys
		
		System.out.println("Alert Text: " + driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
		
		driver.switchTo().alert().dismiss();
		
		
		
		
		
	}
	
	
	//@Test
	public void ConfirmAlertTest() throws Exception {
		
		//click on Show Me Alert
		//input[@value='Show Me Alert']
		driver.findElement(By.xpath("//button[text()='Show Me Confirmation']")).click();
		
		
		//Alert/window/frame   ------- driver.switchTo()
		//handle an alert
		
		
		Alert confirmAlert = driver.switchTo().alert();
		
		
		
		Thread.sleep(5000);
		
		//accept ----- ok
		//dismiss ----- cancel
		//getText
		//sendKeys
		
		System.out.println("Alert Text: " + confirmAlert.getText());
		
		//Press 'OK' or 'Cancel' button! --------------  'OK' or 'Cancel
		System.out.println("**************: "+ confirmAlert.getText().contains("'OK' or 'Cancel"));
		
		
		
		
		Assert.assertTrue(confirmAlert.getText().contains("'OK' or 'Cancel"));
		
		
//		driver.switchTo().alert().accept();
		
		
		confirmAlert.accept();
//		confirmAlert.dismiss();
		
		
		
		//validation
		String ok_cancel_validation = driver.findElement(By.cssSelector("div#demo")).getText();
		
		System.out.println("ok_cancel_validation: " + ok_cancel_validation);					//You pressed Cancel!
		
		Assert.assertTrue(ok_cancel_validation.contains("Cancel"));
		
		
		
	}
	
	
	
	@Test
	public void PromptAlertTest() throws Exception {
		
		//click on Show Me Prompt
		//input[@value='Show Me Alert']
		driver.findElement(By.xpath("//button[text()='Show Me Prompt']")).click();
		
		
		//Alert/window/frame   ------- driver.switchTo()
		//handle an alert
		
		
		Alert promptAlert = driver.switchTo().alert();
		
		
		
		Thread.sleep(5000);
		
		//accept ----- ok
		//dismiss ----- cancel
		//getText
		//sendKeys
		
		System.out.println("Alert Text: " + promptAlert.getText());
		System.out.println("**************: "+ promptAlert.getText().contains("Your Name Please"));
		
		Assert.assertTrue(promptAlert.getText().contains("Your Name Please"));
		
	
		Thread.sleep(3000);
		//sendKeys
		promptAlert.sendKeys("abhishek k Gupta");
		Thread.sleep(3000);
		
		
		
		promptAlert.accept();

		
		
		
	}
	
}
