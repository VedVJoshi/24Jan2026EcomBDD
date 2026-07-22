package hooks;

import com.velocityEcom.driverFactory.DriverFactory;
import com.velocityEcom.utils.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

import java.io.IOException;
import java.time.Duration;

public class Hooks {

    @Before
    public void launchBrowser() throws IOException, InterruptedException {
        DriverFactory.setupBrowser(Utility.readDataFromPropertiesFile("browser"));
        Thread.sleep(4000);
    }

    @After(order = 1)
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        DriverFactory.getDriver().quit();
        Thread.sleep(10000);
        System.out.println("closing browser");
    }

    @After(order = 2)
    public void takeScreenShot(Scenario scenario) throws InterruptedException {

        Thread.sleep(2500);
        if (scenario.isFailed()) {
            byte[] screenShot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
            Reporter.log("took screenshot", true);
            scenario.attach(screenShot, "image/png", scenario.getName());
        }
//        Thread.sleep(3500);
//        byte[] screenShot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
//        Reporter.log("took screenshot", true);
//        scenario.attach(screenShot, "image/png", scenario.getName());
    }
}
