package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.AddProjectPage;

public class AddProjectSteps {

    private WebDriver driver;

    public AddProjectSteps(WebDriver driver) {
        this.driver = driver;
    }

    @Step
    public void addProject(String username, String psw) {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.login(username, psw);

        AddProjectPage addProjectPage = new AddProjectPage(driver, true);
        addProjectPage.getAddProjectButton().click();
        addProjectPage.getNameField().sendKeys("Project 1.");
        addProjectPage.getCheckBoxMark().click();
        addProjectPage.getRadioButton().click();
        addProjectPage.getAcceptButton().submit();
    }
}
