package extentReports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 {
  ExtentReports report;
  ExtentTest test;

  @AfterClass
  public void afterClass() {
    report.endTest ( test );
    report.flush();
  }

  @BeforeClass
  public void beforeClass() {
    report = ExtentFactory.getInstance ();
    test = report.startTest ( "Test2 Class -> Verification" );
  }

  @Test
  public void testMethod() {
    test.log ( LogStatus.INFO, "Test2 -> Test Method Started......." );
    test.log ( LogStatus.INFO, "Test2 -> Test Method Started......." );
    test.log ( LogStatus.INFO, "Test2 -> Test Method Started......." );
  }
}
