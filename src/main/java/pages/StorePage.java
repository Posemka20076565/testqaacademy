package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class StorePage extends ParentPage{
    @FindBy(xpath = ".//a[@class='product-box product-box--card product-box--card-large' and @href='https://osu.ppy.sh/store/products/208']")
    private WebElement itemSupporterTag;

    public StorePage(WebDriver webDriver){
        super(webDriver);
    }

    public void clickOnSupporterTag(){
        actionsWithOurElements.clickOnElement(itemSupporterTag);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        logger.info("Supporter Tag page button was clicked");
    }
}
