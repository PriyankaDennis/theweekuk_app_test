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
 * Created by priyanka_mondal on 14/03/2017.
 */
public class InfoHowtopage {
    IOSDriver driver;
    Alert alert;
    AppiumDriver driver1;

    @Before
    public void setup () throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("devicenname", "whatever");
        //capabilities.setCapability("browserName", "Safari");
        //capabilities.setCapability("safariAllowPopups", "true");

        driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //dismiss pugpig license alert
        driver.switchTo().alert().dismiss();

    }

    @After
    public void teardown () {
        driver.quit ();

    }

    @Test
    public void howtopages() throws InterruptedException {
        driver.findElement(MobileBy.AccessibilityId("InfoVector")).click();
        //How to
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableGroup[2]/UIAStaticText[1]"));
        ////*****  Checking for elements on Manage storage *****
        driver.findElement(MobileBy.AccessibilityId("Manage storage")).click();
        driver.findElement(MobileBy.AccessibilityId("Manage storage"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextView[1]"));
        Dimension dimensions = driver.manage().window().getSize();
        Double screenHeightStart = dimensions.getHeight() * 0.5;
        int scrollStart = screenHeightStart.intValue();
        Double screenHeightEnd = dimensions.getHeight() * 0.2;
        int scrollEnd = screenHeightEnd.intValue();
        new TouchAction((IOSDriver<IOSElement>) driver).press(0, scrollStart).waitAction(1000)
        .moveTo(0 - 0, scrollEnd - scrollStart).release().perform();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();

        ////*****  Checking for elements on Share article *****
        driver.findElement(MobileBy.AccessibilityId("Share articles")).click();
        driver.findElement(MobileBy.AccessibilityId("Share articles"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextView[1]"));
        Dimension dimensions1 = driver.manage().window().getSize();
        Double screenHeightStart1 = dimensions1.getHeight() * 0.5;
        int scrollStart1 = screenHeightStart.intValue();
        Double screenHeightEnd1 = dimensions1.getHeight() * 0.2;
        int scrollEnd1 = screenHeightEnd.intValue();
        new TouchAction((IOSDriver<IOSElement>) driver).press(0, scrollStart).waitAction(1000)
                .moveTo(0 - 0, scrollEnd - scrollStart).release().perform();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();


        ////*****  Checking for elements on save an article
        driver.findElement(MobileBy.AccessibilityId("Save an article")).click();
        driver.findElement(MobileBy.AccessibilityId("Save an article"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextView[1]"));
        Dimension dimensions2 = driver.manage().window().getSize();
        Double screenHeightStart2 = dimensions2.getHeight() * 0.5;
        int scrollStart2 = screenHeightStart.intValue();
        Double screenHeightEnd2 = dimensions2.getHeight() * 0.2;
        int scrollEnd2 = screenHeightEnd2.intValue();
        new TouchAction((IOSDriver<IOSElement>) driver).press(0, scrollStart).waitAction(1000)
                .moveTo(0 - 0, scrollEnd - scrollStart).release().perform();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();

        ////*****  Checking for elements on View saved articles
        driver.findElement(MobileBy.AccessibilityId("View Saved Articles")).click();
        driver.findElement(MobileBy.AccessibilityId("View Saved Articles"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextView[1]"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();

        ////*****  Checking for elements on Change text size and reading mode
        driver.findElement(MobileBy.AccessibilityId("Change text size and reading mode")).click();
        driver.findElement(MobileBy.AccessibilityId("Change text size and reading mode"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextView[1]"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();
    }
}
