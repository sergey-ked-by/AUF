package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import wrappers.*;

public class AddProjectPage extends BasePage {
    private static String ENDPOINT = "/admin/projects/overview";

    protected By addProjectButtonSelector = By.className("button button-left button-add");
    protected By addNameSelector = By.name("name");
    protected By checkBoxSelector = By.id("show_announcement");
    protected By radioButtonSelector = By.id("suite_mode_single");
    protected By acceptButtonSelector = By.id("accept");

    protected By ERROR_MESSAGE_Selector= By.className("error-on-top");

    public AddProjectPage(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }

    @Override
    protected void openPage() {
        driver.get(BASE_URL + ENDPOINT);
    }

    public boolean isPageOpened() {
        return waits.isElementDisplayed(By.id("navigation-admin"));
    }

    public Button getAddProjectButton() {
        return new Button(driver, addProjectButtonSelector);
    }

    public Input getNameField() {
        return new Input(driver, addNameSelector);
    }

    public Checkbox getCheckBoxMark() {
        return new Checkbox(driver, checkBoxSelector);
    }

    public RadioButton getRadioButton() {
        return new RadioButton(driver, radioButtonSelector);
    }

    public Button getAcceptButton() {
        return new Button(driver, acceptButtonSelector);
    }

    public WebElement getErrorMessage(){
        return driver.findElement(ERROR_MESSAGE_Selector);
    }
}
