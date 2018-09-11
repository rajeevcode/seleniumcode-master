package testNgTutorial;

import org.testng.annotations.*;

public class TestNG_Grouping {

  @BeforeClass
  public void beforeClass() {
    System.out.println ( "Before class" );
  }

  @AfterClass
  public void afterClass() {
    System.out.println ( "After method" );
  }

  @Test(groups = {"cars", "suv"})
  public void testBMWX6() {
    System.out.println ( "Running Test-> BMW X6" );
  }

  @Test(groups = {"cars","sedan"})
  public void testAudiA6() {
    System.out.println ( "Running Test-> Audi A6" );
  }

  @Test(groups = {"bikes"})
  public void testNinja() {
    System.out.println ( "Running Test-> Kawasaki Ninja" );
  }

  @Test(groups = {"sportsBike","bikes"})
  public void testHondaCBR() {
    System.out.println ( "Running Test-> Honda CBR" );
  }
}