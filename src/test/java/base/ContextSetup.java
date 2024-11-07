package base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.PageObjectManager;
import utilities.LoggerConfig;

import java.io.IOException;

public class ContextSetup {

    public TestBase testBase;
    public PageObjectManager pageObjectManager;
    public LoggerConfig loggerConfig;
    public Logger logger;

    public ContextSetup() throws IOException {
        testBase = new TestBase();
        loggerConfig = new LoggerConfig();
        testBase.setLogger(loggerConfig.getLogger());
        logger = loggerConfig.getLogger();
        pageObjectManager = new PageObjectManager(testBase.getDriver(), logger);
    }
}
