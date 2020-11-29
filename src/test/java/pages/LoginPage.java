package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import wrappers.Button;
import wrappers.Input;

public class LoginPage extends BasePage {
    private static String ENDPOINT = "/auth/login/";

    @FindBy(id = "name")
    public WebElement emailSelector;

    @FindBy(id = "password")
    public WebElement passwordSelector;

    @FindBy(id = "button_primary")
    public WebElement loginSelector;

    @FindBy(className = "error-on-top")
    public WebElement ERROR_MESSAGE_Selector;

    public LoginPage(WebDriver driver, boolean openPageByUrl) {
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

    public WebElement getErrorMessage(){
        return null;
    }
}
