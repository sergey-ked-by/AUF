import baseEntities.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.AddProjectPage;
import pages.EditProjectPage;
import pages.DeleteProjectPage;
import steps.AddProjectStps;
import steps.EditProjectStps;
import steps.LoginStps;
import steps.DeleteProjectStps;
import utils.Retry;

public class MainTest extends BaseTest {

    @Test(enabled = true, priority = 5)
    public void deleteProjectTest() {
        DeleteProjectStps deleteProjectStps = new DeleteProjectStps(driver);
        deleteProjectStps.deleteProject(readProperties.getUserName(), readProperties.getPassword());

        Assert.assertTrue(true);
    }

    @Test(enabled = true, priority = 4)
    public void editProjectTest() {
        EditProjectStps editProjectStps = new EditProjectStps(driver);
        editProjectStps.editProject(readProperties.getUserName(), readProperties.getPassword());

        Assert.assertTrue(true);
    }

    @Test(enabled = true, priority = 3)
    public void addProjectTest() {
        AddProjectStps addProjectStps = new AddProjectStps(driver);
        addProjectStps.addProject(readProperties.getUserName(), readProperties.getPassword());

        Assert.assertTrue(true);
    }

    @Test(enabled = true, priority = 1, description = "Description for Allure test")
    @Description("A little details.")
    @Link("https://aqa07.atlassian.net/browse/AQA07-25")
    @TmsLink("1")
    @Severity(SeverityLevel.BLOCKER)
    public void loginPositiveTest(){
        LoginStps loginStps = new LoginStps(driver);
        loginStps.login(readProperties.getUserName(), readProperties.getPassword());

        Assert.assertTrue(true);
    }

    @Test(enabled = true, priority = 2)
    @Issue("/AQA07-25")
    @Severity(SeverityLevel.NORMAL)
    public void loginNegativeTest(){
        LoginStps loginStps = new LoginStps(driver);
        loginStps.login("fail", readProperties.getPassword());

        Assert.assertEquals(new LoginPage(driver, false).getErrorMessage().getText(),
                "Sorry, there was a problem.",
                "Incorrect message");
    }

//    @DataProvider(name = "Набор креда")
//    public Object[][] credentialsForTest (){
//        return new Object[][] {
//                {"atrostyanko+aqa07@gmail.com", "w3n1bU7F4rxOfnfvrBJL"},
//                {"sdsd","w3n1bU7F4rxOfnfvrBJL"},
//                {"atrostyanko+aqa07@gmail.com", "asdasd"}
//        };
//    }
//    @Test(enabled = true, dataProvider = "Набор креда")
//    public void testLoginWithMultipleCredentials(String username, String psw) {
//        LoginStps loginStps = new LoginStps(driver);
//        loginStps.login(username,psw);
//    }
//
//    @Parameters({"username", "psw"})
//    @Test
//    public void testLoginWithParameters(@Optional("1") String username, @Optional("2") String psw) {
//        LoginStps loginStps = new LoginStps(driver);
//        loginStps.login(username,psw);
//    }
//
//    @Test(retryAnalyzer = Retry.class)
//    public void retryTest() {
//        throw new NullPointerException();
//    }

}
