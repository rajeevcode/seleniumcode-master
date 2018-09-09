package base;

import org.testng.annotations.*;

public class BaseTestSuite {

  @BeforeClass
  public void beforeClass() {
    System.out.println ( "\nBaseTestSuite -> before class" );
  }

  @AfterClass
  public void afterClass() {
    System.out.println ( "\nBaseTestSuite -> after class" );
  }

  @BeforeSuite
  public void afterSuite() {
    System.out.println ( "\nBaseTestSuite -> before method" );
  }

  @AfterSuite
  public void beforeSuite() {
    System.out.println ( "\nBaseTestSuite -> after method" );
  }
}
