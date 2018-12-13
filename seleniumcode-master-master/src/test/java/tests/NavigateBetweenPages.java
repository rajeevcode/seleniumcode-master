package tests;

import SmokeTest.BasciActions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;


public class NavigateBetweenPages extends BasciActions {
  String baseUrl;
  WebDriver driver;

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver ( );
    baseUrl = "https://letskodeit.teachable.com/";
    driver.manage ( ).timeouts ( ).implicitlyWait ( 10, TimeUnit.SECONDS );
    driver.manage ( ).window ( ).maximize ( );
  }

  @Test
  public void test() throws InterruptedException {
    driver.get ( baseUrl );
    String title = driver.getTitle ( );
    System.out.println ( "Title of the page is: " + title );

    String currentURl = driver.getCurrentUrl ( );
    System.out.println ( "Current Url is: " + currentURl );

    String urlToNavigate = "https://sso.teachable.com/secure/42299/users/sign_in?reset_purchase_session=1";
    driver.navigate ( ).to ( urlToNavigate );
    System.out.println ( "Navigating To LoginTest" );
    currentURl = driver.getCurrentUrl ( );
    System.out.println ( "Current Url is: " + currentURl );

    Thread.sleep ( 2000 );

    driver.navigate ( ).back ( );
    System.out.println ( "Navigate Back" );
    currentURl = driver.getCurrentUrl ( );
    System.out.println ( "Current URL is: " + currentURl );

    Thread.sleep ( 2000 );

    driver.navigate ( ).back ( );
    System.out.println ( "Navigate Forward" );
    currentURl = driver.getCurrentUrl ( );
    System.out.println ( "Current URL is: " + currentURl );

    Thread.sleep ( 2000 );
    driver.navigate ( ).back ( );
    System.out.println ( "Navigate Back" );
    currentURl = driver.getCurrentUrl ( );
    System.out.println ( "Current URL is: " + currentURl );

    driver.navigate ( ).refresh ( );
    System.out.println ( "Navigate Refresh1" );
    driver.get ( currentURl );
    System.out.println ( "Navigate Refresh2" );

    String pageSource = driver.getPageSource ();
    System.out.println (pageSource );
  }

  @After
  public void tearDown() throws Exception {
    driver.quit ( );
  }
}
