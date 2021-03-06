package extentReports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class LoginTest {
  private String baseUrl;
  private WebDriver driver;
  ExtentReports report;
  ExtentTest test;
  HomePage homePage;

  @BeforeClass
  public void beforeClass() {
    baseUrl = "http://www.letskodeit.com/";
    report = ExtentFactory.getInstance();
    test = report.startTest("Verify Welcome Text");
    driver = new ChromeDriver ();
    homePage = new HomePage(driver, test);
    test.log(LogStatus.INFO, "Browser Started...");

    // Maximize the browser's window
    driver.manage().window().maximize();
    test.log(LogStatus.INFO, "Browser Maximized");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get(baseUrl);
    test.log(LogStatus.INFO, "Web application opened");;
  }

  @Test
  public void test1_validLoginTest() throws Exception {

    homePage.login ( "test1@email.com", "abcabc" );

    Thread.sleep ( 3000 );

    boolean result = homePage.isWelcomeTextPresent ( );

    Assert.assertTrue ( result );
    test.log ( LogStatus.PASS, "Verified Welcome Text" );
  }

  @AfterClass
  public void tearDown() throws Exception {
    report.endTest ( test );
    report.flush ( );
    driver.quit ( );
  }
}
