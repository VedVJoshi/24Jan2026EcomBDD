package com.velocityEcom.pages;

import com.velocityEcom.driverFactory.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcomDashBoardPage {

    private static final Logger log = LogManager.getLogger(EcomDashBoardPage.class);
    @FindBy(xpath = "(//div[@class='stat-value'])[1]")
    private WebElement totalProductCard;
    @FindBy(xpath = "(//div[@class='stat-value'])[2]")
    private WebElement totalOrderCard;
    @FindBy(xpath = "(//div[@class='stat-value'])[3]")
    private WebElement lowStockItemCard;
    @FindBy(xpath = "(//div[@class='stat-value'])[4]")
    private WebElement pendingApprovalCard;
    @FindBy(xpath = "(//div[@class='stat-value'])[5]")
    private WebElement totalRevenue;
    @FindBy(xpath = "(//div[@class='stat-value'])[6]")
    private WebElement backOrder;

    @FindBy(xpath = "(//div[contains(@style,'position')])[1]")
    private WebElement dashBoardPopUp;

    public EcomDashBoardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickOnDismissPopUp() {
        if (dashBoardPopUp.isDisplayed()) {
            DriverFactory.getDriver().findElement(By.xpath("//button[@title='Dismiss']")).click();
            System.out.println("closing popup");
        } else {
            System.out.println("no pop present on dashboard page");
        }
    }

    public String getTotalProducts() {
        System.out.println("Getting total Product");
        return totalProductCard.getText();
    }

    public String getTotalOrder() {
        System.out.println("getting total Order");
        return totalOrderCard.getText();
    }

    public String getTotalLowStock() {
        System.out.println("getting total low Stock Item");
        return lowStockItemCard.getText();
    }

    public String getTotalPendingApproval() {
        System.out.println("getting total pending order");
        return pendingApprovalCard.getText();
    }
    public String getTotalRevenue() {
        System.out.println("getting total revenue");
        return totalRevenue.getText();
    }
}
