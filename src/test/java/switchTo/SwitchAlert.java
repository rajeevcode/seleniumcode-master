package switchTo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SwitchAlert {
  String baseUrl = "https://letskodeit.teachable.com/pages/practice";
  private WebDriver driver;

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
  public void test1() throws Exception {
    Thread.sleep ( 1000 );
    driver.findElement ( By.id ( "name") ).sendKeys ( "rajeev" );
    driver.findElement ( By.id ( "alertbtn" ) ).click ();
    Thread.sleep ( 3000 );
    Alert alert = driver.switchTo ().alert ();
    alert.accept ();
  }

  @Test
  public void test2() throws Exception {
    Thread.sleep ( 1000 );
    Thread.sleep ( 1000 );
    driver.findElement ( By.id ( "name") ).sendKeys ( "rajeev" );
    driver.findElement ( By.id ( "confirmbtn" ) ).click ();
    Thread.sleep ( 3000 );
    Alert alert = driver.switchTo ().alert ();
    alert.dismiss ();
  }
}