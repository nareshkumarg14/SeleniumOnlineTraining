package testNGConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RealTimeCode {
	WebDriver driver;
	//Page Objects
	By username = By.id("username");
	By password = By.id("password");
	By loginBtn = By.xpath("//button[@type='submit']");
	By signUpLink = By.linkText("Sign Up");
	By dashboardText = By.linkText("Dashboard");
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.surveymonkey.com/user/sign-in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	//Test1
	@Test(priority = 1,enabled = false)
	public void signupLinkTest() {
		Assert.assertTrue(driver.findElement(signUpLink).isDisplayed());
	}
	
	//Test2
	@Test(priority = 2,enabled = false)
	public void checkApplicationTitle() {
		String appTitle = driver.getTitle();
		System.out.println("Application Title is : " + appTitle);
		Assert.assertEquals(appTitle, "Log in to your account","Title of the application is not matching");
	}

	//Test3
	@Test(priority = 3)
	public void loginTest() {
		driver.findElement(username).sendKeys("seleniumtraining1");
		driver.findElement(password).sendKeys("selenium1234");
		driver.findElement(loginBtn).click();
		
		String actVal = driver.findElement(dashboardText).getText();
		Assert.assertEquals(actVal, "Dashboard");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
