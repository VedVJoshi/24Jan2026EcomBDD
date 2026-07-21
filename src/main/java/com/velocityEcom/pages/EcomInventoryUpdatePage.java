package com.velocityEcom.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcomInventoryUpdatePage {

    @FindBy(xpath = "//a[text()='Inventory Update']")
    private WebElement inventoryUpdateButton;
    @FindBy(xpath = "(//div[@class='stat-value'])[1]")
    private WebElement totalEntries;
    @FindBy(xpath = "(//div[@class='stat-value'])[2]")
    private WebElement openPartial;
    @FindBy(xpath = "(//div[@class='stat-value'])[3]")
    private WebElement fullyReceived;
    @FindBy(xpath = "(//div[@class='stat-value'])[4]")
    private WebElement unitsOrdered;

    public EcomInventoryUpdatePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickOnInventoryUpdateButton() throws InterruptedException {
        Thread.sleep(3000);
        inventoryUpdateButton.click();
    }

    public String getTotalEntriesOfOrders() throws InterruptedException {
        Thread.sleep(3000);
        return totalEntries.getText();
    }

    public String getOpenPartialOrders() {
        return openPartial.getText();
    }

    public String getFullyReceivedOrders() {
        return fullyReceived.getText();
    }

    public String getUnitsOrdered() {
        return unitsOrdered.getText();
    }

}
