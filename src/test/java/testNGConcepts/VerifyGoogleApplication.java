package testNGConcepts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyGoogleApplication {
	
	@Test
	public void launchGoogleApplication() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//Launch application
		driver.get("http://www.google.ca");
		
		String appTitle = driver.getTitle();
		
		/*if (appTitle.equalsIgnoreCase("Facebook")) {
			System.out.println("Pass --> Google application is opened");
		} else {
			System.out.println("Fail --> Google application is not opened");
		}*/
		
		//Hard Assertion
		AssertJUnit.assertEquals(appTitle, "Google"); //Method Overloading
		
		System.out.println("Statement after failure");
		
		driver.quit();
	}

}
