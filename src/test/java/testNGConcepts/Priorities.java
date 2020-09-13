package testNGConcepts;

import org.testng.annotations.Test;

public class Priorities {
	
	@Test(priority = -2)
	public void B() {
		System.out.println("Logging into application");
	}
	
	@Test(priority = -2)
	public void C() {
		System.out.println("Logging into application");
	}
	
	@Test(priority = 0)
	public void Z() {
		System.out.println("Booking Tickets");
	}
	
	@Test(priority = 10)
	public void A() {
		System.out.println("Logging out from application");
	}

}
