package waittypes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.WaitTypes;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitDemo {
  private WebDriver driver;
  private String baseUrl;


  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver ();
    baseUrl = "https://letskodeit.teachable.com/pages/practice";

    // Maximize the browser's window
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
  }

  @Test()
  public void test() throws Exception {
    driver.get(baseUrl);
    driver.findElement ( By.linkText ( "Login" ) ).click ();
    driver.findElement ( By.id ( "user_email" ) ).sendKeys ( "test@gmail.com" );
    driver.findElement ( By.id ( "user_password" ) ).sendKeys ( "test@123" );
    driver.findElement ( By.xpath ( "//input[@type='submit']" ) ).click ();
  }

  @After
  public void tearDown() throws Exception {
    Thread.sleep(3000);
    driver.quit();
  }
}


