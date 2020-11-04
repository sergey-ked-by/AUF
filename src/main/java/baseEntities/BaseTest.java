package baseEntities;

import browserService.BrowserService;
import browserService.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.Listener;

@Listeners(Listener.class)

public class BaseTest {
    public WebDriver driver;
    public ReadProperties readProperties = new ReadProperties();


    public void BaseTest() {

    }

    @BeforeMethod
    public void SetUp() {
        this.driver = new BrowserService().getDriver();
        driver.get(new ReadProperties().getURL());

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();

    }
}

