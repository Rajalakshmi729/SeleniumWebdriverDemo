package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test; 

public class TestNG1 {
	

	//Launch the Firefox browser and maximize the browser.
	//Open the web page google.com.
	//Wait for some time to load webpage successfully.
	//Get the title of web page.
	//Close the browser.

		// First create WebDriver reference. 
		   WebDriver driver; 
		   @BeforeSuite
		   public void setUpDriver()
		   { 
		// Create an object of FirefoxDriver class.
		    driver = new FirefoxDriver(); 

		// Maximize browser. 
		   driver.manage().window().maximize(); 
		  } 
		 @BeforeTest
		 public void launchURL()
		 { 
		    String URL = "https://www.google.com";  
		    driver.get(URL); 

		// Wait for some time to load web page successfully. 
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		  } 
		 @Test
		 public void getTittle()
		 { 
		   String getTitle = driver.getTitle(); 
		   System.out.println("Title of web page: " +getTitle); 
		  } 
		 @AfterTest
		 public void testResult()
		 { 
		   // Put the code to take screenshot of test result. 
		  } 
		 @AfterSuite
		 public void closeBrowser()
		 { 
		   driver.close(); 
		  } 
		 }