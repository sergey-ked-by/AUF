package baseEntities;

import browserService.ReadNewProperties;
import browserService.ReadProperties;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import okio.Timeout;
import org.apache.http.protocol.HTTP;
import org.testng.annotations.BeforeTest;

import static io.restassured.RestAssured.given;

public class NewBaseApiTest {
    public ReadNewProperties properties;

    @BeforeTest
    public void setUp() {
        properties = new ReadNewProperties();

        RestAssured.baseURI = properties.getApiURL();
        RestAssured.requestSpecification = given()
                .header(HTTP.CONN_KEEP_ALIVE,"timeout=5", "max=1000" )
                .header(HTTP.CONTENT_TYPE, ContentType.JSON);
    }
}
