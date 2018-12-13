package keypress;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class keyPressDemo2 {
  private String baseUrl = "https://learn.letskodeit.com/p/practice";
  private WebDriver driver;

  @Test
  public void keyPressDemoTest() throws Exception {
    driver.get ( baseUrl );
    //Select entire command+a screen
//    driver.findElement ( By.id ( "openwindow" ) ).sendKeys ( Keys.COMMAND + "a" );
//    Thread.sleep ( 2000 );
    //can be selected entire window in other way
//    driver.findElement ( By.id ( "openwindow" ) ).sendKeys ( Keys.chord ( Keys.COMMAND,"a" ));

    String selectAll = Keys.chord ( Keys.COMMAND,"a" );
    driver.findElement ( By.id ( "openwindow" ) ).sendKeys(selectAll);
    Thread.sleep ( 2000 );

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

