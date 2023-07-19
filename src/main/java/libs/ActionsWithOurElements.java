package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionsWithOurElements {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
    WebDriverWait wait10, wait15;

    public ActionsWithOurElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait10 = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait15 = new WebDriverWait(webDriver, Duration.ofSeconds(15));
    }

    public void enterTextIntoInput(WebElement element, String text) {
        try {
            element.click();
            element.clear();
            element.sendKeys(text);
            logger.info(text + " was inputted into input");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    public void clickOnElement(WebElement element1) {
        try {
            wait10.until(ExpectedConditions.elementToBeClickable(element1));
//            wait10.until(ExpectedConditions.not(ExpectedConditions.elementToBeClickable(element1)));
            element1.click();
            logger.info("Button was clicked");
        } catch (Exception e) {
            logger.error("Click wasn't possible");
            Assert.fail();
        }
    }

    public boolean isElementPresent(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void setStatusToCheckBox(WebElement checkBox, String status) {
        boolean isStatusCheck = "check".equals(status.toLowerCase());
        boolean isStatusUncheck = "uncheck".equals(status.toLowerCase());
        if (isStatusCheck || isStatusUncheck) {
            if (checkBox.isSelected() && isStatusCheck) {
                logger.info("CheckBox is already checked");
            } else if (checkBox.isSelected() && isStatusUncheck) {
                clickOnElement(checkBox);
            } else if (!checkBox.isSelected() && isStatusCheck) {
                clickOnElement(checkBox);
            } else if (!checkBox.isSelected() && isStatusUncheck) {
                logger.info("CheckBox is already unchecked");
            }
        } else {
            Assert.fail("Status should be 'check' ot 'uncheck'");
        }
    }
}
