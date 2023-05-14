package Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotMouseEvent {
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException, AWTException {
		    
		    
			 WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
	driver.get("https://www.facebook.com");

	// Create object of Robot class
	Robot robot = new Robot();

	// Press Left button
	robot.mousePress(InputEvent.BUTTON1_MASK);

	// Release Left button
	robot.mouseRelease(InputEvent.BUTTON1_MASK);

	// Press Middle button
	robot.mousePress(InputEvent.BUTTON2_MASK);

	// Release Middle button
	robot.mouseRelease(InputEvent.BUTTON2_MASK);

	// Press Right button
	robot.mousePress(InputEvent.BUTTON3_MASK);

	// Release Right button
	robot.mouseRelease(InputEvent.BUTTON3_MASK);



	}

	}
