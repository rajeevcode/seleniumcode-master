package testNgTutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg_Asserts {

  @Test
  public void testArrays() {
    System.out.println ( "\nRunning Test -> testArrays" );
    int[] expectedArray = {1, 2, 3};
    AddNumbers obj = new AddNumbers ( );
    int[] result = obj.getArray ( );
    Assert.assertEquals ( result, expectedArray );
  }

  @Test
  public void testStrings() {
    System.out.println ( "\nRunning Test -> testStrings" );
    String expectedString = "Hello World!";
    AddNumbers obj = new AddNumbers ( );
    String result = obj.addStrings ( "Hello", "World!" );
    Assert.assertEquals ( result, expectedString );
  }

  @Test
  public void testSum() {
    System.out.println ( "\nRunning Test -> testSum" );
    AddNumbers obj = new AddNumbers ( );
    int result = obj.sumNumbers ( 10, 20 );
    Assert.assertEquals ( result, 30 );
  }
}
