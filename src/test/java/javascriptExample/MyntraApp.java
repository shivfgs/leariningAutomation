package javascriptExample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraApp {
	
	//ctrl+shift+O
	
	@Test
	public void verifyLogin() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		
		//sync issue
		Thread.sleep(3000);
		
		
		WebElement ele_returnPolicy = driver.findElement(By.xpath("//strong[contains(text(),'14days')]"));
		
		
		//javascript
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("arguments[0].scrollIntoView()", ele_returnPolicy);
		
		
//		
//		//click on Submit button
//		driver.findElement(By.cssSelector("#submit")).click();
		
		
		
		Thread.sleep(5000);
//		driver.close();
		
	}

}
