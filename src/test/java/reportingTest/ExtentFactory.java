package reportingTest;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {
  public static ExtentReports getInstance(){
    ExtentReports extent;
    String Path ="/Users/rajeev.kumar/Desktop/ExtentReports/logintest.html";
    extent = new ExtentReports (Path, false);
    extent
        .addSystemInfo ( "Selenium Version", "3.11" )
        .addSystemInfo ( "Platform", "Mac" );
    return extent;
  }
}
