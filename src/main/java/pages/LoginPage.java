package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginPage extends ParentPage{
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openPage(){
        try{
            webDriver.get("https://osu.ppy.sh/home");
            logger.info("Login page was opened");
        } catch (Exception e){
            logger.error("LoginPage wasn't opened");
            Assert.fail("LoginPage wasn't opened");
        }
    }
}