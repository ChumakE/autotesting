package kernel.core.selenium;

import kernel.core.interceptor.Interceptor;
import kernel.core.page.BrowserType;
import kernel.core.selenium.factory.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by user on 28.12.2015.
 */




public class SeleniumWD extends Interceptor{
    private WebDriver driver = WebDriverFactory.getDriver();
    private BrowserType browserType;
    private WebElement element;



    public void get(String place) {
        System.out.println("Try open "+place);
        if (!place.contains("http://")) {
            System.out.print("Place NOT contains 'HTTP'");
        } else {
//            driver.manage().
            driver.get(place);
            driver.manage().window().maximize();
//            new WebDriverWait(driver, 60);
        }
    }

    public WebElement getWebElement(String locator) {
        element = driver.findElement(By.xpath(locator));
        return element;
    }


    public  WebDriver getDriver() {
        return driver;
    }


}
