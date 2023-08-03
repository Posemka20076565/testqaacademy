package libs;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    private Logger log;

    public Utils() {
        log = Logger.getLogger(getClass());
    }

    /**
     * taking screenshot into .//target// + pathToScreenshot
     *
     * @param pathToScreenshot
     * @param driver
     */
    public void screenShot(String pathToScreenshot, WebDriver driver) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File(pathToScreenshot));
            log.info("ScreenShot: " + pathToScreenshot);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void waitABit(int second) {
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String getDateAndTimeFormatted() {
        return getDateAndTime("yyyy-MM-dd HIH-mm-ss");
    }

    public static String getDateAndTime(String format) {
        DateFormat dateFormat = new SimpleDateFormat(format);
        Date date = new Date();
        String dateFormatted = dateFormat.format(date);
        System.out.println(dateFormatted);
        return dateFormatted;
    }

}
