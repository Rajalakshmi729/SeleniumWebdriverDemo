package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionKeyboardEvents {
			
		static WebDriver driver; 

	@Test
	public void keyBoardEvents_whenSuccess() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		  driver.manage().window().maximize(); 

	driver.get("https://www.facebook.com/");

	WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));

	WebElement signUp = driver.findElement(By.xpath("//*[@name='login']"));

	// In this step, we are moving the userName element and KeyDown function press
	// the shift key and sends the userName and KeyUp function perform release the
	// Key and next we are highlighting the userName


	Actions builder = new Actions(driver);
	builder.moveToElement(userName).click().keyDown(userName, Keys.SHIFT).sendKeys(userName, "testuser")
	.keyUp(userName, Keys.SHIFT).doubleClick(userName).build().perform();

	// Enter the sign up keys after we passed the userName

	signUp.sendKeys(Keys.ENTER);

	//driver.close();
	}
	}