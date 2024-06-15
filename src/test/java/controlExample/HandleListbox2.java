package controlExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleListbox2 extends BaseTest {

	@Test
	public void verifyCountryListTest() throws Exception {

		WebElement Germany_countryList = driver.findElement(By.cssSelector("[value=\"Germany\"]")); // multiple match
																									// ---- 3

		Germany_countryList.click();
		// Select Class in Selenium

	}

	@Test
	public void verifyCarListTest() throws Exception {

		WebElement Singapore_carList = driver.findElement(By.cssSelector("[value=\"Singapore\"]")); // multiple match
																									// ---- 3

		// Select Class in Selenium
		Singapore_carList.click();

	}

}
