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

public class WindowSize {
  String baseUrl;
  private WebDriver driver;
  private JavascriptExecutor js;

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

  @Test
  public void testJavaScriptExecution() throws Exception {
    //Navigation
    //driver.get ( baseUrl );
    js.executeScript ( "window.location = 'https://letskodeit.teachable.com/pages/practice';" );

    //size of the window
    long height = (Long) js.executeScript ( "return window.innerHeight;" );
    long width = (Long) js.executeScript ( "return window.innerWidth;" );

    //Finding element returns long type from javascript
    WebElement textBox = driver.findElement ( By.id ( "name" ) );
    textBox.sendKeys ( "test" );

    System.out.println ("Height is: " + height );
    System.out.println ("Width is: " + width );
  }
}

