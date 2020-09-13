package testNGConcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesConcept {
	WebDriver driver;
	@Test
	public void login() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\Selenium Training\\SeleniumPrograms\\SeleniumConcepts\\config.properties");
		prop.load(fis);
		String retUsername = prop.getProperty("username");
		String retPassword = prop.getProperty("password");
		String retBrowserName = prop.getProperty("browsertype");
		String retUrl = prop.getProperty("url");
		System.out.println(retUsername + "----------------" + retPassword + "------------------" + retBrowserName);
		
		if (retBrowserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if(retBrowserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get(retUrl);
		driver.findElement(By.id("username")).sendKeys(retUsername);
		driver.findElement(By.id("password")).sendKeys(retPassword);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.quit();
	}

}
