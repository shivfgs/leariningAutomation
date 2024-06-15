package nopExample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NOPLoginLogout {
	
	
	@Test
	public void verifyLoginfeature() {
		
		//launch chrome browser
		WebDriver driver = new ChromeDriver();
		
//		class
//		id
//		tagname
//		name
//
//
//		linkText
//		partialLinkText
//
//
//		xpath
//		css
		
		
		
		
		//launch app
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		
//		String x = "Sushil";
		
		//perform action on element
//		driver.findElement(By.tagName("input"));
//		driver.findElement(By.id("RememberMe"));
//		driver.findElement(By.name("RememberMe"));
		
		WebElement chk_rem = driver.findElement(By.name("RememberMe"));
		chk_rem.click();
		
		
		
	}
	
	

}
