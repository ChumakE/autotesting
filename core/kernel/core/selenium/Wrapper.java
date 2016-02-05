package kernel.core.selenium;

import org.openqa.selenium.WebDriver;

/**
 * Created by user on 28.12.2015.
 */
public class Wrapper {

    SeleniumWD driver = null;

    private WebDriver driver() {
       return  driver.getDriver();
    }

//    public void
}
