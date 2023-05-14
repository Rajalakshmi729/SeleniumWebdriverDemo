package Robot;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotScreenFullcapture {
	
		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException, AWTException, IOException {
			
			   
				 WebDriverManager.chromedriver().setup();
			   driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
				// open webpage
				driver.get("https://chercher.tech/java/practice-pop-ups-selenium-webdriver");
				// create object to robt class
				Robot robot = new Robot();
				// create rectangle for full screenshot
				Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
				// capture screen of the desktop
				BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
				// save the screenshot to local system
				ImageIO.write(screenFullImage, "png", new File("D:FullScreenshotRobot.png"));

				System.out.println("Full Desktop screenshot saved!");
		  }
		}
