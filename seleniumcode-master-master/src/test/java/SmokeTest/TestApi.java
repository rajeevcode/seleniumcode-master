package SmokeTest;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestApi {
    static WebDriver driver;
    static String url = "http://api.zippopotam.us/us/90210";

    public static void main(String[] args) throws JSONException {
        driver = new FirefoxDriver (  );
        driver.manage ().timeouts ().implicitlyWait ( 10, TimeUnit.SECONDS );
        driver.get(url);
        System.out.println (url );

        WebElement element = driver.findElement( By.xpath("//pre"));
        JSONObject jsonObject = new JSONObject (element.getText());

        String valueToCheck = jsonObject.get("country").toString();
        Assert.assertEquals(valueToCheck, "United States");


        driver.quit ();

    }

//    private static Bindings given() {
//
//
//        public void doRestTestProperly() {
//
//            given().when().get("http://api.zippopotam.us/us/90210").then().assertThat().
//                    body("country", equalTo("United States"));
//        }
//
//    }

}
