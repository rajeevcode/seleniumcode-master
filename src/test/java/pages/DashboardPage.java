package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    WebDriver driver;

    public String confirmationMessage() {
        return driver.findElement ( By.id ( "conf_message" ) ).getText ( );
    }

    public String title(){
        return driver.getTitle ();
    }

    public void changePassword() {
        driver.findElement ( By.xpath ( "//*[@id=\"ctl01\"]/div[3]/div[2]/div/div[2]/ul/li[1]/a" ) ).click ( );

    }

    public void updateSubscription() {
        driver.findElement ( By.xpath ( "//*[@id=\"ctl01\"]/div[3]/div[2]/div/div[2]/ul/li[2]/a" ) ).click ( );
    }

    public void cancelAccount() {
        driver.findElement ( By.xpath ( "//*[@id=\"ctl01\"]/div[3]/div[2]/div/div[2]/ul/li[3]/a" ) ).click ( );
    }

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

}
