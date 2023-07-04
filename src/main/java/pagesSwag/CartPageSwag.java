package pagesSwag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageSwag extends ParentPageSwag {
    @FindBy(xpath = ".//a[@id=\'item_4_title_link\']")
    private WebElement backpackInCart;

    public CartPageSwag(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean checkItemBackpack() {
        try {
            return backpackInCart.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}