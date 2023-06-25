package pagesOsu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class BeatmapsPage extends ParentPage{
    @FindBy(xpath = ".//div[@class='beatmapsets-search']//input[@class='beatmapsets-search__input js-beatmapsets-search-input' and @type='search']")
    private WebElement beatmapNameInputRow;
    @FindBy(xpath = ".//a[@class='beatmapset-panel__cover-container' and @href='https://osu.ppy.sh/beatmapsets/863359']")
    private WebElement songTheHills;
    @FindBy(xpath = ".//a[@class='beatmapset-panel__cover-container' and @href='https://osu.ppy.sh/beatmapsets/863359']/parent::div//button[@data-orig-title='favourite this beatmap']")
    private WebElement favouriteSongTheHills;
    public BeatmapsPage(WebDriver webDriver) {
        super(webDriver);
    }
    public void searchForSongTheHills(){
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        actions.moveToElement(beatmapNameInputRow).build().perform();
        beatmapNameInputRow.click();
        beatmapNameInputRow.clear();
        beatmapNameInputRow.sendKeys("Hills");
        logger.info("Song was searched");
    }

    public void favouriteSongTheHills(){
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        actions.moveToElement(songTheHills).build().perform();
        logger.info("mouse moved to beatmap");
        webDriver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        actionsWithOurElements.clickOnElement(favouriteSongTheHills);
        logger.info("The Hills was favorited");
    }
}
