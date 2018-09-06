package usefulMethods;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GenericMethodsDemo {
  private String baseUrl = "https://learn.letskodeit.com/p/practice";
  private WebDriver driver;
  private GenericMethodsOld gm;


  @Before
  public void setUp() throws Exception {
    driver = new ChromeDriver ( );
    gm = new GenericMethodsOld ( driver );
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

    WebElement ele = gm.getElement ( "name", "id" );
    ele.sendKeys ( "test" );
  }
}