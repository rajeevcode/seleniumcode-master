package tests;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.WaitTypes;

public class ImplicitWaitDemo {
    private WebDriver driver;
    private String baseUrl;
    WaitTypes wt;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://letskodeit.teachable.com/pages/practice";
        wt = new WaitTypes ( driver );

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test()
    public void test() throws Exception {
        driver.get(baseUrl);
        WebElement loginLink =driver.findElement (By.linkText ( "LoginTest" ));
        loginLink.click ();

        WebElement emailField = wt.waitForElement ( By.id ( "user_email" ),3 );
        emailField.sendKeys ( "test" );

        //driver.findElement(By.id("user_email")).sendKeys("test");
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }
}
