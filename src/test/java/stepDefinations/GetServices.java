package stepDefinations;
//import org.testng.internal.Utils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.GetServiceAPI.SerializeDeserialize;
import resources.APIResources;
import resources.Utils;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

//import static org.junit.Assert.assertEquals;

public class GetServices extends Utils {
    String bodyString;
    Response response;
    RequestSpecification res;
    ResponseSpecification resspec;
    SerializeDeserialize serializeDeserialize= new SerializeDeserialize();
    @Given("Add GetServices payload")
    public void add_GetServices_payload() throws IOException {
        res=given().spec(requestSpecification())
        .body(serializeDeserialize.service());
}
@When("User call {string} with {string} http requests")
    public void user_call_with_post_http_requests(String resource,String method) {
        System.out.println("Resources:" +resource);
        APIResources resourceAPI=APIResources.valueOf(resource); // RegistrationAPI
        System.out.println(resourceAPI.getResource());

        resspec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();

        if(method.equalsIgnoreCase("POST"))
            response =res.when().post(resourceAPI.getResource());
        else if(method.equalsIgnoreCase("GET"))
            response =res.when().get(resourceAPI.getResource());
            

    }
    @Then("the API Calls is success with a status code {int}")
    public void the_api_call_is_success_with_a_status_code(Integer int1) {
        assertEquals(response.getStatusCode(),200);

    }

    @Then("{string} in responsebody is {string}")
    public void in_responsebody_is(String keyValue, String Expectedvalue) { //status , Ok
       String resp  = response.asString();
        JsonPath js = new JsonPath(resp);
        assertEquals(js.get(keyValue).toString(),Expectedvalue);
        //assertEquals(getJsonPath(response, keyValue),Expectedvalue); // ok, status

    }
}