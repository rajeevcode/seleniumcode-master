package ActionClass;

import gherkin.lexer.Th;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MouseHoverActions {
  private WebDriver driver;
  private String baseUrl ="https://learn.letskodeit.com/p/practice";
  JavascriptExecutor jse;

  @Before
  public void setUp() throws Exception{
    driver = new ChromeDriver (  );
    driver.get ( baseUrl);
    jse = (JavascriptExecutor)driver;
    driver.manage ().window ().maximize ();
    driver.manage ().timeouts ().implicitlyWait ( 10, TimeUnit.SECONDS );
  }
  @After
  public void tearDown() throws Exception{
    Thread.sleep ( 2000 );
    driver.quit ();
  }
  @Test
  public void MouseHoverActionsTest() throws Exception{
    driver.get ( baseUrl );
    jse.executeScript ( "window.scrollBy(0,800)" );
    Thread.sleep ( 2000 );
    WebElement mainElement = driver.findElement ( By.id ( "mousehover") );

    Actions action = new Actions(driver);
    action.moveToElement ( mainElement ).perform ();
    System.out.println (mainElement );
    Thread.sleep ( 2000 );

    //click on subElement
    WebElement subElement = driver.findElement ( By.linkText ( "Top") );
    action.moveToElement ( subElement ).click ().perform ();
    System.out.println (subElement );
  }
}
