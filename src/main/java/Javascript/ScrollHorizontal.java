package Javascript;

import org.openqa.selenium.By; 
import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager; 

public class ScrollHorizontal {

			static WebDriver driver;
	 public static void main(String[] args) 
	{ 
	// Create web driver object. 
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

	// Maximizing the window. 
	     driver.manage().window().maximize(); 

	// Launch the application. 
	     String url = "https://selenium08.blogspot.com/2020/02/horizontal-scroll.html"; 
	      driver.get(url); 
	     WebElement element = driver.findElement(By.xpath("//a[text() = 'Relationship']")); 

	// Create the JavascriptExecutor interface object by Type casting of WebDriver instance. 
	      JavascriptExecutor js = (JavascriptExecutor)driver; 

	// Call scrollIntoView() method of Javascript using arguments[0]. 
	      js.executeScript("arguments[0].scrollIntoView();", element); 
	      System.out.println("Scrolled Successfully");
	  } 
	}