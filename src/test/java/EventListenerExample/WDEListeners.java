package EventListenerExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class WDEListeners {
  public static void main(String[] args) {
    String baseUrl = "https://www.expedia.com/";
    WebDriver driver = new FirefoxDriver ( );

    //Create instance of eDriver
    EventFiringWebDriver eDriver = new EventFiringWebDriver ( driver );

    //Create instance of Handle events
    HandleEvents he = new HandleEvents ( );
    //Register to the HandleEvents
    eDriver.register (he);

    eDriver.get (baseUrl);
    eDriver.findElement ( By.id ("tab-flight-tab-hp") ).click ( );
    driver.quit ();
  }
}