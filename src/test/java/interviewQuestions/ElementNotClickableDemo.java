package interviewQuestions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ElementNotClickableDemo {
  private WebDriver driver;
  private String baseUrl;

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver ();
    baseUrl = "https://www.freecrm.com/index.html";

    // Maximize the browser's window
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @Test
  public void testSliderActions() throws Exception {
    driver.get(baseUrl);
    Thread.sleep(3000);
    driver.findElement ( By.name ( "username" ) ).sendKeys ( "naveenk" );

    WebDriverWait wait = new WebDriverWait ( driver,3 );
//    WebElement loginButton = wait.until ( ExpectedConditions.visibilityOfElementLocated
//        ( By.xpath ( "//*[@id=\"loginForm\"]/div/div/input" ) ) );
//    loginButton.click ( );
    boolean invisible = wait.until ( ExpectedConditions.invisibilityOfElementLocated ( By.id ( "preloader" ) ));
    if ( invisible ){
      WebElement loginButton = driver.findElement ( By.xpath ( "//*[@id=\"loginForm\"]/div/div/input" ) );
      loginButton.click ();
    }

  }

  @After
  public void tearDown() throws Exception {
    Thread.sleep ( 2000 );
    driver.quit ();
  }
}


