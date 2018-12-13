package usefulMethods;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class isElementPresentDemo {
  private String baseUrl = "https://learn.letskodeit.com/p/practice";
  private WebDriver driver;
  private GenericMethods gm;

  @Before
  public void setUp() throws Exception {
    driver = new ChromeDriver ( );
    gm = new GenericMethods ( driver );
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

    boolean result1 = gm.isElementPresent("name", "id");
    System.out.println("Is Element Present: " + result1);

    boolean result2 = gm.isElementPresent("name-not-present", "id");
    System.out.println("Is Element Present: " + result2);
  }
}

