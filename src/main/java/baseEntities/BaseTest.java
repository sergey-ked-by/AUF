package baseEntities;

import browserService.BrowserService;
import browserService.ReadProperties;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.Listener;

import java.util.concurrent.TimeUnit;

@Listeners(Listener.class)

public class BaseTest {
    public WebDriver driver;
    public ReadProperties readProperties = new ReadProperties();
    private static final Logger logger = LogManager.getLogger(BaseTest.class);


    public void BaseTest() {}

    @BeforeMethod
    public void SetUp() {
        this.driver = new BrowserService().getDriver();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        driver.get(new ReadProperties().getURL());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

