package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
  


public class NewTest {
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  driver.get("https://google.com");
	  String actualTitle = driver.getTitle();
	  String expectedTitle = "Google";
	  
	  Assert.assertEquals(actualTitle, expectedTitle);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\eclipse-jee-neon-1a-win32-x86_64\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}
