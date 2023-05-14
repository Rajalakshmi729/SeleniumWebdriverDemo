package Robot;


	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Rectangle;
	import org.openqa.selenium.UnhandledAlertException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.Toolkit;
	import java.awt.event.KeyEvent;
	import java.awt.image.BufferedImage;
	import java.io.File;

	import javax.imageio.ImageIO;

	public class RobotAlert {
		 		
				static WebDriver driver;
				static WebDriverWait wait;
				
				public static void main(String[] args) throws InterruptedException, AWTException {
					
					   
						 WebDriverManager.chromedriver().setup();
					   driver = new ChromeDriver();
				driver.manage().window().maximize();				driver.get("https://qavbox.github.io/demo/alerts/");
					driver.manage().deleteAllCookies();
					wait = new WebDriverWait(driver, 5);
					driver.findElement(By.name("commit")).click();
					
					wait.until(ExpectedConditions.alertIsPresent());
					Alert alert = driver.switchTo().alert();
					Thread.sleep(2000);
					
//					BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//				    ImageIO.write(image, "jpg", new File("./alert.jpg"));
//				    
				    alert.accept();
					//driver.quit();
				}
			}