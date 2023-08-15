package swagLabsTests;

import libs.ExcelReader;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Test;
import parentTest.ParentTest;

import java.io.IOException;
import java.util.Map;

public class test1 extends ParentTest {

    String login = "standard_user";
    String password = "secret_sauce";



    @Test
    public void loginTest() {
        loginPageSwag.loginWithCred(login, password);
        itemsPageSwag.addBackpackToCart();
        itemsPageSwag.openCart();

        checkExpectedResult("Can not find backpack in cart", true, cartPageSwag.checkItemBackpack());

    }
}
