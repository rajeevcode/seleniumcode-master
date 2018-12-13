package listernerPackage;

import org.testng.*;

public class CustomListeners implements IInvokedMethodListener, ITestListener, ISuiteListener {

  public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
    //Before every method in the test class
    System.out.println ( "beforeInvocation: " + testResult.getTestClass ( ).getName ( )
        + " => " + method.getTestMethod ( ).getMethodName ( ) );
  }

  public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
    //After every method in the test class
    System.out.println ( "afterInvocation: " + testResult.getTestClass ( ).getName ( )
        + " => " + method.getTestMethod ( ).getMethodName ( ) );
  }

  @Override
  public void onStart(ISuite iSuite) {
    //When <suite> tag starts
    System.out.println ( "onStart: before suits starts" );
  }

  @Override
  public void onFinish(ISuite iSuite) {
    //When <suite> tag completes
    System.out.println ( "onFinish: after suits complete" );
  }

  @Override
  public void onTestStart(ITestResult result) {
    // When test method starts
    System.out.println ( "onTestStart -> Test Name: " + result.getName ( ) );
  }

  @Override
  public void onTestSuccess(ITestResult result) {
    // If test method is successful
    System.out.println ( "onTestSuccess -> Test Name: " + result.getName ( ) );
  }

  @Override
  public void onTestFailure(ITestResult result) {
    // If test method is failed
    System.out.println ( "onTestFailure -> Test Name: " + result.getName ( ) );
  }

  @Override
  public void onTestSkipped(ITestResult result) {
    // If test method is failed
  }

  @Override
  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    // Ignore this
  }

  @Override
  public void onStart(ITestContext context) {
    // Before <test> tag of xml file
    System.out.println ( "onStart -> Test Tag Name: " + context.getName ( ) );
    ITestNGMethod methods[] = context.getAllTestMethods ( );
    System.out.println ( "These methods will be executed in this test tag:" );
    for (ITestNGMethod method : methods) {
      System.out.println ( method.getMethodName ( ) );
    }
  }

  @Override
  public void onFinish(ITestContext context) {
    // After <test> tag of xml file
    System.out.println ( "onFinish -> Test Tag Name: " + context.getName ( ) );
  }
}
