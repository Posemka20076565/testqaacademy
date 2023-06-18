package login_test;

import org.junit.Test;
import parentTest.ParentTest;

public class LoginTestPageWithPageObject extends ParentTest {
    @Test
    public void validLogin(){
        loginPage.openPage();
        loginPage.openLoginMenu();
        loginPage.enterTextIntoInputLogin("Artist_9");
        loginPage.enterTextIntoInputPassword("!osu123osu");
        loginPage.clickOnButtonLogin();

        checkExpectedResult("Avatar is not present", true, homePage.isAvatarPresent());
    }
}