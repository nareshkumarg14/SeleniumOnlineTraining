package webDriverConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithRadiosAndCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(1000);
		//Clicking on a radio button
		driver.findElement(By.xpath("//label[contains(text(),'Multicity')]")).click();
		Thread.sleep(5000);
		if (driver.findElement(By.id("MultiCityModelAlert")).isDisplayed() == true) {
			driver.findElement(By.id("MultiCityModelAlert")).click();
		}
		Thread.sleep(1000);
		//Clicking on Checkbox
		driver.findElement(By.xpath("//label[contains(text(),'Senior Citizen')]")).click();
		
		
	}

}
