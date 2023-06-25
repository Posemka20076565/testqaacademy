package pagesOsu;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;


public class LoginPage extends ParentPage{
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(xpath = ".//input[@class='login-box__form-input js-login-form-input js-nav2--autofocus']")
    private WebElement inputLoginRow;

    @FindBy(xpath =".//input[@class='login-box__form-input js-login-form-input']")
    private WebElement inputPasswordRow;

    @FindBy(xpath = ".//a[@class='landing-nav__link js-nav-toggle js-click-menu js-user-login--menu']")
    private WebElement loginMenu;

    @FindBy(xpath = ".//button[@class='btn-osu-big btn-osu-big--nav-popup js-captcha--submit-button']")
    private WebElement loginButton;
    @FindBy(xpath = ".//button[@data-click-menu-target='nav2-locale-popup']")
    private WebElement languageButton;
    @FindBy(xpath = ".//span[@class='nav2-locale-item']//div[contains(@style,'1f1ec-1f1e7.svg' )]")
    private WebElement englishLanguageButton;


    public void openPage(){
        try{
            webDriver.get("https://osu.ppy.sh/home");
            logger.info("Login page was opened");
        } catch (Exception e){
            logger.error("LoginPage wasn't opened");
            Assert.fail("LoginPage wasn't opened");
        }
    }

    public void openLoginMenu(){
        try{
            //webDriver.findElement(By.xpath(".//a[@class='landing-nav__link js-nav-toggle js-click-menu js-user-login--menu']")).click();
            loginMenu.click();
            logger.info("Login window was opened");
        } catch (Exception e){
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    public void enterTextIntoInputLogin(String login){
        actionsWithOurElements.enterTextIntoInput(inputLoginRow, login);
    }

    public void enterTextIntoInputPassword(String password){
//        try{
//            //WebElement inputPassword = webDriver.findElement(By.xpath(".//input[@class='login-box__form-input js-login-form-input']"));
//            inputPasswordRow.click();
//            inputPasswordRow.clear();
//            inputPasswordRow.sendKeys(password);
//            logger.info(password + " was inputted into input password");
//        } catch (Exception e){
//            logger.error("Can not work with element");
//            Assert.fail("Can not work with element");
//        }
        actionsWithOurElements.enterTextIntoInput(inputPasswordRow, password);
    }

    public void clickOnButtonLogin(){
        try{
            //webDriver.findElement(By.xpath(".//button[@class='btn-osu-big btn-osu-big--nav-popup js-captcha--submit-button']")).click();
            loginButton.click();
            logger.info("Button login was clicked");
        } catch (Exception e){
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    public void loginWithCred(String login, String password){
        openPage();
        openLoginMenu();
        enterTextIntoInputLogin(login);
        enterTextIntoInputPassword(password);
        clickOnButtonLogin();
    }

    public void changeLanguageToEnglish(){
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        languageButton.click();
        englishLanguageButton.click();
    }

    public void validLogin() {
        loginWithCred("Artist_9", "!osu123osu");
    }
}