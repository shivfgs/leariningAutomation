package testNGExample;

import org.testng.annotations.Test;

public class TestNGPriority extends BaseTest{
	
	
	//WebDriver driver;
	
	//Junit
	//testNG  
	
	//precondition  ------ before ------- BeforeSuite   beforeTest beforeClass beforeMethod
	//testcase      ----- test
	//postcondition ----- after
	
	//execution workflow   ----- login ------ addItem ----- payment ---- logout
	
	
	//priority Example
	
	
	//highest negative number having highest priority
	// by default priority is 0
	//if priority is same, execution as per naming conv
	
	
	
	//login (-100) ------- addItems (0) ----- cancelOrder (2)----- updateOrder(2)------ payment(3) ------logout (10)
	
	
	
	@Test(priority = 2)
	public void updateOrder() {
		
		System.out.println("updateOrder test case");
	}
	
	
	
	
	
	
	@Test(priority = -100)
	public void login() {
		
		System.out.println("login test case");
	}
	
	@Test(priority = 10)
	public void logout() {
		
		System.out.println("logout test case");
	}
	
	
	@Test
	public void addItems() {
		
		System.out.println("addItems to kart test case");
	}
	
	
	@Test(priority = 2)
	public void cancelOrder() {
		
		System.out.println("cancelOrder test case");
	}
	
	
	
	
	
	
	@Test(priority = 3)
	public void payment() {
		
		System.out.println("payment test case");
	}

	

}
