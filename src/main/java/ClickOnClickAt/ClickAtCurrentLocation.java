package ClickOnClickAt;

import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAtCurrentLocation {
	
		
		static WebDriver driver;
	public static void main(String[] args) 
	{ 
	// Create a driver object of Firefox browser. 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	// Maximize the browser. 
	    driver.manage().window().maximize(); 

	// Create a variable URL to store the URL of Google home page. 
	// Since the return type of URL is String, we will declare URL as String type. 
	    
	    		driver.get("https://www.google.com");

	// Call get() method of WebDriver and pass URL as a parameter. 
	   

	// Wait for some time to load. 
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

	// Locate the element “Gmail” by By.xpath. 
	     WebElement Gmail = driver.findElement(By.xpath("//a[text()='Gmail']")); 

	// Create an object of Actions class and pass reference variable driver as a parameter to its constructor. 
	     Actions actions = new Actions(driver); 

	// Get the location and Coordinate (x, y) of WebElement “gmail”. Call getLocation(), getX(), and getY() methods to find the location and coordinate. 
	     int getX = Gmail.getLocation().getX(); 
	     System.out.println("X coordinate:" +getX); 
	     int getY = Gmail.getLocation().getY(); 
	     System.out.println("Y coordinate:" +getY); 

	// Call moveByOffset() method of Actions class to move the mouse cursor from initial position to given Offset. 
	// Pass the coordinates of x and y as parameters to moveByOffset() method. 
	     actions.moveByOffset(getX+1, getY+1).click(); 
	     actions.build().perform(); 
	  
	     System.out.println("Clicked Successfully on Gmail"); 
	    // driver.close(); 
	  } 
	}