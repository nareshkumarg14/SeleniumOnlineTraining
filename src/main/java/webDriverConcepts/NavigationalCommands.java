package webDriverConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Opening Google application
		driver.get("http://www.google.ca");
		
		//Opening Amazon application
		//driver.get("http://www.amazon.ca");
		driver.navigate().to("http://www.amazon.ca"); //Method Overloading
		
		//Switching back to google application
		driver.navigate().back();
		
		//Go to Amazon application
		driver.navigate().forward();
		
		//To press on refresh button
		driver.navigate().refresh();

	}

}
