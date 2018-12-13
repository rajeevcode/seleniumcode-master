package testNgTutorial;

import org.testng.annotations.*;

public class TestNG_BeforeClassAnnotations {

  @BeforeClass
  public void setUp(){
    System.out.println ( "\nThis runs once before class" );
  }

  @AfterClass
  public void cleanUp(){
    System.out.println ( "\nThis runs once after class" );
  }

  @AfterMethod
  public void afterMethod() {
    System.out.println ( "\nRunning Test -> AfterMethod" );
  }

  @BeforeMethod
  public void beforeMethod() {
    System.out.println ( "\nRunning Test -> BeforeMethod" );
  }

  @Test
  public void testMethod1() {
    System.out.println ( "\nRunning Test -> testMethod1" );
  }

  @Test
  public void testMethod2() {
    System.out.println ( "\nRunning Test -> testMethod2" );
  }
}
