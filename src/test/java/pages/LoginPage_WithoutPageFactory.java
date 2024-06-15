package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage_WithoutPageFactory {

	WebDriver driver;

	public LoginPage_WithoutPageFactory(WebDriver rdriver) {

//		this.driver = driver;

		driver = rdriver;

	}

	// Identification
	
	
	

	By txtEmail = By.cssSelector("input#Email");
	By txtPass = By.cssSelector("input#Password");
	By chkRem = By.cssSelector("input#RememberMe");
	By btnLogin = By.tagName("button");
	By btnLogout = By.partialLinkText("Logo");
	By lblEmail = By.xpath("//label[text()='Email:']");
	
	

	
	//pagefactory Concept
	
//	WebElement txt_Email;
	
	
	
	

	// Methods
	
//	public void enterEmailDetails(String email) {
//
//		txt_Email.clear();
//		txt_Email.sendKeys(email);
//
//	}
	

	public void enterEmail(String email) {

		driver.findElement(txtEmail).clear();
		driver.findElement(txtEmail).sendKeys(email);

	}

	public void enterPass(String pwd) {

		driver.findElement(txtPass).clear();
		driver.findElement(txtPass).sendKeys(pwd);

	}

	public void clickRemCheckbox() {

		driver.findElement(chkRem).click();

	}

	public void clickLoginButton() {

		driver.findElement(btnLogin).click();

	}

	public void clickLogoutButton() {

		driver.findElement(btnLogout).click();

	}
	
	
	
	
	public void loginWithCred(String email, String pwd) {
		
		enterEmail(email);
		enterPass(pwd);
		clickLoginButton();
		
	}
	
	
	
	
	public void verifyApplicationTitle(String expTitle, String errorMessage) throws InterruptedException {

		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), expTitle);

	}
	
	public void verifyApplicationTitle(String expTitle) throws InterruptedException {

		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), expTitle);

	}
	

	public boolean verifyEmailPresent() {

		return driver.findElement(txtEmail).isDisplayed();

	}

}
