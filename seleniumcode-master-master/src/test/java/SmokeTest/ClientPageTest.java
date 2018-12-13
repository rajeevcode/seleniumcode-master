package SmokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClientPageTest {
    WebDriver driver;

    // actions

    public void setUsername(String username) {
        driver.findElement ( By.id ( "us1" ) ).sendKeys ( username );

    }

    public void setPassword(String password) {
        driver.findElement ( By.id ( "pw1" ) ).sendKeys ( password );

    }

    public void clickSubmit() {
        driver.findElement ( By.xpath ( "//div[2]/form/fieldset/button" ) ).click ( );

    }

    public void login(String username, String password) {
        setUsername ( username );
        setPassword ( password );
        clickSubmit ( );
    }
}