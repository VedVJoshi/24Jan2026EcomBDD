package com.velocityEcom.driverFactory;

import com.velocityEcom.utils.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.time.Duration;

public class DriverFactory {

    static WebDriver driver;
    public static WebDriver setupBrowser(String browserName) throws IOException {
        if (browserName.equals("chrome"))
        {
            driver=new ChromeDriver();
        }
        else if (browserName.equals("firefox"))
        {
            driver=new FirefoxDriver();
        }
        else if (browserName.equals("edge"))
        {
            driver=new EdgeDriver();
        }

        driver.get(Utility.readDataFromPropertiesFile("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;

    }

    public static WebDriver getDriver()
    {
        return driver;
    }
}
