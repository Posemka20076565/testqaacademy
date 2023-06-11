package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends ParentPage{
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isAvatarPresent(){
        try{
           return webDriver.findElement(By.xpath(".//a[@class='avatar avatar--nav2 js-current-user-avatar js-click-menu js-user-login--menu js-user-header']")).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
