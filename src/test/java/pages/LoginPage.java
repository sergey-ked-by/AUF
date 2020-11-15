package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import wrappers.Button;
import wrappers.Input;
import wrappers.UIElement;

public class LoginPage extends BasePage {
    private static String ENDPOINT = "/auth/login/";

    protected By emailSelector = By.id("name");
    protected By passwordSelector = By.id("password");
    protected By loginSelector = By.id("button_primary");
    protected By ERROR_MESSAGE_Selector= By.className("error-on-top");

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
        return waits.getElementBy(ERROR_MESSAGE_Selector);
    }
}
