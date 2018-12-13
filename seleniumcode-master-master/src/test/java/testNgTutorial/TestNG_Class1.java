package testNgTutorial;

import base.BaseTestSuite;
import org.testng.annotations.*;

public class TestNG_Class1 extends BaseTestSuite {

  @BeforeMethod
  public void afterMethod() {
    System.out.println ( "\nTestNG_TestClass1 -> before method" );
  }

  @AfterMethod
  public void beforeMethod() {
    System.out.println ( "\nTestNG_TestClass1 -> after method" );
  }

  @BeforeClass
  public void beforeClass() {
    System.out.println ( "\nTestNG_TestClass1 -> before class" );
  }

  @AfterClass
  public void afterClass() {
    System.out.println ( "\nTestNG_TestClass1 -> after class" );
  }


  public void cleanUp() {
  }

  public void setUp() {

  }

  @Test
  public void testMethod1() {
    System.out.println ( "\nTestNG_TestClass1 -> This runs once testMethod1" );
  }

  @Test
  public void testMethod2() {
    System.out.println ( "\nTestNG_TestClass1 -> This runs once testMethod2" );
  }
}
