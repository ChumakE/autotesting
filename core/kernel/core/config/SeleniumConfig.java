/**
 *
 */
package kernel.core.config;

import kernel.core.page.BrowserType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

/**
 *
 * @author Evhen Chumak
 */
public class SeleniumConfig extends SystemConfig
{
//    static SystemConfig systemConfig = new SystemConfig();
    DesiredCapabilities caps;
//    public String profileName = browserProfile;
    public String profilePath ;
//    static String userHome = systemConfig.userHome;


    public BrowserType getTypeBrowser() {
        return BrowserType.FIREFOX;
    }

    public DesiredCapabilities getCapabilities() {
        readConfigFile();
        profilePath = userHome + "\\Automation\\Profiles\\"+browserProfile;
        if (browserType.toLowerCase().equals("firefox")) {
        final FirefoxProfile profile = new FirefoxProfile(new File(profilePath));
        caps = DesiredCapabilities.firefox();
        caps.setCapability(FirefoxDriver.PROFILE, profile);
        return caps;
        } else if (browserType.toLowerCase().equals("iexplorer")) {
            caps = DesiredCapabilities.internetExplorer();
            return  caps;
        } else {
            return caps;
        }
    }



}
