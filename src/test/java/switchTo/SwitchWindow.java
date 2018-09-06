package switchTo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SwitchWindow {
  private String baseUrl = "https://learn.letskodeit.com/p/practice";
  private WebDriver driver;
  private String parentHandle;

  @Before
  public void setUp() throws Exception {
    driver = new ChromeDriver ( );
    driver.manage ( ).window ( ).maximize ( );
    driver.manage ( ).timeouts ( ).implicitlyWait ( 10, TimeUnit.SECONDS );
    driver.get ( baseUrl );
  }

  @After
  public void tearDown() throws Exception {
    Thread.sleep ( 2000 );
    driver.quit ( );
  }

  @Test
  public void test() throws Exception {

    // Get the handle
    parentHandle = driver.getWindowHandle ( );
    System.out.println ( "Parent Handle: " + parentHandle );

    // Find Open Window button
    WebElement openWindow = driver.findElement ( By.id ( "openwindow" ) );
    openWindow.click ( );

    // Get all handles
    Set <String> handles = driver.getWindowHandles ( );

    // Switching between handles
    for (String handle : handles) {
      System.out.println ( handle );
      if ( !handle.equals ( parentHandle ) ) {
        driver.switchTo ( ).window ( handle );
        Thread.sleep ( 2000 );
        WebElement searchBox = driver.findElement ( By.id ( "search-courses" ) );
        searchBox.sendKeys ( "python" );
        driver.close ( );
        break;
      }
    }
    //Switch back to the parent window
    driver.switchTo ( ).window ( parentHandle );
    driver.findElement ( By.id ( "name" ) ).sendKeys ( "Test successful" );
  }
}