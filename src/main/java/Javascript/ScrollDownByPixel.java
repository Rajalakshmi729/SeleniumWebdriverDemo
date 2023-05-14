package Javascript;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager; 

public class ScrollDownByPixel {
			static WebDriver driver; 

		public static void main(String[] args) throws IOException {
			// Update your system's path, where Chromedriver.exe is present
		//	System.setProperty("webdriver.chrome.driver", "D:\\mydir\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		// Maximizing the window. 
		   driver.manage().window().maximize(); 

		// Launch the application. 
		    String url = "https://www.yahoo.com"; 
		     driver.get(url); 

		// Create the JavascriptExecutor interface object by Type casting of WebDriver instance. 
		     JavascriptExecutor js = (JavascriptExecutor)driver; 

		// Call scrollBy() method of Javascript using window object with passing number of pixels as parameter values. 
		// Call executeScript() method of JavascriptExecutor interface with passing window.scrollBy() as parameter value. 
		      
		      js.executeScript("window.scrollBy(0,1000)"); // It will scroll down the page by 1000 pixel vertical 
		  } 
		}
