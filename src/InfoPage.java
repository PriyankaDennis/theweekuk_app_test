import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Alert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
/**
 * Created by priyanka_mondal on 08/03/2017.
 */
public class InfoPage {
    IOSDriver driver;
    Alert alert;
    AppiumDriver driver1;

    @Before
    public void setup () throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("devicenname", "whatever");

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

    public void info() throws InterruptedException {
        //Checks for InfoPage button
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
        driver.findElement(MobileBy.AccessibilityId("InfoVector")).click();
        //checks for all elements present on InfoPage page
        //Back button
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]"));
        //InfoPage text
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]"));
        //close button
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]")).click();
        //clicking on close button should return to homepage and click on info once again should open info
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
        driver.findElement(MobileBy.AccessibilityId("InfoVector")).click();
        //Update
         driver.findElement(MobileBy.AccessibilityId("Update"));
        //FAQ
        driver.findElement(MobileBy.AccessibilityId("FAQ"));
        //Subscriptions
        driver.findElement(MobileBy.AccessibilityId("Subscriptions"));
        //Single issue purchases
         driver.findElement(MobileBy.AccessibilityId("Single issue purchases"));
        //Push notification
        driver.findElement(MobileBy.AccessibilityId("Push notifications"));
        //Contact us
        driver.findElement(MobileBy.AccessibilityId("Contact us"));
        //How to
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableGroup[2]/UIAStaticText[1]"));
        //Manage storage
        driver.findElement(MobileBy.AccessibilityId("Manage storage"));
        //share articles
        driver.findElement(MobileBy.AccessibilityId("Share articles"));
        //save an article
        driver.findElement(MobileBy.AccessibilityId("Save an article"));
        //View saved articles
        driver.findElement(MobileBy.AccessibilityId("View Saved Articles"));
        driver.findElement(MobileBy.AccessibilityId("Change text size and reading mode"));
        //scroll to bottom
        Dimension dimensions = driver.manage().window().getSize();
        Double screenHeightStart = dimensions.getHeight() * 0.5;
        int scrollStart = screenHeightStart.intValue();
        Double screenHeightEnd = dimensions.getHeight() * 0.2;
        int scrollEnd = screenHeightEnd.intValue();
        new TouchAction((IOSDriver<IOSElement>) driver).press(0, scrollStart).waitAction(1000)
                .moveTo(0 - 0, scrollEnd - scrollStart).release().perform();
        //Shop section
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableGroup[3]"));
        //The Week Bookshop
        driver.findElement(MobileBy.AccessibilityId("The Week Bookshop"));
        //The Week Wines
        driver.findElement(MobileBy.AccessibilityId("The Week Wines"));
        //The Week Tickets
        driver.findElement(MobileBy.AccessibilityId("The Week Tickets"));
        //The Week Society
        driver.findElement(MobileBy.AccessibilityId("The Week Society"));
        //About section
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableGroup[4]/UIAStaticText[1]"));
        //Privacy policy
        driver.findElement(MobileBy.AccessibilityId("Privacy policy"));
        //Advertise The Week
        driver.findElement(MobileBy.AccessibilityId("Advertise in The Week"));
        //Credits
        driver.findElement(MobileBy.AccessibilityId("Credits"));
        //Analytics and privacy
        driver.findElement(MobileBy.AccessibilityId("Analytics and privacy"));
        //version number
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[5]/UIAStaticText[1]"));
        //close button
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]")).click();
        //check user is on homepage
        driver.findElement(MobileBy.AccessibilityId("IssueHeaderChevron"));
    }
}




