package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Unlock {

    public static void main(String[] args) {

        // test
        WebDriver driver = new FirefoxDriver (  );
        driver.get("https://rajeev.instafin.info/client/corporate/1567/dashboard");
    }
}
