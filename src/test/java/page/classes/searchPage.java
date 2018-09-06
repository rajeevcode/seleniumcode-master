package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchPage {
  public static WebElement element = null;

  /**
   * Click on Search button
   */
  public static void clickOnSearchButton(WebDriver driver) {
    element = searchButton ( driver );
  }

  public static void clickSearchButton(WebDriver driver, String ClickButton) {
    element = searchButton ( driver );
    element.sendKeys ( ClickButton );
  }

  /**
   * Returns the Search button text box element
   */

  public static WebElement searchButton(WebDriver driver) {
    element = driver.findElement ( By.id ( "search-button-hp-package" ) );
    return element;
  }

  public static void fillDestinationTextBox(WebDriver driver, String destination) {
    element = destinationTextBox ( driver );
    element.sendKeys ( destination );
  }

  /**
   * Returns the flight destination text box element
   */
  public static WebElement destinationTextBox(WebDriver driver) {
    element = driver.findElement ( By.id ( "package-destination-hp-package" ) );
    return element;
  }

  public static void fillOriginDepartureDate(WebDriver driver, String departure) {
    element = originDepartureDate ( driver );
    element.sendKeys ( departure );
  }

  /**
   * Returns the flight origin text box element
   */
  public static WebElement originDepartureDate(WebDriver driver) {
    element = driver.findElement ( By.id ( "package-departing-hp-package" ) );
    return element;
  }

  public static void fillOriginTextBox(WebDriver driver, String origin) {
    element = originTextBox ( driver );
    element.sendKeys ( origin );
  }

  /**
   * Returns the departure date text box element
   */
  public static WebElement originTextBox(WebDriver driver) {
    element = driver.findElement ( By.id ( "package-origin-hp-package" ) );
    return element;
  }

  public static void fillReturnDate(WebDriver driver, String returnDate) {
    element = returnDate ( driver );
    element.sendKeys ( returnDate );
  }

  /**
   * Returns the return date text box element
   */
  public static WebElement returnDate(WebDriver driver) {
    element = driver.findElement ( By.id ( "package-returning-hp-package" ) );
    return element;
  }

  /**
   * Navigate to flights tab on Search button
   */
  public static void navigateToFlightsTab(WebDriver driver) {
    element = searchButton ( driver );
    element.click ();
  }

}