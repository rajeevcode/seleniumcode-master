package ActionClass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDropActions {
  //JavascriptExecutor jse;
  private String baseUrl = "https://jqueryui.com/droppable/";
  private WebDriver driver;

  @Test
  public void MouseHoverActionsTest() throws Exception {
    driver.get ( baseUrl );
    Thread.sleep ( 2000 );
    driver.switchTo ( ).frame ( 0 );

    WebElement fromElement = driver.findElement ( By.id ( "draggable" ) );
    WebElement toElement = driver.findElement ( By.id ( "droppable" ) );

    Actions action = new Actions ( driver );

    //drag and drop
//    action.dragAndDrop ( fromElement, toElement ).build ( ).perform ( );


    //Click and hold, move to element,release,build and perform
    action.clickAndHold ( fromElement ).moveToElement ( toElement ).release ( ).build ( ).perform ( );

  }

  @Before
  public void setUp() throws Exception {
    driver = new ChromeDriver ( );
    driver.get ( baseUrl );
    //jse = (JavascriptExecutor) driver;
    driver.manage ( ).window ( ).maximize ( );
    driver.manage ( ).timeouts ( ).implicitlyWait ( 10, TimeUnit.SECONDS );
  }

  @After
  public void tearDown() throws Exception {
    Thread.sleep ( 2000 );
    driver.quit ( );
  }
}
