package kernel.core.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by user on 03.02.2016.
 */
public class SystemConfig {

    public String userHome = System.getProperty("user.home");
    public String fileName = "\\testConfig.ini";

    ////////////PARAMETERS///////////////
    public String someConfig = "";
    public String browserProfile;
    public String browserType;

    ////////////////////////////////////

    public void readConfigFile(){
        try {
            checkPresentConfigFile();
            System.out.println("Read config file: " + userHome + fileName);
            Properties props = new Properties();
            props.load(new FileInputStream(new File(userHome + fileName)));
            this.someConfig = props.getProperty("SomeConfig", "default");
            this.browserProfile = props.getProperty("Profile", "Selenium");
            this.browserType = props.getProperty("Browser", "firefox");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void checkPresentConfigFile() {
        File file = new File(userHome+fileName);
        if (!file.exists()) {
            try {
                FileWriter writer = new FileWriter(file,false);
                writer.write("SomeConfig = true");
                writer.write("\r\n");
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
