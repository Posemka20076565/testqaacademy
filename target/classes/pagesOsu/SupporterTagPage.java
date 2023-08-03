package pagesOsu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SupporterTagPage extends ParentPage{
    @FindBy(xpath = ".//button[@class='btn-osu-big btn-osu-big--store-action js-store-add-to-cart js-login-required--click']")
    private WebElement addToCartButton;
    @FindBy(xpath = ".//a[@class='nav2__menu-link-main js-menu' and @href='https://osu.ppy.sh/store/listing']")
    private WebElement storeButton;
    @FindBy(xpath = ".//a[@class='simple-menu__item u-section-store--before-bg-normal']")
    private WebElement cartButton;

    public SupporterTagPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void addItemToCart(){
        actionsWithOurElements.clickOnElement(addToCartButton);
        logger.info("addItemToCart was clicked");
    }


    public void clickOnCart(){
        actions.moveToElement(storeButton).build().perform();
        actionsWithOurElements.clickOnElement(cartButton);
        logger.info("CartButton was clicked");
    }
}
