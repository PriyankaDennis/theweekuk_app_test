import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import org.apache.xpath.operations.String;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Alert;
import org.openqa.selenium.remote.server.handler.interactions.touch.Down;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/**
 * Created by priyanka_mondal on 15/03/2017.
 */
public class Settings {
    IOSDriver driver;
    Alert alert;
    AppiumDriver driver1;

    @Before
    public void setup() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("devicenname", "whatever");
        //capabilities.setCapability("browserName", "Safari");
        //capabilities.setCapability("safariAllowPopups", "true");

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
    public void settings() throws InterruptedException {
        //clicks on settings button
        driver.findElement(MobileBy.AccessibilityId("SettingsVector")).click();
        driver.findElement(MobileBy.AccessibilityId("Subscription"));
        //Manage storage section
        driver.findElement(MobileBy.AccessibilityId("Manage storage"));
        driver.findElement(MobileBy.AccessibilityId("storageSlider"));
        driver.findElement(MobileBy.AccessibilityId("removeAllButton"));
        //tap to turn pages
        driver.findElement(MobileBy.AccessibilityId("Tap to turn pages:"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]/UIASwitch[1]")).click();
        //Enable push notifications
        driver.findElement(MobileBy.AccessibilityId("Enable push notifications:"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]/UIASwitch[1]"));
        //scroll down
        Dimension dimensions = driver.manage().window().getSize();
        Double screenHeightStart = dimensions.getHeight() * 0.5;
        int scrollStart = screenHeightStart.intValue();
        Double screenHeightEnd = dimensions.getHeight() * 0.2;
        int scrollEnd = screenHeightEnd.intValue();
        new TouchAction((IOSDriver<IOSElement>) driver).press(0, scrollStart).waitAction(1000)
        .moveTo(0 - 0, scrollEnd - scrollStart).release().perform();
        //Reset button
        //driver.findElement(MobileBy.AccessibilityId("Reset"));

        //go to Subscriptions
        driver.findElement(MobileBy.AccessibilityId("Subscription")).click();
        driver.findElement(MobileBy.AccessibilityId("Subscription"));
        driver.findElement(MobileBy.AccessibilityId("Settings"));
        driver.findElement(MobileBy.AccessibilityId("Sign In"));
        driver.findElement(MobileBy.AccessibilityId("Restore Purchases"));
        driver.findElement(MobileBy.AccessibilityId("Settings")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]")).click();

    }
}
