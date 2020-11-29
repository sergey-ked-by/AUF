package baseEntities;

import browserService.ReadProperties;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.protocol.HTTP;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import utils.Listener;

import static io.restassured.RestAssured.given;

//@Listeners(Listener.class)
public class BaseApiTest {
    public ReadProperties properties;

    @BeforeTest
    public void setUp() {
        properties = new ReadProperties();

        RestAssured.baseURI = properties.getApiURL();
        RestAssured.requestSpecification = given()
                .header(HTTP.CONTENT_TYPE, ContentType.JSON)
                .auth().preemptive().basic(properties.getUserName(), properties.getPassword());
    }
}
