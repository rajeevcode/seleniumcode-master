package keypress;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class keyPressDemo3 {
  private String baseUrl = "https://learn.letskodeit.com/p/practice";
  private WebDriver driver;

  @Test
  public void keyPressDemoTest() throws Exception {
    driver.get ( baseUrl );
    Thread.sleep ( 2000 );
    Actions action = new Actions ( driver );
    action.keyDown ( Keys.COMMAND ).sendKeys ( "a" ).keyUp ( Keys.COMMAND ).perform ( );
  }

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver ( );
    // Maximize the browser's window
    driver.manage ( ).window ( ).maximize ( );
    driver.get ( baseUrl );
    driver.manage ( ).timeouts ( ).implicitlyWait ( 10, TimeUnit.SECONDS );
  }

  @After
  public void tearDown() throws Exception {
    Thread.sleep ( 2000 );
    driver.quit ( );
  }
}


