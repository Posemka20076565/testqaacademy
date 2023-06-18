package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage extends parentpage{
    public loginpage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "didomi-notice-agree-button")
    private WebElement tapToAgreeButton;
    @FindBy(xpath = ".//div[@class='my-servier']")
    private WebElement tapToLoginButton;
    @FindBy(id = "user_login")
    private WebElement inputLogin;

    @FindBy(id = "user_password_login")
    private WebElement inputPassword;

    @FindBy(xpath = ".//button[@class='form__button form__button--submit']")
    private WebElement tapToButtonForms;


    public void openPage() {
        try {
            webDriver.get("https://myservier.pt/");
            logger.info("Login page was open");
        }catch (Exception e){
            logger.error("{{Cannot open login page}}");
            Assert.fail("Cannot open login pag");
        }
    }

    public void enterTextIntoInputLogin(String login) {
//        try {
//   //         WebElement inputlogin = webDriver.findElement(By.id("user_login"));
//        inputLogin.clear();
//        inputLogin.sendKeys("a.mishchenko@viseven.com");
//        logger.info("was inputed login");
//        }catch (Exception e){
//            logger.error("Cannot work with element");
//            Assert.fail("Cannot work with element");
//        }
        actionsWithOurElements.enterTextIntoInput(inputLogin, "a.mishchenko@viseven.com");
    }

    public void enterTextIntoInputPassword(String password) {
        actionsWithOurElements.enterTextIntoInput(inputPassword, "bwoRd8qlEqEg0hYKa8n*)d9C");
//        try {
//        //    WebElement inputPassword = webDriver.findElement(By.id("user_password_login"));
//            inputPassword.clear();
//            inputPassword.sendKeys("bwoRd8qlEqEg0hYKa8n*)d9C");
//            logger.info("was inputed password");
//        }catch (Exception e){
//            logger.error("Cannot work with element");
//            Assert.fail("Cannot work with element");
//        }
    }

    public void clicktovhod() {
        try {
            //WebElement buttonvhod = webDriver.findElement(By.xpath(".//button[@class='form__button form__button--submit']"));
            tapToButtonForms.click();
            logger.info("button was clicked");

        }catch (Exception e){
            logger.error("Cannot work with element");
            Assert.fail("Cannot work with element");
        }
    }

    public void clicktoproverka() {
        try {
          //  WebElement buttonproverka = webDriver.findElement(By.id("didomi-notice-agree-button"));
            tapToAgreeButton.click();
            logger.info("button was clicked proverka");

        }catch (Exception e){
            logger.error("Cannot work with element");
            Assert.fail("Cannot work with element");
        }
    }

    public void clicktoenter() {
        try {
          //  WebElement buttonenter = webDriver.findElement(By.xpath(".//div[@class='my-servier']"));
            tapToLoginButton.click();
            logger.info("button was clicked enter");

        }catch (Exception e){
            logger.error("Cannot work with element");
            Assert.fail("Cannot work with element");
        }
    }
}
