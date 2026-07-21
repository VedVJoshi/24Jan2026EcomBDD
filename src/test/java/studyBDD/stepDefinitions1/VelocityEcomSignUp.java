package studyBDD.stepDefinitions1;

import io.cucumber.java.en.*;
import org.testng.Reporter;

import java.util.List;
import java.util.Map;

public class VelocityEcomSignUp {
    @Given("user is on sign up page")
    public void user_is_on_sign_up_page() {
        Reporter.log("user is on signUp page",true);

    }

    @When("user enter registration details and clicks sign up button")
    public void user_enter_registration_details_and_clicks_sign_up_button(io.cucumber.datatable.DataTable dataTable) {
        Reporter.log("===========as Lists==============",true);
        List<List<String>> users = dataTable.asLists();
        String user3detail =users.get(3).get(1);
        System.out.println(user3detail);
        Reporter.log("=========================",true);

        String user2detail=users.get(2).get(2);
        System.out.println(user2detail);
        Reporter.log("=========================",true);

        String user1detail=users.get(1).get(1);
        Reporter.log("user 1 details "+user1detail,true);
        Reporter.log("=========================",true);

        Reporter.log("===========as Maps==============",true);
        List<Map<String, String>> usersTable = dataTable.asMaps();
        String user1=usersTable.get(0).get("Email");
        Reporter.log("user 1 detail "+user1,true);

        String user2=usersTable.get(2).get("LastName");
        Reporter.log("user 2 details "+user2,true);

        Map<String, String> daata = usersTable.get(0);
        System.out.println(daata);

    }

    @Then("user registration should successful done")
    public void user_registration_should_successful_done() {
        Reporter.log("user registration should successful done",true);
    }
}
