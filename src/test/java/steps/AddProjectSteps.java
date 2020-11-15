package steps;

import org.openqa.selenium.WebDriver;
import pages.AddProjectPage;

public class AddProjectSteps {

    private WebDriver driver;

    public AddProjectSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void addProject(String username, String psw) {
        AddProjectPage addProjectPage = new AddProjectPage(driver, true);
        addProjectPage.getEmailField().sendKeys(username);
        addProjectPage.getPasswordField().sendKeys(psw);
        addProjectPage.getLoginButton().click();

        addProjectPage.getAddProjectButton().click();
        addProjectPage.getNameField().sendKeys("Project 1.");
        addProjectPage.getCheckBoxMark().click();
        addProjectPage.getRadioButton().click();
        addProjectPage.getAcceptButton().submit();

    }
}
