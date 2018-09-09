package testNgTutorial;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_SoftAsserts {

  @Test
  public void testArrays() {
    System.out.println ( "\nRunning Test -> testArrays" );
    int[] expectedArray = {1, 2, 3,4};
    AddNumbers obj = new AddNumbers ( );
    int[] result = obj.getArray ( );
    Assert.assertEquals ( result, expectedArray );
    System.out.println ( "\nRunning Test -> testArrays" );
  }

  @Test
  public void testStrings() {
    System.out.println ( "\nRunning Test -> testString" );
    String expectedString = "Hello World!";
    AddNumbers obj = new AddNumbers ( );
    String result = obj.addStrings ( "Hello", "World!" );
    Assert.assertEquals ( result, expectedString );
  }

  @Test
  public void testSum() {
    SoftAssert sa = new SoftAssert ();
    System.out.println ( "\nRunning Test -> testSum" );
    AddNumbers obj = new AddNumbers ( );
    int result = obj.sumNumbers ( 10, 20 );
    sa.assertEquals ( result,40 );
    System.out.println ("Result :" + result );
    sa.assertEquals ( result,30 );
    System.out.println ("**************" );
    //will show all result including failed and passed test cases
    sa.assertAll ();
//    System.out.println ("Result :" + result );
  }
}
