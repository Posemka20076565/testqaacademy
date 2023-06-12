package parentTest;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.homepage;
import pages.loginpage;

import java.util.concurrent.TimeUnit;

public class parenttest {
    WebDriver webDriver;
   protected loginpage loginpage;
   protected homepage homepage;

    @Before
    public void setup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        webDriver = new ChromeDriver(options);

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        loginpage = new loginpage(webDriver);
        homepage = new homepage(webDriver);
    }
    @After
    public void tearDown(){
        webDriver.quit();
    }
}
