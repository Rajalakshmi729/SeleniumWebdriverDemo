package Javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager; 

public class ScrollByVisibleElement {
			
		static WebDriver driver;
	public static void main(String[] args) 
	{ 
	// Create driver object. 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	// Maximizing the window. 
	     driver.manage().window().maximize(); 

	// Launch the application. 
	     String URL = "https://selenium08.blogspot.com/2020/02/vertical-scroll.html"; 
	      driver.get(URL); 

	// Locate web element "Health" by By.xpath. 
	     WebElement element = driver.findElement(By.xpath("//a[text() = 'Health']")); 

	// Create the JavascriptExecutor interface object by Type casting of WebDriver instance. 
	     JavascriptExecutor js = (JavascriptExecutor)driver; 

	// Call scrollIntoView() method of Javascript using magic variable arguments[0]. 
	// Call executeScript() method JavascriptExecutor interface with passing arguments[0].scrollIntoView() as parameter values. 
	    
	      js.executeScript("arguments[0].scrollIntoView();", element); // It will scroll down the page by visibility of element "Health". 
	   } 
	}