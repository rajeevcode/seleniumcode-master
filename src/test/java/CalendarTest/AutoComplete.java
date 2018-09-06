package CalendarTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class AutoComplete {
  private WebDriver driver;
  private String baseUrl;


  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver ( );
    baseUrl = "https://www.southwest.com/";

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
  public void testAutoComplete() throws Exception {
    driver.get ( baseUrl );
    String searchingText = "New York (LaGuardia), NY - LGA";
    String partialText = "New York";

    driver.findElement ( By.id ( "booking-form--flight-tab" ) ).click ( );

    WebElement text = driver.findElement ( By.cssSelector ( "#booking-form--flight-tab > span:nth-child(2)" ) );
    text.sendKeys ( partialText );

    WebElement element = driver.findElement ( By.xpath ( "//*[@id=\"air-city-departure\"]" ));
    List <WebElement> results = element.findElements ( By.tagName ( "li" ) );

    int size = results.size ( );

    System.out.println ("The size of the list: " + size );

    for (int i = 0; i < size; i++) {
      System.out.println ( results.get ( i ).getText ( ) );
    }

    Thread.sleep ( 3000 );
    for (WebElement result : results) {
      if ( result.getText ( ).equals ( searchingText ) ) {
        result.click ( );
      }
    }

  }
}
