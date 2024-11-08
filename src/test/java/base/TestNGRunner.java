package base;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/features", glue = "stepDefs", monochrome = true,
        plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
