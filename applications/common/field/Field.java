package common.field;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by user on 04.02.2016.
 */
public class Field {

    // TODO Create some methods

    /**
     * Get numbers of element on page
     * @param element
     * @return - int, numbers of element
     */
    public int getCountsOfElement(WebElement element) {
        return element.findElements(By.xpath("//*[@class='srg']/div")).size();
    }

//    public java.lang.reflect.Field
}
