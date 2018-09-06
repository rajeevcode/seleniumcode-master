package tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Expedia {
    WebDriver driver;
    String browserType = "firefox";
    String url = "https://www.expedia.com/";
    String city = "New York";
    String checkIn = "05/17/2018";
    String checkOut = "06/12/2018";
    String numberOfGuest = "1";
    String starRating = "star4";
    String searchResult = "3";

    @Test
    public void hotelReservation() throws IOException {

        // Screenshot
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy somewhere
        FileUtils.copyFile(scrFile, new File("/Users/rajeev.kumar/git/seleniumTraining/screenshots/screenshot.png"));

        // Search
        driver.findElement ( By.xpath ( "//*[@id=\"tab-hotel-tab-hp\"]" ) ).click ( );
        driver.findElement ( By.xpath ( "//*[@id=\"hotel-destination-hp-hotel\"]" ) ).clear ( );
        driver.findElement ( By.xpath ( "//*[@id=\"hotel-destination-hp-hotel\"]" ) ).sendKeys ( city );
        driver.findElement ( By.id ( "hotel-checkin-hp-hotel" ) ).clear ( );
        driver.findElement ( By.id ( "hotel-checkin-hp-hotel" ) ).sendKeys ( checkIn );
        driver.findElement ( By.id ( "hotel-checkout-hp-hotel" ) ).clear ( );
        driver.findElement ( By.id ( "hotel-checkout-hp-hotel" ) ).sendKeys ( checkOut );
        driver.findElement ( By.xpath ( "//div[1]/div[2]/div[2]/section[2]/form/div[4]/div[3]/div/ul/li/button" ) ).sendKeys ( numberOfGuest );
        driver.findElement ( By.xpath ( "//div/div/div/section/div[1]/div[2]/div[2]/section[2]/form/div[9]/label/button" ) ).click ( );

        // Print the city name
        //String actualCity = driver.findElement ( By.cssSelector ( "button.destination:nth-child(3)" ) ).getText ();
        String actualCity = driver.findElement ( By.cssSelector ( "input[name='star'][id='" + starRating + "']" ) ).getText ( );
        System.out.println ( "CITY: " + actualCity );


        // Modify the search results
        driver.findElement ( By.xpath ( "//div[11]/div[2]/div[12]/aside/div[13]/fieldset/details/div/label[1]/strong/span[2]" ) ).click ( );

        // Analyze the result and make our selection
        // driver.findElement ( By.xpath ( "//*[@id=\"17117062\"]" ) ).click ();
        driver.findElement ( By.xpath ( "//*[@id=\"resultsContainer\"]/section/article[" + searchResult + "]/div[2]/div/a" ) ).click ( );

        //*[@id="5358"]

        // Switch the window pop up
        ArrayList<String> windows = new ArrayList <String> ( driver.getWindowHandles () );
        driver.switchTo ().window ( windows.get ( 1 ) );

        //Print hotel name and star rating
        String hotelName = driver.findElement ( By.cssSelector ( "#hotel-name" ) ).getText ();
        String hotelRating = driver.findElement ( By.cssSelector ( "span[class='rating-scale']" ) ).getText ();
        System.out.println ("HotelName: " + hotelName);
        System.out.println ("HotelRating: " + hotelRating);

        // Book reservation
        driver.findElement ( By.xpath ( "/html/body/div[3]/div[9]/section/div[11]/div/article/table/tbody[1]/tr[1]/td[4]/div/div[1]/button" ) ).click ();
        //driver.switchTo ().window ( 1 );
        //driver.findElement ( By.xpath ( "//*[@id=\"pay-now-button\"]" )).click ();
        driver.findElement ( By.cssSelector ( "#pay-now-button" ) ).click ();

        //Get confirmation
        String pageTitle = driver.getTitle ();
        Assert.assertTrue ( pageTitle.contains ( "Payment" ) );
    }

    @BeforeTest
    public void setUp() throws IOException {
        driver = utilities.DriverFactory.open ( browserType );
        driver.manage ( ).timeouts ( ).implicitlyWait ( 10, TimeUnit.SECONDS );
        driver.get ( url );
    }

    @AfterTest
    public void tearDown() {
        driver.quit ( );
    }
}


