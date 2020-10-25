package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProjectPage extends BasePage {

    private static String ENDPOINT = "/auth/login/";

    protected By emailSelector = By.id("name");
    protected By passwordSelector = By.id("password");
    protected By loginSelector = By.id("button_primary");
    protected By addProjectSelector = By.id("sidebar-projects-add");
    protected By addNameSelector = By.name("name");
    protected By checkBoxSelector = By.id("suite_mode_single");
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
        try {
            return driver.findElement(By.id("button_primary")).isDisplayed();
        } catch (Exception ex) {
            return false;
        }
    }

    public WebElement getEmailField() {
        return driver.findElement(emailSelector);
    }

    public WebElement getPasswordField() {
        return driver.findElement(passwordSelector);
    }

    public WebElement getLoginButton() {
        return driver.findElement(loginSelector);
    }

    public WebElement addProjectButton() {
        return driver.findElement(addProjectSelector);
    }

    public WebElement addNameField() {
        return driver.findElement(addNameSelector);
    }

    public WebElement markCheckBox() {
        return driver.findElement(checkBoxSelector);
    }

    public WebElement acceptButton() {
        return driver.findElement(acceptButtonSelector);
    }

    public WebElement getErrorMessage(){
        return driver.findElement(ERROR_MESSAGE_Selector);
    }
}
