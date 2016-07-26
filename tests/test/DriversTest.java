package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//@RunWith(JUnit4.class)
public class DriversTest {

    private WebDriver driver ;

    @Test(description = "Test")
    public void testSafariDriverWindows() {
        driver = new SafariDriver();
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findElement(By.name("btnG")).click();
        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.titleIs("webdriver - Google Search"));
    }

    @Test(description = "Test")
    public void testChromeDriverWindows() {
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findElement(By.name("btnG")).click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.titleIs("webdriver - Google Search"));
    }
}