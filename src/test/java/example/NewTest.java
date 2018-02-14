package example;
/* hello*/
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
  


public class NewTest {
	WebDriver driver;
	Logger log = Logger.getLogger(NewTest.class);
	
  /*@Test(retryAnalyzer= analyzer.RetryAnalyzer.class)
  public void f() {
	  log.info("*****************launching chrome**************************");
	  driver.get("https://google.com");
	  String actualTitle = driver.getTitle();
	  String expectedTitle = "Google1";
	  
	  Assert.assertEquals(actualTitle, expectedTitle);
	  
  }*/
	@Test
	  public void f() {
		  log.info("*****************launching chrome**************************");
		  driver.get("https://google.com");
		  String actualTitle = driver.getTitle();
		  String expectedTitle = "Google";
		  
		  Assert.assertEquals(actualTitle, expectedTitle);
		  
	  }
	@Test
	  public void ft() {
		  log.info("*****************launching chrome**************************");
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
	  log.info("*****************************browser launched************************");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
	  log.warn("*******************driver closed************************");
	  log.error("*********************Error occured******************************");
	  log.fatal("*********************Fatal occered*******************************");
  }

}
