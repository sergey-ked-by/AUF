package steps;

import org.openqa.selenium.WebDriver;
import pages.AddProjectPage;

public class AddProjectStps {
    private WebDriver driver;

    public AddProjectStps(WebDriver driver) {
        this.driver = driver;
    }

    public void addProject(String username, String psw) {
        AddProjectPage addProjectPage = new AddProjectPage(driver, true);
        addProjectPage.getEmailField().sendKeys(username);
        addProjectPage.getPasswordField().sendKeys(psw);
        addProjectPage.getLoginButton().click();

        addProjectPage.addProjectButton().click();
        addProjectPage.addNameField().sendKeys("Project 1.");
        addProjectPage.markCheckBox().click();
        addProjectPage.acceptButton().click();

    }
}
