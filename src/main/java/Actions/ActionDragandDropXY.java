package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ActionDragandDropXY {
	
		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
	 
	        WebDriver driver = new ChromeDriver(); 
	 
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	 
	 driver.get("https://javascript.info/article/mouse-drag-and-drop/ball4/"); 
	 
	 driver.manage().window().maximize();
	 
	 //driver.switchTo().frame("iframeResult");
	         
	        //Opening a link in a new tab in Selenium using action class
	        WebElement dgragFrom = driver.findElement(By.xpath("//*[@id=\"ball\"]"));  
	        
	        WebElement dropTo = driver.findElement(By.xpath("//*[@id=\"gate\"]"));        
	       
	      
	        
	        Actions actions = new Actions(driver); 
	        
	        //Moving football to 50,200 offset position
	        actions.dragAndDropBy(dgragFrom, 50,200).build().perform();
	            
	     //Uncomment following line to Close the browser
	     //driver.quit();
	 }
	}
