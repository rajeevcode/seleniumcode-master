package JavaScriptExecutorTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class JavaScriptExecution {
  private WebDriver driver;
  String baseUrl;
  private JavascriptExecutor js;

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://letskodeit.teachable.com/pages/practice";
    js = (JavascriptExecutor) driver;

    // Maximize the browser's window
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @After
  public void tearDown() throws Exception {
    Thread.sleep ( 1000 );
    driver.quit ( );
  }

  @Test
  public void testJavaScriptExecution() throws Exception {
    //Navigation
    //driver.get ( baseUrl );
    js.executeScript ("window.location = 'https://letskodeit.teachable.com/pages/practice';");

    //Finding element
    WebElement textBox = driver.findElement ( By.id ( "name") );
    textBox.sendKeys ( "test" );

  }
}


