package dropBox.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class StreamlineTest {
  private WebDriver driver;
  String baseUrl = "http://localhost:8081/#/";

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
    driver.quit ( );
  }

  @Test
  public void test() throws Exception {
    Thread.sleep ( 2000 );
    driver.get ( baseUrl );
    System.out.println (driver.getCurrentUrl ());
    driver.findElement ( By.xpath ( "//*[@id=\"app\"]/div/div/div/div[2]/div[1]/input" ) ).sendKeys ("admin");
    driver.findElement(By.xpath ("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/input")).sendKeys("password");
    driver.findElement(By.xpath ("//*[@id=\"app\"]/div/div/input")).click ();
    driver.findElement ( By.xpath ( "//*[@id=\"app\"]/div/div[1]/div/div[1]/a" ) ).click ();
  }
}

