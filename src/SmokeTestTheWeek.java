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
 * Created by priyanka_mondal on 21/03/2017.
 */
public class SmokeTestTheWeek {
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
    public void dailybriefing() throws InterruptedException {
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
        driver.swipe(startx, starty, endx, starty, 3000);
        Thread.sleep(2000);

        //Swipe from Left to Right.
        //driver.swipe(endx, starty, startx, starty, 3000);
        //Thread.sleep(2000);


        ////*//*****  Checking for elements on 10 things
        driver.findElement(MobileBy.AccessibilityId("10 Things"));
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[1]/UIAButton[1]"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[2]/UIATableView[1]/UIATableGroup[1]"));
        //checks for 10 items per table view
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[2]/UIATableView[1]/UIATableCell[1]"));
        driver.findElement(MobileBy.AccessibilityId("FacebookIcon"));
        driver.findElement(MobileBy.AccessibilityId("TwitterIcon"));
        driver.findElement(MobileBy.AccessibilityId("MailVector"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[2]/UIATableView[1]/UIATableCell[10]"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[2]/UIATableView[1]/UIATableGroup[2]"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[2]/UIATableView[1]/UIATableCell[11]"));
        Dimension dimensions = driver.manage().window().getSize();
        Double screenHeightStart = dimensions.getHeight() * 0.8;
        int scrollStart = screenHeightStart.intValue();
        Double screenHeightEnd = dimensions.getHeight() * 0.4;
        int scrollEnd = screenHeightEnd.intValue();
        new TouchAction((IOSDriver<IOSElement>) driver).press(0, scrollStart).waitAction(5000)
                .moveTo(0 - 0, scrollEnd - scrollStart).release().perform();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[2]/UIATableView[1]/UIATableCell[70]"));


        ////*//*****  Checking for elements on The Business *******
        driver.findElement(MobileBy.AccessibilityId("The Business"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[1]/UIAButton[2]")).click();
        //checks for 7 items per table view
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[2]/UIATableView[1]/UIATableCell[1]"));
        driver.findElement(MobileBy.AccessibilityId("FacebookIcon"));
        driver.findElement(MobileBy.AccessibilityId("TwitterIcon"));
        driver.findElement(MobileBy.AccessibilityId("MailVector"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[2]/UIATableView[1]/UIATableCell[7]"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[2]/UIATableView[1]/UIATableGroup[2]"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[2]/UIATableView[1]/UIATableCell[8]"));
        Dimension dimensions1 = driver.manage().window().getSize();
        Double screenHeightStart1 = dimensions1.getHeight() * 0.8;
        int scrollStart1 = screenHeightStart1.intValue();
        Double screenHeightEnd1 = dimensions1.getHeight() * 0.5;
        int scrollEnd1 = screenHeightEnd1.intValue();
        new TouchAction((IOSDriver<IOSElement>) driver).press(0, scrollStart1).waitAction(5000)
                .moveTo(0 - 0, scrollEnd1 - scrollStart1).release().perform();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[2]/UIATableView[1]/UIATableCell[37]"));


        ////*//*****  Checking for elements on Wit and Wisdom ******
        driver.findElement(MobileBy.AccessibilityId("Wit & Wisdom"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[1]/UIAButton[2]")).click();
        //checks for 7 tables
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[2]/UIATableView[1]/UIATableGroup[1]"));
        Dimension dimensions2 = driver.manage().window().getSize();
        Double screenHeightStart2 = dimensions2.getHeight() * 0.8;
        int scrollStart2 = screenHeightStart2.intValue();
        Double screenHeightEnd2 = dimensions2.getHeight() * 0.4;
        int scrollEnd2 = screenHeightEnd2.intValue();
        new TouchAction((IOSDriver<IOSElement>) driver).press(0, scrollStart2).waitAction(3000)
                .moveTo(0 - 0, scrollEnd2 - scrollStart2).release().perform();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[2]/UIATableView[1]/UIATableGroup[7]"));

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
    @Test

    public void theweekhomepage() throws InterruptedException {

        //Check for all elements to be present on homepage after application has been installed

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
        //checks for Page indicator
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPageIndicator[1]"));
        //checks for NEW
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]"));
        //checks from drop down on latest issues
        driver.findElement(MobileBy.AccessibilityId("IssueHeaderChevron"));
        //checks for highlights button
        driver.findElement(MobileBy.AccessibilityId("Highlights"));
        //checks for buy now button
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[3]"));
        //checks for date
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIACollectionView[1]/UIACollectionCell[2]"));
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
    @Test
    public void helppage() throws InterruptedException {
        //Checks for InfoPage button
        driver.findElement(MobileBy.AccessibilityId("InfoVector")).click();
        driver.findElement(MobileBy.AccessibilityId("Update")).click();
        //*****  Checking for elements on Update page ****
        //checks for "1. Update"
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[2]"));
        // check for forgotten password link
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[1]"));
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

    @Test
    public void Highlightspage() throws InterruptedException {
        driver.findElement(MobileBy.AccessibilityId("Highlights")).click();
        driver.findElement(MobileBy.AccessibilityId("Subscribe"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]"));
        driver.findElement(MobileBy.AccessibilityId("Highlights"));
        Dimension dimensions = driver.manage().window().getSize();
        Double screenHeightStart = dimensions.getHeight() * 0.5;
        int scrollStart = screenHeightStart.intValue();
        Double screenHeightEnd = dimensions.getHeight() * 0.2;
        int scrollEnd = screenHeightEnd.intValue();
        new TouchAction((IOSDriver<IOSElement>) driver).press(0, scrollStart).waitAction(1000)
                .moveTo(0 - 0, scrollEnd - scrollStart).release().perform();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[1]"));
        //close
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]")).click();

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

    @Test

    public void logoutandread() throws InterruptedException{

        //driver.findElement(MobileBy.AccessibilityId("Buy now"));
        driver.findElement(MobileBy.AccessibilityId("SettingsVector")).click();
        // driver.findElement(MobileBy.AccessibilityId("Subscription")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]")).click();
        driver.findElement(MobileBy.AccessibilityId("Sign In"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).click();
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
        driver.findElement(MobileBy.AccessibilityId("All Issues")).click();
        driver.findElement(MobileBy.AccessibilityId("Read"));

        //logout
        driver.findElement(MobileBy.AccessibilityId("SettingsVector")).click();
        // driver.findElement(MobileBy.AccessibilityId("Account: Active")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]")).click();
        driver.findElement(MobileBy.AccessibilityId("Sign Out")).click();
        //return to homepage
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]")).click();
        //homepage and able to read already downloaded article
        driver.findElement(MobileBy.AccessibilityId("Read")).click();
        // finds Main Stories item after issue has been opened
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[1]"));
        //driver.findElement(MobileBy.AccessibilityId("Main stories"));
        driver.findElement(MobileBy.AccessibilityId("All Issues")).click();

        //Scroll down on homepage
        Dimension dimensions = driver.manage().window().getSize();
        Double screenHeightStart = dimensions.getHeight() * 0.8;
        int scrollStart = screenHeightStart.intValue();
        Double screenHeightEnd = dimensions.getHeight() * 0.4;
        int scrollEnd = screenHeightEnd.intValue();
        new TouchAction((IOSDriver<IOSElement>) driver).press(0, scrollStart).waitAction(5000)
                .moveTo(0 - 0, scrollEnd - scrollStart).release().perform();

        //should see issues that need to be bought
        driver.findElement(MobileBy.AccessibilityId("Buy for £2.99"));

    }
    @Test
    public void purchasepage() throws InterruptedException {
        //click on buy button
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[3]")).click();
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]"));
        driver.findElement(MobileBy.AccessibilityId("Purchase"));
        //static text
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIAStaticText[1]"));
        //table of issues
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]"));
        //button for purchase
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAButton[1]"));

        driver.findElement(MobileBy.AccessibilityId("Already a subscriber to The Week?")).click();
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIAButton[1]"));
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIAButton[1]")).click();
        driver.findElement(MobileBy.AccessibilityId("Subscription"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();

        driver.findElement(MobileBy.AccessibilityId("Restore purchase")).click();
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIAButton[2]"));
        //driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIAButton[2]")).click();
        driver.findElement(MobileBy.AccessibilityId("Sign In"));
        driver.findElement(MobileBy.AccessibilityId("Cancel")).click();
        driver.findElement(MobileBy.AccessibilityId("Cancel")).click();
        //close
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]")).click();

    }
    @Test

    public void incorrectloginandnodwnld() throws InterruptedException {

        //driver.findElement(MobileBy.AccessibilityId("Buy now"));
        driver.findElement(MobileBy.AccessibilityId("SettingsVector")).click();
        // driver.findElement(MobileBy.AccessibilityId("Subscription")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]")).click();
        driver.findElement(MobileBy.AccessibilityId("Sign In"));
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).sendKeys("GSH0EYS7");
        driver.findElement(MobileBy.AccessibilityId("Sign In")).click();
        //error message
        //driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]")).click();
        //retry login
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).clear();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).sendKeys("GSH0EYS6");
        driver.findElement(MobileBy.AccessibilityId("Sign In")).click();

        //dont accept privacy policy and click on submit
        driver.findElement(MobileBy.AccessibilityId("Submit")).click();

        //click on alert message
        driver.switchTo().alert().accept();
        //accept the policy
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIASwitch[1]")).click();
        driver.findElement(MobileBy.AccessibilityId("Submit")).click();

        //dont download and logout
        driver.findElement(MobileBy.AccessibilityId("SettingsVector")).click();
        // driver.findElement(MobileBy.AccessibilityId("Subscription")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]")).click();
        driver.findElement(MobileBy.AccessibilityId("Sign Out")).click();
        //return to homepage
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]")).click();
        //should see issues that need to be bought
        driver.findElement(MobileBy.AccessibilityId("Buy for £2.99"));


    }


}

