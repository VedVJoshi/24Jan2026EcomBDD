package com.velocityEcom.utils;

import com.velocityEcom.driverFactory.DriverFactory;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class Utility {

    public static String readDataFromPropertiesFile(String key) throws IOException {
        String projectPath = System.getProperty("user.dir");
        FileInputStream myFile = new FileInputStream("C:\\Users\\LENOVO\\IdeaProjects\\24Jan2026EcomBDD\\src\\main\\resources\\config.properties");
        Properties properties = new Properties();
        properties.load(myFile);
        String value = properties.getProperty(key);
        return value;
    }

    public static String readDataFromExcel(int row, int cell) throws IOException {
        FileInputStream myFile = new FileInputStream("D:\\Automation\\SeleniumExcel\\Data.xlsx");
        String value = WorkbookFactory.create(myFile).getSheet("Sheet10").getRow(row).getCell(cell).getStringCellValue();
        System.out.println("Reading Data From Excel Row " + row + " cell " + cell);
        return value;
    }

//    public static void takeScreenShot(WebDriver driver, String fileName) throws IOException {
//        String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
//        TakesScreenshot screenShot = (TakesScreenshot) driver;
//        File source = screenShot.getScreenshotAs(OutputType.FILE);
//        String pathOfDirectory = System.getProperty("user.dir");
//        File destination = new File(pathOfDirectory + "/projectScreenShotProof/" + fileName + timeStamp + ".png");
//        System.out.println("Project ScreenShot Saved At " + destination);
//        FileHandler.copy(source, destination);
//    }

    public static void scrollToElement(WebDriver driver,WebElement element) {
       Actions actions=new Actions(driver);
       actions.scrollToElement(element).perform();
        System.out.println("scrolling to element");
    }
}
