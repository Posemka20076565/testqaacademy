package parentTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pagesOsu.*;

import java.util.concurrent.TimeUnit;

public class ParentTest {
    protected WebDriver webDriver;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected StorePage storePage;
    protected SupporterTagPage supporterTagPage;
    protected CartPage cartPage;
    protected BeatmapsPage beatmapsPage;
    @Before
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        webDriver = new ChromeDriver(options);

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        storePage = new StorePage(webDriver);
        supporterTagPage = new SupporterTagPage(webDriver);
        cartPage = new CartPage(webDriver);
        beatmapsPage = new BeatmapsPage(webDriver);
    }
    @After
    public void tearDown(){
        webDriver.quit();
    }

    public void checkExpectedResult(String message, boolean expectedResult, boolean actualResult){
        Assert.assertEquals(message, expectedResult, actualResult);
    }
//
//    public void checkExpectedResult(String message, boolean actualResult){

}