package SmokeTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BasciActions {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver ( );
        baseUrl = "https://letskodeit.teachable.com/";
        driver.manage ( ).timeouts ( ).implicitlyWait ( 10, TimeUnit.SECONDS );
        driver.manage ( ).window ( ).maximize ( );
    }

    @Test
    public void test() throws InterruptedException {
        driver.get ( baseUrl );
        driver.findElement ( By.linkText ( "LoginTest") ).click ();
        driver.findElement ( By.id("user_email") ).sendKeys ( "test@email.com" );
        System.out.println ("Sending keys to username field" );
        driver.findElement ( By.id ( "user_password" ) ).sendKeys ( "test" );
        System.out.println("Sending keys to password field");
        driver.findElement ( By.id ( "user_email" ) ).clear ();
        System.out.println ("Clearing the username field" );
    }

    @After
    public void tearDown() throws Exception{
        driver.quit();
    }
}
