package webDriverConcepts;
//Differences between getText and getAttribute
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithInputFields {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=sem_lp&ut_source2=sem&ut_source3=megamenu");
		
		WebElement uId = driver.findElement(By.id("username"));
		
		String val = uId.getAttribute("value");
		//1. Entering value in input field
		System.out.println("Before entering any value : -------------------------> " + val.isEmpty());
		uId.sendKeys("oldvalue");
		Thread.sleep(2000); //wait for how much time we want
		
		//2. Clear the value that is in input field
		uId.clear();
		Thread.sleep(2000);
		
		uId.sendKeys("seleniumtraining1");
		Thread.sleep(2000);
		
		//3. Capture the value that is entered in input field
		String usernameVal = uId.getAttribute("value");
		System.out.println("User Name entered is ---------------------------------------> " + usernameVal);
		System.out.println("Is Empty value is : " + usernameVal.isEmpty());
		if (usernameVal.isEmpty()) {
			System.out.println("Value is not entered");
		} else {
			System.out.println("Value is entered");
		}
	}

}
