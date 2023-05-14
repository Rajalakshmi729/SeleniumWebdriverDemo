package Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotFileUpload {
	

		
		@Test
		public void fileUpload() throws InterruptedException, AWTException {
			
		//	System.setProperty("webdriver.chrome.driver", "E:\\Auto\\Chromedriver\\chromedriver.exe");
		//	WebDriver driver = new ChromeDriver();
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			// specify the file location with extension StringSelection comes from java
			StringSelection sel = new StringSelection("C:\\Users\\Admin\\Desktop\\test.docx");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
			driver.get("https://www.monsterindia.com/seeker/registration?");
			Thread.sleep(7000);
			// This will scroll down the page
			//JavascriptExecutor js = (JavascriptExecutor)driver;
			//js.executeScript("scroll(0,350)");
			
			//Alert alert = driver.switchTo().alert();
			/*
			 * System.out.println(driver.switchTo().alert().getText()); Thread.sleep(5000);
			 * alert.dismiss();
			 */

		//	driver.findElement(By.id("wzrk-cancel")).click();
		
			
			// This will click on browser button
			//driver.findElement(By.partialLinkText("Choose CV")).click();
			driver.findElement(By.className("browse-text")).click();
			
			Robot robot = new Robot();
			Thread.sleep(1000);
			// press enter
			robot.keyPress(KeyEvent.VK_ENTER);
			// Release enter
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			//key press paste the file path
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			Thread.sleep(5000);
			// key release 
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			Thread.sleep(5000);
			// press Enter
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
						
			
		}

	}
