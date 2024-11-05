package base;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/features/SignIn.feature", glue = "stepDefs", monochrome = true)
public class TestNGRunner extends AbstractTestNGCucumberTests {
}
