package logintest;
import org.junit.Test;
import parentTest.parenttest;
public class LoginPageWithPageobject extends parenttest{
    @Test
    public void validLLogin(){
        loginpage.openPage();
        loginpage.clicktoproverka();
        loginpage.clicktoenter();
        loginpage.enterTextIntoInputLogin("a.mishchenko@viseven.com");
        loginpage.enterTextIntoInputPassword("bwoRd8qlEqEg0hYKa8n*)d9C");
        loginpage.clicktovhod();

        checkexpectedresult("avatar is not present", true, homepage.isAvatarPresent());
    }
}
