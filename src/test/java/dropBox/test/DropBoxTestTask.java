package dropBox.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DropBoxTestTask {
  private WebDriver driver;
  String baseUrl = "https://www.dropbox.com/login";

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver ( );
    driver.get ( baseUrl );

    // Maximize the browser's window
    driver.manage ( ).window ( ).maximize ( );
    driver.manage ( ).timeouts ( ).implicitlyWait ( 10, TimeUnit.SECONDS );
  }

  @After
  public void tearDown() throws Exception {
    Thread.sleep ( 1000 );
    driver.quit ( );
  }

  @Test
  public void test() throws Exception {
    Thread.sleep ( 2000 );
    driver.get ( baseUrl );
    //driver.findElement ( By.xpath ( "//*[@id=\"embedded-app\"]/span/header/div/nav/ul[2]/li[2]/a" ) ).click ();
    //driver.findElement ( By.xpath ( "//*[@id=\"pyxl7659260676966986814\"]/div[1]/div[1]/div[2]/a" ) ).click ();
//    driver.findElement ( By.xpath ( "//input[@id='login_email185318307833662']" ) ) .sendKeys ( "test_19@gmail.com" );
    //driver.findElement ( By.id ( "login_password7220638345809601" ) ).sendKeys ( "test@123" );
   // driver.findElement ( By.xpath ( "/html/body/div[11]/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/form/div[3]/button" ) ).click ();
    //driver.findElement(By.xpath("//*[@id='sign-in']")).click();
    driver.findElement(By.xpath("//div[@id='index-sign-in-modal']//input[@name='login_email']")).sendKeys("email");
    driver.findElement(By.xpath("//div[@id='index-sign-in-modal']//input[@name='login_password']")).sendKeys("password");
    driver.findElement(By.xpath("//div[@id='index-sign-in-modal']//div[@class='sign-in-text']")).click();

  }
}

