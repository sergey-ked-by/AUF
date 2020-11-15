package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import wrappers.*;

public class AddProjectPage extends BasePage {
    private static String ENDPOINT = "/auth/login/";

    protected By emailSelector = By.id("name");
    protected By passwordSelector = By.id("password");
    protected By loginSelector = By.id("button_primary");
    protected By addProjectSelector = By.id("sidebar-projects-add");
    protected By addNameSelector = By.name("name");
    protected By checkBoxSelector = By.id("show_announcement");
    protected By radioButtonSelector = By.xpath("//*[@id='suite_mode_single']");
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
        return waits.isElementDisplayed(By.id("button_primary"));
    }

    public Input getEmailField() {
        return new Input(driver, emailSelector);
    }

    public Input getPasswordField() {
        return new Input(driver, passwordSelector);
    }

    public Button getLoginButton() {
        return new Button(driver, loginSelector);
    }

    public Button getAddProjectButton() {
        return new Button(driver, addProjectSelector);
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
