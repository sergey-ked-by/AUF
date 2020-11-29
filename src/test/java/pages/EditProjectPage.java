package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditProjectPage extends BasePage {

    private static String ENDPOINT = "/auth/login/";

    protected By addProjectSelector = By.id("sidebar-projects-add");
    protected By addNameSelector = By.name("name");
    protected By checkBoxSelector = By.id("suite_mode_single");
    protected By acceptButtonSelector = By.id("accept");
    protected By editProjectButtonSelector = By.xpath("//*[@id='content-inner']/table/tbody/tr[4]/td[2]/a");

    protected By ERROR_MESSAGE_Selector= By.className("error-on-top");

    public EditProjectPage(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }

    @Override
    protected void openPage() {
        driver.get(BASE_URL + ENDPOINT);
    }

    public boolean isPageOpened() {
        return waits.isElementDisplayed(By.id("navigation-admin"));
    }

    public WebElement getAddProjectButton() {
        return driver.findElement(addProjectSelector);
    }

    public WebElement getAddNameField() {
        return driver.findElement(addNameSelector);
    }

    public WebElement getCheckBoxMark() {
        return driver.findElement(checkBoxSelector);
    }

    public WebElement getAcceptButton() {
        return driver.findElement(acceptButtonSelector);
    }

    public WebElement getEditButton() {
        return driver.findElement(editProjectButtonSelector);
    }

    public WebElement getErrorMessage(){
        return driver.findElement(ERROR_MESSAGE_Selector);
    }
}
