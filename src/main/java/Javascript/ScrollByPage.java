package Javascript;

import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager; 

public class ScrollByPage {
 
			static WebDriver driver;
		public static void main(String[] args) 
		{ 
		// Create driver object. 
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		// Maximizing the window. 
		     driver.manage().window().maximize(); 

		// Launch the application. 
		     String URL = "https://selenium08.blogspot.com/"; driver.get(URL); 

		// Create the JavascriptExecutor interface object by Type casting of WebDriver instance. 
		     JavascriptExecutor js = (JavascriptExecutor) driver; 

		// Call scrollTo() method of Javascript using window object. 
		      js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); // It will scroll down until the end of the page .
		  }
		 }


