package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class CreateAccount {

    public static void main(String[] args) {

        String name  = "James Bond";
        String email = "test1@gmail.com";
        String phoneNumber = "98672019922";
        String password = "test123";
        String verifyPassword = "test123";
        String country = "Germany";
        String webUrl = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";

        String gender;
        String weeklyEmail;
        String monthlyEmail;
        String occasionalEmail;

        WebDriver  driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(webUrl);
        driver.findElement(By.linkText("Create Account")).click();
        driver.findElement(By.name("ctl00$MainContent$txtFirstName")).sendKeys("test test");
        driver.findElement(By.name("ctl00$MainContent$txtEmail")).sendKeys("test@test.com");
        driver.findElement(By.name("ctl00$MainContent$txtHomePhone")).sendKeys("98672019922");

        driver.findElement(By.cssSelector("input[name='ctl00$MainContent$Gender'][value='Female']")).click();

        driver.findElement(By.name("ctl00$MainContent$txtPassword")).sendKeys("test@123");
        driver.findElement(By.name("ctl00$MainContent$txtVerifyPassword")).sendKeys("test@123");

        // to select dropdown element
        Select countrySel = new Select(driver.findElement(By.name("ctl00$MainContent$menuCountry")));
        countrySel.selectByValue("Algeria");

        // to select checkbox
        driver.findElement(By.id("MainContent_checkWeeklyEmail")).click();

        driver.findElement(By.name("ctl00$MainContent$btnSubmit")).click();

        //verify
        String conf = driver.findElement(By.id("MainContent_lblTransactionResult")).getText();
        System.out.println("Confirmation: " + conf);
        driver.quit();
    }
}
