package dropBox.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DropBoxTestTask {
  private WebDriver driver;
  String baseUrl = "https://www.dropbox.com/";

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver ( );
    driver.get ( baseUrl );

    // Maximize the browser's window
    driver.manage ( ).window ( ).maximize ( );
    driver.manage ( ).timeouts ( ).implicitlyWait ( 10, TimeUnit.SECONDS );
  }

  @After
  public void tearDown() throws Exception {
    Thread.sleep ( 1000 );
//    driver.quit ( );
  }

  @Test
  public void test() throws Exception {
    Thread.sleep ( 2000 );
    driver.get ( baseUrl );
    System.out.println (driver.getCurrentUrl ());
    driver.findElement ( By.id ( "sign-up-in" ) ).click ();
    driver.findElement(By.xpath ("//input[@type='email']")).sendKeys("test_19@gmail.com");
    driver.findElement(By.xpath ("//input[@type='password']")).sendKeys("test@123");
    driver.findElement ( By.xpath ( "//button[@type='submit']" ) ).click ();

  }
}

