package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownSelect {

  String baseUrl = "https://learn.letskodeit.com/p/practice";
  WebDriver driver;


  @Before
  public void setUp() throws Exception {
    driver = new ChromeDriver ( );
    driver.manage ( ).timeouts ( ).implicitlyWait ( 10, TimeUnit.SECONDS );
    driver.manage ( ).window ( ).maximize ( );
    driver.get ( baseUrl );
  }

  @After
  public void tearDown() throws Exception {
    Thread.sleep ( 3000 );
    driver.quit ( );
  }

  @Test
  public void testDropDown() throws Exception {
    driver.get ( baseUrl );
    WebElement element = driver.findElement ( By.id ( "carselect" ) );
    Select sel = new Select ( element );

    Thread.sleep ( 2000 );
    System.out.println ( "Select Benz by value" );
    sel.selectByValue ( "benz" );

    Thread.sleep ( 2000 );
    System.out.println ( "Select Honda by index" );
    sel.selectByIndex ( 2 );

    Thread.sleep ( 2000 );
    System.out.println ( "Select BMW by visible text" );
    sel.selectByVisibleText ( "BMW" );

    Thread.sleep ( 2000 );
    System.out.println ( "Select Benz by value" );
    sel.selectByValue ( "benz" );
    System.out.println ("*******************" );
    Thread.sleep ( 2000 );
    System.out.println ( "Print the list of all options" );
    List <WebElement> options = sel.getOptions ( );
    int size = options.size ( );

    for (int i = 0; i < size; i++) {
      String optionName = options.get ( i ).getText ( );
      System.out.println ( optionName );

    }

  }

}
