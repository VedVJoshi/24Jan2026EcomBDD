package com.velocityEcom.pages;

import com.velocityEcom.driverFactory.DriverFactory;
import com.velocityEcom.utils.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class EcomLoginPage {

    //variable--> WebElement-->
    @FindBy(id = "tab-admin")
    private WebElement adminButton;
    @FindBy(id = "admin-username")
    private WebElement adminUserNameField;
    @FindBy(id="admin-password")
    private WebElement adminPasswordField;
    @FindBy(id="btn-admin-signin")
    private WebElement accessDashboardButton;

    //constructor-->
    public EcomLoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    //methods-->
    public void clickAdminButton()
    {
        adminButton.click();
        System.out.println("clicking admin button");
    }

    public void enterAdminUserName(String userName) throws IOException {
        Utility.scrollToElement(DriverFactory.getDriver(),adminUserNameField);
        adminUserNameField.sendKeys(userName);
        System.out.println("entering username");
    }

    public void enterPassword(String password)
    {
        Utility.scrollToElement(DriverFactory.getDriver(),adminPasswordField);
        adminPasswordField.sendKeys(password);
        System.out.println("entering password");
    }

    public void clickOnAccessDashBoard()
    {
        Utility.scrollToElement(DriverFactory.getDriver(),accessDashboardButton);
        accessDashboardButton.click();
        System.out.println("clicking on AccessDashBoard Button");
    }


}
