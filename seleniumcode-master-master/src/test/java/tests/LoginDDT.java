package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class LoginDDT {
    WebDriver driver;

    @Test(dataProvider = "getData")
    public void loginTest(String name, String email, String password) {

        driver.findElement ( By.name ( "ctl00$MainContent$txtUserName" ) ).sendKeys ( email );
        driver.findElement ( By.name ( "ctl00$MainContent$txtPassword" ) ).sendKeys ( password );
        driver.findElement ( By.name ( "ctl00$MainContent$btnLogin" ) ).click ( );

        // Get confirmation
        String message = driver.findElement ( By.id ( "conf_message" ) ).getText ( );
        System.out.println ( "Confirmation: " + message );
    }
   // should run this 
    @BeforeMethod
    public void setUp() {
        driver = utilities.DriverFactory.open ( "firefox" );
        driver.get ( "http://sdettraining.com/trguitransactions/AccountManagement.aspx" );
        driver.manage ( ).timeouts ( ).implicitlyWait ( 10, TimeUnit.SECONDS );
    }

    @AfterMethod
    public void tearDown() {
        driver.quit ( );
    }

    @DataProvider
    public Object[][] getData() {
        return utilities.Excel.get ( "dataFile/UserLogin.xls" );
    }

}
