import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;
import steps.AddProjectStps;
import steps.LoginStps;

public class MainTest extends BaseTest {
    private LoginStps loginSteps;

    @Test(enabled = true, priority = 1)
    public void addProjectTest() {
        AddProjectStps addProjectStps = new AddProjectStps(driver);
        addProjectStps.addProject(readProperties.getUserName(), readProperties.getPassword());

        Assert.assertTrue(true);
    }

//    @Test(enabled = true)
//    public void loginPositiveTest(){
//        LoginStps loginStps = new LoginStps(driver);
//        loginStps.login(readProperties.getUserName(), readProperties.getPassword());
//
//        Assert.assertTrue(true);
//    }
//
//    @Test(enabled = true)
//    public void loginNegativeTest(){
//        LoginStps loginStps = new LoginStps(driver);
//        loginStps.login("fail", readProperties.getPassword());
//
//        Assert.assertEquals(new LoginPage(driver, false).getErrorMessage().getText(),
//                "Sorry, there was a problem.",
//                "Incorrect message");
//    }
//
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

}
