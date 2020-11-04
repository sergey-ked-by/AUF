package baseEntities;

import browserService.ReadProperties;
import org.openqa.selenium.WebDriver;
import utils.Waiters;

public abstract class BasePage {
    protected static final int WAIT_FOR_PAGE_LOAD_IN_SECONDS = 5;
    public WebDriver driver;
    public ReadProperties readProperties;
    public String BASE_URL;
    public Waiters waiters;

    protected abstract void openPage();
    public abstract boolean isPageOpened();

    public BasePage(WebDriver driver, boolean openPageByUrl) {
        readProperties = new ReadProperties();
        this.driver = driver;
        this.readProperties = new ReadProperties();
        this.BASE_URL = readProperties.getURL();
        this.waiters = new Waiters(driver);

        if (openPageByUrl) {
            openPage();
        }
        waitForOpen();
    }

    /**
     * Waiting for page opening
     */
    protected void waitForOpen() {
        int secondsCount = 0;
        boolean isPageOpenedIndicator = isPageOpened();
       /* while (!isPageOpenedIndicator && secondsCount < WAIT_FOR_PAGE_LOAD_IN_SECONDS) {
            secondsCount++;
            isPageOpenedIndicator = isPageOpened();
        }*/
        if (!isPageOpenedIndicator) {
            throw new AssertionError("Page was not opened");
        }
    }
}