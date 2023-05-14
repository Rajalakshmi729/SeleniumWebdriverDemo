package Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloadRobot {
	

		static WebDriver driver;

			    public static void main(String[] args) throws AWTException, InterruptedException {
			    	
			    	WebDriverManager.chromedriver().setup();
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
			      
			       // driver.get("http://qtpselenium.com/test/testdownload.php");
				driver.get("http://demo.automationtesting.in/FileDownload.html");
			        driver.findElement(By.xpath("//a[@type = 'button']")).click();
			       
			        Robot rbt= new Robot();
			        Thread.sleep(4000);
			        //rbt.keyPress(KeyEvent.VK_ENTER);
			       // rbt.keyPress(KeyEvent.VK_RIGHT);
			        //rbt.keyPress(KeyEvent.VK_LEFT);
			      //  rbt.keyPress(KeyEvent.VK_ENTER);
			        System.out.println("Sample file downloaded available in Downloads");


			    }

			}



