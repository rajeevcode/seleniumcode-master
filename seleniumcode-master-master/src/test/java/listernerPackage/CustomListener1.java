package listernerPackage;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class CustomListener1 implements IInvokedMethodListener {

  public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
    //Before every method in the test class
    System.out.println ("beforeInvocation: " + testResult.getTestClass ().getName ()
        + " => "+ method.getTestMethod ().getMethodName ());

  }

  public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
    //After every method in the test class
    System.out.println ("afterInvocation: " + testResult.getTestClass ().getName ()
        + " => "+ method.getTestMethod ().getMethodName ());

  }
}
