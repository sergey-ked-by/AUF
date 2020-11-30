package tests.api;

import baseEntities.BaseApiTest;
import baseEntities.NewBaseApiTest;
import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class apiReqResInTests extends NewBaseApiTest {

    @Test
    public void getUsersListTest() {

        String endpoint = "/api/users?page=2";

        given()
                .when()
                .get(endpoint)
                .then()
                .log().body()
                .body("page", is(2))
                .body("id", hasItems(7, 8, 9, 10, 11, 12))
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void getSingleUserTest() {
        String endpoint = "/api/users/2";

        given()
                .when()
                .get(endpoint)
                .then()
                .log().body()
                .body("id", is(2))
                .body("first_name", is("Janet"))
                .body("last_name", is("Weaver"))
                .body("avatar", is("https://reqres.in/img/faces/2-image.jpg"))
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void getNotValidSingleUserTest() {
        String endpoint = "/api/users/23";

        given()
                .when()
                .get(endpoint)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void getResourceListTest() {
        String endpoint = "/api/unknown";

        given()
                .when()
                .get(endpoint)
                .then()
                .log().body()
                .body("page", is(1))
                .body("id", hasItems(1, 2, 3, 4, 5, 6))
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void getSingleResourceTest() {
        String endpoint = "/api/unknown/2";

        given()
                .when()
                .get(endpoint)
                .then()
                .log().body()
                .body("id", is(2))
                .body("name", is("fuchsia rose"))
                .body("year", is(2001))
                .body("color", is("#C74375"))
                .body("pantone_value", is("17-2031"))
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void getNotValidSingleResourceTest() {
        String endpoint = "/api/unknown/2";

        given()
                .when()
                .get(endpoint)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void postCreateUserTest() {
        String endpoint = "/api/users";

        given()
                .when()
                .get(endpoint)
                .then()
                .log().body()
                .body("name", is("morpheus"))
                .body("job", is("leader"))
                .body("id", is(100))
                .body("createdAt", is("2020-11-29T13:18:02.896Z"))
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void updateUserInfoTest() {
        String endpoint = "/api/users/2";

        given()
                .when()
                .get(endpoint)
                .then()
                .log().body()
                .body("name", is("morpheus"))
                .body("job", is("zion resident"))
                .body("updatedAt", is( "2020-11-29T13:23:57.144Z"))
                .statusCode(HttpStatus.SC_OK);
    }
    @Test
    public void patchUserInfoTest() {
        String endpoint = "/api/users/2";

        given()
                .when()
                .get(endpoint)
                .then()
                .log().body()
                .body("updatedAt", is( "2020-11-29T13:26:38.276Z"))
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void deleteUserTest() {
        String endpoint = "/api/users/2";

        given()
                .when()
                .get(endpoint)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK);
    }

//    @Test
//    public void CreateUserTest() {
//        String endpoint = "/api/users/2";
//
//        given()
//                .when()
//                .
//                .get(endpoint)
//                .then()
//                .log().body()
//                .statusCode(HttpStatus.SC_OK);
//    }
}
