package pagesSwag;

import libs.ActionsWithOurElements;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

abstract public class ParentPageSwag {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
    ActionsWithOurElements actionsWithOurElements;
    Actions actions;
    final String BASE_URL = "https://www.saucedemo.com/";
    String expectedUrl;

    public ParentPageSwag(WebDriver webDriver, String partUrl) {
        this.webDriver = webDriver;
        actions = new Actions(webDriver);
        PageFactory.initElements(webDriver, this);
        actionsWithOurElements = new ActionsWithOurElements(webDriver);
        expectedUrl = BASE_URL + partUrl;
    }

    public void checkCurrenUrl(){
        try {
            Assert.assertEquals("URL is not expected", expectedUrl, webDriver.getCurrentUrl());
        } catch (Exception e){
            logger.error("Can not get URL" + e);
            Assert.fail("Can not get URL");
        }
    }
}
