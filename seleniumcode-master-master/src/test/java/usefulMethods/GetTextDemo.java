package usefulMethods;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GetTextDemo {
  String baseUrl = "https://learn.letskodeit.com/p/practice";
  WebDriver driver;


  @Before
  public void setUp() throws Exception {
    driver = new ChromeDriver ( );
    driver.manage ( ).timeouts ( ).implicitlyWait ( 10, TimeUnit.SECONDS );
    driver.manage ( ).window ( ).maximize ( );
  }

  @After
  public void tearDown() throws Exception {
    Thread.sleep ( 3000 );
    driver.quit ( );
  }

  @Test
  public void testGetText() throws Exception {
    driver.get ( baseUrl );

    WebElement buttonElement1 = driver.findElement ( By.id ( "opentab" ) );
    String elementText1 = buttonElement1.getText ( );

    WebElement buttonElement2 = driver.findElement ( By.id ( "openwindow" ) );
    String elementText2 = buttonElement2.getText ();

    System.out.println ( "Text on the element is: " + elementText1 );
    System.out.println ( "Text on the element is: " + elementText2 );
  }


}
