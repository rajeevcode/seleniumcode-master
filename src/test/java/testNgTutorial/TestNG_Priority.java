package testNgTutorial;

import org.testng.annotations.*;

public class TestNG_Priority {

  @BeforeClass
  public void setUp() {
    System.out.println("TestNG_TestClass2 -> before class");
  }

  @AfterClass
  public void cleanUp() {
    System.out.println("TestNG_TestClass2 -> after class");
  }

  @BeforeMethod
  public void beforeMethod() {
    System.out.println("TestNG_TestClass2 -> before method");
  }

  @AfterMethod
  public void afterMethod() {
    System.out.println("TestNG_TestClass2 -> after method");
  }

  @Test(priority = 2)
  public void testMethod1() {
    System.out.println("TestNG_TestClass2 -> testMethod1");
  }

  @Test(priority = 1)
  public void testMethod2() {
    System.out.println("\nTestNG_TestClass2 -> testMethod2");
  }

  @Test(priority = 0)
  public void testMethod3() {
    System.out.println("\nTestNG_TestClass2 -> testMethod3");
  }
}
