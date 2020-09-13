package webDriverConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithImages {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.ca/");
		
		//1. Count total number of images on a page
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images on on Amazon application is : " + images.size());
		
		//2. Capturing the src url
		for (int i = 0; i < images.size(); i++) {
			String imgSrcVal = images.get(i).getAttribute("src");
			System.out.println(imgSrcVal);
		}
		
	}

}
