package listernerPackage;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class CustomListener3 implements ISuiteListener {

  @Override
  public void onStart(ISuite iSuite) {
    //When <suite> tag starts
    System.out.println ("onStart: before suits starts" );
  }

  @Override
  public void onFinish(ISuite iSuite) {
    //When <suite> tag completes
    System.out.println ("onFinish: after suits complete" );
  }
}
