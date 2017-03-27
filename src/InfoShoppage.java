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
public class InfoShoppage {
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
        //driver.switchTo().alert().dismiss();

    }

    @After
    public void teardown () {
        driver.quit ();

    }

    @Test
    public void bookshop() throws InterruptedException {
        driver.findElement(MobileBy.AccessibilityId("InfoVector")).click();
        //scroll to bottom
        Dimension dimensions = driver.manage().window().getSize();
        Double screenHeightStart = dimensions.getHeight() * 0.5;
        int scrollStart = screenHeightStart.intValue();
        Double screenHeightEnd = dimensions.getHeight() * 0.2;
        int scrollEnd = screenHeightEnd.intValue();
        new TouchAction((IOSDriver<IOSElement>) driver).press(0, scrollStart).waitAction(1000)
                .moveTo(0 - 0, scrollEnd - scrollStart).release().perform();
        /////*****  Checking for elements on Shop section
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableGroup[3]"));
        /////*****  Checking for elements on The Week Bookshop
        driver.findElement(MobileBy.AccessibilityId("The Week Bookshop")).click();
        //driver.findElement(MobileBy.AccessibilityId("The Week Bookshop"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[2]/UIAImage[1]"));


        //driver.findElement(MobileBy.AccessibilityId("Cancel")).click();
        //driver.findElement(By.xpath(""));
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]"));
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAButton[1]")).click();

    }
    @Test
        public void weekwines() throws InterruptedException {
            driver.findElement(MobileBy.AccessibilityId("InfoVector")).click();
            //scroll to bottom
            Dimension dimensions = driver.manage().window().getSize();
            Double screenHeightStart = dimensions.getHeight() * 0.5;
            int scrollStart = screenHeightStart.intValue();
            Double screenHeightEnd = dimensions.getHeight() * 0.2;
            int scrollEnd = screenHeightEnd.intValue();
            new TouchAction((IOSDriver<IOSElement>) driver).press(0, scrollStart).waitAction(1000)
                    .moveTo(0 - 0, scrollEnd - scrollStart).release().perform();
            /////*****  Checking for elements on Shop section
            driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableGroup[3]"));

            /////*****  Checking for elements on The Week Wines
            driver.findElement(MobileBy.AccessibilityId("The Week Wines")).click();
            //driver.findElement(MobileBy.AccessibilityId("The Week Wines"));
            driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[1]/UIAStaticText[1]"));
            //driver.findElement(MobileBy.AccessibilityId("Back to The Week")).click();
            //driver.findElement(By.xpath(""));
            //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();
        }

    @Test
         public void weektickets() throws InterruptedException {
        driver.findElement(MobileBy.AccessibilityId("InfoVector")).click();
        //scroll to bottom
        Dimension dimensions = driver.manage().window().getSize();
        Double screenHeightStart = dimensions.getHeight() * 0.5;
        int scrollStart = screenHeightStart.intValue();
        Double screenHeightEnd = dimensions.getHeight() * 0.2;
        int scrollEnd = screenHeightEnd.intValue();
        new TouchAction((IOSDriver<IOSElement>) driver).press(0, scrollStart).waitAction(1000)
                .moveTo(0 - 0, scrollEnd - scrollStart).release().perform();
        /////*****  Checking for elements on Shop section
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableGroup[3]"));

        //////*****  Checking for elements on The Week Tickets
        driver.findElement(MobileBy.AccessibilityId("The Week Tickets")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[2]"));
        //driver.findElement(MobileBy.AccessibilityId("London Theatre"));
        //driver.findElement(MobileBy.AccessibilityId("Regional Theatre"));
        //driver.findElement(MobileBy.AccessibilityId("The Arts"));
        //driver.findElement(By.xpath(""));
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();
    }

    @Test
    public void weeksociety() throws InterruptedException {
        driver.findElement(MobileBy.AccessibilityId("InfoVector")).click();
        //scroll to bottom
        Dimension dimensions = driver.manage().window().getSize();
        Double screenHeightStart = dimensions.getHeight() * 0.5;
        int scrollStart = screenHeightStart.intValue();
        Double screenHeightEnd = dimensions.getHeight() * 0.2;
        int scrollEnd = screenHeightEnd.intValue();
        new TouchAction((IOSDriver<IOSElement>) driver).press(0, scrollStart).waitAction(1000)
                .moveTo(0 - 0, scrollEnd - scrollStart).release().perform();
        /////*****  Checking for elements on Shop section
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableGroup[3]"));

        /////*****  Checking for elements on The Week Society
        driver.findElement(MobileBy.AccessibilityId("The Week Society")).click();

        Dimension dimensions1 = driver.manage().window().getSize();
        Double screenHeightStart1 = dimensions1.getHeight() * 0.5;
        int scrollStart1 = screenHeightStart1.intValue();
        Double screenHeightEnd1 = dimensions1.getHeight() * 0.2;
        int scrollEnd1 = screenHeightEnd1.intValue();
        new TouchAction((IOSDriver<IOSElement>) driver).press(0, scrollStart1).waitAction(1000)
                .moveTo(0 - 0, scrollEnd1 - scrollStart1).release().perform();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[6]"));
        //driver.findElement(By.xpath(""));
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();

    }
}
