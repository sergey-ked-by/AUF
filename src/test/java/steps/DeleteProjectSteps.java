package steps;

import org.openqa.selenium.WebDriver;
import pages.DeleteProjectPage;

public class DeleteProjectSteps {

    private WebDriver driver;

    public DeleteProjectSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void deleteProject(String username, String psw){
        DeleteProjectPage deleteProjectPage = new DeleteProjectPage(driver, true);
        deleteProjectPage.getEmailField().sendKeys(username);
        deleteProjectPage.getPasswordField().sendKeys(psw);
        deleteProjectPage.getLoginButton().click();

        deleteProjectPage.getAddProjectButton().click();
        deleteProjectPage.getNameField().sendKeys("Project 1.");
        deleteProjectPage.getCheckBoxMark().click();
        deleteProjectPage.getAcceptButton().submit();

        deleteProjectPage.getDeleteButton().click();
        deleteProjectPage.getDeleteCheckbox().click();
        deleteProjectPage.getConfirmationButton().click();


       }
}
