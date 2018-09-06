package interviewQuestions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class StaleElementDemo {
  private WebDriver driver;
  private String baseUrl;

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver ( );
    baseUrl = "https://learn.letskodeit.com/p/practice";

    // Maximize the browser's window
    driver.manage ( ).window ( ).maximize ( );
    driver.manage ( ).timeouts ( ).implicitlyWait ( 10, TimeUnit.SECONDS );
  }

  @After
  public void tearDown() throws Exception {
    Thread.sleep ( 2000 );
    driver.quit ( );
  }

  //Stale - Not new or element has become stale
  @Test
  public void testSliderActions() throws Exception {
    Thread.sleep ( 3000 );
    driver.get ( baseUrl );
//stale element example
//    WebElement checkboxElement = driver.findElement ( By.id ( "bmwcheck" ) );
    driver.get(driver.getCurrentUrl ());
    WebElement checkboxElement = driver.findElement ( By.id ( "bmwcheck" ) );
    checkboxElement.click ();
  }
}
