package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteProjectPage extends BasePage {

    private static String ENDPOINT = "/auth/login/";

    protected By emailSelector = By.id("name");
    protected By passwordSelector = By.id("password");
    protected By loginSelector = By.id("button_primary");
    protected By addProjectSelector = By.id("sidebar-projects-add");
    protected By addNameSelector = By.name("name");
    protected By checkBoxSelector = By.id("suite_mode_single");
    protected By acceptButtonSelector = By.id("accept");
    protected By deleteProjectButtonSelector = By.xpath("//*[@id=\"content-inner\"]/table/tbody/tr[4]/td[3]/a/div");
    protected By deleteCheckboxSelector = By.xpath("//*[@id=\"deleteDialog\"]/div[2]/div/div/label/input");
    protected By confirmationButtonSelector = By.xpath("//*[@id=\"deleteDialog\"]/div[3]/a[1]");


    protected By ERROR_MESSAGE_Selector= By.className("error-on-top");

    public DeleteProjectPage(WebDriver driver, boolean openPageByUrl) {
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

    public WebElement getAddProjectButton() {
        return driver.findElement(addProjectSelector);
    }

    public WebElement getNameField() {
        return driver.findElement(addNameSelector);
    }

    public WebElement getCheckBoxMark() {
        return driver.findElement(checkBoxSelector);
    }

    public WebElement getAcceptButton() {
        return driver.findElement(acceptButtonSelector);
    }

    public WebElement getDeleteButton() {
        return driver.findElement(deleteProjectButtonSelector);
    }

    public WebElement getDeleteCheckbox() {
        return driver.findElement(deleteCheckboxSelector);
    }

    public WebElement getConfirmationButton() {
        return driver.findElement(confirmationButtonSelector);
    }

    public WebElement getErrorMessage(){
        return driver.findElement(ERROR_MESSAGE_Selector);
    }
}
