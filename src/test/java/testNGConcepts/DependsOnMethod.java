package testNGConcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test(priority = 1)
	public void loginTest() {
		System.out.println("Logging into application");
		Assert.assertTrue(false);
	}
	
	@Test(priority = 2,dependsOnMethods = "loginTest")
	public void bookTickets() {
		System.out.println("Booking Tickets");
		Assert.assertEquals("abcd", "Booking");
	}
	
	@Test(priority = 3,dependsOnMethods = {"loginTest","bookTickets"})
	public void logout() {
		System.out.println("Logging out from application");
	}

}
