package testngTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseSetup {
    static WebDriver driver = null;

    public static WebDriver webDriverSetup(String browser) {

        if (browser.equals("chrome")) {
            // WebDriverManager.firefoxdriver().setup();
            WebDriverManager.chromedriver().setup();

            // WebDriver driver = new FirefoxDriver();
            driver = new ChromeDriver();

        }
        if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        }
        driver.manage().window().maximize();

        // driver.manage().window().fullscreen();
        WebDriverManager.chromedriver().clearDriverCache();
        return driver;
    }

    public static String getUtil(String value) {
        Properties file = new Properties();
        try {
            file.load(new FileInputStream("./src/test/java/utils/urlEmail.properties"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return file.getProperty(value);

    }

    public static void screenShot(String filepath) throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./src/test/java/Screenshots/"+filepath+"screenshot.png"));
    }

}
