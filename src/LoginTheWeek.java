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
 * Created by priyanka_mondal on 01/03/2017.
 */
public class LoginTheWeek {

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

    public void Loginanddownload() throws InterruptedException {

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
        driver.findElement(MobileBy.AccessibilityId("All Issues"));
        driver.findElement(By.xpath(" //UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[3]"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();
        driver.findElement(MobileBy.AccessibilityId("Americas at a glance")).click();
        driver.findElement(MobileBy.AccessibilityId("Politics")).click();
        driver.findElement(MobileBy.AccessibilityId("Europe at a glance")).click();
        driver.findElement(MobileBy.AccessibilityId("Europe")).click();
        //driver.findElement(MobileBy.AccessibilityId("Europe at a glance"));
        //driver.findElement(MobileBy.AccessibilityId("Back")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[2]/UIAButton[1]")).click();
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]/UIAStaticText[1]")).click();
        driver.findElement(MobileBy.AccessibilityId("All Issues")).click();
        driver.findElement(MobileBy.AccessibilityId("Read"));


    }
}











       /* //Check that the issues are cannot be downloaded if user is not signed in
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIACollectionView[1]/UIAButton[1]")).click();
        Dimension dimensions = driver.manage().window().getSize();
        Double screenHeightStart = dimensions.getHeight() * 0.1;
        int scrollStart = screenHeightStart.intValue();
        Double screenHeightEnd = dimensions.getHeight() * 0.1;
        int scrollEnd = screenHeightEnd.intValue();
        new TouchAction((IOSDriver<IOSElement>) driver).press(0, scrollStart).waitAction(5000)
                .moveTo(0 - 0, scrollEnd - scrollStart).release().perform();
        //select first issue from top
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIACollectionView[1]")).click();*/
        //driver.findElement(MobileBy.AccessibilityId("Buy now"));
        /*driver.findElement(MobileBy.AccessibilityId("Buy now")).click();
        // this should load the purchases page
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]"));
        //see purchase options
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]"));
        //Already a subscriber
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIAButton[1]"));
        //restore purchases
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIAButton[2]"));
        //close window
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]")).click();

        //Click on Sign in button on homepage
        driver.findElement(MobileBy.AccessibilityId("bug fixing")).click();
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
        //selects and clicks sign in button
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[4]")).click();
        //click on drop down menu for latest issues
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIACollectionView[1]/UIAButton[1]")).click();

        //select first issue from top
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIACollectionView[1]")).click();
        //see Buy now is now changed to Download
        driver.findElement(MobileBy.AccessibilityId("Download"));
        //selects and clicks download button
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIACollectionView[1]/UIACollectionCell[1]")).click();
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[3]")).click();
        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //Selects and clicks on Accepting updates from HomepageTheWeek
        //driver.findElement(MobileBy.AccessibilityId("Enable")).click();
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
        //Accepts alerts
        //driver.switchTo().alert().accept();
        // finds Main Stories item after issue has been opened
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[1]"));
        //driver.findElement(MobileBy.AccessibilityId("Main stories"));
       // driver.findElement(MobileBy.AccessibilityId("All Issues"));
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAButton[1]")).click();
        //driver.findElement(MobileBy.AccessibilityId("Politics"));
        //driver.findElement(MobileBy.AccessibilityId("Europe at a glance"));
        */

        //clicks on settings button
        //driver.findElement(MobileBy.AccessibilityId("SettingsVector"));
        /*
        driver.findElement(MobileBy.AccessibilityId("SettingsVector")).click();
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[3]")).click();
       // driver.findElement(MobileBy.AccessibilityId("Subscription")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]/UIATextField[1]")).sendKeys("GSH0EYS6");
        driver.findElement(MobileBy.AccessibilityId("Sign In")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIASwitch[1]")).click();
        driver.findElement(MobileBy.AccessibilityId("Submit")).click();
        driver.findElement(MobileBy.AccessibilityId("Download"));
*/




