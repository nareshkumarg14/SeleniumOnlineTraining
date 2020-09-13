package webDriverConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=sem_lp&ut_source2=sem&ut_source3=megamenu");
		
		//Id --> 1st
		/*driver.findElement(By.id("username")).sendKeys("seleniumtraining1");
		driver.findElement(By.id("password")).sendKeys("selenium1234");*/
		
		//name --> 2nd
		/*driver.findElement(By.name("username")).sendKeys("seleniumtraining1");
		driver.findElement(By.name("password")).sendKeys("selenium1234");*/
		
		//XPath --> 3rd
		//driver.findElement(By.xpath("//*[@id='sign_in_form']/fieldset/div/div[5]/button")).click();
		
		//CSS - Cascading Style Sheets --> 4th
		/*driver.findElement(By.id("username")).sendKeys("seleniumtraining1");
		driver.findElement(By.name("password")).sendKeys("selenium1234");
		driver.findElement(By.cssSelector("#sign_in_form > fieldset > div > div:nth-child(5) > button")).click();*/
		
		//ClassName --> 5th
		/*driver.findElement(By.id("username")).sendKeys("seleniumtraining1");
		driver.findElement(By.name("password")).sendKeys("selenium1234");
		driver.findElement(By.className("wds-button--arrow-right")).click();*/
		
		//LinkText --> 6th
		//driver.findElement(By.linkText("Log in with SSO")).click();
		
		//Partial Link Text --> No preferred
		driver.findElement(By.linkText("in with")).click();
		
		//TagName

	}

}
