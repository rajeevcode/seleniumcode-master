package interviewQuestions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ElementNotClickableDemoJS {
  private String baseUrl;
  private WebDriver driver;

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver ( );
    baseUrl = "https://www.freecrm.com/index.html";

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
  public void testSliderActions() throws Exception {
    Thread.sleep ( 3000 );
    JavascriptExecutor js = (JavascriptExecutor) driver;
    driver.get ( baseUrl );
    driver.findElement ( By.name ( "username" ) ).sendKeys ( "naveenk" );

    WebDriverWait wait = new WebDriverWait ( driver, 3 );
//    boolean invisible = wait.until ( ExpectedConditions.invisibilityOfElementLocated ( By.id ( "preloader" ) ));
//    if ( invisible ){
//      WebElement loginButton = driver.findElement ( By.xpath ( "//*[@id=\"loginForm\"]/div/div/input" ) );
//      loginButton.click ();
//    }
    WebElement loginButton = driver.findElement ( By.xpath ( "//*[@id=\\\"loginForm\\\"]/div/div/input" ) );
    js.executeScript ( "arguments[0].click();", loginButton );
  }
}

