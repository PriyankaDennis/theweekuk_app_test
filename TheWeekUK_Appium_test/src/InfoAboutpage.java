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
public class InfoAboutpage {
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
        driver.switchTo().alert().dismiss();

    }

    @After
    public void teardown() {
        driver.quit();

    }

    @Test
    public void aboutpages() throws InterruptedException {
        driver.findElement(MobileBy.AccessibilityId("InfoVector")).click();
        //scroll to bottom
        Dimension dimensions = driver.manage().window().getSize();
        Double screenHeightStart = dimensions.getHeight() * 0.5;
        int scrollStart = screenHeightStart.intValue();
        Double screenHeightEnd = dimensions.getHeight() * 0.2;
        int scrollEnd = screenHeightEnd.intValue();
        new TouchAction((IOSDriver<IOSElement>) driver).press(0, scrollStart).waitAction(1000)
                .moveTo(0 - 0, scrollEnd - scrollStart).release().perform();
        //About section
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableGroup[4]/UIAStaticText[1]"));
        /////*****  Checking for elements on Privacy policy
        driver.findElement(MobileBy.AccessibilityId("Privacy policy")).click();
        //driver.findElement(MobileBy.AccessibilityId("Privacy policy"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();

        /////*****  Checking for elements on Advertise The Week
        driver.findElement(MobileBy.AccessibilityId("Advertise in The Week")).click();
        driver.findElement(MobileBy.AccessibilityId("Advertise"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[1]"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[2]"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();

        /////*****  Checking for elements on Credits
        driver.findElement(MobileBy.AccessibilityId("Credits")).click();
        driver.findElement(MobileBy.AccessibilityId("Credits"));
        //address
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[1]"));
        //phone
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[2]"));
        //media factory
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[3]"));
        //pugpig
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[4]"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();

        /////*****  Checking for elements on Analytics and privacy
        driver.findElement(MobileBy.AccessibilityId("Analytics and privacy")).click();
        driver.findElement(MobileBy.AccessibilityId("Analytics and Privacy Policy"));
        //mixpanel
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[1]"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[2]"));
        //Parse
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[3]"));
        //mobile app tracking
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[4]"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();

    }
}
