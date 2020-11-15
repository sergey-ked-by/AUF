package tests;

import baseEntities.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;
import steps.AddProjectSteps;
import steps.EditProjectSteps;
import steps.LoginSteps;
import steps.DeleteProjectSteps;
import utils.Retry;

public class MainTest extends BaseTest {

    @Test(priority = 5)
    public void deleteProjectTest() {
        DeleteProjectSteps deleteProjectSteps = new DeleteProjectSteps(driver);
        deleteProjectSteps.deleteProject(readProperties.getUserName(), readProperties.getPassword());

        Assert.assertTrue(true);
    }

    @Test(priority = 4)
    public void editProjectTest() {
        EditProjectSteps editProjectSteps = new EditProjectSteps(driver);
        editProjectSteps.editProject(readProperties.getUserName(), readProperties.getPassword());

        Assert.assertTrue(true);
    }

    @Test( priority = 3)
    public void addProjectTest() {
        AddProjectSteps addProjectSteps = new AddProjectSteps(driver);
        addProjectSteps.addProject(readProperties.getUserName(), readProperties.getPassword());

        Assert.assertTrue(true);
    }

    @Test(priority = 1, description = "Description for Allure test")
    @Description("A little details.")
    @Link("https://aqa07.atlassian.net/browse/AQA07-25")
    @TmsLink("1")
    @Severity(SeverityLevel.BLOCKER)
    public void loginPositiveTest(){
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.login(readProperties.getUserName(), readProperties.getPassword());

        Assert.assertTrue(true);
    }

    @Test(priority = 2)
    @Issue("/AQA07-25")
    @Severity(SeverityLevel.NORMAL)
    public void loginNegativeTest(){
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.login("fail", readProperties.getPassword());

        Assert.assertEquals(new LoginPage(driver, false).getErrorMessage().getText(),
                "Sorry, there was a problem.",
                "Incorrect message");
    }

    @DataProvider(name = "Набор креда")
    public Object[][] credentialsForTest (){
        return new Object[][] {
                {"atrostyanko+aqa07@gmail.com", "w3n1bU7F4rxOfnfvrBJL"},
                {"sdsd","w3n1bU7F4rxOfnfvrBJL"},
                {"atrostyanko+aqa07@gmail.com", "asdasd"}
        };
    }
    @Test(enabled = true, dataProvider = "Набор креда")
    public void testLoginWithMultipleCredentials(String username, String psw) {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.login(username,psw);
    }

    @Parameters({"username", "psw"})
    @Test
    public void testLoginWithParameters(@Optional("1") String username, @Optional("2") String psw) {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.login(username,psw);
    }

    @Test(enabled = false, retryAnalyzer = Retry.class)
    public void retryTest() {
        throw new NullPointerException();
    }

}
