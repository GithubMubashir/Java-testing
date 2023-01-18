//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class classdemo {

	public static void main(String[] args) 
	
	{
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\dev\\Java-testing\\chromedriver.exe");
      ChromeDriver driver = new ChromeDriver();
 //     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
      driver.get("https://uat.rhithm.app/");
      
    //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
    //  System.out.println(driver.getCurrentUrl());
    //  driver.get("https://www.google.com/");
   //   driver.navigate().back();
    //  driver.close();
   //   driver.quit();
      driver.get("http://facebook.com/");
      driver.findElement(By.id("email")).sendKeys("Mubasir");
      
	}
}
