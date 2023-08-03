package pagesOsu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage{
    @FindBy(xpath = ".//a[@class='nav2__menu-link-main js-menu' and @href='https://osu.ppy.sh/beatmapsets']")
    private WebElement storeButton;
    @FindBy(xpath = ".//a[@class='nav2__menu-link-main js-menu' and @href='https://osu.ppy.sh/beatmapsets']")
    private WebElement beatmapsButton;


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

    public void clickOnStore(){
        actionsWithOurElements.clickOnElement(storeButton);
        logger.info("storeButton was clicked");
    }
    public void clickOnBeatmaps(){
        actionsWithOurElements.clickOnElement(beatmapsButton);
        logger.info("beatmapsButton was clicked");
    }
}
