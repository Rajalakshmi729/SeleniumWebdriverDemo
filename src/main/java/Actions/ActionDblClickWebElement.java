package Actions;


import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.Alert; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionDblClickWebElement {

	
	static WebDriver driver;
		public static void main(String[] args) 
		 { 
		// Create a driver object for Firfox browser. 
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); 

		// Maximize web browser. 
		   driver.manage().window().maximize(); 

		// Store URL in a variable URL of String type. 
		   String url="https://selenium08.blogspot.com/2019/11/double-click.html"; 

		// Call get() method and pass the URL as an input parameter. 
		   driver.get(url); 

		// Wait for loading complete web page. 
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

		// Locate WebElement by using By.xpath. 
		   WebElement dblclick = driver.findElement(By.xpath("//button[text() = 'Double-Click me to see Alert message']")); 

		// Create an object of Actions class and pass the driver as an parameter. 
		   Actions actions = new Actions(driver); 

		// Call doubleClick() method to peform the double-click action at current location. 
		   actions.doubleClick(dblclick); // Line 2. 

		// Call perform() method to perform a sequence of actions. 
		   actions.perform(); //Line 3. 

		// The Line 1, Line 2, and Line 3 can also be written in a single line like this: 
		// actions.doubleClick(dblclick).perform();
		    
		    System.out.println("Double click action performed successfully on an element"); 

		// Switching to Alert from web page. 
		   Alert alert = driver.switchTo().alert(); 

		// Capture the text displayed on pop up and save it in a variable getText of type String. 
		   String getText = alert.getText(); 
		   System.out.println("Alert text: " +getText); 

		// Click on OK button. 
		   alert.accept(); 
		  } 
		}


