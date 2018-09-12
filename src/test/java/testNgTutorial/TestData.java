package testNgTutorial;

import org.testng.annotations.DataProvider;

public class TestData {
  @DataProvider(name = "inputs")
  //Type of Object array
  public Object[][] getData() {
    return new Object[][]{
        {"bmw", "x3"},
        {"audi", "a6"},
        {"benz", "c300"},
        {"maruti", "zen"},
        {"mazada", "c12"},
        {"lexus", "comfort12"},
    };
  }
}
