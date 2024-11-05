package base;

import org.openqa.selenium.WebDriver;
import pages.PageObjectManager;
import utilities.LogsConfiguration;

import java.io.IOException;

public class ContextSetup {

    public WebDriver driver;
    public TestBase testBase;
    public PageObjectManager pageObjectManager;
    LogsConfiguration logs;

    public ContextSetup() throws IOException {
        testBase = new TestBase();
        pageObjectManager = new PageObjectManager(testBase.getDriver());
        logs = new LogsConfiguration();
    }
}
