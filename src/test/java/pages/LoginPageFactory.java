package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

    WebDriver driver;

    // Define  webElements at class level
    @FindBy(xpath = "//*[@id=\"MainContent_txtUserName\"]")
    WebElement usernameBox;

    @FindBy(xpath = "//*[@id=\"MainContent_txtPassword\"]")
    WebElement passwordBox;

    @FindBy(xpath = "//*[@id=\"MainContent_btnLogin\"]")
    WebElement loginButton;

    // Steps
    public void setUsername(String username) {
        usernameBox.sendKeys ( username );

    }

    public void setPassword(String password) {
        passwordBox.sendKeys ( password );

    }

    public void clickSubmit() {
        loginButton.click ( );

    }

    // Actions
    public void login(String username, String password){
        setUsername ( username);
        setPassword ( password );
        clickSubmit ();
    }

    // Constructor initialize state of the driver
    public LoginPageFactory(WebDriver driver) {
        this.driver = driver;

        // Initialize webElements
        PageFactory.initElements ( driver, this );
    }

}