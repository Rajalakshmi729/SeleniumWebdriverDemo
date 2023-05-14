package FindandFinds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class FindsElement {
	
		
		static WebDriver driver;
	    public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
	        try {
	            driver.get("https://selenium08.blogspot.com/2020/02/horizontal-scroll.html");

	            // Get element with tag name 'div'
	            WebElement element = driver.findElement(By.tagName("div"));

	            // Get all the elements available with tag name 'p'
	            List<WebElement> elements = element.findElements(By.tagName("p"));
	           System.out.println("Total no of webelements "+ elements.size()); 
	            for (WebElement e : elements) {
	                System.out.println(e.getText());
	                
	            }
	        }
	        catch(Exception e) {
	        	System.out.println("check whether provided webelement path is correct ");
	        }
	    }
	}
	        
	    
