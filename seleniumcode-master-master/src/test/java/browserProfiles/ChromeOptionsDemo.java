package browserProfiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class ChromeOptionsDemo {

  public static void main(String[] args) {

    String baseURL = "http://www.google.com";
    WebDriver driver;
//    System.setProperty ( "webdriver.chrome.driver", "//Users//rajeev.kumar//Downloads//chromedriver" );

    ChromeOptions options = new ChromeOptions ( );
    options.addExtensions ( new File ( "/Users/rajeev.kumar/Library/Application Support/Google/Chrome/Default/Extensions/oijdcdmnjjgnnhgljmhkjlablaejfeeb/0.3_0.crx" ) );

    driver = new ChromeDriver ( options );
    driver.get ( baseURL );
    driver.quit ();
  }
}