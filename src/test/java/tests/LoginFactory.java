package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPageFactory;

public class LoginFactory {

    String username = "tim@testemail.com";
    String password = "trpass";
    WebDriver driver;
    String url = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";

    public LoginFactory(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        //1. Initialize the driver
        driver = utilities.DriverFactory.open ( "firefox" );
        driver.get ( url );
    }

    @Test
    public void loginTestPageFactory() {

        /* 2. Enter login information (Login Page) */
        LoginPageFactory loginPage = new LoginPageFactory ( driver );
        loginPage.login (username, password);

        /* Quit browser */
        //driver.quit ();
    }

    @AfterMethod
    public  void tearDown(){

    }
}