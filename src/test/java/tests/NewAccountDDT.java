package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RunWith(value = Parameterized.class)
public class NewAccountDDT {
    String name, email, phone, gender, password, country;
    boolean weeklyEmail, monthlyEmail, occassionalEmail;
    WebDriver driver = utilities.DriverFactory.open ( "firefox" );
    WebElement nameElement, emailElement, phoneElement, passwordElement, verifyPasswordElement, countryElement, maleRadio, femaleRadio, weeklyCheckbox, submitButton;

    // constructor that passes parameters to the test method
    public NewAccountDDT(String name, String email, String phone, String gender, String password,
                         String country, String weeklyEmail, String monthlyEmail, String occassionalEmail) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.password = password;
        this.country = country;
        if ( weeklyEmail.equals ( "TRUE" ) ) {
            this.weeklyEmail = true;
        }
        else {
            this.weeklyEmail = false;
        }

        if ( monthlyEmail.equals ( "TRUE" ) ) {
            this.monthlyEmail = true;
        }
        else

        {
            this.monthlyEmail = false;
        }

        if ( occassionalEmail.equals ( "TRUE" ) ) {
            this.occassionalEmail = true;
        }
        else {
            this.occassionalEmail = false;
        }
    }

    // This annotated method is designed to pass parameters into the class via constructor
    @Parameterized.Parameters
    public static List <String[]> getData() {
        return utilities.CSV.get ( "/Users/rajeev.kumar/git/seleniumTraining/csvfile/UserAccounts.csv" );
    }

    // This is our test method
    @Test
    public void newAcccountTest() {
        System.out.println ( "New Record: " + name + "   " + email + " " + phone + " " + gender + " " +
                password + " " + country + " " + weeklyEmail + " " + monthlyEmail + " " + occassionalEmail );

        driver.get ( "http://sdettraining.com/trguitransactions/NewAccount.aspx" );
        driver.manage ( ).timeouts ( ).implicitlyWait ( 10, TimeUnit.SECONDS );

        // Define WebElements
        WebElement nameElement = driver.findElement ( By.id ( "MainContent_txtFirstName" ) );
        WebElement emailElement = driver.findElement ( By.xpath ( "//*[@id=\"MainContent_txtEmail\"]" ) );
        WebElement phoneElement = driver.findElement ( By.xpath ( "//*[@id=\"MainContent_txtHomePhone\"]" ) );
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
        phoneElement.sendKeys ( phone );

        // genderElement.click();
        passwordElement.sendKeys ( password );
        verifyPasswordElement.sendKeys ( password );
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
    }

    @Before
    public void setUp() {
        driver.get ( "http://sdettraining.com/trguitransactions/NewAccount.aspx" );
    }

    @After
    public void tearDown() {
        driver.quit ( );
    }

    public void defineWebElements() {
        nameElement = driver.findElement ( By.id ( "MainContent_txtFirstName" ) );
        emailElement = driver.findElement ( By.xpath ( "//*[@id=\"MainContent_txtEmail\"]" ) );
        phoneElement = driver.findElement ( By.xpath ( "//*[@id=\"MainContent_txtHomePhone\"]" ) );
        passwordElement = driver.findElement ( By.name ( "ctl00$MainContent$txtPassword" ) );
        verifyPasswordElement = driver.findElement ( By.name ( "ctl00$MainContent$txtVerifyPassword" ) );
        countryElement = driver.findElement ( By.name ( "ctl00$MainContent$menuCountry" ) );
        maleRadio = driver.findElement ( By.id ( "MainContent_Male" ) );
        femaleRadio = driver.findElement ( By.id ( "MainContent_Female" ) );
        weeklyCheckbox = driver.findElement ( By.id ( "MainContent_checkWeeklyEmail" ) );
        submitButton = driver.findElement ( By.id ( "MainContent_btnSubmit" ) );
    }
}
