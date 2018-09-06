package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class RadioButtonAndCheckboxes {
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
  public void test() throws Exception {
    WebElement bmwRadioBtn = driver.findElement ( By.id ( "bmwradio" ) );
    bmwRadioBtn.click ( );

    Thread.sleep ( 2000 );
    WebElement benzRadioBtn = driver.findElement ( By.id ( "benzradio" ) );
    benzRadioBtn.click ( );

    Thread.sleep ( 2000 );
    WebElement hondaRadioBtn = driver.findElement ( By.id ( "hondaradio" ) );
    hondaRadioBtn.click ( );

    WebElement bmwCheckBox = driver.findElement ( By.id ( "bmwcheck" ) );
    bmwCheckBox.click ( );

    WebElement benzCheckBox = driver.findElement ( By.id ( "benzcheck" ) );
    benzCheckBox.click ( );

    WebElement hondaCheckBox = driver.findElement ( By.id ( "hondacheck" ) );
    hondaCheckBox.click ( );


    System.out.println ( "BMW Radio button is selected? " + bmwRadioBtn.isSelected ( ) );
    System.out.println ( "Benz Radio button is selected? " + benzRadioBtn.isSelected ( ) );
    System.out.println ( "Honda Radio button is selected? " + hondaRadioBtn.isSelected ( ) );
    System.out.println ( "BMW Checkbox is selected? " + bmwCheckBox.isSelected ( ) );
    System.out.println ( "Benz Checkbox is selected? " + benzCheckBox.isSelected ( ) );
    System.out.println ( "Honda Checkbox is selected? " + hondaCheckBox.isSelected ( ) );

  }
}
