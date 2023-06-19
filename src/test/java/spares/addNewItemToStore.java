package spares;

import org.junit.Test;
import parentTest.ParentTest;

public class addNewItemToStore extends ParentTest {

    @Test
    public void addSupporterSubscriptionToCart(){
        loginPage.validLogin();
        homePage.isAvatarPresent();
        homePage.clickOnStore();
        storePage.clickOnSupporterTag();
        supporterTagPage.addItemToCart();
        supporterTagPage.clickOnCart();
    }
}
