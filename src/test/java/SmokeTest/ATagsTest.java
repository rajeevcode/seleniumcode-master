package SmokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.List;
/*author rajeev
 */
 public class ATagsTest {
     WebDriver driver = utilities.DriverFactory.open ("chrome");;
     String webURL = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";

     @Test
     public void loginElementsPresentTest() {
         System.out.println ("Running test");
         boolean createAccountPresent = true;

         // We want to test the presence of A tags >> hyperlinks
         List<WebElement> aElements = driver.findElements (By.tagName ("a"));

         int numberOfAElements = aElements.size ();
         System.out.println ("There are " + numberOfAElements + " a tags on the page");
         //loops added check the test
         for (WebElement aElement : aElements){
             System.out.println (aElement.getText ());
             if ( aElement.equals ("CREATE ACCOUNT") ){
                 createAccountPresent = false;
                 break;
             }
         }
         // Assertion fail
         Assert.assertTrue (createAccountPresent);
     }

     @BeforeMethod
     public void setUp(){
         System.out.println ("Starting test" );
         driver.get (webURL);
     }

     @AfterMethod
     public void tearDown(){
         System.out.println ("Closing test" );
         driver.close ();
   }
 }