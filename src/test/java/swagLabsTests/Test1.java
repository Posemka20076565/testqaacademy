package swagLabsTests;

import org.junit.Test;
import parentTest.ParentTest;

public class Test1 extends ParentTest {
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
