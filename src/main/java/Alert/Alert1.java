package Alert;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Alert1 {
	
		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException, AWTException {
			
			   
				 WebDriverManager.chromedriver().setup();
			   driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		if(text.equals("Please enter a valid user name")){
		System.out.println("Valid message on the alert box");
		System.out.println(text);
		}
		else{
		System.out.println("Invalid message");
		}
		alert.accept();
		Thread.sleep(5000);
//		driver.findElement(By.name("login")).sendKeys("Raji");
		driver.findElement(By.name("login"));
//		driver.findElement(By.name("passwd"));
//		driver.findElement(By.name("passwd")).sendKeys("Raji");
		driver.findElement(By.xpath("//input[@type = 'checkbox']")).click();
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		Thread.sleep(5000);
		Alert alert1 = driver.switchTo().alert();
		String text1 = alert1.getText();
		if(text1.equals("Please enter a valid user name")){
		System.out.println("Valid message on the alert box");
		System.out.println(text1);
		}
		else{
		System.out.println("Invalid message");
		}
		alert1.accept();
		}
		}



