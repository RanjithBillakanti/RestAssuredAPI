package stepDefinations;
//import org.testng.internal.Utils;
import io.cucumber.java.en.Then;
import resources.Utils;
import io.restassured.response.Response;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import java.io.IOException;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import io.restassured.builder.ResponseSpecBuilder;
import pojo.RegistrationAPI.*;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import resources.APIResources;
//import static org.junit.Assert.assertEquals;
import io.restassured.http.ContentType;
import pojo.RegistrationAPI.SerializeDeserialize;
public class Registration extends Utils {
    String bodyString;
    Response response;
    RequestSpecification res;
    ResponseSpecification resspec;
    SerializeDeserialize serializeDeserialize= new SerializeDeserialize();
    @Given("Add Registration payload")
    public void add_Register_payload() throws IOException {
        res=given().spec(requestSpecification())
        .body(serializeDeserialize.register());
}
@When("User call {string} with {string} http request")
    public void user_call_with_post_http_request(String resource,String method) {
        System.out.println("Resources:" +resource);
        APIResources resourceAPI=APIResources.valueOf(resource); // RegistrationAPI
        System.out.println(resourceAPI.getResource());

        resspec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();

        if(method.equalsIgnoreCase("POST"))
            response =res.when().post(resourceAPI.getResource());
        else if(method.equalsIgnoreCase("GET"))
            response =res.when().get(resourceAPI.getResource());
            

    }
    @Then("the API Calls is success with status code {int}")
    public void the_api_call_is_success_with_status_code(Integer int1) {
        assertEquals(200,response.getStatusCode());

    }

    @Then("{string} in response body is a {string}")
    public void in_response_body_is(String keyValue, String Expectedvalue) {
       assertEquals(getJsonPath(response,keyValue),Expectedvalue);
    }
}