package cucumberTest;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/LogIn_Test.feature", glue="stepDefinition")
//@CucumberOptions(
//        Feature= "Feature/LogIn_Test.feature",
//        glue = {"stepDefinition"})
public class LoginTestRunner {


}
