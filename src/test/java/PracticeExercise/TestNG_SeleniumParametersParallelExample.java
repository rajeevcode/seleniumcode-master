package PracticeExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TestNG_SeleniumParametersParallelExample {

  private String baseUrl ="https://letskodeit.teachable.com";
  private WebDriver driver;

  @BeforeClass
  @Parameters("browser")
  public void setUp(String browser) throws Exception {
    if ( browser.equalsIgnoreCase ( "firefox" ) ) {
      driver = new FirefoxDriver (  );
    } else if ( browser.equalsIgnoreCase ( "chrome" ) ){
      driver = new ChromeDriver (  );
    }
    // Maximize the browser's window
    driver.manage ( ).window ( ).maximize ( );
    driver.manage ( ).timeouts ( ).implicitlyWait ( 10, TimeUnit.SECONDS );
    driver.get ( baseUrl );
  }

  @Test
  public void clickLogin() throws Exception {
    driver.findElement ( By.xpath ( "//a[@href=\"/sign_in\"]") ).click();
    WebElement LoginLink = driver.findElement ( By.id ( "user_email" ));
    LoginLink.sendKeys ( "test@gmail.com" );
    WebElement userName = driver.findElement ( By.id ( "user_password" ) );
    userName.sendKeys ("test@123");
    WebElement passWord = driver.findElement ( By.xpath ( "//input[@value='Log In']" ) );
    passWord.click ();
  }

  @AfterClass
  public void tearDown() throws Exception {
    Thread.sleep ( 1000 );
    driver.quit ( );
  }
}

