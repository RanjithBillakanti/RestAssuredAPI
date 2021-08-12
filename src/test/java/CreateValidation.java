import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateValidation {
    @Given("Add application payload")
    public void add_application_payload() {
    }

    @When("User calls {string} with POST http request")
    public void user_calls_with_post_http_request(String string) {

    }

    @Then("the API Call is success with status code {int}")
    public void the_api_call_is_success_with_status_code(Integer int1) {

    }

    @Then("{string} in response body is {string}")
    public void in_response_body_is(String string, String string2) {

    }

}
