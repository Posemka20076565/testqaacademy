package swagLabsTests;

import libs.ConfigProperties;
import libs.ExcelDriver;
import libs.ExcelReader;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Test;
import org.junit.runners.Parameterized;
import parentTest.ParentTest;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

public class loginWithExcelParams extends ParentTest {

    @Test
    public void loginTest(){
        String login = loginData.get("login");
        String password = loginData.get("password1");
        loginPageSwag.loginWithCred(login, password);

        checkExpectedResult("Next page wasn't opened", true, itemsPageSwag.isPageWithItems());

    }
}
