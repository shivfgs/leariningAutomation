package takeScreenshotExample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchItemExample2 {
	
	//ctrl+shift+O
	
	@Test
	public void verifySearchItem() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		//sync issue
		Thread.sleep(3000);
		
		
		WebElement txt_searchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		txt_searchBox.sendKeys("iphone 15 pro");
		WebElement btn_Go = driver.findElement(By.cssSelector("#nav-search-submit-button"));
		btn_Go.click();
		
		Thread.sleep(3000);
		
		//javascript
		
		getScreenshot(driver, "iphone 15 pro");
		
		
		
		Thread.sleep(5000);
//		driver.close();
		
	}
	
	
	public void getScreenshot(WebDriver driver, String fName) throws Exception {
		
		TakesScreenshot TS = (TakesScreenshot) driver;
		
		//capture a screenshot
		File screenshotFile = TS.getScreenshotAs(OutputType.FILE);
		
		File targetLocation = new File("C:\\Users\\91995\\eclipse-workspace\\com.coforge.weekendApril.banking\\screenshot\\AmazonSearchItem.png");
		File targetLocation1 = new File("C:/Users/91995/eclipse-workspace/com.coforge.weekendApril.banking/screenshot/AmazonSearchItem.png");
		File targetLocation2 = new File("./screenshot/"+fName+ "_Coforge.png");
		
		
		FileUtils.copyFile(screenshotFile, targetLocation2);
		
	}
	
	
	

}
