import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Alert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
/**
 * Created by priyanka_mondal on 23/03/2017.
 */
public class wrongSigninandLogoutnodwnld {
    IOSDriver driver;
    Alert alert;

    @Before
    public void setup() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("devicenname", "whatever");

        driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //dismiss pugpig license alert
        //driver.switchTo().alert().dismiss();

    }

    @After
    public void teardown() {
        driver.quit();

    }

    @Test

    public void incorrectloginandnodwnld() throws InterruptedException {

        //driver.findElement(MobileBy.AccessibilityId("Buy now"));
        driver.findElement(MobileBy.AccessibilityId("SettingsVector")).click();
        // driver.findElement(MobileBy.AccessibilityId("Subscription")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]")).click();
        driver.findElement(MobileBy.AccessibilityId("Sign In"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).sendKeys("GSH0EYS7");
        driver.findElement(MobileBy.AccessibilityId("Sign In")).click();
        //error message
        //driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]")).click();
        //retry login
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).clear();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).sendKeys("GSH0EYS6");
        driver.findElement(MobileBy.AccessibilityId("Sign In")).click();

        //dont accept privacy policy and click on submit
        driver.findElement(MobileBy.AccessibilityId("Submit")).click();

        //click on alert message
        driver.switchTo().alert().accept();
        //accept the policy
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIASwitch[1]")).click();
        driver.findElement(MobileBy.AccessibilityId("Submit")).click();

        //dont download and logout
        driver.findElement(MobileBy.AccessibilityId("SettingsVector")).click();
        // driver.findElement(MobileBy.AccessibilityId("Subscription")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]")).click();
        driver.findElement(MobileBy.AccessibilityId("Sign Out")).click();
        //return to homepage
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]")).click();
        //should see issues that need to be bought
        driver.findElement(MobileBy.AccessibilityId("Buy for £2.99"));


    }
}
