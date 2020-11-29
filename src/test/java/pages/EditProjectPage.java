package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditProjectPage extends BasePage {

    private static String ENDPOINT = "/admin/projects/overview";

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

    public WebElement getEditButton() {
        return driver.findElement(editProjectButtonSelector);
    }

    public WebElement getErrorMessage(){
        return driver.findElement(ERROR_MESSAGE_Selector);
    }
}
