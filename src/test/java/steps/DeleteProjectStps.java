package steps;

import org.openqa.selenium.WebDriver;
import pages.DeleteProjectPage;

public class DeleteProjectStps {

    private WebDriver driver;

    public DeleteProjectStps(WebDriver driver) {
        this.driver = driver;
    }

    public void deleteProject(String username, String psw){
        DeleteProjectPage deleteProjectPage = new DeleteProjectPage(driver, true);
        deleteProjectPage.getEmailField().sendKeys(username);
        deleteProjectPage.getPasswordField().sendKeys(psw);
        deleteProjectPage.getLoginButton().click();

        deleteProjectPage.addProjectButton().click();
        deleteProjectPage.addNameField().sendKeys("Project 1.");
        deleteProjectPage.markCheckBox().click();
        deleteProjectPage.acceptButton().click();

        deleteProjectPage.deleteButton().click();
       }
}
