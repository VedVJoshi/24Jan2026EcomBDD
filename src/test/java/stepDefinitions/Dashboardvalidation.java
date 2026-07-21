package stepDefinitions;

import com.velocityEcom.driverFactory.DriverFactory;
import com.velocityEcom.pages.EcomDashBoardPage;
import com.velocityEcom.pages.EcomInventoryUpdatePage;
import com.velocityEcom.pages.EcomLoginPage;
import com.velocityEcom.utils.Utility;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class Dashboardvalidation {

    EcomLoginPage ecomLoginPage = new EcomLoginPage(DriverFactory.getDriver());
    EcomDashBoardPage ecomDashBoardPage = new EcomDashBoardPage(DriverFactory.getDriver());
    EcomInventoryUpdatePage ecomInventoryUpdatePage = new EcomInventoryUpdatePage(DriverFactory.getDriver());
    SoftAssert softAssert = new SoftAssert();

    @Given("user clicks on admin button of VelocityEcom application")
    public void user_clicks_on_admin_button_of_velocity_ecom_application() {
        ecomLoginPage.clickAdminButton();
    }

    @When("user enters username as {string} on VelocityEcom application")
    public void user_enters_username_as_on_velocity_ecom_application(String username) throws IOException {
        ecomLoginPage.enterAdminUserName(username);
    }

    @When("user enters password as {string} on VelocityEcom application")
    public void user_enters_password_as_on_velocity_ecom_application(String password) {
        ecomLoginPage.enterPassword(password);
        //Assert.fail();
    }

    @When("user clicks on access dashboard button on VelocityEcom application")
    public void user_clicks_on_access_dashboard_button_on_velocity_ecom_application() throws InterruptedException {
        ecomLoginPage.clickOnAccessDashBoard();
        Thread.sleep(3800);
        ecomDashBoardPage.clickOnDismissPopUp();

    }

    @Then("user navigates to dashboard and validate details")
    public void user_navigates_to_dashboard_and_validate_details(){
        //getTotalProduct
        String actualTotalProduct = ecomDashBoardPage.getTotalProducts();
        Reporter.log("total product are " + actualTotalProduct, true);
        //getTotalOrder
        String actualTotalOrder = ecomDashBoardPage.getTotalOrder();
        Reporter.log("total order are " + actualTotalOrder, true);
        //pendingApprovalCard
        String actualPendingApproval = ecomDashBoardPage.getTotalPendingApproval();
        Reporter.log("actual pending approval are " + actualPendingApproval, true);
        //validation-->
        softAssert.assertNotNull(actualTotalProduct, "actual product are null,TC FAILED");
        softAssert.assertNotNull(actualTotalOrder, "actual orders are  null,TC FAILED");
        softAssert.assertNotNull(actualPendingApproval, "actual pending approval are null,TC FAILED");
        softAssert.assertAll();

    }

    @And("user clicks on inventory update option")
    public void userClicksOnInventoryUpdateOption() throws InterruptedException {
        ecomInventoryUpdatePage.clickOnInventoryUpdateButton();
    }

    @Then("user validates total entries, open partial, fully received, unit orders")
    public void userValidatesTotalEntriesOpenPartialFullyReceivedUnitOrders() throws InterruptedException {
        String expectedTotalEntriesOrders = "53";
        String actualTotalEntriesOrders = ecomInventoryUpdatePage.getTotalEntriesOfOrders();
        Reporter.log("actual total entries order "+actualTotalEntriesOrders,true);
        Assert.assertEquals(actualTotalEntriesOrders, expectedTotalEntriesOrders, "actual and expected entries are not equals,TC FAILED");

        String actualOpenPartialOrders = ecomInventoryUpdatePage.getOpenPartialOrders();
        Reporter.log("actual open and partial order are " + actualOpenPartialOrders, true);

        String actualFullyReceivedOrders = ecomInventoryUpdatePage.getFullyReceivedOrders();
        Reporter.log("actual fully received orders are " + actualFullyReceivedOrders, true);

        String actualUnitsOrdered = ecomInventoryUpdatePage.getUnitsOrdered();
        Reporter.log("actual units ordered are " + actualUnitsOrdered, true);

    }
}
