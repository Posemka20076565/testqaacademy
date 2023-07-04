package pagesSwag;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageSwag extends ParentPageSwag {
    @FindBy(xpath = ".//input[@id='user-name']")
    private WebElement inputLoginRow;
    @FindBy(xpath =".//input[@id='password']")
    private WebElement inputPasswordRow;
    @FindBy(xpath = ".//input[@id='login-button']")
    private WebElement loginButton;
    public LoginPageSwag(WebDriver webDriver) {
        super(webDriver, "/");
    }

    public void openLoginPage(){
        try{
            webDriver.get("https://www.saucedemo.com/");
            logger.info("Login page was opened");
        } catch (Exception e){
            logger.error("LoginPage wasn't opened");
            Assert.fail("LoginPage wasn't opened");
        }
    }

    public void inputTextIntoLogin(String login){
        actionsWithOurElements.enterTextIntoInput(inputLoginRow, login);
        logger.info("Login text was inputted");
    }

    public void inputTextIntoPassword(String password){
        actionsWithOurElements.enterTextIntoInput(inputPasswordRow, password);
        logger.info("Password text was inputted");
    }

    public void loginWithCred(String login, String password){
        openLoginPage();
        inputTextIntoLogin(login);
        inputTextIntoPassword(password);
        loginButton.click();
    }
}
