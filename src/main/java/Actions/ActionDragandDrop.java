package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionDragandDrop {


		
		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.get("https://jqueryui.com/droppable/");
			driver.switchTo().frame(0);
			
			Actions action = new Actions(driver);
			Thread.sleep(5000);
			
			action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']"))).
			moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).release().build().perform();
			//action.moveToElement(driver.findElement(By.linkText("About"))).build().perform();
			
			//driver.findElement(By.linkText("fleet")).click();
			
		
			
			
		}

	}
