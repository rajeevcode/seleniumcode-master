package testcase.Expedia;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import page.classes.SearchPageFactory;

import java.util.concurrent.TimeUnit;

public class FrameworkTestCase {
  private WebDriver driver;
  private String baseUrl ="https://www.expedia.com/";
  SearchPageFactory searchPage;

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver ( );
    driver.get ( baseUrl );

    searchPage = new SearchPageFactory ( driver );

    // Maximize the browser's window
    driver.manage ( ).window ( ).maximize ( );
    driver.manage ( ).timeouts ( ).implicitlyWait ( 10, TimeUnit.SECONDS );
  }

  @After
  public void tearDown() throws Exception {
    Thread.sleep ( 2000 );
    driver.quit ( );
  }

  @Test
  public void test(){
    searchPage.clickFightTab ();
    searchPage.setOriginCity ("New York");
    searchPage.setDestinationCity ("Chicago");
    searchPage.setDepartureDate ( "12/25/2018" );
    searchPage.setReturnDate ( "12/31/2018" );
    searchPage.setClickSearchButton ();
  }
}