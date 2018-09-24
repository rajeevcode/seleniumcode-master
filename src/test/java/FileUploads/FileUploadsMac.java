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

public class FileUploadsMac {
  WebDriver driver;
  String baseUrl = "https://www.gmail.com/";


  @BeforeClass
  public void beforeClass() throws MalformedURLException {
    driver = new FirefoxDriver ();;
    // Maximize the browser's window
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get(baseUrl);
  }

  @Test
  public void fileUpload() throws AWTException, InterruptedException{
    driver.findElement( By.xpath (  "//input[@id='identifierId']" )).sendKeys ("xyz@gmail.com");
    driver.findElement ( By.xpath ( "/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content/span" ) ).click ();
    Thread.sleep ( 1000 );
    driver.findElement ( By.xpath ( "/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[1]/div/div[1]/input" )  ).sendKeys ( "123");
    driver.findElement ( By.xpath ( "/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content/span" ) ).click ();
    Thread.sleep ( 1000 );
    driver.findElement ( By.xpath ( "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div/div[1]/div/div" ) ).click ();
    Thread.sleep ( 2000 );
    driver.findElement(By.xpath("//div[@class='wO nr l1']//textarea")).sendKeys("rajeev.code@gmail.com");
    driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Test File Upload");
    WebElement fileInput = driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']"));
    fileInput.click();

    String filePath = "/Users/rajeev.kumar/Desktop/ExtentReports/Testfile.txt";
    StringSelection stringSelection = new StringSelection ( filePath);
    //copy to clipboard
    Toolkit.getDefaultToolkit ().getSystemClipboard ().setContents ( stringSelection, null );
    Robot robot = new Robot (  );
    // Cmd + Tab VK_META
    robot.keyPress ( KeyEvent.VK_META );
    robot.keyPress ( KeyEvent.VK_TAB );
    robot.keyPress ( KeyEvent.VK_META );
    robot.keyPress ( KeyEvent.VK_TAB );
    robot.delay ( 2000 );

    // Goto Window
    robot.keyPress ( KeyEvent.VK_META );
    // Press Shift key
    robot.keyPress ( KeyEvent.VK_SHIFT );
    // Press G key
    robot.keyPress ( KeyEvent.VK_G );
    robot.keyPress ( KeyEvent.VK_META );
    robot.keyPress ( KeyEvent.VK_SHIFT );
    robot.keyPress ( KeyEvent.VK_G );

    //Paste the clipboard value
    robot.keyPress ( KeyEvent.VK_META );
    robot.keyPress ( KeyEvent.VK_V );
    robot.keyPress ( KeyEvent.VK_META );
    robot.keyPress ( KeyEvent.VK_V );

    //Hit the Enter key
    robot.keyPress ( KeyEvent.VK_ENTER );
    robot.keyPress ( KeyEvent.VK_ENTER );
    robot.delay ( 2000 );
    robot.keyPress ( KeyEvent.VK_ENTER );
    robot.keyPress ( KeyEvent.VK_ENTER );
    Thread.sleep ( 3000 );

  }

  @AfterClass
  public void afterClass() {
    driver.quit ();
  }

}
