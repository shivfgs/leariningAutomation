package locatorExample;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NOPExample {
	
	//ctrl+shift+O
	
	@Test
	public void verifyLogin() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		
		
		//locator
		//input box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15 pro");
		
		//search button
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		//validation step
		String actualTile = driver.getTitle();
		String expectedTile = "Amazon.in : iphone 15";
		
		Assert.assertEquals(expectedTile, actualTile);
//		Assert.assertEquals("Amazon.in : iphone 15", actualTile);
		
		
		
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
