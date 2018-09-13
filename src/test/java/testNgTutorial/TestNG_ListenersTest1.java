package testNgTutorial;

import listernerPackage.CustomListener1;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener1.class)
public class TestNG_ListenersTest1 {

  @BeforeClass
  public void setUp(){
    System.out.println ("Code is before class" );
  }

  @AfterClass
  public void cleanUp(){
    System.out.println ("Code is after class" );
  }

  @Test
  public void testMethod1(){
    System.out.println ("Code is testMethod1" );
    Assert.assertTrue ( true );
  }

  @Test
  public void testMethod2(){
    System.out.println ("Code is testMethod2" );
    Assert.assertTrue ( false );
  }
}
