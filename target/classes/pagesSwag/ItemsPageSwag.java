package pagesSwag;

import libs.ActionsWithOurElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemsPageSwag extends ParentPageSwag{
    @FindBy(xpath = ".//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement cartBackpack;
    @FindBy(xpath = ".//a[@class='shopping_cart_link']")
    private WebElement cartButton;

    public ItemsPageSwag(WebDriver webDriver) {
        super(webDriver, "/inventory.html");
    }

    public void addBackpackToCart(){
        checkCurrentUrl();
        actionsWithOurElements.clickOnElement(cartBackpack);
        logger.info("Button add backpack to cart was clicked");
    }

    public void openCart(){
        checkCurrentUrl();
        actionsWithOurElements.clickOnElement(cartButton);
        logger.info("button open cart was clicked");
    }

    public boolean isPageWithItems(){
        String x;
        try{
            String current1Url = webDriver.getCurrentUrl();
            logger.info("Current page URL is " + current1Url);
            return current1Url.equals("https://www.saucedemo.com/inventory.html");
        } catch (Exception e) {
            logger.info("Current page is not ItemsPage");
            return false;
        }
    }
}
