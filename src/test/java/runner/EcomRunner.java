package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/velocityEcomFeatures/Dashboardvalidation.feature"},
        glue = {"stepDefinitions", "hooks"},
        plugin = {"pretty"},
        publish = true
)

public class EcomRunner extends AbstractTestNGCucumberTests {
}
