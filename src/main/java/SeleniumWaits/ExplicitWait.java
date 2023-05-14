package SeleniumWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {
	
		public static WebDriver driver;
		 public ExplicitWait() {
			 
			 WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
				driver.get("https://www.facebook.com/login/");	
		}


		public static void main(String[] args) {
			ExplicitWait Ew = new ExplicitWait();
						
			Ew.clickOn(driver, driver.findElement(By.xpath("//input[@name ='email']")), 20);
		}
	    public void clickOn(WebDriver driver, WebElement locator, int timeOut) {
	    	
	    	new WebDriverWait(driver,timeOut).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
	    	locator.click();
	    	locator.sendKeys("Test@gmail.com");
		
	}


	}
