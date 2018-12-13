package switchTo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SwitchFrame {
  private WebDriver driver;
  String baseUrl = "https://letskodeit.teachable.com/pages/practice";

  @Before
  public void setUp() throws Exception {
    driver = new ChromeDriver ( );
    driver.get ( baseUrl );

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
  public void test() throws Exception {
    Thread.sleep ( 1000 );
    //SwitchTo by id
    driver.switchTo ().frame ( "courses-iframe" );
    //SwitchTo by name
   // driver.switchTo ().frame ( "iframe-name" );
    //Switch to frame by numbers
    // driver.switchTo ().frame ( 0 );


    WebElement searchBox = driver.findElement ( By.id ( "search-courses" ) );
    searchBox.sendKeys ( "Python" );

    driver.switchTo ().defaultContent ();
    driver.findElement ( By.id ( "name" ) ).sendKeys ( "test" );

  }
}


