package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//@RunWith(JUnit4.class)
public class SafariDriverTests {

    private WebDriver driver = new SafariDriver();

    @org.testng.annotations.Test(description = "Test")
    public void test() {
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findElement(By.name("btnG")).click();
        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.titleIs("webdriver - Google Search"));
    }
}