package pagesSwag;

import libs.ActionsWithOurElements;
import libs.ConfigProperties;
import org.aeonbits.owner.ConfigFactory;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.regex.Pattern;

abstract public class ParentPageSwag {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
    ActionsWithOurElements actionsWithOurElements;
    Actions actions;
    protected static ConfigProperties configProperties = ConfigFactory.create(ConfigProperties.class);
    String baseUrl = "https://www.saucedemo.com";
    String expectedUrl;



    public ParentPageSwag(WebDriver webDriver, String partUrl) {
        this.webDriver = webDriver;
        actions = new Actions(webDriver);
        //baseUrl = configProperties.base_url();
        PageFactory.initElements(webDriver, this);
        actionsWithOurElements = new ActionsWithOurElements(webDriver);
        expectedUrl = baseUrl + partUrl;
    }

    public void checkCurrentUrl(){
        try {
//            logger.info("Expected URl is " + expectedUrl);
//            logger.info("Base URl is " + baseUrl);
            logger.info("Current URL is " + webDriver.getCurrentUrl());
            Assert.assertEquals("URL is not expected", Pattern.matches(expectedUrl, webDriver.getCurrentUrl()), true);
        } catch (Exception e){
            logger.error("Can not get URL" + e);
            Assert.fail("Can not get URL");
        }
    }
}
