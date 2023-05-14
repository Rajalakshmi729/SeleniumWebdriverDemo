package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ActionRightClickAtCurrentLocation {

	static WebDriver driver;
		public static void main(String[] args) 
		{ 
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		// Create a variable URL of String type to store the URL. 
		   String url = "https://selenium08.blogspot.com/2019/12/right-click.html"; 

		// Call get() method of WebDriver and pass URL as a parameter. 
		   driver.get(url); 
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

		// Locate the WebElement by By.xpath. 
		   WebElement contextMenu = driver.findElement(By.xpath("//div[@id = 'div-context']")); 

		// Create an object of Actions class and pass reference variable driver as a parameter to its constructor. 
		   Actions actions = new Actions(driver); 

		// Call moveToElement() method to move the mouse cursor from initial position (0,0) to element contextMenu. 
		    actions.moveToElement(contextMenu); // Passing contextMenu as an parameter. 
		    actions.contextClick(); // Calling contextClick() method to right click on context menu. 

		// Locate an element "Java" by By.xpath in the context menu. 
		    WebElement java = driver.findElement(By.xpath("//a[text() = 'Java']")); 

		// Call click(WebElement) method and pass element as an input parameter. 
		   actions.click( java ); 
		   actions.perform(); 
		  System.out.println("Right-clicked Successfully on Context menu"); 

		// Switch to alert pop-up from web page by using below syntax. 
		   Alert alert = driver.switchTo().alert(); 

		// Get text displayed on pop-up. 
		   String getText = alert.getText(); 
		   System.out.println("Displayed Text on pop-up: " +getText); 

		// Call accept() method of alert interface to click OK button to accept pop-up. 
		   alert.accept(); 
		   driver.close(); 
		  } 
		 }

