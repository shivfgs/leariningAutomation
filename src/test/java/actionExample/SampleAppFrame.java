package actionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleAppFrame {

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
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(5000);
		driver.manage().window().maximize();

	}

	
	
	
	@Test
	public void verifyImageFeature() throws Exception {
		
			//Alert/Frame/Window
		
			//handle frame
		
			//index
//			driver.switchTo().frame(0);
//			//id or name
//			driver.switchTo().frame("name or ID");
			
			WebElement myFrame = driver.findElement(By.cssSelector("[data-src*='photo']"));
			driver.switchTo().frame(myFrame);
		
			
			//===========================================================================
		
		
			// img are inside frame
			WebElement img3 = driver.findElement(By.cssSelector("img[src*='tatras3']"));
			WebElement img4 = driver.findElement(By.cssSelector("img[src*='tatras4']"));
			WebElement trash = driver.findElement(By.cssSelector("div#trash"));
			
			
			
			//Call perform() at the end of the method chain to actually perform the actions.
			
			Actions act = new Actions(driver);
			
			
			
			//app1
			act.dragAndDrop(img3, trash).perform();
			
			
			Thread.sleep(3000);
			
			//A convenience method that performs click-and-hold at the location of the source element, 
			//moves to the location of the target element, then releases the mouse.
			
			//app2
//			act.clickAndHold(img4).moveToElement(trash).release().build().perform();
			act.clickAndHold(img4).moveToElement(trash).release().perform();
			
			
			
			
		
	}
	
}
