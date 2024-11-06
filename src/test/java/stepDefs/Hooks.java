package stepDefs;

import base.ContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Hooks {

    WebDriver driver;
    ContextSetup contextSetup;

    public Hooks(ContextSetup contextSetup) throws IOException {
        this.contextSetup = contextSetup;
        this.driver = contextSetup.testBase.getDriver();
    }

    @After
    public void afterScenario() throws IOException {
        contextSetup.testBase.getDriver().quit();
    }

    @AfterStep
    public void takeScreenshot(Scenario scenario) throws IOException {
        if (scenario.isFailed()){
            File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            byte[] file = FileUtils.readFileToByteArray(sourceFile);
            scenario.attach(file, "image/png", "image");
        }
    }

}
