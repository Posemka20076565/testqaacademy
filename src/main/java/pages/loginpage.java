package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class loginpage extends parentpage{
    public loginpage(WebDriver webDriver) {
        super(webDriver);
    }
    public void openPage() {
        try {
            webDriver.get("https://myservier.pt/");
            logger.info("Login page was open");
        }catch (Exception e){
            logger.error("{{Cannot open login page}}");
            Assert.fail("Cannot open login pag");
        }
    }
}
