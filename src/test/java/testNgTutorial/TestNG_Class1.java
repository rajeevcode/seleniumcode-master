package testNgTutorial;

import org.testng.annotations.*;

public class TestNG_Class1 {

  @BeforeMethod
  public void afterMethod() {
    System.out.println ( "\nTestNG_Class1 -> This runs once before method" );
  }

  @AfterMethod
  public void beforeMethod() {
    System.out.println ( "\nTestNG_Class1 -> This runs once after method" );
  }

  @BeforeClass
  public void beforeClass() {
    System.out.println ( "\nTestNG_Class1 -> This runs once before before class" );
  }

  @AfterClass
  public void afterClass() {
    System.out.println ( "\nTestNG_Class1 -> This runs once after class" );
  }


  public void cleanUp() {
  }

  public void setUp() {

  }

  @Test
  public void testMethod1() {
    System.out.println ( "\nTestNG_Class1 -> This runs once testMethod1" );
  }

  @Test
  public void testMethod2() {
    System.out.println ( "\nTestNG_Class1 -> This runs once testMethod2" );
  }
}
