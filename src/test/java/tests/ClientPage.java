package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ClientPage {
    WebDriver driver;
    String browserType = "chrome";
    String url = "https://rajeev.instafin.info/user/login";
    String username = "rajeev";
    String password = "test@123";
    String clientID ="test1";
    String clientGender;
   // WebElement element = driver.findElement(By.xpath ( "//*[@id=\"react-select-2--value-item\"]"));

    @Test
    public void hotelReservation() throws IOException {


        // Login
        driver.findElement ( By.id ( "us1" ) ).sendKeys ( username );
        driver.findElement ( By.id ( "pw1" ) ).sendKeys ( password );
        driver.findElement ( By.xpath ( "//div[2]/form/fieldset/button" ) ).click ( );
        driver.findElement ( By.xpath ( "//*[@id=\"content\"]/div[2]/div/div[2]/a[1]" ) ).click ();
        driver.findElement ( By.xpath ( "//*[@id=\"createUserButton\"]" )).click ();

 ;
    }

    @BeforeTest
    public void setUp() throws IOException {
        driver = utilities.DriverFactory.open ( browserType );
        driver.manage ( ).timeouts ( ).implicitlyWait ( 10, TimeUnit.SECONDS );
        driver.get ( url );
    }

    @AfterTest
    public void tearDown() {
        //driver.quit ( );
    }
}


