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

public class JavaScriptClickRetail {
  private WebDriver driver;
  private JavascriptExecutor js;

  @Test
  public void JavaScriptClickRetailTest() throws Exception {
    driver.get ( "https://www.retailmenot.com/" );
    driver.findElement ( By.xpath ( "//div[text()='Log In / Sign up']" ) ).click ( );
    Thread.sleep ( 2000 );

    WebElement checkBoxElement = driver.findElement ( By.id ( "subscribe" ) ) ;
    System.out.println ( "Displayed: " + checkBoxElement.isDisplayed ( ) );
    System.out.println ( "Displayed: " + checkBoxElement.isSelected ( ) );

//    checkBoxElement.click ();

    //checkbox element click
    js.executeScript ( "arguments[0].click();",checkBoxElement );
  }

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver (  );
    js = (JavascriptExecutor) driver;

    // Maximize the browser's window
    driver.manage ( ).window ( ).maximize ( );
    driver.manage ( ).timeouts ( ).implicitlyWait ( 10, TimeUnit.SECONDS );
  }
  @After
  public void tearDown() throws Exception {
    Thread.sleep ( 1000 );
    driver.quit ();
  }
}
