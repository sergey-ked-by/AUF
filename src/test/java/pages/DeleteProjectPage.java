package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteProjectPage extends BasePage {

    private static String ENDPOINT = "/auth/login/";

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
