package login_test;

import org.junit.Test;
import parentTest.ParentTest;

public class LoginTestPageWithPageObject extends ParentTest {
    @Test
    public void validLogin(){
        loginPage.openPage();
    }
}
