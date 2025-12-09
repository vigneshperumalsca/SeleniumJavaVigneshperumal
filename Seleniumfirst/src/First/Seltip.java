package First;

 import java.io.File;
//import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

import java.lang.Thread;
public class Seltip {   
    public static void main(String[] args) {
           
    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2Fs%3Fk%3Damazon%2Bca%2Blogin%26gad_source%3D1%26hvadid%3D666014358477%26hvdev%3Dc%26hvexpln%3D0%26hvlocphy%3D9000928%26hvnetw%3Dg%26hvocijid%3D2885658769365423008--%26hvqmt%3De%26hvrand%3D2885658769365423008%26hvtargid%3Dkwd-359032927633%26hydadcr%3D26050_13645197%26tag%3Dgoogcana-20%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
    
   
    
    driver.findElement(By.id("continue")).click();;
        try {
              Thread.sleep(5000); // Pause execution for 5 seconds (5000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


   
   /*

   driver.findElement(By.id("ap_email")).sendKeys(  "vigneshperumal3696@gmail.com"  );
   driver.findElement(By.id("continue")).click();

   driver.findElement(By.id("ap_password")).sendKeys(  "vigneshperumal3696@gmail.com"  );
   driver.findElement(By.id("continue")).click();

    */
        TakesScreenshot screenshot = (TakesScreenshot) driver;
       
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

        File destFile = new File("D:\\Vigneshperumal Sundarrajan\\check\\Seleniumfirst\\src\\First\\ScreenShot\\screenshot2.png");

        try {
            FileUtils.copyFile(srcFile, destFile);
            System.out.println("Screenshot captured successfully at: " + destFile.getAbsolutePath());
        } 
        catch (Exception e) {
            System.err.println("Failed to capture screenshot: " + e.getMessage());
            e.printStackTrace();
        }

    driver.quit();
    
  }
    
}
