package webDriverConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //1. Open Chrome browser of Selenium
		
		driver.manage().window().maximize();//Maximise the application
		
		driver.get("https://www.google.ca/"); //2. Open application based on URL provided
		
		String appTitle = driver.getTitle();//3. Capture Title of the application
		System.out.println("Title of the application is : " + appTitle);
		
		//To compare values we use If conditions
		if (appTitle.equalsIgnoreCase("Google")) {
			System.out.println("Google application is opened");
		} else {
			System.out.println("Some other application is opened");
		}
		
		String appUrl = driver.getCurrentUrl();
		System.out.println("URL of application is : " + appUrl);
		
		/*if (appUrl.contains("google")) {
			System.out.println("URL is correct");
		} else {
			System.out.println("URL is wrong");
		}*/
		
		String updatedText = appUrl.substring(12, 18);
		System.out.println(updatedText);
		
		if (updatedText.equals("google")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		System.out.println(driver.getPageSource());
		
		driver.close(); //Will close the application

	}

}
