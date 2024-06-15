package locatorExample;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMAppLogin {
	
	//ctrl+shift+O
	
	@Test
	public void verifyLogin() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		//sync issue
		Thread.sleep(3000);
		
		
		
		//locator
		//input box
//		driver.findElement(By.name("username")).sendKeys("iphone 15 pro");
		
		
		
		driver.findElement(By.tagName("input")).sendKeys("iphone 15 pro");
		
		
		
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
