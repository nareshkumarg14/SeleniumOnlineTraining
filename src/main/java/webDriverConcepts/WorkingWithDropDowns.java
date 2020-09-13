package webDriverConcepts;
import java.util.List;
//SendKeys --> Input Field, Drop Down
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithDropDowns {

	public static void main(String[] args) throws InterruptedException {
		String expMonth = "Oct";
		boolean status = false;
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		//1. Clicking on "Create A Account" button
		driver.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(5000);
		
		//2. Selecting value from Month Drop Down
		//driver.findElement(By.id("month")).sendKeys("jan");
		
		//Selecting using Select Class
		Select select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Feb");
		
		Thread.sleep(1000);
		
		Select select1 = new Select(driver.findElement(By.id("day")));
		select1.selectByIndex(10);
		
		Thread.sleep(1000);
		
		Select select2 = new Select(driver.findElement(By.id("year")));
		select2.selectByValue("1990");
		
		//3. Counting number of values in a Drop Down
		/*List<WebElement> months = select.getOptions();
		System.out.println("Total number of values in Month Drop Down is : " + months.size());*/
		
		//4. Print all the values from Month Drop Down
		/*for (int i = 0; i < months.size(); i++) {
			String monthValue = months.get(i).getText();
			System.out.println("Value in Month Drop Down is : " + monthValue);
			if (monthValue.equalsIgnoreCase(expMonth)) {
				status = true;
				break;
			} else {
				status = false;
			}
		}
		
		if (status == true) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}*/
		
		//5. Printing all the values of DropDown without select class
	List<WebElement> months = 	 driver.findElements(By.xpath("//*[@id='month']/option"));
	for (int i = 0; i < months.size(); i++) {
		String monthName = months.get(i).getText();
		System.out.println(monthName);
		//Selecting May from Drop Down
		if (monthName.equals("May")) {
			months.get(i).click();
			break;
		}
	}

	}
	
	public static void selectValueUsingIndex(WebElement element, int indexNo) {
		
	}

}
