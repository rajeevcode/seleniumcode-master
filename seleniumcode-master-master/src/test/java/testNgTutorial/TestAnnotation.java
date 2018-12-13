package testNgTutorial;

import org.testng.annotations.Test;

public class TestAnnotation {

  //Default running is based on alphabetical order

  @Test
  public void btestMethod2() {
    System.out.println ( "Running Test -> testMethod2" );
  }

  @Test
  public void ctestMethod3() {
    System.out.println ( "Running Test -> testMethod3" );
  }

  @Test
  public void ztestMethod1() {
    AddNumbers obj = new AddNumbers ( );
    int results = obj.sumNumbers ( 10, 5 );
    System.out.println ( "Running Test -> testMethod1" );
    System.out.println ( "Sum of integer is: " + results );
  }
}
