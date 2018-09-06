package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewAccount {

    public static void main(String[] args) {

        String name = "James Bond";
        String email = "test1@gmail.com";
        String phoneNumber = "98672019922";
        String password = "test123";
        String verifyPassword = "test123";
        String country = "Germany";
        String browserType = "firefox";
        String gender = "Female";
        boolean weeklyEmail = true;
        boolean monthlyEmail = false;
        boolean occassionalEmail = false;

        // Define WebDriver
        WebDriver driver;
        driver = utilities.DriverFactory.open ( browserType );

        // open browser to account management page
        //driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
        driver.get ( "http://sdettraining.com/trguitransactions/NewAccount.aspx" );
        //driver.findElement(By.linkText("Create Account")).click();
        //driver.findElement ( By.xpath ( "/html/body/form/div[3]/div[2]/div/div[2]/a" ) ).click ();
        // /html/body/form/div[3]/div[2]/div/div[2]/a

        // Define WebElements
        WebElement nameElement = driver.findElement ( By.name ( "ctl00$MainContent$txtFirstName" ) );
        //WebElement  nameElement = driver.findElement(By.xpath("//input[@id='MainContent_txtFirstName']"));
        WebElement emailElement = driver.findElement ( By.name ( "ctl00$MainContent$txtEmail" ) );
        WebElement phoneElement = driver.findElement ( By.name ( "ctl00$MainContent$txtHomePhone" ) );
        //WebElement genderElement = driver.findElement(By.cssSelector("input[name='ctl00$MainContent$Gender'][value='Female']"));
        WebElement passwordElement = driver.findElement ( By.name ( "ctl00$MainContent$txtPassword" ) );
        WebElement verifyPasswordElement = driver.findElement ( By.name ( "ctl00$MainContent$txtVerifyPassword" ) );
        WebElement countryElement = driver.findElement ( By.name ( "ctl00$MainContent$menuCountry" ) );
        WebElement maleRadio = driver.findElement ( By.id ( "MainContent_Male" ) );
        WebElement femaleRadio = driver.findElement ( By.id ( "MainContent_Female" ) );
        WebElement weeklyCheckbox = driver.findElement ( By.id ( "MainContent_checkWeeklyEmail" ) );
        WebElement submitButton = driver.findElement ( By.id ( "MainContent_btnSubmit" ) );

        // fill the form
        nameElement.sendKeys ( name );
        emailElement.sendKeys ( email );
        phoneElement.sendKeys ( phoneNumber );

        // genderElement.click();
        passwordElement.sendKeys ( password );
        verifyPasswordElement.sendKeys ( verifyPassword );
        new Select ( countryElement ).selectByValue ( country );

        // Gender radio button algorithm
        if ( gender.equalsIgnoreCase ( "Male" ) ) {
            maleRadio.click ( );
        }
        else femaleRadio.click ( );

        // checkbox algorithm
        if ( weeklyEmail ) {
            if ( !weeklyCheckbox.isSelected ( ) ) ;
            {
                weeklyCheckbox.click ( );
            }
        }
        else {
            if ( weeklyCheckbox.isSelected ( ) ) {
                weeklyCheckbox.click ( );
            }
        }
        // click on submit button
        submitButton.click ( );

        //Get confirmation
        String conf = driver.findElement ( By.id ( "MainContent_lblTransactionResult" ) ).getText ( );
        String expected = "Customer information added successfully";
        if ( conf.contains ( expected ) ) {
            System.out.println ( "Confirmation: " + conf );
        }
        else {
            System.out.println ( "Test Failed" );
        }
        // quit browser
        driver.close ( );
    }
}
