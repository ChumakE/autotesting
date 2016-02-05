package kernel.core.htmlReporter;

/**
 * Created by user on 05.01.2016.
 */
public class HtmlReporter {

    private String  pathToReport = System.getProperty("user.home");
    private int stepNumber = 1;
    public enum STATUS {
        PASSED,
        FAIL,
        SKIP,
        WARNING
    }

    String report = "";

    public void tesr () {
    }

    private void before() {

    }

    private void write(String description, STATUS status) {

    }

}
