package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ElementDisplayed {
  String baseUrl1 = "https://learn.letskodeit.com/p/practice";
  String baseUrl2 = "https://www.expedia.com/";
  WebDriver driver;

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver ( );
    driver.manage ( ).timeouts ( ).implicitlyWait ( 10, TimeUnit.SECONDS );
    driver.manage ( ).window ( ).maximize ( );
  }

  @After
  public void tearDown() throws Exception {
    Thread.sleep ( 3000 );
    driver.quit ( );
  }

  @Test
  public void testExpedia() throws Exception {
    driver.get ( baseUrl2 );

    WebElement childDropdown = driver.findElement(By.id("package-1-age-select-1"));
    System.out.println("Child Drpdown Displayed: " + childDropdown.isDisplayed());
  }

  @Test
  public void testLetsKodeIt() throws Exception {
    driver.get ( baseUrl1 );

    WebElement textBox = driver.findElement ( By.id ( "displayed-text" ) );
    System.out.println ( "Text Box Displayed: " + textBox.isDisplayed ( ) );

    Thread.sleep ( 2000 );

    WebElement hideButton = driver.findElement ( By.id ( "hide-textbox" ) );
    hideButton.click ( );
    System.out.println ( "Clicked on hide button" );
    System.out.println ( "Text Box Displayed: " + textBox.isDisplayed ( ) );

    Thread.sleep ( 2000 );

    WebElement showButton = driver.findElement ( By.id ( "show-textbox" ) );
    showButton.click ( );
    System.out.println ( "Clicked on show button" );
    System.out.println ( "Text Box Displayed: " + textBox.isDisplayed ( ) );
  }
}