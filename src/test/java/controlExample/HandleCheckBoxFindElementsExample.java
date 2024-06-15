package controlExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleCheckBoxFindElementsExample extends BaseTest{
	
	
	
	
	@Test
	public void verifyCheckBoxTest() {
		
//		WebElement chk = driver.findElement(By.cssSelector("[type=\"checkbox\"]"));				//multiple match ---- 3
//		chk.click();
		
		
		
		
		List<WebElement>  allChk = driver.findElements(By.cssSelector("[type=\"checkbox\"]"));
		
		
		System.out.println("checkbox count: " + allChk.size());  				//3
		
		
		
		
		
//		allChk.get(1).click();
		
		
		
		for (int i = 0; i < allChk.size(); i++) {
			
			allChk.get(i).click();
		}
		
		
		
	}
	
	

	

}
