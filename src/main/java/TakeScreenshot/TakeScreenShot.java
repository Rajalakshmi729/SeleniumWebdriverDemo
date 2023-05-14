package TakeScreenshot;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShot {
	
		
		static WebDriver driver;

		public static void main(String[] args) throws IOException {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			//System.setProperty("webdriver.chrome.driver", "E:\\Auto\\Chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
			driver.get("http://www.google.com");
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(src, new File("C:\\Users\\Admin\\eclipse-workspace\\work\\SeleniumTutorial\\target\\ScreenShot\\google.png"));
		}

	}
