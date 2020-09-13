package testNGConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderConcept {
	
	@Test(dataProvider = "getData")
	public void login(String username, String password) {
		//System.out.println(username + "--------------------" + password);
		SoftAssert sa = new SoftAssert();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.surveymonkey.com/user/sign-in/");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String loggedInUser = driver.findElement(By.id("userAcctTab_MainMenu")).getText();
		String loggedInUser1 = loggedInUser.trim();
		sa.assertEquals(loggedInUser1, username,"Username is not matching");
		sa.assertAll();
		driver.quit();
	}
	
	@DataProvider
	public Object[][] getData() {
		Object userDetails[][] = new Object[2][2];
		userDetails[0][0] = "seleniumtraining1";
		userDetails[0][1] = "selenium1234";
		
		userDetails[1][0] = "seleniumtraining2";
		userDetails[1][1] = "selenium1234";
		
		return userDetails;
		
	}

}
