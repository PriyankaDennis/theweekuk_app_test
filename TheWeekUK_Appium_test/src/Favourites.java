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
public class Favourites {
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
    public void favourites() throws InterruptedException {
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[3]")).click();
        driver.findElement(MobileBy.AccessibilityId("DAILY BRIEFING")).click();

        //Check for all elements to be present on DailyBriefing after application has been installed

        //Checks for InfoPage button
        driver.findElement(MobileBy.AccessibilityId("InfoVector"));
        //check for sign in button
        driver.findElement(MobileBy.AccessibilityId("bug fixing"));
        //checks for settings button
        driver.findElement(MobileBy.AccessibilityId("SettingsVector"));
        //checks for FAVOURITES
        driver.findElement(MobileBy.AccessibilityId("FAVOURITES"));
        //checks for ISSUES
        driver.findElement(MobileBy.AccessibilityId("ISSUES"));

        //checks for DAILY BRIEFING
        driver.findElement(MobileBy.AccessibilityId("DAILY BRIEFING"));

        //scroll horizontal

        Dimension size = driver.manage().window().getSize();
        //Find startx point which is at right side of screen.
        int startx = (int) (size.width * 0.70);
        //Find endx point which is at left side of screen.
        int endx = (int) (size.width * 0.30);
        //Find vertical point where you wants to swipe. It is in middle of screen height.
        int starty = size.height / 2;
        //System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);

        //Swipe from Right to Left.
        //driver.swipe(startx, starty, endx, starty, 3000);
        //Thread.sleep(2000);

        //Swipe from Left to Right.
        driver.swipe(endx, starty, startx, starty, 3000);
        Thread.sleep(2000);

        //checks for FAVOURITES
        driver.findElement(MobileBy.AccessibilityId("FAVOURITES"));
        //Checks for InfoPage button
        driver.findElement(MobileBy.AccessibilityId("InfoVector"));
        //check for sign in button
        driver.findElement(MobileBy.AccessibilityId("bug fixing"));
        //checks for settings button
        driver.findElement(MobileBy.AccessibilityId("SettingsVector"));

    }
}
