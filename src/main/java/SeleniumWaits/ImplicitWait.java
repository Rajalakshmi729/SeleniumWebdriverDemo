package SeleniumWaits;

import java.util.List;
import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {
	
	 
	  private String baseUrl;  
	  private WebElement element;
	  public static WebDriver driver;
	 
	  @BeforeMethod
	  public void setUp() throws Exception {
		  WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		//	driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
	    baseUrl = "http://www.google.com";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test 
	  public void testUntitled() throws Exception {
	    driver.get(baseUrl);
	    element = driver.findElement(By.name("q"));
	    element.sendKeys("Selenium WebDriver Interview questions");
	    Thread.sleep(5000);
	//   element.sendKeys(Keys.RETURN);
	  // List<WebElement> list = driver.findElements(By.className("_Rm"));
	   //System.out.println(list.size());
	  
	  }

	  @AfterMethod
	  public void tearDown() throws Exception {
	  //  driver.quit();   
	  } 
	}