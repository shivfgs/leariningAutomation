package controlExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleInputBox2 extends BaseTest{
	
	
	
	
	@Test
	public void verifyInputBoxTest() 
	
	
	{
		
		WebElement txt_lastName = driver.findElement(By.name("lname"));

		System.out.println("isDisplayed: " + txt_lastName.isDisplayed());
		System.out.println("isEnabled: " + txt_lastName.isEnabled());
		
		
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
//		JS.executeScript("alert('hello everyone, happy learning!!')");
		JS.executeScript("arguments[0].value='enter last name'", txt_lastName);
		
		
		
		
		//txt_lastName.sendKeys("enter last name");
		
		
	}
	
	

	

}
