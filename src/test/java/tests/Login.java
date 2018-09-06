package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class Login {

    // WebDriver driver;

    @Test
    public void loginTestPOM() {

        //1. Initialize the driver
        WebDriver driver = utilities.DriverFactory.open ( "firefox" );
        driver.manage ( ).timeouts ( ).implicitlyWait ( 10, TimeUnit.SECONDS );
        ///String webURL = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";
        driver.get ( "http://sdettraining.com/trguitransactions/AccountManagement.aspx" );


        // 2. Enter login information (Login Page)
        LoginPage loginPage = new LoginPage ( driver );
        loginPage.setUsername ( "test1@test.com" );
        loginPage.setPassword ( "test@123" );
        loginPage.clickSubmit ( );

        // 3. Get Confirmation (Dashboard Page)
        DashboardPage dashboardPage = new DashboardPage ( driver );
        String conf = dashboardPage.confirmationMessage ( );
        String title = dashboardPage.title ( );

        // 4. Assertions
        Assert.assertTrue ( conf.contains ( "success" ) );
        Assert.assertTrue ( title.contains ( "Account" ) );

        // 5. Close the Driver
        driver.quit ( );

    }
}
