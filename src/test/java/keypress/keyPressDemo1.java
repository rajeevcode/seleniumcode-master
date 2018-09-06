package keypress;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class keyPressDemo1 {
  private String baseUrl = "https://learn.letskodeit.com/p/practice";
  private WebDriver driver;

  @Test
  public void keyPressDemoTest() throws Exception {
    driver.get ( baseUrl );
    driver.findElement ( By.xpath ( "//a[@href='/sign_in']" ) ).click ();
    driver.findElement ( By.id ( "user_email" ) ).sendKeys ( "test@email.com" );
    Thread.sleep ( 2000 );
//    driver.findElement ( By.id ( "user_password" ) ).sendKeys ( "123123" );
//    Thread.sleep ( 2000 );
//    driver.findElement ( By.name ( "commit" ) ).sendKeys ( Keys.ENTER );
    //To verify it hits the tab key by pressing window tab
    driver.findElement ( By.id ( "user_email" ) ).sendKeys (Keys.TAB);
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

