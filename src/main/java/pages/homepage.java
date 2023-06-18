package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class homepage extends parentpage{


    public homepage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isAvatarPresent(){
        try {
            webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            return  webDriver.findElement(By.xpath(".//div[@class='contact-me']")).isDisplayed();
        }catch (Exception e){
            return false;
        }
    }
}
