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
public class addfavourites {
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

    public void addfavourites() throws InterruptedException {

        driver.findElement(MobileBy.AccessibilityId("Buy now"));
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
        //driver.findElement(MobileBy.AccessibilityId("Main stories"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]"));
        //driver.findElement(MobileBy.AccessibilityId("Europe at a glance")).click();
        //driver.findElement(MobileBy.AccessibilityId("Europe")).click();
         //browse to an article
        /*Dimension size = driver.manage().window().getSize();
        //Find startx point which is at right side of screen.
        int startx = (int) (size.width * 0.70);
        //Find endx point which is at left side of screen.
        int endx = (int) (size.width * 0.30);
        //Find vertical point where you wants to swipe. It is in middle of screen height.
        int starty = size.height / 2;

        //Swipe from Right to Left.
        driver.swipe(startx, starty, endx, starty, 3000);
        Thread.sleep(2000);*/
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[1]/UIALink[1]")).click();
        //mark as favourite
        driver.findElement(MobileBy.AccessibilityId("Share")).click();
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAToolbar[3]/UIAButton[1]")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAActivityView[1]/UIAActionSheet[1]/UIAScrollView[1]/UIACollectionView[1]/UIACollectionCell[2]/UIACollectionView[1]/UIACollectionCell[2]")).click();

        //go back to home page
        //driver.findElement(MobileBy.AccessibilityId("Back")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]/UIAStaticText[1]")).click();
        driver.findElement(MobileBy.AccessibilityId("All Issues")).click();
        driver.findElement(MobileBy.AccessibilityId("Read"));
        /*
        //scroll to see favourites
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
/*
        //Swipe from Left to Right.
        driver.swipe(endx, starty, startx, starty, 3000);
        Thread.sleep(2000);
        //scroll to see favourites
        Dimension size1 = driver.manage().window().getSize();
        //Find startx point which is at right side of screen.
        int startx1 = (int) (size1.width * 0.70);
        //Find endx point which is at left side of screen.
        int endx1 = (int) (size1.width * 0.30);
        //Find vertical point where you wants to swipe. It is in middle of screen height.
        int starty1 = size1.height / 2;
        //System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);

        //Swipe from Right to Left.
        //driver.swipe(startx, starty, endx, starty, 3000);
        //Thread.sleep(2000);

        //Swipe from Left to Right.
        driver.swipe(endx1, starty1, startx1, starty1, 3000);
        Thread.sleep(2000);

        //checks for FAVOURITES
        driver.findElement(MobileBy.AccessibilityId("FAVOURITES"));
        //see article in the favourites list
        //driver.findElement(By.xpath("")).click();
* */


    }
}
