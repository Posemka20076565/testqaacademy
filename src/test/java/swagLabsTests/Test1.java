package swagLabsTests;

import org.junit.Test;
import parentTest.ParentTest;

public class Test1 extends ParentTest {
    @Test
    public void loginTest() {
        loginPageSwag.loginWithCred("standard_user", "secret_sauce");
        itemsPageSwag.addBackpackToCart();
        itemsPageSwag.openCart();

        checkExpectedResult("Can not find backpack in cart", true, cartPageSwag.checkItemBackpack());
    }
}