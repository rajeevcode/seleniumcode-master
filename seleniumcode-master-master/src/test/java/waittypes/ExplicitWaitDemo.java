package waittypes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
  private String baseUrl;
  private WebDriver driver;
  private final static Logger logger = LogManager.getLogger ( ExplicitWaitDemo.class.getName () );

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver ( );
    baseUrl = "https://letskodeit.teachable.com/pages/practice";
//  baseUrl= "https://www.dropbox.com/";

    // Maximize the browser's window
    driver.manage ( ).window ( ).maximize ( );
  }

  @After
  public void tearDown() throws Exception {
    Thread.sleep ( 3000 );
    driver.quit ( );
  }

  @Test()
  public void test() throws Exception {
    driver.get ( baseUrl );
    WebElement loginLink = driver.findElement ( By.linkText ( "LoginTest" ) );
    loginLink.click ( );
    WebDriverWait wait1 = new WebDriverWait ( driver, 3 );
    WebElement emailField = wait1.until ( ExpectedConditions.visibilityOfElementLocated ( By.id ( "user_email" ) ) );
    emailField.sendKeys ( "test" );

    //WebDriverWait wait2 = new WebDriverWait ( driver, 3 );
    WebElement passwordField = wait1.until ( ExpectedConditions.visibilityOfElementLocated ( By.id ( "user_password" ) ) );
    emailField.sendKeys ( "test@123" );
    //driver.findElement ( By.id ( "user_email" ) ).sendKeys ( "test@gmail.com" );

    logger.info ( "This message is from test method");
  }
}

