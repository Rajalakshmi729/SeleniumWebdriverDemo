package Alert;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Alert3 {
	
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException, AWTException {
		    
		    
			 WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
			String url = "http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open";

			
					driver.manage().window().maximize(); //Maximising browser window

			driver.manage().deleteAllCookies(); //Deleting All cookies

			driver.get(url); //Invoking URL
			Thread.sleep(3000);

			driver.switchTo().frame("iframeResult"); //Switching to frame on same web page
			Thread.sleep(3000);

			driver.findElement(By.xpath("//button[@onclick = 'myFunction()']")).click(); // Locating and clicking on "Try it" button

			Alert alert = driver.switchTo().alert(); //Switching to Alert on same web page

			String messageOnAlert = alert.getText(); // Fetching message on Alert box in a String

			System.out.println("Message on Alert : "+ messageOnAlert); //Displaying the message on Alert message

			Thread.sleep(5000); // Explicit wait of 5 seconds so that you can see Alert for sometime

			alert.accept(); //Accepting an alert



			driver.switchTo().defaultContent(); //Switching to parent page

			//driver.quit(); //Quitting browser

		}

	}
