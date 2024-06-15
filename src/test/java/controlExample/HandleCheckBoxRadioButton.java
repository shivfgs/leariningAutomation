package controlExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleCheckBoxRadioButton extends BaseTest{
	
	
	
	
	@Test
	public void verifyCheckBoxTest() {
		
		WebElement chk_Boat = driver.findElement(By.cssSelector("[value=\"Boat\"]"));				//multiple match ---- 3
		
		System.out.println("=================before Selection====================");
		System.out.println("isDisplayed: " + chk_Boat.isDisplayed());
		System.out.println("isEnabled: " + chk_Boat.isEnabled());
		System.out.println("isSelected: " + chk_Boat.isSelected());
		
		
		
		chk_Boat.click();
		
		
		System.out.println("=================after Selection====================");
		System.out.println("isDisplayed: " + chk_Boat.isDisplayed());
		System.out.println("isEnabled: " + chk_Boat.isEnabled());
		System.out.println("isSelected: " + chk_Boat.isSelected());
		
		
		
	}
	
	
	@Test
	public void verifyradioButtonTest() {
		
		WebElement rd_female = driver.findElement(By.cssSelector("[value*=\"fe\"]"));				
		
		System.out.println("=================before Selection====================");
		System.out.println("isDisplayed: " + rd_female.isDisplayed());
		System.out.println("isEnabled: " + rd_female.isEnabled());
		System.out.println("isSelected: " + rd_female.isSelected());
		
		
		
		rd_female.click();
		
		
		System.out.println("=================after Selection====================");
		System.out.println("isDisplayed: " + rd_female.isDisplayed());
		System.out.println("isEnabled: " + rd_female.isEnabled());
		System.out.println("isSelected: " + rd_female.isSelected());
		
		
		
	}
	

	

}
