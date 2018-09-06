package CalendarTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class CalendarSelection {
  private String baseUrl;
  private WebDriver driver;

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver ( );
    baseUrl = "https://www.expedia.com/";

    // Maximize the browser's window
    driver.manage ( ).window ( ).maximize ( );
    driver.manage ( ).timeouts ( ).implicitlyWait ( 3, TimeUnit.SECONDS );
  }

  @After
  public void tearDown() throws Exception {
    Thread.sleep ( 3000 );
    driver.quit ( );
  }

  @Test()
  public void test1() throws Exception {
    driver.get ( baseUrl );
    // Click flights tab
    driver.findElement ( By.id ( "tab-flight-tab" ) ).click ( );
    // Find departing field
    WebElement departingField = driver.findElement ( By.id ( "flight-departing" ) );
    // Click departing field
    departingField.click ( );
    Thread.sleep ( 3000 );
    // Find the date to be selected
    WebElement dateToSelect = driver.findElement ( By.xpath ( "//section[@class='cal-month'][position()=1]//a[text()='31']" ) );
    // Click the date
    dateToSelect.click ( );


  }
}


