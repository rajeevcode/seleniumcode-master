package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {
  WebDriver driver;

  public WaitTypes(WebDriver driver) {
    this.driver = driver;
  }

  public static WebElement getWhenVisible(WebDriver driver) {
return getWhenVisible ( driver );
  }


  public void clickWhenReady(By locator, int timeout) {
    try {
      WebElement element = null;
      System.out.println ( "Waiting for max:: " + timeout + " seconds for the element to be available" );

      WebDriverWait wait = new WebDriverWait ( driver, 3 );
      element = wait.until (
          ExpectedConditions.elementToBeClickable ( locator ) );
      System.out.println ( "Element clicked on the web page" );
      element.click ();
    } catch (Exception e) {
      System.out.println ( "Element not appeared the web page" );
    }
  }

    public WebElement waitForElement(By locator, int timeout) {
    WebElement element = null;
    try {
      System.out.println ( "Waiting for max:: " + timeout + " seconds for the element to be available" );

      WebDriverWait wait = new WebDriverWait ( driver, 3 );
      element = wait.until (
          ExpectedConditions.visibilityOfElementLocated ( locator ) );
      System.out.println ( "Element appeared on the web page" );
    } catch (Exception e) {
      System.out.println ( "Element no appeared on the web page" );
    }
    return element;
  }}