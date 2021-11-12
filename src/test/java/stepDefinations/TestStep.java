package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStep {
    @Given("API to verify it is working")
    public void api_to_verify_it_is_working() {
        System.out.println("This is the first line");
    }
@When("User access the api and inputs the data")
public void user_access_the_api_and_inputs_the_data() {
    System.out.println("This is the second line");
        }
@Then("user should able to enter input and call the api")
public void user_should_able_to_enter_input_and_call_the_api() {
    System.out.println("This is the Third line");
        }
@Then("user should get the response from api")
public void user_should_get_the_response_from_api() {
    System.out.println("This is the fourth line");
        }}