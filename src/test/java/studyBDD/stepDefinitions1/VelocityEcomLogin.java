package studyBDD.stepDefinitions1;

import io.cucumber.java.en.*;
import org.testng.Reporter;

public class VelocityEcomLogin {

    @Given("user is on ecom login page")
    public void user_is_on_ecom_login_page() {
        Reporter.log("User land on Login page",true);

    }

    @When("user click on admin button")
    public void user_click_on_admin_button()
    {
        Reporter.log("user click on admin button",true);
    }

    @When("user enter username as {string}")
    public void user_enter_username_as(String username)
    {
        Reporter.log("user enter username "+username,true);
    }

    @When("user enter password as {string}")
    public void user_enter_password_as(String password)
    {
        Reporter.log("user enter password "+password,true);
    }

    @When("user click on access dashboard")
    public void user_click_on_access_dashboard()
    {
        Reporter.log("user click on access dashboard button",true);
    }

    @Then("user navigates on dashboard page")
    public void user_navigates_on_dashboard_page()
    {
        Reporter.log("user navigate on on admin dashboard page",true);
    }

    @When("user click on customer login button")
    public void userClickOnCustomerLoginButton()
    {
        Reporter.log("user click on customer login button",true);
    }

    @And("user click on login")
    public void userClickOnLogin()
    {
        Reporter.log("click on login",true);
    }

    @Then("user navigates on product page")
    public void userNavigatesOnProductPage()
    {
        Reporter.log("user navigate on product page",true);
    }

}
