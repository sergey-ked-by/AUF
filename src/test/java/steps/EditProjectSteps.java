package steps;

import org.openqa.selenium.WebDriver;
import pages.EditProjectPage;

public class EditProjectSteps {

    private WebDriver driver;

    public EditProjectSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void editProject(String username, String psw) {
        EditProjectPage editProjectPage = new EditProjectPage(driver, true);
        editProjectPage.getEmailField().sendKeys(username);
        editProjectPage.getPasswordField().sendKeys(psw);
        editProjectPage.getLoginButton().click();

        editProjectPage.getAddProjectButton().click();
        editProjectPage.getAddNameField().sendKeys("Project 1.");
        editProjectPage.getCheckBoxMark().click();
        editProjectPage.getAcceptButton().submit();

        editProjectPage.getEditButton().click();
    }
}
