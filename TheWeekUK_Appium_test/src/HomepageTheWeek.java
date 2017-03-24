import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Alert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
/**
 * Created by priyanka_mondal on 07/03/2017.
 */
public class HomepageTheWeek {
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

    public void theweek() throws InterruptedException {

        //Check for all elements to be present on homepage after application has been installed
        //driver.switchTo().alert().accept();
        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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


}




