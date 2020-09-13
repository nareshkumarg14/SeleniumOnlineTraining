package webDriverConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		//Switching inside a frame
		driver.switchTo().frame(0);
		
		//Capturing Draggable text
		/*String dragText = driver.findElement(By.id("draggable")).getText();
		System.out.println(dragText);
		
		//Capturing Drop text
		String dropText = driver.findElement(By.id("droppable")).getText();
		System.out.println(dropText);*/
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Thread.sleep(200);
		
		//Drag and Drop
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source,target).build().perform();
		
		driver.switchTo().defaultContent();
		//driver.findElement(By.linkText("Selectable")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Selectable')]")).click();
	}

}
