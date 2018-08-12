import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.SeleniumUtil;
import java.io.File;
import java.io.IOException;


public class Main {


    public static void main(String[] args) throws InterruptedException {


        String s = System.setProperty("webdriver.gecko.driver","/Users/FilipNicolaeHeruvim/Documents/Selenium/geckodriver 2");

        WebDriver driver =  new FirefoxDriver();
        driver.get("http://www.amazon.de");


        WebElement id  = driver.findElement(By.id("twotabsearchtextbox"));
        id.sendKeys("hilfiger");
        id.sendKeys(Keys.RETURN);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        SeleniumUtil.sleeep(2000);

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    // Now you can do whatever you need to do with it, for example copy somewhere
        try {
            FileUtils.copyFile(scrFile, new File("test.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Thread.sleep(3000);
        driver.close();
        driver.close();
        driver.quit();


    }
}
