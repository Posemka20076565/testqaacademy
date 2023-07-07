package login_test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pagesOsu.HomePage;

import java.util.concurrent.TimeUnit;

public class LoginTest{
    WebDriver webDriver;
    @Before
    public void setup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        webDriver = new ChromeDriver(options);

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
//    @Test
    public void  validLogIn() throws InterruptedException{
        webDriver.get("https://osu.ppy.sh/home");
        Thread.sleep(100);

        webDriver.findElement(By.xpath(".//a[@class='landing-nav__link js-nav-toggle js-click-menu js-user-login--menu']")).click();

        webDriver.findElement(By.xpath(".//input[@class='login-box__form-input js-login-form-input js-nav2--autofocus']")).clear();
        webDriver.findElement(By.xpath(".//input[@class='login-box__form-input js-login-form-input js-nav2--autofocus']")).sendKeys("Artist_");

        webDriver.findElement(By.xpath(".//input[@class='login-box__form-input js-login-form-input']")).clear();
        webDriver.findElement(By.xpath(".//input[@class='login-box__form-input js-login-form-input']")).sendKeys("!osu123osu");

        webDriver.findElement(By.xpath(".//button[@class='btn-osu-big btn-osu-big--nav-popup js-captcha--submit-button']")).click();

        HomePage homePage = new HomePage(webDriver);
        Assert.assertTrue("Avatar is not present",
//                webDriver.findElement(By.xpath(".//a[@class='avatar avatar--nav2 js-current-user-avatar js-click-menu js-user-login--menu js-user-header']"))
//                .isDisplayed()
                homePage.isAvatarPresent()
        );

    }
    @After
    public void tearDown(){
        webDriver.quit();
    }
}
