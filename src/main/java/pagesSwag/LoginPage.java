package pagesSwag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage{
    @FindBy(xpath = ".//input[@id='user-name']")
    private WebElement inputPasswordRow;
    @FindBy(xpath =".//input[@id='password']")
    private WebElement inputLoginRow;
    @FindBy(xpath = ".//input[@id='login-button']")
    private WebElement loginButton;
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void inputTextIntoLogin(String login){
        actionsWithOurElements.enterTextIntoInput(inputLoginRow, login);
    }

    public void inputTextIntoPassword(String password){
        actionsWithOurElements.enterTextIntoInput(inputPasswordRow, password);
    }

    public void loginWithCred(String login, String password){
        inputTextIntoLogin(login);
        inputTextIntoPassword(password);
        loginButton.click();
    }
}
