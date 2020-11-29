package tests.gui;

import baseEntities.BaseTest;
import models.Project;
import models.ProjectBuilder;
import models.TestCase;
import models.User;
import org.testng.annotations.Test;
import pages.LoginPage;
import steps.AdministrationStep;
import steps.LoginSteps;

public class PageFactoryTest extends BaseTest {

    @Test
    public void firstTest() {
        User user = new User(readProperties.getUserName(), readProperties.getPassword());

        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.login(user);

        Project project = new Project("Main Project", "hgdfsjhdgf", true, 1, false);

//        ProjectBuilder projectBuilder = new ProjectBuilder.Builder()
//                .setName("zsdcfz")
//                .setAnnouncement()
//                .setTypeOfProject()
//                .build();
    }

//    @Test
//    public void secondTest() {
//        TestCase testCase = new TestCase.Builder().build()
//                .withTitle
//                .
//    }
}
