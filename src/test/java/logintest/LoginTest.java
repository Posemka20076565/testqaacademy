package logintest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class LoginTest {
    @Test
    public void validLogIn() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://myservier.pt/");
        Thread.sleep(50000);
        webDriver.findElement(By.name("my-servier")).click();
        webDriver.findElement(By.name("user_login")).clear();
        webDriver.findElement(By.name("user_login")).sendKeys("a.mishchenko@viseven.com");
    webDriver.findElement(By.id("user_password_login")).clear();
        webDriver.findElement(By.id("user_password_login")).sendKeys("bwoRd8qlEqEg0hYKa8n*)d9C");
        webDriver.findElement(By.tagName("button")).click();
        Assert.assertTrue("avatar is not present", webDriver.findElement(By.xpath(".//span[@class='nav-mobile__contact__text']")).isDisplayed());
    }
}
