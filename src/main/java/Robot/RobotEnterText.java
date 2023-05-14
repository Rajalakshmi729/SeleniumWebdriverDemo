package Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotEnterText {
			
		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException, AWTException {
			
			   
				 WebDriverManager.chromedriver().setup();
			   driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
		Thread.sleep(5000);
		Robot rb=new Robot();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ramyalakshmi729@gmail.com");
		//Thread.sleep(5000);
		
		
		//Thread.sleep(5000);
	rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("automationplace@gmail.com");
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		}	

	}