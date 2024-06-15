package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.ReadConfig;

public class NOPCommLogin {
	
	WebDriver driver;
	ReadConfig conf;

	@AfterTest
	public void closeApp() throws Exception {
		Thread.sleep(7000);
		System.out.println("close the application");
		driver.close();
	}

	@BeforeTest
	public void launchapp() throws Exception {

		System.out.println("launching app on chrome browser");

		
		conf = new ReadConfig();
		
		
		driver = new ChromeDriver();
		driver.get(conf.getAppURL());
		Thread.sleep(5000);
		driver.manage().window().maximize();

	}

	
	
	@Test
	public void verifyLogin() throws Exception {
		
		
		
		driver.findElement(By.name("Email")).clear();;
		
		Thread.sleep(3000);
		driver.findElement(By.name("Email")).sendKeys(conf.getAdminUser());
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input#Password")).clear();;
		driver.findElement(By.cssSelector("input#Password")).sendKeys(conf.getAdminPass());
		
		driver.findElement(By.tagName("button")).click();
		
		
		
		
		
	
		
	}

}
