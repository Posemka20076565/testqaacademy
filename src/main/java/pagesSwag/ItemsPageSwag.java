package pagesSwag;

import libs.ActionsWithOurElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemsPageSwag extends ParentPageSwag{
    @FindBy(xpath = ".//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement cartBackpack;
    @FindBy(xpath = ".//a[@class='shopping_cart_link']")
    private WebElement cartButton;

    public ItemsPageSwag(WebDriver webDriver) {
        super(webDriver);
    }

    public void addBackpackToCart(){
        actionsWithOurElements.clickOnElement(cartBackpack);
        logger.info("Button add backpack to cart was clicked");
    }

    public void openCart(){
        actionsWithOurElements.clickOnElement(cartButton);
        logger.info("button open cart was clicked");
    }
}
