package Frames;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame1 {

			static WebDriver driver;
		public static void main(String[] args) throws InterruptedException, AWTException {
		    
		    
			 WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// open webpage
			driver.get("https://chercher.tech/practice/frames");
			// store the text value
			String textValue = driver.findElement(By.xpath("//label/span")).getText();
			System.out.println(textValue);
			// switch to frame1
			driver.switchTo().frame("frame1");
			// set the value of the textbar to the value stored
			driver.findElement(By.xpath("/html/body/input")).sendKeys(textValue);
	  }
	}
