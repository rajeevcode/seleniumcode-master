package testcase.Expedia;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import page.classes.searchPage;

import java.util.concurrent.TimeUnit;

public class PageObjectModel {
  private String baseUrl = "https://www.expedia.com/";
  private WebDriver driver;

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

  @Test
  public void test() {
    driver.get ( baseUrl );
    searchPage.fillOriginTextBox ( driver, "New York" );
    searchPage.fillDestinationTextBox ( driver,"Chicago" );
    searchPage.fillOriginDepartureDate ( driver,"12/25/2018" );
    searchPage.fillReturnDate ( driver,"12/31/2018" );
    searchPage.searchButton(driver);
  }
}
