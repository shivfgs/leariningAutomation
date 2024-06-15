package nopExample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NOPLocator {
	
	
	@Test
	public void verifyLoginfeature() throws Exception {
		
		//launch chrome browser
		WebDriver driver = new ChromeDriver();
		
		//launch app
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		Thread.sleep(5000);
		
		//email - id

		WebElement txtEmail = driver.findElement(By.id("Email"));
		
		txtEmail.clear();
		Thread.sleep(1000);
		txtEmail.sendKeys("admin@yourstore.com");
		
		//password - class
		driver.findElement(By.className("password")).clear();
		driver.findElement(By.className("password")).sendKeys("admin");
		
		
		//checkbox - name
		driver.findElement(By.name("RememberMe")).click();
		
		
		//login - button 
		driver.findElement(By.tagName("button")).click();
		
		
		Thread.sleep(3000);
		
		//validation steps
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Dashboard / nopCommerce administration";
		
		
		System.out.println("application title after login: " + actualTitle );
		
		
		
//		//logout - linkText ------ exact text   ---- tagname : a  ,  text 
//		driver.findElement(By.linkText("Logout")).click();
		
		
		//logout - partiallinkText ------ exact text   ---- tagname : a  ,  text 
		driver.findElement(By.partialLinkText("ogou")).click();
		
		
		Thread.sleep(3000);
		System.out.println("application title after logout: " + driver.getTitle() );
		
		
		Thread.sleep(5000);
		
		//close the browser
		driver.close();
		driver.quit();
		
	}
	
	

}
