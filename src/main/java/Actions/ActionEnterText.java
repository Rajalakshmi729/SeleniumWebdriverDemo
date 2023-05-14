package Actions;


	import org.openqa.selenium.interactions.Actions;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.support.events.EventFiringWebDriver;

		import java.io.File;

		public class ActionEnterText {
		

		public void test7 ()throws Exception
		{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http:www.google.com");
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		driver.findElement(By.xpath(".//*[@id=’account’]/a")).click();
		Thread.sleep(50);
		driver.findElement(By.id("log")).sendKeys("automationplace@gmail.com");
		WebElement element = driver.findElement(By.xpath(".//*[@id=’pwd’]"));
		actions.moveToElement(element).build().perform();
		driver.findElement(By.id("pwd")).sendKeys("selenium");
		}
		
		public static void main(String[] args)throws Exception

		{
		ActionEnterText s= new ActionEnterText();
		s.test7();
		}
		}
