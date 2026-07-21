package studyBDD.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features/VelocityEcomLogin.feature"},
        glue = {"studyBDD/stepDefinitions1", "studyBDD/hooks"},
        publish = true,
        plugin = {"pretty"}
        //tags = "@regression"
        //dryRun = true

  )

public class VelocityEcomRunner extends AbstractTestNGCucumberTests {

}
