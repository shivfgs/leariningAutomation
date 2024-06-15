package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver rdriver) {

			driver = rdriver;
			
			
			PageFactory.initElements(rdriver, this);
			
			System.out.println("=================PageFactory======================");

	}

	// Identification
	
	
	
//
//	By txtEmail = By.cssSelector("input#Email");
//	By txtPass = By.cssSelector("input#Password");
//	By chkRem = By.cssSelector("input#RememberMe");
//	By btnLogin = By.tagName("button");
//	By btnLogout = By.partialLinkText("Logo");
//	By lblEmail = By.xpath("//label[text()='Email:']");
//	
	

	
	//pagefactory Concept
	
	//-----------------------------------------
	//ruto application - page Object Model
	
	
	@FindBy(how = How.CSS, using="input#Email")
	private WebElement email;
	
	
	
	public void enterOnEmail(String emailValue){
		email.clear();
		email.sendKeys(emailValue);
	}
	
	
	
	
	
	
	
	
	
	//----------------------------------------
	
	
	@FindBy(how = How.CSS, using = "input#Email")
	WebElement txt_Email1;
	
	
	@FindBy(css = "input#Email")
	WebElement txt_Email;
	
	
	@FindBy(css = "input#Password")
	WebElement txt_Pass;
	
	
	@FindBy(css = "input#RememberMe")
	WebElement chk_Rem;
	
	
	@FindBy(tagName  = "button")
	WebElement btn_Login;
	
	
	@FindBy(partialLinkText = "Logo")
	WebElement btn_Logout;
	
	

	// Methods
	
//	public void enterEmailDetails(String email) {
//
//		txt_Email.clear();
//		txt_Email.sendKeys(email);
//
//	}
	

	public void enterEmail(String email) {

		txt_Email.clear();
		txt_Email1.sendKeys(email);

	}

	public void enterPass(String pwd) {

		txt_Pass.clear();
		txt_Pass.sendKeys(pwd);

	}

	public void clickRemCheckbox() {

		chk_Rem.click();

	}

	public void clickLoginButton() {

		btn_Login.click();

	}

	public void clickLogoutButton() {

		btn_Logout.click();

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

		return txt_Email.isDisplayed();

	}

}
