package Alert;

import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert5 {
	

		static WebDriver driver;
		
		//public static void handleAlert(WebDriver driver) {
			
//			if(isAlertPresent(driver)) {
//				
//				Alert alert = al.switchTo().alert();
//				System.out.println(alert.getText());
//				alert.accept();
//				
//			}
//		}
//		public static boolean isAlertPresent(WebDriver driver) {
//			try {
//			driver.switchTo().alert();
//			return true;
//			}catch(NoAlertPresentException ex) {
//				return false;
//			}
//		}
		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			
			
			driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
			WebElement al = driver.findElement(By.xpath("//input[@name = 'alert' and @value ='Alert']"));
			
		//WebElement al = driver.findElement(By.xpath("//input[@type = 'button']"));
		al.click();
		
		
		try {
			System.out.println(driver.switchTo().alert().getText());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
			
			

		}

		

	}
