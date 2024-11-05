package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.LoggerConfig;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {

    public WebDriver driver;
    Properties prop = new Properties();
    Logger logger;

    public void goToLandingPage() throws IOException {
        driver.get(prop.getProperty("baseUrl"));
        logger.info("User Navigated to: " + prop.getProperty("baseUrl"));

    }

    public WebDriver getDriver() throws IOException {
        if (driver == null) {
            prop.load(new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/global.properties"));
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            logger.info("Chrome Browser Initiated");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(prop.getProperty("implicitWaitTime"))));
        }
        return driver;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
