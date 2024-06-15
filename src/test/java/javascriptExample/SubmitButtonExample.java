package javascriptExample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitButtonExample {
	
	//ctrl+shift+O
	
	@Test
	public void verifyLogin() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		
		//sync issue
		Thread.sleep(3000);
		
		
		WebElement Submit = driver.findElement(By.cssSelector("#submit"));
		
		
		//javascript
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
//		JS.executeScript("alert('hello everyone, happy learning!!')");
		JS.executeScript("arguments[0].click()", Submit);
		
		
//		
//		//click on Submit button
//		driver.findElement(By.cssSelector("#submit")).click();
		
		
		
		Thread.sleep(5000);
//		driver.close();
		
	}

}
