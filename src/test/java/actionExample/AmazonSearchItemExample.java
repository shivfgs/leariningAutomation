package actionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonSearchItemExample {

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
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.manage().window().maximize();

	}

	
	
	
	@Test
	public void verifyWishListFeature() throws Exception {
		
		
			Actions act = new Actions(driver);
		
		
		
			//mouse hover operation
		
			WebElement SignIn = driver.findElement(By.xpath("//span[contains(text(),'Hello, sign in')]"));	
		
			act.moveToElement(SignIn).build().perform();
//			act.moveToElement(SignIn).perform();
			
//			//click on Wishlist
			driver.findElement(By.xpath("//span[contains(text(),'Create a Wish')]")).click();		
		
		
	}
	
}
