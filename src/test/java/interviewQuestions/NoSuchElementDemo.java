package interviewQuestions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NoSuchElementDemo {
  private String baseUrl = "https://learn.letskodeit.com/";
  private WebDriver driver;

  @Test
  public void NoSuchElementDemoTest() throws Exception {
    driver.get ( baseUrl );

    // 1.Timing issues
    driver.findElement ( By.xpath ( "//a[@href='/sign_in']") ).click ();

    // 2.Incorrect locators

    // 3. Element is not found

  }

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver ( );
//    baseUrl = "https://learn.letskodeit.com/" ;

    // Maximize the browser's window
    driver.manage ( ).window ( ).maximize ( );
    driver.get ( baseUrl );
    // driver.manage ( ).timeouts ( ).implicitlyWait ( 10, TimeUnit.SECONDS );
  }

  @After
  public void tearDown() throws Exception {
    Thread.sleep ( 2000 );
    driver.quit ( );
  }

}
