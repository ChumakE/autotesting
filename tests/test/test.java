package test;

import common.WebApp;
import org.testng.annotations.Test;

/**
 * Created by user on 09.11.2015.
 */
public class test extends WebApp{

    @Test (description = "")
    public void open()  {

    }

    @Test (description = "Test")
    public void exampleTest()  {
//        String testLink = "http://the-internet.herokuapp.com/";
        String testLink = "http://google.com/";
        web.get(testLink);
        web.getWebElement("//*[@id='content']//li[1]/a").click();
        String link = "https://rc-ca.secure.od.ab-soft.net/rc-setup/web/?hash=3A311900278002E9401CF51DE6CF17884ED2B3&activation";
    }

    @Test (description = "Test")
    public void exampleTestGoogle()  {
//        String testLink = "http://the-internet.herokuapp.com/";
        String testLink = "http://google.com/";
        web.get(testLink);
        web.getWebElement("//*[@id='gs_lc0']").sendKeys("selenium");
        web.getWebElement("//*[@class='srg']/div");
        String link = "https://rc-ca.secure.od.ab-soft.net/rc-setup/web/?hash=3A311900278002E9401CF51DE6CF17884ED2B3&activation";
    }
}
