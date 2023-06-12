package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homepage extends parentpage{


    public homepage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isAvatarPresent(){
        try {
           return  webDriver.findElement(By.xpath(".//div[@class='contact-me']")).isDisplayed();
        }catch (Exception e){
            return false;
        }
    }
}
