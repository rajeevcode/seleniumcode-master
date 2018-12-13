package FileUploads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class FileUploadsWindows {
  String baseUrl = "https://www.gmail.com/";
  WebDriver driver;

  @AfterClass
  public void afterClass() {
    driver.quit ( );
  }

  @BeforeClass
  public void beforeClass() throws MalformedURLException {
    driver = new FirefoxDriver ( );
    ;
    // Maximize the browser's window
    driver.manage ( ).window ( ).maximize ( );
    driver.manage ( ).timeouts ( ).implicitlyWait ( 10, TimeUnit.SECONDS );
    driver.get ( baseUrl );
  }

  @Test
  public void fileUpload() throws AWTException, InterruptedException {
    driver.findElement ( By.xpath ( "//input[@id='identifierId']" ) ).sendKeys ( "123@gmail.com" );
    driver.findElement ( By.xpath ( "/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content/span" ) ).click ( );
    Thread.sleep ( 1000 );
    driver.findElement ( By.xpath ( "/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[1]/div/div[1]/input" ) ).sendKeys ( "xyz" );
    driver.findElement ( By.xpath ( "/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content/span" ) ).click ( );
    Thread.sleep ( 1000 );
    driver.findElement ( By.xpath ( "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div/div[1]/div/div" ) ).click ( );
    Thread.sleep ( 2000 );
    driver.findElement ( By.xpath ( "//div[@class='wO nr l1']//textarea" ) ).sendKeys ( "rajeev.code@gmail.com" );
    driver.findElement ( By.xpath ( "//input[@name='subjectbox']" ) ).sendKeys ( "Test File Upload" );
    WebElement fileInput = driver.findElement ( By.xpath ( "//div[@class='a1 aaA aMZ']" ) );
    fileInput.click ( );

    StringSelection ss = new StringSelection ( "/Users/rajeev.kumar/Desktop/ExtentReports/Test file.txt" );
    Toolkit.getDefaultToolkit ( ).getSystemClipboard ( ).setContents ( ss, null );

    // Ctrl + v
    Robot robot = new Robot ( );
    robot.keyPress ( KeyEvent.VK_CONTROL );
    robot.keyPress ( KeyEvent.VK_V );
    robot.keyRelease ( KeyEvent.VK_V );
    robot.keyRelease ( KeyEvent.VK_CONTROL );
    Thread.sleep ( 3000 );
    robot.keyPress ( KeyEvent.VK_ENTER );
    robot.keyRelease ( KeyEvent.VK_ENTER );

    driver.findElement ( By.xpath ( "//div[text()='Send']" ) ).click ( );
  }
}
