package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

abstract public class parentpage {
    WebDriver webDriver;

    public parentpage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    Logger logger = Logger.getLogger(getClass());
}
