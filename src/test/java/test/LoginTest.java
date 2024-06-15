package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utility.Constants;

public class LoginTest extends BaseTest{
	
	
	
	
	@Test
	public void verifyLoginFeature() throws Exception {
		
		
		
		//Actions act = new Actions(driver);
		

		lp.enterEmail(Constants.nopAdminUser);
		

		
		lp.enterPass(Constants.nopAdminPass);
		lp.clickRemCheckbox();
		lp.clickLoginButton();
		
		//validation Step
		lp.verifyApplicationTitle("Dashboard / nopCommerce administration");
		
		
		lp.clickLogoutButton();
		
		
		//validation Step
		lp.verifyApplicationTitle("Your store. Login", "validation for application title get failed after sucessful logout.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


}
	
	
	
	
	
}
