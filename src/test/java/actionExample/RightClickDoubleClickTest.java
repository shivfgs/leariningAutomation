package actionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightClickDoubleClickTest {

	WebDriver driver;

	@AfterTest
	public void closeApp() throws Exception {
		Thread.sleep(7000);
		System.out.println("close the application");
		driver.close();
	}

	@BeforeTest
	public void launchapp() throws Exception {

		System.out.println("launching app on chrome browser");

		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(5000);
		driver.manage().window().maximize();

	}

	
	
	
	@Test
	public void verifyRightClickFeature() throws Exception {
		
		
			Actions act = new Actions(driver);
		
		
		
			//mouse hover operation
		
			WebElement rightClickBtn = driver.findElement(By.xpath("//span[contains(text(),'right')]"));	
		
				
			//right click operation
			act.contextClick(rightClickBtn).perform();
		
		
	}
	
	@Test
	public void verifyDoubleClickFeature() throws Exception {
		
		
			Actions act = new Actions(driver);
		
		
		
			//mouse hover operation
		
			WebElement doubleClickBtn = driver.findElement(By.xpath("//button[contains(text(),'Doub')]"));	
		
				
			//right click operation
			act.doubleClick(doubleClickBtn).perform();
			
			
			Thread.sleep(4000);
			
			driver.switchTo().alert().dismiss();
		
		
	}
	
}
