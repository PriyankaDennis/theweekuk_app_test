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
 * Created by priyanka_mondal on 09/03/2017.
 */
public class InfoHelppage {
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
    public void updatepage() throws InterruptedException {
        //Checks for InfoPage button
        driver.findElement(MobileBy.AccessibilityId("InfoVector")).click();
        driver.findElement(MobileBy.AccessibilityId("Update")).click();
        //*****  Checking for elements on Update page ****
        //checks for "1. Update"
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[2]"));
        // check for forgotten password link
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[1]"));
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[1]")).click();
       // driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAButton[2]/UIAElement[1]"));
        //check for account id text field
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[1]"));
        //driver.findElement(MobileBy.AccessibilityId("Back to The Week")).click();
       // ArrayList result = (ArrayList) driver.findElements(By.xpath("//UIAApplication[1]/UIAWindow[4]/UIAStatusBar[1]"));
        //System.out.println(result);

        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[4]/UIAStatusBar[1]/UIAButton[1]"));
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIAScrollView[1]")).click();
        // phone number
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[2]"));

        //email
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[3]"));
        //go back to help page
        driver.findElement(MobileBy.AccessibilityId("Info")).click();


        //*****  Checking for elements on FAQ page ****
        driver.findElement(MobileBy.AccessibilityId("FAQ")).click();
        //FAQ link
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[5]"));
        //driver.findElement(MobileBy.AccessibilityId("http://subscription.theweek.co.uk/faq/"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[5]/UIAStaticText[1]"));
        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[3]"));
        //driver.findElement(MobileBy.AccessibilityId("Back to The Week")).click();
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[4]/UIAStatusBar[1]/UIAButton[1]")).click();
        driver.findElement(MobileBy.AccessibilityId("Info")).click();

        //*****  Checking for elements on Subscriptions page ****
        driver.findElement(MobileBy.AccessibilityId("Subscriptions")).click();
        // phone number
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[2]"));
        //email
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[3]"));
        //Subscriptions link
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[8]/UIAStaticText[1]"));
        driver.findElement(MobileBy.AccessibilityId("Info")).click();

        //*****  Checking for elements on Single Issue purchase ****
        driver.findElement(MobileBy.AccessibilityId("Single issue purchases")).click();
        //Header on single issue purchase
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[80]"));
        driver.findElement(MobileBy.AccessibilityId("Info")).click();

        //*****  Checking for elements on Push Notifications ****
        driver.findElement(MobileBy.AccessibilityId("Push notifications")).click();
        //Header on Push Notifications
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[87]"));
        driver.findElement(MobileBy.AccessibilityId("Info")).click();

        //*****  Checking for elements on Contact US ****
        driver.findElement(MobileBy.AccessibilityId("Contact us")).click();
        //Header on Contact us
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[87]"));
        driver.findElement(MobileBy.AccessibilityId("Info")).click();



        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]"));
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]"));
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]"));
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[2]"));
        //scroll to bottom of page
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
        //Dimension dimensions = driver.manage().window().getSize();
        //Double screenHeightStart = dimensions.getHeight() * 0.5;
        //int scrollStart = screenHeightStart.intValue();
        //Double screenHeightEnd = dimensions.getHeight() * 0.2;
        //int scrollEnd = screenHeightEnd.intValue();
        //new TouchAction((IOSDriver<IOSElement>) driver).press(0, scrollStart).waitAction(1000)
                //.moveTo(0 - 0, scrollEnd - scrollStart).release().perform();
        //url link to subscriptions

    }
}





