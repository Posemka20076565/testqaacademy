package swagLabsTests;

import libs.ConfigProperties;
import libs.ExcelDriver;
import org.junit.Test;
import parentTest.ParentTest;

import java.util.Map;

public class loginWithExcelParams extends ParentTest {
    String login = "standard_user";
    String password = "secret_sauce";

    @Test
    public void loginTest() {
        ExcelDriver excelDriver = new ExcelDriver();
//        Map dataForValidLogin = ExcelDriver.getData(ConfigProperties.DATA_FILE(), "Sheet 1")
        loginPageSwag.loginWithCred(login, password);

        checkExpectedResult("Next page wasn't opened", true, itemsPageSwag.isPageWithItems());

    }
}
