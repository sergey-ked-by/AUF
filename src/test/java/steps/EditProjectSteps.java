package steps;

import org.openqa.selenium.WebDriver;
import pages.AddProjectPage;
import pages.EditProjectPage;
import pages.LoginPage;

public class EditProjectSteps {

    private WebDriver driver;

    public EditProjectSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void editProject(String username, String psw) {
       AddProjectSteps addProjectSteps = new AddProjectSteps(driver);
       addProjectSteps.addProject(username, psw);

       EditProjectPage editProjectPage = new EditProjectPage(driver, true);
       editProjectPage.getEditButton().click();
    }
}
