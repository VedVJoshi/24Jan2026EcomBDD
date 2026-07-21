package studyBDD.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.testng.Reporter;

public class VelocityEcomHooks {

    @Before(order = 1)
    public void setUpBrowser() {
        Reporter.log("browser set to chrome", true);
    }

    @After(order = 1)
    public void tearDown()
    {
        Reporter.log("closing browser",true);
    }

    @Before(order = 2)
    public void launchUrl()
    {
        Reporter.log("launching url",true);
    }

    @After(order = 2)
    public void logOutApplication()
    {
        Reporter.log("logging out",true);
    }

    @BeforeStep
    public void beforeStep()
    {
        Reporter.log("BeforeStep running",true);
    }

    @AfterStep
    public void afterStep()
    {
        Reporter.log("AfterStep running",true);
    }
}
