package handleWindowExample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Constants;

public class IRCTCAPP {

	WebDriver driver;

	@AfterTest
	public void closeApp() throws Exception {
		Thread.sleep(10000);
		System.out.println("close the application");
		
		driver.close();				//current focus ---- browser window closed
		driver.quit();				//close all the browser windows
	}

	@BeforeTest
	public void launchapp() throws Exception {

		System.out.println("launching app on chrome browser");

		driver = new ChromeDriver();
		
			
		
		driver.get(Constants.irctcApp);
		Thread.sleep(7000);
		driver.manage().window().maximize();

	}

	
	
	
	@Test
	public void verifyHotelFeature() throws Exception {
		
		
		String parentWindow = driver.getWindowHandle();
		
//		
//		driver.getWindowHandle();
//		driver.getWindowHandles();
		System.out.println("Window: " + parentWindow);      //2D546374B66A3BDE190AC04D46A2CCC3
		
		
		
		Thread.sleep(2000);
		//click on Hotel Link
		driver.findElement(By.partialLinkText("HOTE")).click();
		Thread.sleep(2000);
		
		
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println("window count: " + allwindow.size());				//window -2
		
		
		
		
		
		
		String win1 = (String)allwindow.toArray()[0];
		String win2 = (String)allwindow.toArray()[1];
		
		
		
		System.out.println("Window1: " + win1); 
		System.out.println("Window2: " + win2); 
		
		
		
		System.out.println("Application Title before Switch: " + driver.getTitle());
		
		
		
		
		//Switch to windows
		Thread.sleep(5000);
		driver.switchTo().window(win2);
		
		
		System.out.println("Application Title after Switch to win2: " + driver.getTitle());
		
		
		driver.findElement(By.cssSelector("a[data-bs-target='#LoginModal']")).click();
		
		
		//Switch to windows
		Thread.sleep(5000);
		driver.switchTo().window(win1);
		
		driver.findElement(By.partialLinkText("CONTACT")).click();
		
		
		
		
		//Switch to windows
		Thread.sleep(5000);
		driver.switchTo().window(win2);
		
		
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(5000);
	}
	
}
