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
public class LogoutandReadarticle {
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

    public void logoutandread() throws InterruptedException{

        //driver.findElement(MobileBy.AccessibilityId("Buy now"));
        driver.findElement(MobileBy.AccessibilityId("SettingsVector")).click();
        // driver.findElement(MobileBy.AccessibilityId("Subscription")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]")).click();
        driver.findElement(MobileBy.AccessibilityId("Sign In"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).sendKeys("GSH0EYS6");
        driver.findElement(MobileBy.AccessibilityId("Sign In")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIASwitch[1]")).click();
        driver.findElement(MobileBy.AccessibilityId("Submit")).click();
        driver.findElement(MobileBy.AccessibilityId("Download")).click();
        driver.findElement(MobileBy.AccessibilityId("Enable")).click();
        driver.switchTo().alert().accept();
        // finds Main Stories item after issue has been opened
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[1]"));
        //driver.findElement(MobileBy.AccessibilityId("Main stories"));
        driver.findElement(MobileBy.AccessibilityId("All Issues")).click();
        driver.findElement(MobileBy.AccessibilityId("Read"));

        //logout
        driver.findElement(MobileBy.AccessibilityId("SettingsVector")).click();
        // driver.findElement(MobileBy.AccessibilityId("Account: Active")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]")).click();
        driver.findElement(MobileBy.AccessibilityId("Sign Out")).click();
        //return to homepage
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]")).click();
        //homepage and able to read already downloaded article
        driver.findElement(MobileBy.AccessibilityId("Read")).click();
        // finds Main Stories item after issue has been opened
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[1]"));
        //driver.findElement(MobileBy.AccessibilityId("Main stories"));
        driver.findElement(MobileBy.AccessibilityId("All Issues")).click();

        //Scroll down on homepage
        Dimension dimensions = driver.manage().window().getSize();
        Double screenHeightStart = dimensions.getHeight() * 0.8;
        int scrollStart = screenHeightStart.intValue();
        Double screenHeightEnd = dimensions.getHeight() * 0.4;
        int scrollEnd = screenHeightEnd.intValue();
        new TouchAction((IOSDriver<IOSElement>) driver).press(0, scrollStart).waitAction(5000)
                .moveTo(0 - 0, scrollEnd - scrollStart).release().perform();

        //should see issues that need to be bought
        driver.findElement(MobileBy.AccessibilityId("Buy for £2.99"));

    }
}
