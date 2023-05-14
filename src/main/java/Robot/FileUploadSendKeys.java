package Robot;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class FileUploadSendKeys {
	
		static WebDriver driver;

		    public static void main(String[] args) {
		    	WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

		    	//WebDriver driver = new FirefoxDriver();
		        driver.get("http://demo.guru99.com/selenium/upload/");
		        WebElement uploadfile= driver.findElement(By.xpath("//*[@id='uploadfile_0']"));
		        uploadfile.sendKeys("C:\\Users\\Admin\\Desktop\\Link1.txt");
		        WebElement check = driver.findElement(By.name("terms"));
		        check.click();
		        WebElement submit = driver.findElement(By.name("send"));
		        submit.click();

		    }

		}


