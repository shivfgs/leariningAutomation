package controlExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleInputBox extends BaseTest{
	
	
	
	
	@Test
	public void verifyInputBoxTest() 
	
	
	{
		
		//firstname
//		WebElement txt_firstName = driver.findElement(By.cssSelector("name='fname'"));
		WebElement txt_firstName = driver.findElement(By.cssSelector("[name=\"fname\"]"));
		
		
		txt_firstName.isDisplayed();
		txt_firstName.isEnabled();
		txt_firstName.sendKeys("enter your name");
		
		
		System.out.println("isDisplayed: " + txt_firstName.isDisplayed());
		System.out.println("isEnabled: " + txt_firstName.isEnabled());
		
		
		System.out.println("================================================================");
		
		
		WebElement txt_lastName = driver.findElement(By.name("lname"));
//		txt_lastName.sendKeys("enter last name");
		
		
		
		if(txt_lastName.isEnabled()) {
			
			
			txt_lastName.sendKeys("enter last name");
			
		}
		
		
		
		
		
		System.out.println("isDisplayed: " + txt_lastName.isDisplayed());
		System.out.println("isEnabled: " + txt_lastName.isEnabled());
		
	}
	
	

	

}
