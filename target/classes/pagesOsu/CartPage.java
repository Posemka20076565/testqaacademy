package pagesOsu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends ParentPage{
    @FindBy(xpath=".//div[text()='osu!supporter tag for ']" )
    private WebElement itemSupporterTag;
    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean checkItemSupporterTag() {
        try {
            return itemSupporterTag.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
