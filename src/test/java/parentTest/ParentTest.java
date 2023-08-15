package parentTest;

import libs.ExcelReader;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import pagesSwag.CartPageSwag;
import pagesSwag.ItemsPageSwag;
import pagesSwag.LoginPageSwag;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ParentTest {
    WebDriver webDriver;
    String browser = System.getProperty("browser");
    /*    protected LoginPage loginPage;
    *   protected HomePage homePage;
    *    protected StorePage storePage;
    *    protected SupporterTagPage supporterTagPage;
    *    protected CartPage cartPage;
        protected BeatmapsPage beatmapsPage;*/
    protected LoginPageSwag loginPageSwag;
    protected ItemsPageSwag itemsPageSwag;
    protected CartPageSwag cartPageSwag;
    public static String dataFile =".//src//main//java//data//autoTestLoginData.xlsx";
    public Map<String, String> loginData;

    @Before
    public void setUp() throws IOException {
        if (browser != null) {
            browser.toLowerCase();
        }
        if ("chrome".equals(browser)) {
//            File file = new File("./src/drivers/chromedriver.exe");
//            System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
            FirefoxOptions profile = new FirefoxOptions();
            webDriver = new ChromeDriver();
        } else if ("firefox".equals(browser)) {
//            File file = new File("./src/drivers/geckodriver.exe");
//            System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
            FirefoxOptions profile = new FirefoxOptions();
            profile.addPreference("browser.startup.page", 0);
            profile.addPreference("browser.startup.homepage_overdrive.mstone", "ignore");
            webDriver = new FirefoxDriver();
        } else if (browser == null || "edge".equals(browser)){
            EdgeOptions profile = new EdgeOptions();
            webDriver = new EdgeDriver();
        }

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        webDriver = new ChromeDriver(options);

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

//        loginPage = new LoginPage(webDriver);
//        homePage = new HomePage(webDriver);
//        storePage = new StorePage(webDriver);
//        supporterTagPage = new SupporterTagPage(webDriver);
//        cartPage = new CartPage(webDriver);
//        beatmapsPage = new BeatmapsPage(webDriver);
        loginData = ExcelReader.readExcel(dataFile, "sheet1");
        loginPageSwag = new LoginPageSwag(webDriver);
        itemsPageSwag = new ItemsPageSwag(webDriver);
        cartPageSwag = new CartPageSwag(webDriver);
    }

    @After
    public void tearDown() {
        webDriver.quit();
    }

    public void checkExpectedResult(String message, boolean expectedResult, boolean actualResult) {
        Assert.assertEquals(message, expectedResult, actualResult);
    }

}