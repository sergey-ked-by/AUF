package tests.api;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class apiTests {
    @Test
    public void simpleApiTest() {
        String baseUrl = "https://reqres.in";
        String endpoint = "/api/users/2";

        RestAssured.baseURI = baseUrl;

        //Setup Request Object
        RequestSpecification requestSpecification = given();

        //Setup Response Object
        Response response = requestSpecification.request(Method.GET, endpoint);

        //Get response status
        int statusCode = response.getStatusCode();
        System.out.println("Status Code:" + statusCode);

        //Get
        String responseBody =  response.getBody().asString();
        System.out.println("Body: " + responseBody);

        //Verify
        Assert.assertEquals(statusCode, 200,"Invalid StatusCode.");
    }

    @Test
    public void shortSimpleApiTest() {
        given()
                .when()
                    .get("https://reqres.in/api/users/2")
                .then()
                    .statusCode(HttpStatus.SC_OK)
                    .log().body();
    }
}
