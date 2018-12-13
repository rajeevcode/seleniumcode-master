package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
  WebDriver driver;

  @FindBy(id="header-history-sm")
  WebElement headerHistory;

  @FindBy(id = "tab-flight-tab-hp")
  WebElement flightsTab;

  @FindBy(id = "flight-type-multi-dest-label-hp-flight")
  WebElement multipleDestination;

  @FindBy(id = "flight-type-roundtrip-label-hp-flight")
  WebElement roundTrip;

  @FindBy(id="flight-origin-hp-flight")
  WebElement originCity;

  @FindBy(id="flight-destination-hp-flight")
  WebElement destinationCity;

  @FindBy(id="flight-departing-hp-flight")
  WebElement departureDate;

  @FindBy(id="flight-returning-hp-flight")
  WebElement returnDate;

  @FindBy(xpath = "//button[@type='submit']")
  WebElement clickSearchButton;

  public void clickFightTab(){
    flightsTab.click ();
  }

  public void clickRoundTrip(){
    roundTrip.click ();
  }

  public void clickMultipleDestination(){
    multipleDestination.click ();
  }

  public SearchPageFactory(WebDriver driver){
    this.driver = driver;
    //this initialize all the page factory elements
    PageFactory.initElements ( driver,this );
  }

  public void clickFlightsTab(){
    headerHistory.click ();
    flightsTab.click ();
  }

  public void navigateToFlightsTab(WebDriver driver) {
  }

  public void setOriginCity(String origin){
    originCity.sendKeys ( origin );
  }

  public void setDestinationCity(String destination){
    destinationCity.sendKeys ( destination );
  }

  public void setDepartureDate(String flightDepartureDate){
    departureDate.sendKeys ( flightDepartureDate );
  }

  public void setReturnDate(String flightReturnDate){
    returnDate.sendKeys ( flightReturnDate );
  }

  public void setClickSearchButton(){
    clickSearchButton.click ();
  }
}
