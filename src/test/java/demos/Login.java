package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Login {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver ( );
        driver.manage ( ).timeouts ( ).implicitlyWait ( 10, TimeUnit.SECONDS );
        driver.get ( "http://sdettraining.com/trguitransactions/AccountManagement.aspx" );
        driver.findElement ( By.name ( "ctl00$MainContent$txtUserName" ) ).sendKeys ( "tim@testemail.com" );
        driver.findElement ( By.name ( "ctl00$MainContent$txtPassword" ) ).sendKeys ( "trpass" );
        driver.findElement ( By.name ( "ctl00$MainContent$btnLogin" ) ).click ( );
        String message = driver.findElement ( By.id ( "conf_message" ) ).getText ( );
        System.out.println ( "Confirmation: " + message );

        //String actualTitle = driver.getTitle();
        String expectedTitle = "SDET Training | Account Management";
//        assertEquals(expectedTitle, actualTitle);
        // System.out.println(actualTitle);
        if ( driver.getTitle ( ).contains ( "SDET Training | Account Management" ) )
            //Pass
            System.out.println ( "Page Title: " + expectedTitle );
        else
            //Fail
            System.out.println ( "Page title doesn't contains \"SDET Training | Account Management\" " );

        driver.quit ( );

    }
}