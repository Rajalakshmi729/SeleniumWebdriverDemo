package Calendar;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import java.util.List;
public class CalendarDemo{
	
	static WebDriver driver;
   public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

      //implicit wait
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      //URL launch
      driver.get("https://jqueryui.com/datepicker/#date%E2%88%92range");
      //identify and switch to frame
      WebElement r = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
      driver.switchTo().frame(r);
      //identify element
      WebElement e = driver.findElement(By.id("datepicker"));
      e.click();
      //identify elements with td tag in list
      List<WebElement> d =driver.findElements(By.xpath("//table/tbody/tr/td"));
      //iterate list
      for (int i = 0; i<d.size(); i++) {
         //check expected data
         String s = d.get(i).getText();
         if (s.equals("2")) {
            d.get(i).click();
            break;
         }
      }
      //get data selected
      String m = e.getAttribute("value");
      System.out.print("Date selected in calendar is: "+ m);
      //close browser
      //driver.quit();
   }
}