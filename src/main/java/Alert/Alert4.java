package Alert;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert4 {
	
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException, AWTException {
		    
		    
			 WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
	  Thread.sleep(2000);
	  driver.findElement(By.id("simpleAlert")).click();
	  Alert alert=driver.switchTo().alert();
	  String alertText=alert.getText();
	  System.out.println("Alert Text is: "+alertText);
	  Thread.sleep(2000);
	  alert.accept();
	  driver.close();
	 }
	}
