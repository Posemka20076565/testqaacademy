package swagLabsTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parentTest.ParentTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UnvalidLoginWithParams extends ParentTest {
    String login, password;

    public UnvalidLoginWithParams(String login, String password) {
        this.login = login;
        this.password = password;
    }
    @Parameterized.Parameters(name = "Parameters {0} and {1}")
    public static Collection testData(){
        return Arrays.asList(new Object[][] {
                {"standard_user","secret_sauce"},
                {"login","secret_sauce"}
//                {"standard_user","password"},
//                {"login","password"}
        });
    }
    @Test
    public void unvalidLogin() {
        loginPageSwag.loginWithCred(login,password);

        checkExpectedResult("Next page wasn't opened", true, itemsPageSwag.isPageWithItems());
    }
}
