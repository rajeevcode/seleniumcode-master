package usefulMethods;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GetAttributeDemo {
  String baseUrl = "https://learn.letskodeit.com/p/practice";
  WebDriver driver;


  @Before
  public void setUp() throws Exception {
    driver = new ChromeDriver ( );
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
    WebElement element1 = driver.findElement ( By.id ( "name" ) );
    String attributeValue1 = element1.getAttribute ( "class" );

    WebElement element2 = driver.findElement ( By.id ( "name" ) );
    String attributeValue2 = element2.getAttribute ( "name" );

    WebElement element3 = driver.findElement ( By.id ( "name" ) );
    String attributeValue3 = element3.getAttribute ( "placeholder" );

    WebElement element4 = driver.findElement ( By.id ( "name" ) );
    String attributeValue4 = element4.getAttribute ( "type" );

    System.out.println ( "Attribute value of class:" + attributeValue1 );
    System.out.println ( "Attribute value of name:" + attributeValue2 );
    System.out.println ( "Attribute value of placeholder:" + attributeValue3 );
    System.out.println ( "Attribute value of type:" + attributeValue4 );
  }
}

