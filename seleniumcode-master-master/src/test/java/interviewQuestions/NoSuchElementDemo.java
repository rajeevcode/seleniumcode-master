package interviewQuestions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NoSuchElementDemo {
  private String baseUrl = "https://learn.letskodeit.com/";
  private WebDriver driver;

  @Test
  public void NoSuchElementDemoTest() throws Exception {
    driver.get ( baseUrl );

    // 1.Timing issues
    driver.findElement ( By.xpath ( "//a[@href='/sign_in']" ) ).click ( );
//    WebElement emailField = driver.findElement ( By.id ( "user_email" ) );
//    emailField.sendKeys ( "test@gmail.com" );

    // 2.Incorrect locators
    WebDriverWait wait = new WebDriverWait ( driver,3 );
    WebElement emailField = wait.until ( ExpectedConditions.visibilityOfElementLocated ( By.id ( "user_email" ) ) );
    emailField.sendKeys ( "test@gmail.com" );

    // 3. Element is not found
    driver.findElement ( By.xpath ("//a[contains(@href,'/sign_in')]") ).click ( );

    //4. Element is in iFrame
    //What are different types of exception
    driver.get ( "https://learn.letskodeit.com/p/practice" );
    driver.switchTo ().frame ( "courses-iframe" );
    driver.findElement ( By.id("search-courses")).sendKeys ( "java" );
    driver.switchTo ().defaultContent ();


  }

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver ( );

    // Maximize the browser's window
    driver.manage ( ).window ( ).maximize ( );
    driver.get ( baseUrl );
//    driver.manage ( ).timeouts ( ).implicitlyWait ( 10, TimeUnit.SECONDS );
  }

  @After
  public void tearDown() throws Exception {
    Thread.sleep ( 2000 );
    driver.quit ( );
  }
}
