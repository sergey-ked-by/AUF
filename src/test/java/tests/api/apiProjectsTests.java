package tests.api;

import baseEntities.BaseApiTest;
import com.google.gson.Gson;
import models.Endpoints;
import models.ProjectGson;
import org.apache.hc.core5.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.ws.Endpoint;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class apiProjectsTests extends BaseApiTest {

    private int projectId;
    @Test
    public void addProject() {
        int projectId =
                given()
                        .body(String.format("{\n" +
                                "    \"name\": \"%s\"\n" +
                                "}", "WP_002"
                        ))
                        .when()
                        .post(new Endpoints().addProject)
                        .then()
                        .log().body()
                        .statusCode(HttpStatus.SC_OK)
                        .extract().jsonPath().get("id");

        System.out.println(projectId);
    }

    @Test
    public void addProjectVersionTwo() {

        ProjectGson projectGson = ProjectGson.builder()
                .name("WP_03")
                .suite_mode(2)
                .build();

        Gson gson = new Gson();
        String json = gson.toJson(projectGson);
        System.out.println(json);

        int projectId =
                given()
                        .body(json)
                        .when()
                        .post(new Endpoints().addProject)
                        .then()
                        .log().body()
                        .statusCode(HttpStatus.SC_OK)
                        .extract().jsonPath().get("id");

        System.out.println(projectId);
    }

    @Test
    public void addProjectVersionThree() {

        ProjectGson projectGson = ProjectGson.builder()
                .name("WP_03")
                .suite_mode(2)
                .build();

        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("name", projectGson.getName());
        jsonAsMap.put("suite_mode", projectGson.getSuite_mode());

        System.out.println(jsonAsMap.toString());

        Gson gson = new Gson();
        String json = gson.toJson(projectGson);
        System.out.println(json);

        int projectId =
                given()
                        .body(json)
                        .when()
                        .post(new Endpoints().addProject)
                        .then()
                        .log()
                        .body()
                        .statusCode(HttpStatus.SC_OK)
                        .extract().jsonPath().get("id");

        System.out.println(projectId);
    }

    /*@Test
    public void addProjectVersionFour() {

        ProjectGson projectGson = ProjectGson.builder()
                .name("WP_03")
                .suite_mode(2)
                .build();

        Gson gson = new Gson();
        String json = gson.toJson(projectGson);
        System.out.println(json);

        String actualJson =
                given()
                        .body(json)
                        .when()
                        .post(new Endpoints().addProject);

        ProjectGson actualProject = gson.fromJson(actualJson, ProjectGson.class);

        projectId = actualProject.getId();
        System.out.println(projectId);
        Assert.assertEquals(actualProject, expectedProjectGson);
    }*/
}
