package logintest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.homepage;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver webDriver;
    @Before
    public void setup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        webDriver = new ChromeDriver(options);

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
    @Test
    public void validLogIn() throws InterruptedException {
        webDriver.get("https://myservier.pt/");
        Thread.sleep(1);
        webDriver.findElement(By.id("didomi-notice-agree-button")).click();
        webDriver.findElement(By.xpath(".//div[@class='my-servier']")).click();
        webDriver.findElement(By.id("user_login")).clear();
        webDriver.findElement(By.id("user_login")).sendKeys("a.mishchenko@viseven.com");
        webDriver.findElement(By.id("user_password_login")).clear();
        webDriver.findElement(By.id("user_password_login")).sendKeys("bwoRd8qlEqEg0hYKa8n*)d9C");
        webDriver.findElement(By.xpath(".//button[@class='form__button form__button--submit']")).click();
        homepage HomePage = new homepage(webDriver);
        Assert.assertTrue("avatar is not present",
    //            webDriver.findElement(By.xpath(".//div[@class='contact-me']"))
      //                  .isDisplayed()
                HomePage.isAvatarPresent()
        );
    }

    @After
    public void tearDown(){
        webDriver.quit();
    }
}