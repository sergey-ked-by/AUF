package steps;

import org.openqa.selenium.WebDriver;
import pages.DeleteProjectPage;
import pages.EditProjectPage;
import pages.LoginPage;

public class DeleteProjectSteps {

    private WebDriver driver;

    public DeleteProjectSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void deleteProject(String username, String psw){
        EditProjectSteps editProjectSteps = new EditProjectSteps(driver);
        editProjectSteps.editProject(username, psw);

        DeleteProjectPage deleteProjectPage = new DeleteProjectPage(driver, true);
        deleteProjectPage.getDeleteButton().click();
        deleteProjectPage.getDeleteCheckbox().click();
        deleteProjectPage.getConfirmationButton().click();
       }
}
