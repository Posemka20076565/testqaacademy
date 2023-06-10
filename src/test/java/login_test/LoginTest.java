package login_test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    @Test
    public void  validLogIn() throws InterruptedException{
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(options);

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        webDriver.get("https://osu.ppy.sh/home");
        Thread.sleep(100);

        webDriver.findElement(By.xpath(".//a[@class='landing-nav__link js-nav-toggle js-click-menu js-user-login--menu']")).click();

        webDriver.findElement(By.xpath(".//input[@class='login-box__form-input js-login-form-input js-nav2--autofocus']")).clear();
        webDriver.findElement(By.xpath(".//input[@class='login-box__form-input js-login-form-input js-nav2--autofocus']")).sendKeys("cenetron");

        webDriver.findElement(By.xpath(".//input[@class='login-box__form-input js-login-form-input']")).clear();
        webDriver.findElement(By.xpath(".//input[@class='login-box__form-input js-login-form-input']")).sendKeys("!amn0tOsu");

        webDriver.findElement(By.xpath(".//button[@class='btn-osu-big btn-osu-big--nav-popup js-captcha--submit-button']")).click();

        Assert.assertTrue("Avatar is not present", webDriver.findElement(By.xpath(".//a[@class='avatar avatar--nav2 js-current-user-avatar js-click-menu js-user-login--menu js-user-header']")).isDisplayed());
    }
}
