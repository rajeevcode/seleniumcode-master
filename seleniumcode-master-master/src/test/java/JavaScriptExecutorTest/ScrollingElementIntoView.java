package JavaScriptExecutorTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ScrollingElementIntoView {
  String baseUrl;
  private WebDriver driver;
  private JavascriptExecutor js;

  @Test
  public void ScrollingElementIntoViewTest() throws Exception {
    //Navigation
    js.executeScript ( "window.location = 'https://learn.letskodeit.com/p/practice'" );
    Thread.sleep ( 1000 );

    //Scroll Down

    Thread.sleep ( 2000 );
    js.executeScript ( "window.scrollBy(0, 1900)" );

    //Scroll up
    Thread.sleep ( 2000 );
    js.executeScript ( "window.scrollBy(0, -1990 )" );

    //Scroll Element into view
    WebElement element = driver.findElement ( By.id ( "mousehover" ) );
    js.executeScript ( "arguments[0].scrollIntoView(true);", element );
    Thread.sleep ( 2000 );
    js.executeScript ( "window.scrollBy(0,190)" );

  }

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver ( );
    js = (JavascriptExecutor) driver;

    // Maximize the browser's window
    driver.manage ( ).window ( ).maximize ( );
    driver.manage ( ).timeouts ( ).implicitlyWait ( 10, TimeUnit.SECONDS );
  }

  @After
  public void tearDown() throws Exception {
    Thread.sleep ( 1000 );
    driver.quit ( );
  }
}


