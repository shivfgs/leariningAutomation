package headLessMode;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Constants;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class NOPCommLogin2 {
	
WebDriver driver;
	
	@BeforeTest
	public void setup() throws Exception {
		
		System.out.println("launching app");
		
		
		//Constants.headless;
		
		
		if(Constants.headless) {
			
			
			//execution in headless
			
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--headless");
			
			
			
			//option.addArguments("--ignore-certificate-errors");
			//option.addArguments("--headless", "--window-size=1920,1200");
			//option.addArguments("--headless");
			
			
			
			driver = new ChromeDriver(option);	
			
		}
		else {
			
			driver = new ChromeDriver();	
			
		}
		
		
		
		
		//chormeOption
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		
		
		
		//option.addArguments("--ignore-certificate-errors");
		//option.addArguments("--headless", "--window-size=1920,1200");
		//option.addArguments("--headless");
		
		
		
		driver = new ChromeDriver(option);						//launch chrome browser
		
		
		
		//driver = new ChromeDriver();	
		
		
		
		
		
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		System.out.println("application launched sucessfully.....");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	

	
	@AfterTest
	public void teardown() throws Exception {

		
		
		System.out.println("closing app");
		Thread.sleep(5000);
		driver.close();
		
	}
	
	@Test
	public void login() throws Exception {
		
		//driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		
		driver.findElement(By.cssSelector("input#RememberMe")).click();
		
		
		driver.findElement(By.tagName("button")).click();
		
		
		Thread.sleep(3000);
		System.out.println("application title after login: " +driver.getTitle());
		
		
		driver.findElement(By.partialLinkText("Logo")).click();
		
		
		Thread.sleep(3000);
		System.out.println("application title after logout: " +driver.getTitle());
		
		
		Assert.assertTrue(driver.getTitle().contains("Login"));
		
//		//Assert.assertTrue(driver.getTitle().contains(""));
//		
//		
//		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File targetLocation = new File(".\\coforge_screenshot\\Amazon_Headless_.png");

		FileUtils.copyFile(screenshotFile, targetLocation);
		
		
	}

}
