package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

   // actions
    public void setUsername(String username) {
        driver.findElement ( By.xpath ( "//*[@id=\"MainContent_txtUserName\"]") ).sendKeys (username);

    }

    public void setPassword(String password) {
        driver.findElement ( By.xpath ( "//*[@id=\"MainContent_txtPassword\"]" ) ).sendKeys ( password );

    }

    public void clickSubmit() {
        driver.findElement ( By.xpath ( "//*[@id=\"MainContent_btnLogin\"]" ) ).click ();

    }

    public void login(String username, String password ){
        setUsername ( username);
        setPassword ( password );
        clickSubmit ();
    }

    // Constructor initialize state of the driver
    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }
}
