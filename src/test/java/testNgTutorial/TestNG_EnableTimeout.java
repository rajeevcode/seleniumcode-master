package testNgTutorial;

import org.testng.annotations.*;

public class TestNG_EnableTimeout {

  @BeforeClass
  public void setUp() {
    System.out.println("TestNG_TestClass2 -> before class");
  }

  @AfterClass
  public void cleanUp() {
    System.out.println("TestNG_TestClass2 -> after class");
  }

  @Test(enabled = false)
  public void testMethod1() {
    System.out.println("\nTestNG_TestClass2 -> testMethod1");
  }

  @Test(timeOut = 300)
  public void testMethod2() throws Exception {
    System.out.println("\nTestNG_TestClass2 -> testMethod2");
    Thread.sleep ( 200 );
  }
}


