package steps;

import org.openqa.selenium.WebDriver;
import pages.EditProjectPage;

public class EditProjectStps {

    private WebDriver driver;

    public EditProjectStps(WebDriver driver) {
        this.driver = driver;
    }

    public void editProject(String username, String psw) {
        EditProjectPage editProjectPage = new EditProjectPage(driver, true);
        editProjectPage.getEmailField().sendKeys(username);
        editProjectPage.getPasswordField().sendKeys(psw);
        editProjectPage.getLoginButton().click();

        editProjectPage.addProjectButton().click();
        editProjectPage.addNameField().sendKeys("Project 1.");
        editProjectPage.markCheckBox().click();
        editProjectPage.acceptButton().click();

        editProjectPage.editButton().click();
    }
}
