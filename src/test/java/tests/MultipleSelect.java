package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MultipleSelect {
  String baseUrl = "https://learn.letskodeit.com/p/practice";
  WebDriver driver;

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver ( );
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
  public void testMultiSelect() throws Exception {
    driver.get ( baseUrl );
    WebElement element = driver.findElement ( By.id ( "multiple-select-example" ) );
    Select sel = new Select ( element );
    sel.selectByValue ( "orange" );

    Thread.sleep ( 2000 );
    System.out.println ( "Select orange by value" );
    sel.selectByValue ( "orange" );

    Thread.sleep ( 2000 );
    System.out.println ( "De-select orange by value" );

    Thread.sleep ( 2000 );
    System.out.println ( "Select peach by index" );
    sel.selectByIndex ( 2 );

    Thread.sleep ( 2000 );
    System.out.println ( "Select Apple by visible text" );
    sel.selectByVisibleText ( "Apple" );

    Thread.sleep ( 2000 );
    System.out.println ( "Print all selected options" );
    List <WebElement> selectedOptions = sel.getAllSelectedOptions ( );
    for (WebElement option : selectedOptions) {
      System.out.println ( option.getText ( ) );
    }

    Thread.sleep ( 2000 );
    System.out.println ( "De-select orange by value" );
    sel.deselectAll ( );


  }

}
