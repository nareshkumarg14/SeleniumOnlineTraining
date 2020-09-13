package testNGConcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DifferentAnnotations {
	
	@BeforeTest
	public void connectToDB() {
		System.out.println("Before Test --> Connect to DB");
	}
	
	@AfterTest
	public void disconnectFromDB() {
		System.out.println("After Test --> Disconnect from DB");
	}
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Before Class --> Open Browser");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("After Class --> Close Browser ");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("Before Method --> Login into application");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("After Method --> Logging out from application");
	}
	
	@Test
	public void bookTickets() {
		System.out.println("Booking Tickets");
	}
	
	@Test
	public void cancelTickets() {
		System.out.println("Cancelling Tickets");
	}
	
	@Test
	public void faxTickets() {
		System.out.println("Faxing Tickets");
	}

}
