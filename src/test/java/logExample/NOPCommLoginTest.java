package logExample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utility.Constants;



public class NOPCommLoginTest extends BaseTest{
	
	
	
	
	@Test
	public void verifyLoginTest() {
		

		
		log.info("clear the email value");
		driver.findElement(By.cssSelector("input#Email")).clear();;
		log.info("enter email: " + Constants.nopAdminUser);
		driver.findElement(By.cssSelector("input#Email")).sendKeys(Constants.nopAdminUser);
		
		log.info("clear the password value");
		driver.findElement(By.cssSelector("input#Password")).clear();;
		log.info("enter password: " + Constants.nopAdminPass);
		driver.findElement(By.cssSelector("input#Password")).sendKeys(Constants.nopAdminPass);
		
		log.info("click on rememberMe checkbox");
		driver.findElement(By.cssSelector("input#RememberMe")).click();
		
		
		
		
	}
	
	

	

}
