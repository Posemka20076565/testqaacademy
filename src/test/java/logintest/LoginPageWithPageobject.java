package logintest;
import org.junit.Test;
import parentTest.parenttest;
public class LoginPageWithPageobject extends parenttest{
    @Test
    public void validLLogin(){
        loginpage.openPage();
    }
}
