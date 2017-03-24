import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by priyanka_mondal on 22/03/2017.
 */
public class browsetheweek {
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

    public void horizontalbrowse() throws InterruptedException{
        driver.findElement(MobileBy.AccessibilityId("SettingsVector")).click();
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[3]")).click();
        // driver.findElement(MobileBy.AccessibilityId("Subscription")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]")).click();
        driver.findElement(MobileBy.AccessibilityId("Sign In"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).click();
        // .click();
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]/UIATextField[1]"));
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]/UIATextField[1]")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).sendKeys("GSH0EYS6");
        driver.findElement(MobileBy.AccessibilityId("Sign In")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIASwitch[1]")).click();
        driver.findElement(MobileBy.AccessibilityId("Submit")).click();
        driver.findElement(MobileBy.AccessibilityId("Download")).click();
        driver.findElement(MobileBy.AccessibilityId("Enable")).click();
        driver.switchTo().alert().accept();
        // finds Main Stories item after issue has been opened
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[1]"));
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
        driver.swipe(startx, starty, endx, starty, 3000);
        Thread.sleep(2000);
/*
        // check you are on next article
        //driver.findElement(MobileBy.AccessibilityId("Politics"));
        Dimension size1 = driver.manage().window().getSize();
        //Find startx point which is at right side of screen.
        int startx1 = (int) (size1.width * 0.70);
        //Find endx point which is at left side of screen.
        int endx1 = (int) (size1.width * 0.30);
        //Find vertical point where you wants to swipe. It is in middle of screen height.
        int starty1 = size1.height / 2;
        //System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);

        //Swipe from Right to Left.
        driver.swipe(startx1, starty1, endx1, starty1, 3000);
        Thread.sleep(2000);
        //scroll horizontal
/*
        Dimension size = driver.manage().window().getSize();
        //Find startx point which is at right side of screen.
        int startx = (int) (size.width * 0.70);
        //Find endx point which is at left side of screen.
        int endx = (int) (size.width * 0.30);
        //Find vertical point where you wants to swipe. It is in middle of screen height.
        int starty = size.height / 2;
        //System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);

        //swipe Left to right
        driver.swipe(endx1, starty1, startx1, starty1, 3000);
        Thread.sleep(2000);
        //check you are on the previous article
        //driver.findElement(MobileBy.AccessibilityId("Politics"));
*/
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[1]/UIALink[1]")).click();
        //scroll down on article
        Dimension dimensions = driver.manage().window().getSize();
        Double screenHeightStart = dimensions.getHeight() * 0.5;
        int scrollStart = screenHeightStart.intValue();
        Double screenHeightEnd = dimensions.getHeight() * 0.2;
        int scrollEnd = screenHeightEnd.intValue();
        new TouchAction((IOSDriver<IOSElement>) driver).press(0, scrollStart).waitAction(5000)
                .moveTo(0 - 0, scrollEnd - scrollStart).release().perform();

        // scroll up
        new TouchAction((IOSDriver<IOSElement>) driver).press(0, scrollStart).waitAction(5000)
                .moveTo(0 - 0, scrollStart - scrollEnd).release().perform();


    }
}
