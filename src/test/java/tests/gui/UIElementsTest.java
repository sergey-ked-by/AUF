package tests.gui;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.AddProjectSteps;
import steps.LoginSteps;
import wrappers.*;

public class UIElementsTest extends BaseTest {

    @Test
    public void tableTest() {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.login(readProperties.getUserName(), readProperties.getPassword());

        driver.get("https://aqa071.testrail.io/index.php?/admin/projects/overview");

        Table table = new Table(driver, By.cssSelector("table.grid"));
        table.clickItemInRow(1);
    }

    @Test(priority = 1)
    public void addProjectTest() {
        AddProjectSteps addProjectSteps = new AddProjectSteps(driver);
        addProjectSteps.addProject(readProperties.getUserName(), readProperties.getPassword());

        Assert.assertTrue(true);
    }

    @Test
    public void dropDownTest() {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.login(readProperties.getUserName(), readProperties.getPassword());

        driver.get("https://aqa071.testrail.io/index.php?/mysettings");

        Select select = new Select(driver.findElement(By.id("language")));
        select.selectByVisibleText("English");

        // Не получилось корректно запустить этот тест через оббёртку.

    }
}
