package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteProjectPage extends BasePage {

    private static String ENDPOINT = "/admin/projects/overview";

    protected By deleteProjectButtonSelector = By.cssSelector("tbody tr:nth-child(11) td:nth-child(3) a:nth-child(1) " +
            "div:nth-child(1)");
    protected By deleteCheckboxSelector = By.cssSelector("div[id='deleteDialog'] input[value='1']");
    protected By confirmationButtonSelector = By.cssSelector("div[id='deleteDialog'] " +
            "a[class='button button-ok button-left button-positive dialog-action-default']");

    protected By ERROR_MESSAGE_Selector= By.className("error-on-top");

    public DeleteProjectPage(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }

    @Override
    protected void openPage() {
        driver.get(BASE_URL + ENDPOINT);
    }

    public boolean isPageOpened() {
        return waits.isElementDisplayed(By.id("navigation-admin"));
    }

    public WebElement getDeleteButton() {
        return waits.getElementBy(deleteProjectButtonSelector);
    }

    public WebElement getDeleteCheckbox() {
        return waits.getElementBy(deleteCheckboxSelector);
    }

    public WebElement getConfirmationButton() {
        return waits.getElementBy(confirmationButtonSelector);
    }

    public WebElement getErrorMessage(){
        return waits.getElementBy(ERROR_MESSAGE_Selector);
    }
}
