import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by user on 28.12.2015.
 */




public class selenium {
    private WebDriver driver ;
    private WebElement element;

    @Test
    public void open() {

        String place = "http://google.com";
        System.out.println("Try open "+place);
        //            driver.manage().
            driver.get(place);
            driver.manage().window().maximize();
        WebDriver test = new FirefoxDriver();
    }

    public WebElement getWebElement(String locator) {
        element = driver.findElement(By.xpath(locator));
        return element;
    }



}
