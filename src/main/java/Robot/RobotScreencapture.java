package Robot;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class RobotScreencapture {
	
		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException, AWTException, IOException {
			
			   
				 WebDriverManager.chromedriver().setup();
			   driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
			// open webpage
			driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
			Robot robot = new Robot();
			int x = 10;
			int y = 10;
			int width = 500;
			int height = 200;
			Rectangle area = new Rectangle(x, y, width, height);
			BufferedImage bufferedImage = robot.createScreenCapture(area);
			File imageFile = new File("D:Robot.png");
			ImageIO.write(bufferedImage, "png", imageFile);
		}
	}
