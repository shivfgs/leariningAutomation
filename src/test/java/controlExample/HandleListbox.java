package controlExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleListbox extends BaseTest{
	
	
	
	
	@Test
	public void verifyCountryListTest() throws Exception {
		
		WebElement countryList = driver.findElement(By.cssSelector("[name=\"FromLB\"]"));				//multiple match ---- 3
		
		
		//Select Class in Selenium
		
		
		Select list = new Select(countryList);
		
		
		
		
		System.out.println("is dropdown accept multiple selectipn or not: " + list.isMultiple());				//true
		
		Assert.assertEquals(list.isMultiple(), true);
		Assert.assertTrue(list.isMultiple());
		
		
		
		list.selectByIndex(0); 						//USA
		list.selectByValue("Japan");				//Japan
		list.selectByVisibleText("India");			//India
		
		
		
		Thread.sleep(5000);
		
		
		
		list.deselectAll(); 						//USA
		
		Thread.sleep(5000);
		
		list.selectByIndex(1); 						//Russia
		list.selectByValue("Japan");				//Japan
		list.selectByVisibleText("India");			//India
		
		
		Thread.sleep(5000);
		
		list.deselectByValue("Russia");				//Japan
		list.deselectByVisibleText("Japan");
		
		
		
	}
	
	
	
	@Test
	public void verifyCarListTest() throws Exception {
		
		WebElement carList = driver.findElement(By.tagName("select"));				//multiple match ---- 3
		
		
		//Select Class in Selenium
		
		
		Select list = new Select(carList);
		
		System.out.println("is dropdown accept multiple selectipn or not: " + list.isMultiple());				//false
		
		Assert.assertEquals(list.isMultiple(), false);
		Assert.assertFalse(list.isMultiple());
		
		
		
		list.selectByIndex(1); 						//SAAB
		Thread.sleep(1000);
		list.selectByValue("USA");					//Volvo
		Thread.sleep(1000);
		list.selectByVisibleText("Toyota");			//Toyota
		Thread.sleep(1000);
		list.selectByVisibleText("Audi");			//Audi
		
		
		
		
		
		
		
	}
	

	

}
