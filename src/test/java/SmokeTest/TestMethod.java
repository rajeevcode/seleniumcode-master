package SmokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestMethod {


    public static void main(String[] args) {

//        String browserType = "chrome";
//        String url = "https://rajeev.instafin.info/user/login";
//        String username = "rajeev";
//        String password = "test@123";
//        String clientID = "test1";

        // Login
        WebDriver driver = new ChromeDriver ( );
        driver.get ("https://rajeev.instafin.info/user/login" );
        driver.manage ( ).timeouts ( ).implicitlyWait ( 10, TimeUnit.SECONDS );
        driver.findElement ( By.id ( "us1" ) ).sendKeys ( "rajeev" );
        driver.findElement ( By.id ( "pw1" ) ).sendKeys ( "test@123" );
        driver.findElement ( By.xpath ( "//div[2]/form/fieldset/button" ) ).click ( );
        driver.findElement ( By.xpath ( "/html/body/div[2]/div/div[1]/div/ul/li[4]/a/i" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[2]/div/div[1]/div/ul/li[4]/ul/li[1]/a" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[2]/div/div[2]/div[1]/div[2]/div/a") ).click ();


        //Create Client page
        driver.findElement ( By.id ( "externalId" ) ).sendKeys ( "kumar1" );


//        driver.findElement ( By.xpath ( "//form/div/section[1]/main/div[2]/div/div[2]/div/div/div/div/span[3]/span" ) ).click ();
//        driver.findElement ( By.xpath ( "//*[@id=\"react-select-2--value-item\"]" ) ).isSelected ();
        // driver.findElement ( By.xpath ( "//*[@id=\"react-select-2--value\"]/div[1]" ) ).click ();
        // driver.findElement ( By.xpath ( "//*[@id=\"react-select-2--value-item\"]" ) ).click ();
        List<WebElement> list =  driver.findElements ( By.xpath ( "//*[@id=\"react-select-2--value\"]/div[1]"));
        System.out.println (list.size () );

        for(int i=0; i<list.size (); i++){
            System.out.println (list.get ( i ).getText () );
            if ( list.get ( i ).getText ().contains("Male") ){
                list.get ( i ).click ();
                break;
            }
        }
//        driver.findElement ( By.xpath ( "//*[@id=\\\"react-select-2--value\\\"]/div[1]" ) ).click ();
//        driver.findElement ( By.xpath ( "//*[@id=\"react-select-2--value-item\"]" ) ).sendKeys ( Keys.ARROW_DOWN, Keys.ENTER );

//

//        driver.findElement ( By.id ( "firstName" ) ).sendKeys ( "test" );
//        driver.findElement ( By.id ( "lastName" ) ).sendKeys ( "kumar" );
//        driver.findElement (By.xpath ( "/html/body/div/instafin-app/div/div/div[2]/div/div[2]/div/div/div/div[2]/form/div/section[1]/main/div[7]/div/div[2]/div/div/input" )).clear ();
//        driver.findElement (By.xpath ( "/html/body/div/instafin-app/div/div/div[2]/div/div[2]/div/div/div/div[2]/form/div/section[1]/main/div[7]/div/div[2]/div/div/input" )).sendKeys ( "17/05/2018" );
//        driver.findElement ( By.id ( "idDocument.pattern" ) ).sendKeys ( "10001" );

        //driver.close ();



    }
}
