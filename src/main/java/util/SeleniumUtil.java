package util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class SeleniumUtil {

    public static void sleeep(int milisecons){
        try {
            Thread.sleep(milisecons);
        } catch (InterruptedException e) {
            System.out.println("Timeout ");
            e.printStackTrace();
        }
    }

    public void takeScreenshot(WebDriver driver){
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy somewhere
        try {
            FileUtils.copyFile(scrFile, new File("test.png"));
        }catch (IOException e) {
            e.printStackTrace();
        }

    }



}
