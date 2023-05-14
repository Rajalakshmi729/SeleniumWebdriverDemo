package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountFrames {
	
		static WebDriver driver;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			driver.get("https://stqatools.com/");
			
			int totalframes = driver.findElements((By.tagName("iframe"))).size();
			
			System.out.println("The total no.of frames: " + totalframes);

		}

	}
