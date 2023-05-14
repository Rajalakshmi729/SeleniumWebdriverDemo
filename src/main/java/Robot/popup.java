package Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class popup {
		 
	public static void main( String[] argv ) throws IOException, AWTException, InterruptedException
	{
	WebDriver driver =new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://docs.seleniumhq.org/download/");
	 
	driver.findElement(By.xpath("//p[contains(text(),'Download version')]")).click();
	 
	Thread.sleep(2000);
	//Robot class to press Left arrow
	Robot r=new Robot();
	 
	r.keyPress(KeyEvent.VK_LEFT);
	r.keyRelease(KeyEvent.VK_LEFT);
	 
	//Robot class to press ENTER button
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	 
	}
	 
	}
